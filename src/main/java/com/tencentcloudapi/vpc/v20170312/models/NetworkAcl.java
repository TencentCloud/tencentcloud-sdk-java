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
    * <p><code>VPC</code>实例<code>ID</code>。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>网络ACL实例<code>ID</code>。</p>
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * <p>网络ACL名称，最大长度为60。</p>
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>网络ACL关联的子网数组。</p>
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
    * <p>该参数仅对三元组ACL有效，网络ACl入站规则。</p>
    */
    @SerializedName("IngressEntries")
    @Expose
    private NetworkAclEntry [] IngressEntries;

    /**
    * <p>该参数仅对三元组ACL有效，网络ACL出站规则。</p>
    */
    @SerializedName("EgressEntries")
    @Expose
    private NetworkAclEntry [] EgressEntries;

    /**
    * <p>网络ACL类型。三元组：&#39;TRIPLE&#39;   五元组：&#39;QUINTUPLE&#39;</p>
    */
    @SerializedName("NetworkAclType")
    @Expose
    private String NetworkAclType;

    /**
    * <p>标签键值对</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p><code>VPC</code>实例<code>ID</code>。</p> 
     * @return VpcId <p><code>VPC</code>实例<code>ID</code>。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p><code>VPC</code>实例<code>ID</code>。</p>
     * @param VpcId <p><code>VPC</code>实例<code>ID</code>。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>网络ACL实例<code>ID</code>。</p> 
     * @return NetworkAclId <p>网络ACL实例<code>ID</code>。</p>
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set <p>网络ACL实例<code>ID</code>。</p>
     * @param NetworkAclId <p>网络ACL实例<code>ID</code>。</p>
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get <p>网络ACL名称，最大长度为60。</p> 
     * @return NetworkAclName <p>网络ACL名称，最大长度为60。</p>
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set <p>网络ACL名称，最大长度为60。</p>
     * @param NetworkAclName <p>网络ACL名称，最大长度为60。</p>
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>网络ACL关联的子网数组。</p> 
     * @return SubnetSet <p>网络ACL关联的子网数组。</p>
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set <p>网络ACL关联的子网数组。</p>
     * @param SubnetSet <p>网络ACL关联的子网数组。</p>
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Get <p>该参数仅对三元组ACL有效，网络ACl入站规则。</p> 
     * @return IngressEntries <p>该参数仅对三元组ACL有效，网络ACl入站规则。</p>
     */
    public NetworkAclEntry [] getIngressEntries() {
        return this.IngressEntries;
    }

    /**
     * Set <p>该参数仅对三元组ACL有效，网络ACl入站规则。</p>
     * @param IngressEntries <p>该参数仅对三元组ACL有效，网络ACl入站规则。</p>
     */
    public void setIngressEntries(NetworkAclEntry [] IngressEntries) {
        this.IngressEntries = IngressEntries;
    }

    /**
     * Get <p>该参数仅对三元组ACL有效，网络ACL出站规则。</p> 
     * @return EgressEntries <p>该参数仅对三元组ACL有效，网络ACL出站规则。</p>
     */
    public NetworkAclEntry [] getEgressEntries() {
        return this.EgressEntries;
    }

    /**
     * Set <p>该参数仅对三元组ACL有效，网络ACL出站规则。</p>
     * @param EgressEntries <p>该参数仅对三元组ACL有效，网络ACL出站规则。</p>
     */
    public void setEgressEntries(NetworkAclEntry [] EgressEntries) {
        this.EgressEntries = EgressEntries;
    }

    /**
     * Get <p>网络ACL类型。三元组：&#39;TRIPLE&#39;   五元组：&#39;QUINTUPLE&#39;</p> 
     * @return NetworkAclType <p>网络ACL类型。三元组：&#39;TRIPLE&#39;   五元组：&#39;QUINTUPLE&#39;</p>
     */
    public String getNetworkAclType() {
        return this.NetworkAclType;
    }

    /**
     * Set <p>网络ACL类型。三元组：&#39;TRIPLE&#39;   五元组：&#39;QUINTUPLE&#39;</p>
     * @param NetworkAclType <p>网络ACL类型。三元组：&#39;TRIPLE&#39;   五元组：&#39;QUINTUPLE&#39;</p>
     */
    public void setNetworkAclType(String NetworkAclType) {
        this.NetworkAclType = NetworkAclType;
    }

    /**
     * Get <p>标签键值对</p> 
     * @return TagSet <p>标签键值对</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对</p>
     * @param TagSet <p>标签键值对</p>
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

