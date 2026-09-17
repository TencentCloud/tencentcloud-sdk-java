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
    * <p>是否开启双向认证。</p>
    */
    @SerializedName("CaEnable")
    @Expose
    private Boolean CaEnable;

    /**
    * <p>监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>是否启用 Gzip 压缩。</p>
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * <p>是否启用http2。</p>
    */
    @SerializedName("Http2Enable")
    @Expose
    private Boolean Http2Enable;

    /**
    * <p>空闲超时时间。</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>监听器名称。</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器端口。</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>监听器协议。</p>
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * <p>监听器状态。取值:=</p><ul><li><strong>Active</strong>: 运行中。</li><li><strong>Provisioning</strong>：创建中。</li><li><strong>Configuring</strong>：变配中。</li><li><strong>ProvisionFailed</strong>：创建失败</li></ul>
    */
    @SerializedName("ListenerStatus")
    @Expose
    private String ListenerStatus;

    /**
    * <p>监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>连接请求超时时间。</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>安全策略 ID。</p>
    */
    @SerializedName("TlsSecurityPolicyId")
    @Expose
    private String TlsSecurityPolicyId;

    /**
    * <p>XForwardedFor配置。</p>
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get <p>是否开启双向认证。</p> 
     * @return CaEnable <p>是否开启双向认证。</p>
     */
    public Boolean getCaEnable() {
        return this.CaEnable;
    }

    /**
     * Set <p>是否开启双向认证。</p>
     * @param CaEnable <p>是否开启双向认证。</p>
     */
    public void setCaEnable(Boolean CaEnable) {
        this.CaEnable = CaEnable;
    }

    /**
     * Get <p>监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p> 
     * @return CreateTime <p>监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     * @param CreateTime <p>监听器实例的创建时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>是否启用 Gzip 压缩。</p> 
     * @return GzipEnabled <p>是否启用 Gzip 压缩。</p>
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set <p>是否启用 Gzip 压缩。</p>
     * @param GzipEnabled <p>是否启用 Gzip 压缩。</p>
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get <p>是否启用http2。</p> 
     * @return Http2Enable <p>是否启用http2。</p>
     */
    public Boolean getHttp2Enable() {
        return this.Http2Enable;
    }

    /**
     * Set <p>是否启用http2。</p>
     * @param Http2Enable <p>是否启用http2。</p>
     */
    public void setHttp2Enable(Boolean Http2Enable) {
        this.Http2Enable = Http2Enable;
    }

    /**
     * Get <p>空闲超时时间。</p> 
     * @return IdleTimeout <p>空闲超时时间。</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>空闲超时时间。</p>
     * @param IdleTimeout <p>空闲超时时间。</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p> 
     * @return ListenerId <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     * @param ListenerId <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>监听器名称。</p> 
     * @return ListenerName <p>监听器名称。</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>监听器名称。</p>
     * @param ListenerName <p>监听器名称。</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>监听器端口。</p> 
     * @return ListenerPort <p>监听器端口。</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>监听器端口。</p>
     * @param ListenerPort <p>监听器端口。</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>监听器协议。</p> 
     * @return ListenerProtocol <p>监听器协议。</p>
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set <p>监听器协议。</p>
     * @param ListenerProtocol <p>监听器协议。</p>
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get <p>监听器状态。取值:=</p><ul><li><strong>Active</strong>: 运行中。</li><li><strong>Provisioning</strong>：创建中。</li><li><strong>Configuring</strong>：变配中。</li><li><strong>ProvisionFailed</strong>：创建失败</li></ul> 
     * @return ListenerStatus <p>监听器状态。取值:=</p><ul><li><strong>Active</strong>: 运行中。</li><li><strong>Provisioning</strong>：创建中。</li><li><strong>Configuring</strong>：变配中。</li><li><strong>ProvisionFailed</strong>：创建失败</li></ul>
     */
    public String getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set <p>监听器状态。取值:=</p><ul><li><strong>Active</strong>: 运行中。</li><li><strong>Provisioning</strong>：创建中。</li><li><strong>Configuring</strong>：变配中。</li><li><strong>ProvisionFailed</strong>：创建失败</li></ul>
     * @param ListenerStatus <p>监听器状态。取值:=</p><ul><li><strong>Active</strong>: 运行中。</li><li><strong>Provisioning</strong>：创建中。</li><li><strong>Configuring</strong>：变配中。</li><li><strong>ProvisionFailed</strong>：创建失败</li></ul>
     */
    public void setListenerStatus(String ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get <p>监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p> 
     * @return ModifyTime <p>监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     * @param ModifyTime <p>监听器实例的最后变更时间。格式：ISO 8601（例如 2025-01-01T08:30:00+08:00）</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>连接请求超时时间。</p> 
     * @return RequestTimeout <p>连接请求超时时间。</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>连接请求超时时间。</p>
     * @param RequestTimeout <p>连接请求超时时间。</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>标签。</p> 
     * @return Tags <p>标签。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签。</p>
     * @param Tags <p>标签。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>安全策略 ID。</p> 
     * @return TlsSecurityPolicyId <p>安全策略 ID。</p>
     */
    public String getTlsSecurityPolicyId() {
        return this.TlsSecurityPolicyId;
    }

    /**
     * Set <p>安全策略 ID。</p>
     * @param TlsSecurityPolicyId <p>安全策略 ID。</p>
     */
    public void setTlsSecurityPolicyId(String TlsSecurityPolicyId) {
        this.TlsSecurityPolicyId = TlsSecurityPolicyId;
    }

    /**
     * Get <p>XForwardedFor配置。</p> 
     * @return XForwardedForConfig <p>XForwardedFor配置。</p>
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set <p>XForwardedFor配置。</p>
     * @param XForwardedForConfig <p>XForwardedFor配置。</p>
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

