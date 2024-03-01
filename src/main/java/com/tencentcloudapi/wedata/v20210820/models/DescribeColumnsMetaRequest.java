/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeColumnsMetaRequest extends AbstractModel {

    /**
    * 表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤器
    */
    @SerializedName("FilterSet")
    @Expose
    private Filter [] FilterSet;

    /**
    * 排序字段
    */
    @SerializedName("OrderFieldSet")
    @Expose
    private OrderField [] OrderFieldSet;

    /**
    * 是否查询分区字段，默认false
    */
    @SerializedName("IsPartitionQuery")
    @Expose
    private Boolean IsPartitionQuery;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get 表ID 
     * @return TableId 表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
     * @param TableId 表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤器 
     * @return FilterSet 过滤器
     */
    public Filter [] getFilterSet() {
        return this.FilterSet;
    }

    /**
     * Set 过滤器
     * @param FilterSet 过滤器
     */
    public void setFilterSet(Filter [] FilterSet) {
        this.FilterSet = FilterSet;
    }

    /**
     * Get 排序字段 
     * @return OrderFieldSet 排序字段
     */
    public OrderField [] getOrderFieldSet() {
        return this.OrderFieldSet;
    }

    /**
     * Set 排序字段
     * @param OrderFieldSet 排序字段
     */
    public void setOrderFieldSet(OrderField [] OrderFieldSet) {
        this.OrderFieldSet = OrderFieldSet;
    }

    /**
     * Get 是否查询分区字段，默认false 
     * @return IsPartitionQuery 是否查询分区字段，默认false
     */
    public Boolean getIsPartitionQuery() {
        return this.IsPartitionQuery;
    }

    /**
     * Set 是否查询分区字段，默认false
     * @param IsPartitionQuery 是否查询分区字段，默认false
     */
    public void setIsPartitionQuery(Boolean IsPartitionQuery) {
        this.IsPartitionQuery = IsPartitionQuery;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public DescribeColumnsMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeColumnsMetaRequest(DescribeColumnsMetaRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FilterSet != null) {
            this.FilterSet = new Filter[source.FilterSet.length];
            for (int i = 0; i < source.FilterSet.length; i++) {
                this.FilterSet[i] = new Filter(source.FilterSet[i]);
            }
        }
        if (source.OrderFieldSet != null) {
            this.OrderFieldSet = new OrderField[source.OrderFieldSet.length];
            for (int i = 0; i < source.OrderFieldSet.length; i++) {
                this.OrderFieldSet[i] = new OrderField(source.OrderFieldSet[i]);
            }
        }
        if (source.IsPartitionQuery != null) {
            this.IsPartitionQuery = new Boolean(source.IsPartitionQuery);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "FilterSet.", this.FilterSet);
        this.setParamArrayObj(map, prefix + "OrderFieldSet.", this.OrderFieldSet);
        this.setParamSimple(map, prefix + "IsPartitionQuery", this.IsPartitionQuery);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

