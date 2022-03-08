package ess.v20201111;

import com.google.gson.GsonBuilder;
import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class DescribeFileUrls {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);

            DescribeFileUrlsRequest request = new DescribeFileUrlsRequest();
            UserInfo userInfo = new UserInfo();
            // 管理员用户id或者员工用户id
            userInfo.setUserId(OperatorId);
            // 请求客户端在公网的ip地址
            userInfo.setClientIp("************");
            request.setOperator(userInfo);

            request.setBusinessType("FLOW");
            // 传入flowId
            request.setBusinessIds(new String[]{"************"});

            DescribeFileUrlsResponse response = client.DescribeFileUrls(request);
            // 请注意打印方式
            System.out.println(new GsonBuilder().disableHtmlEscaping().create().toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
