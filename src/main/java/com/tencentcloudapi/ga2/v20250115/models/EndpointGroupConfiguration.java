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

public class EndpointGroupConfiguration extends AbstractModel {

    /**
    * <p>终端节点组名称。</p><p>最大长度不能超过128个字节。必须以字母（a-z, A-Z）或中文字符开头。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>终端节点组所在地域。</p>
    */
    @SerializedName("EndpointGroupRegion")
    @Expose
    private String EndpointGroupRegion;

    /**
    * <p>终端节点配置。</p>
    */
    @SerializedName("EndpointConfigurations")
    @Expose
    private EndpointConfigurations [] EndpointConfigurations;

    /**
    * <p>检查协议。支持配置&#39;TCP&#39;, &#39;HTTP&#39;, &#39;PING&#39;, &#39;CUSTOM&#39;。</p><p>枚举值：</p><ul><li>TCP： 当终端节点组所在监听器协议是TCP时，可以选择检查协议为TCP。</li><li>HTTP： 当终端节点组所在监听器协议是HTTP或HTTPS时，可以选择检查协议为HTTP。</li><li>PING： 当终端节点组所在监听器协议是UDP时，可以选择检查协议为PING。</li><li>CUSTOM： 当终端节点组所在监听器协议是UDP或TCP时，可以选择检查协议为CUSTOM。</li></ul><p>当开启健康检查时此字段必传。</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>描述信息。</p><p>默认值：默认值为空，代表不配置描述信息。</p><p>最大长度不能超过100个字节。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>检查端口。</p><p>入参限制：范围是1-65535。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
    */
    @SerializedName("CheckPort")
    @Expose
    private String CheckPort;

    /**
    * <p>检查内容。支持配置&#39;TEXT&#39;。</p><p>枚举值：</p><ul><li>TEXT： 文本内容。</li></ul><p>当CheckType为CUSTOM时候，此字段必传。</p>
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>检查请求。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
    */
    @SerializedName("CheckSendContext")
    @Expose
    private String CheckSendContext;

    /**
    * <p>检查返回结果。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
    */
    @SerializedName("CheckRecvContext")
    @Expose
    private String CheckRecvContext;

    /**
    * <p>是否开启健康检查。</p><p>默认值：False</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>响应超时时间。</p><p>取值范围：[1, 100]</p><p>默认值：2</p><p>开启健康检查时，此字段必传。</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>健康检查间隔。</p><p>取值范围：[5, 300]</p><p>默认值：30</p><p>开启健康检查，此字段必传。</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>不健康阀值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * <p>健康阈值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>回源协议。支持配置&#39;HTTP&#39;, &#39;HTTPS&#39;。</p><p>枚举值：</p><ul><li>HTTP： HTTP回源；当终端节点组所在监听器协议是HTTP或HTTPS时可以配置HTTP。</li><li>HTTPS： HTTPS回源；当终端节点组所在监听器协议是HTTPS时可以配置HTTPS。</li></ul><p>当终端节点组所在监听器协议为HTTP或HTTPS时候，此字段必传。</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>检查域名。</p><p>入参限制：字节长度范围是3-80。</p><p>当CheckType是HTTP时，此字段必传。</p>
    */
    @SerializedName("CheckDomain")
    @Expose
    private String CheckDomain;

    /**
    * <p>检查URL。</p><p>参数格式：必须满足正则：^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>当CheckType是HTTP时，此字段必传。</p>
    */
    @SerializedName("CheckPath")
    @Expose
    private String CheckPath;

    /**
    * <p>请求方式。支持配置&#39;GET&#39;, &#39;HEAD&#39;。</p><p>枚举值：</p><ul><li>GET： 请求方式为GET。</li><li>HEAD： 请求方式为HEAD。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>状态检测码。支持配置&#39;http_2xx&#39;, &#39;http_3xx&#39;, &#39;http_4xx&#39;, &#39;http_5xx&#39;。</p><p>枚举值：</p><ul><li>http_2xx： 2开头的http code。</li><li>http_3xx： 3开头的http code。</li><li>http_4xx： 4开头的http code。</li><li>http_5xx： 5开头的http code。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
    */
    @SerializedName("StatusMask")
    @Expose
    private String [] StatusMask;

