package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class StreamTest {
    private static class JsonModel extends AbstractModel {
        @Override
        protected void toMap(HashMap<String, String> map, String prefix) {
        }
    }

    private static class SSEModel extends SSEResponseModel {
        @Override
        public String getRequestId() {
            return "";
        }

        @Override
        public void setRequestId(String requestId) {
        }
    }

    @Test
    public void testIsStream() {
        JsonModel jsonModel = new JsonModel();
        Assert.assertFalse(jsonModel.isStream());

        SSEModel sseModel = new SSEModel();
        Assert.assertFalse(sseModel.isStream());

        Request mockReq = new Request.Builder().url("https://mock").build();
        Response mockResp = new Response.Builder().request(mockReq).
                protocol(Protocol.HTTP_1_1).code(200).message("").build();
        sseModel.setResponse(mockResp);
        Assert.assertTrue(sseModel.isStream());
    }
}
