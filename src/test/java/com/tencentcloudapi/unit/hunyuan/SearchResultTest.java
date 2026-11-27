package com.tencentcloudapi.unit.hunyuan;

import com.tencentcloudapi.hunyuan.v20230901.models.SearchResult;
import org.junit.Test;

import java.util.HashMap;

public class SearchResultTest {
    @Test
    public void testSearchResult() {
        SearchResult searchResult = new SearchResult();
        searchResult.setIndex(1L);
        assert searchResult.getIndex() == 1L;

        searchResult.setTitle("title");
        assert searchResult.getTitle().equals("title");

        searchResult.setUrl("url");
        assert searchResult.getUrl().equals("url");

        new SearchResult(searchResult);
        searchResult.toMap(new HashMap<>(), "prefix");
    }
}
