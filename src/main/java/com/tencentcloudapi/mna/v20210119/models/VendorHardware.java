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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

    /**
    * 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 激活状态， 空：全部； 1:待激活； 2:已激活
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 激活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 厂商备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * 最后在线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
     * Get 硬件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardwareId 硬件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set 硬件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardwareId 硬件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
    }

    /**
     * Get 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SN 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SN 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 激活状态， 空：全部； 1:待激活； 2:已激活
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 激活状态， 空：全部； 1:待激活； 2:已激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 激活状态， 空：全部； 1:待激活； 2:已激活
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 激活状态， 空：全部； 1:待激活； 2:已激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 激活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveTime 激活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 厂商备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 厂商备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 厂商备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 厂商备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseChargingMode license计费模式： 1，租户月付费 2，厂商月付费 3，license永久授权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
    }

    /**
     * Get 最后在线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOnlineTime 最后在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set 最后在线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOnlineTime 最后在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
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

    }
}

