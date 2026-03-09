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

public class Listener extends AbstractModel {

    /**
    * <p>负载均衡监听器 ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>监听器协议，可选值：TCP、UDP、HTTP、HTTPS、TCP_SSL、QUIC</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>监听器端口，端口范围：1-65535</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>监听器绑定的证书信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * <p>监听器的健康检查信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>请求的调度方式。 WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，默认不开启。此参数仅适用于TCP/UDP监听器。</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>是否开启SNI特性，1：表示开启，0：表示不开启（本参数仅对于HTTPS监听器有意义）</p>
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * <p>监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RuleOutput [] Rules;

    /**
    * <p>监听器的名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器的创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>端口段结束端口，端口范围：2-65535</p>
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * <p>后端服务器类型，可选值：NODE、POLARIS、TARGETGROUP、TARGETGROUP-V2</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。</p>
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * <p>是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * <p>仅支持Nat64 CLB TCP监听器</p>
    */
    @SerializedName("Toa")
    @Expose
    private Boolean Toa;

    /**
    * <p>重新调度功能，解绑后端服务开关，打开此开关，当解绑后端服务时触发重新调度。仅TCP/UDP监听器支持。</p>
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
    * <p>监听器的属性</p>
    */
    @SerializedName("AttrFlags")
    @Expose
    private String [] AttrFlags;

    /**
    * <p>绑定的目标组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetGroupList")
    @Expose
    private BasicTargetGroupInfo [] TargetGroupList;

    /**
    * <p>监听器最大连接数，-1表示监听器维度不限速。</p>
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * <p>监听器最大新增连接数，-1表示监听器维度不限速。</p>
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * <p>空闲连接超时时间，仅支持TCP监听器。默认值:900；共享型实例和独占型实例取值范围：300～900，性能容量型实例取值范围:300～1980。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
    * <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。触发重新调度后，长连接将会在设置的调度时间内断开并完成重新分配。</p><p>单位：秒</p>
    */
    @SerializedName("RescheduleInterval")
    @Expose
    private Long RescheduleInterval;

    /**
    * <p>数据压缩模式</p>
    */
    @SerializedName("DataCompressMode")
    @Expose
    private String DataCompressMode;

    /**
    * <p>重新调度启动时间，配置了重新调度启动时间后，会在启动时间到达时触发重新调度。</p>
    */
    @SerializedName("RescheduleStartTime")
    @Expose
    private Long RescheduleStartTime;

