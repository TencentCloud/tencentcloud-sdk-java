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

public class LoadBalancerStatus extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例名字
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡实例 VIP
    */
    @SerializedName("LoadBalancerVip")
    @Expose
    private String LoadBalancerVip;

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
     * Get 负载均衡实例名字 
     * @return LoadBalancerName 负载均衡实例名字
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例名字
     * @param LoadBalancerName 负载均衡实例名字
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡实例 VIP 
     * @return LoadBalancerVip 负载均衡实例 VIP
     */
    public String getLoadBalancerVip() {
        return this.LoadBalancerVip;
    }

    /**
     * Set 负载均衡实例 VIP
     * @param LoadBalancerVip 负载均衡实例 VIP
     */
    public void setLoadBalancerVip(String LoadBalancerVip) {
        this.LoadBalancerVip = LoadBalancerVip;
    }

    public LoadBalancerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerStatus(LoadBalancerStatus source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerVip != null) {
            this.LoadBalancerVip = new String(source.LoadBalancerVip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerVip", this.LoadBalancerVip);

    }
}

