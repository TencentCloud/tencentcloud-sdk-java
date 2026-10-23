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
    * <p><code>EIP</code>的<code>ID</code>，是<code>EIP</code>的唯一标识。</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p><code>EIP</code>名称。</p>
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * <p><code>EIP</code>状态，包含&#39;CREATING&#39;(创建中),&#39;BINDING&#39;(绑定中),&#39;BIND&#39;(已绑定),&#39;UNBINDING&#39;(解绑中),&#39;UNBIND&#39;(已解绑),&#39;OFFLINING&#39;(释放中),&#39;BIND_ENI&#39;(绑定悬空弹性网卡)</p>
    */
    @SerializedName("AddressStatus")
    @Expose
    private String AddressStatus;

    /**
    * <p>外网IP地址</p>
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * <p>绑定的资源实例<code>ID</code>。可能是一个<code>CVM</code>，<code>NAT</code>。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>绑定的弹性网卡ID，null表示没有绑定弹性网卡。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>绑定的资源内网ip，null表示没有绑定资源内网ip。</p>
    */
    @SerializedName("PrivateAddressIp")
    @Expose
    private String PrivateAddressIp;

    /**
    * <p>资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态</p>
    */
    @SerializedName("IsArrears")
    @Expose
    private Boolean IsArrears;

    /**
    * <p>资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态</p>
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
    * <p>eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式</p>
    */
    @SerializedName("IsEipDirectConnection")
    @Expose
    private Boolean IsEipDirectConnection;

    /**
    * <p>EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：<code>CalcIP</code> 表示设备 IP，<code>WanIP</code> 表示普通公网 IP，<code>EIP</code> 表示弹性公网 IP，<code>AnycastEIP</code> 表示加速 EIP，<code>AntiDDoSEIP</code>表示高防EIP。</p>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * <p>eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放</p>
    */
    @SerializedName("CascadeRelease")
    @Expose
    private Boolean CascadeRelease;

    /**
    * <p>EIP ALG开启的协议类型。</p>
    */
    @SerializedName("EipAlgType")
    @Expose
    private AlgType EipAlgType;

    /**
    * <p>弹性公网IP的运营商信息，当前可能返回值包括&quot;CMCC&quot;(移动),&quot;CTCC&quot;(电信),&quot;CUCC&quot;(联通),&quot;BGP&quot;(常规BGP)。</p>
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * <p>是否本地带宽EIP，可选值：</p><li>true：本地带宽EIP</li><li>false：非本地带宽EIP</li>
    */
    @SerializedName("LocalBgp")
    @Expose
    private Boolean LocalBgp;

    /**
    * <p>弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。<br>注意：此字段可能返回 null，表示取不到有效值。<br>包括：</p><li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li><p style="padding-left: 30px;">表示包月带宽预付费。</p><li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时流量后付费。</p><li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时带宽后付费。</p><li><strong>BANDWIDTH_PACKAGE</strong></li><p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * <p>弹性公网IP关联的标签列表。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>预付费包月带宽IP到期时间。<br>时间格式：YYYY-MM-DDThh:mm:ssZ</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineDate")
    @Expose
    private String DeadlineDate;

    /**
    * <p>EIP绑定的实例类型。可选值：</p><li>CVM：云服务器</li><li>NAT：NAT 网关</li><li>HAVIP：高可用虚拟IP</li><li>ENI：弹性网卡</li><li>CLB：内网CLB</li><li>DHCPIP：弹性内网IP</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>静态单线IP网络出口</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * <p>高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.</p>
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * <p>当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:</p><li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * <p>传统弹性公网IPv6所属vpc唯一ID</p>
    */
    @SerializedName("UnVpcId")
    @Expose
    private String UnVpcId;

    /**
    * <p>CDC唯一ID</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>eip是否在网卡上可见。true表示支持，false表示不支持</p>
    */
    @SerializedName("EipVisibleOnEni")
    @Expose
    private Boolean EipVisibleOnEni;

    /**
     * Get <p><code>EIP</code>的<code>ID</code>，是<code>EIP</code>的唯一标识。</p> 
     * @return AddressId <p><code>EIP</code>的<code>ID</code>，是<code>EIP</code>的唯一标识。</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p><code>EIP</code>的<code>ID</code>，是<code>EIP</code>的唯一标识。</p>
     * @param AddressId <p><code>EIP</code>的<code>ID</code>，是<code>EIP</code>的唯一标识。</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p><code>EIP</code>名称。</p> 
     * @return AddressName <p><code>EIP</code>名称。</p>
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set <p><code>EIP</code>名称。</p>
     * @param AddressName <p><code>EIP</code>名称。</p>
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get <p><code>EIP</code>状态，包含&#39;CREATING&#39;(创建中),&#39;BINDING&#39;(绑定中),&#39;BIND&#39;(已绑定),&#39;UNBINDING&#39;(解绑中),&#39;UNBIND&#39;(已解绑),&#39;OFFLINING&#39;(释放中),&#39;BIND_ENI&#39;(绑定悬空弹性网卡)</p> 
     * @return AddressStatus <p><code>EIP</code>状态，包含&#39;CREATING&#39;(创建中),&#39;BINDING&#39;(绑定中),&#39;BIND&#39;(已绑定),&#39;UNBINDING&#39;(解绑中),&#39;UNBIND&#39;(已解绑),&#39;OFFLINING&#39;(释放中),&#39;BIND_ENI&#39;(绑定悬空弹性网卡)</p>
     */
    public String getAddressStatus() {
        return this.AddressStatus;
    }

    /**
     * Set <p><code>EIP</code>状态，包含&#39;CREATING&#39;(创建中),&#39;BINDING&#39;(绑定中),&#39;BIND&#39;(已绑定),&#39;UNBINDING&#39;(解绑中),&#39;UNBIND&#39;(已解绑),&#39;OFFLINING&#39;(释放中),&#39;BIND_ENI&#39;(绑定悬空弹性网卡)</p>
     * @param AddressStatus <p><code>EIP</code>状态，包含&#39;CREATING&#39;(创建中),&#39;BINDING&#39;(绑定中),&#39;BIND&#39;(已绑定),&#39;UNBINDING&#39;(解绑中),&#39;UNBIND&#39;(已解绑),&#39;OFFLINING&#39;(释放中),&#39;BIND_ENI&#39;(绑定悬空弹性网卡)</p>
     */
    public void setAddressStatus(String AddressStatus) {
        this.AddressStatus = AddressStatus;
    }

    /**
     * Get <p>外网IP地址</p> 
     * @return AddressIp <p>外网IP地址</p>
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set <p>外网IP地址</p>
     * @param AddressIp <p>外网IP地址</p>
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get <p>绑定的资源实例<code>ID</code>。可能是一个<code>CVM</code>，<code>NAT</code>。</p> 
     * @return InstanceId <p>绑定的资源实例<code>ID</code>。可能是一个<code>CVM</code>，<code>NAT</code>。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>绑定的资源实例<code>ID</code>。可能是一个<code>CVM</code>，<code>NAT</code>。</p>
     * @param InstanceId <p>绑定的资源实例<code>ID</code>。可能是一个<code>CVM</code>，<code>NAT</code>。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p> 
     * @return CreatedTime <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     * @param CreatedTime <p>创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>绑定的弹性网卡ID，null表示没有绑定弹性网卡。</p> 
     * @return NetworkInterfaceId <p>绑定的弹性网卡ID，null表示没有绑定弹性网卡。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p>绑定的弹性网卡ID，null表示没有绑定弹性网卡。</p>
     * @param NetworkInterfaceId <p>绑定的弹性网卡ID，null表示没有绑定弹性网卡。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>绑定的资源内网ip，null表示没有绑定资源内网ip。</p> 
     * @return PrivateAddressIp <p>绑定的资源内网ip，null表示没有绑定资源内网ip。</p>
     */
    public String getPrivateAddressIp() {
        return this.PrivateAddressIp;
    }

    /**
     * Set <p>绑定的资源内网ip，null表示没有绑定资源内网ip。</p>
     * @param PrivateAddressIp <p>绑定的资源内网ip，null表示没有绑定资源内网ip。</p>
     */
    public void setPrivateAddressIp(String PrivateAddressIp) {
        this.PrivateAddressIp = PrivateAddressIp;
    }

    /**
     * Get <p>资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态</p> 
     * @return IsArrears <p>资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态</p>
     */
    public Boolean getIsArrears() {
        return this.IsArrears;
    }

    /**
     * Set <p>资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态</p>
     * @param IsArrears <p>资源隔离状态。true表示eip处于隔离状态，false表示资源处于未隔离状态</p>
     */
    public void setIsArrears(Boolean IsArrears) {
        this.IsArrears = IsArrears;
    }

    /**
     * Get <p>资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态</p> 
     * @return IsBlocked <p>资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态</p>
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set <p>资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态</p>
     * @param IsBlocked <p>资源封堵状态。true表示eip处于封堵状态，false表示eip处于未封堵状态</p>
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    /**
     * Get <p>eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式</p> 
     * @return IsEipDirectConnection <p>eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式</p>
     */
    public Boolean getIsEipDirectConnection() {
        return this.IsEipDirectConnection;
    }

    /**
     * Set <p>eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式</p>
     * @param IsEipDirectConnection <p>eip是否支持直通模式。true表示eip支持直通模式，false表示资源不支持直通模式</p>
     */
    public void setIsEipDirectConnection(Boolean IsEipDirectConnection) {
        this.IsEipDirectConnection = IsEipDirectConnection;
    }

    /**
     * Get <p>EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：<code>CalcIP</code> 表示设备 IP，<code>WanIP</code> 表示普通公网 IP，<code>EIP</code> 表示弹性公网 IP，<code>AnycastEIP</code> 表示加速 EIP，<code>AntiDDoSEIP</code>表示高防EIP。</p> 
     * @return AddressType <p>EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：<code>CalcIP</code> 表示设备 IP，<code>WanIP</code> 表示普通公网 IP，<code>EIP</code> 表示弹性公网 IP，<code>AnycastEIP</code> 表示加速 EIP，<code>AntiDDoSEIP</code>表示高防EIP。</p>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：<code>CalcIP</code> 表示设备 IP，<code>WanIP</code> 表示普通公网 IP，<code>EIP</code> 表示弹性公网 IP，<code>AnycastEIP</code> 表示加速 EIP，<code>AntiDDoSEIP</code>表示高防EIP。</p>
     * @param AddressType <p>EIP 资源类型，包括CalcIP、WanIP、EIP和AnycastEIP、高防EIP。其中：<code>CalcIP</code> 表示设备 IP，<code>WanIP</code> 表示普通公网 IP，<code>EIP</code> 表示弹性公网 IP，<code>AnycastEIP</code> 表示加速 EIP，<code>AntiDDoSEIP</code>表示高防EIP。</p>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放</p> 
     * @return CascadeRelease <p>eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放</p>
     */
    public Boolean getCascadeRelease() {
        return this.CascadeRelease;
    }

    /**
     * Set <p>eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放</p>
     * @param CascadeRelease <p>eip是否在解绑后自动释放。true表示eip将会在解绑后自动释放，false表示eip在解绑后不会自动释放</p>
     */
    public void setCascadeRelease(Boolean CascadeRelease) {
        this.CascadeRelease = CascadeRelease;
    }

    /**
     * Get <p>EIP ALG开启的协议类型。</p> 
     * @return EipAlgType <p>EIP ALG开启的协议类型。</p>
     */
    public AlgType getEipAlgType() {
        return this.EipAlgType;
    }

    /**
     * Set <p>EIP ALG开启的协议类型。</p>
     * @param EipAlgType <p>EIP ALG开启的协议类型。</p>
     */
    public void setEipAlgType(AlgType EipAlgType) {
        this.EipAlgType = EipAlgType;
    }

    /**
     * Get <p>弹性公网IP的运营商信息，当前可能返回值包括&quot;CMCC&quot;(移动),&quot;CTCC&quot;(电信),&quot;CUCC&quot;(联通),&quot;BGP&quot;(常规BGP)。</p> 
     * @return InternetServiceProvider <p>弹性公网IP的运营商信息，当前可能返回值包括&quot;CMCC&quot;(移动),&quot;CTCC&quot;(电信),&quot;CUCC&quot;(联通),&quot;BGP&quot;(常规BGP)。</p>
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set <p>弹性公网IP的运营商信息，当前可能返回值包括&quot;CMCC&quot;(移动),&quot;CTCC&quot;(电信),&quot;CUCC&quot;(联通),&quot;BGP&quot;(常规BGP)。</p>
     * @param InternetServiceProvider <p>弹性公网IP的运营商信息，当前可能返回值包括&quot;CMCC&quot;(移动),&quot;CTCC&quot;(电信),&quot;CUCC&quot;(联通),&quot;BGP&quot;(常规BGP)。</p>
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get <p>是否本地带宽EIP，可选值：</p><li>true：本地带宽EIP</li><li>false：非本地带宽EIP</li> 
     * @return LocalBgp <p>是否本地带宽EIP，可选值：</p><li>true：本地带宽EIP</li><li>false：非本地带宽EIP</li>
     */
    public Boolean getLocalBgp() {
        return this.LocalBgp;
    }

    /**
     * Set <p>是否本地带宽EIP，可选值：</p><li>true：本地带宽EIP</li><li>false：非本地带宽EIP</li>
     * @param LocalBgp <p>是否本地带宽EIP，可选值：</p><li>true：本地带宽EIP</li><li>false：非本地带宽EIP</li>
     */
    public void setLocalBgp(Boolean LocalBgp) {
        this.LocalBgp = LocalBgp;
    }

    /**
     * Get <p>弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth <p>弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth <p>弹性公网IP的带宽值。注意，传统账户类型账户的弹性公网IP没有带宽属性，值为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。<br>注意：此字段可能返回 null，表示取不到有效值。<br>包括：</p><li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li><p style="padding-left: 30px;">表示包月带宽预付费。</p><li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时流量后付费。</p><li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时带宽后付费。</p><li><strong>BANDWIDTH_PACKAGE</strong></li><p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetChargeType <p>弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。<br>注意：此字段可能返回 null，表示取不到有效值。<br>包括：</p><li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li><p style="padding-left: 30px;">表示包月带宽预付费。</p><li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时流量后付费。</p><li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时带宽后付费。</p><li><strong>BANDWIDTH_PACKAGE</strong></li><p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set <p>弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。<br>注意：此字段可能返回 null，表示取不到有效值。<br>包括：</p><li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li><p style="padding-left: 30px;">表示包月带宽预付费。</p><li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时流量后付费。</p><li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时带宽后付费。</p><li><strong>BANDWIDTH_PACKAGE</strong></li><p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetChargeType <p>弹性公网IP的网络计费模式。注意，传统账户类型账户的弹性公网IP没有网络计费模式属性，值为空。<br>注意：此字段可能返回 null，表示取不到有效值。<br>包括：</p><li><strong>BANDWIDTH_PREPAID_BY_MONTH</strong></li><p style="padding-left: 30px;">表示包月带宽预付费。</p><li><strong>TRAFFIC_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时流量后付费。</p><li><strong>BANDWIDTH_POSTPAID_BY_HOUR</strong></li><p style="padding-left: 30px;">表示按小时带宽后付费。</p><li><strong>BANDWIDTH_PACKAGE</strong></li><p style="padding-left: 30px;">表示共享带宽包。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get <p>弹性公网IP关联的标签列表。</p> 
     * @return TagSet <p>弹性公网IP关联的标签列表。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>弹性公网IP关联的标签列表。</p>
     * @param TagSet <p>弹性公网IP关联的标签列表。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>预付费包月带宽IP到期时间。<br>时间格式：YYYY-MM-DDThh:mm:ssZ</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineDate <p>预付费包月带宽IP到期时间。<br>时间格式：YYYY-MM-DDThh:mm:ssZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineDate() {
        return this.DeadlineDate;
    }

    /**
     * Set <p>预付费包月带宽IP到期时间。<br>时间格式：YYYY-MM-DDThh:mm:ssZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineDate <p>预付费包月带宽IP到期时间。<br>时间格式：YYYY-MM-DDThh:mm:ssZ</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineDate(String DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }

    /**
     * Get <p>EIP绑定的实例类型。可选值：</p><li>CVM：云服务器</li><li>NAT：NAT 网关</li><li>HAVIP：高可用虚拟IP</li><li>ENI：弹性网卡</li><li>CLB：内网CLB</li><li>DHCPIP：弹性内网IP</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>EIP绑定的实例类型。可选值：</p><li>CVM：云服务器</li><li>NAT：NAT 网关</li><li>HAVIP：高可用虚拟IP</li><li>ENI：弹性网卡</li><li>CLB：内网CLB</li><li>DHCPIP：弹性内网IP</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>EIP绑定的实例类型。可选值：</p><li>CVM：云服务器</li><li>NAT：NAT 网关</li><li>HAVIP：高可用虚拟IP</li><li>ENI：弹性网卡</li><li>CLB：内网CLB</li><li>DHCPIP：弹性内网IP</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>EIP绑定的实例类型。可选值：</p><li>CVM：云服务器</li><li>NAT：NAT 网关</li><li>HAVIP：高可用虚拟IP</li><li>ENI：弹性网卡</li><li>CLB：内网CLB</li><li>DHCPIP：弹性内网IP</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>静态单线IP网络出口</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Egress <p>静态单线IP网络出口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set <p>静态单线IP网络出口</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Egress <p>静态单线IP网络出口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get <p>高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.</p> 
     * @return AntiDDoSPackageId <p>高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.</p>
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set <p>高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.</p>
     * @param AntiDDoSPackageId <p>高防包ID,当EIP类型为高防EIP时，返回EIP绑定的高防包ID.</p>
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get <p>当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:</p><li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li> 
     * @return RenewFlag <p>当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:</p><li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:</p><li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>
     * @param RenewFlag <p>当前EIP是否自动续费，只有按月带宽预付费的EIP才会显示该字段，具体值示例如下:</p><li>NOTIFY_AND_MANUAL_RENEW:正常续费</li><li>NOTIFY_AND_AUTO_RENEW:自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW:到期不续费 </li>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthPackageId <p>当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set <p>当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthPackageId <p>当前公网IP所关联的带宽包ID，如果该公网IP未使用带宽包计费，则返回为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get <p>传统弹性公网IPv6所属vpc唯一ID</p> 
     * @return UnVpcId <p>传统弹性公网IPv6所属vpc唯一ID</p>
     */
    public String getUnVpcId() {
        return this.UnVpcId;
    }

    /**
     * Set <p>传统弹性公网IPv6所属vpc唯一ID</p>
     * @param UnVpcId <p>传统弹性公网IPv6所属vpc唯一ID</p>
     */
    public void setUnVpcId(String UnVpcId) {
        this.UnVpcId = UnVpcId;
    }

    /**
     * Get <p>CDC唯一ID</p> 
     * @return DedicatedClusterId <p>CDC唯一ID</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>CDC唯一ID</p>
     * @param DedicatedClusterId <p>CDC唯一ID</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>eip是否在网卡上可见。true表示支持，false表示不支持</p> 
     * @return EipVisibleOnEni <p>eip是否在网卡上可见。true表示支持，false表示不支持</p>
     */
    public Boolean getEipVisibleOnEni() {
        return this.EipVisibleOnEni;
    }

    /**
     * Set <p>eip是否在网卡上可见。true表示支持，false表示不支持</p>
     * @param EipVisibleOnEni <p>eip是否在网卡上可见。true表示支持，false表示不支持</p>
     */
    public void setEipVisibleOnEni(Boolean EipVisibleOnEni) {
        this.EipVisibleOnEni = EipVisibleOnEni;
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
        if (source.EipVisibleOnEni != null) {
            this.EipVisibleOnEni = new Boolean(source.EipVisibleOnEni);
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
        this.setParamSimple(map, prefix + "EipVisibleOnEni", this.EipVisibleOnEni);

    }
}

