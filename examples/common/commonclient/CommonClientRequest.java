import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;

public class CommonClientRequest {
    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));

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
