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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRolesRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>偏移值</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序方式</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>是否返回绑定的用户数</p>
    */
    @SerializedName("WithUserCount")
    @Expose
    private Boolean WithUserCount;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移值</p> 
     * @return Offset <p>偏移值</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移值</p>
     * @param Offset <p>偏移值</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页数量</p> 
     * @return Limit <p>分页数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页数量</p>
     * @param Limit <p>分页数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序方式</p> 
     * @return Order <p>排序方式</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式</p>
     * @param Order <p>排序方式</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段</p> 
     * @return OrderField <p>排序字段</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段</p>
     * @param OrderField <p>排序字段</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>是否返回绑定的用户数</p> 
     * @return WithUserCount <p>是否返回绑定的用户数</p>
     */
    public Boolean getWithUserCount() {
        return this.WithUserCount;
    }

    /**
     * Set <p>是否返回绑定的用户数</p>
     * @param WithUserCount <p>是否返回绑定的用户数</p>
     */
    public void setWithUserCount(Boolean WithUserCount) {
        this.WithUserCount = WithUserCount;
    }

    public DescribeRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRolesRequest(DescribeRolesRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.WithUserCount != null) {
            this.WithUserCount = new Boolean(source.WithUserCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "WithUserCount", this.WithUserCount);

    }
}

