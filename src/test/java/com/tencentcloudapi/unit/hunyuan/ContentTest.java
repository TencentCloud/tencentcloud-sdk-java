package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.Content;
import com.tencentcloudapi.hunyuan.v20230901.models.ImageUrl;
import org.junit.Test;

import java.util.HashMap;

public class ContentTest {
    @Test
    public void testContent() {
        Content content = new Content();
        content.setType("test");
        assert content.getType().equals("test");

        content.setText("test");
        assert content.getText().equals("test");

        content.setImageUrl(new ImageUrl());
        content.getImageUrl().setUrl("test");
        assert content.getImageUrl().getUrl().equals("test");

        new Content(content);
        content.toMap(new HashMap<>(), "");
    }
}
