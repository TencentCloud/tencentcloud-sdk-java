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

public class CreateRuleRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 新建转发规则的信息。
    */
    @SerializedName("Rules")
    @Expose
    private RuleInput [] Rules;

    /**
     * Get 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取 
     * @return LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取
     * @param LoadBalancerId 负载均衡实例 ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口获取
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取 
     * @return ListenerId 监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取
     * @param ListenerId 监听器 ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口获取
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 新建转发规则的信息。 
     * @return Rules 新建转发规则的信息。
     */
    public RuleInput [] getRules() {
        return this.Rules;
    }

    /**
     * Set 新建转发规则的信息。
     * @param Rules 新建转发规则的信息。
     */
    public void setRules(RuleInput [] Rules) {
        this.Rules = Rules;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Rules != null) {
            this.Rules = new RuleInput[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleInput(source.Rules[i]);
            }
        }
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

