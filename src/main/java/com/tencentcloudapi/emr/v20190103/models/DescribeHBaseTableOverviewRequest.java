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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHBaseTableOverviewRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 页码，第一页:0，第二页:1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询时的分页大小，最小1，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 表名称，模糊匹配
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 排序的字段，有默认值
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 默认为降序，asc代表升序，desc代表降序
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 页码，第一页:0，第二页:1 
     * @return Offset 页码，第一页:0，第二页:1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码，第一页:0，第二页:1
     * @param Offset 页码，第一页:0，第二页:1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询时的分页大小，最小1，最大100 
     * @return Limit 分页查询时的分页大小，最小1，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询时的分页大小，最小1，最大100
     * @param Limit 分页查询时的分页大小，最小1，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 表名称，模糊匹配 
     * @return Table 表名称，模糊匹配
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名称，模糊匹配
     * @param Table 表名称，模糊匹配
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 排序的字段，有默认值 
     * @return OrderField 排序的字段，有默认值
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序的字段，有默认值
     * @param OrderField 排序的字段，有默认值
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 默认为降序，asc代表升序，desc代表降序 
     * @return OrderType 默认为降序，asc代表升序，desc代表降序
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 默认为降序，asc代表升序，desc代表降序
     * @param OrderType 默认为降序，asc代表升序，desc代表降序
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeHBaseTableOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHBaseTableOverviewRequest(DescribeHBaseTableOverviewRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

