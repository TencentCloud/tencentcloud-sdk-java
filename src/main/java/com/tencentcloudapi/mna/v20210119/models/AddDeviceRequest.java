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

public class AddDeviceRequest extends AbstractModel {

    /**
    * 新建设备的名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 新建设备的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
    * 是否设置预置密钥
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。
具体含义：
公有云网关：即该设备只能接入公有云网关（就近接入）
自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入）
公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * license付费方式： 
0，月度授权 
1，永久授权 
若不传则默认为月度授权，永久授权设备需要调用OrderPerLicense接口支付授权费，否则设备无法使用
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * 设备分组名称，非必选，预留参数，需要分组时传入GroupId
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 设备分组ID，非必选，如果不填写则默认设备无分组
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 设备无流量包处理方式，0: 按量付费，1: 截断加速
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

    /**
     * Get 新建设备的名称 
     * @return DeviceName 新建设备的名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 新建设备的名称
     * @param DeviceName 新建设备的名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 新建设备的备注 
     * @return Remark 新建设备的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 新建设备的备注
     * @param Remark 新建设备的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成 
     * @return DataKey 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     * @param DataKey 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    /**
     * Get 是否设置预置密钥 
     * @return Encrypted 是否设置预置密钥
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set 是否设置预置密钥
     * @param Encrypted 是否设置预置密钥
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。
具体含义：
公有云网关：即该设备只能接入公有云网关（就近接入）
自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入）
公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入） 
     * @return AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。
具体含义：
公有云网关：即该设备只能接入公有云网关（就近接入）
自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入）
公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。
具体含义：
公有云网关：即该设备只能接入公有云网关（就近接入）
自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入）
公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     * @param AccessScope 接入环境。0：公有云网关；1：自有网关；2：公有云网关和自有网关。不填默认公有云网关。
具体含义：
公有云网关：即该设备只能接入公有云网关（就近接入）
自有网关：即该设备只能接入已经注册上线的自有网关（就近接入或固定ip接入）
公有云网关和自有网关：即该设备同时可以接入公有云网关和已经注册上线的自有网关（就近接入或固定ip接入）
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get license付费方式： 
0，月度授权 
1，永久授权 
若不传则默认为月度授权，永久授权设备需要调用OrderPerLicense接口支付授权费，否则设备无法使用 
     * @return LicensePayMode license付费方式： 
0，月度授权 
1，永久授权 
若不传则默认为月度授权，永久授权设备需要调用OrderPerLicense接口支付授权费，否则设备无法使用
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set license付费方式： 
0，月度授权 
1，永久授权 
若不传则默认为月度授权，永久授权设备需要调用OrderPerLicense接口支付授权费，否则设备无法使用
     * @param LicensePayMode license付费方式： 
0，月度授权 
1，永久授权 
若不传则默认为月度授权，永久授权设备需要调用OrderPerLicense接口支付授权费，否则设备无法使用
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get 设备分组名称，非必选，预留参数，需要分组时传入GroupId 
     * @return GroupName 设备分组名称，非必选，预留参数，需要分组时传入GroupId
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备分组名称，非必选，预留参数，需要分组时传入GroupId
     * @param GroupName 设备分组名称，非必选，预留参数，需要分组时传入GroupId
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 设备分组ID，非必选，如果不填写则默认设备无分组 
     * @return GroupId 设备分组ID，非必选，如果不填写则默认设备无分组
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备分组ID，非必选，如果不填写则默认设备无分组
     * @param GroupId 设备分组ID，非必选，如果不填写则默认设备无分组
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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

    public AddDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeviceRequest(AddDeviceRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.FlowTrunc != null) {
            this.FlowTrunc = new Long(source.FlowTrunc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);

    }
}

