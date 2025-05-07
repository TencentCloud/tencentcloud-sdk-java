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

public class ModifyRuleRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改的转发规则的 ID， 可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的新的转发路径，如不需修改Url，则不需提供此参数。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 健康检查信息。
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
    * 会话保持时间。取值范围0或30-86400（单位：秒）。
默认为0。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS、GRPC。仅HTTPS监听器该参数有效。
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * TRPC被调服务器路由，ForwardType为TRPC时必填。目前暂未对外开放。
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放。
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * OAuth配置信息。
    */
    @SerializedName("OAuth")
    @Expose
    private OAuth OAuth;

    /**
     * Get 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。 
     * @return LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     * @param LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。 
     * @return ListenerId 负载均衡监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     * @param ListenerId 负载均衡监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 要修改的转发规则的 ID， 可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。 
     * @return LocationId 要修改的转发规则的 ID， 可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 要修改的转发规则的 ID， 可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     * @param LocationId 要修改的转发规则的 ID， 可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的新的转发路径，如不需修改Url，则不需提供此参数。 
     * @return Url 转发规则的新的转发路径，如不需修改Url，则不需提供此参数。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的新的转发路径，如不需修改Url，则不需提供此参数。
     * @param Url 转发规则的新的转发路径，如不需修改Url，则不需提供此参数。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 健康检查信息。 
     * @return HealthCheck 健康检查信息。
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查信息。
     * @param HealthCheck 健康检查信息。
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
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
     * Get 会话保持时间。取值范围0或30-86400（单位：秒）。
默认为0。 
     * @return SessionExpireTime 会话保持时间。取值范围0或30-86400（单位：秒）。
默认为0。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间。取值范围0或30-86400（单位：秒）。
默认为0。
     * @param SessionExpireTime 会话保持时间。取值范围0或30-86400（单位：秒）。
默认为0。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS、GRPC。仅HTTPS监听器该参数有效。 
     * @return ForwardType 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS、GRPC。仅HTTPS监听器该参数有效。
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS、GRPC。仅HTTPS监听器该参数有效。
     * @param ForwardType 负载均衡实例与后端服务之间的转发协议，默认HTTP，可取值：HTTP、HTTPS、GRPC。仅HTTPS监听器该参数有效。
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
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
     * Get TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放。 
     * @return TrpcFunc TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放。
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放。
     * @param TrpcFunc TRPC调用服务接口，ForwardType为TRPC时必填。目前暂未对外开放。
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get OAuth配置信息。 
     * @return OAuth OAuth配置信息。
     */
    public OAuth getOAuth() {
        return this.OAuth;
    }

    /**
     * Set OAuth配置信息。
     * @param OAuth OAuth配置信息。
     */
    public void setOAuth(OAuth OAuth) {
        this.OAuth = OAuth;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.TrpcCallee != null) {
            this.TrpcCallee = new String(source.TrpcCallee);
        }
        if (source.TrpcFunc != null) {
            this.TrpcFunc = new String(source.TrpcFunc);
        }
        if (source.OAuth != null) {
            this.OAuth = new OAuth(source.OAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);
        this.setParamObj(map, prefix + "OAuth.", this.OAuth);

    }
}

