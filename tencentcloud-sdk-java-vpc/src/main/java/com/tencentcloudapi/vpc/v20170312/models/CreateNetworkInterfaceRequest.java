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

public class CreateNetworkInterfaceRequest extends AbstractModel{

    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 弹性网卡名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 弹性网卡描述，可任意命名，但不得超过60个字符。
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * 新申请的内网IP地址个数，内网IP地址个数总和不能超过配数。
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * 指定绑定的安全组，例如：['sg-1dd51d']。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 指定的内网IP信息，单次最多指定10个。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。 
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 弹性网卡名称，最大长度不能超过60个字节。 
     * @return NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字节。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set 弹性网卡名称，最大长度不能超过60个字节。
     * @param NetworkInterfaceName 弹性网卡名称，最大长度不能超过60个字节。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。 
     * @return SubnetId 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。
     * @param SubnetId 弹性网卡所在的子网实例ID，例如：subnet-0ap8nwca。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get 新申请的内网IP地址个数，内网IP地址个数总和不能超过配数。 
     * @return SecondaryPrivateIpAddressCount 新申请的内网IP地址个数，内网IP地址个数总和不能超过配数。
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set 新申请的内网IP地址个数，内网IP地址个数总和不能超过配数。
     * @param SecondaryPrivateIpAddressCount 新申请的内网IP地址个数，内网IP地址个数总和不能超过配数。
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get 指定绑定的安全组，例如：['sg-1dd51d']。 
     * @return SecurityGroupIds 指定绑定的安全组，例如：['sg-1dd51d']。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 指定绑定的安全组，例如：['sg-1dd51d']。
     * @param SecurityGroupIds 指定绑定的安全组，例如：['sg-1dd51d']。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
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
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

