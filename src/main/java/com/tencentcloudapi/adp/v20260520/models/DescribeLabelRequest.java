/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLabelRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>标签 ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>通用过滤</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>滚动加载游标的标准词 ID（首次请求传 0，后续传上一页最后一条的 TermId）</p>
    */
    @SerializedName("LastTermId")
    @Expose
    private String LastTermId;

    /**
    * <p>每次加载数量，默认 10，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>关键词搜索</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>标签 ID</p> 
     * @return LabelId <p>标签 ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签 ID</p>
     * @param LabelId <p>标签 ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>通用过滤</p> 
     * @return FilterList <p>通用过滤</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>通用过滤</p>
     * @param FilterList <p>通用过滤</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>滚动加载游标的标准词 ID（首次请求传 0，后续传上一页最后一条的 TermId）</p> 
     * @return LastTermId <p>滚动加载游标的标准词 ID（首次请求传 0，后续传上一页最后一条的 TermId）</p>
     */
    public String getLastTermId() {
        return this.LastTermId;
    }

    /**
     * Set <p>滚动加载游标的标准词 ID（首次请求传 0，后续传上一页最后一条的 TermId）</p>
     * @param LastTermId <p>滚动加载游标的标准词 ID（首次请求传 0，后续传上一页最后一条的 TermId）</p>
     */
    public void setLastTermId(String LastTermId) {
        this.LastTermId = LastTermId;
    }

    /**
     * Get <p>每次加载数量，默认 10，最大 100</p> 
     * @return Limit <p>每次加载数量，默认 10，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每次加载数量，默认 10，最大 100</p>
     * @param Limit <p>每次加载数量，默认 10，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>关键词搜索</p> 
     * @return Query <p>关键词搜索</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>关键词搜索</p>
     * @param Query <p>关键词搜索</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLabelRequest(DescribeLabelRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.LastTermId != null) {
            this.LastTermId = new String(source.LastTermId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "LastTermId", this.LastTermId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

