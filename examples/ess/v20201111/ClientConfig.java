package ess.v20201111;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ess.v20201111.EssClient;

public class ClientConfig {

    public static final String EndPoint = "ess.tencentcloudapi.com";
    public static final String FileEndPoint = "file.ess.tencent.cn";

    // Ak 腾讯云ak/sk 腾讯云后台CAM
    public static final String Ak = "************";
    public static final String Sk = "************";

    // 管理员用户id或者员工用户id
    public static final String OperatorId = "************";

    public static EssClient getClientByEndpoint(String endPoint) {
        ClientProfile cp = new ClientProfile();
        HttpProfile hp = new HttpProfile();
        hp.setEndpoint(endPoint);
        cp.setHttpProfile(hp);
        return new EssClient(new Credential(Ak, Sk), "ap-guangzhou", cp);
    }
}
