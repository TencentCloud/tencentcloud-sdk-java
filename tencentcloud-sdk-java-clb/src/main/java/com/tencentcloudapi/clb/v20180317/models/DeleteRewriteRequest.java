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

public class DeleteRewriteRequest extends AbstractModel{

    /**
    * 负载均衡实例ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 源监听器ID
    */
    @SerializedName("SourceListenerId")
    @Expose
    private String SourceListenerId;

    /**
    * 目标监听器ID
    */
    @SerializedName("TargetListenerId")
    @Expose
    private String TargetListenerId;

    /**
    * 转发规则之间的重定向关系
    */
    @SerializedName("RewriteInfos")
    @Expose
    private RewriteLocationMap [] RewriteInfos;

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
     * Get 源监听器ID 
     * @return SourceListenerId 源监听器ID
     */
    public String getSourceListenerId() {
        return this.SourceListenerId;
    }

    /**
     * Set 源监听器ID
     * @param SourceListenerId 源监听器ID
     */
    public void setSourceListenerId(String SourceListenerId) {
        this.SourceListenerId = SourceListenerId;
    }

    /**
     * Get 目标监听器ID 
     * @return TargetListenerId 目标监听器ID
     */
    public String getTargetListenerId() {
        return this.TargetListenerId;
    }

    /**
     * Set 目标监听器ID
     * @param TargetListenerId 目标监听器ID
     */
    public void setTargetListenerId(String TargetListenerId) {
        this.TargetListenerId = TargetListenerId;
    }

    /**
     * Get 转发规则之间的重定向关系 
     * @return RewriteInfos 转发规则之间的重定向关系
     */
    public RewriteLocationMap [] getRewriteInfos() {
        return this.RewriteInfos;
    }

    /**
     * Set 转发规则之间的重定向关系
     * @param RewriteInfos 转发规则之间的重定向关系
     */
    public void setRewriteInfos(RewriteLocationMap [] RewriteInfos) {
        this.RewriteInfos = RewriteInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SourceListenerId", this.SourceListenerId);
        this.setParamSimple(map, prefix + "TargetListenerId", this.TargetListenerId);
        this.setParamArrayObj(map, prefix + "RewriteInfos.", this.RewriteInfos);

    }
}

