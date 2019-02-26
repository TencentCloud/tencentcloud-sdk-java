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
            Credential cred = new Credential("secretId", "secretKey");
            HttpProfile httpProfile = new HttpProfile();
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            CrClient crclient = new CrClient(cred, "ap-guangzhou", clientProfile);

            UploadDataFileRequest udfreq = new UploadDataFileRequest();
            udfreq.setModule("Data");
            udfreq.setOperation("Upload");
            udfreq.setFileName("中文文件名unicodeFileName.xlsx");
            udfreq.setFile(Files.readAllBytes(Paths.get("E:\\data.xlsx"));
            UploadDataFileResponse udfresp = crclient.UploadDataFile(udfreq);

            System.out.println(UploadDataFileResponse.toJsonString(udfresp));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
