package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.provider.OIDCRoleArnProvider;
import okhttp3.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class OIDCRoleProviderTest {

    private final MyInterceptor interceptor = new MyInterceptor();
    private Object oldClient;

    @Before
    public void setUp() throws Exception {
        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);

        oldClient = field.get(null);
        putStatic(field, okClient);
    }

    @After
    public void teardown() throws Exception {
        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);
        putStatic(field, oldClient);
    }

    /**
 *      * Writes a value to a {@code private static final} field, working around the {@code final}
 *           * restriction on Java 9+ via {@code sun.misc.Unsafe.putObject} on the field's base+offset.
 *                */
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

    static class MyInterceptor implements Interceptor {

        private String realHost;

        public String getRealHost() {
            return this.realHost;
        }


        @Override
        public Response intercept(Chain chain) {
            Request request = chain.request();

            realHost = request.url().host();

            String mockResponseJson = "{\"Response\": {"
                    + "\"Credentials\": {"
                    + "\"Token\":\"mock-oidc-token\","
                    + "\"TmpSecretId\":\"mock-oidc-tmp-secret-id\","
                    + "\"TmpSecretKey\":\"mock-oidc-tmp-secret-key\""
                    + "},"
                    + "\"ExpiredTime\":" + (System.currentTimeMillis() / 1000 + 7200) + ","
                    + "\"Expiration\":\"2025-12-31T23:59:59Z\","
                    + "\"RequestId\":\"mock-oidc-request-id\"}}";
            return new Response.Builder()
                    .request(request)
                    .protocol(okhttp3.Protocol.HTTP_1_1)
                    .code(200)
                    .message("OK")
                    .body(okhttp3.ResponseBody.create(
                            MediaType.parse("application/json"),
                            mockResponseJson
                    ))
                    .build();
        }
    }

    @Test
    public void testOIDCRoleProviderWithDefaultEndpoint() throws Exception {
        String expectedHost = "sts.tencentcloudapi.com";

        OIDCRoleArnProvider cred = new OIDCRoleArnProvider(
                "ap-guangzhou",
                "test-provider-id",
                "test-web-identity-token",
                "test-role-arn",
                "test-role-session-name",
                7200
        );

        cred.getCredentials();

        Assert.assertEquals(expectedHost, interceptor.getRealHost());
    }

    @Test
    public void testOIDCRoleProviderWithSetEndpoint() throws Exception {
        String expectedHost = "sts.internal.tencentcloudapi.com";

        OIDCRoleArnProvider cred = new OIDCRoleArnProvider(
                "ap-guangzhou",
                "test-provider-id",
                "test-web-identity-token",
                "test-role-arn",
                "test-role-session-name",
                7200,
                expectedHost
        );

        cred.getCredentials();

        Assert.assertEquals(expectedHost, interceptor.getRealHost());
    }
}

