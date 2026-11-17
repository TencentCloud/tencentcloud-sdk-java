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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSummary extends AbstractModel {

    /**
    * <p>AgentId</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent 身份画像</p>
    */
    @SerializedName("Profile")
    @Expose
    private AgentProfile Profile;

    /**
    * <p>高级设置;scope=0 时返回</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AgentAdvancedConfig AdvancedConfig;

    /**
    * <p>子 Agent 执行来源</p><p>枚举值：</p><ul><li>0： 应用内子 Agent</li><li>1： 引用已发布的应用</li></ul>
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * <p>引用应用状态，ProviderType=1 时有效</p><p>枚举值：</p><ul><li>0： 来源应用可用</li><li>1： 来源应用不可用</li><li>2： 无权限</li><li>3： 嵌套引用: 来源应用线上生效配置中已含应用类子 Agent</li></ul>
    */
    @SerializedName("ReferenceAppStatus")
    @Expose
    private Long ReferenceAppStatus;

    /**
     * Get <p>AgentId</p> 
     * @return AgentId <p>AgentId</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>AgentId</p>
     * @param AgentId <p>AgentId</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent 身份画像</p> 
     * @return Profile <p>Agent 身份画像</p>
     */
    public AgentProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Agent 身份画像</p>
     * @param Profile <p>Agent 身份画像</p>
     */
    public void setProfile(AgentProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>高级设置;scope=0 时返回</p> 
     * @return AdvancedConfig <p>高级设置;scope=0 时返回</p>
     */
    public AgentAdvancedConfig getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级设置;scope=0 时返回</p>
     * @param AdvancedConfig <p>高级设置;scope=0 时返回</p>
     */
    public void setAdvancedConfig(AgentAdvancedConfig AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>子 Agent 执行来源</p><p>枚举值：</p><ul><li>0： 应用内子 Agent</li><li>1： 引用已发布的应用</li></ul> 
     * @return ProviderType <p>子 Agent 执行来源</p><p>枚举值：</p><ul><li>0： 应用内子 Agent</li><li>1： 引用已发布的应用</li></ul>
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>子 Agent 执行来源</p><p>枚举值：</p><ul><li>0： 应用内子 Agent</li><li>1： 引用已发布的应用</li></ul>
     * @param ProviderType <p>子 Agent 执行来源</p><p>枚举值：</p><ul><li>0： 应用内子 Agent</li><li>1： 引用已发布的应用</li></ul>
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get <p>引用应用状态，ProviderType=1 时有效</p><p>枚举值：</p><ul><li>0： 来源应用可用</li><li>1： 来源应用不可用</li><li>2： 无权限</li><li>3： 嵌套引用: 来源应用线上生效配置中已含应用类子 Agent</li></ul> 
     * @return ReferenceAppStatus <p>引用应用状态，ProviderType=1 时有效</p><p>枚举值：</p><ul><li>0： 来源应用可用</li><li>1： 来源应用不可用</li><li>2： 无权限</li><li>3： 嵌套引用: 来源应用线上生效配置中已含应用类子 Agent</li></ul>
     */
    public Long getReferenceAppStatus() {
        return this.ReferenceAppStatus;
    }

    /**
     * Set <p>引用应用状态，ProviderType=1 时有效</p><p>枚举值：</p><ul><li>0： 来源应用可用</li><li>1： 来源应用不可用</li><li>2： 无权限</li><li>3： 嵌套引用: 来源应用线上生效配置中已含应用类子 Agent</li></ul>
     * @param ReferenceAppStatus <p>引用应用状态，ProviderType=1 时有效</p><p>枚举值：</p><ul><li>0： 来源应用可用</li><li>1： 来源应用不可用</li><li>2： 无权限</li><li>3： 嵌套引用: 来源应用线上生效配置中已含应用类子 Agent</li></ul>
     */
    public void setReferenceAppStatus(Long ReferenceAppStatus) {
        this.ReferenceAppStatus = ReferenceAppStatus;
    }

    public AgentSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSummary(AgentSummary source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Profile != null) {
            this.Profile = new AgentProfile(source.Profile);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AgentAdvancedConfig(source.AdvancedConfig);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
        if (source.ReferenceAppStatus != null) {
            this.ReferenceAppStatus = new Long(source.ReferenceAppStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "ReferenceAppStatus", this.ReferenceAppStatus);

    }
}

