package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;

/** Tests the default chain without cloud credentials or network requests. */
public class DefaultCredentialsProviderTest {
    private static String scenario;
    private static int metadataCalls;
    private static int oidcCalls;

    @Test
    public void metadataIOExceptionFallsBackToOidc() throws Exception {
        runScenario("io-failure");
    }

    @Test
    public void metadataErrorResponseFallsBackToOidc() throws Exception {
        runScenario("error-response");
    }

    @Test
    public void validCvmCredentialsTakePrecedenceOverOidc() throws Exception {
        runScenario("cvm-success");
    }

    @Test
    public void incompleteCvmCredentialsFallBackToOidc() throws Exception {
        runScenario("incomplete-cvm");
    }

    @Test
    public void missingCredentialsReportFinalProviderFailure() throws Exception {
        runScenario("no-credentials");
    }

    @Test
    public void unrelatedRuntimeExceptionIsNotSuppressed() throws Exception {
        runScenario("malformed-metadata");
    }

    private void runScenario(String name) throws Exception {
        // Both environment variables and URLStreamHandlerFactory are process-wide. A child JVM
        // isolates these fakes from the caller and from CvmRoleCredentialTest's URL handler.
        assumeFalse("Use an isolated host without a system credential profile",
                Files.exists(Paths.get("/etc/tencentcloud/credentials")));
        Path home = Files.createTempDirectory("default-credentials-test-");
        Path token = home.resolve("token");
        try {
            Files.write(token, "mock-web-identity-token".getBytes(StandardCharsets.UTF_8));
            ProcessBuilder builder = new ProcessBuilder(
                    Paths.get(System.getProperty("java.home"), "bin", "java").toString(),
                    "-Duser.home=" + home,
                    "-cp", System.getProperty("java.class.path"),
                    DefaultCredentialsProviderTest.class.getName(), name);
            Map<String, String> env = builder.environment();
            env.remove("TENCENTCLOUD_SECRET_ID");
            env.remove("TENCENTCLOUD_SECRET_KEY");
            for (String key : new String[] {"TKE_REGION", "TKE_PROVIDER_ID",
                    "TKE_WEB_IDENTITY_TOKEN_FILE", "TKE_ROLE_ARN"}) {
                env.remove(key);
            }
            if (!"no-credentials".equals(name)) {
                env.put("TKE_REGION", "ap-guangzhou");
                env.put("TKE_PROVIDER_ID", "mock-provider-id");
                env.put("TKE_WEB_IDENTITY_TOKEN_FILE", token.toString());
                env.put("TKE_ROLE_ARN", "mock-role-arn");
            }
            Process process = builder.redirectErrorStream(true).start();
            if (!process.waitFor(30, TimeUnit.SECONDS)) {
                process.destroyForcibly();
                fail("Credential test child JVM timed out");
            }
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            try (InputStream stream = process.getInputStream()) {
                byte[] buffer = new byte[1024];
                int count;
                while ((count = stream.read(buffer)) != -1) {
                    output.write(buffer, 0, count);
                }
            }
            assertEquals(new String(output.toByteArray(), StandardCharsets.UTF_8), 0, process.exitValue());
        } finally {
            Files.deleteIfExists(token);
            Files.deleteIfExists(home);
        }
    }

