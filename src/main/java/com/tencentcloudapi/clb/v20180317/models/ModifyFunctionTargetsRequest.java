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

public class ModifyFunctionTargetsRequest extends AbstractModel{

    /**
    * 负载均衡实例ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改的后端云函数服务列表。
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
    * 转发规则的ID，当绑定机器到七层转发规则时，必须提供此参数或Domain+Url两者之一。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标规则的域名，提供LocationId参数时本参数不生效。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标规则的URL，提供LocationId参数时本参数不生效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 负载均衡实例ID。 
     * @return LoadBalancerId 负载均衡实例ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID。
     * @param LoadBalancerId 负载均衡实例ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID。 
     * @return ListenerId 负载均衡监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID。
     * @param ListenerId 负载均衡监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 要修改的后端云函数服务列表。 
     * @return FunctionTargets 要修改的后端云函数服务列表。
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set 要修改的后端云函数服务列表。
     * @param FunctionTargets 要修改的后端云函数服务列表。
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    /**
     * Get 转发规则的ID，当绑定机器到七层转发规则时，必须提供此参数或Domain+Url两者之一。 
     * @return LocationId 转发规则的ID，当绑定机器到七层转发规则时，必须提供此参数或Domain+Url两者之一。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的ID，当绑定机器到七层转发规则时，必须提供此参数或Domain+Url两者之一。
     * @param LocationId 转发规则的ID，当绑定机器到七层转发规则时，必须提供此参数或Domain+Url两者之一。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 目标规则的域名，提供LocationId参数时本参数不生效。 
     * @return Domain 目标规则的域名，提供LocationId参数时本参数不生效。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 目标规则的域名，提供LocationId参数时本参数不生效。
     * @param Domain 目标规则的域名，提供LocationId参数时本参数不生效。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 目标规则的URL，提供LocationId参数时本参数不生效。 
     * @return Url 目标规则的URL，提供LocationId参数时本参数不生效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 目标规则的URL，提供LocationId参数时本参数不生效。
     * @param Url 目标规则的URL，提供LocationId参数时本参数不生效。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ModifyFunctionTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionTargetsRequest(ModifyFunctionTargetsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.FunctionTargets != null) {
            this.FunctionTargets = new FunctionTarget[source.FunctionTargets.length];
            for (int i = 0; i < source.FunctionTargets.length; i++) {
                this.FunctionTargets[i] = new FunctionTarget(source.FunctionTargets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "FunctionTargets.", this.FunctionTargets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

