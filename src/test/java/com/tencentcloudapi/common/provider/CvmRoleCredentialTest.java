package com.tencentcloudapi.common.provider;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import com.tencentcloudapi.cvm.v20170312.models.Instance;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for {@link CvmRoleCredential} that do NOT hit the network.
 *
 * <p>{@code CvmRoleCredential} fetches ephemeral credentials from the CVM metadata service via
 * {@link java.net.HttpURLConnection}, with the metadata URL hardcoded as a {@code static final
 * String} constant on the inner {@code UpdaterImpl} class. Because that constant is a compile-time
 * literal, it is inlined into the bytecode and cannot be redirected by reflection. Instead, we
 * install a one-shot JDK {@link URLStreamHandlerFactory} that intercepts the
 * {@code metadata.tencentyun.com} host and serves canned metadata responses from memory.
 *
 * <p>For the business-call tests we additionally swap {@link HttpConnection}'s OkHttp singleton
 * (the same trick used in {@link STSCredentialTest}) to stub the CVM {@code DescribeInstances}
 * HTTP call.
 */
public class CvmRoleCredentialTest {

    private static final String METADATA_HOST = "metadata.tencentyun.com";
    private static final String ROLE_NAME = "mock-cvm-role";

    /** Whether the installed factory is currently intercepting. Toggled per-test via setUp/tearDown. */
    private static volatile boolean intercepting = false;

    // Static because the URLStreamHandlerFactory is itself static.
    private static final AtomicInteger metadataRoleListCalls = new AtomicInteger(0);
    private static final AtomicInteger metadataRoleCredCalls = new AtomicInteger(0);
    private static final AtomicInteger describeInstancesCalls = new AtomicInteger(0);

    private Object originalOkClient;
    private static boolean factoryInstalled = false;

