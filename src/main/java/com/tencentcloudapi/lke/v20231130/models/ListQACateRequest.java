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

public class ListQACateRequest extends AbstractModel {

    /**
    * 应用ID
若要操作共享知识库，传KnowledgeBizId
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 分类查询类型：0-全量查询整棵标签树，1-根据父节点BizId分页查询子节点，2-关键词检索所有匹配的分类链路
    */
    @SerializedName("QueryType")
    @Expose
    private Long QueryType;

    /**
    * QueryType=1时，父节点分类ID
    */
    @SerializedName("ParentCateBizId")
    @Expose
    private String ParentCateBizId;

    /**
    * QueryType=1时，页码（从1开始）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量（默认10）
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * QueryType=2时，搜索内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 应用ID
若要操作共享知识库，传KnowledgeBizId 
     * @return BotBizId 应用ID
若要操作共享知识库，传KnowledgeBizId
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
若要操作共享知识库，传KnowledgeBizId
     * @param BotBizId 应用ID
若要操作共享知识库，传KnowledgeBizId
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 分类查询类型：0-全量查询整棵标签树，1-根据父节点BizId分页查询子节点，2-关键词检索所有匹配的分类链路 
     * @return QueryType 分类查询类型：0-全量查询整棵标签树，1-根据父节点BizId分页查询子节点，2-关键词检索所有匹配的分类链路
     */
    public Long getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 分类查询类型：0-全量查询整棵标签树，1-根据父节点BizId分页查询子节点，2-关键词检索所有匹配的分类链路
     * @param QueryType 分类查询类型：0-全量查询整棵标签树，1-根据父节点BizId分页查询子节点，2-关键词检索所有匹配的分类链路
     */
    public void setQueryType(Long QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get QueryType=1时，父节点分类ID 
     * @return ParentCateBizId QueryType=1时，父节点分类ID
     */
    public String getParentCateBizId() {
        return this.ParentCateBizId;
    }

    /**
     * Set QueryType=1时，父节点分类ID
     * @param ParentCateBizId QueryType=1时，父节点分类ID
     */
    public void setParentCateBizId(String ParentCateBizId) {
        this.ParentCateBizId = ParentCateBizId;
    }

    /**
     * Get QueryType=1时，页码（从1开始） 
     * @return PageNumber QueryType=1时，页码（从1开始）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set QueryType=1时，页码（从1开始）
     * @param PageNumber QueryType=1时，页码（从1开始）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量（默认10） 
     * @return PageSize 每页数量（默认10）
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量（默认10）
     * @param PageSize 每页数量（默认10）
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get QueryType=2时，搜索内容 
     * @return Query QueryType=2时，搜索内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set QueryType=2时，搜索内容
     * @param Query QueryType=2时，搜索内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public ListQACateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQACateRequest(ListQACateRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.QueryType != null) {
            this.QueryType = new Long(source.QueryType);
        }
        if (source.ParentCateBizId != null) {
            this.ParentCateBizId = new String(source.ParentCateBizId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "ParentCateBizId", this.ParentCateBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