    /**
    * <p>端口映射。</p><p>入参限制：七层支持1个端口映射，四层支持最多30个端口映射。</p>
    */
    @SerializedName("PortOverrides")
    @Expose
    private PortOverride [] PortOverrides;

    /**
    * <p>运营商类型。支持配置&#39;CMCC&#39;, &#39;CTCC&#39;, &#39;CUCC&#39;。</p><p>枚举值：</p><ul><li>CMCC： 中国移动</li><li>CUCC： 中国联通</li><li>CTCC： 中国电信</li></ul><p>当终端节点组地域为三网地域时，此字段必传。</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>HPPTS加密算法套件；支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;；</p><p>枚举值：</p><ul><li>tls_policy_1.0-2： 加密算法套件。</li><li>tls_policy_1.1-2： 加密算法套件。</li><li>tls_policy_1.2： 加密算法套件。</li><li>tls_policy_1.2_strict： 加密算法套件。</li><li>tls_policy_1.2_strict-1.3： 加密算法套件。</li></ul><p>当回源协议为HTTPS，此字段必传。</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>回源协议。支持配置&#39;HTTP/1.1&#39;, &#39;HTTP/2&#39;。</p><p>枚举值：</p><ul><li>HTTP/1.1： 版本HTTP/1.1</li><li>HTTP/2： 版本HTTP/2</li></ul><p>当回源协议为HTTPS时，此字段必传。</p>
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
     * Get <p>终端节点组名称。</p><p>最大长度不能超过128个字节。必须以字母（a-z, A-Z）或中文字符开头。</p> 
     * @return Name <p>终端节点组名称。</p><p>最大长度不能超过128个字节。必须以字母（a-z, A-Z）或中文字符开头。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>终端节点组名称。</p><p>最大长度不能超过128个字节。必须以字母（a-z, A-Z）或中文字符开头。</p>
     * @param Name <p>终端节点组名称。</p><p>最大长度不能超过128个字节。必须以字母（a-z, A-Z）或中文字符开头。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>终端节点组所在地域。</p> 
     * @return EndpointGroupRegion <p>终端节点组所在地域。</p>
     */
    public String getEndpointGroupRegion() {
        return this.EndpointGroupRegion;
    }

    /**
     * Set <p>终端节点组所在地域。</p>
     * @param EndpointGroupRegion <p>终端节点组所在地域。</p>
     */
    public void setEndpointGroupRegion(String EndpointGroupRegion) {
        this.EndpointGroupRegion = EndpointGroupRegion;
    }

    /**
     * Get <p>终端节点配置。</p> 
     * @return EndpointConfigurations <p>终端节点配置。</p>
     */
    public EndpointConfigurations [] getEndpointConfigurations() {
        return this.EndpointConfigurations;
    }

    /**
     * Set <p>终端节点配置。</p>
     * @param EndpointConfigurations <p>终端节点配置。</p>
     */
    public void setEndpointConfigurations(EndpointConfigurations [] EndpointConfigurations) {
        this.EndpointConfigurations = EndpointConfigurations;
    }

