import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.models.*;
import com.tencentcloudapi.live.v20180801.LiveClient;
import com.tencentcloudapi.live.v20180801.models.DescribeLiveStreamStateRequest;
import com.tencentcloudapi.live.v20180801.models.DescribeLiveStreamStateResponse;

public class DescribeLiveStreamState {
	public static void main(String[] args) {
		try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");

            // 实例化一个http选项
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // post请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)

            // 实例化一个client选项
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod("HmacSHA256"); // 指定签名算法(默认为HmacSHA256)
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以cvm为例)的client对象,clientProfile是可选的
            LiveClient client = new LiveClient(cred, "", clientProfile);

            // 实例化一个live实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeLiveStreamStateRequest req = new DescribeLiveStreamStateRequest();

            req.setAppName("appName");
            req.setDomainName("domainName");
            req.setStreamName("streamName");

            // 通过client对象调用DescribeLiveStreamStateResponse方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个DescribeLiveStreamStateResponse类的实例，与请求对象对应
            DescribeLiveStreamStateResponse resp = client.DescribeLiveStreamState(req);

            // 输出json格式的字符串回包
            System.out.println(DescribeInstancesResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getStreamState());
            System.out.println(resp.getRequestId());
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}