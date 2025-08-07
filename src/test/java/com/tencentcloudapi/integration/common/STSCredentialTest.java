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

        private String realHost;

        public String getRealHost() {
            return this.realHost;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            this.realHost = request.url().host();
            return chain.proceed(request);
        }
    }

    @Test
    public void testSTSCredentialWithDefaultEndpoint() throws Exception {
        String expectedHost = "sts.tencentcloudapi.com";

        STSCredential cred = new STSCredential(
            "test-secret-id",
            "test-secret-key",
            "test-role-arn",
            "test-role-session-name"
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

        cred.getToken();

        Assert.assertEquals(expectedHost, interceptor.getRealHost());
    }

    @Test
    public void testSTSCredentialWithSetEndpoint() throws Exception {
        String expectedHost = "sts.internal.tencentcloudapi.com";

        STSCredential cred = new STSCredential(
            "test-secret-id",
            "test-secret-key",
            "test-role-arn",
            "test-role-session-name",
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

        cred.getToken();

        Assert.assertEquals(expectedHost, interceptor.getRealHost());
    }
}