    /**
     * Get <p>检查协议。支持配置&#39;TCP&#39;, &#39;HTTP&#39;, &#39;PING&#39;, &#39;CUSTOM&#39;。</p><p>枚举值：</p><ul><li>TCP： 当终端节点组所在监听器协议是TCP时，可以选择检查协议为TCP。</li><li>HTTP： 当终端节点组所在监听器协议是HTTP或HTTPS时，可以选择检查协议为HTTP。</li><li>PING： 当终端节点组所在监听器协议是UDP时，可以选择检查协议为PING。</li><li>CUSTOM： 当终端节点组所在监听器协议是UDP或TCP时，可以选择检查协议为CUSTOM。</li></ul><p>当开启健康检查时此字段必传。</p> 
     * @return CheckType <p>检查协议。支持配置&#39;TCP&#39;, &#39;HTTP&#39;, &#39;PING&#39;, &#39;CUSTOM&#39;。</p><p>枚举值：</p><ul><li>TCP： 当终端节点组所在监听器协议是TCP时，可以选择检查协议为TCP。</li><li>HTTP： 当终端节点组所在监听器协议是HTTP或HTTPS时，可以选择检查协议为HTTP。</li><li>PING： 当终端节点组所在监听器协议是UDP时，可以选择检查协议为PING。</li><li>CUSTOM： 当终端节点组所在监听器协议是UDP或TCP时，可以选择检查协议为CUSTOM。</li></ul><p>当开启健康检查时此字段必传。</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>检查协议。支持配置&#39;TCP&#39;, &#39;HTTP&#39;, &#39;PING&#39;, &#39;CUSTOM&#39;。</p><p>枚举值：</p><ul><li>TCP： 当终端节点组所在监听器协议是TCP时，可以选择检查协议为TCP。</li><li>HTTP： 当终端节点组所在监听器协议是HTTP或HTTPS时，可以选择检查协议为HTTP。</li><li>PING： 当终端节点组所在监听器协议是UDP时，可以选择检查协议为PING。</li><li>CUSTOM： 当终端节点组所在监听器协议是UDP或TCP时，可以选择检查协议为CUSTOM。</li></ul><p>当开启健康检查时此字段必传。</p>
     * @param CheckType <p>检查协议。支持配置&#39;TCP&#39;, &#39;HTTP&#39;, &#39;PING&#39;, &#39;CUSTOM&#39;。</p><p>枚举值：</p><ul><li>TCP： 当终端节点组所在监听器协议是TCP时，可以选择检查协议为TCP。</li><li>HTTP： 当终端节点组所在监听器协议是HTTP或HTTPS时，可以选择检查协议为HTTP。</li><li>PING： 当终端节点组所在监听器协议是UDP时，可以选择检查协议为PING。</li><li>CUSTOM： 当终端节点组所在监听器协议是UDP或TCP时，可以选择检查协议为CUSTOM。</li></ul><p>当开启健康检查时此字段必传。</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>描述信息。</p><p>默认值：默认值为空，代表不配置描述信息。</p><p>最大长度不能超过100个字节。</p> 
     * @return Description <p>描述信息。</p><p>默认值：默认值为空，代表不配置描述信息。</p><p>最大长度不能超过100个字节。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息。</p><p>默认值：默认值为空，代表不配置描述信息。</p><p>最大长度不能超过100个字节。</p>
     * @param Description <p>描述信息。</p><p>默认值：默认值为空，代表不配置描述信息。</p><p>最大长度不能超过100个字节。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>检查端口。</p><p>入参限制：范围是1-65535。</p><p>当CheckType为CUSTOM时候，此字段必传。</p> 
     * @return CheckPort <p>检查端口。</p><p>入参限制：范围是1-65535。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public String getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set <p>检查端口。</p><p>入参限制：范围是1-65535。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     * @param CheckPort <p>检查端口。</p><p>入参限制：范围是1-65535。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public void setCheckPort(String CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get <p>检查内容。支持配置&#39;TEXT&#39;。</p><p>枚举值：</p><ul><li>TEXT： 文本内容。</li></ul><p>当CheckType为CUSTOM时候，此字段必传。</p> 
     * @return ContextType <p>检查内容。支持配置&#39;TEXT&#39;。</p><p>枚举值：</p><ul><li>TEXT： 文本内容。</li></ul><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>检查内容。支持配置&#39;TEXT&#39;。</p><p>枚举值：</p><ul><li>TEXT： 文本内容。</li></ul><p>当CheckType为CUSTOM时候，此字段必传。</p>
     * @param ContextType <p>检查内容。支持配置&#39;TEXT&#39;。</p><p>枚举值：</p><ul><li>TEXT： 文本内容。</li></ul><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>检查请求。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p> 
     * @return CheckSendContext <p>检查请求。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public String getCheckSendContext() {
        return this.CheckSendContext;
    }

    /**
     * Set <p>检查请求。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     * @param CheckSendContext <p>检查请求。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public void setCheckSendContext(String CheckSendContext) {
        this.CheckSendContext = CheckSendContext;
    }

    /**
     * Get <p>检查返回结果。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p> 
     * @return CheckRecvContext <p>检查返回结果。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public String getCheckRecvContext() {
        return this.CheckRecvContext;
    }

    /**
     * Set <p>检查返回结果。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     * @param CheckRecvContext <p>检查返回结果。</p><p>入参限制：字节长度要在1-500范围内。</p><p>当CheckType为CUSTOM时候，此字段必传。</p>
     */
    public void setCheckRecvContext(String CheckRecvContext) {
        this.CheckRecvContext = CheckRecvContext;
    }

