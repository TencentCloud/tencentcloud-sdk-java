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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableVpcCniNetworkTypeRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 开启vpc-cni的模式，tke-route-eni开启的是策略路由模式，tke-direct-eni开启的是独立网卡模式
    */
    @SerializedName("VpcCniType")
    @Expose
    private String VpcCniType;

    /**
    * 是否开启固定IP模式
    */
    @SerializedName("EnableStaticIp")
    @Expose
    private Boolean EnableStaticIp;

    /**
    * 使用的容器子网
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * 在固定IP模式下，Pod销毁后退还IP的时间，传参必须大于300；不传默认IP永不销毁。
    */
    @SerializedName("ExpiredSeconds")
    @Expose
    private Long ExpiredSeconds;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 开启vpc-cni的模式，tke-route-eni开启的是策略路由模式，tke-direct-eni开启的是独立网卡模式 
     * @return VpcCniType 开启vpc-cni的模式，tke-route-eni开启的是策略路由模式，tke-direct-eni开启的是独立网卡模式
     */
    public String getVpcCniType() {
        return this.VpcCniType;
    }

    /**
     * Set 开启vpc-cni的模式，tke-route-eni开启的是策略路由模式，tke-direct-eni开启的是独立网卡模式
     * @param VpcCniType 开启vpc-cni的模式，tke-route-eni开启的是策略路由模式，tke-direct-eni开启的是独立网卡模式
     */
    public void setVpcCniType(String VpcCniType) {
        this.VpcCniType = VpcCniType;
    }

    /**
     * Get 是否开启固定IP模式 
     * @return EnableStaticIp 是否开启固定IP模式
     */
    public Boolean getEnableStaticIp() {
        return this.EnableStaticIp;
    }

    /**
     * Set 是否开启固定IP模式
     * @param EnableStaticIp 是否开启固定IP模式
     */
    public void setEnableStaticIp(Boolean EnableStaticIp) {
        this.EnableStaticIp = EnableStaticIp;
    }

    /**
     * Get 使用的容器子网 
     * @return Subnets 使用的容器子网
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set 使用的容器子网
     * @param Subnets 使用的容器子网
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get 在固定IP模式下，Pod销毁后退还IP的时间，传参必须大于300；不传默认IP永不销毁。 
     * @return ExpiredSeconds 在固定IP模式下，Pod销毁后退还IP的时间，传参必须大于300；不传默认IP永不销毁。
     */
    public Long getExpiredSeconds() {
        return this.ExpiredSeconds;
    }

    /**
     * Set 在固定IP模式下，Pod销毁后退还IP的时间，传参必须大于300；不传默认IP永不销毁。
     * @param ExpiredSeconds 在固定IP模式下，Pod销毁后退还IP的时间，传参必须大于300；不传默认IP永不销毁。
     */
    public void setExpiredSeconds(Long ExpiredSeconds) {
        this.ExpiredSeconds = ExpiredSeconds;
    }

    public EnableVpcCniNetworkTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableVpcCniNetworkTypeRequest(EnableVpcCniNetworkTypeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VpcCniType != null) {
            this.VpcCniType = new String(source.VpcCniType);
        }
        if (source.EnableStaticIp != null) {
            this.EnableStaticIp = new Boolean(source.EnableStaticIp);
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
        if (source.ExpiredSeconds != null) {
            this.ExpiredSeconds = new Long(source.ExpiredSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VpcCniType", this.VpcCniType);
        this.setParamSimple(map, prefix + "EnableStaticIp", this.EnableStaticIp);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "ExpiredSeconds", this.ExpiredSeconds);

    }
}

