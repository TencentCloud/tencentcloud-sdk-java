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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRejectedQuestionRequest extends AbstractModel {

    /**
    * <p>应用ID, 获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * <p>页码（必须大于0）</p><p>默认值：1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量（取值范围1-200）</p><p>默认值：15</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>查询内容</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>过滤条件：<br>生效： EnableScope: 1,2,3,4</p>
    */
    @SerializedName("Filters")
    @Expose
    private FilterItem [] Filters;

    /**
     * Get <p>应用ID, 获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p> 
     * @return BotBizId <p>应用ID, 获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set <p>应用ID, 获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     * @param BotBizId <p>应用ID, 获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get <p>页码（必须大于0）</p><p>默认值：1</p> 
     * @return PageNumber <p>页码（必须大于0）</p><p>默认值：1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码（必须大于0）</p><p>默认值：1</p>
     * @param PageNumber <p>页码（必须大于0）</p><p>默认值：1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量（取值范围1-200）</p><p>默认值：15</p> 
     * @return PageSize <p>每页数量（取值范围1-200）</p><p>默认值：15</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量（取值范围1-200）</p><p>默认值：15</p>
     * @param PageSize <p>每页数量（取值范围1-200）</p><p>默认值：15</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>查询内容</p> 
     * @return Query <p>查询内容</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询内容</p>
     * @param Query <p>查询内容</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>过滤条件：<br>生效： EnableScope: 1,2,3,4</p> 
     * @return Filters <p>过滤条件：<br>生效： EnableScope: 1,2,3,4</p>
     */
    public FilterItem [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件：<br>生效： EnableScope: 1,2,3,4</p>
     * @param Filters <p>过滤条件：<br>生效： EnableScope: 1,2,3,4</p>
     */
    public void setFilters(FilterItem [] Filters) {
        this.Filters = Filters;
    }

    public ListRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRejectedQuestionRequest(ListRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Filters != null) {
            this.Filters = new FilterItem[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterItem(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

