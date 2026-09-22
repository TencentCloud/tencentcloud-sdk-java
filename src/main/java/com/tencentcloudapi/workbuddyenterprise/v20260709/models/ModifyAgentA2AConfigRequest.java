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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentA2AConfigRequest extends AbstractModel {

    /**
    * <p>Agent 业务 ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent 级唯一 A2A 开关</p>
    */
    @SerializedName("A2AEnabled")
    @Expose
    private Boolean A2AEnabled;

    /**
    * <p>A2A 技能集合（原 A2ASkills）</p>
    */
    @SerializedName("A2ASkillSet")
    @Expose
    private A2ASkillInput [] A2ASkillSet;

    /**
     * Get <p>Agent 业务 ID</p> 
     * @return AgentId <p>Agent 业务 ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent 业务 ID</p>
     * @param AgentId <p>Agent 业务 ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent 级唯一 A2A 开关</p> 
     * @return A2AEnabled <p>Agent 级唯一 A2A 开关</p>
     */
    public Boolean getA2AEnabled() {
        return this.A2AEnabled;
    }

    /**
     * Set <p>Agent 级唯一 A2A 开关</p>
     * @param A2AEnabled <p>Agent 级唯一 A2A 开关</p>
     */
    public void setA2AEnabled(Boolean A2AEnabled) {
        this.A2AEnabled = A2AEnabled;
    }

    /**
     * Get <p>A2A 技能集合（原 A2ASkills）</p> 
     * @return A2ASkillSet <p>A2A 技能集合（原 A2ASkills）</p>
     */
    public A2ASkillInput [] getA2ASkillSet() {
        return this.A2ASkillSet;
    }

    /**
     * Set <p>A2A 技能集合（原 A2ASkills）</p>
     * @param A2ASkillSet <p>A2A 技能集合（原 A2ASkills）</p>
     */
    public void setA2ASkillSet(A2ASkillInput [] A2ASkillSet) {
        this.A2ASkillSet = A2ASkillSet;
    }

    public ModifyAgentA2AConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentA2AConfigRequest(ModifyAgentA2AConfigRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.A2AEnabled != null) {
            this.A2AEnabled = new Boolean(source.A2AEnabled);
        }
        if (source.A2ASkillSet != null) {
            this.A2ASkillSet = new A2ASkillInput[source.A2ASkillSet.length];
            for (int i = 0; i < source.A2ASkillSet.length; i++) {
                this.A2ASkillSet[i] = new A2ASkillInput(source.A2ASkillSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "A2AEnabled", this.A2AEnabled);
        this.setParamArrayObj(map, prefix + "A2ASkillSet.", this.A2ASkillSet);

    }
}

