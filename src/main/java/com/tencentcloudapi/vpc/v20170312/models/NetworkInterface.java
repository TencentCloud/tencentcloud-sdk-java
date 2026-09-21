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

public class NetworkInterface extends AbstractModel {

    /**
    * <p>弹性网卡实例ID，例如：eni-f1xjkw1b。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>弹性网卡名称。</p>
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * <p>弹性网卡描述。</p>
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * <p>子网实例ID。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>VPC实例ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>绑定的安全组。</p>
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * <p>是否是主网卡。</p>
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * <p>MAC地址。</p>
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li><li><code>INUSE</code>：已绑定</li>
    */
    @SerializedName("NetworkInterfaceState")
    @Expose
    private String NetworkInterfaceState;

    /**
    * <p>内网IP信息。</p>
    */
    @SerializedName("PrivateIpAddressSet")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddressSet;

    /**
    * <p>绑定的云服务器对象。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachment")
    @Expose
    private NetworkInterfaceAttachment Attachment;

    /**
    * <p>可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>创建时间。格式：YYYY-MM-DD hh:mm:ss。示例值：2020-10-28 08:23:59</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p><code>IPv6</code>地址列表。</p>
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private Ipv6Address [] Ipv6AddressSet;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>网卡类型。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡</p>
    */
    @SerializedName("EniType")
    @Expose
    private Long EniType;

    /**
    * <p>网卡绑定的子机类型：cvm（普通CVM子机），eks（弹性容器服务Elastic Kubernetes Service）， hai（高性能应用服务Hyper Application Inventor）。</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>网卡所关联的CDC实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>弹性网卡类型：0:标准型/1:扩展型。默认值为0。</p>
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
    * <p>用于保留网卡主IP的资源ID用于保留网卡主IP的资源ID。用于删除网卡时作为入参数。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>服务质量级别：<br>PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p><p>可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
     * Get <p>弹性网卡实例ID，例如：eni-f1xjkw1b。</p> 
     * @return NetworkInterfaceId <p>弹性网卡实例ID，例如：eni-f1xjkw1b。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p>弹性网卡实例ID，例如：eni-f1xjkw1b。</p>
     * @param NetworkInterfaceId <p>弹性网卡实例ID，例如：eni-f1xjkw1b。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>弹性网卡名称。</p> 
     * @return NetworkInterfaceName <p>弹性网卡名称。</p>
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set <p>弹性网卡名称。</p>
     * @param NetworkInterfaceName <p>弹性网卡名称。</p>
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get <p>弹性网卡描述。</p> 
     * @return NetworkInterfaceDescription <p>弹性网卡描述。</p>
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set <p>弹性网卡描述。</p>
     * @param NetworkInterfaceDescription <p>弹性网卡描述。</p>
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get <p>子网实例ID。</p> 
     * @return SubnetId <p>子网实例ID。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网实例ID。</p>
     * @param SubnetId <p>子网实例ID。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>VPC实例ID。</p> 
     * @return VpcId <p>VPC实例ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。</p>
     * @param VpcId <p>VPC实例ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>绑定的安全组。</p> 
     * @return GroupSet <p>绑定的安全组。</p>
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set <p>绑定的安全组。</p>
     * @param GroupSet <p>绑定的安全组。</p>
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get <p>是否是主网卡。</p> 
     * @return Primary <p>是否是主网卡。</p>
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set <p>是否是主网卡。</p>
     * @param Primary <p>是否是主网卡。</p>
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get <p>MAC地址。</p> 
     * @return MacAddress <p>MAC地址。</p>
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set <p>MAC地址。</p>
     * @param MacAddress <p>MAC地址。</p>
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li> 
     * @return State <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li>
     * @param State <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li><li><code>INUSE</code>：已绑定</li> 
     * @return NetworkInterfaceState <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li><li><code>INUSE</code>：已绑定</li>
     */
    public String getNetworkInterfaceState() {
        return this.NetworkInterfaceState;
    }

    /**
     * Set <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li><li><code>INUSE</code>：已绑定</li>
     * @param NetworkInterfaceState <p>弹性网卡状态：</p><li><code>PENDING</code>：创建中</li><li><code>AVAILABLE</code>：可用的</li><li><code>ATTACHING</code>：绑定中</li><li><code>DETACHING</code>：解绑中</li><li><code>DELETING</code>：删除中</li><li><code>INUSE</code>：已绑定</li>
     */
    public void setNetworkInterfaceState(String NetworkInterfaceState) {
        this.NetworkInterfaceState = NetworkInterfaceState;
    }

    /**
     * Get <p>内网IP信息。</p> 
     * @return PrivateIpAddressSet <p>内网IP信息。</p>
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddressSet() {
        return this.PrivateIpAddressSet;
    }

    /**
     * Set <p>内网IP信息。</p>
     * @param PrivateIpAddressSet <p>内网IP信息。</p>
     */
    public void setPrivateIpAddressSet(PrivateIpAddressSpecification [] PrivateIpAddressSet) {
        this.PrivateIpAddressSet = PrivateIpAddressSet;
    }

