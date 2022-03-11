package ess.v20201111;

import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class StartFlow {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);
            StartFlowRequest request = new StartFlowRequest();

            UserInfo userInfo = new UserInfo();
            // 管理员用户id或者员工用户id
            userInfo.setUserId(OperatorId);
            // 请求客户端在公网的ip地址
            userInfo.setClientIp("************");
            request.setOperator(userInfo);

            // 由CreateFlow返回
            request.setFlowId("************");

            StartFlowResponse response = client.StartFlow(request);
            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
