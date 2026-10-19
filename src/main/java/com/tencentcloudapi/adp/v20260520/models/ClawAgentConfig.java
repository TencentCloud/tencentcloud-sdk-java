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
    * <p>Agent团队协作配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentTeamConfig")
    @Expose
    private ClawAgentAgentTeamConfig AgentTeamConfig;

    /**
    * <p>长期记忆配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongMemoryConfig")
    @Expose
    private ClawAgentLongMemoryConfig LongMemoryConfig;

    /**
    * <p>渠道上下文超时清空配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelContextTimeoutConfig")
    @Expose
    private ClawAgentChannelContextTimeoutConfig ChannelContextTimeoutConfig;

    /**
     * Get <p>Agent团队协作配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentTeamConfig <p>Agent团队协作配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentAgentTeamConfig getAgentTeamConfig() {
        return this.AgentTeamConfig;
    }

    /**
     * Set <p>Agent团队协作配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentTeamConfig <p>Agent团队协作配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentTeamConfig(ClawAgentAgentTeamConfig AgentTeamConfig) {
        this.AgentTeamConfig = AgentTeamConfig;
    }

    /**
     * Get <p>长期记忆配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongMemoryConfig <p>长期记忆配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentLongMemoryConfig getLongMemoryConfig() {
        return this.LongMemoryConfig;
    }

    /**
     * Set <p>长期记忆配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongMemoryConfig <p>长期记忆配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongMemoryConfig(ClawAgentLongMemoryConfig LongMemoryConfig) {
        this.LongMemoryConfig = LongMemoryConfig;
    }

    /**
     * Get <p>渠道上下文超时清空配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelContextTimeoutConfig <p>渠道上下文超时清空配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClawAgentChannelContextTimeoutConfig getChannelContextTimeoutConfig() {
        return this.ChannelContextTimeoutConfig;
    }

    /**
     * Set <p>渠道上下文超时清空配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelContextTimeoutConfig <p>渠道上下文超时清空配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelContextTimeoutConfig(ClawAgentChannelContextTimeoutConfig ChannelContextTimeoutConfig) {
        this.ChannelContextTimeoutConfig = ChannelContextTimeoutConfig;
    }

    public ClawAgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawAgentConfig(ClawAgentConfig source) {
        if (source.AgentTeamConfig != null) {
            this.AgentTeamConfig = new ClawAgentAgentTeamConfig(source.AgentTeamConfig);
        }
        if (source.LongMemoryConfig != null) {
            this.LongMemoryConfig = new ClawAgentLongMemoryConfig(source.LongMemoryConfig);
        }
        if (source.ChannelContextTimeoutConfig != null) {
            this.ChannelContextTimeoutConfig = new ClawAgentChannelContextTimeoutConfig(source.ChannelContextTimeoutConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AgentTeamConfig.", this.AgentTeamConfig);
        this.setParamObj(map, prefix + "LongMemoryConfig.", this.LongMemoryConfig);
        this.setParamObj(map, prefix + "ChannelContextTimeoutConfig.", this.ChannelContextTimeoutConfig);

    }
}

