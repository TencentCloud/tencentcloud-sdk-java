import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;

public class CommonClientRequest {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");

            // 实例化要请求产品的CommonClient对象,依次传入产品名、产品版本、Credential、地域
            CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

            /* CommonClient中的commonRequest方法支持传入继承了AbstractModel的Request类和接口名对接口进行调用
             * 用户可以按照标准自行实现一个继承了AbstractModel的Request类
             */
            DescribeInstancesRequest req = new DescribeInstancesRequest();
            String resp = client.commonRequest(req, "DescribeInstances");

            // 输出返回的字符串结果
            System.out.println(resp);
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}