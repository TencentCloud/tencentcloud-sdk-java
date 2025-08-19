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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeQaAgent extends AbstractModel {

    /**
    * 协同方式，1：自由转交，2：工作流编排，3：Plan-and-Execute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCollaboration")
    @Expose
    private Long AgentCollaboration;

    /**
    * 应用配置agent关联的工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workflow")
    @Expose
    private KnowledgeQaWorkflowInfo Workflow;

    /**
     * Get 协同方式，1：自由转交，2：工作流编排，3：Plan-and-Execute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCollaboration 协同方式，1：自由转交，2：工作流编排，3：Plan-and-Execute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgentCollaboration() {
        return this.AgentCollaboration;
    }

    /**
     * Set 协同方式，1：自由转交，2：工作流编排，3：Plan-and-Execute
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCollaboration 协同方式，1：自由转交，2：工作流编排，3：Plan-and-Execute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCollaboration(Long AgentCollaboration) {
        this.AgentCollaboration = AgentCollaboration;
    }

    /**
     * Get 应用配置agent关联的工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workflow 应用配置agent关联的工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaWorkflowInfo getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set 应用配置agent关联的工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workflow 应用配置agent关联的工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflow(KnowledgeQaWorkflowInfo Workflow) {
        this.Workflow = Workflow;
    }

    public KnowledgeQaAgent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaAgent(KnowledgeQaAgent source) {
        if (source.AgentCollaboration != null) {
            this.AgentCollaboration = new Long(source.AgentCollaboration);
        }
        if (source.Workflow != null) {
            this.Workflow = new KnowledgeQaWorkflowInfo(source.Workflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentCollaboration", this.AgentCollaboration);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);

    }
}

