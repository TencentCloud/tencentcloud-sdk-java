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

public class ListAIWorkbenchSessionsRequest extends AbstractModel {

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
    * <p>按 Agent 筛选</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>会话 ID 列表筛选</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

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
     * Get <p>按 Agent 筛选</p> 
     * @return AgentId <p>按 Agent 筛选</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>按 Agent 筛选</p>
     * @param AgentId <p>按 Agent 筛选</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
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
     * Get <p>会话 ID 列表筛选</p> 
     * @return SessionIds <p>会话 ID 列表筛选</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>会话 ID 列表筛选</p>
     * @param SessionIds <p>会话 ID 列表筛选</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    public ListAIWorkbenchSessionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchSessionsRequest(ListAIWorkbenchSessionsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);

    }
}

