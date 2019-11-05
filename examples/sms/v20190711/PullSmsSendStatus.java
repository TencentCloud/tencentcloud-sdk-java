package sms.v20190711;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

//导入可选配置类
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;

// 导入对应SMS模块的client
import com.tencentcloudapi.sms.v20190711.SmsClient;

// 导入要请求接口对应的request response类
import com.tencentcloudapi.sms.v20190711.models.PullSmsReplyStatusRequest;
import com.tencentcloudapi.sms.v20190711.models.PullSmsReplyStatusResponse;

/**
 * Tencent Cloud Sms PullSmsSendStatus
 * https://cloud.tencent.com/document/product/382/38774
 *
 */
public class PullSmsSendStatus {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");

            // 实例化一个http选项，可选，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            // 设置代理
            httpProfile.setProxyHost("host");
            httpProfile.setProxyPort(port);
            // 指定请求方法，['GET', 'POST'], 默认为 'POST'
            httpProfile.setReqMethod("POST");
            // 请求连接超时时间，单位为秒，默认为 60
            httpProfile.setConnTimeout(60);
            // 指定接入域名
            httpProfile.setEndpoint("sms.tencentcloudapi.com");

            // 实例化一个client选项，可选，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            // 指定签名算法,默认为 'HmacSHA256'
            clientProfile.setSignMethod("HmacSHA256");
            clientProfile.setHttpProfile(httpProfile);

            // 实例化 sms 的client对象,clientProfile是可选的
            SmsClient client = new SmsClient(cred, "",clientProfile);

            // 实例化一个sms实例发送短信请求对象,每个接口都会对应一个request对象。
            SendSmsRequest req = new SendSmsRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            // 设置短信应用 SDKAPPID
            String appid = "1400009099";
            req.setSmsSdkAppid(appid);

            // 设置拉取最大条数，最多100条
            Long limit = 5L;
            req.setLimit(limit);

            // 通过 client 对象调用 PullSmsSendStatus 方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的 res 是一个 PullSmsSendStatusResponse 类的实例，与请求对象对应
            PullSmsSendStatusResponse res = client.PullSmsSendStatus(req);

            // 输出json格式的字符串回包
            System.out.println(PullSmsSendStatusResponse.toJsonString(res));

        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
