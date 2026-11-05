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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIGWCustomGuardrailPolicyRequest extends AbstractModel {

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>策略名称，同一网关内唯一，长度 1～64</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>审核服务配置</p>
    */
    @SerializedName("ServiceConfig")
    @Expose
    private CustomGuardrailServiceConfigInput ServiceConfig;

    /**
    * <p>审核响应判定配置</p>
    */
    @SerializedName("DecisionConfig")
    @Expose
    private CustomGuardrailDecisionConfigInput DecisionConfig;

    /**
    * <p>资源绑定范围，global 或 resource。修改时传入的是新的完整范围，不是增量追加。</p>
    */
    @SerializedName("Scope")
    @Expose
    private CustomGuardrailScopeInput Scope;

    /**
    * <p>必填，必须显式选择鉴权类型；无鉴权填写 {"AuthType":"none"}。</p>
    */
    @SerializedName("AuthConfig")
    @Expose
    private CustomGuardrailAuthConfigInput AuthConfig;

    /**
    * <p>必填，Direction、HandleAction、TimeoutMs、FailureMode 四项均须显式填写。</p>
    */
    @SerializedName("BehaviorConfig")
    @Expose
    private CustomGuardrailBehaviorConfigInput BehaviorConfig;

    /**
    * <p>策略描述，最长 200</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否启用策略，默认 true</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>过滤与采样配置</p>
    */
    @SerializedName("FilterConfig")
    @Expose
    private CustomGuardrailFilterConfigInput FilterConfig;

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
     * Get <p>策略名称，同一网关内唯一，长度 1～64</p> 
     * @return Name <p>策略名称，同一网关内唯一，长度 1～64</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称，同一网关内唯一，长度 1～64</p>
     * @param Name <p>策略名称，同一网关内唯一，长度 1～64</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>审核服务配置</p> 
     * @return ServiceConfig <p>审核服务配置</p>
     */
    public CustomGuardrailServiceConfigInput getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set <p>审核服务配置</p>
     * @param ServiceConfig <p>审核服务配置</p>
     */
    public void setServiceConfig(CustomGuardrailServiceConfigInput ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get <p>审核响应判定配置</p> 
     * @return DecisionConfig <p>审核响应判定配置</p>
     */
    public CustomGuardrailDecisionConfigInput getDecisionConfig() {
        return this.DecisionConfig;
    }

    /**
     * Set <p>审核响应判定配置</p>
     * @param DecisionConfig <p>审核响应判定配置</p>
     */
    public void setDecisionConfig(CustomGuardrailDecisionConfigInput DecisionConfig) {
        this.DecisionConfig = DecisionConfig;
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

    /**
     * Get <p>必填，必须显式选择鉴权类型；无鉴权填写 {"AuthType":"none"}。</p> 
     * @return AuthConfig <p>必填，必须显式选择鉴权类型；无鉴权填写 {"AuthType":"none"}。</p>
     */
    public CustomGuardrailAuthConfigInput getAuthConfig() {
        return this.AuthConfig;
    }

    /**
     * Set <p>必填，必须显式选择鉴权类型；无鉴权填写 {"AuthType":"none"}。</p>
     * @param AuthConfig <p>必填，必须显式选择鉴权类型；无鉴权填写 {"AuthType":"none"}。</p>
     */
    public void setAuthConfig(CustomGuardrailAuthConfigInput AuthConfig) {
        this.AuthConfig = AuthConfig;
    }

    /**
     * Get <p>必填，Direction、HandleAction、TimeoutMs、FailureMode 四项均须显式填写。</p> 
     * @return BehaviorConfig <p>必填，Direction、HandleAction、TimeoutMs、FailureMode 四项均须显式填写。</p>
     */
    public CustomGuardrailBehaviorConfigInput getBehaviorConfig() {
        return this.BehaviorConfig;
    }

    /**
     * Set <p>必填，Direction、HandleAction、TimeoutMs、FailureMode 四项均须显式填写。</p>
     * @param BehaviorConfig <p>必填，Direction、HandleAction、TimeoutMs、FailureMode 四项均须显式填写。</p>
     */
    public void setBehaviorConfig(CustomGuardrailBehaviorConfigInput BehaviorConfig) {
        this.BehaviorConfig = BehaviorConfig;
    }

    /**
     * Get <p>策略描述，最长 200</p> 
     * @return Description <p>策略描述，最长 200</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述，最长 200</p>
     * @param Description <p>策略描述，最长 200</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否启用策略，默认 true</p> 
     * @return Enabled <p>是否启用策略，默认 true</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用策略，默认 true</p>
     * @param Enabled <p>是否启用策略，默认 true</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>过滤与采样配置</p> 
     * @return FilterConfig <p>过滤与采样配置</p>
     */
    public CustomGuardrailFilterConfigInput getFilterConfig() {
        return this.FilterConfig;
    }

    /**
     * Set <p>过滤与采样配置</p>
     * @param FilterConfig <p>过滤与采样配置</p>
     */
    public void setFilterConfig(CustomGuardrailFilterConfigInput FilterConfig) {
        this.FilterConfig = FilterConfig;
    }

    public CreateAIGWCustomGuardrailPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIGWCustomGuardrailPolicyRequest(CreateAIGWCustomGuardrailPolicyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new CustomGuardrailServiceConfigInput(source.ServiceConfig);
        }
        if (source.DecisionConfig != null) {
            this.DecisionConfig = new CustomGuardrailDecisionConfigInput(source.DecisionConfig);
        }
        if (source.Scope != null) {
            this.Scope = new CustomGuardrailScopeInput(source.Scope);
        }
        if (source.AuthConfig != null) {
            this.AuthConfig = new CustomGuardrailAuthConfigInput(source.AuthConfig);
        }
        if (source.BehaviorConfig != null) {
            this.BehaviorConfig = new CustomGuardrailBehaviorConfigInput(source.BehaviorConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.FilterConfig != null) {
            this.FilterConfig = new CustomGuardrailFilterConfigInput(source.FilterConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamObj(map, prefix + "DecisionConfig.", this.DecisionConfig);
        this.setParamObj(map, prefix + "Scope.", this.Scope);
        this.setParamObj(map, prefix + "AuthConfig.", this.AuthConfig);
        this.setParamObj(map, prefix + "BehaviorConfig.", this.BehaviorConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "FilterConfig.", this.FilterConfig);

    }
}

