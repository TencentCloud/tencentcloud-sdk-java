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

public class Events extends AbstractModel{

    /**
    * 开始时间，秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
    * 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 事件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventDesc")
    @Expose
    private String EventDesc;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 设备地址
    */
    @SerializedName("DeviceAddress")
    @Expose
    private String DeviceAddress;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道Id
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 事件日志
    */
    @SerializedName("EventLog")
    @Expose
    private String EventLog;

    /**
    * 设备备注名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 开始时间，秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventTime 开始时间，秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 开始时间，秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventTime 开始时间，秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType 事件类型 1:注册 2:心跳 4:录制异常 5:播放异常 6:流中断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventDesc 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventDesc() {
        return this.EventDesc;
    }

    /**
     * Set 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventDesc 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventDesc(String EventDesc) {
        this.EventDesc = EventDesc;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备地址 
     * @return DeviceAddress 设备地址
     */
    public String getDeviceAddress() {
        return this.DeviceAddress;
    }

    /**
     * Set 设备地址
     * @param DeviceAddress 设备地址
     */
    public void setDeviceAddress(String DeviceAddress) {
        this.DeviceAddress = DeviceAddress;
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
     * Get 通道Id 
     * @return ChannelId 通道Id
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道Id
     * @param ChannelId 通道Id
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 事件日志 
     * @return EventLog 事件日志
     */
    public String getEventLog() {
        return this.EventLog;
    }

    /**
     * Set 事件日志
     * @param EventLog 事件日志
     */
    public void setEventLog(String EventLog) {
        this.EventLog = EventLog;
    }

    /**
     * Get 设备备注名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 设备备注名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备备注名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 设备备注名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public Events() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Events(Events source) {
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventDesc != null) {
            this.EventDesc = new String(source.EventDesc);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.DeviceAddress != null) {
            this.DeviceAddress = new String(source.DeviceAddress);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.EventLog != null) {
            this.EventLog = new String(source.EventLog);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventDesc", this.EventDesc);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceAddress", this.DeviceAddress);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EventLog", this.EventLog);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

