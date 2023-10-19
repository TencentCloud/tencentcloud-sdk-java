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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralSpanListRequest extends AbstractModel {

    /**
    * 分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表项个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * span查询开始时间戳（单位:秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 实例名
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 通用过滤参数
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 业务自身服务名
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * span查询结束时间戳（单位:秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 分页 
     * @return Offset 分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页
     * @param Offset 分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表项个数 
     * @return Limit 列表项个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表项个数
     * @param Limit 列表项个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序 
     * @return OrderBy 排序
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序
     * @param OrderBy 排序
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get span查询开始时间戳（单位:秒） 
     * @return StartTime span查询开始时间戳（单位:秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set span查询开始时间戳（单位:秒）
     * @param StartTime span查询开始时间戳（单位:秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例名 
     * @return InstanceId 实例名
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名
     * @param InstanceId 实例名
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 通用过滤参数 
     * @return Filters 通用过滤参数
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 通用过滤参数
     * @param Filters 通用过滤参数
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 业务自身服务名 
     * @return BusinessName 业务自身服务名
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set 业务自身服务名
     * @param BusinessName 业务自身服务名
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get span查询结束时间戳（单位:秒） 
     * @return EndTime span查询结束时间戳（单位:秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set span查询结束时间戳（单位:秒）
     * @param EndTime span查询结束时间戳（单位:秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeGeneralSpanListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralSpanListRequest(DescribeGeneralSpanListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

