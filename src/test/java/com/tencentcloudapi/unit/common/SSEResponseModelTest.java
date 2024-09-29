package com.tencentcloudapi.unit.common;

import com.tencentcloudapi.common.SSEResponseModel;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import okhttp3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import java.util.*;

public class SSEResponseModelTest {
    @Test
    public void SSETest() throws Exception {
        SSEResponseModel.SSE sse = new SSEResponseModel.SSE();
        sse.Id = "123";
        sse.Event = "123";
        sse.Data = "2024";
        sse.Retry = 0l;
        assert sse.toString().equals("Id=123 Event=123 Retry=0 Data=2024");
    }

    @Test
    public void SSEIteratorTest() throws Exception {
        SSEModelTest sse = new SSEModelTest();
        Map<String, String> map = new HashMap<String, String>();
        Whitebox.invokeMethod(sse, "toMap", map, "prefix");

        Request request = new Request.Builder()
                .url("https://example.com")
                .build();
        // 创建一个MediaType实例，指定响应体的媒体类型为JSON
        MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");

        // 创建一个字符串作为响应体的内容
        String responseBodyContent = "{\"key\":\"value\"}";

        // 使用ResponseBody.create方法创建一个ResponseBody实例
        ResponseBody responseBody = ResponseBody.create(jsonMediaType, responseBodyContent);
        Response.Builder builder = new Response.Builder()
                .request(request) // 设置请求对象
                .protocol(Protocol.HTTP_2) // 设置协议版本，这里以HTTP/2为例
                .code(200) // 设置响应码
                .message("OK"); // 设置响应消息;
        Response response = builder.build();
        Whitebox.setInternalState(sse, "response", response);

        Iterator<SSEResponseModel.SSE> iterator;
        try {
            iterator = sse.iterator();
        } catch (RuntimeException e) {
            assert e.getMessage().contains("Response body should not be null");
        }
        builder.body(responseBody);
        response = builder.build();
        Whitebox.setInternalState(sse, "response", response);
        iterator = sse.iterator();

        iterator.hasNext();
        iterator.remove();
        try {
            iterator.next();
        }catch (Exception e){
            assert e.getMessage().contains("No line found");
        }
        Whitebox.invokeMethod(sse, "close");
    }
}

class SSEModelTest extends SSEResponseModel {
    @Override
    public String getRequestId() {
        return "";
    }

    @Override
    public void setRequestId(String requestId) {
    }
}