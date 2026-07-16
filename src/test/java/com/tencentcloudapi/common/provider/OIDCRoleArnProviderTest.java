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
 * Unit tests for {@link OIDCRoleArnProvider} that do NOT hit the network.
 *
 * <p>{@code OIDCRoleArnProvider} refreshes its triple by constructing a {@code CommonClient} and
 * calling {@code AssumeRoleWithWebIdentity} via {@link HttpConnection}'s process-wide
 * {@code OkHttpClient} singleton. We swap that singleton for one carrying a short-circuiting
 * OkHttp {@link Interceptor} that dispatches by the {@code X-TC-Action} header:
 * <ul>
 *   <li>{@code AssumeRoleWithWebIdentity} → canned ephemeral-credential response</li>
 *   <li>{@code DescribeInstances} → canned instance list (for the business-call test)</li>
 * </ul>
 */
public class OIDCRoleArnProviderTest {

    private Object originalOkClient;
    private final AtomicInteger assumeRoleWithWebIdentityCalls = new AtomicInteger(0);
    private final AtomicInteger describeInstancesCalls = new AtomicInteger(0);

    @Before
    public void setUp() throws Exception {
        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        originalOkClient = f.get(null);

        Interceptor stub = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request req = chain.request();
                String action = req.header("X-TC-Action");
                String body;
                if ("AssumeRoleWithWebIdentity".equals(action)) {
                    assumeRoleWithWebIdentityCalls.incrementAndGet();
                    body = "{\"Response\":{"
                            + "\"Credentials\":{"
                            + "\"TmpSecretId\":\"mock-tmp-secret-id\","
                            + "\"TmpSecretKey\":\"mock-tmp-secret-key\","
                            + "\"Token\":\"mock-token\""
                            + "},"
                            + "\"ExpiredTime\":2000000000,"
                            + "\"Expiration\":\"2033-05-18T00:00:00Z\","
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
        };

        OkHttpClient mocked = ((OkHttpClient) originalOkClient).newBuilder()
                .addInterceptor(stub)
                .build();
        putStatic(f, mocked);
    }

    @After
    public void tearDown() throws Exception {
        Field f = HttpConnection.class.getDeclaredField("clientSingleton");
        f.setAccessible(true);
        putStatic(f, originalOkClient);
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

    private OIDCRoleArnProvider newProvider() {
        return new OIDCRoleArnProvider(
                "ap-guangzhou",
                "mock-provider-id",
                "mock-web-identity-token",
                "qcs::cam::uin/10000:roleName/test-role",
                "test-session",
                7200L,
                "sts.tencentcloudapi.com");
    }

    @Test
    public void getCredentialsFetchesAssumeRoleWithWebIdentityAndReturnsEphemeralTriple()
            throws Exception {
        OIDCRoleArnProvider provider = newProvider();

        Credential cred = provider.getCredentials();

        // expiredTime starts at 0, so the first getCredentials() must trigger one refresh.
        assertEquals(1, assumeRoleWithWebIdentityCalls.get());

        assertNotNull(cred);
        assertEquals("mock-tmp-secret-id", cred.getSecretId());
        assertEquals("mock-tmp-secret-key", cred.getSecretKey());
        assertEquals("mock-token", cred.getToken());
    }

    @Test
    public void subsequentUpdateDoesNotRefreshUntilNearExpiry() throws Exception {
        OIDCRoleArnProvider provider = newProvider();

        Credential cred = provider.getCredentials();
        assertEquals("mock-tmp-secret-id", cred.getSecretId());
        assertEquals(1, assumeRoleWithWebIdentityCalls.get());

        // ExpiredTime is far in the future → no second refresh.
        provider.update(cred);
        assertEquals("expected no refresh while credentials are still valid",
                1, assumeRoleWithWebIdentityCalls.get());
    }

    @Test
    public void cvmDescribeInstancesSignedWithOidcRoleArnProvider() throws Exception {
        OIDCRoleArnProvider provider = newProvider();

        // Build CvmClient with the OIDC-provided credential, exactly as a real caller would.
        // CvmClient calls credential.getSnapshot() to sign each request — which triggers
        // OIDCRoleArnProvider.update() on the first read.
        Credential cred = provider.getCredentials();
        CvmClient cvm = new CvmClient(cred, "ap-guangzhou");

        DescribeInstancesResponse resp = cvm.DescribeInstances(new DescribeInstancesRequest());

        // The OIDC refresh fired exactly once (cached afterwards), and the CVM call fired once.
        assertEquals(1, assumeRoleWithWebIdentityCalls.get());
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
    public void repeatedBusinessCallsReuseCachedOidcCredentials() throws Exception {
        OIDCRoleArnProvider provider = newProvider();
        Credential cred = provider.getCredentials();
        CvmClient cvm = new CvmClient(cred, "ap-guangzhou");

        DescribeInstancesResponse r1 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r1.getInstanceSet()[0].getInstanceId());
        assertEquals(1, assumeRoleWithWebIdentityCalls.get());
        assertEquals(1, describeInstancesCalls.get());

        // Second business call: credentials still valid → no second OIDC refresh.
        DescribeInstancesResponse r2 = cvm.DescribeInstances(new DescribeInstancesRequest());
        assertEquals("ins-mock-001", r2.getInstanceSet()[0].getInstanceId());
        assertEquals("expected OIDC refresh to be cached across calls",
                1, assumeRoleWithWebIdentityCalls.get());
        assertEquals(2, describeInstancesCalls.get());
    }
}
