import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class CommonClientCall {
    public static void main(String [] args) {
        try{
			// 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));

            // 实例化要请求产品的CommonClient对象,依次传入产品名、产品版本、Credential、地域
            CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");

            /* 调用client对象的call方法，传入接口名和json格式的字符串向接口发起调用
             * 以查询可用区（zone）为广州一区，实例计费模式（instance-charge-type）为包年包月或者按量计费的实例为例
             */
            String resp = client.call("DescribeInstances",
                              "{\"Filters\":"
                            + "[{\"Name\":\"zone\","
                            + "\"Values\":[\"ap-guangzhou-1\"]},"
                            + "{\"Name\":\"instance-charge-type\","
                            + "\"Values\":[\"PREPAID\",\"POSTPAID_BY_HOUR\"]}]"
                            + "}");

            // 输出返回的字符串结果
            System.out.println(resp);
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
