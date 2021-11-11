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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
     * Get 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。 
     * @return SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     * @param SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10 
     * @return InternetMaxBandwidthOut 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
     * @param InternetMaxBandwidthOut 最大出带宽，单位Mbps，范围支持0到2048，仅对公网属性的LB生效，默认值 10
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

