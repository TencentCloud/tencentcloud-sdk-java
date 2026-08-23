package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.QueryHunyuanImageJobRequest;
import org.junit.Test;

import java.util.HashMap;

public class QueryHunyuanImageJobRequestTest {
    @Test
    public void testQueryHunyuanImageJobRequest() {
        QueryHunyuanImageJobRequest request = new QueryHunyuanImageJobRequest();
        request.setJobId("jobId");
        assert request.getJobId().equals("jobId");

        new QueryHunyuanImageJobRequest(request);
        request.toMap(new HashMap<>(), "");
    }
}
