package ess.v20201111;

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
            // 管理员用户id或者员工用户id
            userInfo.setUserId(OperatorId);
            // 请求客户端在公网的ip地址
            userInfo.setClientIp("************");
            request.setOperator(userInfo);

            // 签署pdf文件的资源编号列表，目前只支持单文件签署
            request.setFileIds(new String[]{"************"});

            // 企业方 静默签署时type为3/非静默签署type为0（仅支持处于第一位的签署方进行静默签，且合同为顺序签署，请于控制台调整好模板）
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

            // 个人 type为1
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
            request.setFlowName("************");

            CreateFlowByFilesResponse response = client.CreateFlowByFiles(request);
            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
