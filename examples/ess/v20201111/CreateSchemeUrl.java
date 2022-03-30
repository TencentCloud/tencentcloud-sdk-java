package ess.v20201111;

import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class CreateSchemeUrl {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);
            CreateSchemeUrlRequest request = new CreateSchemeUrlRequest();

            UserInfo userInfo = new UserInfo();
            // 管理员用户id或者员工用户id
            userInfo.setUserId(OperatorId);
            request.setOperator(userInfo);

            // FlowId由CreateFlow或者CreateFlowByFiles返回
            request.setFlowId("*********");
            request.setPathType(1L);

            CreateSchemeUrlResponse response = client.CreateSchemeUrl(request);
            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
