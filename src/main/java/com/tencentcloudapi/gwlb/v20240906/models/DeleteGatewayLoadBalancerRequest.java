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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGatewayLoadBalancerRequest extends AbstractModel {

    /**
    * 要删除的网关负载均衡实例 ID数组，数组大小最大支持20。可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/api/1782/111683)  接口获取。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get 要删除的网关负载均衡实例 ID数组，数组大小最大支持20。可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/api/1782/111683)  接口获取。 
     * @return LoadBalancerIds 要删除的网关负载均衡实例 ID数组，数组大小最大支持20。可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/api/1782/111683)  接口获取。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 要删除的网关负载均衡实例 ID数组，数组大小最大支持20。可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/api/1782/111683)  接口获取。
     * @param LoadBalancerIds 要删除的网关负载均衡实例 ID数组，数组大小最大支持20。可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/api/1782/111683)  接口获取。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    public DeleteGatewayLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGatewayLoadBalancerRequest(DeleteGatewayLoadBalancerRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);

    }
}

