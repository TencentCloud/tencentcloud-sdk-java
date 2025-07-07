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

public class CreateAndAttachNetworkInterfaceRequest extends AbstractModel {

    /**
    * VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。

    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 弹性网卡名称，最大长度不能超过60个字符。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 云服务器实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定的内网IP信息，单次最多指定10个。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * 新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 指定绑定的安全组，例如：['sg-1dd51d']。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。

    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 弹性网卡描述，可任意命名，但不得超过60个字符。
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 绑定类型：0 标准型 1 扩展型。
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
    * 是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false。
    */
    @SerializedName("IsRdma")
    @Expose
    private Boolean IsRdma;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。	
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
 
     * @return VpcId VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。

     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。

     * @param VpcId VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。

     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 弹性网卡名称，最大长度不能超过60个字符。 
     * @return NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字符。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set 弹性网卡名称，最大长度不能超过60个字符。
     * @param NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字符。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。 
     * @return SubnetId 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     * @param SubnetId 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 云服务器实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。 
     * @return InstanceId 云服务器实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云服务器实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
     * @param InstanceId 云服务器实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定的内网IP信息，单次最多指定10个。 
     * @return PrivateIpAddresses 指定的内网IP信息，单次最多指定10个。
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 指定的内网IP信息，单次最多指定10个。
     * @param PrivateIpAddresses 指定的内网IP信息，单次最多指定10个。
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。 
     * @return SecondaryPrivateIpAddressCount 新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set 新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。
     * @param SecondaryPrivateIpAddressCount 新申请的内网IP地址个数，内网IP地址个数总和不能超过配额数。
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。 
     * @return QosLevel IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     * @param QosLevel IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get 指定绑定的安全组，例如：['sg-1dd51d']。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
 
     * @return SecurityGroupIds 指定绑定的安全组，例如：['sg-1dd51d']。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。

     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 指定绑定的安全组，例如：['sg-1dd51d']。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。

     * @param SecurityGroupIds 指定绑定的安全组，例如：['sg-1dd51d']。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。

     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 弹性网卡描述，可任意命名，但不得超过60个字符。 
     * @return NetworkInterfaceDescription 弹性网卡描述，可任意命名，但不得超过60个字符。
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set 弹性网卡描述，可任意命名，但不得超过60个字符。
     * @param NetworkInterfaceDescription 弹性网卡描述，可任意命名，但不得超过60个字符。
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 绑定类型：0 标准型 1 扩展型。 
     * @return AttachType 绑定类型：0 标准型 1 扩展型。
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set 绑定类型：0 标准型 1 扩展型。
     * @param AttachType 绑定类型：0 标准型 1 扩展型。
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    /**
     * Get 是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false。 
     * @return IsRdma 是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false。
     */
    public Boolean getIsRdma() {
        return this.IsRdma;
    }

    /**
     * Set 是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false。
     * @param IsRdma 是否创建RDMA弹性网卡，true:创建rdma弹性网卡，false:普通弹性网卡。不填默认为false。
     */
    public void setIsRdma(Boolean IsRdma) {
        this.IsRdma = IsRdma;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。	 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。	
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。	
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。	
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateAndAttachNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndAttachNetworkInterfaceRequest(CreateAndAttachNetworkInterfaceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new PrivateIpAddressSpecification[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new PrivateIpAddressSpecification(source.PrivateIpAddresses[i]);
            }
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
        if (source.IsRdma != null) {
            this.IsRdma = new Boolean(source.IsRdma);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);
        this.setParamSimple(map, prefix + "IsRdma", this.IsRdma);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

