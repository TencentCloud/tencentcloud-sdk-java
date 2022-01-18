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

public class DetachLoadBalancersRequest extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 传统负载均衡器ID列表，列表长度上限为20，LoadBalancerIds 和 ForwardLoadBalancerIdentifications 二者同时最多只能指定一个
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 应用型负载均衡器标识信息列表，列表长度上限为50，LoadBalancerIds 和 ForwardLoadBalancerIdentifications二者同时最多只能指定一个
    */
    @SerializedName("ForwardLoadBalancerIdentifications")
    @Expose
    private ForwardLoadBalancerIdentification [] ForwardLoadBalancerIdentifications;

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
     * Get 传统负载均衡器ID列表，列表长度上限为20，LoadBalancerIds 和 ForwardLoadBalancerIdentifications 二者同时最多只能指定一个 
     * @return LoadBalancerIds 传统负载均衡器ID列表，列表长度上限为20，LoadBalancerIds 和 ForwardLoadBalancerIdentifications 二者同时最多只能指定一个
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 传统负载均衡器ID列表，列表长度上限为20，LoadBalancerIds 和 ForwardLoadBalancerIdentifications 二者同时最多只能指定一个
     * @param LoadBalancerIds 传统负载均衡器ID列表，列表长度上限为20，LoadBalancerIds 和 ForwardLoadBalancerIdentifications 二者同时最多只能指定一个
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 应用型负载均衡器标识信息列表，列表长度上限为50，LoadBalancerIds 和 ForwardLoadBalancerIdentifications二者同时最多只能指定一个 
     * @return ForwardLoadBalancerIdentifications 应用型负载均衡器标识信息列表，列表长度上限为50，LoadBalancerIds 和 ForwardLoadBalancerIdentifications二者同时最多只能指定一个
     */
    public ForwardLoadBalancerIdentification [] getForwardLoadBalancerIdentifications() {
        return this.ForwardLoadBalancerIdentifications;
    }

    /**
     * Set 应用型负载均衡器标识信息列表，列表长度上限为50，LoadBalancerIds 和 ForwardLoadBalancerIdentifications二者同时最多只能指定一个
     * @param ForwardLoadBalancerIdentifications 应用型负载均衡器标识信息列表，列表长度上限为50，LoadBalancerIds 和 ForwardLoadBalancerIdentifications二者同时最多只能指定一个
     */
    public void setForwardLoadBalancerIdentifications(ForwardLoadBalancerIdentification [] ForwardLoadBalancerIdentifications) {
        this.ForwardLoadBalancerIdentifications = ForwardLoadBalancerIdentifications;
    }

    public DetachLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachLoadBalancersRequest(DetachLoadBalancersRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ForwardLoadBalancerIdentifications != null) {
            this.ForwardLoadBalancerIdentifications = new ForwardLoadBalancerIdentification[source.ForwardLoadBalancerIdentifications.length];
            for (int i = 0; i < source.ForwardLoadBalancerIdentifications.length; i++) {
                this.ForwardLoadBalancerIdentifications[i] = new ForwardLoadBalancerIdentification(source.ForwardLoadBalancerIdentifications[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerIdentifications.", this.ForwardLoadBalancerIdentifications);

    }
}

