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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEsInstanceEventListsRequest extends AbstractModel {

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 起始时间, e.g. "2019-03-07 16:30:39"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间, e.g. "2019-03-30 20:18:03"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 集群id，非必填，查询集群相关的事件
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 查询的类型，包括：硬件异常、用户变更和智能运维等，默认查询所有。1：硬件异常；2：用户变更；3：智能运维
    */
    @SerializedName("EventTypes")
    @Expose
    private Long [] EventTypes;

    /**
    * 事件状态
    */
    @SerializedName("EventStatus")
    @Expose
    private Long [] EventStatus;

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 起始时间, e.g. "2019-03-07 16:30:39" 
     * @return StartTime 起始时间, e.g. "2019-03-07 16:30:39"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间, e.g. "2019-03-07 16:30:39"
     * @param StartTime 起始时间, e.g. "2019-03-07 16:30:39"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间, e.g. "2019-03-30 20:18:03" 
     * @return EndTime 结束时间, e.g. "2019-03-30 20:18:03"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间, e.g. "2019-03-30 20:18:03"
     * @param EndTime 结束时间, e.g. "2019-03-30 20:18:03"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 集群id，非必填，查询集群相关的事件 
     * @return InstanceIds 集群id，非必填，查询集群相关的事件
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 集群id，非必填，查询集群相关的事件
     * @param InstanceIds 集群id，非必填，查询集群相关的事件
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 查询的类型，包括：硬件异常、用户变更和智能运维等，默认查询所有。1：硬件异常；2：用户变更；3：智能运维 
     * @return EventTypes 查询的类型，包括：硬件异常、用户变更和智能运维等，默认查询所有。1：硬件异常；2：用户变更；3：智能运维
     */
    public Long [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set 查询的类型，包括：硬件异常、用户变更和智能运维等，默认查询所有。1：硬件异常；2：用户变更；3：智能运维
     * @param EventTypes 查询的类型，包括：硬件异常、用户变更和智能运维等，默认查询所有。1：硬件异常；2：用户变更；3：智能运维
     */
    public void setEventTypes(Long [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get 事件状态 
     * @return EventStatus 事件状态
     */
    public Long [] getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态
     * @param EventStatus 事件状态
     */
    public void setEventStatus(Long [] EventStatus) {
        this.EventStatus = EventStatus;
    }

    public DescribeEsInstanceEventListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEsInstanceEventListsRequest(DescribeEsInstanceEventListsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.EventTypes != null) {
            this.EventTypes = new Long[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new Long(source.EventTypes[i]);
            }
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long[source.EventStatus.length];
            for (int i = 0; i < source.EventStatus.length; i++) {
                this.EventStatus[i] = new Long(source.EventStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamArraySimple(map, prefix + "EventStatus.", this.EventStatus);

    }
}

