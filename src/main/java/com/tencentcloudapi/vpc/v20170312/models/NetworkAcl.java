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

public class NetworkAcl extends AbstractModel {

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
    * 该参数仅对三元组ACL有效，网络ACl入站规则。
    */
    @SerializedName("IngressEntries")
    @Expose
    private NetworkAclEntry [] IngressEntries;

    /**
    * 该参数仅对三元组ACL有效，网络ACL出站规则。
    */
    @SerializedName("EgressEntries")
    @Expose
    private NetworkAclEntry [] EgressEntries;

    /**
    * 网络ACL类型。三元组：'TRIPLE'   五元组：'QUINTUPLE'
    */
    @SerializedName("NetworkAclType")
    @Expose
    private String NetworkAclType;

    /**
    * 标签键值对
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

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
     * Get 该参数仅对三元组ACL有效，网络ACl入站规则。 
     * @return IngressEntries 该参数仅对三元组ACL有效，网络ACl入站规则。
     */
    public NetworkAclEntry [] getIngressEntries() {
        return this.IngressEntries;
    }

    /**
     * Set 该参数仅对三元组ACL有效，网络ACl入站规则。
     * @param IngressEntries 该参数仅对三元组ACL有效，网络ACl入站规则。
     */
    public void setIngressEntries(NetworkAclEntry [] IngressEntries) {
        this.IngressEntries = IngressEntries;
    }

    /**
     * Get 该参数仅对三元组ACL有效，网络ACL出站规则。 
     * @return EgressEntries 该参数仅对三元组ACL有效，网络ACL出站规则。
     */
    public NetworkAclEntry [] getEgressEntries() {
        return this.EgressEntries;
    }

    /**
     * Set 该参数仅对三元组ACL有效，网络ACL出站规则。
     * @param EgressEntries 该参数仅对三元组ACL有效，网络ACL出站规则。
     */
    public void setEgressEntries(NetworkAclEntry [] EgressEntries) {
        this.EgressEntries = EgressEntries;
    }

    /**
     * Get 网络ACL类型。三元组：'TRIPLE'   五元组：'QUINTUPLE' 
     * @return NetworkAclType 网络ACL类型。三元组：'TRIPLE'   五元组：'QUINTUPLE'
     */
    public String getNetworkAclType() {
        return this.NetworkAclType;
    }

    /**
     * Set 网络ACL类型。三元组：'TRIPLE'   五元组：'QUINTUPLE'
     * @param NetworkAclType 网络ACL类型。三元组：'TRIPLE'   五元组：'QUINTUPLE'
     */
    public void setNetworkAclType(String NetworkAclType) {
        this.NetworkAclType = NetworkAclType;
    }

    /**
     * Get 标签键值对 
     * @return TagSet 标签键值对
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对
     * @param TagSet 标签键值对
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public NetworkAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAcl(NetworkAcl source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.NetworkAclName != null) {
            this.NetworkAclName = new String(source.NetworkAclName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new Subnet[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new Subnet(source.SubnetSet[i]);
            }
        }
        if (source.IngressEntries != null) {
            this.IngressEntries = new NetworkAclEntry[source.IngressEntries.length];
            for (int i = 0; i < source.IngressEntries.length; i++) {
                this.IngressEntries[i] = new NetworkAclEntry(source.IngressEntries[i]);
            }
        }
        if (source.EgressEntries != null) {
            this.EgressEntries = new NetworkAclEntry[source.EgressEntries.length];
            for (int i = 0; i < source.EgressEntries.length; i++) {
                this.EgressEntries[i] = new NetworkAclEntry(source.EgressEntries[i]);
            }
        }
        if (source.NetworkAclType != null) {
            this.NetworkAclType = new String(source.NetworkAclType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "NetworkAclType", this.NetworkAclType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

