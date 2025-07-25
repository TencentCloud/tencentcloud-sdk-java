package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.provider.OIDCRoleArnProvider;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class OIDCRoleProviderTest {

    static class MyInterceptor implements Interceptor {

        private String realHost;

        public String getRealHost() {
            return this.realHost;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
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

        MyInterceptor interceptor = new MyInterceptor();
        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, okClient);

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
            "sts.internal.tencentcloudapi.com"
        );

        MyInterceptor interceptor = new MyInterceptor();
        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, okClient);

        cred.getCredentials();

        Assert.assertEquals(expectedHost, interceptor.getRealHost());
    }
}