    /**
     * Get <p>绑定的云服务器对象。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attachment <p>绑定的云服务器对象。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkInterfaceAttachment getAttachment() {
        return this.Attachment;
    }

    /**
     * Set <p>绑定的云服务器对象。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attachment <p>绑定的云服务器对象。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachment(NetworkInterfaceAttachment Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get <p>可用区。</p> 
     * @return Zone <p>可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。</p>
     * @param Zone <p>可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>创建时间。格式：YYYY-MM-DD hh:mm:ss。示例值：2020-10-28 08:23:59</p> 
     * @return CreatedTime <p>创建时间。格式：YYYY-MM-DD hh:mm:ss。示例值：2020-10-28 08:23:59</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。格式：YYYY-MM-DD hh:mm:ss。示例值：2020-10-28 08:23:59</p>
     * @param CreatedTime <p>创建时间。格式：YYYY-MM-DD hh:mm:ss。示例值：2020-10-28 08:23:59</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p><code>IPv6</code>地址列表。</p> 
     * @return Ipv6AddressSet <p><code>IPv6</code>地址列表。</p>
     */
    public Ipv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * Set <p><code>IPv6</code>地址列表。</p>
     * @param Ipv6AddressSet <p><code>IPv6</code>地址列表。</p>
     */
    public void setIpv6AddressSet(Ipv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>网卡类型。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡</p> 
     * @return EniType <p>网卡类型。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡</p>
     */
    public Long getEniType() {
        return this.EniType;
    }

    /**
     * Set <p>网卡类型。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡</p>
     * @param EniType <p>网卡类型。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡</p>
     */
    public void setEniType(Long EniType) {
        this.EniType = EniType;
    }

    /**
     * Get <p>网卡绑定的子机类型：cvm（普通CVM子机），eks（弹性容器服务Elastic Kubernetes Service）， hai（高性能应用服务Hyper Application Inventor）。</p> 
     * @return Business <p>网卡绑定的子机类型：cvm（普通CVM子机），eks（弹性容器服务Elastic Kubernetes Service）， hai（高性能应用服务Hyper Application Inventor）。</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>网卡绑定的子机类型：cvm（普通CVM子机），eks（弹性容器服务Elastic Kubernetes Service）， hai（高性能应用服务Hyper Application Inventor）。</p>
     * @param Business <p>网卡绑定的子机类型：cvm（普通CVM子机），eks（弹性容器服务Elastic Kubernetes Service）， hai（高性能应用服务Hyper Application Inventor）。</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>网卡所关联的CDC实例ID。</p> 
     * @return CdcId <p>网卡所关联的CDC实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>网卡所关联的CDC实例ID。</p>
     * @param CdcId <p>网卡所关联的CDC实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>弹性网卡类型：0:标准型/1:扩展型。默认值为0。</p> 
     * @return AttachType <p>弹性网卡类型：0:标准型/1:扩展型。默认值为0。</p>
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set <p>弹性网卡类型：0:标准型/1:扩展型。默认值为0。</p>
     * @param AttachType <p>弹性网卡类型：0:标准型/1:扩展型。默认值为0。</p>
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    /**
     * Get <p>用于保留网卡主IP的资源ID用于保留网卡主IP的资源ID。用于删除网卡时作为入参数。</p> 
     * @return ResourceId <p>用于保留网卡主IP的资源ID用于保留网卡主IP的资源ID。用于删除网卡时作为入参数。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>用于保留网卡主IP的资源ID用于保留网卡主IP的资源ID。用于删除网卡时作为入参数。</p>
     * @param ResourceId <p>用于保留网卡主IP的资源ID用于保留网卡主IP的资源ID。用于删除网卡时作为入参数。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>服务质量级别：<br>PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p><p>可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p> 
     * @return QosLevel <p>服务质量级别：<br>PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p><p>可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set <p>服务质量级别：<br>PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p><p>可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     * @param QosLevel <p>服务质量级别：<br>PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p><p>可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p> 
     * @return Ipv6Addresses <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     * @param Ipv6Addresses <p>指定的<code>IPv6</code>地址列表，单次最多指定10个。与入参<code>Ipv6AddressCount</code>合并计算配额。</p>
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p> 
     * @return Ipv6AddressCount <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     * @param Ipv6AddressCount <p>自动分配<code>IPv6</code>地址个数，内网IP地址个数总和不能超过配额数。与入参<code>Ipv6Addresses</code>合并计算配额。</p><p>取值范围：[1, 10]</p><p>单位：个</p>
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    public NetworkInterface() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterface(NetworkInterface source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new String[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new String(source.GroupSet[i]);
            }
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.NetworkInterfaceState != null) {
            this.NetworkInterfaceState = new String(source.NetworkInterfaceState);
        }
        if (source.PrivateIpAddressSet != null) {
            this.PrivateIpAddressSet = new PrivateIpAddressSpecification[source.PrivateIpAddressSet.length];
            for (int i = 0; i < source.PrivateIpAddressSet.length; i++) {
                this.PrivateIpAddressSet[i] = new PrivateIpAddressSpecification(source.PrivateIpAddressSet[i]);
            }
        }
        if (source.Attachment != null) {
            this.Attachment = new NetworkInterfaceAttachment(source.Attachment);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Ipv6AddressSet != null) {
            this.Ipv6AddressSet = new Ipv6Address[source.Ipv6AddressSet.length];
            for (int i = 0; i < source.Ipv6AddressSet.length; i++) {
                this.Ipv6AddressSet[i] = new Ipv6Address(source.Ipv6AddressSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.EniType != null) {
            this.EniType = new Long(source.EniType);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new Ipv6Address[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new Ipv6Address(source.Ipv6Addresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetworkInterfaceState", this.NetworkInterfaceState);
        this.setParamArrayObj(map, prefix + "PrivateIpAddressSet.", this.PrivateIpAddressSet);
        this.setParamObj(map, prefix + "Attachment.", this.Attachment);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Ipv6AddressSet.", this.Ipv6AddressSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "EniType", this.EniType);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

