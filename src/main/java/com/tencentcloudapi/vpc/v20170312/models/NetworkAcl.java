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

public class NetworkAcl extends AbstractModel{

    /**
    * `VPC`实例`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络ACL实例`ID`。
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 网络ACL名称，最大长度为60。
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 网络ACL关联的子网数组。
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
    * 网络ACl入站规则。
    */
    @SerializedName("IngressEntries")
    @Expose
    private NetworkAclEntry [] IngressEntries;

    /**
    * 网络ACL出站规则。
    */
    @SerializedName("EgressEntries")
    @Expose
    private NetworkAclEntry [] EgressEntries;

    /**
     * Get `VPC`实例`ID`。 
     * @return VpcId `VPC`实例`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`。
     * @param VpcId `VPC`实例`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络ACL实例`ID`。 
     * @return NetworkAclId 网络ACL实例`ID`。
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set 网络ACL实例`ID`。
     * @param NetworkAclId 网络ACL实例`ID`。
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get 网络ACL名称，最大长度为60。 
     * @return NetworkAclName 网络ACL名称，最大长度为60。
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set 网络ACL名称，最大长度为60。
     * @param NetworkAclName 网络ACL名称，最大长度为60。
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
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
     * Get 网络ACL关联的子网数组。 
     * @return SubnetSet 网络ACL关联的子网数组。
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 网络ACL关联的子网数组。
     * @param SubnetSet 网络ACL关联的子网数组。
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Get 网络ACl入站规则。 
     * @return IngressEntries 网络ACl入站规则。
     */
    public NetworkAclEntry [] getIngressEntries() {
        return this.IngressEntries;
    }

    /**
     * Set 网络ACl入站规则。
     * @param IngressEntries 网络ACl入站规则。
     */
    public void setIngressEntries(NetworkAclEntry [] IngressEntries) {
        this.IngressEntries = IngressEntries;
    }

    /**
     * Get 网络ACL出站规则。 
     * @return EgressEntries 网络ACL出站规则。
     */
    public NetworkAclEntry [] getEgressEntries() {
        return this.EgressEntries;
    }

    /**
     * Set 网络ACL出站规则。
     * @param EgressEntries 网络ACL出站规则。
     */
    public void setEgressEntries(NetworkAclEntry [] EgressEntries) {
        this.EgressEntries = EgressEntries;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "NetworkAclName", this.NetworkAclName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);
        this.setParamArrayObj(map, prefix + "IngressEntries.", this.IngressEntries);
        this.setParamArrayObj(map, prefix + "EgressEntries.", this.EgressEntries);

    }
}

