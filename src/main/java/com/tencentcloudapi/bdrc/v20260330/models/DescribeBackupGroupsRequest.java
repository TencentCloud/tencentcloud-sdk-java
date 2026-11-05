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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupGroupsRequest extends AbstractModel {

    /**
    * 过滤条件。backup-group-id - Array of String - 是否必填：否 -（过滤条件）按备份组ID过滤 ;backup-group-state - Array of String - 是否必填：否 -（过滤条件）按备份组状态过滤。(NORMAL: 正常 | CREATING:创建中 | ROLLBACKING:回滚中) ;backup-group-name - Array of String - 是否必填：否 -（过滤条件）按备份组名称过滤 ;backup-id - Array of String - 是否必填：否 -（过滤条件）按备份组内的备份ID过滤
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认20，最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序方式</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get 过滤条件。backup-group-id - Array of String - 是否必填：否 -（过滤条件）按备份组ID过滤 ;backup-group-state - Array of String - 是否必填：否 -（过滤条件）按备份组状态过滤。(NORMAL: 正常 | CREATING:创建中 | ROLLBACKING:回滚中) ;backup-group-name - Array of String - 是否必填：否 -（过滤条件）按备份组名称过滤 ;backup-id - Array of String - 是否必填：否 -（过滤条件）按备份组内的备份ID过滤 
     * @return Filters 过滤条件。backup-group-id - Array of String - 是否必填：否 -（过滤条件）按备份组ID过滤 ;backup-group-state - Array of String - 是否必填：否 -（过滤条件）按备份组状态过滤。(NORMAL: 正常 | CREATING:创建中 | ROLLBACKING:回滚中) ;backup-group-name - Array of String - 是否必填：否 -（过滤条件）按备份组名称过滤 ;backup-id - Array of String - 是否必填：否 -（过滤条件）按备份组内的备份ID过滤
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。backup-group-id - Array of String - 是否必填：否 -（过滤条件）按备份组ID过滤 ;backup-group-state - Array of String - 是否必填：否 -（过滤条件）按备份组状态过滤。(NORMAL: 正常 | CREATING:创建中 | ROLLBACKING:回滚中) ;backup-group-name - Array of String - 是否必填：否 -（过滤条件）按备份组名称过滤 ;backup-id - Array of String - 是否必填：否 -（过滤条件）按备份组内的备份ID过滤
     * @param Filters 过滤条件。backup-group-id - Array of String - 是否必填：否 -（过滤条件）按备份组ID过滤 ;backup-group-state - Array of String - 是否必填：否 -（过滤条件）按备份组状态过滤。(NORMAL: 正常 | CREATING:创建中 | ROLLBACKING:回滚中) ;backup-group-name - Array of String - 是否必填：否 -（过滤条件）按备份组名称过滤 ;backup-id - Array of String - 是否必填：否 -（过滤条件）按备份组内的备份ID过滤
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认20，最大500 
     * @return Limit 返回数量，默认20，最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20，最大500
     * @param Limit 返回数量，默认20，最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序方式</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p> 
     * @return Order <p>排序方式</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     * @param Order <p>排序方式</p><p>枚举值：</p><ul><li>ASC： 升序排序</li><li>DESC： 降序排序</li></ul><p>默认值：DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p> 
     * @return OrderField <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     * @param OrderField <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeBackupGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupGroupsRequest(DescribeBackupGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new FilterModel[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterModel(source.Filters[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

