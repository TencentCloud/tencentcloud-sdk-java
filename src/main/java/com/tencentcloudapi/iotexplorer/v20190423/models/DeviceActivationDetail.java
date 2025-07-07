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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceActivationDetail extends AbstractModel {

    /**
    * 可注册设备数
    */
    @SerializedName("TotalDeviceNum")
    @Expose
    private Long TotalDeviceNum;

    /**
    * 已注册设备数
    */
    @SerializedName("UsedDeviceNum")
    @Expose
    private Long UsedDeviceNum;

    /**
    * 设备授权数
    */
    @SerializedName("TotalNormalLicense")
    @Expose
    private Long TotalNormalLicense;

    /**
    * 已使用设备授权数
    */
    @SerializedName("UsedNormalLicense")
    @Expose
    private Long UsedNormalLicense;

    /**
    * 蓝牙授权数
    */
    @SerializedName("TotalBluetoothLicense")
    @Expose
    private Long TotalBluetoothLicense;

    /**
    * 已使用蓝牙授权数
    */
    @SerializedName("UsedBluetoothLicense")
    @Expose
    private Long UsedBluetoothLicense;

    /**
    * 可免费注册设备数
    */
    @SerializedName("TotalFreeLicense")
    @Expose
    private Long TotalFreeLicense;

    /**
    * 已使用注册设备数
    */
    @SerializedName("UsedFreeLicense")
    @Expose
    private Long UsedFreeLicense;

    /**
     * Get 可注册设备数 
     * @return TotalDeviceNum 可注册设备数
     */
    public Long getTotalDeviceNum() {
        return this.TotalDeviceNum;
    }

    /**
     * Set 可注册设备数
     * @param TotalDeviceNum 可注册设备数
     */
    public void setTotalDeviceNum(Long TotalDeviceNum) {
        this.TotalDeviceNum = TotalDeviceNum;
    }

    /**
     * Get 已注册设备数 
     * @return UsedDeviceNum 已注册设备数
     */
    public Long getUsedDeviceNum() {
        return this.UsedDeviceNum;
    }

    /**
     * Set 已注册设备数
     * @param UsedDeviceNum 已注册设备数
     */
    public void setUsedDeviceNum(Long UsedDeviceNum) {
        this.UsedDeviceNum = UsedDeviceNum;
    }

    /**
     * Get 设备授权数 
     * @return TotalNormalLicense 设备授权数
     */
    public Long getTotalNormalLicense() {
        return this.TotalNormalLicense;
    }

    /**
     * Set 设备授权数
     * @param TotalNormalLicense 设备授权数
     */
    public void setTotalNormalLicense(Long TotalNormalLicense) {
        this.TotalNormalLicense = TotalNormalLicense;
    }

    /**
     * Get 已使用设备授权数 
     * @return UsedNormalLicense 已使用设备授权数
     */
    public Long getUsedNormalLicense() {
        return this.UsedNormalLicense;
    }

    /**
     * Set 已使用设备授权数
     * @param UsedNormalLicense 已使用设备授权数
     */
    public void setUsedNormalLicense(Long UsedNormalLicense) {
        this.UsedNormalLicense = UsedNormalLicense;
    }

    /**
     * Get 蓝牙授权数 
     * @return TotalBluetoothLicense 蓝牙授权数
     */
    public Long getTotalBluetoothLicense() {
        return this.TotalBluetoothLicense;
    }

    /**
     * Set 蓝牙授权数
     * @param TotalBluetoothLicense 蓝牙授权数
     */
    public void setTotalBluetoothLicense(Long TotalBluetoothLicense) {
        this.TotalBluetoothLicense = TotalBluetoothLicense;
    }

    /**
     * Get 已使用蓝牙授权数 
     * @return UsedBluetoothLicense 已使用蓝牙授权数
     */
    public Long getUsedBluetoothLicense() {
        return this.UsedBluetoothLicense;
    }

    /**
     * Set 已使用蓝牙授权数
     * @param UsedBluetoothLicense 已使用蓝牙授权数
     */
    public void setUsedBluetoothLicense(Long UsedBluetoothLicense) {
        this.UsedBluetoothLicense = UsedBluetoothLicense;
    }

    /**
     * Get 可免费注册设备数 
     * @return TotalFreeLicense 可免费注册设备数
     */
    public Long getTotalFreeLicense() {
        return this.TotalFreeLicense;
    }

    /**
     * Set 可免费注册设备数
     * @param TotalFreeLicense 可免费注册设备数
     */
    public void setTotalFreeLicense(Long TotalFreeLicense) {
        this.TotalFreeLicense = TotalFreeLicense;
    }

    /**
     * Get 已使用注册设备数 
     * @return UsedFreeLicense 已使用注册设备数
     */
    public Long getUsedFreeLicense() {
        return this.UsedFreeLicense;
    }

    /**
     * Set 已使用注册设备数
     * @param UsedFreeLicense 已使用注册设备数
     */
    public void setUsedFreeLicense(Long UsedFreeLicense) {
        this.UsedFreeLicense = UsedFreeLicense;
    }

    public DeviceActivationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceActivationDetail(DeviceActivationDetail source) {
        if (source.TotalDeviceNum != null) {
            this.TotalDeviceNum = new Long(source.TotalDeviceNum);
        }
        if (source.UsedDeviceNum != null) {
            this.UsedDeviceNum = new Long(source.UsedDeviceNum);
        }
        if (source.TotalNormalLicense != null) {
            this.TotalNormalLicense = new Long(source.TotalNormalLicense);
        }
        if (source.UsedNormalLicense != null) {
            this.UsedNormalLicense = new Long(source.UsedNormalLicense);
        }
        if (source.TotalBluetoothLicense != null) {
            this.TotalBluetoothLicense = new Long(source.TotalBluetoothLicense);
        }
        if (source.UsedBluetoothLicense != null) {
            this.UsedBluetoothLicense = new Long(source.UsedBluetoothLicense);
        }
        if (source.TotalFreeLicense != null) {
            this.TotalFreeLicense = new Long(source.TotalFreeLicense);
        }
        if (source.UsedFreeLicense != null) {
            this.UsedFreeLicense = new Long(source.UsedFreeLicense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalDeviceNum", this.TotalDeviceNum);
        this.setParamSimple(map, prefix + "UsedDeviceNum", this.UsedDeviceNum);
        this.setParamSimple(map, prefix + "TotalNormalLicense", this.TotalNormalLicense);
        this.setParamSimple(map, prefix + "UsedNormalLicense", this.UsedNormalLicense);
        this.setParamSimple(map, prefix + "TotalBluetoothLicense", this.TotalBluetoothLicense);
        this.setParamSimple(map, prefix + "UsedBluetoothLicense", this.UsedBluetoothLicense);
        this.setParamSimple(map, prefix + "TotalFreeLicense", this.TotalFreeLicense);
        this.setParamSimple(map, prefix + "UsedFreeLicense", this.UsedFreeLicense);

    }
}

