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

public class CreateListenerRequest extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>名称，最大长度不能超过128个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>端口范围。</p>
    */
    @SerializedName("PortRanges")
    @Expose
    private PortRanges PortRanges;

    /**
    * <p>描述信息，最大长度不能超过100个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>监听类型，默认为智能路由。</p><p>枚举值：</p><ul><li>Standard： 智能路由。</li></ul>
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * <p>协议，默认为TCP。支持配置&#39;TCP&#39;, &#39;UDP&#39;, &#39;HTTP&#39;, &#39;HTTPS&#39;。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>连接空闲等待时间。</p><p>1、HTTP/HTTPS监听器，默认值为15，支持范围为1-60；<br>2、TCP监听器，默认值为900，支持范围为10-900；<br>3、UDP监听器，默认值为20，支持范围为10-20；</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>四层获取源IP方式，支持&#39;TOA&#39;, &#39;ProxyProtocol&#39;, &#39;ProxyProtocolV2&#39;。</p><p>需要开启四层获取源IP方式，才填写此参数。</p>
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
    * <p>是否开启会话保持。支持配置&#39;Open&#39;, &#39;Close&#39;。</p><p>枚举值：</p><ul><li>Open： 开启。</li><li>Close： 关闭。</li></ul>
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * <p>请求超时时间。</p><p>取值范围：[1, 180]</p><p>默认值：60</p><p>当HTTPS监听器时才可配置此参数。</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>是否打开七层获取源IP方式。</p>
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * <p>解析方式。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 双向。</li><li>U： 单向。</li></ul><p>HTTPS监听器，此字段必传。</p>
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * <p>加密算法套件。支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;。</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>服务器证书。</p><p>当是HTTPS监听器时，此字段必传。</p>
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * <p>客户端证书。</p><p>当时HTTPS监听器且开启双向认证时，此字段必传。</p>
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * <p>HTTPS监听器支持选择版本</p><p>枚举值：</p><ul><li>HTTP/1.1： HTTP/1.1</li><li>HTTP/2： HTTP/2</li></ul>
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

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
     * Get <p>名称，最大长度不能超过128个字符。</p> 
     * @return Name <p>名称，最大长度不能超过128个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称，最大长度不能超过128个字符。</p>
     * @param Name <p>名称，最大长度不能超过128个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>描述信息，最大长度不能超过100个字符。</p> 
     * @return Description <p>描述信息，最大长度不能超过100个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息，最大长度不能超过100个字符。</p>
     * @param Description <p>描述信息，最大长度不能超过100个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>监听类型，默认为智能路由。</p><p>枚举值：</p><ul><li>Standard： 智能路由。</li></ul> 
     * @return ListenerType <p>监听类型，默认为智能路由。</p><p>枚举值：</p><ul><li>Standard： 智能路由。</li></ul>
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set <p>监听类型，默认为智能路由。</p><p>枚举值：</p><ul><li>Standard： 智能路由。</li></ul>
     * @param ListenerType <p>监听类型，默认为智能路由。</p><p>枚举值：</p><ul><li>Standard： 智能路由。</li></ul>
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get <p>协议，默认为TCP。支持配置&#39;TCP&#39;, &#39;UDP&#39;, &#39;HTTP&#39;, &#39;HTTPS&#39;。</p> 
     * @return Protocol <p>协议，默认为TCP。支持配置&#39;TCP&#39;, &#39;UDP&#39;, &#39;HTTP&#39;, &#39;HTTPS&#39;。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议，默认为TCP。支持配置&#39;TCP&#39;, &#39;UDP&#39;, &#39;HTTP&#39;, &#39;HTTPS&#39;。</p>
     * @param Protocol <p>协议，默认为TCP。支持配置&#39;TCP&#39;, &#39;UDP&#39;, &#39;HTTP&#39;, &#39;HTTPS&#39;。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>连接空闲等待时间。</p><p>1、HTTP/HTTPS监听器，默认值为15，支持范围为1-60；<br>2、TCP监听器，默认值为900，支持范围为10-900；<br>3、UDP监听器，默认值为20，支持范围为10-20；</p> 
     * @return IdleTimeout <p>连接空闲等待时间。</p><p>1、HTTP/HTTPS监听器，默认值为15，支持范围为1-60；<br>2、TCP监听器，默认值为900，支持范围为10-900；<br>3、UDP监听器，默认值为20，支持范围为10-20；</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>连接空闲等待时间。</p><p>1、HTTP/HTTPS监听器，默认值为15，支持范围为1-60；<br>2、TCP监听器，默认值为900，支持范围为10-900；<br>3、UDP监听器，默认值为20，支持范围为10-20；</p>
     * @param IdleTimeout <p>连接空闲等待时间。</p><p>1、HTTP/HTTPS监听器，默认值为15，支持范围为1-60；<br>2、TCP监听器，默认值为900，支持范围为10-900；<br>3、UDP监听器，默认值为20，支持范围为10-20；</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>四层获取源IP方式，支持&#39;TOA&#39;, &#39;ProxyProtocol&#39;, &#39;ProxyProtocolV2&#39;。</p><p>需要开启四层获取源IP方式，才填写此参数。</p> 
     * @return GetRealIpType <p>四层获取源IP方式，支持&#39;TOA&#39;, &#39;ProxyProtocol&#39;, &#39;ProxyProtocolV2&#39;。</p><p>需要开启四层获取源IP方式，才填写此参数。</p>
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set <p>四层获取源IP方式，支持&#39;TOA&#39;, &#39;ProxyProtocol&#39;, &#39;ProxyProtocolV2&#39;。</p><p>需要开启四层获取源IP方式，才填写此参数。</p>
     * @param GetRealIpType <p>四层获取源IP方式，支持&#39;TOA&#39;, &#39;ProxyProtocol&#39;, &#39;ProxyProtocolV2&#39;。</p><p>需要开启四层获取源IP方式，才填写此参数。</p>
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    /**
     * Get <p>是否开启会话保持。支持配置&#39;Open&#39;, &#39;Close&#39;。</p><p>枚举值：</p><ul><li>Open： 开启。</li><li>Close： 关闭。</li></ul> 
     * @return ClientAffinity <p>是否开启会话保持。支持配置&#39;Open&#39;, &#39;Close&#39;。</p><p>枚举值：</p><ul><li>Open： 开启。</li><li>Close： 关闭。</li></ul>
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set <p>是否开启会话保持。支持配置&#39;Open&#39;, &#39;Close&#39;。</p><p>枚举值：</p><ul><li>Open： 开启。</li><li>Close： 关闭。</li></ul>
     * @param ClientAffinity <p>是否开启会话保持。支持配置&#39;Open&#39;, &#39;Close&#39;。</p><p>枚举值：</p><ul><li>Open： 开启。</li><li>Close： 关闭。</li></ul>
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get <p>请求超时时间。</p><p>取值范围：[1, 180]</p><p>默认值：60</p><p>当HTTPS监听器时才可配置此参数。</p> 
     * @return RequestTimeout <p>请求超时时间。</p><p>取值范围：[1, 180]</p><p>默认值：60</p><p>当HTTPS监听器时才可配置此参数。</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>请求超时时间。</p><p>取值范围：[1, 180]</p><p>默认值：60</p><p>当HTTPS监听器时才可配置此参数。</p>
     * @param RequestTimeout <p>请求超时时间。</p><p>取值范围：[1, 180]</p><p>默认值：60</p><p>当HTTPS监听器时才可配置此参数。</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
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
     * Get <p>解析方式。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 双向。</li><li>U： 单向。</li></ul><p>HTTPS监听器，此字段必传。</p> 
     * @return CertificationType <p>解析方式。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 双向。</li><li>U： 单向。</li></ul><p>HTTPS监听器，此字段必传。</p>
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set <p>解析方式。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 双向。</li><li>U： 单向。</li></ul><p>HTTPS监听器，此字段必传。</p>
     * @param CertificationType <p>解析方式。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 双向。</li><li>U： 单向。</li></ul><p>HTTPS监听器，此字段必传。</p>
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get <p>加密算法套件。支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;。</p> 
     * @return CipherPolicyId <p>加密算法套件。支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;。</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>加密算法套件。支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;。</p>
     * @param CipherPolicyId <p>加密算法套件。支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;。</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>服务器证书。</p><p>当是HTTPS监听器时，此字段必传。</p> 
     * @return ServerCertificates <p>服务器证书。</p><p>当是HTTPS监听器时，此字段必传。</p>
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set <p>服务器证书。</p><p>当是HTTPS监听器时，此字段必传。</p>
     * @param ServerCertificates <p>服务器证书。</p><p>当是HTTPS监听器时，此字段必传。</p>
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get <p>客户端证书。</p><p>当时HTTPS监听器且开启双向认证时，此字段必传。</p> 
     * @return ClientCaCertificates <p>客户端证书。</p><p>当时HTTPS监听器且开启双向认证时，此字段必传。</p>
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set <p>客户端证书。</p><p>当时HTTPS监听器且开启双向认证时，此字段必传。</p>
     * @param ClientCaCertificates <p>客户端证书。</p><p>当时HTTPS监听器且开启双向认证时，此字段必传。</p>
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get <p>HTTPS监听器支持选择版本</p><p>枚举值：</p><ul><li>HTTP/1.1： HTTP/1.1</li><li>HTTP/2： HTTP/2</li></ul> 
     * @return HttpVersion <p>HTTPS监听器支持选择版本</p><p>枚举值：</p><ul><li>HTTP/1.1： HTTP/1.1</li><li>HTTP/2： HTTP/2</li></ul>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>HTTPS监听器支持选择版本</p><p>枚举值：</p><ul><li>HTTP/1.1： HTTP/1.1</li><li>HTTP/2： HTTP/2</li></ul>
     * @param HttpVersion <p>HTTPS监听器支持选择版本</p><p>枚举值：</p><ul><li>HTTP/1.1： HTTP/1.1</li><li>HTTP/2： HTTP/2</li></ul>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PortRanges != null) {
            this.PortRanges = new PortRanges(source.PortRanges);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ListenerType != null) {
            this.ListenerType = new String(source.ListenerType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.XForwardedForRealIp != null) {
            this.XForwardedForRealIp = new Boolean(source.XForwardedForRealIp);
        }
        if (source.CertificationType != null) {
            this.CertificationType = new String(source.CertificationType);
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
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
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PortRanges.", this.PortRanges);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

