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

public class ModifyPresetRequest extends AbstractModel{

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 预置位编码 范围1-8
    */
    @SerializedName("PresetId")
    @Expose
    private Long PresetId;

    /**
    * 预制位名称
    */
    @SerializedName("PresetName")
    @Expose
    private String PresetName;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

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
     * Get 预置位编码 范围1-8 
     * @return PresetId 预置位编码 范围1-8
     */
    public Long getPresetId() {
        return this.PresetId;
    }

    /**
     * Set 预置位编码 范围1-8
     * @param PresetId 预置位编码 范围1-8
     */
    public void setPresetId(Long PresetId) {
        this.PresetId = PresetId;
    }

    /**
     * Get 预制位名称 
     * @return PresetName 预制位名称
     */
    public String getPresetName() {
        return this.PresetName;
    }

    /**
     * Set 预制位名称
     * @param PresetName 预制位名称
     */
    public void setPresetName(String PresetName) {
        this.PresetName = PresetName;
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

    public ModifyPresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPresetRequest(ModifyPresetRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.PresetId != null) {
            this.PresetId = new Long(source.PresetId);
        }
        if (source.PresetName != null) {
            this.PresetName = new String(source.PresetName);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PresetId", this.PresetId);
        this.setParamSimple(map, prefix + "PresetName", this.PresetName);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

