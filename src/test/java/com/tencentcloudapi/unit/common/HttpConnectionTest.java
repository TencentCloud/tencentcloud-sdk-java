package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.http.HttpConnection;
import okhttp3.Headers;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class HttpConnectionTest {
    @Test
    public void testGetRequest() throws IOException {
        HttpConnection httpConnection = new HttpConnection(1, 1, 1);
        try {
            httpConnection.getRequest("");
        } catch (TencentCloudSDKException e) {
            e.getMessage().contains("URL scheme 'http' or 'https' but no colon was found");
        }
    }

    @Test
    public void testGetRequestWithHeaders() throws IOException {
        HttpConnection httpConnection = new HttpConnection(1, 1, 1);
        Headers headers = new Headers.Builder().build();
        try {
            httpConnection.getRequest("", headers);
        } catch (TencentCloudSDKException e) {
            e.getMessage().contains("URL scheme 'http' or 'https' but no colon was found");
        }
    }

    @Test
    public void testPostRequest() throws IOException {
        HttpConnection httpConnection = new HttpConnection(1, 1, 1);
        try {
            httpConnection.postRequest("", "body");
        } catch (TencentCloudSDKException e) {
            e.getMessage().contains("URL scheme 'http' or 'https' but no colon was found");
        }
    }

    @Test
    public void testPostRequestWithHeaders() throws IOException, TencentCloudSDKException {
        HttpConnection httpConnection = new HttpConnection(1, 1, 1);
        Headers headers = new Headers.Builder()
                .add("Content-Type", "application/json") // 添加Content-Type头部字段
                .add("User-Agent", "OkHttp/3.12.12") // 添加User-Agent头部字段
                .build();
        httpConnection.postRequest("https://www.example.com", "body", headers);

        try {
            httpConnection.postRequest("", "body", headers);
        } catch (TencentCloudSDKException e) {
            e.getMessage().contains("URL scheme 'http' or 'https' but no colon was found");
        }
    }

    @Test
    public void testPostRequestWithArrayBody() throws IOException, TencentCloudSDKException {
        HttpConnection httpConnection = new HttpConnection(1, 1, 1);
        Headers headers = new Headers.Builder()
                .add("Content-Type", "application/json") // 添加Content-Type头部字段
                .add("User-Agent", "OkHttp/3.12.12") // 添加User-Agent头部字段
                .build();
        byte[] body = "body".getBytes();
        try {
            httpConnection.postRequest("", body, headers);
        } catch (TencentCloudSDKException e) {
            e.getMessage().contains("URL scheme 'http' or 'https' but no colon was found");
        }
    }
}
