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

public class WorkflowRunNodeInfo extends AbstractModel {

    /**
    * 节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 输入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOutput")
    @Expose
    private String TaskOutput;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 花费时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMilliSeconds")
    @Expose
    private Long CostMilliSeconds;

    /**
    * 大模型输出信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticInfos")
    @Expose
    private StatisticInfo [] StatisticInfos;

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 输入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input 输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input 输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOutput 任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskOutput() {
        return this.TaskOutput;
    }

    /**
     * Set 任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOutput 任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOutput(String TaskOutput) {
        this.TaskOutput = TaskOutput;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get 花费时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMilliSeconds 花费时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMilliSeconds() {
        return this.CostMilliSeconds;
    }

    /**
     * Set 花费时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMilliSeconds 花费时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMilliSeconds(Long CostMilliSeconds) {
        this.CostMilliSeconds = CostMilliSeconds;
    }

    /**
     * Get 大模型输出信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticInfos 大模型输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatisticInfo [] getStatisticInfos() {
        return this.StatisticInfos;
    }

    /**
     * Set 大模型输出信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticInfos 大模型输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticInfos(StatisticInfo [] StatisticInfos) {
        this.StatisticInfos = StatisticInfos;
    }

    public WorkflowRunNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunNodeInfo(WorkflowRunNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.TaskOutput != null) {
            this.TaskOutput = new String(source.TaskOutput);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.CostMilliSeconds != null) {
            this.CostMilliSeconds = new Long(source.CostMilliSeconds);
        }
        if (source.StatisticInfos != null) {
            this.StatisticInfos = new StatisticInfo[source.StatisticInfos.length];
            for (int i = 0; i < source.StatisticInfos.length; i++) {
                this.StatisticInfos[i] = new StatisticInfo(source.StatisticInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "TaskOutput", this.TaskOutput);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "CostMilliSeconds", this.CostMilliSeconds);
        this.setParamArrayObj(map, prefix + "StatisticInfos.", this.StatisticInfos);

    }
}

