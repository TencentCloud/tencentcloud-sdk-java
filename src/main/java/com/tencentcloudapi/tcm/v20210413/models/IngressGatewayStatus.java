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

public class IngressGatewayStatus extends AbstractModel{

    /**
    * 负载均衡实例状态
    */
    @SerializedName("LoadBalancer")
    @Expose
    private LoadBalancerStatus LoadBalancer;

    /**
     * Get 负载均衡实例状态 
     * @return LoadBalancer 负载均衡实例状态
     */
    public LoadBalancerStatus getLoadBalancer() {
        return this.LoadBalancer;
    }

    /**
     * Set 负载均衡实例状态
     * @param LoadBalancer 负载均衡实例状态
     */
    public void setLoadBalancer(LoadBalancerStatus LoadBalancer) {
        this.LoadBalancer = LoadBalancer;
    }

    public IngressGatewayStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressGatewayStatus(IngressGatewayStatus source) {
        if (source.LoadBalancer != null) {
            this.LoadBalancer = new LoadBalancerStatus(source.LoadBalancer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoadBalancer.", this.LoadBalancer);

    }
}

