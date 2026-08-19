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

public class DescribeBaselineAggregatedItemListRequest extends AbstractModel {

    /**
    * <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long [] PolicyID;

    /**
    * <p>基线系统父分类 ID。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>基线子分类 ID。</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件。支持的 Name：ResultStatus（结果状态 PASS/NOT_PASS/CHECKING/CHECK_FAILED/NOT_INVOLVED）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询起始偏移量，从 0 开始。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段名，由具体接口定义可选字段。</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>基线策略 ID 列表（可同时传多条做联合统计）。</p> 
     * @return PolicyID <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     * @param PolicyID <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     */
    public void setPolicyID(Long [] PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>基线系统父分类 ID。</p> 
     * @return ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>基线系统父分类 ID。</p>
     * @param ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul> 
     * @return CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     * @param CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>基线子分类 ID。</p> 
     * @return CategoryID <p>基线子分类 ID。</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>基线子分类 ID。</p>
     * @param CategoryID <p>基线子分类 ID。</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
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
     * Get <p>通用过滤条件。支持的 Name：ResultStatus（结果状态 PASS/NOT_PASS/CHECKING/CHECK_FAILED/NOT_INVOLVED）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p> 
     * @return Filters <p>通用过滤条件。支持的 Name：ResultStatus（结果状态 PASS/NOT_PASS/CHECKING/CHECK_FAILED/NOT_INVOLVED）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件。支持的 Name：ResultStatus（结果状态 PASS/NOT_PASS/CHECKING/CHECK_FAILED/NOT_INVOLVED）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     * @param Filters <p>通用过滤条件。支持的 Name：ResultStatus（结果状态 PASS/NOT_PASS/CHECKING/CHECK_FAILED/NOT_INVOLVED）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p> 
     * @return Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     * @param Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询起始偏移量，从 0 开始。</p> 
     * @return Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询起始偏移量，从 0 开始。</p>
     * @param Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p> 
     * @return Order <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     * @param Order <p>排序方向，取值 asc（升序）或 desc（降序），默认 desc。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段名，由具体接口定义可选字段。</p> 
     * @return By <p>排序字段名，由具体接口定义可选字段。</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段名，由具体接口定义可选字段。</p>
     * @param By <p>排序字段名，由具体接口定义可选字段。</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineAggregatedItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineAggregatedItemListRequest(DescribeBaselineAggregatedItemListRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