    public static void main(String[] args) throws Exception {
        scenario = args[0];
        installMetadataFake();
        installStsFake();
        if ("no-credentials".equals(scenario)) {
            try {
                new DefaultCredentialsProvider().getCredentials();
                fail("Expected the final OIDC provider to report missing configuration");
            } catch (TencentCloudSDKException e) {
                assertEquals("env TKE_REGION not exist", e.getMessage());
            }
            assertEquals(1, metadataCalls);
            assertEquals(0, oidcCalls);
        } else if ("malformed-metadata".equals(scenario)) {
            try {
                new DefaultCredentialsProvider().getCredentials();
                fail("Expected an unrelated metadata parsing error to propagate");
            } catch (NullPointerException expected) {
                assertEquals(0, oidcCalls);
            }
        } else {
            Credential credential = new DefaultCredentialsProvider().getCredentials();
            boolean cvm = "cvm-success".equals(scenario);
            assertEquals(cvm ? "mock-cvm-id" : "mock-oidc-id", credential.getSecretId());
            assertEquals(cvm ? "mock-cvm-key" : "mock-oidc-key", credential.getSecretKey());
            assertEquals(cvm ? "mock-cvm-token" : "mock-oidc-token", credential.getToken());
            assertNotNull("Retain the updater for future refreshes", credential.getUpdater());
            assertEquals("io-failure".equals(scenario) ? 1 : 2, metadataCalls);
            assertEquals(cvm ? 0 : 1, oidcCalls);
        }
    }

    private static void installMetadataFake() {
        URL.setURLStreamHandlerFactory(protocol -> {
            if (!"http".equals(protocol)) {
                return null;
            }
            return new URLStreamHandler() {
                @Override
                protected URLConnection openConnection(URL url) throws IOException {
                    if (!"metadata.tencentyun.com".equals(url.getHost())) {
                        throw new IOException("Unexpected metadata host");
                    }
                    return new HttpURLConnection(url) {
                        @Override
                        public void connect() {}

                        @Override
                        public void disconnect() {}

                        @Override
                        public boolean usingProxy() { return false; }

                        @Override
                        public InputStream getInputStream() throws IOException {
                            metadataCalls++;
                            if ("io-failure".equals(scenario) || "no-credentials".equals(scenario)) {
                                throw new IOException("mock metadata unavailable");
                            }
                            String body;
                            if (url.getPath().endsWith("/security-credentials/")) {
                                body = "mock-role";
                            } else if ("error-response".equals(scenario)) {
                                body = "{\"Code\":\"FailedOperation\"}";
                            } else if ("malformed-metadata".equals(scenario)) {
                                body = "{}";
                            } else if ("incomplete-cvm".equals(scenario)) {
                                body = "{\"Code\":\"Success\",\"ExpiredTime\":2000000000}";
                            } else {
                                body = "{\"Code\":\"Success\",\"TmpSecretId\":\"mock-cvm-id\","
                                        + "\"TmpSecretKey\":\"mock-cvm-key\",\"Token\":\"mock-cvm-token\","
                                        + "\"ExpiredTime\":2000000000}";
                            }
                            return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
                        }
                    };
                }
            };
        });
    }

    private static void installStsFake() throws Exception {
        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);
        OkHttpClient original = (OkHttpClient) field.get(null);
        OkHttpClient mocked = original.newBuilder().addInterceptor(chain -> {
            assertEquals("AssumeRoleWithWebIdentity", chain.request().header("X-TC-Action"));
            okio.Buffer payload = new okio.Buffer();
            chain.request().body().writeTo(payload);
            assertTrue(payload.readUtf8().contains("mock-web-identity-token"));
            oidcCalls++;
            String body = "{\"Response\":{\"Credentials\":{\"TmpSecretId\":\"mock-oidc-id\","
                    + "\"TmpSecretKey\":\"mock-oidc-key\",\"Token\":\"mock-oidc-token\"},"
                    + "\"ExpiredTime\":2000000000,\"RequestId\":\"mock-request-id\"}}";
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1)
                    .code(200).message("OK")
                    .body(ResponseBody.create(MediaType.parse("application/json"), body)).build();
        }).build();

        // As in OIDCRoleArnProviderTest, replace the singleton used by internally created clients.
        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        Field unsafeField = unsafeClass.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Object unsafe = unsafeField.get(null);
        Object base = unsafeClass.getMethod("staticFieldBase", Field.class).invoke(unsafe, field);
        long offset = (Long) unsafeClass.getMethod("staticFieldOffset", Field.class).invoke(unsafe, field);
        unsafeClass.getMethod("putObject", Object.class, long.class, Object.class)
                .invoke(unsafe, base, offset, mocked);
    }
}
