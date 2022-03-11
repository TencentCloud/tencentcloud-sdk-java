package ess.v20201111;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.essbasic.v20201222.EssbasicClient;
import com.tencentcloudapi.essbasic.v20201222.models.Caller;
import com.tencentcloudapi.essbasic.v20201222.models.UploadFile;
import com.tencentcloudapi.essbasic.v20201222.models.UploadFilesRequest;
import com.tencentcloudapi.essbasic.v20201222.models.UploadFilesResponse;
import sun.misc.BASE64Encoder;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import static ess.v20201111.ClientConfig.*;

public class UploadFiles {

    public static void main(String[] args) {

        try {
            ClientProfile cp = new ClientProfile();
            HttpProfile hp = new HttpProfile();
            hp.setEndpoint(FileEndPoint);
            cp.setHttpProfile(hp);
            EssbasicClient client = new EssbasicClient(new Credential(Ak, Sk), "ap-guangzhou", cp);

            UploadFilesRequest request = new UploadFilesRequest();

            Caller caller = new Caller();
            caller.setApplicationId(Appid);
            caller.setOperatorId(OperatorId);
            request.setCaller(caller);
            request.setBusinessType("FLOW");

            UploadFile[] fileInfos = new UploadFile[1];
            request.setFileInfos(fileInfos);
            UploadFile file = new UploadFile();
            fileInfos[0] = file;
            file.setFileName("************");
            file.setFileBody(getFileBody());
            request.setCoverRect(false);

            UploadFilesResponse response = client.UploadFiles(request);
            System.out.println(client.gson.toJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFileBody() throws Exception {
        java.io.File file = new File("/***/***.pdf");
        FileInputStream fis = new FileInputStream(file);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        byte[] fileBytes = baos.toByteArray();

        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(fileBytes);
    }
}
