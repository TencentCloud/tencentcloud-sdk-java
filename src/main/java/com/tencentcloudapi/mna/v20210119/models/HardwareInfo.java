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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HardwareInfo extends AbstractModel {

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
    * 激活时间
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 最后在线时间
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 厂商备注
    */
    @SerializedName("VendorDescription")
    @Expose
    private String VendorDescription;

    /**
    * license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：后续将废弃此参数，新接入请使用LicensePayMode和Payer
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 硬件序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * license授权有效期 
0：月度授权 
1：永久授权
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
    * 设备分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 设备分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 设备无流量包处理方式，0: 按量付费，1: 截断加速	
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

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
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 厂商备注 
     * @return VendorDescription 厂商备注
     */
    public String getVendorDescription() {
        return this.VendorDescription;
    }

    /**
     * Set 厂商备注
     * @param VendorDescription 厂商备注
     */
    public void setVendorDescription(String VendorDescription) {
        this.VendorDescription = VendorDescription;
    }

    /**
     * Get license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：后续将废弃此参数，新接入请使用LicensePayMode和Payer 
     * @return LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：后续将废弃此参数，新接入请使用LicensePayMode和Payer
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：后续将废弃此参数，新接入请使用LicensePayMode和Payer
     * @param LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注：后续将废弃此参数，新接入请使用LicensePayMode和Payer
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
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
     * Get license授权有效期 
0：月度授权 
1：永久授权 
     * @return LicensePayMode license授权有效期 
0：月度授权 
1：永久授权
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set license授权有效期 
0：月度授权 
1：永久授权
     * @param LicensePayMode license授权有效期 
0：月度授权 
1：永久授权
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

    /**
     * Get 设备分组ID 
     * @return GroupId 设备分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备分组ID
     * @param GroupId 设备分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 设备分组名称 
     * @return GroupName 设备分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备分组名称
     * @param GroupName 设备分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 设备无流量包处理方式，0: 按量付费，1: 截断加速	 
     * @return FlowTrunc 设备无流量包处理方式，0: 按量付费，1: 截断加速	
     */
    public Long getFlowTrunc() {
        return this.FlowTrunc;
    }

    /**
     * Set 设备无流量包处理方式，0: 按量付费，1: 截断加速	
     * @param FlowTrunc 设备无流量包处理方式，0: 按量付费，1: 截断加速	
     */
    public void setFlowTrunc(Long FlowTrunc) {
        this.FlowTrunc = FlowTrunc;
    }

    public HardwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HardwareInfo(HardwareInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VendorDescription != null) {
            this.VendorDescription = new String(source.VendorDescription);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.Payer != null) {
            this.Payer = new Long(source.Payer);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.FlowTrunc != null) {
            this.FlowTrunc = new Long(source.FlowTrunc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VendorDescription", this.VendorDescription);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);

    }
}

