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

public class TargetGroupAssociation extends AbstractModel {

    /**
    * 网关负载均衡实例ID，可以通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)获取网关负载均衡ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 目标组ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取目标组ID。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
     * Get 网关负载均衡实例ID，可以通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)获取网关负载均衡ID。 
     * @return LoadBalancerId 网关负载均衡实例ID，可以通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)获取网关负载均衡ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 网关负载均衡实例ID，可以通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)获取网关负载均衡ID。
     * @param LoadBalancerId 网关负载均衡实例ID，可以通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)获取网关负载均衡ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 目标组ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取目标组ID。 
     * @return TargetGroupId 目标组ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取目标组ID。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取目标组ID。
     * @param TargetGroupId 目标组ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取目标组ID。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    public TargetGroupAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupAssociation(TargetGroupAssociation source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);

    }
}

