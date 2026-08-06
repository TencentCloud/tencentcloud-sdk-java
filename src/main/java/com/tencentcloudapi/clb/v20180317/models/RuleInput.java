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

public class RuleInput extends AbstractModel {

    /**
    * <p>转发规则的路径。长度限制为：1~200。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>健康检查信息。详情请参见：<a href="https://cloud.tencent.com/document/product/214/6097">健康检查</a></p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * <p>证书信息；此参数和MultiCertInfo不能同时传入。</p>
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * <p>规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH<br>分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。</p>
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * <p>是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。</p>
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * <p>是否开启Http2，注意，只有HTTPS域名才能开启Http2。</p>
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组</p><p>枚举值：</p><ul><li>NODE： 绑定普通节点</li><li>TARGETGROUP： 绑定目标组 v1</li><li>TARGETGROUP-V2： 绑定目标组 v2</li></ul>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。</p>
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * <p>TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放</p>
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * <p>是否开启QUIC，注意，只有HTTPS域名才能开启QUIC</p>
    */
    @SerializedName("Quic")
    @Expose
    private Boolean Quic;

    /**
    * <p>转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。</p>
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
    * <p>自定义cookie名</p>
    */
    @SerializedName("CookieName")
    @Expose
    private String CookieName;

    /**
     * Get <p>转发规则的路径。长度限制为：1~200。</p> 
     * @return Url <p>转发规则的路径。长度限制为：1~200。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>转发规则的路径。长度限制为：1~200。</p>
     * @param Url <p>转发规则的路径。长度限制为：1~200。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p> 
     * @return Domain <p>转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     * @param Domain <p>转发规则的域名。长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。</p> 
     * @return SessionExpireTime <p>会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。</p>
     * @param SessionExpireTime <p>会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~86400，单位：秒。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>健康检查信息。详情请参见：<a href="https://cloud.tencent.com/document/product/214/6097">健康检查</a></p> 
     * @return HealthCheck <p>健康检查信息。详情请参见：<a href="https://cloud.tencent.com/document/product/214/6097">健康检查</a></p>
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查信息。详情请参见：<a href="https://cloud.tencent.com/document/product/214/6097">健康检查</a></p>
     * @param HealthCheck <p>健康检查信息。详情请参见：<a href="https://cloud.tencent.com/document/product/214/6097">健康检查</a></p>
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>证书信息；此参数和MultiCertInfo不能同时传入。</p> 
     * @return Certificate <p>证书信息；此参数和MultiCertInfo不能同时传入。</p>
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>证书信息；此参数和MultiCertInfo不能同时传入。</p>
     * @param Certificate <p>证书信息；此参数和MultiCertInfo不能同时传入。</p>
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH<br>分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。</p> 
     * @return Scheduler <p>规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH<br>分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH<br>分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。</p>
     * @param Scheduler <p>规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH<br>分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。</p> 
     * @return ForwardType <p>负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。</p>
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set <p>负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。</p>
     * @param ForwardType <p>负载均衡与后端服务之间的转发协议，目前支持 HTTP/HTTPS/GRPC/GRPCS/TRPC，TRPC暂未对外开放，默认HTTP。</p>
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get <p>是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。</p> 
     * @return DefaultServer <p>是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。</p>
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set <p>是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。</p>
     * @param DefaultServer <p>是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。</p>
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get <p>是否开启Http2，注意，只有HTTPS域名才能开启Http2。</p> 
     * @return Http2 <p>是否开启Http2，注意，只有HTTPS域名才能开启Http2。</p>
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set <p>是否开启Http2，注意，只有HTTPS域名才能开启Http2。</p>
     * @param Http2 <p>是否开启Http2，注意，只有HTTPS域名才能开启Http2。</p>
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组</p><p>枚举值：</p><ul><li>NODE： 绑定普通节点</li><li>TARGETGROUP： 绑定目标组 v1</li><li>TARGETGROUP-V2： 绑定目标组 v2</li></ul> 
     * @return TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组</p><p>枚举值：</p><ul><li>NODE： 绑定普通节点</li><li>TARGETGROUP： 绑定目标组 v1</li><li>TARGETGROUP-V2： 绑定目标组 v2</li></ul>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组</p><p>枚举值：</p><ul><li>NODE： 绑定普通节点</li><li>TARGETGROUP： 绑定目标组 v1</li><li>TARGETGROUP-V2： 绑定目标组 v2</li></ul>
     * @param TargetType <p>后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组</p><p>枚举值：</p><ul><li>NODE： 绑定普通节点</li><li>TARGETGROUP： 绑定目标组 v1</li><li>TARGETGROUP-V2： 绑定目标组 v2</li></ul>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。</p> 
     * @return TrpcCallee <p>TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。</p>
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set <p>TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。</p>
     * @param TrpcCallee <p>TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。</p>
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get <p>TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放</p> 
     * @return TrpcFunc <p>TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放</p>
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set <p>TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放</p>
     * @param TrpcFunc <p>TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放</p>
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get <p>是否开启QUIC，注意，只有HTTPS域名才能开启QUIC</p> 
     * @return Quic <p>是否开启QUIC，注意，只有HTTPS域名才能开启QUIC</p>
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set <p>是否开启QUIC，注意，只有HTTPS域名才能开启QUIC</p>
     * @param Quic <p>是否开启QUIC，注意，只有HTTPS域名才能开启QUIC</p>
     */
    public void setQuic(Boolean Quic) {
        this.Quic = Quic;
    }

    /**
     * Get <p>转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p> 
     * @return Domains <p>转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     * @param Domains <p>转发规则的域名列表。每个域名的长度限制为：1~80。Domain和Domains只需要传一个，单域名规则传Domain，多域名规则传Domains。</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。</p> 
     * @return MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。</p>
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。</p>
     * @param MultiCertInfo <p>证书信息，支持同时传入不同算法类型的多本服务端证书；此参数和Certificate不能同时传入。</p>
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    /**
     * Get <p>自定义cookie名</p> 
     * @return CookieName <p>自定义cookie名</p>
     */
    public String getCookieName() {
        return this.CookieName;
    }

    /**
     * Set <p>自定义cookie名</p>
     * @param CookieName <p>自定义cookie名</p>
     */
    public void setCookieName(String CookieName) {
        this.CookieName = CookieName;
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
        if (source.CookieName != null) {
            this.CookieName = new String(source.CookieName);
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
        this.setParamSimple(map, prefix + "CookieName", this.CookieName);

    }
}

