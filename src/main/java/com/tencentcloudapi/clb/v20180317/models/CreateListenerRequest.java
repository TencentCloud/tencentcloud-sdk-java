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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel {

    /**
    * <p>负载均衡实例 ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>要将监听器创建到哪些端口，每个端口对应一个新的监听器。端口范围：1~65535</p>
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * <p>监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。</p>
    */
    @SerializedName("ListenerNames")
    @Expose
    private String [] ListenerNames;

    /**
    * <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>证书相关信息。参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li></p>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * <p>会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】。</p>
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li></p>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * <p>监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。默认值：TCP监听器默认值为900s，UDP监听器默认值为300s。取值范围：共享型实例和独占型实例支持：10-900，性能容量型实例支持：10-1980。如需设置超过取值范围的值请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>。</p>
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * <p>TCP_SSL和QUIC是否支持PP</p>
    */
    @SerializedName("ProxyProtocol")
    @Expose
    private Boolean ProxyProtocol;

    /**
    * <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
    * <p>全端口段监听器的结束端口，端口范围：2 - 65535</p>
    */
    @SerializedName("FullEndPorts")
    @Expose
    private Long [] FullEndPorts;

    /**
    * <p>内网http监听器开启h2c开关，True（开启）、False（关闭）。默认为关闭。</p>
    */
    @SerializedName("H2cSwitch")
    @Expose
    private Boolean H2cSwitch;

    /**
    * <p>控制 TCP_SSL 类型的监听器是否移除 SSL 加密层。开启后，监听器将作为普通 TCP 协议运行。 可选值：- True： 关闭 SSL 功能（协议降级为纯文本 TCP）。- False（默认）： 保持 SSL 功能开启。</p>
    */
    @SerializedName("SslCloseSwitch")
    @Expose
    private Boolean SslCloseSwitch;

    /**
    * <p>数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）</p>
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * <p>重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("RescheduleTargetZeroWeight")
    @Expose
    private Boolean RescheduleTargetZeroWeight;

    /**
    * <p>重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * <p>重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("RescheduleExpandTarget")
    @Expose
    private Boolean RescheduleExpandTarget;

    /**
    * <p>重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
    * <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
     * Get <p>负载均衡实例 ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p> 
     * @return LoadBalancerId <p>负载均衡实例 ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例 ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     * @param LoadBalancerId <p>负载均衡实例 ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口获取。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>要将监听器创建到哪些端口，每个端口对应一个新的监听器。端口范围：1~65535</p> 
     * @return Ports <p>要将监听器创建到哪些端口，每个端口对应一个新的监听器。端口范围：1~65535</p>
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>要将监听器创建到哪些端口，每个端口对应一个新的监听器。端口范围：1~65535</p>
     * @param Ports <p>要将监听器创建到哪些端口，每个端口对应一个新的监听器。端口范围：1~65535</p>
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。</p> 
     * @return Protocol <p>监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。</p>
     * @param Protocol <p>监听器协议： TCP | UDP | HTTP | HTTPS | TCP_SSL | QUIC。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。</p> 
     * @return ListenerNames <p>要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。</p>
     */
    public String [] getListenerNames() {
        return this.ListenerNames;
    }

    /**
     * Set <p>要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。</p>
     * @param ListenerNames <p>要创建的监听器名称列表，名称与Ports数组按序一一对应，如不需立即命名，则无需提供此参数。</p>
     */
    public void setListenerNames(String [] ListenerNames) {
        this.ListenerNames = ListenerNames;
    }

    /**
     * Get <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p> 
     * @return HealthCheck <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     * @param HealthCheck <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>证书相关信息。参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li></p> 
     * @return Certificate <p>证书相关信息。参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li></p>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>证书相关信息。参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li></p>
     * @param Certificate <p>证书相关信息。参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数MultiCertInfo至少需要传一个， 但不能同时传入。</li></p>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。</p> 
     * @return SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。</p>
     * @param SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认为0，默认不开启。此参数仅适用于TCP/UDP监听器。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p> 
     * @return Scheduler <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     * @param Scheduler <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。</p> 
     * @return SniSwitch <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。</p>
     * @param SniSwitch <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。0表示未开启，1表示开启。</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。</p> 
     * @return TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。</p>
     * @param TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）</p> 
     * @return SessionType <p>会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）</p>
     * @param SessionType <p>会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。此参数仅适用于TCP/UDP监听器。七层监听器应在转发规则中设置。（若选择QUIC_CID，则Protocol必须为UDP，Scheduler必须为WRR，同时只支持ipv4）</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p> 
     * @return KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     * @param KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】。</p> 
     * @return EndPort <p>创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】。</p>
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set <p>创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】。</p>
     * @param EndPort <p>创建端口段监听器时必须传入此参数，用以标识结束端口。同时，入参Ports只允许传入一个成员，用以标识开始端口。【如果您需要体验端口段功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】。</p>
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p> 
     * @return DeregisterTargetRst <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
     * @param DeregisterTargetRst <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get <p>证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li></p> 
     * @return MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li></p>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set <p>证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li></p>
     * @param MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书，参数限制如下：<li>此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。</li><li>创建TCP_SSL监听器和未开启SNI特性的HTTPS监听器时，此参数和参数Certificate至少需要传一个， 但不能同时传入。</li></p>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get <p>监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p> 
     * @return MaxConn <p>监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     * @param MaxConn <p>监听器最大连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p> 
     * @return MaxCps <p>监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     * @param MaxCps <p>监听器最大新增连接数，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。基础网络实例不支持该参数。</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。默认值：TCP监听器默认值为900s，UDP监听器默认值为300s。取值范围：共享型实例和独占型实例支持：10-900，性能容量型实例支持：10-1980。如需设置超过取值范围的值请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>。</p> 
     * @return IdleConnectTimeout <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。默认值：TCP监听器默认值为900s，UDP监听器默认值为300s。取值范围：共享型实例和独占型实例支持：10-900，性能容量型实例支持：10-1980。如需设置超过取值范围的值请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>。</p>
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。默认值：TCP监听器默认值为900s，UDP监听器默认值为300s。取值范围：共享型实例和独占型实例支持：10-900，性能容量型实例支持：10-1980。如需设置超过取值范围的值请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>。</p>
     * @param IdleConnectTimeout <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。默认值：TCP监听器默认值为900s，UDP监听器默认值为300s。取值范围：共享型实例和独占型实例支持：10-900，性能容量型实例支持：10-1980。如需设置超过取值范围的值请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>。</p>
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get <p>TCP_SSL和QUIC是否支持PP</p> 
     * @return ProxyProtocol <p>TCP_SSL和QUIC是否支持PP</p>
     */
    public Boolean getProxyProtocol() {
        return this.ProxyProtocol;
    }

    /**
     * Set <p>TCP_SSL和QUIC是否支持PP</p>
     * @param ProxyProtocol <p>TCP_SSL和QUIC是否支持PP</p>
     */
    public void setProxyProtocol(Boolean ProxyProtocol) {
        this.ProxyProtocol = ProxyProtocol;
    }

    /**
     * Get <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p> 
     * @return SnatEnable <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     * @param SnatEnable <p>是否开启SNAT（源IP替换），True（开启）、False（关闭）。默认为关闭。注意：SnatEnable开启时会替换客户端源IP，此时<code>透传客户端源IP</code>选项关闭，反之亦然。</p>
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    /**
     * Get <p>全端口段监听器的结束端口，端口范围：2 - 65535</p> 
     * @return FullEndPorts <p>全端口段监听器的结束端口，端口范围：2 - 65535</p>
     */
    public Long [] getFullEndPorts() {
        return this.FullEndPorts;
    }

    /**
     * Set <p>全端口段监听器的结束端口，端口范围：2 - 65535</p>
     * @param FullEndPorts <p>全端口段监听器的结束端口，端口范围：2 - 65535</p>
     */
    public void setFullEndPorts(Long [] FullEndPorts) {
        this.FullEndPorts = FullEndPorts;
    }

    /**
     * Get <p>内网http监听器开启h2c开关，True（开启）、False（关闭）。默认为关闭。</p> 
     * @return H2cSwitch <p>内网http监听器开启h2c开关，True（开启）、False（关闭）。默认为关闭。</p>
     */
    public Boolean getH2cSwitch() {
        return this.H2cSwitch;
    }

    /**
     * Set <p>内网http监听器开启h2c开关，True（开启）、False（关闭）。默认为关闭。</p>
     * @param H2cSwitch <p>内网http监听器开启h2c开关，True（开启）、False（关闭）。默认为关闭。</p>
     */
    public void setH2cSwitch(Boolean H2cSwitch) {
        this.H2cSwitch = H2cSwitch;
    }

    /**
     * Get <p>控制 TCP_SSL 类型的监听器是否移除 SSL 加密层。开启后，监听器将作为普通 TCP 协议运行。 可选值：- True： 关闭 SSL 功能（协议降级为纯文本 TCP）。- False（默认）： 保持 SSL 功能开启。</p> 
     * @return SslCloseSwitch <p>控制 TCP_SSL 类型的监听器是否移除 SSL 加密层。开启后，监听器将作为普通 TCP 协议运行。 可选值：- True： 关闭 SSL 功能（协议降级为纯文本 TCP）。- False（默认）： 保持 SSL 功能开启。</p>
     */
    public Boolean getSslCloseSwitch() {
        return this.SslCloseSwitch;
    }

    /**
     * Set <p>控制 TCP_SSL 类型的监听器是否移除 SSL 加密层。开启后，监听器将作为普通 TCP 协议运行。 可选值：- True： 关闭 SSL 功能（协议降级为纯文本 TCP）。- False（默认）： 保持 SSL 功能开启。</p>
     * @param SslCloseSwitch <p>控制 TCP_SSL 类型的监听器是否移除 SSL 加密层。开启后，监听器将作为普通 TCP 协议运行。 可选值：- True： 关闭 SSL 功能（协议降级为纯文本 TCP）。- False（默认）： 保持 SSL 功能开启。</p>
     */
    public void setSslCloseSwitch(Boolean SslCloseSwitch) {
        this.SslCloseSwitch = SslCloseSwitch;
    }

    /**
     * Get <p>数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）</p> 
     * @return DataCompressMode <p>数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）</p>
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set <p>数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）</p>
     * @param DataCompressMode <p>数据压缩模式。可选值：transparent（透传模式）、compatibility（兼容模式）</p>
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get <p>重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。</p> 
     * @return RescheduleTargetZeroWeight <p>重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public Boolean getRescheduleTargetZeroWeight() {
        return this.RescheduleTargetZeroWeight;
    }

    /**
     * Set <p>重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。</p>
     * @param RescheduleTargetZeroWeight <p>重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public void setRescheduleTargetZeroWeight(Boolean RescheduleTargetZeroWeight) {
        this.RescheduleTargetZeroWeight = RescheduleTargetZeroWeight;
    }

    /**
     * Get <p>重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。</p> 
     * @return RescheduleUnhealthy <p>重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set <p>重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。</p>
     * @param RescheduleUnhealthy <p>重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get <p>重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。</p> 
     * @return RescheduleExpandTarget <p>重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public Boolean getRescheduleExpandTarget() {
        return this.RescheduleExpandTarget;
    }

    /**
     * Set <p>重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。</p>
     * @param RescheduleExpandTarget <p>重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。</p>
     */
    public void setRescheduleExpandTarget(Boolean RescheduleExpandTarget) {
        this.RescheduleExpandTarget = RescheduleExpandTarget;
    }

    /**
     * Get <p>重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。</p> 
     * @return RescheduleStartTime <p>重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set <p>重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     * @param RescheduleStartTime <p>重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    /**
     * Get <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。</p> 
     * @return RescheduleInterval <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     * @param RescheduleInterval <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。</p>
     */
    public void setRescheduleInterval(Long RescheduleInterval) {
        this.RescheduleInterval = RescheduleInterval;
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
        if (source.RescheduleTargetZeroWeight != null) {
            this.RescheduleTargetZeroWeight = new Boolean(source.RescheduleTargetZeroWeight);
        }
        if (source.RescheduleUnhealthy != null) {
            this.RescheduleUnhealthy = new Boolean(source.RescheduleUnhealthy);
        }
        if (source.RescheduleExpandTarget != null) {
            this.RescheduleExpandTarget = new Boolean(source.RescheduleExpandTarget);
        }
        if (source.RescheduleStartTime != null) {
            this.RescheduleStartTime = new Long(source.RescheduleStartTime);
        }
        if (source.RescheduleInterval != null) {
            this.RescheduleInterval = new Long(source.RescheduleInterval);
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
        this.setParamSimple(map, prefix + "RescheduleTargetZeroWeight", this.RescheduleTargetZeroWeight);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleExpandTarget", this.RescheduleExpandTarget);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);

    }
}

