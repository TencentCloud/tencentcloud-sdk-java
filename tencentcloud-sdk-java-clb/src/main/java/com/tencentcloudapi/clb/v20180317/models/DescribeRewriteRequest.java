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

public class DescribeRewriteRequest extends AbstractModel{

    /**
    * 负载均衡实例ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID数组
    */
    @SerializedName("SourceListenerIds")
    @Expose
    private String [] SourceListenerIds;

    /**
    * 负载均衡转发规则的ID数组
    */
    @SerializedName("SourceLocationIds")
    @Expose
    private String [] SourceLocationIds;

    /**
     * Get 负载均衡实例ID 
     * @return LoadBalancerId 负载均衡实例ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID
     * @param LoadBalancerId 负载均衡实例ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID数组 
     * @return SourceListenerIds 负载均衡监听器ID数组
     */
    public String [] getSourceListenerIds() {
        return this.SourceListenerIds;
    }

    /**
     * Set 负载均衡监听器ID数组
     * @param SourceListenerIds 负载均衡监听器ID数组
     */
    public void setSourceListenerIds(String [] SourceListenerIds) {
        this.SourceListenerIds = SourceListenerIds;
    }

    /**
     * Get 负载均衡转发规则的ID数组 
     * @return SourceLocationIds 负载均衡转发规则的ID数组
     */
    public String [] getSourceLocationIds() {
        return this.SourceLocationIds;
    }

    /**
     * Set 负载均衡转发规则的ID数组
     * @param SourceLocationIds 负载均衡转发规则的ID数组
     */
    public void setSourceLocationIds(String [] SourceLocationIds) {
        this.SourceLocationIds = SourceLocationIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "SourceListenerIds.", this.SourceListenerIds);
        this.setParamArraySimple(map, prefix + "SourceLocationIds.", this.SourceLocationIds);

    }
}

