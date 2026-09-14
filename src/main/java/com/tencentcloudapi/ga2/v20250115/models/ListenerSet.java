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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerSet extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>监听器ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>监听器名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>监听器描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>协议。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口范围。</p>
    */
    @SerializedName("PortRanges")
    @Expose
    private PortRanges PortRanges;

    /**
    * <p>是否打开七层获取源IP方式。</p>
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * <p>开启会话保持。</p>
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * <p>会话保持时间。</p>
    */
    @SerializedName("ClientAffinityTime")
    @Expose
    private Long ClientAffinityTime;

    /**
    * <p>SSL解析方式。</p>
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * <p>服务器证书。</p>
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * <p>客户端证书。</p>
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * <p>TLS密码套件包。</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>HTTP版本。</p>
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * <p>请求超时时间。</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>监听路由类型。</p>
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * <p>监听器状态。</p><p>枚举值：</p><ul><li>ACTIVE： 可用。</li><li>CREATING： 创建中。</li><li>DELETING： 删除中。</li><li>CONFIGURING： 修改配置中。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>所属监听器终端节点组个数。</p>
    */
    @SerializedName("EndpointGroupCounts")
    @Expose
    private Long EndpointGroupCounts;

    /**
    * <p>四层获取源IP方式。</p>
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
    * <p>连接超时时间。</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>监听器ID。</p> 
     * @return ListenerId <p>监听器ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器ID。</p>
     * @param ListenerId <p>监听器ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>监听器名称。</p> 
     * @return Name <p>监听器名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>监听器名称。</p>
     * @param Name <p>监听器名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>监听器描述。</p> 
     * @return Description <p>监听器描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>监听器描述。</p>
     * @param Description <p>监听器描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>协议。</p> 
     * @return Protocol <p>协议。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议。</p>
     * @param Protocol <p>协议。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口范围。</p> 
     * @return PortRanges <p>端口范围。</p>
     */
    public PortRanges getPortRanges() {
        return this.PortRanges;
    }

    /**
     * Set <p>端口范围。</p>
     * @param PortRanges <p>端口范围。</p>
     */
    public void setPortRanges(PortRanges PortRanges) {
        this.PortRanges = PortRanges;
    }

    /**
     * Get <p>是否打开七层获取源IP方式。</p> 
     * @return XForwardedForRealIp <p>是否打开七层获取源IP方式。</p>
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set <p>是否打开七层获取源IP方式。</p>
     * @param XForwardedForRealIp <p>是否打开七层获取源IP方式。</p>
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get <p>开启会话保持。</p> 
     * @return ClientAffinity <p>开启会话保持。</p>
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set <p>开启会话保持。</p>
     * @param ClientAffinity <p>开启会话保持。</p>
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get <p>会话保持时间。</p> 
     * @return ClientAffinityTime <p>会话保持时间。</p>
     */
    public Long getClientAffinityTime() {
        return this.ClientAffinityTime;
    }

    /**
     * Set <p>会话保持时间。</p>
     * @param ClientAffinityTime <p>会话保持时间。</p>
     */
    public void setClientAffinityTime(Long ClientAffinityTime) {
        this.ClientAffinityTime = ClientAffinityTime;
    }

    /**
     * Get <p>SSL解析方式。</p> 
     * @return CertificationType <p>SSL解析方式。</p>
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set <p>SSL解析方式。</p>
     * @param CertificationType <p>SSL解析方式。</p>
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get <p>服务器证书。</p> 
     * @return ServerCertificates <p>服务器证书。</p>
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set <p>服务器证书。</p>
     * @param ServerCertificates <p>服务器证书。</p>
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get <p>客户端证书。</p> 
     * @return ClientCaCertificates <p>客户端证书。</p>
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set <p>客户端证书。</p>
     * @param ClientCaCertificates <p>客户端证书。</p>
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get <p>TLS密码套件包。</p> 
     * @return CipherPolicyId <p>TLS密码套件包。</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>TLS密码套件包。</p>
     * @param CipherPolicyId <p>TLS密码套件包。</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>HTTP版本。</p> 
     * @return HttpVersion <p>HTTP版本。</p>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>HTTP版本。</p>
     * @param HttpVersion <p>HTTP版本。</p>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get <p>请求超时时间。</p> 
     * @return RequestTimeout <p>请求超时时间。</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>请求超时时间。</p>
     * @param RequestTimeout <p>请求超时时间。</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>监听路由类型。</p> 
     * @return ListenerType <p>监听路由类型。</p>
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set <p>监听路由类型。</p>
     * @param ListenerType <p>监听路由类型。</p>
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get <p>监听器状态。</p><p>枚举值：</p><ul><li>ACTIVE： 可用。</li><li>CREATING： 创建中。</li><li>DELETING： 删除中。</li><li>CONFIGURING： 修改配置中。</li></ul> 
     * @return Status <p>监听器状态。</p><p>枚举值：</p><ul><li>ACTIVE： 可用。</li><li>CREATING： 创建中。</li><li>DELETING： 删除中。</li><li>CONFIGURING： 修改配置中。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>监听器状态。</p><p>枚举值：</p><ul><li>ACTIVE： 可用。</li><li>CREATING： 创建中。</li><li>DELETING： 删除中。</li><li>CONFIGURING： 修改配置中。</li></ul>
     * @param Status <p>监听器状态。</p><p>枚举值：</p><ul><li>ACTIVE： 可用。</li><li>CREATING： 创建中。</li><li>DELETING： 删除中。</li><li>CONFIGURING： 修改配置中。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>所属监听器终端节点组个数。</p> 
     * @return EndpointGroupCounts <p>所属监听器终端节点组个数。</p>
     */
    public Long getEndpointGroupCounts() {
        return this.EndpointGroupCounts;
    }

    /**
     * Set <p>所属监听器终端节点组个数。</p>
     * @param EndpointGroupCounts <p>所属监听器终端节点组个数。</p>
     */
    public void setEndpointGroupCounts(Long EndpointGroupCounts) {
        this.EndpointGroupCounts = EndpointGroupCounts;
    }

    /**
     * Get <p>四层获取源IP方式。</p> 
     * @return GetRealIpType <p>四层获取源IP方式。</p>
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set <p>四层获取源IP方式。</p>
     * @param GetRealIpType <p>四层获取源IP方式。</p>
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    /**
     * Get <p>连接超时时间。</p> 
     * @return IdleTimeout <p>连接超时时间。</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>连接超时时间。</p>
     * @param IdleTimeout <p>连接超时时间。</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public ListenerSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerSet(ListenerSet source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PortRanges != null) {
            this.PortRanges = new PortRanges(source.PortRanges);
        }
        if (source.XForwardedForRealIp != null) {
            this.XForwardedForRealIp = new Boolean(source.XForwardedForRealIp);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.ClientAffinityTime != null) {
            this.ClientAffinityTime = new Long(source.ClientAffinityTime);
        }
        if (source.CertificationType != null) {
            this.CertificationType = new String(source.CertificationType);
        }
        if (source.ServerCertificates != null) {
            this.ServerCertificates = new String[source.ServerCertificates.length];
            for (int i = 0; i < source.ServerCertificates.length; i++) {
                this.ServerCertificates[i] = new String(source.ServerCertificates[i]);
            }
        }
        if (source.ClientCaCertificates != null) {
            this.ClientCaCertificates = new String[source.ClientCaCertificates.length];
            for (int i = 0; i < source.ClientCaCertificates.length; i++) {
                this.ClientCaCertificates[i] = new String(source.ClientCaCertificates[i]);
            }
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ListenerType != null) {
            this.ListenerType = new String(source.ListenerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EndpointGroupCounts != null) {
            this.EndpointGroupCounts = new Long(source.EndpointGroupCounts);
        }
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "PortRanges.", this.PortRanges);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "ClientAffinityTime", this.ClientAffinityTime);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndpointGroupCounts", this.EndpointGroupCounts);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

