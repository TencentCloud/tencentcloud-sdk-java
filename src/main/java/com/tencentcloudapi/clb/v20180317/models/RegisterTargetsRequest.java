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

public class RegisterTargetsRequest extends AbstractModel{

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
    * 待绑定的后端服务列表，数组长度最大支持20
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * 转发规则的ID，当绑定后端服务到七层转发规则时，必须提供此参数或Domain+Url两者之一
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标转发规则的域名，提供LocationId参数时本参数不生效
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标转发规则的URL，提供LocationId参数时本参数不生效
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 负载均衡实例 ID 
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器 ID 
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 待绑定的后端服务列表，数组长度最大支持20 
     * @return Targets 待绑定的后端服务列表，数组长度最大支持20
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 待绑定的后端服务列表，数组长度最大支持20
     * @param Targets 待绑定的后端服务列表，数组长度最大支持20
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 转发规则的ID，当绑定后端服务到七层转发规则时，必须提供此参数或Domain+Url两者之一 
     * @return LocationId 转发规则的ID，当绑定后端服务到七层转发规则时，必须提供此参数或Domain+Url两者之一
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的ID，当绑定后端服务到七层转发规则时，必须提供此参数或Domain+Url两者之一
     * @param LocationId 转发规则的ID，当绑定后端服务到七层转发规则时，必须提供此参数或Domain+Url两者之一
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 目标转发规则的域名，提供LocationId参数时本参数不生效 
     * @return Domain 目标转发规则的域名，提供LocationId参数时本参数不生效
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 目标转发规则的域名，提供LocationId参数时本参数不生效
     * @param Domain 目标转发规则的域名，提供LocationId参数时本参数不生效
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 目标转发规则的URL，提供LocationId参数时本参数不生效 
     * @return Url 目标转发规则的URL，提供LocationId参数时本参数不生效
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 目标转发规则的URL，提供LocationId参数时本参数不生效
     * @param Url 目标转发规则的URL，提供LocationId参数时本参数不生效
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

