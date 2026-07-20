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

public class ClawAgentConfig extends AbstractModel {

    /**
    * 调用方自定义配置(控制C端用户在对话时可动态传入哪些自定义配置)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomConfig")
    @Expose
    private ClawAgentCustomConfig CustomConfig;

    /**
    * Agent团队协作配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentTeamConfig")
    @Expose
    private ClawAgentAgentTeamConfig AgentTeamConfig;

    /**
    * 长期记忆配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongMemoryConfig")
    @Expose
    private ClawAgentLongMemoryConfig LongMemoryConfig;

    /**
     * Get 调用方自定义配置(控制C端用户在对话时可动态传入哪些自定义配置)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomConfig 调用方自定义配置(控制C端用户在对话时可动态传入哪些自定义配置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentCustomConfig getCustomConfig() {
        return this.CustomConfig;
    }

    /**
     * Set 调用方自定义配置(控制C端用户在对话时可动态传入哪些自定义配置)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomConfig 调用方自定义配置(控制C端用户在对话时可动态传入哪些自定义配置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomConfig(ClawAgentCustomConfig CustomConfig) {
        this.CustomConfig = CustomConfig;
    }

    /**
     * Get Agent团队协作配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentTeamConfig Agent团队协作配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentAgentTeamConfig getAgentTeamConfig() {
        return this.AgentTeamConfig;
    }

    /**
     * Set Agent团队协作配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentTeamConfig Agent团队协作配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentTeamConfig(ClawAgentAgentTeamConfig AgentTeamConfig) {
        this.AgentTeamConfig = AgentTeamConfig;
    }

    /**
     * Get 长期记忆配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongMemoryConfig 长期记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentLongMemoryConfig getLongMemoryConfig() {
        return this.LongMemoryConfig;
    }

    /**
     * Set 长期记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongMemoryConfig 长期记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongMemoryConfig(ClawAgentLongMemoryConfig LongMemoryConfig) {
        this.LongMemoryConfig = LongMemoryConfig;
    }

    public ClawAgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawAgentConfig(ClawAgentConfig source) {
        if (source.CustomConfig != null) {
            this.CustomConfig = new ClawAgentCustomConfig(source.CustomConfig);
        }
        if (source.AgentTeamConfig != null) {
            this.AgentTeamConfig = new ClawAgentAgentTeamConfig(source.AgentTeamConfig);
        }
        if (source.LongMemoryConfig != null) {
            this.LongMemoryConfig = new ClawAgentLongMemoryConfig(source.LongMemoryConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CustomConfig.", this.CustomConfig);
        this.setParamObj(map, prefix + "AgentTeamConfig.", this.AgentTeamConfig);
        this.setParamObj(map, prefix + "LongMemoryConfig.", this.LongMemoryConfig);

    }
}

