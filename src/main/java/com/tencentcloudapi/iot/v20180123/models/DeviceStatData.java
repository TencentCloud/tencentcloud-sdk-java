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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceStatData extends AbstractModel{

    /**
    * 时间点
    */
    @SerializedName("Datetime")
    @Expose
    private String Datetime;

    /**
    * 在线设备数
    */
    @SerializedName("DeviceOnline")
    @Expose
    private Long DeviceOnline;

    /**
    * 激活设备数
    */
    @SerializedName("DeviceActive")
    @Expose
    private Long DeviceActive;

    /**
    * 设备总数
    */
    @SerializedName("DeviceTotal")
    @Expose
    private Long DeviceTotal;

    /**
     * Get 时间点 
     * @return Datetime 时间点
     */
    public String getDatetime() {
        return this.Datetime;
    }

    /**
     * Set 时间点
     * @param Datetime 时间点
     */
    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    /**
     * Get 在线设备数 
     * @return DeviceOnline 在线设备数
     */
    public Long getDeviceOnline() {
        return this.DeviceOnline;
    }

    /**
     * Set 在线设备数
     * @param DeviceOnline 在线设备数
     */
    public void setDeviceOnline(Long DeviceOnline) {
        this.DeviceOnline = DeviceOnline;
    }

    /**
     * Get 激活设备数 
     * @return DeviceActive 激活设备数
     */
    public Long getDeviceActive() {
        return this.DeviceActive;
    }

    /**
     * Set 激活设备数
     * @param DeviceActive 激活设备数
     */
    public void setDeviceActive(Long DeviceActive) {
        this.DeviceActive = DeviceActive;
    }

    /**
     * Get 设备总数 
     * @return DeviceTotal 设备总数
     */
    public Long getDeviceTotal() {
        return this.DeviceTotal;
    }

    /**
     * Set 设备总数
     * @param DeviceTotal 设备总数
     */
    public void setDeviceTotal(Long DeviceTotal) {
        this.DeviceTotal = DeviceTotal;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Datetime", this.Datetime);
        this.setParamSimple(map, prefix + "DeviceOnline", this.DeviceOnline);
        this.setParamSimple(map, prefix + "DeviceActive", this.DeviceActive);
        this.setParamSimple(map, prefix + "DeviceTotal", this.DeviceTotal);

    }
}

