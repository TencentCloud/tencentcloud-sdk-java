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

public class ListenerOutput extends AbstractModel {

    /**
    * 是否开启双向认证。
    */
    @SerializedName("CaEnable")
    @Expose
    private Boolean CaEnable;

    /**
    * 监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否启用 Gzip 压缩。
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * 是否启用http2。
    */
    @SerializedName("Http2Enable")
    @Expose
    private Boolean Http2Enable;

    /**
    * 空闲超时时间。
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
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口。
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 监听器协议。
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
    * 监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 请求超时时间。
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 安全策略 ID。
    */
    @SerializedName("TlsSecurityPolicyId")
    @Expose
    private String TlsSecurityPolicyId;

    /**
    * XForwardedFor配置。
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get 是否开启双向认证。 
     * @return CaEnable 是否开启双向认证。
     */
    public Boolean getCaEnable() {
        return this.CaEnable;
    }

    /**
     * Set 是否开启双向认证。
     * @param CaEnable 是否开启双向认证。
     */
    public void setCaEnable(Boolean CaEnable) {
        this.CaEnable = CaEnable;
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
     * Get 是否启用http2。 
     * @return Http2Enable 是否启用http2。
     */
    public Boolean getHttp2Enable() {
        return this.Http2Enable;
    }

    /**
     * Set 是否启用http2。
     * @param Http2Enable 是否启用http2。
     */
    public void setHttp2Enable(Boolean Http2Enable) {
        this.Http2Enable = Http2Enable;
    }

    /**
     * Get 空闲超时时间。 
     * @return IdleTimeout 空闲超时时间。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 空闲超时时间。
     * @param IdleTimeout 空闲超时时间。
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
     * Get 监听器名称。 
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口。 
     * @return ListenerPort 监听器端口。
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 监听器端口。
     * @param ListenerPort 监听器端口。
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 监听器协议。 
     * @return ListenerProtocol 监听器协议。
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set 监听器协议。
     * @param ListenerProtocol 监听器协议。
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
     * Get 安全策略 ID。 
     * @return TlsSecurityPolicyId 安全策略 ID。
     */
    public String getTlsSecurityPolicyId() {
        return this.TlsSecurityPolicyId;
    }

    /**
     * Set 安全策略 ID。
     * @param TlsSecurityPolicyId 安全策略 ID。
     */
    public void setTlsSecurityPolicyId(String TlsSecurityPolicyId) {
        this.TlsSecurityPolicyId = TlsSecurityPolicyId;
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

    public ListenerOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerOutput(ListenerOutput source) {
        if (source.CaEnable != null) {
            this.CaEnable = new Boolean(source.CaEnable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GzipEnabled != null) {
            this.GzipEnabled = new Boolean(source.GzipEnabled);
        }
        if (source.Http2Enable != null) {
            this.Http2Enable = new Boolean(source.Http2Enable);
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TlsSecurityPolicyId != null) {
            this.TlsSecurityPolicyId = new String(source.TlsSecurityPolicyId);
        }
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaEnable", this.CaEnable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enable", this.Http2Enable);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TlsSecurityPolicyId", this.TlsSecurityPolicyId);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

