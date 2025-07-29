package com.tencentcloudapi.integration.commonclient;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.CommonRequest;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import static org.junit.Assert.fail;

public class CommonClientTest {

    @Test
    public void testCall() {
        Credential cred =
                new Credential(
                        System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            client.call(
                    "DescribeInstances",
                    "{\"Limit\": 1, \"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}");
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testCallOctetStream() {
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

    @Test
    public void testCommonRequestIgnoreNullValue() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{" +
                "\"Filters\":[{\"Name\":\"zone\",\"NullKey\":null,\"Values\":[\"ap-guangzhou-1\"]}]" +
                ",\"NullField\": null" +
                "}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        CommonRequest cr = new CommonRequest(reqJson);
        try {
            client.commonRequest(cr, "DescribeInstances");
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testInt() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Limit\": 1}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            client.call("DescribeInstances", reqJson);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testObject() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            client.call("DescribeInstances", reqJson);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testObjectAndString() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        try {
            client.call("DescribeInstances", reqJson);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testFloat() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"FaceMatchThreshold\": 0.2,\"GroupIds\":[],\"Url\":\"\"}";
        CommonClient client = new CommonClient("iai", "2020-03-03", cred, "ap-guangzhou");
        try {
            client.call("SearchFaces", reqJson);
        } catch (TencentCloudSDKException e) {
            if (!e.getErrorCode().equals("InvalidParameterValue.UrlIllegal")) {
                fail(e.toString());
            }
        }
    }

    @Test
    public void testCommonRequestInt() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Limit\": 1}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        CommonRequest cr = new CommonRequest(reqJson);
        try {
            client.commonRequest(cr, "DescribeInstances");
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testCommonRequestObject() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        CommonRequest cr = new CommonRequest(reqJson);
        try {
            client.commonRequest(cr, "DescribeInstances");
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testCommonRequestObjectAndString() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"Filters\":[{\"Name\":\"zone\",\"Values\":[\"ap-guangzhou-1\"]}]}";
        CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
        CommonRequest cr = new CommonRequest(reqJson);
        try {
            client.commonRequest(cr, "DescribeInstances");
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void testCommonRequestFloat() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );
        String reqJson = "{\"FaceMatchThreshold\": 0.2,\"GroupIds\":[],\"Url\":\"\"}";
        CommonClient client = new CommonClient("iai", "2020-03-03", cred, "ap-guangzhou");
        CommonRequest cr = new CommonRequest(reqJson);
        try {
            client.commonRequest(cr, "SearchFaces");
        } catch (TencentCloudSDKException e) {
            if (!e.getErrorCode().equals("InvalidParameterValue.UrlIllegal")) {
                fail(e.toString());
            }
        }
    }
}
