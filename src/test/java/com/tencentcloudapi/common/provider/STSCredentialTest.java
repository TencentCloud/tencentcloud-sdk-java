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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for {@link STSCredential} that do NOT hit the network.
 *
 * <p>{@code STSCredential} refreshes its triple by internally constructing a {@code CommonClient}
 * and calling {@code AssumeRole} via {@link HttpConnection}'s process-wide {@code OkHttpClient}
 * singleton ({@code clientSingleton}). That field is {@code private static final}, so we use
 * {@code sun.misc.Unsafe} (works on Java 8 through 17+) to swap in a client that carries a
 * short-circuiting OkHttp {@link Interceptor}. OkHttp's {@code newBuilder()} preserves the
 * interceptor list, so the stub also covers any client derived from the swapped singleton inside
 * {@code STSCredential.UpdaterImpl} and {@code CvmClient}.
 *
 * <p>The interceptor dispatches by the {@code X-TC-Action} header:
 * <ul>
 *   <li>{@code AssumeRole} → canned ephemeral-credential response</li>
 *   <li>{@code DescribeInstances} → canned instance list</li>
 * </ul>
 */
public class STSCredentialTest {

    private Object originalClient;
    private final AtomicInteger assumeRoleCalls = new AtomicInteger(0);
    private final AtomicInteger describeInstancesCalls = new AtomicInteger(0);

    @Before
    public void installMockInterceptor() throws Exception {
        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        originalClient = f.get(null);

        Interceptor stub = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request req = chain.request();
                String action = req.header("X-TC-Action");
                String body;
                if ("AssumeRole".equals(action)) {
                    assumeRoleCalls.incrementAndGet();
                    // Minimal valid AssumeRole response: UpdaterImpl only reads
                    // Response.Credentials.{TmpSecretId,TmpSecretKey,Token} and Response.ExpiredTime.
                    body = "{\"Response\":{"
                            + "\"Credentials\":{"
                            + "\"TmpSecretId\":\"mock-tmp-secret-id\","
                            + "\"TmpSecretKey\":\"mock-tmp-secret-key\","
                            + "\"Token\":\"mock-token\""
                            + "},"
                            + "\"ExpiredTime\":2000000000,"
                            + "\"RequestId\":\"mock-sts-request-id\""
                            + "}}";
                } else if ("DescribeInstances".equals(action)) {
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
                            + "\"Code\":\"UnknownAction\",\"Message\":\"unsupported action: " + action + "\"}}}";
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
        };

        OkHttpClient mocked = ((OkHttpClient) originalClient).newBuilder()
                .addInterceptor(stub)
                .build();
        putStatic(f, mocked);
    }

    @After
    public void restoreOriginalClient() throws Exception {
        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        putStatic(f, originalClient);
    }

    /**
     * Writes a value to a {@code private static final} field, working around the {@code final}
     * restriction on Java 9+ via {@code sun.misc.Unsafe.putObject} on the field's base+offset.
     */
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
    public void getSnapshotTriggersAssumeRoleAndReturnsEphemeralTriple() {
        STSCredential cred = new STSCredential(
                "permanent-secret-id",
                "permanent-secret-key",
                "qcs::cam::uin/10000:roleName/test-role",
                "test-session",
                "sts.tencentcloudapi.com");

        Credential snap = cred.getSnapshot();

        // The first getSnapshot() must have triggered exactly one AssumeRole refresh
        // (UpdaterImpl.expiredTime starts at 0, so needRefresh() is true on the first call).
        assertEquals(1, assumeRoleCalls.get());

        assertNotNull(snap);
        assertEquals("mock-tmp-secret-id", snap.getSecretId());
        assertEquals("mock-tmp-secret-key", snap.getSecretKey());
        assertEquals("mock-token", snap.getToken());
    }

    @Test
    public void subsequentSnapshotDoesNotRefreshUntilNearExpiry() {
        STSCredential cred = new STSCredential(
                "permanent-secret-id",
                "permanent-secret-key",
                "qcs::cam::uin/10000:roleName/test-role",
                "test-session",
                "sts.tencentcloudapi.com");

        // First read triggers a refresh.
        Credential snap1 = cred.getSnapshot();
        assertEquals(1, assumeRoleCalls.get());
        assertEquals("mock-tmp-secret-id", snap1.getSecretId());

        // The canned response sets ExpiredTime far in the future, so the next read should
        // reuse the cached triple without another AssumeRole call.
        Credential snap2 = cred.getSnapshot();
        assertEquals("expected no refresh while credentials are still valid",
                1, assumeRoleCalls.get());
        assertEquals("mock-tmp-secret-id", snap2.getSecretId());
    }

    @Test
    public void cvmDescribeInstancesSignedWithStsCredential() throws Exception {
        // 1) Build an STSCredential. On first read it will refresh via AssumeRole.
        STSCredential stsCred = new STSCredential(
                "permanent-secret-id",
                "permanent-secret-key",
                "qcs::cam::uin/10000:roleName/test-role",
                "test-session",
                "sts.tencentcloudapi.com");

        // 2) Hand it to CvmClient exactly as a real caller would. CvmClient internally calls
        //    credential.getSnapshot() to sign each request — which triggers the STS refresh.
        CvmClient cvm = new CvmClient(stsCred, "ap-guangzhou");

        DescribeInstancesRequest req = new DescribeInstancesRequest();
        req.setLimit(1L);

        DescribeInstancesResponse resp = cvm.DescribeInstances(req);

        // 3) The STS refresh fired exactly once (cached afterwards), and the CVM call fired once.
        assertEquals(1, assumeRoleCalls.get());
        assertEquals(1, describeInstancesCalls.get());

        // 4) The business response was parsed into the typed model.
        assertNotNull(resp);
        assertEquals(Long.valueOf(1L), resp.getTotalCount());
        Instance[] instances = resp.getInstanceSet();
        assertNotNull(instances);
        assertEquals(1, instances.length);
        assertEquals("ins-mock-001", instances[0].getInstanceId());
        assertEquals("mock-instance", instances[0].getInstanceName());
        assertEquals("S5.MEDIUM4", instances[0].getInstanceType());
        assertEquals("mock-cvm-request-id", resp.getRequestId());
    }

    @Test
    public void repeatedBusinessCallsReuseCachedStsCredential() throws Exception {
        STSCredential stsCred = new STSCredential(
                "permanent-secret-id",
                "permanent-secret-key",
                "qcs::cam::uin/10000:roleName/test-role",
                "test-session",
                "sts.tencentcloudapi.com");
        CvmClient cvm = new CvmClient(stsCred, "ap-guangzhou");

        // First business call triggers the initial STS refresh.
        DescribeInstancesResponse r1 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r1.getInstanceSet()[0].getInstanceId());
        assertEquals(1, assumeRoleCalls.get());
        assertEquals(1, describeInstancesCalls.get());

        // Second business call: credentials still valid → no second AssumeRole.
        DescribeInstancesResponse r2 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r2.getInstanceSet()[0].getInstanceId());
        assertEquals("expected STS refresh to be cached across calls",
                1, assumeRoleCalls.get());
        assertEquals(2, describeInstancesCalls.get());
    }
}
