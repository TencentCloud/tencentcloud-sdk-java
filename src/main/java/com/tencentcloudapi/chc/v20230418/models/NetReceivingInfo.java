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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetReceivingInfo extends AbstractModel {

    /**
    * 设备sn
    */
    @SerializedName("DeviceSn")
    @Expose
    private String DeviceSn;

    /**
    * 设备型号-版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 硬件备注
    */
    @SerializedName("HardwareMemo")
    @Expose
    private String HardwareMemo;

    /**
    * 厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
     * Get 设备sn 
     * @return DeviceSn 设备sn
     */
    public String getDeviceSn() {
        return this.DeviceSn;
    }

    /**
     * Set 设备sn
     * @param DeviceSn 设备sn
     */
    public void setDeviceSn(String DeviceSn) {
        this.DeviceSn = DeviceSn;
    }

    /**
     * Get 设备型号-版本 
     * @return ModelVersion 设备型号-版本
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 设备型号-版本
     * @param ModelVersion 设备型号-版本
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 硬件备注 
     * @return HardwareMemo 硬件备注
     */
    public String getHardwareMemo() {
        return this.HardwareMemo;
    }

    /**
     * Set 硬件备注
     * @param HardwareMemo 硬件备注
     */
    public void setHardwareMemo(String HardwareMemo) {
        this.HardwareMemo = HardwareMemo;
    }

    /**
     * Get 厂商 
     * @return Manufacturer 厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商
     * @param Manufacturer 厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public NetReceivingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetReceivingInfo(NetReceivingInfo source) {
        if (source.DeviceSn != null) {
            this.DeviceSn = new String(source.DeviceSn);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.HardwareMemo != null) {
            this.HardwareMemo = new String(source.HardwareMemo);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceSn", this.DeviceSn);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "HardwareMemo", this.HardwareMemo);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);

    }
}

