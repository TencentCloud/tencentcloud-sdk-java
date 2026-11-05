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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAIGWCustomGuardrailPolicyRequest extends AbstractModel {

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>策略名称，长度 1～64</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述，最长 200；传空字符串可清空</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否启用策略</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>审核服务局部更新配置</p>
    */
    @SerializedName("ServiceConfig")
    @Expose
    private CustomGuardrailServiceConfigPatch ServiceConfig;

    /**
    * <p>审核服务鉴权局部更新配置</p>
    */
    @SerializedName("AuthConfig")
    @Expose
    private CustomGuardrailAuthConfigPatch AuthConfig;

    /**
    * <p>审核响应判定局部更新配置</p>
    */
    @SerializedName("DecisionConfig")
    @Expose
    private CustomGuardrailDecisionConfigPatch DecisionConfig;

    /**
    * <p>处理行为局部更新配置</p>
    */
    @SerializedName("BehaviorConfig")
    @Expose
    private CustomGuardrailBehaviorConfigPatch BehaviorConfig;

    /**
    * <p>过滤与采样局部更新配置</p>
    */
    @SerializedName("FilterConfig")
    @Expose
    private CustomGuardrailFilterConfigPatch FilterConfig;

    /**
    * <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p>
    */
    @SerializedName("Scope")
    @Expose
    private CustomGuardrailScopeInput Scope;

    /**
     * Get <p>网关实例 ID</p> 
     * @return GatewayId <p>网关实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 ID</p>
     * @param GatewayId <p>网关实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>策略 ID</p> 
     * @return PolicyId <p>策略 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略 ID</p>
     * @param PolicyId <p>策略 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略名称，长度 1～64</p> 
     * @return Name <p>策略名称，长度 1～64</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称，长度 1～64</p>
     * @param Name <p>策略名称，长度 1～64</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述，最长 200；传空字符串可清空</p> 
     * @return Description <p>策略描述，最长 200；传空字符串可清空</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述，最长 200；传空字符串可清空</p>
     * @param Description <p>策略描述，最长 200；传空字符串可清空</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否启用策略</p> 
     * @return Enabled <p>是否启用策略</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用策略</p>
     * @param Enabled <p>是否启用策略</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>审核服务局部更新配置</p> 
     * @return ServiceConfig <p>审核服务局部更新配置</p>
     */
    public CustomGuardrailServiceConfigPatch getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set <p>审核服务局部更新配置</p>
     * @param ServiceConfig <p>审核服务局部更新配置</p>
     */
    public void setServiceConfig(CustomGuardrailServiceConfigPatch ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get <p>审核服务鉴权局部更新配置</p> 
     * @return AuthConfig <p>审核服务鉴权局部更新配置</p>
     */
    public CustomGuardrailAuthConfigPatch getAuthConfig() {
        return this.AuthConfig;
    }

    /**
     * Set <p>审核服务鉴权局部更新配置</p>
     * @param AuthConfig <p>审核服务鉴权局部更新配置</p>
     */
    public void setAuthConfig(CustomGuardrailAuthConfigPatch AuthConfig) {
        this.AuthConfig = AuthConfig;
    }

    /**
     * Get <p>审核响应判定局部更新配置</p> 
     * @return DecisionConfig <p>审核响应判定局部更新配置</p>
     */
    public CustomGuardrailDecisionConfigPatch getDecisionConfig() {
        return this.DecisionConfig;
    }

    /**
     * Set <p>审核响应判定局部更新配置</p>
     * @param DecisionConfig <p>审核响应判定局部更新配置</p>
     */
    public void setDecisionConfig(CustomGuardrailDecisionConfigPatch DecisionConfig) {
        this.DecisionConfig = DecisionConfig;
    }

    /**
     * Get <p>处理行为局部更新配置</p> 
     * @return BehaviorConfig <p>处理行为局部更新配置</p>
     */
    public CustomGuardrailBehaviorConfigPatch getBehaviorConfig() {
        return this.BehaviorConfig;
    }

    /**
     * Set <p>处理行为局部更新配置</p>
     * @param BehaviorConfig <p>处理行为局部更新配置</p>
     */
    public void setBehaviorConfig(CustomGuardrailBehaviorConfigPatch BehaviorConfig) {
        this.BehaviorConfig = BehaviorConfig;
    }

    /**
     * Get <p>过滤与采样局部更新配置</p> 
     * @return FilterConfig <p>过滤与采样局部更新配置</p>
     */
    public CustomGuardrailFilterConfigPatch getFilterConfig() {
        return this.FilterConfig;
    }

    /**
     * Set <p>过滤与采样局部更新配置</p>
     * @param FilterConfig <p>过滤与采样局部更新配置</p>
     */
    public void setFilterConfig(CustomGuardrailFilterConfigPatch FilterConfig) {
        this.FilterConfig = FilterConfig;
    }

    /**
     * Get <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p> 
     * @return Scope <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p>
     */
    public CustomGuardrailScopeInput getScope() {
        return this.Scope;
    }

    /**
     * Set <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p>
     * @param Scope <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p>
     */
    public void setScope(CustomGuardrailScopeInput Scope) {
        this.Scope = Scope;
    }

    public ModifyAIGWCustomGuardrailPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIGWCustomGuardrailPolicyRequest(ModifyAIGWCustomGuardrailPolicyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new CustomGuardrailServiceConfigPatch(source.ServiceConfig);
        }
        if (source.AuthConfig != null) {
            this.AuthConfig = new CustomGuardrailAuthConfigPatch(source.AuthConfig);
        }
        if (source.DecisionConfig != null) {
            this.DecisionConfig = new CustomGuardrailDecisionConfigPatch(source.DecisionConfig);
        }
        if (source.BehaviorConfig != null) {
            this.BehaviorConfig = new CustomGuardrailBehaviorConfigPatch(source.BehaviorConfig);
        }
        if (source.FilterConfig != null) {
            this.FilterConfig = new CustomGuardrailFilterConfigPatch(source.FilterConfig);
        }
        if (source.Scope != null) {
            this.Scope = new CustomGuardrailScopeInput(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamObj(map, prefix + "AuthConfig.", this.AuthConfig);
        this.setParamObj(map, prefix + "DecisionConfig.", this.DecisionConfig);
        this.setParamObj(map, prefix + "BehaviorConfig.", this.BehaviorConfig);
        this.setParamObj(map, prefix + "FilterConfig.", this.FilterConfig);
        this.setParamObj(map, prefix + "Scope.", this.Scope);

    }
}

