package soe.v20180724;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.soe.v20180724.SoeClient;
import com.tencentcloudapi.soe.v20180724.models.InitOralProcessRequest;
import com.tencentcloudapi.soe.v20180724.models.InitOralProcessResponse;

public class InitOralProcess {

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("...", "...");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("POST"); // post请求(默认为post请求)
            httpProfile.setConnTimeout(60); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("soe.ap-beijing.tencentcloudapi.com"); // 指定接入地域域名(默认就近接入)

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setUnsignedPayload(true);
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            SoeClient client = new SoeClient(cred, "",clientProfile);
            InitOralProcessRequest req = new InitOralProcessRequest();
            req.setSessionId("1");
            req.setRefText("since");
            req.setWorkMode(1);
            req.setEvalMode(0);
            req.setScoreCoeff(2.0f);

            InitOralProcessResponse res = client.InitOralProcess(req);

            // 输出json格式的字符串回包
            System.out.println(InitOralProcessResponse.toJsonString(res));
            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(res.getRequestId());
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }

}
