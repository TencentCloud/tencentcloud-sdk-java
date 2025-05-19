/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ProcedureDebugging extends AbstractModel {

    /**
    * 检索query
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 系统prompt
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("System")
    @Expose
    private String System;

    /**
    * 多轮历史信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Histories")
    @Expose
    private HistorySummary [] Histories;

    /**
    * 检索知识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Knowledge")
    @Expose
    private KnowledgeSummary [] Knowledge;

    /**
    * 任务流程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFlow")
    @Expose
    private TaskFlowSummary TaskFlow;

    /**
    * 工作流调试信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlow")
    @Expose
    private WorkFlowSummary WorkFlow;

    /**
    * Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Agent")
    @Expose
    private AgentDebugInfo Agent;

    /**
    * 自定义参数
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
     * Get 检索query
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 检索query
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 检索query
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 检索query
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 系统prompt
注意：此字段可能返回 null，表示取不到有效值。 
     * @return System 系统prompt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSystem() {
        return this.System;
    }

    /**
     * Set 系统prompt
注意：此字段可能返回 null，表示取不到有效值。
     * @param System 系统prompt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystem(String System) {
        this.System = System;
    }

    /**
     * Get 多轮历史信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Histories 多轮历史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HistorySummary [] getHistories() {
        return this.Histories;
    }

    /**
     * Set 多轮历史信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Histories 多轮历史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistories(HistorySummary [] Histories) {
        this.Histories = Histories;
    }

    /**
     * Get 检索知识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Knowledge 检索知识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeSummary [] getKnowledge() {
        return this.Knowledge;
    }

    /**
     * Set 检索知识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Knowledge 检索知识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledge(KnowledgeSummary [] Knowledge) {
        this.Knowledge = Knowledge;
    }

    /**
     * Get 任务流程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFlow 任务流程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskFlowSummary getTaskFlow() {
        return this.TaskFlow;
    }

    /**
     * Set 任务流程
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFlow 任务流程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFlow(TaskFlowSummary TaskFlow) {
        this.TaskFlow = TaskFlow;
    }

    /**
     * Get 工作流调试信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlow 工作流调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkFlowSummary getWorkFlow() {
        return this.WorkFlow;
    }

    /**
     * Set 工作流调试信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlow 工作流调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlow(WorkFlowSummary WorkFlow) {
        this.WorkFlow = WorkFlow;
    }

    /**
     * Get Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Agent Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentDebugInfo getAgent() {
        return this.Agent;
    }

    /**
     * Set Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Agent Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgent(AgentDebugInfo Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 自定义参数 
     * @return CustomVariables 自定义参数
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set 自定义参数
     * @param CustomVariables 自定义参数
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    public ProcedureDebugging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureDebugging(ProcedureDebugging source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.System != null) {
            this.System = new String(source.System);
        }
        if (source.Histories != null) {
            this.Histories = new HistorySummary[source.Histories.length];
            for (int i = 0; i < source.Histories.length; i++) {
                this.Histories[i] = new HistorySummary(source.Histories[i]);
            }
        }
        if (source.Knowledge != null) {
            this.Knowledge = new KnowledgeSummary[source.Knowledge.length];
            for (int i = 0; i < source.Knowledge.length; i++) {
                this.Knowledge[i] = new KnowledgeSummary(source.Knowledge[i]);
            }
        }
        if (source.TaskFlow != null) {
            this.TaskFlow = new TaskFlowSummary(source.TaskFlow);
        }
        if (source.WorkFlow != null) {
            this.WorkFlow = new WorkFlowSummary(source.WorkFlow);
        }
        if (source.Agent != null) {
            this.Agent = new AgentDebugInfo(source.Agent);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new String[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new String(source.CustomVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "System", this.System);
        this.setParamArrayObj(map, prefix + "Histories.", this.Histories);
        this.setParamArrayObj(map, prefix + "Knowledge.", this.Knowledge);
        this.setParamObj(map, prefix + "TaskFlow.", this.TaskFlow);
        this.setParamObj(map, prefix + "WorkFlow.", this.WorkFlow);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "CustomVariables.", this.CustomVariables);

    }
}

