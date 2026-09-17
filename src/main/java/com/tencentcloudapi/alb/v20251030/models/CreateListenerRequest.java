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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel {

    /**
    * <p>默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。</p>
    */
    @SerializedName("DefaultActions")
    @Expose
    private DefaultAction [] DefaultActions;

    /**
    * <p>负载均衡实例前端使用的端口。  取值：1~65535。</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>监听协议。  取值：HTTP、HTTPS 或 QUIC。</p>
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>监听器配置的CA证书ID列表。目前监听器仅支持添加 1 个 CA 证书。<br>当 CaEnabled 参数取值为 true 时，此参数必填。</p>
    */
    @SerializedName("CaCertificateIds")
    @Expose
    private String [] CaCertificateIds;

    /**
    * <p>是否开启双向认证。<br>取值：<br>true：开启。<br>false（默认值）：不开启。</p>
    */
    @SerializedName("CaEnabled")
    @Expose
    private Boolean CaEnabled;

    /**
    * <p>服务器证书 ID 列表。</p>
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * <p>客户端Token，用于保证请求的幂等性。  </p><p>从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否开启Gzip压缩。取值:true(默认值):是。false:否</p>
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * <p>是否开启HTTP/2特性。HTTP 协议默认 false，HTTPS 协议默认 true。只有 HTTPS 协议支持此参数。</p>
    */
    @SerializedName("Http2Enabled")
    @Expose
    private Boolean Http2Enabled;

    /**
    * <p>连接空闲超时时间。单位：秒。<br>取值范围：1~600。<br>默认值：15。<br>如果在超时时间内一直没有访问请求，负载均衡会断开当前连接，在下次请求到来时创建新的连接。</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>连接请求超时时间。单位：秒。取值：1~600。默认值：60。如果在超时时间内后端服务器没有返回响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>安全策略 ID，格式为 tls- 后接 8 位字母数字。</p>
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * <p>标签列表。最大支持20个。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>X-Forwarded-For配置</p>
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get <p>默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。</p> 
     * @return DefaultActions <p>默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。</p>
     */
    public DefaultAction [] getDefaultActions() {
        return this.DefaultActions;
    }

    /**
     * Set <p>默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。</p>
     * @param DefaultActions <p>默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。</p>
     */
    public void setDefaultActions(DefaultAction [] DefaultActions) {
        this.DefaultActions = DefaultActions;
    }

    /**
     * Get <p>负载均衡实例前端使用的端口。  取值：1~65535。</p> 
     * @return ListenerPort <p>负载均衡实例前端使用的端口。  取值：1~65535。</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>负载均衡实例前端使用的端口。  取值：1~65535。</p>
     * @param ListenerPort <p>负载均衡实例前端使用的端口。  取值：1~65535。</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>监听协议。  取值：HTTP、HTTPS 或 QUIC。</p> 
     * @return ListenerProtocol <p>监听协议。  取值：HTTP、HTTPS 或 QUIC。</p>
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set <p>监听协议。  取值：HTTP、HTTPS 或 QUIC。</p>
     * @param ListenerProtocol <p>监听协议。  取值：HTTP、HTTPS 或 QUIC。</p>
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p> 
     * @return LoadBalancerId <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     * @param LoadBalancerId <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>监听器配置的CA证书ID列表。目前监听器仅支持添加 1 个 CA 证书。<br>当 CaEnabled 参数取值为 true 时，此参数必填。</p> 
     * @return CaCertificateIds <p>监听器配置的CA证书ID列表。目前监听器仅支持添加 1 个 CA 证书。<br>当 CaEnabled 参数取值为 true 时，此参数必填。</p>
     */
    public String [] getCaCertificateIds() {
        return this.CaCertificateIds;
    }

    /**
     * Set <p>监听器配置的CA证书ID列表。目前监听器仅支持添加 1 个 CA 证书。<br>当 CaEnabled 参数取值为 true 时，此参数必填。</p>
     * @param CaCertificateIds <p>监听器配置的CA证书ID列表。目前监听器仅支持添加 1 个 CA 证书。<br>当 CaEnabled 参数取值为 true 时，此参数必填。</p>
     */
    public void setCaCertificateIds(String [] CaCertificateIds) {
        this.CaCertificateIds = CaCertificateIds;
    }

    /**
     * Get <p>是否开启双向认证。<br>取值：<br>true：开启。<br>false（默认值）：不开启。</p> 
     * @return CaEnabled <p>是否开启双向认证。<br>取值：<br>true：开启。<br>false（默认值）：不开启。</p>
     */
    public Boolean getCaEnabled() {
        return this.CaEnabled;
    }

    /**
     * Set <p>是否开启双向认证。<br>取值：<br>true：开启。<br>false（默认值）：不开启。</p>
     * @param CaEnabled <p>是否开启双向认证。<br>取值：<br>true：开启。<br>false（默认值）：不开启。</p>
     */
    public void setCaEnabled(Boolean CaEnabled) {
        this.CaEnabled = CaEnabled;
    }

    /**
     * Get <p>服务器证书 ID 列表。</p> 
     * @return CertificateIds <p>服务器证书 ID 列表。</p>
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set <p>服务器证书 ID 列表。</p>
     * @param CertificateIds <p>服务器证书 ID 列表。</p>
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get <p>客户端Token，用于保证请求的幂等性。  </p><p>从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。</p> 
     * @return ClientToken <p>客户端Token，用于保证请求的幂等性。  </p><p>从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>客户端Token，用于保证请求的幂等性。  </p><p>从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。</p>
     * @param ClientToken <p>客户端Token，用于保证请求的幂等性。  </p><p>从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>是否开启Gzip压缩。取值:true(默认值):是。false:否</p> 
     * @return GzipEnabled <p>是否开启Gzip压缩。取值:true(默认值):是。false:否</p>
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set <p>是否开启Gzip压缩。取值:true(默认值):是。false:否</p>
     * @param GzipEnabled <p>是否开启Gzip压缩。取值:true(默认值):是。false:否</p>
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get <p>是否开启HTTP/2特性。HTTP 协议默认 false，HTTPS 协议默认 true。只有 HTTPS 协议支持此参数。</p> 
     * @return Http2Enabled <p>是否开启HTTP/2特性。HTTP 协议默认 false，HTTPS 协议默认 true。只有 HTTPS 协议支持此参数。</p>
     */
    public Boolean getHttp2Enabled() {
        return this.Http2Enabled;
    }

    /**
     * Set <p>是否开启HTTP/2特性。HTTP 协议默认 false，HTTPS 协议默认 true。只有 HTTPS 协议支持此参数。</p>
     * @param Http2Enabled <p>是否开启HTTP/2特性。HTTP 协议默认 false，HTTPS 协议默认 true。只有 HTTPS 协议支持此参数。</p>
     */
    public void setHttp2Enabled(Boolean Http2Enabled) {
        this.Http2Enabled = Http2Enabled;
    }

    /**
     * Get <p>连接空闲超时时间。单位：秒。<br>取值范围：1~600。<br>默认值：15。<br>如果在超时时间内一直没有访问请求，负载均衡会断开当前连接，在下次请求到来时创建新的连接。</p> 
     * @return IdleTimeout <p>连接空闲超时时间。单位：秒。<br>取值范围：1~600。<br>默认值：15。<br>如果在超时时间内一直没有访问请求，负载均衡会断开当前连接，在下次请求到来时创建新的连接。</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>连接空闲超时时间。单位：秒。<br>取值范围：1~600。<br>默认值：15。<br>如果在超时时间内一直没有访问请求，负载均衡会断开当前连接，在下次请求到来时创建新的连接。</p>
     * @param IdleTimeout <p>连接空闲超时时间。单位：秒。<br>取值范围：1~600。<br>默认值：15。<br>如果在超时时间内一直没有访问请求，负载均衡会断开当前连接，在下次请求到来时创建新的连接。</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p> 
     * @return ListenerName <p>自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     * @param ListenerName <p>自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>连接请求超时时间。单位：秒。取值：1~600。默认值：60。如果在超时时间内后端服务器没有返回响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。</p> 
     * @return RequestTimeout <p>连接请求超时时间。单位：秒。取值：1~600。默认值：60。如果在超时时间内后端服务器没有返回响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>连接请求超时时间。单位：秒。取值：1~600。默认值：60。如果在超时时间内后端服务器没有返回响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。</p>
     * @param RequestTimeout <p>连接请求超时时间。单位：秒。取值：1~600。默认值：60。如果在超时时间内后端服务器没有返回响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>安全策略 ID，格式为 tls- 后接 8 位字母数字。</p> 
     * @return SecurityPolicyId <p>安全策略 ID，格式为 tls- 后接 8 位字母数字。</p>
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set <p>安全策略 ID，格式为 tls- 后接 8 位字母数字。</p>
     * @param SecurityPolicyId <p>安全策略 ID，格式为 tls- 后接 8 位字母数字。</p>
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get <p>标签列表。最大支持20个。</p> 
     * @return Tags <p>标签列表。最大支持20个。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表。最大支持20个。</p>
     * @param Tags <p>标签列表。最大支持20个。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>X-Forwarded-For配置</p> 
     * @return XForwardedForConfig <p>X-Forwarded-For配置</p>
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set <p>X-Forwarded-For配置</p>
     * @param XForwardedForConfig <p>X-Forwarded-For配置</p>
     */
    public void setXForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.DefaultActions != null) {
            this.DefaultActions = new DefaultAction[source.DefaultActions.length];
            for (int i = 0; i < source.DefaultActions.length; i++) {
                this.DefaultActions[i] = new DefaultAction(source.DefaultActions[i]);
            }
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.CaCertificateIds != null) {
            this.CaCertificateIds = new String[source.CaCertificateIds.length];
            for (int i = 0; i < source.CaCertificateIds.length; i++) {
                this.CaCertificateIds[i] = new String(source.CaCertificateIds[i]);
            }
        }
        if (source.CaEnabled != null) {
            this.CaEnabled = new Boolean(source.CaEnabled);
        }
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.GzipEnabled != null) {
            this.GzipEnabled = new Boolean(source.GzipEnabled);
        }
        if (source.Http2Enabled != null) {
            this.Http2Enabled = new Boolean(source.Http2Enabled);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DefaultActions.", this.DefaultActions);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "CaCertificateIds.", this.CaCertificateIds);
        this.setParamSimple(map, prefix + "CaEnabled", this.CaEnabled);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enabled", this.Http2Enabled);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

