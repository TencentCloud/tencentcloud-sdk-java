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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecificTrafficPackageUsedDetailsRequest extends AbstractModel{

    /**
    * 共享流量包唯一ID
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。</li><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 CVM 和 EIP </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 开始时间。不传默认为当前时间往前推30天
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。不传默认为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 共享流量包唯一ID 
     * @return TrafficPackageId 共享流量包唯一ID
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set 共享流量包唯一ID
     * @param TrafficPackageId 共享流量包唯一ID
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。</li><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 CVM 和 EIP </li> 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。</li><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 CVM 和 EIP </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。</li><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 CVM 和 EIP </li>
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。详细的过滤条件如下：<li> resource-id - String - 是否必填：否 - （过滤条件）按照抵扣流量资源的唯一 ID 过滤。</li><li> resource-type - String - 是否必填：否 - （过滤条件）按照资源类型过滤，资源类型包括 CVM 和 EIP </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction 
     * @return OrderField 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     * @param OrderField 排序条件。该参数仅支持根据抵扣量排序，传值为 deduction
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0 
     * @return OrderType 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     * @param OrderType 排序类型，仅支持0和1，0-降序，1-升序。不传默认为0
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 开始时间。不传默认为当前时间往前推30天 
     * @return StartTime 开始时间。不传默认为当前时间往前推30天
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。不传默认为当前时间往前推30天
     * @param StartTime 开始时间。不传默认为当前时间往前推30天
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。不传默认为当前时间 
     * @return EndTime 结束时间。不传默认为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。不传默认为当前时间
     * @param EndTime 结束时间。不传默认为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数 
     * @return Limit 分页参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数
     * @param Limit 分页参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSpecificTrafficPackageUsedDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecificTrafficPackageUsedDetailsRequest(DescribeSpecificTrafficPackageUsedDetailsRequest source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

