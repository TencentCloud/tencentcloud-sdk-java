/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSearchRequest extends AbstractModel {

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 搜索的网页数量，默认20
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 指定域名，gov.cn 可匹配 *.gov.cn的域名。
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 是否获取返回网页全文，默认 false。
    */
    @SerializedName("FetchContent")
    @Expose
    private Boolean FetchContent;

    /**
    * 域名白名单，在不指定 Site 时，只保存匹配白名单域名的网页。
    */
    @SerializedName("WhiteSites")
    @Expose
    private String [] WhiteSites;

    /**
    * 域名黑名单，在不指定 Site 和白名单时，过滤黑名单中的域名。
    */
    @SerializedName("BlackSites")
    @Expose
    private String [] BlackSites;

    /**
    * 秒级时间戳，搜索网页的开始时间，默认不限制开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 秒级时间戳，搜索网页的结束时间，默认为现在。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 指定搜索引擎，可选混合搜索 mixed，或 bing, baidu, sogou, 默认为 sogou
    */
    @SerializedName("SearchEngine")
    @Expose
    private String SearchEngine;

    /**
     * Get 查询 
     * @return Query 查询
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询
     * @param Query 查询
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 搜索的网页数量，默认20 
     * @return Count 搜索的网页数量，默认20
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 搜索的网页数量，默认20
     * @param Count 搜索的网页数量，默认20
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 指定域名，gov.cn 可匹配 *.gov.cn的域名。 
     * @return Site 指定域名，gov.cn 可匹配 *.gov.cn的域名。
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 指定域名，gov.cn 可匹配 *.gov.cn的域名。
     * @param Site 指定域名，gov.cn 可匹配 *.gov.cn的域名。
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 是否获取返回网页全文，默认 false。 
     * @return FetchContent 是否获取返回网页全文，默认 false。
     */
    public Boolean getFetchContent() {
        return this.FetchContent;
    }

    /**
     * Set 是否获取返回网页全文，默认 false。
     * @param FetchContent 是否获取返回网页全文，默认 false。
     */
    public void setFetchContent(Boolean FetchContent) {
        this.FetchContent = FetchContent;
    }

    /**
     * Get 域名白名单，在不指定 Site 时，只保存匹配白名单域名的网页。 
     * @return WhiteSites 域名白名单，在不指定 Site 时，只保存匹配白名单域名的网页。
     */
    public String [] getWhiteSites() {
        return this.WhiteSites;
    }

    /**
     * Set 域名白名单，在不指定 Site 时，只保存匹配白名单域名的网页。
     * @param WhiteSites 域名白名单，在不指定 Site 时，只保存匹配白名单域名的网页。
     */
    public void setWhiteSites(String [] WhiteSites) {
        this.WhiteSites = WhiteSites;
    }

    /**
     * Get 域名黑名单，在不指定 Site 和白名单时，过滤黑名单中的域名。 
     * @return BlackSites 域名黑名单，在不指定 Site 和白名单时，过滤黑名单中的域名。
     */
    public String [] getBlackSites() {
        return this.BlackSites;
    }

    /**
     * Set 域名黑名单，在不指定 Site 和白名单时，过滤黑名单中的域名。
     * @param BlackSites 域名黑名单，在不指定 Site 和白名单时，过滤黑名单中的域名。
     */
    public void setBlackSites(String [] BlackSites) {
        this.BlackSites = BlackSites;
    }

    /**
     * Get 秒级时间戳，搜索网页的开始时间，默认不限制开始时间。 
     * @return StartTime 秒级时间戳，搜索网页的开始时间，默认不限制开始时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 秒级时间戳，搜索网页的开始时间，默认不限制开始时间。
     * @param StartTime 秒级时间戳，搜索网页的开始时间，默认不限制开始时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 秒级时间戳，搜索网页的结束时间，默认为现在。 
     * @return EndTime 秒级时间戳，搜索网页的结束时间，默认为现在。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 秒级时间戳，搜索网页的结束时间，默认为现在。
     * @param EndTime 秒级时间戳，搜索网页的结束时间，默认为现在。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定搜索引擎，可选混合搜索 mixed，或 bing, baidu, sogou, 默认为 sogou 
     * @return SearchEngine 指定搜索引擎，可选混合搜索 mixed，或 bing, baidu, sogou, 默认为 sogou
     */
    public String getSearchEngine() {
        return this.SearchEngine;
    }

    /**
     * Set 指定搜索引擎，可选混合搜索 mixed，或 bing, baidu, sogou, 默认为 sogou
     * @param SearchEngine 指定搜索引擎，可选混合搜索 mixed，或 bing, baidu, sogou, 默认为 sogou
     */
    public void setSearchEngine(String SearchEngine) {
        this.SearchEngine = SearchEngine;
    }

    public WebSearchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSearchRequest(WebSearchRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Site != null) {
            this.Site = new String(source.Site);
        }
        if (source.FetchContent != null) {
            this.FetchContent = new Boolean(source.FetchContent);
        }
        if (source.WhiteSites != null) {
            this.WhiteSites = new String[source.WhiteSites.length];
            for (int i = 0; i < source.WhiteSites.length; i++) {
                this.WhiteSites[i] = new String(source.WhiteSites[i]);
            }
        }
        if (source.BlackSites != null) {
            this.BlackSites = new String[source.BlackSites.length];
            for (int i = 0; i < source.BlackSites.length; i++) {
                this.BlackSites[i] = new String(source.BlackSites[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SearchEngine != null) {
            this.SearchEngine = new String(source.SearchEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Site", this.Site);
        this.setParamSimple(map, prefix + "FetchContent", this.FetchContent);
        this.setParamArraySimple(map, prefix + "WhiteSites.", this.WhiteSites);
        this.setParamArraySimple(map, prefix + "BlackSites.", this.BlackSites);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SearchEngine", this.SearchEngine);

    }
}

