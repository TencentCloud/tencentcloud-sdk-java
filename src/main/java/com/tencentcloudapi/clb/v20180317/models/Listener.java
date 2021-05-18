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

public class Listener extends AbstractModel{

    /**
    * 负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 监听器绑定的证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 是否开启SNI特性（本参数仅对于HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * 监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RuleOutput [] Rules;

    /**
    * 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
    * 后端服务器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Long KeepaliveEnable;

    /**
    * 仅支持Nat64 CLB TCP监听器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Toa")
    @Expose
    private Boolean Toa;

    /**
    * 解绑后端目标时，是否发RST给客户端，（此参数仅对于TCP监听器有意义）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeregisterTargetRst")
    @Expose
    private Boolean DeregisterTargetRst;

    /**
     * Get 负载均衡监听器 ID 
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器协议 
     * @return Protocol 监听器协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议
     * @param Protocol 监听器协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器端口 
     * @return Port 监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器绑定的证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 监听器绑定的证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 监听器绑定的证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 监听器绑定的证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck 监听器的健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheduler 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheduler 请求的调度方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionExpireTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionExpireTime 会话保持时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 是否开启SNI特性（本参数仅对于HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SniSwitch 是否开启SNI特性（本参数仅对于HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set 是否开启SNI特性（本参数仅对于HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SniSwitch 是否开启SNI特性（本参数仅对于HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get 监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleOutput [] getRules() {
        return this.Rules;
    }

    /**
     * Set 监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 监听器下的全部转发规则（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RuleOutput [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerName 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerName 监听器的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 监听器的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监听器的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 监听器的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPort 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPort 端口段结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    /**
     * Get 后端服务器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetType 后端服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetType 后端服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetGroup 绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set 绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetGroup 绑定的目标组基本信息；当监听器绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionType 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionType 会话保持类型。NORMAL表示默认会话保持类型。QUIC_CID 表示根据Quic Connection ID做会话保持。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeepaliveEnable 是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set 是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeepaliveEnable 是否开启长连接，1开启，0关闭，（本参数仅对于HTTP/HTTPS监听器有意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeepaliveEnable(Long KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get 仅支持Nat64 CLB TCP监听器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Toa 仅支持Nat64 CLB TCP监听器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getToa() {
        return this.Toa;
    }

    /**
     * Set 仅支持Nat64 CLB TCP监听器
注意：此字段可能返回 null，表示取不到有效值。
     * @param Toa 仅支持Nat64 CLB TCP监听器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToa(Boolean Toa) {
        this.Toa = Toa;
    }

    /**
     * Get 解绑后端目标时，是否发RST给客户端，（此参数仅对于TCP监听器有意义）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，（此参数仅对于TCP监听器有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeregisterTargetRst() {
        return this.DeregisterTargetRst;
    }

    /**
     * Set 解绑后端目标时，是否发RST给客户端，（此参数仅对于TCP监听器有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeregisterTargetRst 解绑后端目标时，是否发RST给客户端，（此参数仅对于TCP监听器有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeregisterTargetRst(Boolean DeregisterTargetRst) {
        this.DeregisterTargetRst = DeregisterTargetRst;
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

    }
}

