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

public class ModifyListenerAttributesRequest extends AbstractModel {

    /**
    * 监听器 ID，格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器配置的CA证书ID列表。目前仅支持添加1个CA证书。
    */
    @SerializedName("CaCertificateIds")
    @Expose
    private String [] CaCertificateIds;

    /**
    * 是否开启双向认证。
取值：
true：开启。
false（默认值）：不开启。
    */
    @SerializedName("CaEnabled")
    @Expose
    private Boolean CaEnabled;

    /**
    * 服务器证书 ID 列表。
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * 客户端Token，用于保证请求的幂等性。  

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。
    */
    @SerializedName("DefaultActions")
    @Expose
    private DefaultAction [] DefaultActions;

    /**
    * 是否启用 Gzip 压缩。
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * 是否开启HTTP/2特性。只有 HTTPS 协议支持此参数。
    */
    @SerializedName("Http2Enabled")
    @Expose
    private Boolean Http2Enabled;

    /**
    * 指定连接空闲超时时间。单位：秒。
取值范围：1~600。
默认值：15。
如果在设定时间内一直没有访问请求，负载均衡会暂时断开当前连接，下次请求来临时重新建立新的连接。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * 自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 指定请求超时时间。单位：秒。
取值：1~600。
默认值：60。
如果在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * 安全策略 ID，格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * XForwardedFor配置。
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get 监听器 ID，格式为 lst- 后接 8 位字母数字。 
     * @return ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID，格式为 lst- 后接 8 位字母数字。
     * @param ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。 
     * @return LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     * @param LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 监听器配置的CA证书ID列表。目前仅支持添加1个CA证书。 
     * @return CaCertificateIds 监听器配置的CA证书ID列表。目前仅支持添加1个CA证书。
     */
    public String [] getCaCertificateIds() {
        return this.CaCertificateIds;
    }

    /**
     * Set 监听器配置的CA证书ID列表。目前仅支持添加1个CA证书。
     * @param CaCertificateIds 监听器配置的CA证书ID列表。目前仅支持添加1个CA证书。
     */
    public void setCaCertificateIds(String [] CaCertificateIds) {
        this.CaCertificateIds = CaCertificateIds;
    }

    /**
     * Get 是否开启双向认证。
取值：
true：开启。
false（默认值）：不开启。 
     * @return CaEnabled 是否开启双向认证。
取值：
true：开启。
false（默认值）：不开启。
     */
    public Boolean getCaEnabled() {
        return this.CaEnabled;
    }

    /**
     * Set 是否开启双向认证。
取值：
true：开启。
false（默认值）：不开启。
     * @param CaEnabled 是否开启双向认证。
取值：
true：开启。
false（默认值）：不开启。
     */
    public void setCaEnabled(Boolean CaEnabled) {
        this.CaEnabled = CaEnabled;
    }

    /**
     * Get 服务器证书 ID 列表。 
     * @return CertificateIds 服务器证书 ID 列表。
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set 服务器证书 ID 列表。
     * @param CertificateIds 服务器证书 ID 列表。
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get 客户端Token，用于保证请求的幂等性。  

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。 
     * @return ClientToken 客户端Token，用于保证请求的幂等性。  

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，用于保证请求的幂等性。  

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     * @param ClientToken 客户端Token，用于保证请求的幂等性。  

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。 
     * @return DefaultActions 默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。
     */
    public DefaultAction [] getDefaultActions() {
        return this.DefaultActions;
    }

    /**
     * Set 默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。
     * @param DefaultActions 默认转发规则动作列表。目前监听器仅支持添加 1 个默认转发规则动作。
     */
    public void setDefaultActions(DefaultAction [] DefaultActions) {
        this.DefaultActions = DefaultActions;
    }

    /**
     * Get 是否启用 Gzip 压缩。 
     * @return GzipEnabled 是否启用 Gzip 压缩。
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set 是否启用 Gzip 压缩。
     * @param GzipEnabled 是否启用 Gzip 压缩。
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get 是否开启HTTP/2特性。只有 HTTPS 协议支持此参数。 
     * @return Http2Enabled 是否开启HTTP/2特性。只有 HTTPS 协议支持此参数。
     */
    public Boolean getHttp2Enabled() {
        return this.Http2Enabled;
    }

    /**
     * Set 是否开启HTTP/2特性。只有 HTTPS 协议支持此参数。
     * @param Http2Enabled 是否开启HTTP/2特性。只有 HTTPS 协议支持此参数。
     */
    public void setHttp2Enabled(Boolean Http2Enabled) {
        this.Http2Enabled = Http2Enabled;
    }

    /**
     * Get 指定连接空闲超时时间。单位：秒。
取值范围：1~600。
默认值：15。
如果在设定时间内一直没有访问请求，负载均衡会暂时断开当前连接，下次请求来临时重新建立新的连接。 
     * @return IdleTimeout 指定连接空闲超时时间。单位：秒。
取值范围：1~600。
默认值：15。
如果在设定时间内一直没有访问请求，负载均衡会暂时断开当前连接，下次请求来临时重新建立新的连接。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 指定连接空闲超时时间。单位：秒。
取值范围：1~600。
默认值：15。
如果在设定时间内一直没有访问请求，负载均衡会暂时断开当前连接，下次请求来临时重新建立新的连接。
     * @param IdleTimeout 指定连接空闲超时时间。单位：秒。
取值范围：1~600。
默认值：15。
如果在设定时间内一直没有访问请求，负载均衡会暂时断开当前连接，下次请求来临时重新建立新的连接。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get 自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。 
     * @return ListenerName 自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     * @param ListenerName 自定义监听名称。  长度为 1~255 个字符，必须是中文和无害字符串中的字符，  可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 指定请求超时时间。单位：秒。
取值：1~600。
默认值：60。
如果在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。 
     * @return RequestTimeout 指定请求超时时间。单位：秒。
取值：1~600。
默认值：60。
如果在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set 指定请求超时时间。单位：秒。
取值：1~600。
默认值：60。
如果在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。
     * @param RequestTimeout 指定请求超时时间。单位：秒。
取值：1~600。
默认值：60。
如果在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，并给客户端返回HTTP 504错误码。
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get 安全策略 ID，格式为 tls- 后接 8 位字母数字。 
     * @return SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     * @param SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get XForwardedFor配置。 
     * @return XForwardedForConfig XForwardedFor配置。
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set XForwardedFor配置。
     * @param XForwardedForConfig XForwardedFor配置。
     */
    public void setXForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
    }

    public ModifyListenerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerAttributesRequest(ModifyListenerAttributesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
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
        if (source.DefaultActions != null) {
            this.DefaultActions = new DefaultAction[source.DefaultActions.length];
            for (int i = 0; i < source.DefaultActions.length; i++) {
                this.DefaultActions[i] = new DefaultAction(source.DefaultActions[i]);
            }
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
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "CaCertificateIds.", this.CaCertificateIds);
        this.setParamSimple(map, prefix + "CaEnabled", this.CaEnabled);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "DefaultActions.", this.DefaultActions);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enabled", this.Http2Enabled);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

