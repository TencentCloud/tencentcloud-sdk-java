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

public class ModifyRuleRequest  extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改的转发规则的 ID。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的新的转发路径，如不需修改Url，则不需提供此参数
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 健康检查信息
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * 规则的请求转发方式，可选值：WRR、LEAST_CONN、IP_HASH
分别表示按权重轮询、最小连接数、按IP哈希， 默认为 WRR。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 会话保持时间
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Integer SessionExpireTime;

    /**
    * 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
     * 获取负载均衡实例 ID
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取负载均衡监听器 ID
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取要修改的转发规则的 ID。
     * @return LocationId 要修改的转发规则的 ID。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置要修改的转发规则的 ID。
     * @param LocationId 要修改的转发规则的 ID。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 获取转发规则的新的转发路径，如不需修改Url，则不需提供此参数
     * @return Url 转发规则的新的转发路径，如不需修改Url，则不需提供此参数
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置转发规则的新的转发路径，如不需修改Url，则不需提供此参数
     * @param Url 转发规则的新的转发路径，如不需修改Url，则不需提供此参数
     */
    public void setUrl(String Url) {
        this.Url = Url;
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
     * 获取会话保持时间
     * @return SessionExpireTime 会话保持时间
     */
    public Integer getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * 设置会话保持时间
     * @param SessionExpireTime 会话保持时间
     */
    public void setSessionExpireTime(Integer SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * 获取负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS
     * @return ForwardType 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * 设置负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS
     * @param ForwardType 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);

    }
}

