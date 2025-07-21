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

    class MyInterceptor implements Interceptor {

        public static final String expectUrl = "sts.tencentcloudapi.com";

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Assert.assertEquals(expectUrl, request.url().host());
            
            String mockResponseJson = "{\n" +
                "  \"Response\": {\n" +
                "    \"Credentials\": {\n" +
                "      \"Token\": \"mock-oidc-token\",\n" +
                "      \"TmpSecretId\": \"mock-oidc-tmp-secret-id\",\n" +
                "      \"TmpSecretKey\": \"mock-oidc-tmp-secret-key\"\n" +
                "    },\n" +
                "    \"ExpiredTime\": " + (System.currentTimeMillis() / 1000 + 7200) + ",\n" +
                "    \"Expiration\": \"2025-12-31T23:59:59Z\",\n" +
                "    \"RequestId\": \"mock-oidc-request-id\"\n" +
                "  }\n" +
                "}";

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
    public void testOIDCRoleProviderEndpointWithDefault() throws Exception {
        OIDCRoleArnProvider cred = new OIDCRoleArnProvider(
            "ap-guangzhou",
            "test-provider-id",
            "test-web-identity-token",
            "test-role-arn",
            "test-role-session-name",
            7200
        );

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(new MyInterceptor())
                .build();

        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, okClient);

        cred.getCredentials();
    }

    @Test
    public void testOIDCRoleProviderEndpointWithSet() throws Exception {
        OIDCRoleArnProvider cred = new OIDCRoleArnProvider(
            "ap-guangzhou",
            "test-provider-id",
            "test-web-identity-token",
            "test-role-arn",
            "test-role-session-name",
            7200,
            "sts.tencentcloudapi.com"
        );

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(new MyInterceptor())
                .build();

        Field field = HttpConnection.class.getDeclaredField("clientSingleton");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, okClient);

        cred.getCredentials();
    }
}
