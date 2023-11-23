package hunyuan.v20230901;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.SSEResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.hunyuan.v20230901.HunyuanClient;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatStdRequest;
import com.tencentcloudapi.hunyuan.v20230901.models.ChatStdResponse;
import com.tencentcloudapi.hunyuan.v20230901.models.Message;

public class ChatStd {
    public static void main(String[] args) {
        try {
            Credential cred = new Credential(
                    System.getenv("TENCENTCLOUD_SECRET_ID"),
                    System.getenv("TENCENTCLOUD_SECRET_KEY")
            );

            ClientProfile clientProfile = new ClientProfile();
            HunyuanClient client = new HunyuanClient(cred, "ap-guangzhou", clientProfile);

            ChatStdRequest req = new ChatStdRequest();
            Message msg = new Message();
            msg.setRole("user");
            msg.setContent("你好, 可以讲个笑话吗");
            req.setMessages(new Message[]{
                    msg
            });

            ChatStdResponse resp = client.ChatStd(req);

            for (SSEResponseModel.SSE e : resp) {
                System.out.println(e.Data);
            }
        } catch (TencentCloudSDKException e) {
            System.out.println(e);
        }
    }
}
