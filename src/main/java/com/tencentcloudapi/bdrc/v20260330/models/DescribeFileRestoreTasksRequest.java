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

public class DescribeFileRestoreTasksRequest extends AbstractModel {

    /**
    * <p>过滤条件。支持: backup-id, task-id, instance-id, &quot;         &quot;target-instance-id, status</p>
    */
    @SerializedName("Filters")
    @Expose
    private FilterModel [] Filters;

    /**
    * <p>偏移量，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认20，最大100</p>
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
    * <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li><li>CreatedTime： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM 文件备份</li><li>CFS_AGENT： 文件系统备份</li><li>COS_AGENT： COS备份</li></ul><p>默认值：CVM_AGENT</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get <p>过滤条件。支持: backup-id, task-id, instance-id, &quot;         &quot;target-instance-id, status</p> 
     * @return Filters <p>过滤条件。支持: backup-id, task-id, instance-id, &quot;         &quot;target-instance-id, status</p>
     */
    public FilterModel [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。支持: backup-id, task-id, instance-id, &quot;         &quot;target-instance-id, status</p>
     * @param Filters <p>过滤条件。支持: backup-id, task-id, instance-id, &quot;         &quot;target-instance-id, status</p>
     */
    public void setFilters(FilterModel [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移量，默认0</p> 
     * @return Offset <p>偏移量，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0</p>
     * @param Offset <p>偏移量，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认20，最大100</p> 
     * @return Limit <p>返回数量，默认20，最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大100</p>
     * @param Limit <p>返回数量，默认20，最大100</p>
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
     * Get <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li><li>CreatedTime： 创建时间</li></ul><p>默认值：CREATE_TIME</p> 
     * @return OrderField <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li><li>CreatedTime： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li><li>CreatedTime： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     * @param OrderField <p>排序字段</p><p>枚举值：</p><ul><li>CREATE_TIME： 创建时间</li><li>CreatedTime： 创建时间</li></ul><p>默认值：CREATE_TIME</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM 文件备份</li><li>CFS_AGENT： 文件系统备份</li><li>COS_AGENT： COS备份</li></ul><p>默认值：CVM_AGENT</p> 
     * @return ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM 文件备份</li><li>CFS_AGENT： 文件系统备份</li><li>COS_AGENT： COS备份</li></ul><p>默认值：CVM_AGENT</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM 文件备份</li><li>CFS_AGENT： 文件系统备份</li><li>COS_AGENT： COS备份</li></ul><p>默认值：CVM_AGENT</p>
     * @param ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM 文件备份</li><li>CFS_AGENT： 文件系统备份</li><li>COS_AGENT： COS备份</li></ul><p>默认值：CVM_AGENT</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeFileRestoreTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileRestoreTasksRequest(DescribeFileRestoreTasksRequest source) {
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
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
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
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

