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

public class RenewLoadBalancersRequest extends AbstractModel {

    /**
    * 负载均衡实例唯一ID数组，最多支持20个。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 负载均衡实例的预付费相关属性。
    */
    @SerializedName("LBChargePrepaid")
    @Expose
    private LBChargePrepaid LBChargePrepaid;

    /**
     * Get 负载均衡实例唯一ID数组，最多支持20个。 
     * @return LoadBalancerIds 负载均衡实例唯一ID数组，最多支持20个。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例唯一ID数组，最多支持20个。
     * @param LoadBalancerIds 负载均衡实例唯一ID数组，最多支持20个。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 负载均衡实例的预付费相关属性。 
     * @return LBChargePrepaid 负载均衡实例的预付费相关属性。
     */
    public LBChargePrepaid getLBChargePrepaid() {
        return this.LBChargePrepaid;
    }

    /**
     * Set 负载均衡实例的预付费相关属性。
     * @param LBChargePrepaid 负载均衡实例的预付费相关属性。
     */
    public void setLBChargePrepaid(LBChargePrepaid LBChargePrepaid) {
        this.LBChargePrepaid = LBChargePrepaid;
    }

    public RenewLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewLoadBalancersRequest(RenewLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LBChargePrepaid != null) {
            this.LBChargePrepaid = new LBChargePrepaid(source.LBChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamObj(map, prefix + "LBChargePrepaid.", this.LBChargePrepaid);

    }
}

