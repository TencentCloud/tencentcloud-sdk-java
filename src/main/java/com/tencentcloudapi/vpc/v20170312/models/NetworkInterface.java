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

public class NetworkInterface extends AbstractModel{

    /**
    * 弹性网卡实例ID，例如：eni-f1xjkw1b。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 弹性网卡名称。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 弹性网卡描述。
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * 子网实例ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 绑定的安全组。
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * 是否是主网卡。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * MAC地址。
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 内网IP信息。
    */
    @SerializedName("PrivateIpAddressSet")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddressSet;

    /**
    * 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachment")
    @Expose
    private NetworkInterfaceAttachment Attachment;

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * `IPv6`地址列表。
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private Ipv6Address [] Ipv6AddressSet;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 网卡类型。0 - 弹性网卡；1 - evm弹性网卡。
    */
    @SerializedName("EniType")
    @Expose
    private Long EniType;

    /**
    * 网卡绑定的子机类型：cvm，eks。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 网卡所关联的CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 弹性网卡类型：0:标准型/1:扩展型。默认值为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
     * Get 弹性网卡实例ID，例如：eni-f1xjkw1b。 
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-f1xjkw1b。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，例如：eni-f1xjkw1b。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-f1xjkw1b。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 弹性网卡名称。 
     * @return NetworkInterfaceName 弹性网卡名称。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set 弹性网卡名称。
     * @param NetworkInterfaceName 弹性网卡名称。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get 弹性网卡描述。 
     * @return NetworkInterfaceDescription 弹性网卡描述。
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set 弹性网卡描述。
     * @param NetworkInterfaceDescription 弹性网卡描述。
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get 子网实例ID。 
     * @return SubnetId 子网实例ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID。
     * @param SubnetId 子网实例ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 绑定的安全组。 
     * @return GroupSet 绑定的安全组。
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 绑定的安全组。
     * @param GroupSet 绑定的安全组。
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get 是否是主网卡。 
     * @return Primary 是否是主网卡。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set 是否是主网卡。
     * @param Primary 是否是主网卡。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get MAC地址。 
     * @return MacAddress MAC地址。
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC地址。
     * @param MacAddress MAC地址。
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li> 
     * @return State 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     * @param State 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 内网IP信息。 
     * @return PrivateIpAddressSet 内网IP信息。
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddressSet() {
        return this.PrivateIpAddressSet;
    }

    /**
     * Set 内网IP信息。
     * @param PrivateIpAddressSet 内网IP信息。
     */
    public void setPrivateIpAddressSet(PrivateIpAddressSpecification [] PrivateIpAddressSet) {
        this.PrivateIpAddressSet = PrivateIpAddressSet;
    }

    /**
     * Get 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attachment 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkInterfaceAttachment getAttachment() {
        return this.Attachment;
    }

    /**
     * Set 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attachment 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachment(NetworkInterfaceAttachment Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get `IPv6`地址列表。 
     * @return Ipv6AddressSet `IPv6`地址列表。
     */
    public Ipv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * Set `IPv6`地址列表。
     * @param Ipv6AddressSet `IPv6`地址列表。
     */
    public void setIpv6AddressSet(Ipv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 网卡类型。0 - 弹性网卡；1 - evm弹性网卡。 
     * @return EniType 网卡类型。0 - 弹性网卡；1 - evm弹性网卡。
     */
    public Long getEniType() {
        return this.EniType;
    }

    /**
     * Set 网卡类型。0 - 弹性网卡；1 - evm弹性网卡。
     * @param EniType 网卡类型。0 - 弹性网卡；1 - evm弹性网卡。
     */
    public void setEniType(Long EniType) {
        this.EniType = EniType;
    }

    /**
     * Get 网卡绑定的子机类型：cvm，eks。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Business 网卡绑定的子机类型：cvm，eks。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 网卡绑定的子机类型：cvm，eks。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Business 网卡绑定的子机类型：cvm，eks。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 网卡所关联的CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId 网卡所关联的CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 网卡所关联的CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId 网卡所关联的CDC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 弹性网卡类型：0:标准型/1:扩展型。默认值为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachType 弹性网卡类型：0:标准型/1:扩展型。默认值为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set 弹性网卡类型：0:标准型/1:扩展型。默认值为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachType 弹性网卡类型：0:标准型/1:扩展型。默认值为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
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

    }
}

