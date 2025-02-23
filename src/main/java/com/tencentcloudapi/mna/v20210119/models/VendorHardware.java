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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VendorHardware extends AbstractModel {

    /**
    * 硬件id
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

    /**
    * 硬件序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 激活状态， 空：全部； 1:待激活； 2:已激活
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 激活时间
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 厂商备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：设备为租户付费且未激活（未选择月付还是永久付费）时，此参数返回1，仅代表租户付费。后续将废弃此参数，新接入请使用LicensePayMode和Payer
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * 最后在线时间
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
    * license授权有效期
0：月度授权
1：永久授权
-1：未知
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * 付费方
0：客户付费
1：厂商付费
    */
    @SerializedName("Payer")
    @Expose
    private Long Payer;

    /**
     * Get 硬件id 
     * @return HardwareId 硬件id
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set 硬件id
     * @param HardwareId 硬件id
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
    }

    /**
     * Get 硬件序列号 
     * @return SN 硬件序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 硬件序列号
     * @param SN 硬件序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
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
     * Get 激活状态， 空：全部； 1:待激活； 2:已激活 
     * @return Status 激活状态， 空：全部； 1:待激活； 2:已激活
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 激活状态， 空：全部； 1:待激活； 2:已激活
     * @param Status 激活状态， 空：全部； 1:待激活； 2:已激活
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 激活时间 
     * @return ActiveTime 激活时间
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间
     * @param ActiveTime 激活时间
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 厂商备注 
     * @return Description 厂商备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 厂商备注
     * @param Description 厂商备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备id 
     * @return DeviceId 设备id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
     * @param DeviceId 设备id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：设备为租户付费且未激活（未选择月付还是永久付费）时，此参数返回1，仅代表租户付费。后续将废弃此参数，新接入请使用LicensePayMode和Payer 
     * @return LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：设备为租户付费且未激活（未选择月付还是永久付费）时，此参数返回1，仅代表租户付费。后续将废弃此参数，新接入请使用LicensePayMode和Payer
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：设备为租户付费且未激活（未选择月付还是永久付费）时，此参数返回1，仅代表租户付费。后续将废弃此参数，新接入请使用LicensePayMode和Payer
     * @param LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：设备为租户付费且未激活（未选择月付还是永久付费）时，此参数返回1，仅代表租户付费。后续将废弃此参数，新接入请使用LicensePayMode和Payer
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
    }

    /**
     * Get 最后在线时间 
     * @return LastOnlineTime 最后在线时间
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set 最后在线时间
     * @param LastOnlineTime 最后在线时间
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    /**
     * Get license授权有效期
0：月度授权
1：永久授权
-1：未知 
     * @return LicensePayMode license授权有效期
0：月度授权
1：永久授权
-1：未知
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set license授权有效期
0：月度授权
1：永久授权
-1：未知
     * @param LicensePayMode license授权有效期
0：月度授权
1：永久授权
-1：未知
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get 付费方
0：客户付费
1：厂商付费 
     * @return Payer 付费方
0：客户付费
1：厂商付费
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set 付费方
0：客户付费
1：厂商付费
     * @param Payer 付费方
0：客户付费
1：厂商付费
     */
    public void setPayer(Long Payer) {
        this.Payer = Payer;
    }

    public VendorHardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VendorHardware(VendorHardware source) {
        if (source.HardwareId != null) {
            this.HardwareId = new String(source.HardwareId);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.Payer != null) {
            this.Payer = new Long(source.Payer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HardwareId", this.HardwareId);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);

    }
}

