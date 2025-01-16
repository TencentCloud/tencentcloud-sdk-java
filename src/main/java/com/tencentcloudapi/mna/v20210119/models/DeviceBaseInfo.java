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

public class DeviceBaseInfo extends AbstractModel {

    /**
    * 设备唯一ID
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
    * 设备创建的时间，单位：ms
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 设备最后在线时间，单位：ms
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 设备的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * license授权有效期 0：月度授权 1：永久授权
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * 付费方 0：厂商付费 1：客户付费
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
    * 设备sn
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 厂商
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
     * Get 设备唯一ID 
     * @return DeviceId 设备唯一ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一ID
     * @param DeviceId 设备唯一ID
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
     * Get 设备创建的时间，单位：ms 
     * @return CreateTime 设备创建的时间，单位：ms
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备创建的时间，单位：ms
     * @param CreateTime 设备创建的时间，单位：ms
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备最后在线时间，单位：ms 
     * @return LastTime 设备最后在线时间，单位：ms
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 设备最后在线时间，单位：ms
     * @param LastTime 设备最后在线时间，单位：ms
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 设备的备注 
     * @return Remark 设备的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 设备的备注
     * @param Remark 设备的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入） 
     * @return AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     * @param AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get license授权有效期 0：月度授权 1：永久授权 
     * @return LicensePayMode license授权有效期 0：月度授权 1：永久授权
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set license授权有效期 0：月度授权 1：永久授权
     * @param LicensePayMode license授权有效期 0：月度授权 1：永久授权
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get 付费方 0：厂商付费 1：客户付费 
     * @return Payer 付费方 0：厂商付费 1：客户付费
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set 付费方 0：厂商付费 1：客户付费
     * @param Payer 付费方 0：厂商付费 1：客户付费
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

    /**
     * Get 设备sn 
     * @return Sn 设备sn
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set 设备sn
     * @param Sn 设备sn
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 厂商 
     * @return Vendor 厂商
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 厂商
     * @param Vendor 厂商
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public DeviceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceBaseInfo(DeviceBaseInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
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
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);

    }
}

