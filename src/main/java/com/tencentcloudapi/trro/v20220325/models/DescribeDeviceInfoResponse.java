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

public class DescribeDeviceInfoResponse extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备类型，field为现场设备（被控方），remote为远端设备（操控方）
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 设备状态，offline为离线，ready为在线准备，connected为会话中
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * 设备状态最后更新时间
    */
    @SerializedName("LastReportTime")
    @Expose
    private String LastReportTime;

    /**
    * 设备信息最后修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 设备类型，field为现场设备（被控方），remote为远端设备（操控方） 
     * @return DeviceType 设备类型，field为现场设备（被控方），remote为远端设备（操控方）
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，field为现场设备（被控方），remote为远端设备（操控方）
     * @param DeviceType 设备类型，field为现场设备（被控方），remote为远端设备（操控方）
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
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
     * Get 设备状态最后更新时间 
     * @return LastReportTime 设备状态最后更新时间
     */
    public String getLastReportTime() {
        return this.LastReportTime;
    }

    /**
     * Set 设备状态最后更新时间
     * @param LastReportTime 设备状态最后更新时间
     */
    public void setLastReportTime(String LastReportTime) {
        this.LastReportTime = LastReportTime;
    }

    /**
     * Get 设备信息最后修改时间 
     * @return ModifyTime 设备信息最后修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 设备信息最后修改时间
     * @param ModifyTime 设备信息最后修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceInfoResponse(DescribeDeviceInfoResponse source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.LastReportTime != null) {
            this.LastReportTime = new String(source.LastReportTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "LastReportTime", this.LastReportTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

