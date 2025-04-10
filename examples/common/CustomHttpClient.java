import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import okhttp3.*;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;


public class CustomHttpClient {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            ClientProfile cpf = new ClientProfile();

            // 可以通过 HttpProfile.setHttpClient 来自定义 httpClient
            // 注意: 如果使用自定义 httpClient, 则 HttpProfile 中的配置则不会生效，需要用户自己配置
            Object customHttpClient = buildCustomHttpClient(cpf);
            cpf.getHttpProfile().setHttpClient(customHttpClient);

            CvmClient client = new CvmClient(cred, "ap-guangzhou");
            DescribeInstancesRequest req = new DescribeInstancesRequest();
            DescribeInstancesResponse resp = client.DescribeInstances(req);
            System.out.println(resp.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

    private static Object buildCustomHttpClient(ClientProfile cpf) {
        // 如果使用自定义 httpClient, 则 HttpProfile 中的配置则不会生效，需要用户自己配置
        // 以下示例代码展示如何使用自定义 httpClient 并获得 HttpProfile 中的等效配置
        final HttpProfile hp = cpf.getHttpProfile();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        // debug 日志
        if (cpf.isDebug()) {
            builder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    String req = ("send request,"
                            + " request url: " + request.url()
                            + ". request headers: " + request.headers())
                            .replaceAll("\n", ";");
                    System.out.println(req);
                    Response response = chain.proceed(request);
                    String resp = ("recieve response,"
                            + " response url: " + response.request().url()
                            + ", response headers: " + response.headers()
                            + ", response body: " + response.body().toString())
                            .replaceAll("\n", ";");
                    System.out.println(resp);
                    return response;
                }
            });
        }

        // 连接超时
        builder.connectTimeout(hp.getConnTimeout(), TimeUnit.SECONDS);

        // 读超时
        builder.readTimeout(hp.getReadTimeout(), TimeUnit.SECONDS);

        // 写超时
        builder.writeTimeout(hp.getWriteTimeout(), TimeUnit.SECONDS);

        // 代理
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(hp.getProxyHost(), hp.getProxyPort()));
        builder.proxy(proxy);
        if (!hp.getProxyUsername().isEmpty()) {
            builder.proxyAuthenticator(new Authenticator() {
                @Override
                public Request authenticate(Route route, Response response) throws IOException {
                    String credential = Credentials.basic(hp.getProxyUsername(), hp.getProxyPassword());
                    return response
                            .request()
                            .newBuilder()
                            .header("Proxy-Authorization", credential)
                            .build();
                }
            });
        }

        // SSLSocketFactory & X509TrustManager
        SSLSocketFactory sslSocketFactory = hp.getSslSocketFactory();
        X509TrustManager x509TrustManager = hp.getX509TrustManager();
        if (sslSocketFactory != null) {
            if (x509TrustManager != null) {
                builder.sslSocketFactory(sslSocketFactory, x509TrustManager);
            } else {
                builder.sslSocketFactory(sslSocketFactory);
            }
        }

        // HostnameVerifier
        HostnameVerifier hostnameVerifier = hp.getHostnameVerifier();
        builder.hostnameVerifier(hostnameVerifier);

        return builder.build();
    }
}