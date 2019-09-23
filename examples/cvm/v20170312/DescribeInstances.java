import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
// 导入对应产品模块的client
import com.tencentcloudapi.cvm.v20170312.CvmClient;
// 导入要请求接口对应的request response类
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;
import com.tencentcloudapi.cvm.v20170312.models.Filter;
//导入可选配置类
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;

public class DescribeInstances {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // get请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("cvm.ap-shanghai.tencentcloudapi.com"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod("HmacSHA256"); // 指定签名算法(默认为HmacSHA256)
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以cvm为例)的client对象,clientProfile是可选的
            CvmClient client = new CvmClient(cred, "ap-shanghai", clientProfile);

            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeInstancesRequest req = new DescribeInstancesRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            Filter respFilter = new Filter(); // 创建Filter对象, 以zone的维度来查询cvm实例
            respFilter.setName("zone");
            respFilter.setValues(new String[] { "ap-shanghai-1", "ap-shanghai-2" });
            req.setFilters(new Filter[] { respFilter }); // Filters 是成员为Filter对象的列表

            // 这里还支持以标准json格式的string来赋值请求参数的方式。下面的代码跟上面的参数赋值是等效的
            String params = "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-shanghai-1\",\"ap-shanghai-2\"]}]}";
            req = DescribeInstancesRequest.fromJsonString(params, DescribeInstancesRequest.class);

            // 通过client对象调用DescribeInstances方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个DescribeInstancesResponse类的实例，与请求对象对应
            DescribeInstancesResponse resp = client.DescribeInstances(req);

            // 输出json格式的字符串回包
            System.out.println(DescribeInstancesResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getTotalCount());
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
