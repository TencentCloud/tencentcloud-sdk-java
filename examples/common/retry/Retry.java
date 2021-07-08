import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;


public class Retry {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");
            // 实例化要请求产品(以cvm为例)的client对象,依次传入Credential、地域
            CvmClient client = new CvmClient(cred, "ap-guangzhou");
            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeInstancesRequest req = new DescribeInstancesRequest();
            // 通过client对象调用retry方法发起请求。依次传入请求对象req和重试次数
            // 注意需要将返回值强制转换成与请求对象对应的Response类型
            DescribeInstancesResponse resp = (DescribeInstancesResponse) client.retry(req, 5);
            // 输出json格式的字符串回包
            System.out.println(DescribeInstancesResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}