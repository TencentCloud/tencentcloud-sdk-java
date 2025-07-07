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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

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
    * 绑定的弹性网卡ID，null表示没有绑定弹性网卡。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 绑定的资源内网ip，null表示没有绑定资源内网ip。
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
    * EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：`CalcIP` 表示设备 IP，`WanIP` 表示普通公网 IP，`EIP` 表示弹性公网 IP，`AnycastEIP` 表示加速 EIP，`AntiDDoSEIP`表示高防EIP。
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
    * 弹性公网IP的运营商信息，当前可能返回值包括"CMCC"(移动),"CTCC"(电信),"CUCC"(联通),"BGP"(常规BGP)。
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 是否本地带宽EIP，可选值：
<li>true：本地带宽EIP</li>
<li>false：非本地带宽EIP</li>
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
包括：
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">表示包月带宽预付费。</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时流量后付费。</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时带宽后付费。</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 弹性公网IP关联的标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 预付费包月带宽IP到期时间。
时间格式：YYYY-MM-DDThh:mm:ssZ
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineDate")
    @Expose
    private String DeadlineDate;

    /**
    * EIP绑定的实例类型。可选值：
<li>CVM：云服务器</li>
<li>NAT：NAT 网关</li>
<li>HAVIP：高可用虚拟IP</li>
<li>ENI：弹性网卡</li>
<li>CLB：内网CLB</li>
<li>DHCPIP：弹性内网IP</li>


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 静态单线IP网络出口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * 高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * 当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:
<li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>

    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 传统弹性公网IPv6所属vpc唯一ID
    */
    @SerializedName("UnVpcId")
    @Expose
    private String UnVpcId;

    /**
    * CDC唯一ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

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
     * Get 绑定的弹性网卡ID，null表示没有绑定弹性网卡。 
     * @return NetworkInterfaceId 绑定的弹性网卡ID，null表示没有绑定弹性网卡。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 绑定的弹性网卡ID，null表示没有绑定弹性网卡。
     * @param NetworkInterfaceId 绑定的弹性网卡ID，null表示没有绑定弹性网卡。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 绑定的资源内网ip，null表示没有绑定资源内网ip。 
     * @return PrivateAddressIp 绑定的资源内网ip，null表示没有绑定资源内网ip。
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set 绑定的资源内网ip，null表示没有绑定资源内网ip。
     * @param PrivateAddressIp 绑定的资源内网ip，null表示没有绑定资源内网ip。
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
     * Get EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：`CalcIP` 表示设备 IP，`WanIP` 表示普通公网 IP，`EIP` 表示弹性公网 IP，`AnycastEIP` 表示加速 EIP，`AntiDDoSEIP`表示高防EIP。 
     * @return AddressType EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：`CalcIP` 表示设备 IP，`WanIP` 表示普通公网 IP，`EIP` 表示弹性公网 IP，`AnycastEIP` 表示加速 EIP，`AntiDDoSEIP`表示高防EIP。
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：`CalcIP` 表示设备 IP，`WanIP` 表示普通公网 IP，`EIP` 表示弹性公网 IP，`AnycastEIP` 表示加速 EIP，`AntiDDoSEIP`表示高防EIP。
     * @param AddressType EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：`CalcIP` 表示设备 IP，`WanIP` 表示普通公网 IP，`EIP` 表示弹性公网 IP，`AnycastEIP` 表示加速 EIP，`AntiDDoSEIP`表示高防EIP。
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
     * Get 弹性公网IP的运营商信息，当前可能返回值包括"CMCC"(移动),"CTCC"(电信),"CUCC"(联通),"BGP"(常规BGP)。 
     * @return InternetServiceProvider 弹性公网IP的运营商信息，当前可能返回值包括"CMCC"(移动),"CTCC"(电信),"CUCC"(联通),"BGP"(常规BGP)。
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set 弹性公网IP的运营商信息，当前可能返回值包括"CMCC"(移动),"CTCC"(电信),"CUCC"(联通),"BGP"(常规BGP)。
     * @param InternetServiceProvider 弹性公网IP的运营商信息，当前可能返回值包括"CMCC"(移动),"CTCC"(电信),"CUCC"(联通),"BGP"(常规BGP)。
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 是否本地带宽EIP，可选值：
<li>true：本地带宽EIP</li>
<li>false：非本地带宽EIP</li> 
     * @return LocalBgp 是否本地带宽EIP，可选值：
<li>true：本地带宽EIP</li>
<li>false：非本地带宽EIP</li>
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set 是否本地带宽EIP，可选值：
<li>true：本地带宽EIP</li>
<li>false：非本地带宽EIP</li>
     * @param LocalBgp 是否本地带宽EIP，可选值：
<li>true：本地带宽EIP</li>
<li>false：非本地带宽EIP</li>
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
包括：
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">表示包月带宽预付费。</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时流量后付费。</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时带宽后付费。</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetChargeType 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
包括：
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">表示包月带宽预付费。</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时流量后付费。</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时带宽后付费。</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
包括：
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">表示包月带宽预付费。</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时流量后付费。</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时带宽后付费。</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetChargeType 弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。
注意：此字段可能返回 null，表示取不到有效值。
包括：
<li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li>
<p style="padding-left: 30px;">表示包月带宽预付费。</p>
<li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时流量后付费。</p>
<li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li>
<p style="padding-left: 30px;">表示按小时带宽后付费。</p>
<li><strong>BANDWIDTH_PACKAGE</strong></li>
<p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 弹性公网IP关联的标签列表。 
     * @return TagSet 弹性公网IP关联的标签列表。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 弹性公网IP关联的标签列表。
     * @param TagSet 弹性公网IP关联的标签列表。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 预付费包月带宽IP到期时间。
时间格式：YYYY-MM-DDThh:mm:ssZ
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineDate 预付费包月带宽IP到期时间。
时间格式：YYYY-MM-DDThh:mm:ssZ
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineDate() {
        return this.DeadlineDate;
    }

    /**
     * Set 预付费包月带宽IP到期时间。
时间格式：YYYY-MM-DDThh:mm:ssZ
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineDate 预付费包月带宽IP到期时间。
时间格式：YYYY-MM-DDThh:mm:ssZ
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineDate(String DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }

    /**
     * Get EIP绑定的实例类型。可选值：
<li>CVM：云服务器</li>
<li>NAT：NAT 网关</li>
<li>HAVIP：高可用虚拟IP</li>
<li>ENI：弹性网卡</li>
<li>CLB：内网CLB</li>
<li>DHCPIP：弹性内网IP</li>


注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType EIP绑定的实例类型。可选值：
<li>CVM：云服务器</li>
<li>NAT：NAT 网关</li>
<li>HAVIP：高可用虚拟IP</li>
<li>ENI：弹性网卡</li>
<li>CLB：内网CLB</li>
<li>DHCPIP：弹性内网IP</li>


注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set EIP绑定的实例类型。可选值：
<li>CVM：云服务器</li>
<li>NAT：NAT 网关</li>
<li>HAVIP：高可用虚拟IP</li>
<li>ENI：弹性网卡</li>
<li>CLB：内网CLB</li>
<li>DHCPIP：弹性内网IP</li>


注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType EIP绑定的实例类型。可选值：
<li>CVM：云服务器</li>
<li>NAT：NAT 网关</li>
<li>HAVIP：高可用虚拟IP</li>
<li>ENI：弹性网卡</li>
<li>CLB：内网CLB</li>
<li>DHCPIP：弹性内网IP</li>


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 静态单线IP网络出口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Egress 静态单线IP网络出口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set 静态单线IP网络出口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Egress 静态单线IP网络出口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID. 
     * @return AntiDDoSPackageId 高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set 高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.
     * @param AntiDDoSPackageId 高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get 当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:
<li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>
 
     * @return RenewFlag 当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:
<li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>

     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:
<li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>

     * @param RenewFlag 当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:
<li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>

     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthPackageId 当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthPackageId 当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 传统弹性公网IPv6所属vpc唯一ID 
     * @return UnVpcId 传统弹性公网IPv6所属vpc唯一ID
     */
    public String getUnVpcId() {
        return this.UnVpcId;
    }

    /**
     * Set 传统弹性公网IPv6所属vpc唯一ID
     * @param UnVpcId 传统弹性公网IPv6所属vpc唯一ID
     */
    public void setUnVpcId(String UnVpcId) {
        this.UnVpcId = UnVpcId;
    }

    /**
     * Get CDC唯一ID 
     * @return DedicatedClusterId CDC唯一ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC唯一ID
     * @param DedicatedClusterId CDC唯一ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.AddressStatus != null) {
            this.AddressStatus = new String(source.AddressStatus);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateAddressIp != null) {
            this.PrivateAddressIp = new String(source.PrivateAddressIp);
        }
        if (source.IsArrears != null) {
            this.IsArrears = new Boolean(source.IsArrears);
        }
        if (source.IsBlocked != null) {
            this.IsBlocked = new Boolean(source.IsBlocked);
        }
        if (source.IsEipDirectConnection != null) {
            this.IsEipDirectConnection = new Boolean(source.IsEipDirectConnection);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.CascadeRelease != null) {
            this.CascadeRelease = new Boolean(source.CascadeRelease);
        }
        if (source.EipAlgType != null) {
            this.EipAlgType = new AlgType(source.EipAlgType);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.LocalBgp != null) {
            this.LocalBgp = new Boolean(source.LocalBgp);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DeadlineDate != null) {
            this.DeadlineDate = new String(source.DeadlineDate);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.UnVpcId != null) {
            this.UnVpcId = new String(source.UnVpcId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
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
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "DeadlineDate", this.DeadlineDate);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "UnVpcId", this.UnVpcId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

