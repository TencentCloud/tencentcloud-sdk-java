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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerTargetAttributesRequest extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 需修改目标规则属性的应用型负载均衡器列表，列表长度上限为50
    */
    @SerializedName("ForwardLoadBalancers")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancers;

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 需修改目标规则属性的应用型负载均衡器列表，列表长度上限为50 
     * @return ForwardLoadBalancers 需修改目标规则属性的应用型负载均衡器列表，列表长度上限为50
     */
    public ForwardLoadBalancer [] getForwardLoadBalancers() {
        return this.ForwardLoadBalancers;
    }

    /**
     * Set 需修改目标规则属性的应用型负载均衡器列表，列表长度上限为50
     * @param ForwardLoadBalancers 需修改目标规则属性的应用型负载均衡器列表，列表长度上限为50
     */
    public void setForwardLoadBalancers(ForwardLoadBalancer [] ForwardLoadBalancers) {
        this.ForwardLoadBalancers = ForwardLoadBalancers;
    }

    public ModifyLoadBalancerTargetAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerTargetAttributesRequest(ModifyLoadBalancerTargetAttributesRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ForwardLoadBalancers != null) {
            this.ForwardLoadBalancers = new ForwardLoadBalancer[source.ForwardLoadBalancers.length];
            for (int i = 0; i < source.ForwardLoadBalancers.length; i++) {
                this.ForwardLoadBalancers[i] = new ForwardLoadBalancer(source.ForwardLoadBalancers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancers.", this.ForwardLoadBalancers);

    }
}

