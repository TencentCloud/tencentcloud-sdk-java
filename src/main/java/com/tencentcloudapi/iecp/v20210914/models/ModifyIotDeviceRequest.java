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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIotDeviceRequest extends AbstractModel{

    /**
    * 设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备是否开启
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 日志设置
    */
    @SerializedName("LogSetting")
    @Expose
    private Long LogSetting;

    /**
    * 日志级别
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
     * Get 设备id 
     * @return DeviceId 设备id
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
     * @param DeviceId 设备id
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备是否开启 
     * @return Disabled 设备是否开启
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 设备是否开启
     * @param Disabled 设备是否开启
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 日志设置 
     * @return LogSetting 日志设置
     */
    public Long getLogSetting() {
        return this.LogSetting;
    }

    /**
     * Set 日志设置
     * @param LogSetting 日志设置
     */
    public void setLogSetting(Long LogSetting) {
        this.LogSetting = LogSetting;
    }

    /**
     * Get 日志级别 
     * @return LogLevel 日志级别
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别
     * @param LogLevel 日志级别
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    public ModifyIotDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIotDeviceRequest(ModifyIotDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.LogSetting != null) {
            this.LogSetting = new Long(source.LogSetting);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "LogSetting", this.LogSetting);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);

    }
}