    /**
     * Get <p>负载均衡监听器 ID</p> 
     * @return ListenerId <p>负载均衡监听器 ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>负载均衡监听器 ID</p>
     * @param ListenerId <p>负载均衡监听器 ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>监听器协议，可选值：TCP、UDP、HTTP、HTTPS、TCP_SSL、QUIC</p> 
     * @return Protocol <p>监听器协议，可选值：TCP、UDP、HTTP、HTTPS、TCP_SSL、QUIC</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>监听器协议，可选值：TCP、UDP、HTTP、HTTPS、TCP_SSL、QUIC</p>
     * @param Protocol <p>监听器协议，可选值：TCP、UDP、HTTP、HTTPS、TCP_SSL、QUIC</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>监听器端口，端口范围：1-65535</p> 
     * @return Port <p>监听器端口，端口范围：1-65535</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>监听器端口，端口范围：1-65535</p>
     * @param Port <p>监听器端口，端口范围：1-65535</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>监听器绑定的证书信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate <p>监听器绑定的证书信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>监听器绑定的证书信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate <p>监听器绑定的证书信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>监听器的健康检查信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck <p>监听器的健康检查信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>监听器的健康检查信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck <p>监听器的健康检查信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>请求的调度方式。 WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheduler <p>请求的调度方式。 WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>请求的调度方式。 WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheduler <p>请求的调度方式。 WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，默认不开启。此参数仅适用于TCP/UDP监听器。</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，默认不开启。此参数仅适用于TCP/UDP监听器。</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，默认不开启。此参数仅适用于TCP/UDP监听器。</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionExpireTime <p>会话保持时间，单位：秒。可选值：30~3600，默认 0，默认不开启。此参数仅适用于TCP/UDP监听器。</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>是否开启SNI特性，1：表示开启，0：表示不开启（本参数仅对于HTTPS监听器有意义）</p> 
     * @return SniSwitch <p>是否开启SNI特性，1：表示开启，0：表示不开启（本参数仅对于HTTPS监听器有意义）</p>
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set <p>是否开启SNI特性，1：表示开启，0：表示不开启（本参数仅对于HTTPS监听器有意义）</p>
     * @param SniSwitch <p>是否开启SNI特性，1：表示开启，0：表示不开启（本参数仅对于HTTPS监听器有意义）</p>
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get <p>监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules <p>监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleOutput [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules <p>监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RuleOutput [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>监听器的名称</p> 
     * @return ListenerName <p>监听器的名称</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>监听器的名称</p>
     * @param ListenerName <p>监听器的名称</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>监听器的创建时间。</p> 
     * @return CreateTime <p>监听器的创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>监听器的创建时间。</p>
     * @param CreateTime <p>监听器的创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>端口段结束端口，端口范围：2-65535</p> 
     * @return EndPort <p>端口段结束端口，端口范围：2-65535</p>
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set <p>端口段结束端口，端口范围：2-65535</p>
     * @param EndPort <p>端口段结束端口，端口范围：2-65535</p>
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get <p>后端服务器类型，可选值：NODE、POLARIS、TARGETGROUP、TARGETGROUP-V2</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetType <p>后端服务器类型，可选值：NODE、POLARIS、TARGETGROUP、TARGETGROUP-V2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>后端服务器类型，可选值：NODE、POLARIS、TARGETGROUP、TARGETGROUP-V2</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetType <p>后端服务器类型，可选值：NODE、POLARIS、TARGETGROUP、TARGETGROUP-V2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetGroup <p>绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set <p>绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetGroup <p>绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。</p> 
     * @return SessionType <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。</p>
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。</p>
     * @param SessionType <p>会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。</p>
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeepaliveEnable <p>是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeepaliveEnable <p>是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>仅支持Nat64 CLB TCP监听器</p> 
     * @return Toa <p>仅支持Nat64 CLB TCP监听器</p>
     */
    public Boolean getToa() {
        return this.Toa;
    }

