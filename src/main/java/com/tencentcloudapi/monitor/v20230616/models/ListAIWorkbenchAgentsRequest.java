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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchAgentsRequest extends AbstractModel {

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>状态筛选</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>分类筛选</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>来源筛选</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Agent ID 列表筛选</p>
    */
    @SerializedName("AgentIds")
    @Expose
    private String [] AgentIds;

    /**
     * Get <p>每页数量</p> 
     * @return PerPage <p>每页数量</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>每页数量</p>
     * @param PerPage <p>每页数量</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNo <p>页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p>
     * @param PageNo <p>页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>状态筛选</p> 
     * @return Status <p>状态筛选</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态筛选</p>
     * @param Status <p>状态筛选</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>分类筛选</p> 
     * @return Category <p>分类筛选</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>分类筛选</p>
     * @param Category <p>分类筛选</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>搜索关键词</p> 
     * @return Keyword <p>搜索关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键词</p>
     * @param Keyword <p>搜索关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>来源筛选</p> 
     * @return Source <p>来源筛选</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源筛选</p>
     * @param Source <p>来源筛选</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Agent ID 列表筛选</p> 
     * @return AgentIds <p>Agent ID 列表筛选</p>
     */
    public String [] getAgentIds() {
        return this.AgentIds;
    }

    /**
     * Set <p>Agent ID 列表筛选</p>
     * @param AgentIds <p>Agent ID 列表筛选</p>
     */
    public void setAgentIds(String [] AgentIds) {
        this.AgentIds = AgentIds;
    }

    public ListAIWorkbenchAgentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchAgentsRequest(ListAIWorkbenchAgentsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AgentIds != null) {
            this.AgentIds = new String[source.AgentIds.length];
            for (int i = 0; i < source.AgentIds.length; i++) {
                this.AgentIds[i] = new String(source.AgentIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "AgentIds.", this.AgentIds);

    }
}

