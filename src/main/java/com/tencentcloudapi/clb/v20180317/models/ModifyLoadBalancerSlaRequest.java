/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerSlaRequest extends AbstractModel {

    /**
    * 负载均衡实例信息。
    */
    @SerializedName("LoadBalancerSla")
    @Expose
    private SlaUpdateParam [] LoadBalancerSla;

    /**
    * 是否强制升级，默认否。
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 负载均衡实例信息。 
     * @return LoadBalancerSla 负载均衡实例信息。
     */
    public SlaUpdateParam [] getLoadBalancerSla() {
        return this.LoadBalancerSla;
    }

    /**
     * Set 负载均衡实例信息。
     * @param LoadBalancerSla 负载均衡实例信息。
     */
    public void setLoadBalancerSla(SlaUpdateParam [] LoadBalancerSla) {
        this.LoadBalancerSla = LoadBalancerSla;
    }

    /**
     * Get 是否强制升级，默认否。 
     * @return Force 是否强制升级，默认否。
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制升级，默认否。
     * @param Force 是否强制升级，默认否。
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public ModifyLoadBalancerSlaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerSlaRequest(ModifyLoadBalancerSlaRequest source) {
        if (source.LoadBalancerSla != null) {
            this.LoadBalancerSla = new SlaUpdateParam[source.LoadBalancerSla.length];
            for (int i = 0; i < source.LoadBalancerSla.length; i++) {
                this.LoadBalancerSla[i] = new SlaUpdateParam(source.LoadBalancerSla[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoadBalancerSla.", this.LoadBalancerSla);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

