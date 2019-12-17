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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel{

    /**
    * 7层监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发规则的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 转发规则对应源站的类型，支持IP和DOMAIN类型。
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 规则转发源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 规则是否开启健康检查，1开启，0关闭。
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 源站健康检查相关参数
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * 加速通道转发到源站的协议类型：支持HTTP或HTTPS。
不传递该字段时表示使用对应监听器的ForwardProtocol。
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 加速通道转发到远照的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
     * Get 7层监听器ID 
     * @return ListenerId 7层监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 7层监听器ID
     * @param ListenerId 7层监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 转发规则的域名 
     * @return Domain 转发规则的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名
     * @param Domain 转发规则的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径 
     * @return Path 转发规则的路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 转发规则的路径
     * @param Path 转发规则的路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 转发规则对应源站的类型，支持IP和DOMAIN类型。 
     * @return RealServerType 转发规则对应源站的类型，支持IP和DOMAIN类型。
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set 转发规则对应源站的类型，支持IP和DOMAIN类型。
     * @param RealServerType 转发规则对应源站的类型，支持IP和DOMAIN类型。
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get 规则转发源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。 
     * @return Scheduler 规则转发源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 规则转发源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     * @param Scheduler 规则转发源站调度策略，支持轮询（rr），加权轮询（wrr），最小连接数（lc）。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 规则是否开启健康检查，1开启，0关闭。 
     * @return HealthCheck 规则是否开启健康检查，1开启，0关闭。
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 规则是否开启健康检查，1开启，0关闭。
     * @param HealthCheck 规则是否开启健康检查，1开启，0关闭。
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 源站健康检查相关参数 
     * @return CheckParams 源站健康检查相关参数
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set 源站健康检查相关参数
     * @param CheckParams 源站健康检查相关参数
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get 加速通道转发到源站的协议类型：支持HTTP或HTTPS。
不传递该字段时表示使用对应监听器的ForwardProtocol。 
     * @return ForwardProtocol 加速通道转发到源站的协议类型：支持HTTP或HTTPS。
不传递该字段时表示使用对应监听器的ForwardProtocol。
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 加速通道转发到源站的协议类型：支持HTTP或HTTPS。
不传递该字段时表示使用对应监听器的ForwardProtocol。
     * @param ForwardProtocol 加速通道转发到源站的协议类型：支持HTTP或HTTPS。
不传递该字段时表示使用对应监听器的ForwardProtocol。
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 加速通道转发到远照的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。 
     * @return ForwardHost 加速通道转发到远照的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set 加速通道转发到远照的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。
     * @param ForwardHost 加速通道转发到远照的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);

    }
}

