import java.nio.file.Files;
import java.nio.file.Paths;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cr.v20180321.CrClient;
import com.tencentcloudapi.cr.v20180321.models.UploadDataFileRequest;
import com.tencentcloudapi.cr.v20180321.models.UploadDataFileResponse;

public class UploadDataFile {
    public static void main(String[] args) {
        try {
            // 为了保护密钥安全，建议将密钥设置在环境变量中或者配置文件中。
            // 硬编码密钥到代码中有可能随代码泄露而暴露，有安全隐患，并不推荐。
            // Credential cred = new Credential("SecretId", "SecretKey");
            Credential cred = new Credential(System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
            HttpProfile httpProfile = new HttpProfile();
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            CrClient crclient = new CrClient(cred, "ap-guangzhou", clientProfile);

            UploadDataFileRequest udfreq = new UploadDataFileRequest();
            udfreq.setModule("Data");
            udfreq.setOperation("Upload");
            udfreq.setFileName("中文文件名unicodeFileName.xlsx");
            udfreq.setFile(Files.readAllBytes(Paths.get("E:\\data.xlsx")));
            UploadDataFileResponse udfresp = crclient.UploadDataFile(udfreq);

            System.out.println(UploadDataFileResponse.toJsonString(udfresp));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
