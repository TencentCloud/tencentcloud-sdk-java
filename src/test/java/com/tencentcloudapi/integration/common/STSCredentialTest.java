package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.http.HttpConnection;
import com.tencentcloudapi.common.provider.STSCredential;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class STSCredentialTest {

    class MyInterceptor implements Interceptor {

        public static final String expectUrl = "sts.tencentcloudapi.com";

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Assert.assertEquals(expectUrl, request.url().host());
            return chain.proceed(request);
        }
    }

    @Test
    public void testSTSCredentialEndpointWithDefault() throws Exception {
        STSCredential cred = new STSCredential(
            "test-secret-id",
            "test-secret-key",
            "test-role-arn",
            "test-role-session-name"
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

        cred.getToken();
    }

    @Test
    public void testSTSCredentialEndpointWithSet() throws Exception {
        STSCredential cred = new STSCredential(
            "test-secret-id",
            "test-secret-key",
            "test-role-arn",
            "test-role-session-name",
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

        cred.getToken();
    }
}
