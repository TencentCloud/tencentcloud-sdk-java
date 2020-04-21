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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel{

    /**
    * EIP的ID，是EIP的唯一标识。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * EIP名称。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * EIP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
    */
    @SerializedName("AddressStatus")
    @Expose
    private String AddressStatus;

    /**
    * 外网IP地址
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * 绑定的资源实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间。ISO 8601 格式：YYYY-MM-DDTHH:mm:ss.sssZ
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 绑定的弹性网卡ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 绑定的资源内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateAddressIp")
    @Expose
    private String PrivateAddressIp;

    /**
    * 资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态
    */
    @SerializedName("IsArrears")
    @Expose
    private Boolean IsArrears;

    /**
    * 资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
    * eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式
    */
    @SerializedName("IsEipDirectConnection")
    @Expose
    private Boolean IsEipDirectConnection;

    /**
    * eip资源类型，包括"CalcIP","WanIP","EIP","AnycastEIP"。其中"CalcIP"表示设备ip，“WanIP”表示普通公网ip，“EIP”表示弹性公网ip，“AnycastEip”表示加速EIP
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放
    */
    @SerializedName("CascadeRelease")
    @Expose
    private Boolean CascadeRelease;

    /**
    * 运营商，CTCC电信，CUCC联通，CMCC移动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
     * Get EIP的ID，是EIP的唯一标识。 
     * @return AddressId EIP的ID，是EIP的唯一标识。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP的ID，是EIP的唯一标识。
     * @param AddressId EIP的ID，是EIP的唯一标识。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get EIP名称。 
     * @return AddressName EIP名称。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIP名称。
     * @param AddressName EIP名称。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get EIP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡) 
     * @return AddressStatus EIP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * Set EIP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
     * @param AddressStatus EIP状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
     */
    public void setAddressStatus(String AddressStatus) {
        this.AddressStatus = AddressStatus;
    }

    /**
     * Get 外网IP地址 
     * @return AddressIp 外网IP地址
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 外网IP地址
     * @param AddressIp 外网IP地址
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get 绑定的资源实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 绑定的资源实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 绑定的资源实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 绑定的资源实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建时间。ISO 8601 格式：YYYY-MM-DDTHH:mm:ss.sssZ 
     * @return CreatedTime 创建时间。ISO 8601 格式：YYYY-MM-DDTHH:mm:ss.sssZ
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。ISO 8601 格式：YYYY-MM-DDTHH:mm:ss.sssZ
     * @param CreatedTime 创建时间。ISO 8601 格式：YYYY-MM-DDTHH:mm:ss.sssZ
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 绑定的弹性网卡ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkInterfaceId 绑定的弹性网卡ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 绑定的弹性网卡ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkInterfaceId 绑定的弹性网卡ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 绑定的资源内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateAddressIp 绑定的资源内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set 绑定的资源内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateAddressIp 绑定的资源内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateAddressIp(String PrivateAddressIp) {
        this.PrivateAddressIp = PrivateAddressIp;
    }

    /**
     * Get 资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态 
     * @return IsArrears 资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态
     */
    public Boolean getIsArrears() {
        return this.IsArrears;
    }

    /**
     * Set 资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态
     * @param IsArrears 资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态
     */
    public void setIsArrears(Boolean IsArrears) {
        this.IsArrears = IsArrears;
    }

    /**
     * Get 资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态 
     * @return IsBlocked 资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set 资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态
     * @param IsBlocked 资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    /**
     * Get eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式 
     * @return IsEipDirectConnection eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式
     */
    public Boolean getIsEipDirectConnection() {
        return this.IsEipDirectConnection;
    }

    /**
     * Set eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式
     * @param IsEipDirectConnection eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式
     */
    public void setIsEipDirectConnection(Boolean IsEipDirectConnection) {
        this.IsEipDirectConnection = IsEipDirectConnection;
    }

    /**
     * Get eip资源类型，包括"CalcIP","WanIP","EIP","AnycastEIP"。其中"CalcIP"表示设备ip，“WanIP”表示普通公网ip，“EIP”表示弹性公网ip，“AnycastEip”表示加速EIP 
     * @return AddressType eip资源类型，包括"CalcIP","WanIP","EIP","AnycastEIP"。其中"CalcIP"表示设备ip，“WanIP”表示普通公网ip，“EIP”表示弹性公网ip，“AnycastEip”表示加速EIP
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set eip资源类型，包括"CalcIP","WanIP","EIP","AnycastEIP"。其中"CalcIP"表示设备ip，“WanIP”表示普通公网ip，“EIP”表示弹性公网ip，“AnycastEip”表示加速EIP
     * @param AddressType eip资源类型，包括"CalcIP","WanIP","EIP","AnycastEIP"。其中"CalcIP"表示设备ip，“WanIP”表示普通公网ip，“EIP”表示弹性公网ip，“AnycastEip”表示加速EIP
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放 
     * @return CascadeRelease eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放
     */
    public Boolean getCascadeRelease() {
        return this.CascadeRelease;
    }

    /**
     * Set eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放
     * @param CascadeRelease eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放
     */
    public void setCascadeRelease(Boolean CascadeRelease) {
        this.CascadeRelease = CascadeRelease;
    }

    /**
     * Get 运营商，CTCC电信，CUCC联通，CMCC移动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetServiceProvider 运营商，CTCC电信，CUCC联通，CMCC移动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set 运营商，CTCC电信，CUCC联通，CMCC移动
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetServiceProvider 运营商，CTCC电信，CUCC联通，CMCC移动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressStatus", this.AddressStatus);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateAddressIp", this.PrivateAddressIp);
        this.setParamSimple(map, prefix + "IsArrears", this.IsArrears);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);
        this.setParamSimple(map, prefix + "IsEipDirectConnection", this.IsEipDirectConnection);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CascadeRelease", this.CascadeRelease);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);

    }
}

