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
    * 独占集群占用的svr机器
    */
    @SerializedName("ServerList")
    @Expose
    private MachineInfo [] ServerList;

    /**
    * 独占集群占用的proxy机器
    */
    @SerializedName("ProxyList")
    @Expose
    private MachineInfo [] ProxyList;

    /**
    * 集群类型1共享2独占
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 密码认证类型，0 静态认证， 1 签名认证
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

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
     * Get 独占集群占用的svr机器 
     * @return ServerList 独占集群占用的svr机器
     */
    public MachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set 独占集群占用的svr机器
     * @param ServerList 独占集群占用的svr机器
     */
    public void setServerList(MachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get 独占集群占用的proxy机器 
     * @return ProxyList 独占集群占用的proxy机器
     */
    public MachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set 独占集群占用的proxy机器
     * @param ProxyList 独占集群占用的proxy机器
     */
    public void setProxyList(MachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get 集群类型1共享2独占 
     * @return ClusterType 集群类型1共享2独占
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型1共享2独占
     * @param ClusterType 集群类型1共享2独占
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 密码认证类型，0 静态认证， 1 签名认证 
     * @return AuthType 密码认证类型，0 静态认证， 1 签名认证
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 密码认证类型，0 静态认证， 1 签名认证
     * @param AuthType 密码认证类型，0 静态认证， 1 签名认证
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.IdlType != null) {
            this.IdlType = new String(source.IdlType);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfoUnit[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfoUnit(source.ResourceTags[i]);
            }
        }
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
        if (source.ServerList != null) {
            this.ServerList = new MachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new MachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new MachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new MachineInfo(source.ProxyList[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
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
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);

    }
}

