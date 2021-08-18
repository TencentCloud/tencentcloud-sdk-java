import java.util.HashMap;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class CommonClientCallOctetStream {
  public static void main(String[] args) {
    try {
      // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
      Credential cred = new Credential("secretId", "secretKey");
      // 实例化要请求产品的CommonClient对象,依次传入产品名、产品版本、Credential、地域
      CommonClient client = new CommonClient("cls", "2020-10-16", cred, "ap-guangzhou");

      // 调用client对象的call方法，传入接口名、请求入参（http头部）和二进制包体向接口发起调用
      HashMap<String, String> headers = new HashMap<String, String>();
      headers.put("X-CLS-TopicId", "e621fdb8-16f4-41cf-bc73-5aead0b75a03");
      headers.put("X-CLS-HashKey", "0fffffffffffffffffffffffffffffff");
      headers.put("X-CLS-CompressType", "");
      // 实际内容可能需要从外部文件加载
      byte[] body = new byte[1024];
      String resp = client.callOctetStream("UploadLog", headers, body);

      // 输出返回的字符串结果
      System.out.println(resp);
    } catch (TencentCloudSDKException e) {
      System.out.println(e.toString());
    }
  }
}
