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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel{

    /**
    * `EIP`的`ID`，是`EIP`的唯一标识。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * `EIP`名称。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * `EIP`状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
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
    * 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 绑定的弹性网卡ID
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 绑定的资源内网ip
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
    * EIP ALG开启的协议类型。
    */
    @SerializedName("EipAlgType")
    @Expose
    private AlgType EipAlgType;

    /**
    * 弹性公网IP的运营商信息，当前可能返回值包括"CMCC","CTCC","CUCC","BGP"
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 是否本地带宽EIP
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

    /**
    * 弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
     * Get `EIP`的`ID`，是`EIP`的唯一标识。 
     * @return AddressId `EIP`的`ID`，是`EIP`的唯一标识。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set `EIP`的`ID`，是`EIP`的唯一标识。
     * @param AddressId `EIP`的`ID`，是`EIP`的唯一标识。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get `EIP`名称。 
     * @return AddressName `EIP`名称。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set `EIP`名称。
     * @param AddressName `EIP`名称。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get `EIP`状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡) 
     * @return AddressStatus `EIP`状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * Set `EIP`状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
     * @param AddressStatus `EIP`状态，包含'CREATING'(创建中),'BINDING'(绑定中),'BIND'(已绑定),'UNBINDING'(解绑中),'UNBIND'(已解绑),'OFFLINING'(释放中),'BIND_ENI'(绑定悬空弹性网卡)
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
     * Get 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`。 
     * @return InstanceId 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`。
     * @param InstanceId 绑定的资源实例`ID`。可能是一个`CVM`，`NAT`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 绑定的弹性网卡ID 
     * @return NetworkInterfaceId 绑定的弹性网卡ID
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 绑定的弹性网卡ID
     * @param NetworkInterfaceId 绑定的弹性网卡ID
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 绑定的资源内网ip 
     * @return PrivateAddressIp 绑定的资源内网ip
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set 绑定的资源内网ip
     * @param PrivateAddressIp 绑定的资源内网ip
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
     * Get EIP ALG开启的协议类型。 
     * @return EipAlgType EIP ALG开启的协议类型。
     */
    public AlgType getEipAlgType() {
        return this.EipAlgType;
    }

    /**
     * Set EIP ALG开启的协议类型。
     * @param EipAlgType EIP ALG开启的协议类型。
     */
    public void setEipAlgType(AlgType EipAlgType) {
        this.EipAlgType = EipAlgType;
    }

    /**
     * Get 弹性公网IP的运营商信息，当前可能返回值包括"CMCC","CTCC","CUCC","BGP" 
     * @return InternetServiceProvider 弹性公网IP的运营商信息，当前可能返回值包括"CMCC","CTCC","CUCC","BGP"
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set 弹性公网IP的运营商信息，当前可能返回值包括"CMCC","CTCC","CUCC","BGP"
     * @param InternetServiceProvider 弹性公网IP的运营商信息，当前可能返回值包括"CMCC","CTCC","CUCC","BGP"
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 是否本地带宽EIP 
     * @return LocalBgp 是否本地带宽EIP
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set 是否本地带宽EIP
     * @param LocalBgp 是否本地带宽EIP
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
    }

    /**
     * Get 弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetChargeType 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetChargeType 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
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
        this.setParamObj(map, prefix + "EipAlgType.", this.EipAlgType);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "LocalBgp", this.LocalBgp);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);

    }
}

