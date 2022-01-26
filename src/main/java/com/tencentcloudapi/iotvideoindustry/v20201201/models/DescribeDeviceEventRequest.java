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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceEventRequest extends AbstractModel{

    /**
    * 开始时间，秒级时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，秒级时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 默认为全部 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
    */
    @SerializedName("EventTypes")
    @Expose
    private Long [] EventTypes;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * limit限制值
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 开始时间，秒级时间戳 
     * @return StartTime 开始时间，秒级时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，秒级时间戳
     * @param StartTime 开始时间，秒级时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，秒级时间戳 
     * @return EndTime 结束时间，秒级时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，秒级时间戳
     * @param EndTime 结束时间，秒级时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 设备Id 
     * @return DeviceId 设备Id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备Id
     * @param DeviceId 设备Id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 默认为全部 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断 
     * @return EventTypes 默认为全部 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
     */
    public Long [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set 默认为全部 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
     * @param EventTypes 默认为全部 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
     */
    public void setEventTypes(Long [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get limit限制值 
     * @return Limit limit限制值
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit限制值
     * @param Limit limit限制值
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDeviceEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceEventRequest(DescribeDeviceEventRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.EventTypes != null) {
            this.EventTypes = new Long[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new Long(source.EventTypes[i]);
            }
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

