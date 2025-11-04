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
    * 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 新的监听器名称，最大长度255。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 健康检查相关参数，此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
分别表示按权重轮询、最小连接数， 默认为 WRR。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。
默认值0表示不开启，1表示开启。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
True表示发送 RST 给客户端，False表示不发送 RST 给客户端。
不传则表示不修改。
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。
默认为 NORMAL。
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * 监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。
默认为 -1，表示不限速。
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * 监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。
默认为 -1 表示不限速。
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * 空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。如需设置超过1980s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
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
    * 是否开启SNAT， True 表示开启 SNAT，False 表示不开启 SNAT。
不传则表示不修改。
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
    * 数据压缩模式
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * 重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。
    */
    @SerializedName("RescheduleTargetZeroWeight")
    @Expose
    private Boolean RescheduleTargetZeroWeight;

    /**
    * 重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。 
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * 重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。
    */
    @SerializedName("RescheduleExpandTarget")
    @Expose
    private Boolean RescheduleExpandTarget;

    /**
    * 重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
    * 重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
     * Get 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。 
     * @return LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     * @param LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。 
     * @return ListenerId 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     * @param ListenerId 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 新的监听器名称，最大长度255。 
     * @return ListenerName 新的监听器名称，最大长度255。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 新的监听器名称，最大长度255。
     * @param ListenerName 新的监听器名称，最大长度255。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。 
     * @return SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     * @param SessionExpireTime 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
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
     * Get 证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。 
     * @return Certificate 证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。
     * @param Certificate 证书相关信息，此参数仅适用于HTTPS/TCP_SSL/QUIC监听器；此参数和MultiCertInfo不能同时传入。
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
分别表示按权重轮询、最小连接数， 默认为 WRR。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。 
     * @return Scheduler 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
分别表示按权重轮询、最小连接数， 默认为 WRR。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
分别表示按权重轮询、最小连接数， 默认为 WRR。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。
     * @param Scheduler 监听器转发的方式。可选值：WRR（按权重轮询）、LEAST_CONN（按最小连接数）、IP_HASH（按 IP 地址哈希）
分别表示按权重轮询、最小连接数， 默认为 WRR。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。七层监听器的均衡方式应在转发规则中修改。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。 
     * @return SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。
     * @param SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。默认0，表示不开启，1表示开启。注意：未开启SNI的监听器可以开启SNI；已开启SNI的监听器不能关闭SNI。
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。 
     * @return TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
     * @param TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。
默认值0表示不开启，1表示开启。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。 
     * @return KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。
默认值0表示不开启，1表示开启。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。
默认值0表示不开启，1表示开启。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     * @param KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器。
默认值0表示不开启，1表示开启。
若后端服务对连接数上限有限制，则建议谨慎开启。此功能目前处于内测中，如需使用，请提交 [内测申请](https://cloud.tencent.com/apply/p/tsodp6qm21)。
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
True表示发送 RST 给客户端，False表示不发送 RST 给客户端。
不传则表示不修改。 
     * @return DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
True表示发送 RST 给客户端，False表示不发送 RST 给客户端。
不传则表示不修改。
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
True表示发送 RST 给客户端，False表示不发送 RST 给客户端。
不传则表示不修改。
     * @param DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，此参数仅适用于TCP监听器。
True表示发送 RST 给客户端，False表示不发送 RST 给客户端。
不传则表示不修改。
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
    }

    /**
     * Get 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。
默认为 NORMAL。 
     * @return SessionType 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。
默认为 NORMAL。
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。
默认为 NORMAL。
     * @param SessionType 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
使用场景：适用于TCP/UDP/TCP_SSL/QUIC监听器。
默认为 NORMAL。
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。 
     * @return MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。
     * @param MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get 监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。
默认为 -1，表示不限速。 
     * @return MaxConn 监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。
默认为 -1，表示不限速。
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set 监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。
默认为 -1，表示不限速。
     * @param MaxConn 监听器粒度并发连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格并发连接上限，其中-1表示关闭监听器粒度并发连接数限速。基础网络实例不支持该参数。
默认为 -1，表示不限速。
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get 监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。
默认为 -1 表示不限速。 
     * @return MaxCps 监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。
默认为 -1 表示不限速。
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set 监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。
默认为 -1 表示不限速。
     * @param MaxCps 监听器粒度新建连接数上限，当前仅性能容量型实例且仅TCP/UDP/TCP_SSL/QUIC监听器支持。取值范围：1-实例规格新建连接上限，其中-1表示关闭监听器粒度新建连接数限速。基础网络实例不支持该参数。
默认为 -1 表示不限速。
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get 空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。如需设置超过1980s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。 
     * @return IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。如需设置超过1980s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set 空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。如需设置超过1980s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
     * @param IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP/UDP监听器，单位：秒。TCP监听器默认值：900，UDP监听器默认值：300s。取值范围：共享型实例和独占型实例支持：10～900，性能容量型实例支持：10~1980。如需设置超过1980s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
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
     * Get 是否开启SNAT， True 表示开启 SNAT，False 表示不开启 SNAT。
不传则表示不修改。 
     * @return SnatEnable 是否开启SNAT， True 表示开启 SNAT，False 表示不开启 SNAT。
不传则表示不修改。
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set 是否开启SNAT， True 表示开启 SNAT，False 表示不开启 SNAT。
不传则表示不修改。
     * @param SnatEnable 是否开启SNAT， True 表示开启 SNAT，False 表示不开启 SNAT。
不传则表示不修改。
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    /**
     * Get 数据压缩模式 
     * @return DataCompressMode 数据压缩模式
     */
    public String getDataCompressMode() {
        return this.DataCompressMode;
    }

    /**
     * Set 数据压缩模式
     * @param DataCompressMode 数据压缩模式
     */
    public void setDataCompressMode(String DataCompressMode) {
        this.DataCompressMode = DataCompressMode;
    }

    /**
     * Get 重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。 
     * @return RescheduleTargetZeroWeight 重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。
     */
    public Boolean getRescheduleTargetZeroWeight() {
        return this.RescheduleTargetZeroWeight;
    }

    /**
     * Set 重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。
     * @param RescheduleTargetZeroWeight 重新调度功能，权重调为0开关，打开此开关，后端服务器权重调为0时触发重新调度。仅TCP/UDP监听器支持。
     */
    public void setRescheduleTargetZeroWeight(Boolean RescheduleTargetZeroWeight) {
        this.RescheduleTargetZeroWeight = RescheduleTargetZeroWeight;
    }

    /**
     * Get 重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。  
     * @return RescheduleUnhealthy 重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。 
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set 重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。 
     * @param RescheduleUnhealthy 重新调度功能，健康检查异常开关，打开此开关，后端服务器健康检查异常时触发重新调度。仅TCP/UDP监听器支持。 
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get 重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。 
     * @return RescheduleExpandTarget 重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。
     */
    public Boolean getRescheduleExpandTarget() {
        return this.RescheduleExpandTarget;
    }

    /**
     * Set 重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。
     * @param RescheduleExpandTarget 重新调度功能，扩容后端服务开关，打开此开关，后端服务器增加或者减少时触发重新调度。仅TCP/UDP监听器支持。
     */
    public void setRescheduleExpandTarget(Boolean RescheduleExpandTarget) {
        this.RescheduleExpandTarget = RescheduleExpandTarget;
    }

    /**
     * Get 重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。 
     * @return RescheduleStartTime 重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set 重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。
     * @param RescheduleStartTime 重新调度触发开始时间，取值0~3600s。仅TCP/UDP监听器支持。
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    /**
     * Get 重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。 
     * @return RescheduleInterval 重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set 重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。
     * @param RescheduleInterval 重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。
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

