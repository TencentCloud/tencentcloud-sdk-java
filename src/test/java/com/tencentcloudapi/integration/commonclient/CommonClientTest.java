package com.tencentcloudapi.integration.commonclient;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class CommonClientTest {

  @Test
  public void testJson() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
    try {
      String resp =
          client.call(
              "DescribeInstances",
              "{\"Filters\":" + "[{\"Name\":\"zone\"," + "\"Values\":[\"ap-guangzhou-1\"]}]" + "}");
    } catch (Exception e) {
      fail(e.toString());
    }
  }

  @Test
  public void testOctetStream() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    CommonClient client = new CommonClient("cls", "2020-10-16", cred, "ap-guangzhou");
    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put("X-CLS-TopicId", "e621fdb8-16f4-41cf-bc73-5aead0b75a03");
    headers.put("X-CLS-HashKey", "0fffffffffffffffffffffffffffffff");
    headers.put("X-CLS-CompressType", "");
    String filePath =
        System.getProperty("user.dir")
            + File.separator
            + "src"
            + File.separator
            + "test"
            + File.separator
            + "java"
            + File.separator
            + "com"
            + File.separator
            + "tencentcloudapi"
            + File.separator
            + "integration"
            + File.separator
            + "commonclient"
            + File.separator
            + "binary.data";
    try {
      byte[] body = Files.readAllBytes(Paths.get(filePath));
      String resp = client.callOctetStream("UploadLog", headers, body);
    } catch (TencentCloudSDKException e) {
      Assert.assertTrue(e.toString().contains("ResourceNotFound.TopicNotExist"));
    } catch (Exception e) {
      fail(e.toString());
    }
  }
}
