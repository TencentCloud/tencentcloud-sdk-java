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

public class CustomGuardrailPolicy extends AbstractModel {

    /**
    * <p>策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略期望启用状态；实际生效还需检查 EffectiveEnabled 和 SyncStatus。</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>当前控制面计算值：Enabled=true 且 SyncStatus=synced 时为 true。不代表一次真实业务请求已通过审核，也不替代 DP 同步/链路验证。</p>
    */
    @SerializedName("EffectiveEnabled")
    @Expose
    private Boolean EffectiveEnabled;

    /**
    * <p>审核服务配置</p>
    */
    @SerializedName("ServiceConfig")
    @Expose
    private CustomGuardrailServiceConfig ServiceConfig;

    /**
    * <p>审核引擎鉴权的脱敏视图，仅返回鉴权类型、Header 名和密钥存在状态，不返回 ApiKey。</p>
    */
    @SerializedName("AuthConfig")
    @Expose
    private CustomGuardrailAuthConfig AuthConfig;

    /**
    * <p>审核响应判定配置</p>
    */
    @SerializedName("DecisionConfig")
    @Expose
    private CustomGuardrailDecisionConfig DecisionConfig;

    /**
    * <p>处理行为配置</p>
    */
    @SerializedName("BehaviorConfig")
    @Expose
    private CustomGuardrailBehaviorConfig BehaviorConfig;

    /**
    * <p>过滤与采样配置</p>
    */
    @SerializedName("FilterConfig")
    @Expose
    private CustomGuardrailFilterConfig FilterConfig;

    /**
    * <p>生效范围</p>
    */
    @SerializedName("Scope")
    @Expose
    private CustomGuardrailScope Scope;

    /**
    * <p>业务资源到 Kong Route 的绑定及插件投影信息，一个业务资源可能对应多个 Route。</p>
    */
    @SerializedName("Bindings")
    @Expose
    private CustomGuardrailPolicyBinding [] Bindings;

    /**
    * <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>配置同步错误摘要，无错误时可能省略。</p>
    */
    @SerializedName("SyncError")
    @Expose
    private String SyncError;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
    */
    @SerializedName("ModificationTime")
    @Expose
    private String ModificationTime;

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
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略期望启用状态；实际生效还需检查 EffectiveEnabled 和 SyncStatus。</p> 
     * @return Enabled <p>策略期望启用状态；实际生效还需检查 EffectiveEnabled 和 SyncStatus。</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>策略期望启用状态；实际生效还需检查 EffectiveEnabled 和 SyncStatus。</p>
     * @param Enabled <p>策略期望启用状态；实际生效还需检查 EffectiveEnabled 和 SyncStatus。</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>当前控制面计算值：Enabled=true 且 SyncStatus=synced 时为 true。不代表一次真实业务请求已通过审核，也不替代 DP 同步/链路验证。</p> 
     * @return EffectiveEnabled <p>当前控制面计算值：Enabled=true 且 SyncStatus=synced 时为 true。不代表一次真实业务请求已通过审核，也不替代 DP 同步/链路验证。</p>
     */
    public Boolean getEffectiveEnabled() {
        return this.EffectiveEnabled;
    }

    /**
     * Set <p>当前控制面计算值：Enabled=true 且 SyncStatus=synced 时为 true。不代表一次真实业务请求已通过审核，也不替代 DP 同步/链路验证。</p>
     * @param EffectiveEnabled <p>当前控制面计算值：Enabled=true 且 SyncStatus=synced 时为 true。不代表一次真实业务请求已通过审核，也不替代 DP 同步/链路验证。</p>
     */
    public void setEffectiveEnabled(Boolean EffectiveEnabled) {
        this.EffectiveEnabled = EffectiveEnabled;
    }

