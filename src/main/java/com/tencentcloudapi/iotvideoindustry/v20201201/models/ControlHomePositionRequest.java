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

public class ControlHomePositionRequest extends AbstractModel{

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 看守位使能 0-停用看守位 1-启用看守位
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 预置位编码 范围1-8，启用看守位时必填
    */
    @SerializedName("PresetId")
    @Expose
    private Long PresetId;

    /**
    * 看守位自动归位时间， 启用看守位时必填
    */
    @SerializedName("ResetTime")
    @Expose
    private Long ResetTime;

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
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
     * Get 看守位使能 0-停用看守位 1-启用看守位 
     * @return Enable 看守位使能 0-停用看守位 1-启用看守位
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 看守位使能 0-停用看守位 1-启用看守位
     * @param Enable 看守位使能 0-停用看守位 1-启用看守位
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 预置位编码 范围1-8，启用看守位时必填 
     * @return PresetId 预置位编码 范围1-8，启用看守位时必填
     */
    public Long getPresetId() {
        return this.PresetId;
    }

    /**
     * Set 预置位编码 范围1-8，启用看守位时必填
     * @param PresetId 预置位编码 范围1-8，启用看守位时必填
     */
    public void setPresetId(Long PresetId) {
        this.PresetId = PresetId;
    }

    /**
     * Get 看守位自动归位时间， 启用看守位时必填 
     * @return ResetTime 看守位自动归位时间， 启用看守位时必填
     */
    public Long getResetTime() {
        return this.ResetTime;
    }

    /**
     * Set 看守位自动归位时间， 启用看守位时必填
     * @param ResetTime 看守位自动归位时间， 启用看守位时必填
     */
    public void setResetTime(Long ResetTime) {
        this.ResetTime = ResetTime;
    }

    public ControlHomePositionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlHomePositionRequest(ControlHomePositionRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.PresetId != null) {
            this.PresetId = new Long(source.PresetId);
        }
        if (source.ResetTime != null) {
            this.ResetTime = new Long(source.ResetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "PresetId", this.PresetId);
        this.setParamSimple(map, prefix + "ResetTime", this.ResetTime);

    }
}

