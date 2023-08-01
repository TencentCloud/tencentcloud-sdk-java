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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
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
    * 证书相关信息，此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。此参数和MultiCertInfo不能同时传入。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 会话保持时间，单位：秒。可选值：30~3600，默认 0，表示不开启。此参数仅适用于TCP/UDP监听器。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 是否开启SNI特性，此参数仅适用于HTTPS监听器。
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
    * 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
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
    * 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数仅适用于未开启SNI特性的HTTPS监听器。此参数和Certificate不能同时传入。
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * 监听器最大连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
    */
    @SerializedName("MaxConn")
    @Expose
    private Long MaxConn;

    /**
    * 监听器最大新增连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
    */
    @SerializedName("MaxCps")
    @Expose
    private Long MaxCps;

    /**
    * 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。默认值：900，取值范围：共享型实例和独占型实例支持：300～900，性能容量型实例支持：300~2000。如需设置超过2000s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
    */
    @SerializedName("IdleConnectTimeout")
    @Expose
    private Long IdleConnectTimeout;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 要将监听器创建到哪些端口，每个端口对应一个新的监听器。 
     * @return Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
     * @param Ports 要将监听器创建到哪些端口，每个端口对应一个新的监听器。
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
     * Get 证书相关信息，此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。此参数和MultiCertInfo不能同时传入。 
     * @return Certificate 证书相关信息，此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。此参数和MultiCertInfo不能同时传入。
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书相关信息，此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。此参数和MultiCertInfo不能同时传入。
     * @param Certificate 证书相关信息，此参数仅适用于TCP_SSL监听器和未开启SNI特性的HTTPS监听器。此参数和MultiCertInfo不能同时传入。
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
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
     * Get 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。 
     * @return Scheduler 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     * @param Scheduler 监听器转发的方式。可选值：WRR、LEAST_CONN
分别表示按权重轮询、最小连接数， 默认为 WRR。此参数仅适用于TCP/UDP/TCP_SSL/QUIC监听器。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 是否开启SNI特性，此参数仅适用于HTTPS监听器。 
     * @return SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI特性，此参数仅适用于HTTPS监听器。
     * @param SniSwitch 是否开启SNI特性，此参数仅适用于HTTPS监听器。
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
     * Get 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。 
     * @return SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     * @param SessionType 会话保持类型。不传或传NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。QUIC_CID只支持UDP协议。
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。 
     * @return KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
     * @param KeepaliveEnable 是否开启长连接，此参数仅适用于HTTP/HTTPS监听器，0:关闭；1:开启， 默认关闭。
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
     * Get 监听器最大连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。 
     * @return MaxConn 监听器最大连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     */
    public Long getMaxConn() {
        return this.MaxConn;
    }

    /**
     * Set 监听器最大连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     * @param MaxConn 监听器最大连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     */
    public void setMaxConn(Long MaxConn) {
        this.MaxConn = MaxConn;
    }

    /**
     * Get 监听器最大新增连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。 
     * @return MaxCps 监听器最大新增连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     */
    public Long getMaxCps() {
        return this.MaxCps;
    }

    /**
     * Set 监听器最大新增连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     * @param MaxCps 监听器最大新增连接数，只有TCP/UDP/TCP_SSL/QUIC监听器支持，不传或者传-1表示监听器维度不限速。
     */
    public void setMaxCps(Long MaxCps) {
        this.MaxCps = MaxCps;
    }

    /**
     * Get 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。默认值：900，取值范围：共享型实例和独占型实例支持：300～900，性能容量型实例支持：300~2000。如需设置超过2000s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。 
     * @return IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。默认值：900，取值范围：共享型实例和独占型实例支持：300～900，性能容量型实例支持：300~2000。如需设置超过2000s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
     */
    public Long getIdleConnectTimeout() {
        return this.IdleConnectTimeout;
    }

    /**
     * Set 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。默认值：900，取值范围：共享型实例和独占型实例支持：300～900，性能容量型实例支持：300~2000。如需设置超过2000s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
     * @param IdleConnectTimeout 空闲连接超时时间，此参数仅适用于TCP监听器，单位：秒。默认值：900，取值范围：共享型实例和独占型实例支持：300～900，性能容量型实例支持：300~2000。如需设置超过2000s，请通过 [工单申请](https://console.cloud.tencent.com/workorder/category),最大可设置到3600s。
     */
    public void setIdleConnectTimeout(Long IdleConnectTimeout) {
        this.IdleConnectTimeout = IdleConnectTimeout;
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

    }
}

