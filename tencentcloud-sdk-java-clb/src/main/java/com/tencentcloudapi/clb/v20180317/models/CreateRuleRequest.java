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

public class CreateRuleRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 新建转发规则的信息
    */
    @SerializedName("Rules")
    @Expose
    private RuleInput [] Rules;

    /**
     * Get 负载均衡实例 ID 
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 监听器 ID 
     * @return ListenerId 监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID
     * @param ListenerId 监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 新建转发规则的信息 
     * @return Rules 新建转发规则的信息
     */
    public RuleInput [] getRules() {
        return this.Rules;
    }

    /**
     * Set 新建转发规则的信息
     * @param Rules 新建转发规则的信息
     */
    public void setRules(RuleInput [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