    /**
     * Get <p>审核服务配置</p> 
     * @return ServiceConfig <p>审核服务配置</p>
     */
    public CustomGuardrailServiceConfig getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set <p>审核服务配置</p>
     * @param ServiceConfig <p>审核服务配置</p>
     */
    public void setServiceConfig(CustomGuardrailServiceConfig ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get <p>审核引擎鉴权的脱敏视图，仅返回鉴权类型、Header 名和密钥存在状态，不返回 ApiKey。</p> 
     * @return AuthConfig <p>审核引擎鉴权的脱敏视图，仅返回鉴权类型、Header 名和密钥存在状态，不返回 ApiKey。</p>
     */
    public CustomGuardrailAuthConfig getAuthConfig() {
        return this.AuthConfig;
    }

    /**
     * Set <p>审核引擎鉴权的脱敏视图，仅返回鉴权类型、Header 名和密钥存在状态，不返回 ApiKey。</p>
     * @param AuthConfig <p>审核引擎鉴权的脱敏视图，仅返回鉴权类型、Header 名和密钥存在状态，不返回 ApiKey。</p>
     */
    public void setAuthConfig(CustomGuardrailAuthConfig AuthConfig) {
        this.AuthConfig = AuthConfig;
    }

    /**
     * Get <p>审核响应判定配置</p> 
     * @return DecisionConfig <p>审核响应判定配置</p>
     */
    public CustomGuardrailDecisionConfig getDecisionConfig() {
        return this.DecisionConfig;
    }

    /**
     * Set <p>审核响应判定配置</p>
     * @param DecisionConfig <p>审核响应判定配置</p>
     */
    public void setDecisionConfig(CustomGuardrailDecisionConfig DecisionConfig) {
        this.DecisionConfig = DecisionConfig;
    }

    /**
     * Get <p>处理行为配置</p> 
     * @return BehaviorConfig <p>处理行为配置</p>
     */
    public CustomGuardrailBehaviorConfig getBehaviorConfig() {
        return this.BehaviorConfig;
    }

    /**
     * Set <p>处理行为配置</p>
     * @param BehaviorConfig <p>处理行为配置</p>
     */
    public void setBehaviorConfig(CustomGuardrailBehaviorConfig BehaviorConfig) {
        this.BehaviorConfig = BehaviorConfig;
    }

    /**
     * Get <p>过滤与采样配置</p> 
     * @return FilterConfig <p>过滤与采样配置</p>
     */
    public CustomGuardrailFilterConfig getFilterConfig() {
        return this.FilterConfig;
    }

    /**
     * Set <p>过滤与采样配置</p>
     * @param FilterConfig <p>过滤与采样配置</p>
     */
    public void setFilterConfig(CustomGuardrailFilterConfig FilterConfig) {
        this.FilterConfig = FilterConfig;
    }

    /**
     * Get <p>生效范围</p> 
     * @return Scope <p>生效范围</p>
     */
    public CustomGuardrailScope getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效范围</p>
     * @param Scope <p>生效范围</p>
     */
    public void setScope(CustomGuardrailScope Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>业务资源到 Kong Route 的绑定及插件投影信息，一个业务资源可能对应多个 Route。</p> 
     * @return Bindings <p>业务资源到 Kong Route 的绑定及插件投影信息，一个业务资源可能对应多个 Route。</p>
     */
    public CustomGuardrailPolicyBinding [] getBindings() {
        return this.Bindings;
    }

    /**
     * Set <p>业务资源到 Kong Route 的绑定及插件投影信息，一个业务资源可能对应多个 Route。</p>
     * @param Bindings <p>业务资源到 Kong Route 的绑定及插件投影信息，一个业务资源可能对应多个 Route。</p>
     */
    public void setBindings(CustomGuardrailPolicyBinding [] Bindings) {
        this.Bindings = Bindings;
    }

    /**
     * Get <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p> 
     * @return SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     * @param SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>配置同步错误摘要，无错误时可能省略。</p> 
     * @return SyncError <p>配置同步错误摘要，无错误时可能省略。</p>
     */
    public String getSyncError() {
        return this.SyncError;
    }

    /**
     * Set <p>配置同步错误摘要，无错误时可能省略。</p>
     * @param SyncError <p>配置同步错误摘要，无错误时可能省略。</p>
     */
    public void setSyncError(String SyncError) {
        this.SyncError = SyncError;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间</p> 
     * @return ModificationTime <p>最后修改时间</p>
     */
    public String getModificationTime() {
        return this.ModificationTime;
    }

    /**
     * Set <p>最后修改时间</p>
     * @param ModificationTime <p>最后修改时间</p>
     */
    public void setModificationTime(String ModificationTime) {
        this.ModificationTime = ModificationTime;
    }

    public CustomGuardrailPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailPolicy(CustomGuardrailPolicy source) {
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
        if (source.EffectiveEnabled != null) {
            this.EffectiveEnabled = new Boolean(source.EffectiveEnabled);
        }
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new CustomGuardrailServiceConfig(source.ServiceConfig);
        }
        if (source.AuthConfig != null) {
            this.AuthConfig = new CustomGuardrailAuthConfig(source.AuthConfig);
        }
        if (source.DecisionConfig != null) {
            this.DecisionConfig = new CustomGuardrailDecisionConfig(source.DecisionConfig);
        }
        if (source.BehaviorConfig != null) {
            this.BehaviorConfig = new CustomGuardrailBehaviorConfig(source.BehaviorConfig);
        }
        if (source.FilterConfig != null) {
            this.FilterConfig = new CustomGuardrailFilterConfig(source.FilterConfig);
        }
        if (source.Scope != null) {
            this.Scope = new CustomGuardrailScope(source.Scope);
        }
        if (source.Bindings != null) {
            this.Bindings = new CustomGuardrailPolicyBinding[source.Bindings.length];
            for (int i = 0; i < source.Bindings.length; i++) {
                this.Bindings[i] = new CustomGuardrailPolicyBinding(source.Bindings[i]);
            }
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncError != null) {
            this.SyncError = new String(source.SyncError);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModificationTime != null) {
            this.ModificationTime = new String(source.ModificationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "EffectiveEnabled", this.EffectiveEnabled);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamObj(map, prefix + "AuthConfig.", this.AuthConfig);
        this.setParamObj(map, prefix + "DecisionConfig.", this.DecisionConfig);
        this.setParamObj(map, prefix + "BehaviorConfig.", this.BehaviorConfig);
        this.setParamObj(map, prefix + "FilterConfig.", this.FilterConfig);
        this.setParamObj(map, prefix + "Scope.", this.Scope);
        this.setParamArrayObj(map, prefix + "Bindings.", this.Bindings);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncError", this.SyncError);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModificationTime", this.ModificationTime);

    }
}

