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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * <p>集群数据描述语言类型，统一填<code>MIX</code></p><p>枚举值：</p><ul><li>MIX： 同时支持<code>PROTO</code>，<code>TDR</code>表</li></ul>
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * <p>集群名称，可使用中文或英文字符，最大长度32个字符</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>集群所绑定的子网实例ID，形如：subnet-pxir56ns</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>集群标签列表</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
    * <p>集群是否开启IPv6功能</p>
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
    * <p>独占集群占用的svr机器</p>
    */
    @SerializedName("ServerList")
    @Expose
    private MachineInfo [] ServerList;

    /**
    * <p>独占集群占用的proxy机器</p>
    */
    @SerializedName("ProxyList")
    @Expose
    private MachineInfo [] ProxyList;

    /**
    * <p>集群类型1共享2独占</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>密码认证类型，0 静态认证， 1 签名认证</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
     * Get <p>集群数据描述语言类型，统一填<code>MIX</code></p><p>枚举值：</p><ul><li>MIX： 同时支持<code>PROTO</code>，<code>TDR</code>表</li></ul> 
     * @return IdlType <p>集群数据描述语言类型，统一填<code>MIX</code></p><p>枚举值：</p><ul><li>MIX： 同时支持<code>PROTO</code>，<code>TDR</code>表</li></ul>
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set <p>集群数据描述语言类型，统一填<code>MIX</code></p><p>枚举值：</p><ul><li>MIX： 同时支持<code>PROTO</code>，<code>TDR</code>表</li></ul>
     * @param IdlType <p>集群数据描述语言类型，统一填<code>MIX</code></p><p>枚举值：</p><ul><li>MIX： 同时支持<code>PROTO</code>，<code>TDR</code>表</li></ul>
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get <p>集群名称，可使用中文或英文字符，最大长度32个字符</p> 
     * @return ClusterName <p>集群名称，可使用中文或英文字符，最大长度32个字符</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称，可使用中文或英文字符，最大长度32个字符</p>
     * @param ClusterName <p>集群名称，可使用中文或英文字符，最大长度32个字符</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z</p> 
     * @return VpcId <p>集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z</p>
     * @param VpcId <p>集群所绑定的私有网络实例ID，形如：vpc-f49l6u0z</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>集群所绑定的子网实例ID，形如：subnet-pxir56ns</p> 
     * @return SubnetId <p>集群所绑定的子网实例ID，形如：subnet-pxir56ns</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>集群所绑定的子网实例ID，形如：subnet-pxir56ns</p>
     * @param SubnetId <p>集群所绑定的子网实例ID，形如：subnet-pxir56ns</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母</p> 
     * @return Password <p>集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母</p>
     * @param Password <p>集群访问密码，必须是a-zA-Z0-9的字符,且必须包含数字和大小写字母</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>集群标签列表</p> 
     * @return ResourceTags <p>集群标签列表</p>
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>集群标签列表</p>
     * @param ResourceTags <p>集群标签列表</p>
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>集群是否开启IPv6功能</p> 
     * @return Ipv6Enable <p>集群是否开启IPv6功能</p>
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set <p>集群是否开启IPv6功能</p>
     * @param Ipv6Enable <p>集群是否开启IPv6功能</p>
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Get <p>独占集群占用的svr机器</p> 
     * @return ServerList <p>独占集群占用的svr机器</p>
     */
    public MachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set <p>独占集群占用的svr机器</p>
     * @param ServerList <p>独占集群占用的svr机器</p>
     */
    public void setServerList(MachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get <p>独占集群占用的proxy机器</p> 
     * @return ProxyList <p>独占集群占用的proxy机器</p>
     */
    public MachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set <p>独占集群占用的proxy机器</p>
     * @param ProxyList <p>独占集群占用的proxy机器</p>
     */
    public void setProxyList(MachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get <p>集群类型1共享2独占</p> 
     * @return ClusterType <p>集群类型1共享2独占</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型1共享2独占</p>
     * @param ClusterType <p>集群类型1共享2独占</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>密码认证类型，0 静态认证， 1 签名认证</p> 
     * @return AuthType <p>密码认证类型，0 静态认证， 1 签名认证</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>密码认证类型，0 静态认证， 1 签名认证</p>
     * @param AuthType <p>密码认证类型，0 静态认证， 1 签名认证</p>
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

