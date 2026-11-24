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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTicketsRequest extends AbstractModel {

    /**
    * 状态：0待提交(草稿)，1待审批，2批准，3已执行，4驳回
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * 工单类型：0-运维工单，1-权限工单
    */
    @SerializedName("TicketType")
    @Expose
    private String TicketType;

    /**
    * 过滤数组
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 资产过滤数组
    */
    @SerializedName("DeviceFilters")
    @Expose
    private Filter [] DeviceFilters;

    /**
    * 部门id
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20，最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 状态：0待提交(草稿)，1待审批，2批准，3已执行，4驳回 
     * @return StatusSet 状态：0待提交(草稿)，1待审批，2批准，3已执行，4驳回
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 状态：0待提交(草稿)，1待审批，2批准，3已执行，4驳回
     * @param StatusSet 状态：0待提交(草稿)，1待审批，2批准，3已执行，4驳回
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 工单类型：0-运维工单，1-权限工单 
     * @return TicketType 工单类型：0-运维工单，1-权限工单
     */
    public String getTicketType() {
        return this.TicketType;
    }

    /**
     * Set 工单类型：0-运维工单，1-权限工单
     * @param TicketType 工单类型：0-运维工单，1-权限工单
     */
    public void setTicketType(String TicketType) {
        this.TicketType = TicketType;
    }

    /**
     * Get 过滤数组 
     * @return Filters 过滤数组
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组
     * @param Filters 过滤数组
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 资产过滤数组 
     * @return DeviceFilters 资产过滤数组
     */
    public Filter [] getDeviceFilters() {
        return this.DeviceFilters;
    }

    /**
     * Set 资产过滤数组
     * @param DeviceFilters 资产过滤数组
     */
    public void setDeviceFilters(Filter [] DeviceFilters) {
        this.DeviceFilters = DeviceFilters;
    }

    /**
     * Get 部门id 
     * @return DepartmentId 部门id
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门id
     * @param DepartmentId 部门id
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20，最大500 
     * @return Limit 每页条目数量，默认20，最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20，最大500
     * @param Limit 每页条目数量，默认20，最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTicketsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTicketsRequest(DescribeTicketsRequest source) {
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
            }
        }
        if (source.TicketType != null) {
            this.TicketType = new String(source.TicketType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DeviceFilters != null) {
            this.DeviceFilters = new Filter[source.DeviceFilters.length];
            for (int i = 0; i < source.DeviceFilters.length; i++) {
                this.DeviceFilters[i] = new Filter(source.DeviceFilters[i]);
            }
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
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
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "TicketType", this.TicketType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "DeviceFilters.", this.DeviceFilters);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

