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

public class DeregisterFunctionTargetsRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 待解绑的云函数列表。
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
    * 目标转发规则的 ID，当将云函数从七层转发规则上解绑时，必须输入此参数或 Domain+Url 参数。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标转发规则的域名，若已经输入 LocationId 参数，则本参数不生效。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标转发规则的 URL，若已经输入 LocationId 参数，则本参数不生效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器 ID。 
     * @return ListenerId 负载均衡监听器 ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID。
     * @param ListenerId 负载均衡监听器 ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 待解绑的云函数列表。 
     * @return FunctionTargets 待解绑的云函数列表。
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set 待解绑的云函数列表。
     * @param FunctionTargets 待解绑的云函数列表。
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    /**
     * Get 目标转发规则的 ID，当将云函数从七层转发规则上解绑时，必须输入此参数或 Domain+Url 参数。 
     * @return LocationId 目标转发规则的 ID，当将云函数从七层转发规则上解绑时，必须输入此参数或 Domain+Url 参数。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 目标转发规则的 ID，当将云函数从七层转发规则上解绑时，必须输入此参数或 Domain+Url 参数。
     * @param LocationId 目标转发规则的 ID，当将云函数从七层转发规则上解绑时，必须输入此参数或 Domain+Url 参数。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 目标转发规则的域名，若已经输入 LocationId 参数，则本参数不生效。 
     * @return Domain 目标转发规则的域名，若已经输入 LocationId 参数，则本参数不生效。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 目标转发规则的域名，若已经输入 LocationId 参数，则本参数不生效。
     * @param Domain 目标转发规则的域名，若已经输入 LocationId 参数，则本参数不生效。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 目标转发规则的 URL，若已经输入 LocationId 参数，则本参数不生效。 
     * @return Url 目标转发规则的 URL，若已经输入 LocationId 参数，则本参数不生效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 目标转发规则的 URL，若已经输入 LocationId 参数，则本参数不生效。
     * @param Url 目标转发规则的 URL，若已经输入 LocationId 参数，则本参数不生效。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DeregisterFunctionTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeregisterFunctionTargetsRequest(DeregisterFunctionTargetsRequest source) {
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

