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

public class DescribeAppTriggerSummaryListRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>参数过滤列表</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>页码</p><p>取值范围：[1, 1000000]</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小</p><p>取值范围：[1, 100]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>模糊查询字符串</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>访客ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>参数过滤列表</p> 
     * @return FilterList <p>参数过滤列表</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>参数过滤列表</p>
     * @param FilterList <p>参数过滤列表</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>页码</p><p>取值范围：[1, 1000000]</p> 
     * @return PageNumber <p>页码</p><p>取值范围：[1, 1000000]</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p><p>取值范围：[1, 1000000]</p>
     * @param PageNumber <p>页码</p><p>取值范围：[1, 1000000]</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小</p><p>取值范围：[1, 100]</p> 
     * @return PageSize <p>每页大小</p><p>取值范围：[1, 100]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小</p><p>取值范围：[1, 100]</p>
     * @param PageSize <p>每页大小</p><p>取值范围：[1, 100]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>模糊查询字符串</p> 
     * @return Query <p>模糊查询字符串</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>模糊查询字符串</p>
     * @param Query <p>模糊查询字符串</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table> 
     * @return Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     * @param Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>访客ID</p> 
     * @return UserId <p>访客ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>访客ID</p>
     * @param UserId <p>访客ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeAppTriggerSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppTriggerSummaryListRequest(DescribeAppTriggerSummaryListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
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
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