    /**
     * Set <p>仅支持Nat64 CLB TCP监听器</p>
     * @param Toa <p>仅支持Nat64 CLB TCP监听器</p>
     */
    public void setToa(Boolean Toa) {
        this.Toa = Toa;
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
     * Get <p>监听器的属性</p> 
     * @return AttrFlags <p>监听器的属性</p>
     */
    public String [] getAttrFlags() {
        return this.AttrFlags;
    }

    /**
     * Set <p>监听器的属性</p>
     * @param AttrFlags <p>监听器的属性</p>
     */
    public void setAttrFlags(String [] AttrFlags) {
        this.AttrFlags = AttrFlags;
    }

    /**
     * Get <p>绑定的目标组列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetGroupList <p>绑定的目标组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicTargetGroupInfo [] getTargetGroupList() {
        return this.TargetGroupList;
    }

    /**
     * Set <p>绑定的目标组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetGroupList <p>绑定的目标组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetGroupList(BasicTargetGroupInfo [] TargetGroupList) {
        this.TargetGroupList = TargetGroupList;
    }

    /**
     * Get <p>监听器最大连接数，-1表示监听器维度不限速。</p> 
     * @return MaxConn <p>监听器最大连接数，-1表示监听器维度不限速。</p>
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set <p>监听器最大连接数，-1表示监听器维度不限速。</p>
     * @param MaxConn <p>监听器最大连接数，-1表示监听器维度不限速。</p>
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get <p>监听器最大新增连接数，-1表示监听器维度不限速。</p> 
     * @return MaxCps <p>监听器最大新增连接数，-1表示监听器维度不限速。</p>
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set <p>监听器最大新增连接数，-1表示监听器维度不限速。</p>
     * @param MaxCps <p>监听器最大新增连接数，-1表示监听器维度不限速。</p>
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get <p>空闲连接超时时间，仅支持TCP监听器。默认值:900；共享型实例和独占型实例取值范围：300～900，性能容量型实例取值范围:300～1980。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdleConnectTimeout <p>空闲连接超时时间，仅支持TCP监听器。默认值:900；共享型实例和独占型实例取值范围：300～900，性能容量型实例取值范围:300～1980。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set <p>空闲连接超时时间，仅支持TCP监听器。默认值:900；共享型实例和独占型实例取值范围：300～900，性能容量型实例取值范围:300～1980。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdleConnectTimeout <p>空闲连接超时时间，仅支持TCP监听器。默认值:900；共享型实例和独占型实例取值范围：300～900，性能容量型实例取值范围:300～1980。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
    }

    /**
     * Get <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。触发重新调度后，长连接将会在设置的调度时间内断开并完成重新分配。</p><p>单位：秒</p> 
     * @return RescheduleInterval <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。触发重新调度后，长连接将会在设置的调度时间内断开并完成重新分配。</p><p>单位：秒</p>
     */
    public Long getRescheduleInterval() {
        return this.RescheduleInterval;
    }

    /**
     * Set <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。触发重新调度后，长连接将会在设置的调度时间内断开并完成重新分配。</p><p>单位：秒</p>
     * @param RescheduleInterval <p>重新调度触发持续时间，取值0~3600s。仅TCP/UDP监听器支持。触发重新调度后，长连接将会在设置的调度时间内断开并完成重新分配。</p><p>单位：秒</p>
     */
    public void setRescheduleInterval(Long RescheduleInterval) {
        this.RescheduleInterval = RescheduleInterval;
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
     * Get <p>重新调度启动时间，配置了重新调度启动时间后，会在启动时间到达时触发重新调度。</p> 
     * @return RescheduleStartTime <p>重新调度启动时间，配置了重新调度启动时间后，会在启动时间到达时触发重新调度。</p>
     */
    public Long getRescheduleStartTime() {
        return this.RescheduleStartTime;
    }

    /**
     * Set <p>重新调度启动时间，配置了重新调度启动时间后，会在启动时间到达时触发重新调度。</p>
     * @param RescheduleStartTime <p>重新调度启动时间，配置了重新调度启动时间后，会在启动时间到达时触发重新调度。</p>
     */
    public void setRescheduleStartTime(Long RescheduleStartTime) {
        this.RescheduleStartTime = RescheduleStartTime;
    }

    public Listener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Listener(Listener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateOutput(source.Certificate);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Rules != null) {
            this.Rules = new RuleOutput[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleOutput(source.Rules[i]);
            }
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetGroup != null) {
            this.TargetGroup = new BasicTargetGroupInfo(source.TargetGroup);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Long(source.KeepaliveEnable);
        }
        if (source.Toa != null) {
            this.Toa = new Boolean(source.Toa);
        }
        if (source.DeregisterTargetRst != null) {
            this.DeregisterTargetRst = new Boolean(source.DeregisterTargetRst);
        }
        if (source.AttrFlags != null) {
            this.AttrFlags = new String[source.AttrFlags.length];
            for (int i = 0; i < source.AttrFlags.length; i++) {
                this.AttrFlags[i] = new String(source.AttrFlags[i]);
            }
        }
        if (source.TargetGroupList != null) {
            this.TargetGroupList = new BasicTargetGroupInfo[source.TargetGroupList.length];
            for (int i = 0; i < source.TargetGroupList.length; i++) {
                this.TargetGroupList[i] = new BasicTargetGroupInfo(source.TargetGroupList[i]);
            }
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
        if (source.RescheduleInterval != null) {
            this.RescheduleInterval = new Long(source.RescheduleInterval);
        }
        if (source.DataCompressMode != null) {
            this.DataCompressMode = new String(source.DataCompressMode);
        }
        if (source.RescheduleStartTime != null) {
            this.RescheduleStartTime = new Long(source.RescheduleStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamObj(map, prefix + "TargetGroup.", this.TargetGroup);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "Toa", this.Toa);
        this.setParamSimple(map, prefix + "DeregisterTargetRst", this.DeregisterTargetRst);
        this.setParamArraySimple(map, prefix + "AttrFlags.", this.AttrFlags);
        this.setParamArrayObj(map, prefix + "TargetGroupList.", this.TargetGroupList);
        this.setParamSimple(map, prefix + "MaxConn", this.MaxConn);
        this.setParamSimple(map, prefix + "MaxCps", this.MaxCps);
        this.setParamSimple(map, prefix + "IdleConnectTimeout", this.IdleConnectTimeout);
        this.setParamSimple(map, prefix + "RescheduleInterval", this.RescheduleInterval);
        this.setParamSimple(map, prefix + "DataCompressMode", this.DataCompressMode);
        this.setParamSimple(map, prefix + "RescheduleStartTime", this.RescheduleStartTime);

    }
}

