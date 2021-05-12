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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerAttributesRequest extends AbstractModel{

    /**
    * 负载均衡的唯一ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 网络计费及带宽相关参数
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private LoadBalancerInternetAccessible InternetChargeInfo;

    /**
    * Target是否放通来自ELB的流量。开启放通（true）：只验证ELB上的安全组；不开启放通（false）：需同时验证ELB和后端实例上的安全组。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
     * Get 负载均衡的唯一ID 
     * @return LoadBalancerId 负载均衡的唯一ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡的唯一ID
     * @param LoadBalancerId 负载均衡的唯一ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡实例名称 
     * @return LoadBalancerName 负载均衡实例名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例名称
     * @param LoadBalancerName 负载均衡实例名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 网络计费及带宽相关参数 
     * @return InternetChargeInfo 网络计费及带宽相关参数
     */
    public LoadBalancerInternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set 网络计费及带宽相关参数
     * @param InternetChargeInfo 网络计费及带宽相关参数
     */
    public void setInternetChargeInfo(LoadBalancerInternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get Target是否放通来自ELB的流量。开启放通（true）：只验证ELB上的安全组；不开启放通（false）：需同时验证ELB和后端实例上的安全组。 
     * @return LoadBalancerPassToTarget Target是否放通来自ELB的流量。开启放通（true）：只验证ELB上的安全组；不开启放通（false）：需同时验证ELB和后端实例上的安全组。
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Target是否放通来自ELB的流量。开启放通（true）：只验证ELB上的安全组；不开启放通（false）：需同时验证ELB和后端实例上的安全组。
     * @param LoadBalancerPassToTarget Target是否放通来自ELB的流量。开启放通（true）：只验证ELB上的安全组；不开启放通（false）：需同时验证ELB和后端实例上的安全组。
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    public ModifyLoadBalancerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAttributesRequest(ModifyLoadBalancerAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.InternetChargeInfo != null) {
            this.InternetChargeInfo = new LoadBalancerInternetAccessible(source.InternetChargeInfo);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);

    }
}