    @Before
    public void setUp() throws Exception {
        installUrlStreamHandlerFactoryOnce();

        // Reset per-test counters and enable interception.
        metadataRoleListCalls.set(0);
        metadataRoleCredCalls.set(0);
        describeInstancesCalls.set(0);
        intercepting = true;

        // Swap OkHttp clientSingleton so any CVM call is stubbed.
        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        originalOkClient = f.get(null);
        OkHttpClient mocked = ((OkHttpClient) originalOkClient).newBuilder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request req = chain.request();
                        String action = req.header("X-TC-Action");
                        String body;
                        if ("DescribeInstances".equals(action)) {
                            describeInstancesCalls.incrementAndGet();
                            body = "{\"Response\":{"
                                    + "\"TotalCount\":1,"
                                    + "\"InstanceSet\":[{"
                                    + "\"InstanceId\":\"ins-mock-001\","
                                    + "\"InstanceName\":\"mock-instance\","
                                    + "\"InstanceType\":\"S5.MEDIUM4\""
                                    + "}],"
                                    + "\"RequestId\":\"mock-cvm-request-id\""
                                    + "}}";
                        } else {
                            body = "{\"Response\":{\"RequestId\":\"mock-unknown\",\"Error\":{"
                                    + "\"Code\":\"UnknownAction\",\"Message\":\"unsupported: " + action + "\"}}}";
                        }
                        return new Response.Builder()
                                .request(req)
                                .protocol(okhttp3.Protocol.HTTP_1_1)
                                .code(200)
                                .message("OK")
                                .body(okhttp3.ResponseBody.create(
                                        okhttp3.MediaType.parse("application/json; charset=utf-8"),
                                        body))
                                .build();
                    }
                })
                .build();
        putStatic(f, mocked);
    }

    @After
    public void tearDown() throws Exception {
        intercepting = false;

        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        putStatic(f, originalOkClient);
    }

    /**
     * Installs the global {@link URLStreamHandlerFactory} exactly once per JVM. The factory routes
     * {@code http://metadata.tencentyun.com/...} to an in-memory handler while
     * {@link #intercepting} is true, and falls back to the default handler otherwise.
     *
     * <p>{@code URL.setURLStreamHandlerFactory} can only be called once per JVM; we cannot uninstall
     * it, but the {@code intercepting} flag keeps the handler inert outside of tests.
     */
    private static synchronized void installUrlStreamHandlerFactoryOnce() {
        if (factoryInstalled) {
            return;
        }
        URL.setURLStreamHandlerFactory(new URLStreamHandlerFactory() {
            @Override
            public URLStreamHandler createURLStreamHandler(String protocol) {
                if (!"http".equals(protocol)) {
                    return null;
                }
                return new URLStreamHandler() {
                    @Override
                    protected URLConnection openConnection(URL u) throws IOException {
                        if (intercepting && METADATA_HOST.equals(u.getHost())) {
                            return new MetadataURLConnection(u);
                        }
                        // Fall back to the default handler so non-metadata URLs still work.
                        try {
                            URL copy = new URL(u.toString());
                            return copy.openConnection();
                        } catch (IOException e) {
                            throw e;
                        }
                    }

                    @Override
                    protected URLConnection openConnection(URL u, Proxy p) throws IOException {
                        return openConnection(u);
                    }

                    @Override
                    protected InetAddress getHostAddress(URL u) {
                        return null;
                    }
                };
            }
        });
        factoryInstalled = true;
    }

    /**
     * Serves canned CVM metadata responses:
     * <ul>
     *   <li>{@code .../security-credentials/} → role name list (single name).</li>
     *   <li>{@code .../security-credentials/<role>} → credential JSON.</li>
     * </ul>
     *
     * <p>Static because the {@link URLStreamHandlerFactory} that creates it is itself static.
     * Extends {@link java.net.HttpURLConnection} because {@code CvmRoleCredential.UpdaterImpl}
     * casts the result of {@code URL.openConnection()} to {@code HttpURLConnection}.
     */
    private static final class MetadataURLConnection extends java.net.HttpURLConnection {
        private byte[] body;

        MetadataURLConnection(URL url) {
            super(url);
            method = "GET";
        }

        @Override
        public void connect() throws IOException {
            if (connected) {
                return;
            }
            String path = url.getPath();
            String prefix = "/latest/meta-data/cam/security-credentials/";
            String resp;
            if (path.equals(prefix) || path.equals(prefix.substring(0, prefix.length() - 1))) {
                metadataRoleListCalls.incrementAndGet();
                resp = ROLE_NAME;
            } else if (path.startsWith(prefix)) {
                metadataRoleCredCalls.incrementAndGet();
                resp = "{"
                        + "\"Code\":\"Success\","
                        + "\"TmpSecretId\":\"mock-tmp-secret-id\","
                        + "\"TmpSecretKey\":\"mock-tmp-secret-key\","
                        + "\"Token\":\"mock-token\","
                        + "\"ExpiredTime\":2000000000"
                        + "}";
            } else {
                responseCode = 404;
                resp = "";
            }
            body = resp.getBytes("UTF-8");
            connected = true;
            responseCode = 200;
        }

        @Override
        public InputStream getInputStream() throws IOException {
            if (!connected) {
                connect();
            }
            return new java.io.ByteArrayInputStream(body);
        }

        @Override
        public void disconnect() {
            // no-op
        }

        @Override
        public boolean usingProxy() {
            return false;
        }
    }

    /** Writes a {@code private static final} field via {@code sun.misc.Unsafe}. */
    private static void putStatic(Field field, Object value) throws Exception {
        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        Field unsafeField = unsafeClass.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Object unsafe = unsafeField.get(null);

        Method objectFieldOffset = unsafeClass.getMethod("staticFieldOffset", Field.class);
        Method staticFieldBase = unsafeClass.getMethod("staticFieldBase", Field.class);
        Method putObject = unsafeClass.getMethod("putObject", Object.class, long.class, Object.class);

        Object base = staticFieldBase.invoke(unsafe, field);
        long offset = (Long) objectFieldOffset.invoke(unsafe, field);
        putObject.invoke(unsafe, base, offset, value);
    }

    @Test
    public void getSnapshotFetchesFromMetadataAndReturnsEphemeralTriple() {
        // roleName is null: UpdaterImpl will first call the metadata list endpoint to obtain it.
        CvmRoleCredential cred = new CvmRoleCredential();

        Credential snap = cred.getSnapshot();

        assertEquals(1, metadataRoleListCalls.get());
        assertEquals(1, metadataRoleCredCalls.get());

        assertNotNull(snap);
        assertEquals("mock-tmp-secret-id", snap.getSecretId());
        assertEquals("mock-tmp-secret-key", snap.getSecretKey());
        assertEquals("mock-token", snap.getToken());
    }

    @Test
    public void getSnapshotWithExplicitRoleNameSkipsListCall() {
        CvmRoleCredential cred = new CvmRoleCredential(ROLE_NAME);

        Credential snap = cred.getSnapshot();

        assertEquals(0, metadataRoleListCalls.get());
        assertEquals(1, metadataRoleCredCalls.get());

        assertEquals("mock-tmp-secret-id", snap.getSecretId());
        assertEquals("mock-tmp-secret-key", snap.getSecretKey());
        assertEquals("mock-token", snap.getToken());
    }

    @Test
    public void subsequentSnapshotDoesNotRefreshUntilNearExpiry() {
        CvmRoleCredential cred = new CvmRoleCredential(ROLE_NAME);

        Credential snap1 = cred.getSnapshot();
        assertEquals("mock-tmp-secret-id", snap1.getSecretId());
        assertEquals(1, metadataRoleCredCalls.get());

        Credential snap2 = cred.getSnapshot();
        assertEquals("mock-tmp-secret-id", snap2.getSecretId());
        assertEquals("expected no refresh while credentials are still valid",
                1, metadataRoleCredCalls.get());
    }

    @Test
    public void cvmDescribeInstancesSignedWithCvmRoleCredential() throws Exception {
        CvmRoleCredential cred = new CvmRoleCredential(ROLE_NAME);
        CvmClient cvm = new CvmClient(cred, "ap-guangzhou");

        DescribeInstancesResponse resp = cvm.DescribeInstances(new DescribeInstancesRequest());

        assertEquals(1, metadataRoleCredCalls.get());
        assertEquals(1, describeInstancesCalls.get());

        assertNotNull(resp);
        assertEquals(Long.valueOf(1L), resp.getTotalCount());
        Instance[] instances = resp.getInstanceSet();
        assertNotNull(instances);
        assertEquals(1, instances.length);
        assertEquals("ins-mock-001", instances[0].getInstanceId());
        assertEquals("mock-cvm-request-id", resp.getRequestId());
    }

    @Test
    public void repeatedBusinessCallsReuseCachedCvmRoleCredential() throws Exception {
        CvmRoleCredential cred = new CvmRoleCredential(ROLE_NAME);
        CvmClient cvm = new CvmClient(cred, "ap-guangzhou");

        DescribeInstancesResponse r1 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r1.getInstanceSet()[0].getInstanceId());
        assertEquals(1, metadataRoleCredCalls.get());
        assertEquals(1, describeInstancesCalls.get());

        DescribeInstancesResponse r2 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r2.getInstanceSet()[0].getInstanceId());
        assertEquals("expected CVM metadata fetch to be cached across calls",
                1, metadataRoleCredCalls.get());
        assertEquals(2, describeInstancesCalls.get());
    }
}