    /**
     * Get <p>是否开启健康检查。</p><p>默认值：False</p> 
     * @return EnableHealthCheck <p>是否开启健康检查。</p><p>默认值：False</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否开启健康检查。</p><p>默认值：False</p>
     * @param EnableHealthCheck <p>是否开启健康检查。</p><p>默认值：False</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>响应超时时间。</p><p>取值范围：[1, 100]</p><p>默认值：2</p><p>开启健康检查时，此字段必传。</p> 
     * @return ConnectTimeout <p>响应超时时间。</p><p>取值范围：[1, 100]</p><p>默认值：2</p><p>开启健康检查时，此字段必传。</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>响应超时时间。</p><p>取值范围：[1, 100]</p><p>默认值：2</p><p>开启健康检查时，此字段必传。</p>
     * @param ConnectTimeout <p>响应超时时间。</p><p>取值范围：[1, 100]</p><p>默认值：2</p><p>开启健康检查时，此字段必传。</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>健康检查间隔。</p><p>取值范围：[5, 300]</p><p>默认值：30</p><p>开启健康检查，此字段必传。</p> 
     * @return HealthCheckInterval <p>健康检查间隔。</p><p>取值范围：[5, 300]</p><p>默认值：30</p><p>开启健康检查，此字段必传。</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>健康检查间隔。</p><p>取值范围：[5, 300]</p><p>默认值：30</p><p>开启健康检查，此字段必传。</p>
     * @param HealthCheckInterval <p>健康检查间隔。</p><p>取值范围：[5, 300]</p><p>默认值：30</p><p>开启健康检查，此字段必传。</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>不健康阀值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p> 
     * @return UnhealthyThreshold <p>不健康阀值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>不健康阀值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     * @param UnhealthyThreshold <p>不健康阀值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get <p>健康阈值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p> 
     * @return HealthyThreshold <p>健康阈值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>健康阈值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     * @param HealthyThreshold <p>健康阈值。</p><p>取值范围：[1, 10]</p><p>默认值：3</p><p>开启健康检查，此字段必传。</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>回源协议。支持配置&#39;HTTP&#39;, &#39;HTTPS&#39;。</p><p>枚举值：</p><ul><li>HTTP： HTTP回源；当终端节点组所在监听器协议是HTTP或HTTPS时可以配置HTTP。</li><li>HTTPS： HTTPS回源；当终端节点组所在监听器协议是HTTPS时可以配置HTTPS。</li></ul><p>当终端节点组所在监听器协议为HTTP或HTTPS时候，此字段必传。</p> 
     * @return ForwardProtocol <p>回源协议。支持配置&#39;HTTP&#39;, &#39;HTTPS&#39;。</p><p>枚举值：</p><ul><li>HTTP： HTTP回源；当终端节点组所在监听器协议是HTTP或HTTPS时可以配置HTTP。</li><li>HTTPS： HTTPS回源；当终端节点组所在监听器协议是HTTPS时可以配置HTTPS。</li></ul><p>当终端节点组所在监听器协议为HTTP或HTTPS时候，此字段必传。</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>回源协议。支持配置&#39;HTTP&#39;, &#39;HTTPS&#39;。</p><p>枚举值：</p><ul><li>HTTP： HTTP回源；当终端节点组所在监听器协议是HTTP或HTTPS时可以配置HTTP。</li><li>HTTPS： HTTPS回源；当终端节点组所在监听器协议是HTTPS时可以配置HTTPS。</li></ul><p>当终端节点组所在监听器协议为HTTP或HTTPS时候，此字段必传。</p>
     * @param ForwardProtocol <p>回源协议。支持配置&#39;HTTP&#39;, &#39;HTTPS&#39;。</p><p>枚举值：</p><ul><li>HTTP： HTTP回源；当终端节点组所在监听器协议是HTTP或HTTPS时可以配置HTTP。</li><li>HTTPS： HTTPS回源；当终端节点组所在监听器协议是HTTPS时可以配置HTTPS。</li></ul><p>当终端节点组所在监听器协议为HTTP或HTTPS时候，此字段必传。</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>检查域名。</p><p>入参限制：字节长度范围是3-80。</p><p>当CheckType是HTTP时，此字段必传。</p> 
     * @return CheckDomain <p>检查域名。</p><p>入参限制：字节长度范围是3-80。</p><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public String getCheckDomain() {
        return this.CheckDomain;
    }

    /**
     * Set <p>检查域名。</p><p>入参限制：字节长度范围是3-80。</p><p>当CheckType是HTTP时，此字段必传。</p>
     * @param CheckDomain <p>检查域名。</p><p>入参限制：字节长度范围是3-80。</p><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public void setCheckDomain(String CheckDomain) {
        this.CheckDomain = CheckDomain;
    }

    /**
     * Get <p>检查URL。</p><p>参数格式：必须满足正则：^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>当CheckType是HTTP时，此字段必传。</p> 
     * @return CheckPath <p>检查URL。</p><p>参数格式：必须满足正则：^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public String getCheckPath() {
        return this.CheckPath;
    }

    /**
     * Set <p>检查URL。</p><p>参数格式：必须满足正则：^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>当CheckType是HTTP时，此字段必传。</p>
     * @param CheckPath <p>检查URL。</p><p>参数格式：必须满足正则：^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public void setCheckPath(String CheckPath) {
        this.CheckPath = CheckPath;
    }

    /**
     * Get <p>请求方式。支持配置&#39;GET&#39;, &#39;HEAD&#39;。</p><p>枚举值：</p><ul><li>GET： 请求方式为GET。</li><li>HEAD： 请求方式为HEAD。</li></ul><p>当CheckType是HTTP时，此字段必传。</p> 
     * @return CheckMethod <p>请求方式。支持配置&#39;GET&#39;, &#39;HEAD&#39;。</p><p>枚举值：</p><ul><li>GET： 请求方式为GET。</li><li>HEAD： 请求方式为HEAD。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>请求方式。支持配置&#39;GET&#39;, &#39;HEAD&#39;。</p><p>枚举值：</p><ul><li>GET： 请求方式为GET。</li><li>HEAD： 请求方式为HEAD。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     * @param CheckMethod <p>请求方式。支持配置&#39;GET&#39;, &#39;HEAD&#39;。</p><p>枚举值：</p><ul><li>GET： 请求方式为GET。</li><li>HEAD： 请求方式为HEAD。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>状态检测码。支持配置&#39;http_2xx&#39;, &#39;http_3xx&#39;, &#39;http_4xx&#39;, &#39;http_5xx&#39;。</p><p>枚举值：</p><ul><li>http_2xx： 2开头的http code。</li><li>http_3xx： 3开头的http code。</li><li>http_4xx： 4开头的http code。</li><li>http_5xx： 5开头的http code。</li></ul><p>当CheckType是HTTP时，此字段必传。</p> 
     * @return StatusMask <p>状态检测码。支持配置&#39;http_2xx&#39;, &#39;http_3xx&#39;, &#39;http_4xx&#39;, &#39;http_5xx&#39;。</p><p>枚举值：</p><ul><li>http_2xx： 2开头的http code。</li><li>http_3xx： 3开头的http code。</li><li>http_4xx： 4开头的http code。</li><li>http_5xx： 5开头的http code。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public String [] getStatusMask() {
        return this.StatusMask;
    }

    /**
     * Set <p>状态检测码。支持配置&#39;http_2xx&#39;, &#39;http_3xx&#39;, &#39;http_4xx&#39;, &#39;http_5xx&#39;。</p><p>枚举值：</p><ul><li>http_2xx： 2开头的http code。</li><li>http_3xx： 3开头的http code。</li><li>http_4xx： 4开头的http code。</li><li>http_5xx： 5开头的http code。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     * @param StatusMask <p>状态检测码。支持配置&#39;http_2xx&#39;, &#39;http_3xx&#39;, &#39;http_4xx&#39;, &#39;http_5xx&#39;。</p><p>枚举值：</p><ul><li>http_2xx： 2开头的http code。</li><li>http_3xx： 3开头的http code。</li><li>http_4xx： 4开头的http code。</li><li>http_5xx： 5开头的http code。</li></ul><p>当CheckType是HTTP时，此字段必传。</p>
     */
    public void setStatusMask(String [] StatusMask) {
        this.StatusMask = StatusMask;
    }

