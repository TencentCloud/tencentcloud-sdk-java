package ess.v20201111;

import com.google.gson.GsonBuilder;
import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class CreateFlowByFiles {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);

            CreateFlowByFilesRequest request = new CreateFlowByFilesRequest();
            UserInfo userInfo = new UserInfo();
            // 发起人用户id，在控制台查询获取
            userInfo.setUserId(OperatorId);
            request.setOperator(userInfo);

            // 签署pdf文件的资源编号列表，目前只支持单文件签署
            request.setFileIds(new String[]{"************"});

            // 企业方签署时 静默签署时type为3/非静默签署type为0
            ApproverInfo enterpriseInfo = new ApproverInfo();
            enterpriseInfo.setApproverType(3L); // 静默签
            enterpriseInfo.setApproverName("************");
            enterpriseInfo.setApproverMobile("************");
            enterpriseInfo.setOrganizationName("************");

            Component enterpriseComponent = new Component();
            enterpriseInfo.setSignComponents(new Component[]{enterpriseComponent});
            enterpriseComponent.setComponentValue("************");
            enterpriseComponent.setComponentPosY(497.6718F);
            enterpriseComponent.setComponentWidth(74F);
            enterpriseComponent.setFileIndex(0L);
            enterpriseComponent.setComponentType("SIGN_SEAL");
            enterpriseComponent.setComponentPage(1L);
            enterpriseComponent.setComponentPosX(417.155F);
            enterpriseComponent.setComponentHeight(70F);

            // 个人方 type为1
            ApproverInfo clientInfo = new ApproverInfo();
            clientInfo.setApproverType(1L);
            clientInfo.setApproverName("************");
            clientInfo.setApproverMobile("************");

            Component clientComponent = new Component();
            clientInfo.setSignComponents(new Component[]{clientComponent});
            clientComponent.setComponentPosY(472.78125F);
            clientComponent.setComponentWidth(112F);
            clientComponent.setFileIndex(0L);
            clientComponent.setComponentType("SIGN_SIGNATURE");
            clientComponent.setComponentPage(1L);
            clientComponent.setComponentPosX(146.15625F);
            clientComponent.setComponentHeight(40F);

            request.setApprovers(new ApproverInfo[]{enterpriseInfo, clientInfo});
            // 设置合同名
            request.setFlowName("************");
            // 请设置合理的时间（秒级时间戳），否则容易造成合同过期
            request.setDeadline(System.currentTimeMillis() / 1000 + 7 * 24 * 3600);

            CreateFlowByFilesResponse response = client.CreateFlowByFiles(request);
            System.out.println(new GsonBuilder().disableHtmlEscaping().create().toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
