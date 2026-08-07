package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.SubmitHunyuanImageJobResponse;
import org.junit.Test;

import java.util.HashMap;

public class SubmitHunyuanImageJobResponseTest {
    @Test
    public void testSubmitHunyuanImageJobResponse() {
        SubmitHunyuanImageJobResponse response = new SubmitHunyuanImageJobResponse();
        response.setRequestId("requestId");
        assert response.getRequestId().equals("requestId");

        response.setJobId("jobId");
        assert response.getJobId().equals("jobId");
        new SubmitHunyuanImageJobResponse(response);
        response.toMap(new HashMap<>(), "prefix");
    }
}
