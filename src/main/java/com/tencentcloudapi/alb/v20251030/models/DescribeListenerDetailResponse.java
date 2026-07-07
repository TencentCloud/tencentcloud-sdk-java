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

public class DescribeListenerDetailResponse extends AbstractModel {

    /**
    * 监听器绑定的CA证书ID列表。
    */
    @SerializedName("CaCertificateIds")
    @Expose
    private String [] CaCertificateIds;

    /**
    * 是否开启双向认证。
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
    * 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则动作列表。
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
    * 是否开启HTTP/2特性。
    */
    @SerializedName("Http2Enabled")
    @Expose
    private Boolean Http2Enabled;

    /**
    * 指定连接空闲超时时间。单位：秒。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * 监听器 ID，格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 自定义监听名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 负载均衡实例前端使用的端口。
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 监听协议。
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * 监听器状态。取值:=

- **Active**: 运行中。
- **Provisioning**：创建中。
- **Configuring**：变配中。
- **ProvisionFailed**：创建失败
    */
    @SerializedName("ListenerStatus")
    @Expose
    private String ListenerStatus;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 请求超时时间。单位：秒。
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
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * XForwardedFor配置。
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监听器绑定的CA证书ID列表。 
     * @return CaCertificateIds 监听器绑定的CA证书ID列表。
     */
    public String [] getCaCertificateIds() {
        return this.CaCertificateIds;
    }

    /**
     * Set 监听器绑定的CA证书ID列表。
     * @param CaCertificateIds 监听器绑定的CA证书ID列表。
     */
    public void setCaCertificateIds(String [] CaCertificateIds) {
        this.CaCertificateIds = CaCertificateIds;
    }

    /**
     * Get 是否开启双向认证。 
     * @return CaEnabled 是否开启双向认证。
     */
    public Boolean getCaEnabled() {
        return this.CaEnabled;
    }

    /**
     * Set 是否开启双向认证。
     * @param CaEnabled 是否开启双向认证。
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
     * Get 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00） 
     * @return CreateTime 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     * @param CreateTime 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则动作列表。 
     * @return DefaultActions 规则动作列表。
     */
    public DefaultAction [] getDefaultActions() {
        return this.DefaultActions;
    }

    /**
     * Set 规则动作列表。
     * @param DefaultActions 规则动作列表。
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
     * Get 是否开启HTTP/2特性。 
     * @return Http2Enabled 是否开启HTTP/2特性。
     */
    public Boolean getHttp2Enabled() {
        return this.Http2Enabled;
    }

    /**
     * Set 是否开启HTTP/2特性。
     * @param Http2Enabled 是否开启HTTP/2特性。
     */
    public void setHttp2Enabled(Boolean Http2Enabled) {
        this.Http2Enabled = Http2Enabled;
    }

    /**
     * Get 指定连接空闲超时时间。单位：秒。 
     * @return IdleTimeout 指定连接空闲超时时间。单位：秒。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 指定连接空闲超时时间。单位：秒。
     * @param IdleTimeout 指定连接空闲超时时间。单位：秒。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

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
     * Get 自定义监听名称。 
     * @return ListenerName 自定义监听名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 自定义监听名称。
     * @param ListenerName 自定义监听名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 负载均衡实例前端使用的端口。 
     * @return ListenerPort 负载均衡实例前端使用的端口。
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 负载均衡实例前端使用的端口。
     * @param ListenerPort 负载均衡实例前端使用的端口。
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 监听协议。 
     * @return ListenerProtocol 监听协议。
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set 监听协议。
     * @param ListenerProtocol 监听协议。
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get 监听器状态。取值:=

- **Active**: 运行中。
- **Provisioning**：创建中。
- **Configuring**：变配中。
- **ProvisionFailed**：创建失败 
     * @return ListenerStatus 监听器状态。取值:=

- **Active**: 运行中。
- **Provisioning**：创建中。
- **Configuring**：变配中。
- **ProvisionFailed**：创建失败
     */
    public String getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set 监听器状态。取值:=

- **Active**: 运行中。
- **Provisioning**：创建中。
- **Configuring**：变配中。
- **ProvisionFailed**：创建失败
     * @param ListenerStatus 监听器状态。取值:=

- **Active**: 运行中。
- **Provisioning**：创建中。
- **Configuring**：变配中。
- **ProvisionFailed**：创建失败
     */
    public void setListenerStatus(String ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
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
     * Get 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00） 
     * @return ModifyTime 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     * @param ModifyTime 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 请求超时时间。单位：秒。 
     * @return RequestTimeout 请求超时时间。单位：秒。
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set 请求超时时间。单位：秒。
     * @param RequestTimeout 请求超时时间。单位：秒。
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
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeListenerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerDetailResponse(DescribeListenerDetailResponse source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new String(source.ListenerStatus);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CaCertificateIds.", this.CaCertificateIds);
        this.setParamSimple(map, prefix + "CaEnabled", this.CaEnabled);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "DefaultActions.", this.DefaultActions);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enabled", this.Http2Enabled);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

