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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnterpriseSecurityGroupRuleListRequest extends AbstractModel {

    /**
    * 分页每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页当前页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 启用状态 1启用 0 未启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 规则下发方式筛选  1 新规则和延迟下发  2  仅看新规则  
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
    * 查询条件
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 查询条件新
    */
    @SerializedName("SearchFilters")
    @Expose
    private CommonFilter [] SearchFilters;

    /**
     * Get 分页每页数量 
     * @return Limit 分页每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数量
     * @param Limit 分页每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页当前页 
     * @return Offset 分页当前页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页当前页
     * @param Offset 分页当前页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 启用状态 1启用 0 未启用 
     * @return Status 启用状态 1启用 0 未启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态 1启用 0 未启用
     * @param Status 启用状态 1启用 0 未启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域 
     * @return Area 地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域
     * @param Area 地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 规则下发方式筛选  1 新规则和延迟下发  2  仅看新规则   
     * @return Filter 规则下发方式筛选  1 新规则和延迟下发  2  仅看新规则  
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 规则下发方式筛选  1 新规则和延迟下发  2  仅看新规则  
     * @param Filter 规则下发方式筛选  1 新规则和延迟下发  2  仅看新规则  
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 查询条件 
     * @return SearchValue 查询条件
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 查询条件
     * @param SearchValue 查询条件
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 查询条件新 
     * @return SearchFilters 查询条件新
     */
    public CommonFilter [] getSearchFilters() {
        return this.SearchFilters;
    }

    /**
     * Set 查询条件新
     * @param SearchFilters 查询条件新
     */
    public void setSearchFilters(CommonFilter [] SearchFilters) {
        this.SearchFilters = SearchFilters;
    }

    public DescribeEnterpriseSecurityGroupRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleListRequest(DescribeEnterpriseSecurityGroupRuleListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.SearchFilters != null) {
            this.SearchFilters = new CommonFilter[source.SearchFilters.length];
            for (int i = 0; i < source.SearchFilters.length; i++) {
                this.SearchFilters[i] = new CommonFilter(source.SearchFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamArrayObj(map, prefix + "SearchFilters.", this.SearchFilters);

    }
}

