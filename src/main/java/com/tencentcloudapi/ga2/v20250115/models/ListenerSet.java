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
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监听器描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口范围。
    */
    @SerializedName("PortRanges")
    @Expose
    private PortRanges PortRanges;

    /**
    * 是否打开七层获取源IP方式。
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * 开启会话保持。
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * 会话保持时间。
    */
    @SerializedName("ClientAffinityTime")
    @Expose
    private Long ClientAffinityTime;

    /**
    * SSL解析方式。
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * 服务器证书。
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * 客户端证书。
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * TLS密码套件包。
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * HTTP版本。
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * 请求超时时间。
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 监听路由类型。
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * 监听器状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 所属监听器终端节点组个数。
    */
    @SerializedName("EndpointGroupCounts")
    @Expose
    private Long EndpointGroupCounts;

    /**
    * 四层获取源IP方式。
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
    * 连接超时时间。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器名称。 
     * @return Name 监听器名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 监听器名称。
     * @param Name 监听器名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监听器描述。 
     * @return Description 监听器描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 监听器描述。
     * @param Description 监听器描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 协议。 
     * @return Protocol 协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议。
     * @param Protocol 协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口范围。 
     * @return PortRanges 端口范围。
     */
    public PortRanges getPortRanges() {
        return this.PortRanges;
    }

    /**
     * Set 端口范围。
     * @param PortRanges 端口范围。
     */
    public void setPortRanges(PortRanges PortRanges) {
        this.PortRanges = PortRanges;
    }

    /**
     * Get 是否打开七层获取源IP方式。 
     * @return XForwardedForRealIp 是否打开七层获取源IP方式。
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set 是否打开七层获取源IP方式。
     * @param XForwardedForRealIp 是否打开七层获取源IP方式。
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get 开启会话保持。 
     * @return ClientAffinity 开启会话保持。
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set 开启会话保持。
     * @param ClientAffinity 开启会话保持。
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get 会话保持时间。 
     * @return ClientAffinityTime 会话保持时间。
     */
    public Long getClientAffinityTime() {
        return this.ClientAffinityTime;
    }

    /**
     * Set 会话保持时间。
     * @param ClientAffinityTime 会话保持时间。
     */
    public void setClientAffinityTime(Long ClientAffinityTime) {
        this.ClientAffinityTime = ClientAffinityTime;
    }

    /**
     * Get SSL解析方式。 
     * @return CertificationType SSL解析方式。
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set SSL解析方式。
     * @param CertificationType SSL解析方式。
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get 服务器证书。 
     * @return ServerCertificates 服务器证书。
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set 服务器证书。
     * @param ServerCertificates 服务器证书。
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get 客户端证书。 
     * @return ClientCaCertificates 客户端证书。
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set 客户端证书。
     * @param ClientCaCertificates 客户端证书。
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get TLS密码套件包。 
     * @return CipherPolicyId TLS密码套件包。
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set TLS密码套件包。
     * @param CipherPolicyId TLS密码套件包。
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get HTTP版本。 
     * @return HttpVersion HTTP版本。
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set HTTP版本。
     * @param HttpVersion HTTP版本。
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get 请求超时时间。 
     * @return RequestTimeout 请求超时时间。
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set 请求超时时间。
     * @param RequestTimeout 请求超时时间。
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 监听路由类型。 
     * @return ListenerType 监听路由类型。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set 监听路由类型。
     * @param ListenerType 监听路由类型。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get 监听器状态。 
     * @return Status 监听器状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 监听器状态。
     * @param Status 监听器状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 所属监听器终端节点组个数。 
     * @return EndpointGroupCounts 所属监听器终端节点组个数。
     */
    public Long getEndpointGroupCounts() {
        return this.EndpointGroupCounts;
    }

    /**
     * Set 所属监听器终端节点组个数。
     * @param EndpointGroupCounts 所属监听器终端节点组个数。
     */
    public void setEndpointGroupCounts(Long EndpointGroupCounts) {
        this.EndpointGroupCounts = EndpointGroupCounts;
    }

    /**
     * Get 四层获取源IP方式。 
     * @return GetRealIpType 四层获取源IP方式。
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set 四层获取源IP方式。
     * @param GetRealIpType 四层获取源IP方式。
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    /**
     * Get 连接超时时间。 
     * @return IdleTimeout 连接超时时间。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 连接超时时间。
     * @param IdleTimeout 连接超时时间。
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

