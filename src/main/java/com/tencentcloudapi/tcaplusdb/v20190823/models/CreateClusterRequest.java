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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel{

    /**
    * 集群数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * 集群名称，可使用中文或英文字符，最大长度32个字符
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群所绑定的子网实例ID，形如：subnet-pxir56ns
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 集群标签列表
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
    * 集群是否开启IPv6功能
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
     * Get 集群数据描述语言类型，如：`PROTO`，`TDR`或`MIX` 
     * @return IdlType 集群数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set 集群数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     * @param IdlType 集群数据描述语言类型，如：`PROTO`，`TDR`或`MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get 集群名称，可使用中文或英文字符，最大长度32个字符 
     * @return ClusterName 集群名称，可使用中文或英文字符，最大长度32个字符
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称，可使用中文或英文字符，最大长度32个字符
     * @param ClusterName 集群名称，可使用中文或英文字符，最大长度32个字符
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z 
     * @return VpcId 集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     * @param VpcId 集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群所绑定的子网实例ID，形如：subnet-pxir56ns 
     * @return SubnetId 集群所绑定的子网实例ID，形如：subnet-pxir56ns
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 集群所绑定的子网实例ID，形如：subnet-pxir56ns
     * @param SubnetId 集群所绑定的子网实例ID，形如：subnet-pxir56ns
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母 
     * @return Password 集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     * @param Password 集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 集群标签列表 
     * @return ResourceTags 集群标签列表
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 集群标签列表
     * @param ResourceTags 集群标签列表
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 集群是否开启IPv6功能 
     * @return Ipv6Enable 集群是否开启IPv6功能
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set 集群是否开启IPv6功能
     * @param Ipv6Enable 集群是否开启IPv6功能
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);

    }
}

