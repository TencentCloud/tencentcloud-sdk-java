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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRulesRequest extends AbstractModel {

    /**
    * 监听器 ID，格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 转发规则 ID 列表，ID 格式为 rule- 后接 8 位字母数字。
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * 是否只预检查此次请求。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 监听器 ID，格式为 lst- 后接 8 位字母数字。 
     * @return ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID，格式为 lst- 后接 8 位字母数字。
     * @param ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。 
     * @return LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     * @param LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 转发规则 ID 列表，ID 格式为 rule- 后接 8 位字母数字。 
     * @return RuleIds 转发规则 ID 列表，ID 格式为 rule- 后接 8 位字母数字。
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 转发规则 ID 列表，ID 格式为 rule- 后接 8 位字母数字。
     * @param RuleIds 转发规则 ID 列表，ID 格式为 rule- 后接 8 位字母数字。
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 是否只预检查此次请求。 
     * @return DryRun 是否只预检查此次请求。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检查此次请求。
     * @param DryRun 是否只预检查此次请求。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRulesRequest(DeleteRulesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

