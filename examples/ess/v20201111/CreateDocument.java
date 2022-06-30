package ess.v20201111;

import com.google.gson.GsonBuilder;
import com.tencentcloudapi.ess.v20201111.EssClient;
import com.tencentcloudapi.ess.v20201111.models.*;

import static ess.v20201111.ClientConfig.EndPoint;
import static ess.v20201111.ClientConfig.OperatorId;

public class CreateDocument {

    public static void main(String[] args) {

        try {
            EssClient client = ClientConfig.getClientByEndpoint(EndPoint);
            CreateDocumentRequest request = new CreateDocumentRequest();

            UserInfo userInfo = new UserInfo();
            // 发起人用户id，在控制台查询获取
            userInfo.setUserId(OperatorId);
            request.setOperator(userInfo);

            // 由CreateFlow返回
            request.setFlowId("************");

            // 传入自定义文件名即可
            request.setFileNames(new String[]{"************"});

            // 后台配置后查询获取
            request.setTemplateId("************");

            // 发起人填写控件
            FormField formField = new FormField();
            // 控制台配置模板时，于"指定签约区域"步骤，查看控件属性可以获取
            formField.setComponentName("************");
            formField.setComponentValue("************");

            // 传入需要填写的控件
            request.setFormFields(new FormField[]{formField});
            CreateDocumentResponse response = client.CreateDocument(request);

            System.out.println(new GsonBuilder().disableHtmlEscaping().create().toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
