/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
端口范围：1~65535
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书相关信息。参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * 创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)】。
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * 证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * 监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * 监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。取值范围：共享型实例和独占型实例支持：300-900，性能容量型实例支持：300-1980。如需设置请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)。
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * TCP_SSL和QUIC是否支持PP
    */
    @SerializedName("ProxyProtocol")
    @Expose
    private Boolean ProxyProtocol;

    /**
    * 是否开启SNAT，True（开启）、False（关闭）。
默认为关闭。
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
    * 全端口段监听器的结束端口，端口范围：2 - 65535
    */
    @SerializedName("FullEndPorts")
    @Expose
    private Long [] FullEndPorts;

    /**
    * 内网http监听器开启h2c开关，True（开启）、False（关闭）。
默认为关闭。
    */
    @SerializedName("H2cSwitch")
    @Expose
    private Boolean H2cSwitch;

    /**
    * TCP_SSL监听器支持关闭SSL后仍然支持混绑，此参数为关闭开关。True（关闭）、False（开启）.
默认为关闭。
    */
    @SerializedName("SslCloseSwitch")
    @Expose
    private Boolean SslCloseSwitch;

    /**
    * 数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
     * Get 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。 
     * @return LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     * @param LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
端口范围：1~65535 
     * @return Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
端口范围：1~65535
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
端口范围：1~65535
     * @param Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
端口范围：1~65535
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。 
     * @return Protocol 监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     * @param Protocol 监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。 
     * @return ListenerNames 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。
     * @param ListenerNames 要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。 
     * @return HealthCheck 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     * @param HealthCheck 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 证书相关信息。参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li> 
     * @return Certificate 证书相关信息。参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书相关信息。参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li>
     * @param Certificate 证书相关信息。参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。 
     * @return SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。
     * @param SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。 
     * @return Scheduler 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     * @param Scheduler 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。 
     * @return SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。
     * @param SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。 
     * @return TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。
     * @param TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4） 
     * @return SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）
     * @param SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。 
     * @return KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     * @param KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get 创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)】。 
     * @return EndPort 创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)】。
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)】。
     * @param EndPort 创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)】。
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。 
     * @return DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
     * @param DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get 证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li> 
     * @return MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set 证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li>
     * @param MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：
<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li>
<li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get 监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。 
     * @return MaxConn 监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set 监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     * @param MaxConn 监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get 监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。 
     * @return MaxCps 监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set 监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     * @param MaxCps 监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。取值范围：共享型实例和独占型实例支持：300-900，性能容量型实例支持：300-1980。如需设置请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)。 
     * @return IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。取值范围：共享型实例和独占型实例支持：300-900，性能容量型实例支持：300-1980。如需设置请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)。
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。取值范围：共享型实例和独占型实例支持：300-900，性能容量型实例支持：300-1980。如需设置请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)。
     * @param IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。取值范围：共享型实例和独占型实例支持：300-900，性能容量型实例支持：300-1980。如需设置请通过 [工单申请](https://console.cloud.tencent.com/workorder/category)。
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get TCP_SSL和QUIC是否支持PP 
     * @return ProxyProtocol TCP_SSL和QUIC是否支持PP
     */
    public Boolean getProxyProtocol() {
        return this.ProxyProtocol;
    }

    /**
     * Set TCP_SSL和QUIC是否支持PP
     * @param ProxyProtocol TCP_SSL和QUIC是否支持PP
     */
    public void setProxyProtocol(Boolean ProxyProtocol) {
        this.ProxyProtocol = ProxyProtocol;
    }

    /**
     * Get 是否开启SNAT，True（开启）、False（关闭）。
默认为关闭。 
     * @return SnatEnable 是否开启SNAT，True（开启）、False（关闭）。
默认为关闭。
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set 是否开启SNAT，True（开启）、False（关闭）。
默认为关闭。
     * @param SnatEnable 是否开启SNAT，True（开启）、False（关闭）。
默认为关闭。
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    /**
     * Get 全端口段监听器的结束端口，端口范围：2 - 65535 
     * @return FullEndPorts 全端口段监听器的结束端口，端口范围：2 - 65535
     */
    public Long [] getFullEndPorts() {
        return this.FullEndPorts;
    }

    /**
     * Set 全端口段监听器的结束端口，端口范围：2 - 65535
     * @param FullEndPorts 全端口段监听器的结束端口，端口范围：2 - 65535
     */
    public void setFullEndPorts(Long [] FullEndPorts) {
        this.FullEndPorts = FullEndPorts;
    }

    /**
     * Get 内网http监听器开启h2c开关，True（开启）、False（关闭）。
默认为关闭。 
     * @return H2cSwitch 内网http监听器开启h2c开关，True（开启）、False（关闭）。
默认为关闭。
     */
    public Boolean getH2cSwitch() {
        return this.H2cSwitch;
    }

    /**
     * Set 内网http监听器开启h2c开关，True（开启）、False（关闭）。
默认为关闭。
     * @param H2cSwitch 内网http监听器开启h2c开关，True（开启）、False（关闭）。
默认为关闭。
     */
    public void setH2cSwitch(Boolean H2cSwitch) {
        this.H2cSwitch = H2cSwitch;
    }

    /**
     * Get TCP_SSL监听器支持关闭SSL后仍然支持混绑，此参数为关闭开关。True（关闭）、False（开启）.
默认为关闭。 
     * @return SslCloseSwitch TCP_SSL监听器支持关闭SSL后仍然支持混绑，此参数为关闭开关。True（关闭）、False（开启）.
默认为关闭。
     */
    public Boolean getSslCloseSwitch() {
        return this.SslCloseSwitch;
    }

    /**
     * Set TCP_SSL监听器支持关闭SSL后仍然支持混绑，此参数为关闭开关。True（关闭）、False（开启）.
默认为关闭。
     * @param SslCloseSwitch TCP_SSL监听器支持关闭SSL后仍然支持混绑，此参数为关闭开关。True（关闭）、False（开启）.
默认为关闭。
     */
    public void setSslCloseSwitch(Boolean SslCloseSwitch) {
        this.SslCloseSwitch = SslCloseSwitch;
    }

    /**
     * Get 数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式） 
     * @return DataCompressMode 数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set 数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）
     * @param DataCompressMode 数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerNames != null) {
            this.ListenerNames = new String[source.ListenerNames.length];
            for (int i = 0; i < source.ListenerNames.length; i++) {
                this.ListenerNames[i] = new String(source.ListenerNames[i]);
            }
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
        }
        if (source.MultiCertInfo != null) {
            this.MultiCertInfo = new MultiCertInfo(source.MultiCertInfo);
        }
        if (source.MaxConn != null) {
            this.MaxConn = new Long(source.MaxConn);
        }
        if (source.MaxCps != null) {
            this.MaxCps = new Long(source.MaxCps);
        }
        if (source.IdleConnectTimeout != null) {
            this.IdleConnectTimeout = new Long(source.IdleConnectTimeout);
        }
        if (source.ProxyProtocol != null) {
            this.ProxyProtocol = new Boolean(source.ProxyProtocol);
        }
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
        }
        if (source.FullEndPorts != null) {
            this.FullEndPorts = new Long[source.FullEndPorts.length];
            for (int i = 0; i < source.FullEndPorts.length; i++) {
                this.FullEndPorts[i] = new Long(source.FullEndPorts[i]);
            }
        }
        if (source.H2cSwitch != null) {
            this.H2cSwitch = new Boolean(source.H2cSwitch);
        }
        if (source.SslCloseSwitch != null) {
            this.SslCloseSwitch = new Boolean(source.SslCloseSwitch);
        }
        if (source.DataCompressMode != null) {
            this.DataCompressMode = new String(source.DataCompressMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "ListenerNames.", this.ListenerNames);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "ProxyProtocol", this.ProxyProtocol);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);
        this.setParamArraySimple(map, prefix + "FullEndPorts.", this.FullEndPorts);
        this.setParamSimple(map, prefix + "H2cSwitch", this.H2cSwitch);
        this.setParamSimple(map, prefix + "SslCloseSwitch", this.SslCloseSwitch);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);

    }
}

