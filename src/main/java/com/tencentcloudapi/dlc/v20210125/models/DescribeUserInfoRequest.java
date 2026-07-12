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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoRequest extends AbstractModel {

    /**
    * <p>用户Id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>查询的过滤条件。</p><p>当Type为Group时，支持Key为workgroup-name的模糊搜索；</p><p>当Type为DataAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>data-name：库表的模糊搜索。</p><p>当Type为EngineAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>engine-name：库表的模糊搜索。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段。</p><p>当Type为Group时，支持create-time、group-name</p><p>当Type为DataAuth时，支持create-time</p><p>当Type为EngineAuth时，支持create-time</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式，desc表示正序，asc表示反序， 默认为asc</p>
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * <p>返回数量，默认20，最大值100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * <p>TF 资源 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get <p>用户Id</p> 
     * @return UserId <p>用户Id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户Id</p>
     * @param UserId <p>用户Id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限</p> 
     * @return Type <p>必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限</p>
     * @param Type <p>必传字段，查询的信息类型，Group：工作组 DataAuth：数据权限 EngineAuth:引擎权限 RowFilter：行级别权限</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>查询的过滤条件。</p><p>当Type为Group时，支持Key为workgroup-name的模糊搜索；</p><p>当Type为DataAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>data-name：库表的模糊搜索。</p><p>当Type为EngineAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>engine-name：库表的模糊搜索。</p> 
     * @return Filters <p>查询的过滤条件。</p><p>当Type为Group时，支持Key为workgroup-name的模糊搜索；</p><p>当Type为DataAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>data-name：库表的模糊搜索。</p><p>当Type为EngineAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>engine-name：库表的模糊搜索。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询的过滤条件。</p><p>当Type为Group时，支持Key为workgroup-name的模糊搜索；</p><p>当Type为DataAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>data-name：库表的模糊搜索。</p><p>当Type为EngineAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>engine-name：库表的模糊搜索。</p>
     * @param Filters <p>查询的过滤条件。</p><p>当Type为Group时，支持Key为workgroup-name的模糊搜索；</p><p>当Type为DataAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>data-name：库表的模糊搜索。</p><p>当Type为EngineAuth时，支持key：</p><p>policy-type：权限类型。</p><p>policy-source：数据来源。</p><p>engine-name：库表的模糊搜索。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段。</p><p>当Type为Group时，支持create-time、group-name</p><p>当Type为DataAuth时，支持create-time</p><p>当Type为EngineAuth时，支持create-time</p> 
     * @return SortBy <p>排序字段。</p><p>当Type为Group时，支持create-time、group-name</p><p>当Type为DataAuth时，支持create-time</p><p>当Type为EngineAuth时，支持create-time</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段。</p><p>当Type为Group时，支持create-time、group-name</p><p>当Type为DataAuth时，支持create-time</p><p>当Type为EngineAuth时，支持create-time</p>
     * @param SortBy <p>排序字段。</p><p>当Type为Group时，支持create-time、group-name</p><p>当Type为DataAuth时，支持create-time</p><p>当Type为EngineAuth时，支持create-time</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式，desc表示正序，asc表示反序， 默认为asc</p> 
     * @return Sorting <p>排序方式，desc表示正序，asc表示反序， 默认为asc</p>
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set <p>排序方式，desc表示正序，asc表示反序， 默认为asc</p>
     * @param Sorting <p>排序方式，desc表示正序，asc表示反序， 默认为asc</p>
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get <p>返回数量，默认20，最大值100</p> 
     * @return Limit <p>返回数量，默认20，最大值100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大值100</p>
     * @param Limit <p>返回数量，默认20，最大值100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p> 
     * @return AccountType <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     * @param AccountType <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>TF 资源 ID</p> 
     * @return PolicyId <p>TF 资源 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>TF 资源 ID</p>
     * @param PolicyId <p>TF 资源 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DescribeUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoRequest(DescribeUserInfoRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

