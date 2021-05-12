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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFleetEventsRequest extends AbstractModel{

    /**
    * 服务器舰队 Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 分页时返回服务器舰队事件的数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页时的数据偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 事件代码
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 发生事件的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 发生事件的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 服务器舰队 Id 
     * @return FleetId 服务器舰队 Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
     * @param FleetId 服务器舰队 Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 分页时返回服务器舰队事件的数量，默认为20，最大值为100 
     * @return Limit 分页时返回服务器舰队事件的数量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页时返回服务器舰队事件的数量，默认为20，最大值为100
     * @param Limit 分页时返回服务器舰队事件的数量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页时的数据偏移量，默认为0 
     * @return Offset 分页时的数据偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页时的数据偏移量，默认为0
     * @param Offset 分页时的数据偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 事件代码 
     * @return EventCode 事件代码
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件代码
     * @param EventCode 事件代码
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 发生事件的开始时间 
     * @return StartTime 发生事件的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 发生事件的开始时间
     * @param StartTime 发生事件的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 发生事件的结束时间 
     * @return EndTime 发生事件的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 发生事件的结束时间
     * @param EndTime 发生事件的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeFleetEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetEventsRequest(DescribeFleetEventsRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

