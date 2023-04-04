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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备状态，offline为离线，ready为在线准备，connected为会话中
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * 设备类型，field为现场设备（受控方），remote为远端设备（操控方）
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 设备信息最近修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 设备状态最近更新时间
    */
    @SerializedName("LastReportTime")
    @Expose
    private String LastReportTime;

    /**
    * 设备所属项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备状态，offline为离线，ready为在线准备，connected为会话中 
     * @return DeviceStatus 设备状态，offline为离线，ready为在线准备，connected为会话中
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态，offline为离线，ready为在线准备，connected为会话中
     * @param DeviceStatus 设备状态，offline为离线，ready为在线准备，connected为会话中
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 设备类型，field为现场设备（受控方），remote为远端设备（操控方） 
     * @return DeviceType 设备类型，field为现场设备（受控方），remote为远端设备（操控方）
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，field为现场设备（受控方），remote为远端设备（操控方）
     * @param DeviceType 设备类型，field为现场设备（受控方），remote为远端设备（操控方）
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备信息最近修改时间 
     * @return ModifyTime 设备信息最近修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 设备信息最近修改时间
     * @param ModifyTime 设备信息最近修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 设备状态最近更新时间 
     * @return LastReportTime 设备状态最近更新时间
     */
    public String getLastReportTime() {
        return this.LastReportTime;
    }

    /**
     * Set 设备状态最近更新时间
     * @param LastReportTime 设备状态最近更新时间
     */
    public void setLastReportTime(String LastReportTime) {
        this.LastReportTime = LastReportTime;
    }

    /**
     * Get 设备所属项目Id 
     * @return ProjectId 设备所属项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 设备所属项目Id
     * @param ProjectId 设备所属项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceInfo(DeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.LastReportTime != null) {
            this.LastReportTime = new String(source.LastReportTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "LastReportTime", this.LastReportTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

