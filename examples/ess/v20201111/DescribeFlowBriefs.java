package ess.v20201111;

import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class DescribeFlowBriefs {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);
            DescribeFlowBriefsRequest request = new DescribeFlowBriefsRequest();

            UserInfo userInfo = new UserInfo();
            // 发起人用户id，在控制台查询获取
            userInfo.setUserId(OperatorId);
            request.setOperator(userInfo);

            // 由CreateFlow返回
            request.setFlowIds(new String[]{"************"});
            DescribeFlowBriefsResponse response = client.DescribeFlowBriefs(request);
            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
