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

public class RuleOutput extends AbstractModel {

    /**
    * 转发规则的 ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
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
    * 规则的请求转发方式。
WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。
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
    * 后端服务器类型。NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
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
    */
    @SerializedName("WafDomainId")
    @Expose
    private String WafDomainId;

    /**
    * TRPC被调服务器路由，ForwardType为TRPC时有效。目前暂未对外开放。
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC调用服务接口，ForwardType为TRPC时有效。目前暂未对外开放。
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * QUIC状态。QUIC_ACTIVE表示开启，QUIC_INACTIVE表示未开启。注意，只有HTTPS域名才能开启QUIC。
    */
    @SerializedName("QuicStatus")
    @Expose
    private String QuicStatus;

    /**
    * 转发规则的域名列表。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 绑定的目标组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetGroupList")
    @Expose
    private BasicTargetGroupInfo [] TargetGroupList;

    /**
    * OAuth配置状态信息。
    */
    @SerializedName("OAuth")
    @Expose
    private OAuth OAuth;

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
     * @return Domain 转发规则的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名。
     * @param Domain 转发规则的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径。 
     * @return Url 转发规则的路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。
     * @param Url 转发规则的路径。
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
     * @return HealthCheck 健康检查信息
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查信息
     * @param HealthCheck 健康检查信息
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
     * Get 规则的请求转发方式。
WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。 
     * @return Scheduler 规则的请求转发方式。
WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 规则的请求转发方式。
WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。
     * @param Scheduler 规则的请求转发方式。
WRR、LEAST_CONN、IP_HASH分别表示按权重轮询、最小连接数、IP Hash。
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
     * @return RewriteTarget 转发规则的重定向目标信息
     */
    public RewriteTarget getRewriteTarget() {
        return this.RewriteTarget;
    }

    /**
     * Set 转发规则的重定向目标信息
     * @param RewriteTarget 转发规则的重定向目标信息
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
     * Get 后端服务器类型。NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。 
     * @return TargetType 后端服务器类型。NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端服务器类型。NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
     * @param TargetType 后端服务器类型。NODE表示绑定普通节点，TARGETGROUP表示绑定目标组。
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
     * @return WafDomainId WAF实例ID
     */
    public String getWafDomainId() {
        return this.WafDomainId;
    }

    /**
     * Set WAF实例ID
     * @param WafDomainId WAF实例ID
     */
    public void setWafDomainId(String WafDomainId) {
        this.WafDomainId = WafDomainId;
    }

    /**
     * Get TRPC被调服务器路由，ForwardType为TRPC时有效。目前暂未对外开放。 
     * @return TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时有效。目前暂未对外开放。
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set TRPC被调服务器路由，ForwardType为TRPC时有效。目前暂未对外开放。
     * @param TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时有效。目前暂未对外开放。
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get TRPC调用服务接口，ForwardType为TRPC时有效。目前暂未对外开放。 
     * @return TrpcFunc TRPC调用服务接口，ForwardType为TRPC时有效。目前暂未对外开放。
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC调用服务接口，ForwardType为TRPC时有效。目前暂未对外开放。
     * @param TrpcFunc TRPC调用服务接口，ForwardType为TRPC时有效。目前暂未对外开放。
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get QUIC状态。QUIC_ACTIVE表示开启，QUIC_INACTIVE表示未开启。注意，只有HTTPS域名才能开启QUIC。 
     * @return QuicStatus QUIC状态。QUIC_ACTIVE表示开启，QUIC_INACTIVE表示未开启。注意，只有HTTPS域名才能开启QUIC。
     */
    public String getQuicStatus() {
        return this.QuicStatus;
    }

    /**
     * Set QUIC状态。QUIC_ACTIVE表示开启，QUIC_INACTIVE表示未开启。注意，只有HTTPS域名才能开启QUIC。
     * @param QuicStatus QUIC状态。QUIC_ACTIVE表示开启，QUIC_INACTIVE表示未开启。注意，只有HTTPS域名才能开启QUIC。
     */
    public void setQuicStatus(String QuicStatus) {
        this.QuicStatus = QuicStatus;
    }

    /**
     * Get 转发规则的域名列表。 
     * @return Domains 转发规则的域名列表。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 转发规则的域名列表。
     * @param Domains 转发规则的域名列表。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 绑定的目标组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetGroupList 绑定的目标组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicTargetGroupInfo [] getTargetGroupList() {
        return this.TargetGroupList;
    }

    /**
     * Set 绑定的目标组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetGroupList 绑定的目标组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetGroupList(BasicTargetGroupInfo [] TargetGroupList) {
        this.TargetGroupList = TargetGroupList;
    }

    /**
     * Get OAuth配置状态信息。 
     * @return OAuth OAuth配置状态信息。
     */
    public OAuth getOAuth() {
        return this.OAuth;
    }

    /**
     * Set OAuth配置状态信息。
     * @param OAuth OAuth配置状态信息。
     */
    public void setOAuth(OAuth OAuth) {
        this.OAuth = OAuth;
    }

    public RuleOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleOutput(RuleOutput source) {
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateOutput(source.Certificate);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.RewriteTarget != null) {
            this.RewriteTarget = new RewriteTarget(source.RewriteTarget);
        }
        if (source.HttpGzip != null) {
            this.HttpGzip = new Boolean(source.HttpGzip);
        }
        if (source.BeAutoCreated != null) {
            this.BeAutoCreated = new Boolean(source.BeAutoCreated);
        }
        if (source.DefaultServer != null) {
            this.DefaultServer = new Boolean(source.DefaultServer);
        }
        if (source.Http2 != null) {
            this.Http2 = new Boolean(source.Http2);
        }
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetGroup != null) {
            this.TargetGroup = new BasicTargetGroupInfo(source.TargetGroup);
        }
        if (source.WafDomainId != null) {
            this.WafDomainId = new String(source.WafDomainId);
        }
        if (source.TrpcCallee != null) {
            this.TrpcCallee = new String(source.TrpcCallee);
        }
        if (source.TrpcFunc != null) {
            this.TrpcFunc = new String(source.TrpcFunc);
        }
        if (source.QuicStatus != null) {
            this.QuicStatus = new String(source.QuicStatus);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.TargetGroupList != null) {
            this.TargetGroupList = new BasicTargetGroupInfo[source.TargetGroupList.length];
            for (int i = 0; i < source.TargetGroupList.length; i++) {
                this.TargetGroupList[i] = new BasicTargetGroupInfo(source.TargetGroupList[i]);
            }
        }
        if (source.OAuth != null) {
            this.OAuth = new OAuth(source.OAuth);
        }
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
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArrayObj(map, prefix + "TargetGroupList.", this.TargetGroupList);
        this.setParamObj(map, prefix + "OAuth.", this.OAuth);

    }
}

