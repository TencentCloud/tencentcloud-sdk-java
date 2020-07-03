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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7ListenerInfo extends AbstractModel{

    /**
    * 七层监听器实例ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 七层监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 七层监听器协议类型，可选值：http,https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 七层监听器的监听端口。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Long LoadBalancerPort;

    /**
    * 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * 七层监听器的认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
    */
    @SerializedName("SslMode")
    @Expose
    private Long SslMode;

    /**
    * 七层监听器关联的服务端证书ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 七层监听器关联的客户端证书ID。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间戳。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
    * 返回的转发规则列表。
    */
    @SerializedName("RuleSet")
    @Expose
    private L7ListenerInfoRule [] RuleSet;

    /**
    * https转发类型。0：https。1：spdy。2：http2。3：spdy+http2。
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private Long ForwardProtocol;

    /**
     * Get 七层监听器实例ID。 
     * @return ListenerId 七层监听器实例ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 七层监听器实例ID。
     * @param ListenerId 七层监听器实例ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 七层监听器名称。 
     * @return ListenerName 七层监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 七层监听器名称。
     * @param ListenerName 七层监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 七层监听器协议类型，可选值：http,https。 
     * @return Protocol 七层监听器协议类型，可选值：http,https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 七层监听器协议类型，可选值：http,https。
     * @param Protocol 七层监听器协议类型，可选值：http,https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 七层监听器的监听端口。 
     * @return LoadBalancerPort 七层监听器的监听端口。
     */
    public Long getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * Set 七层监听器的监听端口。
     * @param LoadBalancerPort 七层监听器的监听端口。
     */
    public void setLoadBalancerPort(Long LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * Get 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。 
     * @return Bandwidth 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     * @param Bandwidth 计费模式为按固定带宽方式时监听器的限速值，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。 
     * @return ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     * @param ListenerType 监听器的类别：L4Listener（四层监听器），L7Listener（七层监听器）。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get 七层监听器的认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。 
     * @return SslMode 七层监听器的认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public Long getSslMode() {
        return this.SslMode;
    }

    /**
     * Set 七层监听器的认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @param SslMode 七层监听器的认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public void setSslMode(Long SslMode) {
        this.SslMode = SslMode;
    }

    /**
     * Get 七层监听器关联的服务端证书ID。 
     * @return CertId 七层监听器关联的服务端证书ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 七层监听器关联的服务端证书ID。
     * @param CertId 七层监听器关联的服务端证书ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 七层监听器关联的客户端证书ID。 
     * @return CertCaId 七层监听器关联的客户端证书ID。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 七层监听器关联的客户端证书ID。
     * @param CertCaId 七层监听器关联的客户端证书ID。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。 
     * @return Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @param Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间戳。 
     * @return AddTimestamp 创建时间戳。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * Set 创建时间戳。
     * @param AddTimestamp 创建时间戳。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * Get 返回的转发规则列表。 
     * @return RuleSet 返回的转发规则列表。
     */
    public L7ListenerInfoRule [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set 返回的转发规则列表。
     * @param RuleSet 返回的转发规则列表。
     */
    public void setRuleSet(L7ListenerInfoRule [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    /**
     * Get https转发类型。0：https。1：spdy。2：http2。3：spdy+http2。 
     * @return ForwardProtocol https转发类型。0：https。1：spdy。2：http2。3：spdy+http2。
     */
    public Long getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set https转发类型。0：https。1：spdy。2：http2。3：spdy+http2。
     * @param ForwardProtocol https转发类型。0：https。1：spdy。2：http2。3：spdy+http2。
     */
    public void setForwardProtocol(Long ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "SslMode", this.SslMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTimestamp", this.AddTimestamp);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);

    }
}