    /**
     * Get <p>端口映射。</p><p>入参限制：七层支持1个端口映射，四层支持最多30个端口映射。</p> 
     * @return PortOverrides <p>端口映射。</p><p>入参限制：七层支持1个端口映射，四层支持最多30个端口映射。</p>
     */
    public PortOverride [] getPortOverrides() {
        return this.PortOverrides;
    }

    /**
     * Set <p>端口映射。</p><p>入参限制：七层支持1个端口映射，四层支持最多30个端口映射。</p>
     * @param PortOverrides <p>端口映射。</p><p>入参限制：七层支持1个端口映射，四层支持最多30个端口映射。</p>
     */
    public void setPortOverrides(PortOverride [] PortOverrides) {
        this.PortOverrides = PortOverrides;
    }

    /**
     * Get <p>运营商类型。支持配置&#39;CMCC&#39;, &#39;CTCC&#39;, &#39;CUCC&#39;。</p><p>枚举值：</p><ul><li>CMCC： 中国移动</li><li>CUCC： 中国联通</li><li>CTCC： 中国电信</li></ul><p>当终端节点组地域为三网地域时，此字段必传。</p> 
     * @return IspType <p>运营商类型。支持配置&#39;CMCC&#39;, &#39;CTCC&#39;, &#39;CUCC&#39;。</p><p>枚举值：</p><ul><li>CMCC： 中国移动</li><li>CUCC： 中国联通</li><li>CTCC： 中国电信</li></ul><p>当终端节点组地域为三网地域时，此字段必传。</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>运营商类型。支持配置&#39;CMCC&#39;, &#39;CTCC&#39;, &#39;CUCC&#39;。</p><p>枚举值：</p><ul><li>CMCC： 中国移动</li><li>CUCC： 中国联通</li><li>CTCC： 中国电信</li></ul><p>当终端节点组地域为三网地域时，此字段必传。</p>
     * @param IspType <p>运营商类型。支持配置&#39;CMCC&#39;, &#39;CTCC&#39;, &#39;CUCC&#39;。</p><p>枚举值：</p><ul><li>CMCC： 中国移动</li><li>CUCC： 中国联通</li><li>CTCC： 中国电信</li></ul><p>当终端节点组地域为三网地域时，此字段必传。</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>HPPTS加密算法套件；支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;；</p><p>枚举值：</p><ul><li>tls_policy_1.0-2： 加密算法套件。</li><li>tls_policy_1.1-2： 加密算法套件。</li><li>tls_policy_1.2： 加密算法套件。</li><li>tls_policy_1.2_strict： 加密算法套件。</li><li>tls_policy_1.2_strict-1.3： 加密算法套件。</li></ul><p>当回源协议为HTTPS，此字段必传。</p> 
     * @return CipherPolicyId <p>HPPTS加密算法套件；支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;；</p><p>枚举值：</p><ul><li>tls_policy_1.0-2： 加密算法套件。</li><li>tls_policy_1.1-2： 加密算法套件。</li><li>tls_policy_1.2： 加密算法套件。</li><li>tls_policy_1.2_strict： 加密算法套件。</li><li>tls_policy_1.2_strict-1.3： 加密算法套件。</li></ul><p>当回源协议为HTTPS，此字段必传。</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>HPPTS加密算法套件；支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;；</p><p>枚举值：</p><ul><li>tls_policy_1.0-2： 加密算法套件。</li><li>tls_policy_1.1-2： 加密算法套件。</li><li>tls_policy_1.2： 加密算法套件。</li><li>tls_policy_1.2_strict： 加密算法套件。</li><li>tls_policy_1.2_strict-1.3： 加密算法套件。</li></ul><p>当回源协议为HTTPS，此字段必传。</p>
     * @param CipherPolicyId <p>HPPTS加密算法套件；支持配置&#39;tls_policy_1.0-2&#39;, &#39;tls_policy_1.1-2&#39;, &#39;tls_policy_1.2&#39;, &#39;tls_policy_1.2_strict&#39;, &#39;tls_policy_1.2_strict-1.3&#39;；</p><p>枚举值：</p><ul><li>tls_policy_1.0-2： 加密算法套件。</li><li>tls_policy_1.1-2： 加密算法套件。</li><li>tls_policy_1.2： 加密算法套件。</li><li>tls_policy_1.2_strict： 加密算法套件。</li><li>tls_policy_1.2_strict-1.3： 加密算法套件。</li></ul><p>当回源协议为HTTPS，此字段必传。</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>回源协议。支持配置&#39;HTTP/1.1&#39;, &#39;HTTP/2&#39;。</p><p>枚举值：</p><ul><li>HTTP/1.1： 版本HTTP/1.1</li><li>HTTP/2： 版本HTTP/2</li></ul><p>当回源协议为HTTPS时，此字段必传。</p> 
     * @return HttpVersion <p>回源协议。支持配置&#39;HTTP/1.1&#39;, &#39;HTTP/2&#39;。</p><p>枚举值：</p><ul><li>HTTP/1.1： 版本HTTP/1.1</li><li>HTTP/2： 版本HTTP/2</li></ul><p>当回源协议为HTTPS时，此字段必传。</p>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>回源协议。支持配置&#39;HTTP/1.1&#39;, &#39;HTTP/2&#39;。</p><p>枚举值：</p><ul><li>HTTP/1.1： 版本HTTP/1.1</li><li>HTTP/2： 版本HTTP/2</li></ul><p>当回源协议为HTTPS时，此字段必传。</p>
     * @param HttpVersion <p>回源协议。支持配置&#39;HTTP/1.1&#39;, &#39;HTTP/2&#39;。</p><p>枚举值：</p><ul><li>HTTP/1.1： 版本HTTP/1.1</li><li>HTTP/2： 版本HTTP/2</li></ul><p>当回源协议为HTTPS时，此字段必传。</p>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public EndpointGroupConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointGroupConfiguration(EndpointGroupConfiguration source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EndpointGroupRegion != null) {
            this.EndpointGroupRegion = new String(source.EndpointGroupRegion);
        }
        if (source.EndpointConfigurations != null) {
            this.EndpointConfigurations = new EndpointConfigurations[source.EndpointConfigurations.length];
            for (int i = 0; i < source.EndpointConfigurations.length; i++) {
                this.EndpointConfigurations[i] = new EndpointConfigurations(source.EndpointConfigurations[i]);
            }
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new String(source.CheckPort);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.CheckSendContext != null) {
            this.CheckSendContext = new String(source.CheckSendContext);
        }
        if (source.CheckRecvContext != null) {
            this.CheckRecvContext = new String(source.CheckRecvContext);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.CheckDomain != null) {
            this.CheckDomain = new String(source.CheckDomain);
        }
        if (source.CheckPath != null) {
            this.CheckPath = new String(source.CheckPath);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.StatusMask != null) {
            this.StatusMask = new String[source.StatusMask.length];
            for (int i = 0; i < source.StatusMask.length; i++) {
                this.StatusMask[i] = new String(source.StatusMask[i]);
            }
        }
        if (source.PortOverrides != null) {
            this.PortOverrides = new PortOverride[source.PortOverrides.length];
            for (int i = 0; i < source.PortOverrides.length; i++) {
                this.PortOverrides[i] = new PortOverride(source.PortOverrides[i]);
            }
        }
        if (source.IspType != null) {
            this.IspType = new String(source.IspType);
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EndpointGroupRegion", this.EndpointGroupRegion);
        this.setParamArrayObj(map, prefix + "EndpointConfigurations.", this.EndpointConfigurations);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "CheckSendContext", this.CheckSendContext);
        this.setParamSimple(map, prefix + "CheckRecvContext", this.CheckRecvContext);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CheckDomain", this.CheckDomain);
        this.setParamSimple(map, prefix + "CheckPath", this.CheckPath);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamArraySimple(map, prefix + "StatusMask.", this.StatusMask);
        this.setParamArrayObj(map, prefix + "PortOverrides.", this.PortOverrides);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

