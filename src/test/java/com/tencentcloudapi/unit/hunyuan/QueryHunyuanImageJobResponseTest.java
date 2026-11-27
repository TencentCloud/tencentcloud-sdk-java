package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.QueryHunyuanImageJobResponse;
import org.junit.Test;

import java.util.HashMap;

public class QueryHunyuanImageJobResponseTest {
    @Test
    public void testQueryHunyuanImageJobResponse() {
        QueryHunyuanImageJobResponse response = new QueryHunyuanImageJobResponse();
        response.setJobStatusCode("1");
        assert response.getJobStatusCode().equals("1");

        response.setJobStatusMsg("排队中");
        assert response.getJobStatusMsg().equals("排队中");

        response.setJobErrorCode("1");
        assert response.getJobErrorCode().equals("1");

        response.setJobErrorMsg("处理失败");
        assert response.getJobErrorMsg().equals("处理失败");

        response.setResultImage(new String[]{"1"});
        assert response.getResultImage()[0].equals("1");

        response.setResultDetails(new String[]{"1"});
        assert response.getResultDetails()[0].equals("1");

        response.setRevisedPrompt(new String[]{"1"});
        assert response.getRevisedPrompt()[0].equals("1");

        response.setRequestId("requestId");
        assert response.getRequestId().equals("requestId");

        new QueryHunyuanImageJobResponse(response);
        response.toMap(new HashMap<>(), "");
    }
}
