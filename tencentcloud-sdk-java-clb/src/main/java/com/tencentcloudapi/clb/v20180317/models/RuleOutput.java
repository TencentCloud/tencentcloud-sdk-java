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

public class RuleOutput extends AbstractModel{

    /**
    * 转发规则的 ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 会话保持时间
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * 规则的请求转发方式
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 转发规则所属的监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发规则的重定向目标信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteTarget")
    @Expose
    private RewriteTarget RewriteTarget;

    /**
    * 是否开启gzip
    */
    @SerializedName("HttpGzip")
    @Expose
    private Boolean HttpGzip;

    /**
    * 转发规则是否为自动创建
    */
    @SerializedName("BeAutoCreated")
    @Expose
    private Boolean BeAutoCreated;

    /**
    * 是否作为默认域名
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * 是否开启Http2
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * 负载均衡与后端服务之间的转发协议
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * 转发规则的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 后端服务器类型
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 绑定的目标组基本信息；当规则绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * WAF实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafDomainId")
    @Expose
    private String WafDomainId;

    /**
    * TRPC被调服务器路由，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC调用服务接口，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * QUIC状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuicStatus")
    @Expose
    private String QuicStatus;

    /**
     * Get 转发规则的 ID 
     * @return LocationId 转发规则的 ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的 ID
     * @param LocationId 转发规则的 ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 会话保持时间 
     * @return SessionExpireTime 会话保持时间
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间
     * @param SessionExpireTime 会话保持时间
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 健康检查信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck 健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck 健康检查信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 规则的请求转发方式 
     * @return Scheduler 规则的请求转发方式
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 规则的请求转发方式
     * @param Scheduler 规则的请求转发方式
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 转发规则所属的监听器 ID 
     * @return ListenerId 转发规则所属的监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 转发规则所属的监听器 ID
     * @param ListenerId 转发规则所属的监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 转发规则的重定向目标信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteTarget 转发规则的重定向目标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RewriteTarget getRewriteTarget() {
        return this.RewriteTarget;
    }

    /**
     * Set 转发规则的重定向目标信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteTarget 转发规则的重定向目标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteTarget(RewriteTarget RewriteTarget) {
        this.RewriteTarget = RewriteTarget;
    }

    /**
     * Get 是否开启gzip 
     * @return HttpGzip 是否开启gzip
     */
    public Boolean getHttpGzip() {
        return this.HttpGzip;
    }

    /**
     * Set 是否开启gzip
     * @param HttpGzip 是否开启gzip
     */
    public void setHttpGzip(Boolean HttpGzip) {
        this.HttpGzip = HttpGzip;
    }

    /**
     * Get 转发规则是否为自动创建 
     * @return BeAutoCreated 转发规则是否为自动创建
     */
    public Boolean getBeAutoCreated() {
        return this.BeAutoCreated;
    }

    /**
     * Set 转发规则是否为自动创建
     * @param BeAutoCreated 转发规则是否为自动创建
     */
    public void setBeAutoCreated(Boolean BeAutoCreated) {
        this.BeAutoCreated = BeAutoCreated;
    }

    /**
     * Get 是否作为默认域名 
     * @return DefaultServer 是否作为默认域名
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set 是否作为默认域名
     * @param DefaultServer 是否作为默认域名
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get 是否开启Http2 
     * @return Http2 是否开启Http2
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set 是否开启Http2
     * @param Http2 是否开启Http2
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get 负载均衡与后端服务之间的转发协议 
     * @return ForwardType 负载均衡与后端服务之间的转发协议
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set 负载均衡与后端服务之间的转发协议
     * @param ForwardType 负载均衡与后端服务之间的转发协议
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get 转发规则的创建时间 
     * @return CreateTime 转发规则的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 转发规则的创建时间
     * @param CreateTime 转发规则的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 后端服务器类型 
     * @return TargetType 后端服务器类型
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端服务器类型
     * @param TargetType 后端服务器类型
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 绑定的目标组基本信息；当规则绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetGroup 绑定的目标组基本信息；当规则绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set 绑定的目标组基本信息；当规则绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetGroup 绑定的目标组基本信息；当规则绑定目标组时，会返回该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get WAF实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafDomainId WAF实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWafDomainId() {
        return this.WafDomainId;
    }

    /**
     * Set WAF实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafDomainId WAF实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafDomainId(String WafDomainId) {
        this.WafDomainId = WafDomainId;
    }

    /**
     * Get TRPC被调服务器路由，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set TRPC被调服务器路由，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get TRPC调用服务接口，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrpcFunc TRPC调用服务接口，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC调用服务接口，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrpcFunc TRPC调用服务接口，ForwardType为TRPC时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get QUIC状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuicStatus QUIC状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuicStatus() {
        return this.QuicStatus;
    }

    /**
     * Set QUIC状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuicStatus QUIC状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuicStatus(String QuicStatus) {
        this.QuicStatus = QuicStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamObj(map, prefix + "RewriteTarget.", this.RewriteTarget);
        this.setParamSimple(map, prefix + "HttpGzip", this.HttpGzip);
        this.setParamSimple(map, prefix + "BeAutoCreated", this.BeAutoCreated);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamObj(map, prefix + "TargetGroup.", this.TargetGroup);
        this.setParamSimple(map, prefix + "WafDomainId", this.WafDomainId);
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);
        this.setParamSimple(map, prefix + "QuicStatus", this.QuicStatus);

    }
}

