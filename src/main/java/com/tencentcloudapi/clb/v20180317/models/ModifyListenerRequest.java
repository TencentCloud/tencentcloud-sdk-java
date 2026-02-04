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

public class ModifyListenerRequest extends AbstractModel {

    /**
    * <p>负载均衡实例ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口查询。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>负载均衡监听器ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30686">DescribeListeners</a> 接口查询。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>新的监听器名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。</p>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）<br>分别表示按权重轮询、最小连接数， 默认为 WRR。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。<br>默认值0表示不开启，1表示开启。<br>若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。<br>默认为 NORMAL。</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。</p>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * <p>监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。<br>默认为 -1，表示不限速。</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。<br>默认为 -1 表示不限速。</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器。如需设置超过1980s，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>,最大可设置到3600s。</p><p>取值范围：[10, 1980]</p><p>单位：秒</p><p>默认值：900</p><p>TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。</p>
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
    * <p>数据压缩模式</p>
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
     * Get <p>负载均衡实例ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口查询。</p> 
     * @return LoadBalancerId <p>负载均衡实例ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口查询。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口查询。</p>
     * @param LoadBalancerId <p>负载均衡实例ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30685">DescribeLoadBalancers</a> 接口查询。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>负载均衡监听器ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30686">DescribeListeners</a> 接口查询。</p> 
     * @return ListenerId <p>负载均衡监听器ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30686">DescribeListeners</a> 接口查询。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>负载均衡监听器ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30686">DescribeListeners</a> 接口查询。</p>
     * @param ListenerId <p>负载均衡监听器ID，可以通过 <a href="https://cloud.tencent.com/document/product/214/30686">DescribeListeners</a> 接口查询。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>新的监听器名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p> 
     * @return ListenerName <p>新的监听器名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>新的监听器名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     * @param ListenerName <p>新的监听器名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。</p> 
     * @return SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。</p>
     * @param SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
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
     * Get <p>证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。</p> 
     * @return Certificate <p>证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。</p>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。</p>
     * @param Certificate <p>证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。</p>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）<br>分别表示按权重轮询、最小连接数， 默认为 WRR。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。</p> 
     * @return Scheduler <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）<br>分别表示按权重轮询、最小连接数， 默认为 WRR。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）<br>分别表示按权重轮询、最小连接数， 默认为 WRR。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。</p>
     * @param Scheduler <p>监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）<br>分别表示按权重轮询、最小连接数， 默认为 WRR。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。</p> 
     * @return SniSwitch <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。</p>
     * @param SniSwitch <p>是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。</p> 
     * @return TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。</p>
     * @param TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。<br>默认值0表示不开启，1表示开启。<br>若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p> 
     * @return KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。<br>默认值0表示不开启，1表示开启。<br>若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。<br>默认值0表示不开启，1表示开启。<br>若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     * @param KeepaliveEnable <p>是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。<br>默认值0表示不开启，1表示开启。<br>若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 <a href="https://cloud.tencent.com/apply/p/tsodp6qm21">内测申请</a>。</p>
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
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
     * Get <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。<br>默认为 NORMAL。</p> 
     * @return SessionType <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。<br>默认为 NORMAL。</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。<br>默认为 NORMAL。</p>
     * @param SessionType <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。<br>使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。<br>默认为 NORMAL。</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。</p> 
     * @return MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。</p>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。</p>
     * @param MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。</p>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get <p>监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。<br>默认为 -1，表示不限速。</p> 
     * @return MaxConn <p>监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。<br>默认为 -1，表示不限速。</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。<br>默认为 -1，表示不限速。</p>
     * @param MaxConn <p>监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。<br>默认为 -1，表示不限速。</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。<br>默认为 -1 表示不限速。</p> 
     * @return MaxCps <p>监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。<br>默认为 -1 表示不限速。</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。<br>默认为 -1 表示不限速。</p>
     * @param MaxCps <p>监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。<br>默认为 -1 表示不限速。</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器。如需设置超过1980s，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>,最大可设置到3600s。</p><p>取值范围：[10, 1980]</p><p>单位：秒</p><p>默认值：900</p><p>TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。</p> 
     * @return IdleConnectTimeout <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器。如需设置超过1980s，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>,最大可设置到3600s。</p><p>取值范围：[10, 1980]</p><p>单位：秒</p><p>默认值：900</p><p>TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。</p>
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器。如需设置超过1980s，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>,最大可设置到3600s。</p><p>取值范围：[10, 1980]</p><p>单位：秒</p><p>默认值：900</p><p>TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。</p>
     * @param IdleConnectTimeout <p>空闲连接超时时间，此参数仅适用于TCP/UDP监听器。如需设置超过1980s，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>,最大可设置到3600s。</p><p>取值范围：[10, 1980]</p><p>单位：秒</p><p>默认值：900</p><p>TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。</p>
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
     * Get <p>数据压缩模式</p> 
     * @return DataCompressMode <p>数据压缩模式</p>
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set <p>数据压缩模式</p>
     * @param DataCompressMode <p>数据压缩模式</p>
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

    public ModifyListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerRequest(ModifyListenerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
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
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
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
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "ProxyProtocol", this.ProxyProtocol);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);
        this.setParamSimple(map, prefix + "RescheduleTargetZeroWeight", this.RescheduleTargetZeroWeight);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleExpandTarget", this.RescheduleExpandTarget);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);

    }
}

