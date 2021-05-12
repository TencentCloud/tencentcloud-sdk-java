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

public class LoadBalancerTraffic extends AbstractModel{

    /**
    * 负载均衡ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡名字
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 负载均衡的vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 最大出带宽，单位：Mbps
    */
    @SerializedName("OutBandwidth")
    @Expose
    private Float OutBandwidth;

    /**
     * Get 负载均衡ID 
     * @return LoadBalancerId 负载均衡ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡ID
     * @param LoadBalancerId 负载均衡ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡名字 
     * @return LoadBalancerName 负载均衡名字
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡名字
     * @param LoadBalancerName 负载均衡名字
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡所在地域 
     * @return Region 负载均衡所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 负载均衡所在地域
     * @param Region 负载均衡所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 负载均衡的vip 
     * @return Vip 负载均衡的vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 负载均衡的vip
     * @param Vip 负载均衡的vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 最大出带宽，单位：Mbps 
     * @return OutBandwidth 最大出带宽，单位：Mbps
     */
    public Float getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 最大出带宽，单位：Mbps
     * @param OutBandwidth 最大出带宽，单位：Mbps
     */
    public void setOutBandwidth(Float OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    public LoadBalancerTraffic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerTraffic(LoadBalancerTraffic source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new Float(source.OutBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);

    }
}

