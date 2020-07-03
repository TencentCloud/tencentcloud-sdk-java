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
    * 负载均衡绑定的后端服务的地域信息
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * 网络计费相关参数
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
    * Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * 是否开启SnatPro
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

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
     * Get 负载均衡绑定的后端服务的地域信息 
     * @return TargetRegionInfo 负载均衡绑定的后端服务的地域信息
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set 负载均衡绑定的后端服务的地域信息
     * @param TargetRegionInfo 负载均衡绑定的后端服务的地域信息
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get 网络计费相关参数 
     * @return InternetChargeInfo 网络计费相关参数
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set 网络计费相关参数
     * @param InternetChargeInfo 网络计费相关参数
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。 
     * @return LoadBalancerPassToTarget Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     * @param LoadBalancerPassToTarget Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get 是否开启SnatPro 
     * @return SnatPro 是否开启SnatPro
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set 是否开启SnatPro
     * @param SnatPro 是否开启SnatPro
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);

    }
}

