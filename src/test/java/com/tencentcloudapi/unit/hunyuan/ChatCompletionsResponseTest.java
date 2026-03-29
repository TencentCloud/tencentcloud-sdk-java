package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.ChatCompletionsResponse;
import com.tencentcloudapi.hunyuan.v20230901.models.Choice;
import com.tencentcloudapi.hunyuan.v20230901.models.ErrorMsg;
import org.junit.Test;

import java.util.HashMap;

public class ChatCompletionsResponseTest {
    @Test
    public void testChatCompletionsResponse() {
        ChatCompletionsResponse resp = new ChatCompletionsResponse();
        resp.setCreated(1L);
        assert resp.getCreated() == 1L;

        resp.setUsage(null);
        assert resp.getUsage() == null;

        resp.setNote("note");
        assert resp.getNote() == "note";

        resp.setId("id");
        assert resp.getId() == "id";

        resp.setChoices(new Choice[]{new Choice()});
        assert resp.getChoices().length == 1;

        resp.setErrorMsg(null);
        assert resp.getErrorMsg() == null;

        resp.setModerationLevel("moderationLevel");
        assert resp.getModerationLevel() == "moderationLevel";

        resp.setSearchInfo(null);
        assert resp.getSearchInfo() == null;

        resp.setRequestId("requestId");
        assert resp.getRequestId() == "requestId";

        new ChatCompletionsResponse(resp);

        resp.toMap(new HashMap<String, String>(), "");
    }
}
