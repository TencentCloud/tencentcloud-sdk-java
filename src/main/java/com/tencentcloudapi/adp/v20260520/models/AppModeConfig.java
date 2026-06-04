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

public class AppModeConfig extends AbstractModel {

    /**
    * 多智能体配置(Agent模式)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiAgentConfig")
    @Expose
    private MultiAgentConfig MultiAgentConfig;

    /**
    * 单工作流配置(单工作流模式)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SingleWorkflowConfig")
    @Expose
    private SingleWorkflowConfig SingleWorkflowConfig;

    /**
     * Get 多智能体配置(Agent模式)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiAgentConfig 多智能体配置(Agent模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiAgentConfig getMultiAgentConfig() {
        return this.MultiAgentConfig;
    }

    /**
     * Set 多智能体配置(Agent模式)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiAgentConfig 多智能体配置(Agent模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiAgentConfig(MultiAgentConfig MultiAgentConfig) {
        this.MultiAgentConfig = MultiAgentConfig;
    }

    /**
     * Get 单工作流配置(单工作流模式)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SingleWorkflowConfig 单工作流配置(单工作流模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SingleWorkflowConfig getSingleWorkflowConfig() {
        return this.SingleWorkflowConfig;
    }

    /**
     * Set 单工作流配置(单工作流模式)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SingleWorkflowConfig 单工作流配置(单工作流模式)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingleWorkflowConfig(SingleWorkflowConfig SingleWorkflowConfig) {
        this.SingleWorkflowConfig = SingleWorkflowConfig;
    }

    public AppModeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModeConfig(AppModeConfig source) {
        if (source.MultiAgentConfig != null) {
            this.MultiAgentConfig = new MultiAgentConfig(source.MultiAgentConfig);
        }
        if (source.SingleWorkflowConfig != null) {
            this.SingleWorkflowConfig = new SingleWorkflowConfig(source.SingleWorkflowConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MultiAgentConfig.", this.MultiAgentConfig);
        this.setParamObj(map, prefix + "SingleWorkflowConfig.", this.SingleWorkflowConfig);

    }
}

