package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;

public class DefaultCredentialsProviderTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void metadataIOExceptionReachesOidcProvider() throws Exception {
        runScenario("io-failure");
    }

    @Test
    public void metadataErrorResponseReachesOidcProvider() throws Exception {
        runScenario("error-response");
    }

    @Test
    public void unrelatedRuntimeExceptionIsNotSuppressed() throws Exception {
        runScenario("malformed-metadata");
    }

    private void runScenario(String scenario) throws Exception {
        assumeFalse("A system credential profile would bypass the CVM provider",
                Files.exists(Paths.get("/etc/tencentcloud/credentials")));
        // Isolate environment variables and the one-time URL handler from other provider tests.
        File output = temporaryFolder.newFile();
        ProcessBuilder builder = new ProcessBuilder(
                Paths.get(System.getProperty("java.home"), "bin", "java").toString(),
                "-Duser.home=" + temporaryFolder.getRoot(),
                "-cp", System.getProperty("java.class.path"),
                DefaultCredentialsProviderTest.class.getName(), scenario);
        Map<String, String> env = builder.environment();
        env.remove("TENCENTCLOUD_SECRET_ID");
        env.remove("TENCENTCLOUD_SECRET_KEY");
        env.remove("TKE_REGION");
        Process process = builder.redirectErrorStream(true).redirectOutput(output).start();
        if (!process.waitFor(30, TimeUnit.SECONDS)) {
            process.destroyForcibly();
            fail("Credential test child JVM timed out");
        }
        assertEquals(new String(Files.readAllBytes(output.toPath()), StandardCharsets.UTF_8),
                0, process.exitValue());
    }

    public static void main(String[] args) throws Exception {
        String scenario = args[0];
        installMetadataFake(scenario);
        try {
            new DefaultCredentialsProvider().getCredentials();
            fail("Expected credential acquisition to fail");
        } catch (TencentCloudSDKException e) {
            assertNotEquals("malformed-metadata", scenario);
            // Missing TKE_REGION fails in the OIDC constructor, proving fallback without an STS call.
            assertEquals("env TKE_REGION not exist", e.getMessage());
        } catch (NullPointerException e) {
            assertEquals("malformed-metadata", scenario);
        }
    }

    private static void installMetadataFake(final String scenario) {
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
                            if ("io-failure".equals(scenario)) {
                                throw new IOException("mock metadata unavailable");
                            }
                            String body;
                            if (url.getPath().endsWith("/security-credentials/")) {
                                body = "mock-role";
                            } else {
                                body = "error-response".equals(scenario)
                                        ? "{\"Code\":\"FailedOperation\"}" : "{}";
                            }
                            return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
                        }
                    };
                }
            };
        });
    }
}
