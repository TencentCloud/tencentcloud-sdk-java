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

public class DeviceBaseInfo extends AbstractModel {

    /**
    * <p>设备唯一ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>设备创建的时间，单位：ms</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>设备最后在线时间，单位：ms</p>
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * <p>设备的备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）</p>
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * <p>license授权有效期 0：月度授权 1：永久授权</p>
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * <p>付费方 0：厂商付费 1：客户付费</p>
    */
    @SerializedName("Payer")
    @Expose
    private Long Payer;

    /**
    * <p>设备分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>设备分组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>设备无流量包处理方式，0: 按量付费，1: 截断加速</p>
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

    /**
    * <p>设备sn</p>
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * <p>厂商</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>可接入地域列表。</p>
    */
    @SerializedName("AllowedRegions")
    @Expose
    private String [] AllowedRegions;

    /**
     * Get <p>设备唯一ID</p> 
     * @return DeviceId <p>设备唯一ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备唯一ID</p>
     * @param DeviceId <p>设备唯一ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>设备创建的时间，单位：ms</p> 
     * @return CreateTime <p>设备创建的时间，单位：ms</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>设备创建的时间，单位：ms</p>
     * @param CreateTime <p>设备创建的时间，单位：ms</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>设备最后在线时间，单位：ms</p> 
     * @return LastTime <p>设备最后在线时间，单位：ms</p>
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set <p>设备最后在线时间，单位：ms</p>
     * @param LastTime <p>设备最后在线时间，单位：ms</p>
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get <p>设备的备注</p> 
     * @return Remark <p>设备的备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>设备的备注</p>
     * @param Remark <p>设备的备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）</p> 
     * @return AccessScope <p>接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）</p>
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set <p>接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）</p>
     * @param AccessScope <p>接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。默认公有云网关。 具体含义： 公有云网关：即该设备只能接入公有云网关（就近接入） 自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入） 公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）</p>
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get <p>license授权有效期 0：月度授权 1：永久授权</p> 
     * @return LicensePayMode <p>license授权有效期 0：月度授权 1：永久授权</p>
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set <p>license授权有效期 0：月度授权 1：永久授权</p>
     * @param LicensePayMode <p>license授权有效期 0：月度授权 1：永久授权</p>
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get <p>付费方 0：厂商付费 1：客户付费</p> 
     * @return Payer <p>付费方 0：厂商付费 1：客户付费</p>
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set <p>付费方 0：厂商付费 1：客户付费</p>
     * @param Payer <p>付费方 0：厂商付费 1：客户付费</p>
     */
    public void setPayer(Long Payer) {
        this.Payer = Payer;
    }

    /**
     * Get <p>设备分组ID</p> 
     * @return GroupId <p>设备分组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>设备分组ID</p>
     * @param GroupId <p>设备分组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>设备分组名称</p> 
     * @return GroupName <p>设备分组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>设备分组名称</p>
     * @param GroupName <p>设备分组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>设备无流量包处理方式，0: 按量付费，1: 截断加速</p> 
     * @return FlowTrunc <p>设备无流量包处理方式，0: 按量付费，1: 截断加速</p>
     */
    public Long getFlowTrunc() {
        return this.FlowTrunc;
    }

    /**
     * Set <p>设备无流量包处理方式，0: 按量付费，1: 截断加速</p>
     * @param FlowTrunc <p>设备无流量包处理方式，0: 按量付费，1: 截断加速</p>
     */
    public void setFlowTrunc(Long FlowTrunc) {
        this.FlowTrunc = FlowTrunc;
    }

    /**
     * Get <p>设备sn</p> 
     * @return Sn <p>设备sn</p>
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set <p>设备sn</p>
     * @param Sn <p>设备sn</p>
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get <p>厂商</p> 
     * @return Vendor <p>厂商</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>厂商</p>
     * @param Vendor <p>厂商</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>可接入地域列表。</p> 
     * @return AllowedRegions <p>可接入地域列表。</p>
     */
    public String [] getAllowedRegions() {
        return this.AllowedRegions;
    }

    /**
     * Set <p>可接入地域列表。</p>
     * @param AllowedRegions <p>可接入地域列表。</p>
     */
    public void setAllowedRegions(String [] AllowedRegions) {
        this.AllowedRegions = AllowedRegions;
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
        if (source.AllowedRegions != null) {
            this.AllowedRegions = new String[source.AllowedRegions.length];
            for (int i = 0; i < source.AllowedRegions.length; i++) {
                this.AllowedRegions[i] = new String(source.AllowedRegions[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AllowedRegions.", this.AllowedRegions);

    }
}

