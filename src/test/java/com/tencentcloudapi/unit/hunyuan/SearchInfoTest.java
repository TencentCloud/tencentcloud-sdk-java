package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.SearchInfo;
import com.tencentcloudapi.hunyuan.v20230901.models.SearchResult;
import org.junit.Test;

import java.util.HashMap;

public class SearchInfoTest {
    @Test
    public void testSearchInfo() {
        SearchInfo searchInfo = new SearchInfo();
        searchInfo.setSearchResults(new SearchResult[]{new SearchResult(), new SearchResult()});
        assert searchInfo.getSearchResults().length == 2;

        new SearchInfo(searchInfo);
        searchInfo.toMap(new HashMap<>(), "");
    }
}
