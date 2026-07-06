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

public class DescribeAgentSummaryListRequest extends AbstractModel {

    /**
    * <p>查询范围；0-单应用查询；1-跨应用查询</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>应用Id，Scope=0 时为目标应用ID（必填）；scope=1 时无需填写</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>过滤条件（name: "SearchWord", "SpaceId", "AgentSource", "AppId"）</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>每页数目</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get <p>查询范围；0-单应用查询；1-跨应用查询</p> 
     * @return Scope <p>查询范围；0-单应用查询；1-跨应用查询</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>查询范围；0-单应用查询；1-跨应用查询</p>
     * @param Scope <p>查询范围；0-单应用查询；1-跨应用查询</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>应用Id，Scope=0 时为目标应用ID（必填）；scope=1 时无需填写</p> 
     * @return AppId <p>应用Id，Scope=0 时为目标应用ID（必填）；scope=1 时无需填写</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用Id，Scope=0 时为目标应用ID（必填）；scope=1 时无需填写</p>
     * @param AppId <p>应用Id，Scope=0 时为目标应用ID（必填）；scope=1 时无需填写</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>过滤条件（name: "SearchWord", "SpaceId", "AgentSource", "AppId"）</p> 
     * @return FilterList <p>过滤条件（name: "SearchWord", "SpaceId", "AgentSource", "AppId"）</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>过滤条件（name: "SearchWord", "SpaceId", "AgentSource", "AppId"）</p>
     * @param FilterList <p>过滤条件（name: "SearchWord", "SpaceId", "AgentSource", "AppId"）</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>每页数目</p> 
     * @return PageSize <p>每页数目</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p>
     * @param PageSize <p>每页数目</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeAgentSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentSummaryListRequest(DescribeAgentSummaryListRequest source) {
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

