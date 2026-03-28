import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;

import java.util.HashMap;

public class Nginx {
    public static void main(String[] args) {
        /*
		本示例演示如何通过 **nginx 反向代理** 请求腾讯云 API。
		场景：某些网络环境不能直接访问腾讯云域名(*.tencentcloudapi.com)，只能通过代理服务器。
		========================
		1. nginx 配置示例：
		========================
		server {
		    listen 80;
		    # 指定 DNS 服务器（可以根据自己网络环境进行替换）
		    resolver 114.114.114.114;
		    # 可以自定义请求路径
		    location /tc_api {
		        # http_host 后必须以 / 结尾
		        proxy_pass https://$http_host/$is_args$args;
		    }
		}
		*/
        try {
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            ClientProfile cpf = new ClientProfile();
            // 2. 将 Scheme 设置为 http
            cpf.getHttpProfile().setProtocol(HttpProfile.REQ_HTTP);

            // 3. 替换 1.2.3.4 为真实的 nginx 地址, /tc_api 可以自定义
            String nginx = "1.2.3.4/tc_api";
            cpf.getHttpProfile().setEndpoint(nginx);

            CvmClient client = new CvmClient(cred, "ap-guangzhou", cpf);

            DescribeInstancesRequest req = new DescribeInstancesRequest();
            // 4. 设置 header 为 {服务名}.tencentcloudapi.com
            req.SetHeader(new HashMap<String, String>() {{
                put("Host", "cvm.tencentcloudapi.com");
            }});
            req.setLimit(10L);

            DescribeInstancesResponse resp = client.DescribeInstances(req);
            System.out.println(DescribeInstancesResponse.toJsonString(resp));

        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
