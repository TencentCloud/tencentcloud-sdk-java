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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbInstanceDetail extends AbstractModel {

    /**
    * CLB实例ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB实例名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB监听器列表
    */
    @SerializedName("Listeners")
    @Expose
    private ClbListener [] Listeners;

    /**
    * 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
     * Get CLB实例ID 
     * @return LoadBalancerId CLB实例ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB实例ID
     * @param LoadBalancerId CLB实例ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB实例名称 
     * @return LoadBalancerName CLB实例名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB实例名称
     * @param LoadBalancerName CLB实例名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB监听器列表 
     * @return Listeners CLB监听器列表
     */
    public ClbListener [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set CLB监听器列表
     * @param Listeners CLB监听器列表
     */
    public void setListeners(ClbListener [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡 
     * @return Forward 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     * @param Forward 负载均衡类型，0 传统型负载均衡； 1 应用型负载均衡
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    public ClbInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbInstanceDetail(ClbInstanceDetail source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Listeners != null) {
            this.Listeners = new ClbListener[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ClbListener(source.Listeners[i]);
            }
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamSimple(map, prefix + "Forward", this.Forward);

    }
}

