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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionObj extends AbstractModel {

    /**
    * 动作id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 动作名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 动作类型。（app/推送消息至应用-携带空间设备：无,appWithNearbyDevices/推送至应用-携带空间设备：携带,device/推送消息至设备-指定设备,nearbyDevices/推送消息至设备-事件所在范围内的设备,toAlarm/转换为告警,toNotification/转换为通知）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 动作说明
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 消息类型，orgin/custom/model
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 消息内容
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 动作下沉配置
    */
    @SerializedName("SinkConfig")
    @Expose
    private String SinkConfig;

    /**
    *  具体应用（appid）/具体设备（DIN/subID）
    */
    @SerializedName("ApplyDevice")
    @Expose
    private String ApplyDevice;

    /**
     * Get 动作id 
     * @return Id 动作id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 动作id
     * @param Id 动作id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 动作名称 
     * @return Name 动作名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 动作名称
     * @param Name 动作名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 动作类型。（app/推送消息至应用-携带空间设备：无,appWithNearbyDevices/推送至应用-携带空间设备：携带,device/推送消息至设备-指定设备,nearbyDevices/推送消息至设备-事件所在范围内的设备,toAlarm/转换为告警,toNotification/转换为通知） 
     * @return Type 动作类型。（app/推送消息至应用-携带空间设备：无,appWithNearbyDevices/推送至应用-携带空间设备：携带,device/推送消息至设备-指定设备,nearbyDevices/推送消息至设备-事件所在范围内的设备,toAlarm/转换为告警,toNotification/转换为通知）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 动作类型。（app/推送消息至应用-携带空间设备：无,appWithNearbyDevices/推送至应用-携带空间设备：携带,device/推送消息至设备-指定设备,nearbyDevices/推送消息至设备-事件所在范围内的设备,toAlarm/转换为告警,toNotification/转换为通知）
     * @param Type 动作类型。（app/推送消息至应用-携带空间设备：无,appWithNearbyDevices/推送至应用-携带空间设备：携带,device/推送消息至设备-指定设备,nearbyDevices/推送消息至设备-事件所在范围内的设备,toAlarm/转换为告警,toNotification/转换为通知）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 动作说明 
     * @return Desc 动作说明
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 动作说明
     * @param Desc 动作说明
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 消息类型，orgin/custom/model 
     * @return MsgType 消息类型，orgin/custom/model
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型，orgin/custom/model
     * @param MsgType 消息类型，orgin/custom/model
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 消息内容 
     * @return MsgContent 消息内容
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容
     * @param MsgContent 消息内容
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 动作下沉配置 
     * @return SinkConfig 动作下沉配置
     */
    public String getSinkConfig() {
        return this.SinkConfig;
    }

    /**
     * Set 动作下沉配置
     * @param SinkConfig 动作下沉配置
     */
    public void setSinkConfig(String SinkConfig) {
        this.SinkConfig = SinkConfig;
    }

    /**
     * Get  具体应用（appid）/具体设备（DIN/subID） 
     * @return ApplyDevice  具体应用（appid）/具体设备（DIN/subID）
     */
    public String getApplyDevice() {
        return this.ApplyDevice;
    }

    /**
     * Set  具体应用（appid）/具体设备（DIN/subID）
     * @param ApplyDevice  具体应用（appid）/具体设备（DIN/subID）
     */
    public void setApplyDevice(String ApplyDevice) {
        this.ApplyDevice = ApplyDevice;
    }

    public ActionObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionObj(ActionObj source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.MsgType != null) {
            this.MsgType = new String(source.MsgType);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SinkConfig != null) {
            this.SinkConfig = new String(source.SinkConfig);
        }
        if (source.ApplyDevice != null) {
            this.ApplyDevice = new String(source.ApplyDevice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SinkConfig", this.SinkConfig);
        this.setParamSimple(map, prefix + "ApplyDevice", this.ApplyDevice);

    }
}

