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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicePositionItem extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 位置信息时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备经度信息
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 设备纬度信息
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

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
     * Get 位置信息时间 
     * @return CreateTime 位置信息时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 位置信息时间
     * @param CreateTime 位置信息时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备经度信息 
     * @return Longitude 设备经度信息
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 设备经度信息
     * @param Longitude 设备经度信息
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 设备纬度信息 
     * @return Latitude 设备纬度信息
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 设备纬度信息
     * @param Latitude 设备纬度信息
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    public DevicePositionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DevicePositionItem(DevicePositionItem source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);

    }
}

