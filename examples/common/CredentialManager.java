import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.provider.DefaultCredentialsProvider;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;


public class CredentialManager {
    public static void main(String[] args) {
        try {
            // 通过凭证提供链得到一个认证对象
            Credential cred = new DefaultCredentialsProvider().getCredentials();
            // 实例化要请求产品(以cvm为例)的client对象,依次传入Credential、地域
            CvmClient client = new CvmClient(cred, "ap-guangzhou");
            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeInstancesRequest req = new DescribeInstancesRequest();
            // 通过client对象调用DescribeInstances方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个DescribeInstancesResponse类的实例，与请求对象对应
            DescribeInstancesResponse resp = client.DescribeInstances(req);
            // 输出json格式的字符串回包
            System.out.println(DescribeInstancesResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}