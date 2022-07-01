package ess.v20201111;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.CreateFlowRequest;
import com.tencentcloudapi.ess.v20201111.models.CreateFlowResponse;
import com.tencentcloudapi.ess.v20201111.models.FlowCreateApprover;
import com.tencentcloudapi.ess.v20201111.models.UserInfo;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class CreateFlow {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);
            CreateFlowRequest request = new CreateFlowRequest();

            UserInfo userInfo = new UserInfo();
            // 发起人用户id，在控制台查询获取
            userInfo.setUserId(OperatorId);
            request.setOperator(userInfo);

            // 企业方 静默签署时type为3/非静默签署type为0
            FlowCreateApprover enterpriseInfo = new FlowCreateApprover();
            enterpriseInfo.setApproverType(3L);
            enterpriseInfo.setOrganizationName("************");
            enterpriseInfo.setApproverName("************");
            enterpriseInfo.setApproverMobile("************");
            enterpriseInfo.setRequired(true); // 请务必设置

            // 客户个人 type为1
            FlowCreateApprover clientInfo = new FlowCreateApprover();
            clientInfo.setApproverType(1L);
            clientInfo.setApproverName("************");
            clientInfo.setApproverMobile("************");
            clientInfo.setRequired(true); // 请务必设置

            // 注：当进行B2B签署时，允许指向未注册的企业，此时签署人可以查看合同并按照指引注册企业
            request.setApprovers(new FlowCreateApprover[]{enterpriseInfo, clientInfo});

            // 请设置合理的时间（秒级时间戳），否则容易造成合同过期
            request.setDeadLine(System.currentTimeMillis() / 1000 + 7 * 24 * 3600);
            request.setFlowName("************");

            CreateFlowResponse resp = client.CreateFlow(request);
            System.out.println(CreateFlowResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
