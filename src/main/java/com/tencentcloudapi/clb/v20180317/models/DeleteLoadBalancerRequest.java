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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLoadBalancerRequest extends AbstractModel {

    /**
    * 要删除的负载均衡实例 ID数组，数组大小最大支持20。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 是否强制删除clb。为true表示强制删除，为false表示不是强制删除，需要做拦截校验。
    */
    @SerializedName("ForceDelete")
    @Expose
    private Boolean ForceDelete;

    /**
     * Get 要删除的负载均衡实例 ID数组，数组大小最大支持20。 
     * @return LoadBalancerIds 要删除的负载均衡实例 ID数组，数组大小最大支持20。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 要删除的负载均衡实例 ID数组，数组大小最大支持20。
     * @param LoadBalancerIds 要删除的负载均衡实例 ID数组，数组大小最大支持20。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 是否强制删除clb。为true表示强制删除，为false表示不是强制删除，需要做拦截校验。 
     * @return ForceDelete 是否强制删除clb。为true表示强制删除，为false表示不是强制删除，需要做拦截校验。
     */
    public Boolean getForceDelete() {
        return this.ForceDelete;
    }

    /**
     * Set 是否强制删除clb。为true表示强制删除，为false表示不是强制删除，需要做拦截校验。
     * @param ForceDelete 是否强制删除clb。为true表示强制删除，为false表示不是强制删除，需要做拦截校验。
     */
    public void setForceDelete(Boolean ForceDelete) {
        this.ForceDelete = ForceDelete;
    }

    public DeleteLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoadBalancerRequest(DeleteLoadBalancerRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ForceDelete != null) {
            this.ForceDelete = new Boolean(source.ForceDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ForceDelete", this.ForceDelete);

    }
}

