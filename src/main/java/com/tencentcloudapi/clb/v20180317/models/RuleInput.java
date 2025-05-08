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

public class RuleInput extends AbstractModel {

    /**
    * 转发规则的路径。长度限制为：1~200。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 健康检查信息。详情请参见：[健康检查](https://cloud.tencent.com/document/product/214/6097)
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书信息；此参数和MultiCertInfo不能同时传入。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * 是否开启QUIC，注意，只有HTTPS域名才能开启QUIC
    */
    @SerializedName("Quic")
    @Expose
    private Boolean Quic;

    /**
    * 转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
     * Get 转发规则的路径。长度限制为：1~200。 
     * @return Url 转发规则的路径。长度限制为：1~200。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。长度限制为：1~200。
     * @param Url 转发规则的路径。长度限制为：1~200。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。 
     * @return Domain 转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     * @param Domain 转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。 
     * @return SessionExpireTime 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。
     * @param SessionExpireTime 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 健康检查信息。详情请参见：[健康检查](https://cloud.tencent.com/document/product/214/6097) 
     * @return HealthCheck 健康检查信息。详情请参见：[健康检查](https://cloud.tencent.com/document/product/214/6097)
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查信息。详情请参见：[健康检查](https://cloud.tencent.com/document/product/214/6097)
     * @param HealthCheck 健康检查信息。详情请参见：[健康检查](https://cloud.tencent.com/document/product/214/6097)
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 证书信息；此参数和MultiCertInfo不能同时传入。 
     * @return Certificate 证书信息；此参数和MultiCertInfo不能同时传入。
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书信息；此参数和MultiCertInfo不能同时传入。
     * @param Certificate 证书信息；此参数和MultiCertInfo不能同时传入。
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。 
     * @return Scheduler 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     * @param Scheduler 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。 
     * @return ForwardType 负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set 负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。
     * @param ForwardType 负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。 
     * @return DefaultServer 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     * @param DefaultServer 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get 是否开启Http2，注意，只有HTTPS域名才能开启Http2。 
     * @return Http2 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     * @param Http2 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组 
     * @return TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     * @param TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。 
     * @return TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。
     * @param TrpcCallee TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放 
     * @return TrpcFunc TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放
     * @param TrpcFunc TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get 是否开启QUIC，注意，只有HTTPS域名才能开启QUIC 
     * @return Quic 是否开启QUIC，注意，只有HTTPS域名才能开启QUIC
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set 是否开启QUIC，注意，只有HTTPS域名才能开启QUIC
     * @param Quic 是否开启QUIC，注意，只有HTTPS域名才能开启QUIC
     */
    public void setQuic(Boolean Quic) {
        this.Quic = Quic;
    }

    /**
     * Get 转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。 
     * @return Domains 转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     * @param Domains 转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。 
     * @return MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。
     * @param MultiCertInfo 证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    public RuleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInput(RuleInput source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
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
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.DefaultServer != null) {
            this.DefaultServer = new Boolean(source.DefaultServer);
        }
        if (source.Http2 != null) {
            this.Http2 = new Boolean(source.Http2);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TrpcCallee != null) {
            this.TrpcCallee = new String(source.TrpcCallee);
        }
        if (source.TrpcFunc != null) {
            this.TrpcFunc = new String(source.TrpcFunc);
        }
        if (source.Quic != null) {
            this.Quic = new Boolean(source.Quic);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.MultiCertInfo != null) {
            this.MultiCertInfo = new MultiCertInfo(source.MultiCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);
        this.setParamSimple(map, prefix + "Quic", this.Quic);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);

    }
}

