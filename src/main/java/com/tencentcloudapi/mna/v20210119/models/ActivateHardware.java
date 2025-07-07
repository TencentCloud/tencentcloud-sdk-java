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

public class ActivateHardware extends AbstractModel {

    /**
    * 厂商名称
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 设备SN序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备密钥
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
    * 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * 当付费方为租户时，可选择租户license付费方式：
0，月度授权
1，永久授权
若不传则默认为月度授权。
当付费方为厂商时，此参数无效

    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * 设备分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 设备分组名称，预留参数，需要分组时传入GroupId
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
    * 激活后的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 厂商名称 
     * @return Vendor 厂商名称
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 厂商名称
     * @param Vendor 厂商名称
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 设备SN序列号 
     * @return SN 设备SN序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 设备SN序列号
     * @param SN 设备SN序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
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
     * Get 设备密钥 
     * @return DataKey 设备密钥
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set 设备密钥
     * @param DataKey 设备密钥
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    /**
     * Get 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入） 
     * @return AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     * @param AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get 当付费方为租户时，可选择租户license付费方式：
0，月度授权
1，永久授权
若不传则默认为月度授权。
当付费方为厂商时，此参数无效
 
     * @return LicensePayMode 当付费方为租户时，可选择租户license付费方式：
0，月度授权
1，永久授权
若不传则默认为月度授权。
当付费方为厂商时，此参数无效

     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set 当付费方为租户时，可选择租户license付费方式：
0，月度授权
1，永久授权
若不传则默认为月度授权。
当付费方为厂商时，此参数无效

     * @param LicensePayMode 当付费方为租户时，可选择租户license付费方式：
0，月度授权
1，永久授权
若不传则默认为月度授权。
当付费方为厂商时，此参数无效

     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
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
     * Get 设备分组名称，预留参数，需要分组时传入GroupId 
     * @return GroupName 设备分组名称，预留参数，需要分组时传入GroupId
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备分组名称，预留参数，需要分组时传入GroupId
     * @param GroupName 设备分组名称，预留参数，需要分组时传入GroupId
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

    /**
     * Get 激活后的设备ID 
     * @return DeviceId 激活后的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 激活后的设备ID
     * @param DeviceId 激活后的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public ActivateHardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateHardware(ActivateHardware source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
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
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

