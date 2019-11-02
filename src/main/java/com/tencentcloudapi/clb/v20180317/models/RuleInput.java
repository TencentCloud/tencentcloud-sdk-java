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

public class RuleInput  extends AbstractModel{

    /**
    * 转发规则的域名。长度限制为：1~80。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。长度限制为：1~200。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~3600，单位：秒。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Integer SessionExpireTime;

    /**
    * 健康检查信息
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 证书信息
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
    * 负载均衡与后端服务之间的转发协议，目前支持 HTTP
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
    * 是否开启Http2，注意，只用HTTPS域名才能开启Http2。
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
     * 获取转发规则的域名。长度限制为：1~80。
     * @return Domain 转发规则的域名。长度限制为：1~80。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置转发规则的域名。长度限制为：1~80。
     * @param Domain 转发规则的域名。长度限制为：1~80。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取转发规则的路径。长度限制为：1~200。
     * @return Url 转发规则的路径。长度限制为：1~200。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置转发规则的路径。长度限制为：1~200。
     * @param Url 转发规则的路径。长度限制为：1~200。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~3600，单位：秒。
     * @return SessionExpireTime 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~3600，单位：秒。
     */
    public Integer getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * 设置会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~3600，单位：秒。
     * @param SessionExpireTime 会话保持时间。设置为0表示关闭会话保持，开启会话保持可取值30~3600，单位：秒。
     */
    public void setSessionExpireTime(Integer SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * 获取健康检查信息
     * @return HealthCheck 健康检查信息
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * 设置健康检查信息
     * @param HealthCheck 健康检查信息
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * 获取证书信息
     * @return Certificate 证书信息
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * 设置证书信息
     * @param Certificate 证书信息
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * 获取规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     * @return Scheduler 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * 设置规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     * @param Scheduler 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * 获取负载均衡与后端服务之间的转发协议，目前支持 HTTP
     * @return ForwardType 负载均衡与后端服务之间的转发协议，目前支持 HTTP
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * 设置负载均衡与后端服务之间的转发协议，目前支持 HTTP
     * @param ForwardType 负载均衡与后端服务之间的转发协议，目前支持 HTTP
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * 获取是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     * @return DefaultServer 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * 设置是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     * @param DefaultServer 是否将该域名设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * 获取是否开启Http2，注意，只用HTTPS域名才能开启Http2。
     * @return Http2 是否开启Http2，注意，只用HTTPS域名才能开启Http2。
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * 设置是否开启Http2，注意，只用HTTPS域名才能开启Http2。
     * @param Http2 是否开启Http2，注意，只用HTTPS域名才能开启Http2。
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * 获取后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     * @return TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * 设置后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     * @param TargetType 后端目标类型，NODE表示绑定普通节点，TARGETGROUP表示绑定目标组
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

