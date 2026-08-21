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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselinePolicyItemListRequest extends AbstractModel {

    /**
    * <p>基线策略ID</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>基线父分类 ID，用于筛选指定父分类下的检测项。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>分页查询每页返回条数，默认值 10，最大值 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询偏移量，默认值 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>通用过滤条件列表。支持的过滤字段：</p><ul><li>CategoryID：子分类 ID，精确匹配</li><li>Name：检测项名称，模糊匹配</li><li>RiskLevel：风险等级，精确匹配。取值：LOW、MEDIUM、HIGH、CRITICAL</li><li>SupportCustomValue：是否支持编辑，精确匹配。取值：true、false</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>基线策略ID</p> 
     * @return PolicyID <p>基线策略ID</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>基线策略ID</p>
     * @param PolicyID <p>基线策略ID</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>基线父分类 ID，用于筛选指定父分类下的检测项。</p> 
     * @return ParentCategoryID <p>基线父分类 ID，用于筛选指定父分类下的检测项。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>基线父分类 ID，用于筛选指定父分类下的检测项。</p>
     * @param ParentCategoryID <p>基线父分类 ID，用于筛选指定父分类下的检测项。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>分页查询每页返回条数，默认值 10，最大值 100。</p> 
     * @return Limit <p>分页查询每页返回条数，默认值 10，最大值 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询每页返回条数，默认值 10，最大值 100。</p>
     * @param Limit <p>分页查询每页返回条数，默认值 10，最大值 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询偏移量，默认值 0。</p> 
     * @return Offset <p>分页查询偏移量，默认值 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量，默认值 0。</p>
     * @param Offset <p>分页查询偏移量，默认值 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>通用过滤条件列表。支持的过滤字段：</p><ul><li>CategoryID：子分类 ID，精确匹配</li><li>Name：检测项名称，模糊匹配</li><li>RiskLevel：风险等级，精确匹配。取值：LOW、MEDIUM、HIGH、CRITICAL</li><li>SupportCustomValue：是否支持编辑，精确匹配。取值：true、false</li></ul> 
     * @return Filters <p>通用过滤条件列表。支持的过滤字段：</p><ul><li>CategoryID：子分类 ID，精确匹配</li><li>Name：检测项名称，模糊匹配</li><li>RiskLevel：风险等级，精确匹配。取值：LOW、MEDIUM、HIGH、CRITICAL</li><li>SupportCustomValue：是否支持编辑，精确匹配。取值：true、false</li></ul>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件列表。支持的过滤字段：</p><ul><li>CategoryID：子分类 ID，精确匹配</li><li>Name：检测项名称，模糊匹配</li><li>RiskLevel：风险等级，精确匹配。取值：LOW、MEDIUM、HIGH、CRITICAL</li><li>SupportCustomValue：是否支持编辑，精确匹配。取值：true、false</li></ul>
     * @param Filters <p>通用过滤条件列表。支持的过滤字段：</p><ul><li>CategoryID：子分类 ID，精确匹配</li><li>Name：检测项名称，模糊匹配</li><li>RiskLevel：风险等级，精确匹配。取值：LOW、MEDIUM、HIGH、CRITICAL</li><li>SupportCustomValue：是否支持编辑，精确匹配。取值：true、false</li></ul>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBaselinePolicyItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselinePolicyItemListRequest(DescribeBaselinePolicyItemListRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

