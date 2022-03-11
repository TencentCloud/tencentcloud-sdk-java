package ess.v20201111;

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
            // 管理员用户id或者员工用户id
            userInfo.setUserId(OperatorId);
            // 请求客户端在公网的ip地址
            userInfo.setClientIp("************");
            request.setOperator(userInfo);

            // 由CreateFlow返回
            request.setFlowId("************");

            // 传入自定义文件名即可
            request.setFileNames(new String[]{"************"});

            // 后台配置后查询获取
            request.setTemplateId("************");

            // 普通控件
            FormField formField = new FormField();
            // 在模板配置拖入控件的界面可以查询到（ComponentName或者ComponentId选一填写，建议填写ComponentName）
            formField.setComponentName("************");
            formField.setComponentValue("************");

            // 传入需要填写的控件
            request.setFormFields(new FormField[]{formField});
            CreateDocumentResponse response = client.CreateDocument(request);

            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
