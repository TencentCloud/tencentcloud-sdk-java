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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);

    }
}

