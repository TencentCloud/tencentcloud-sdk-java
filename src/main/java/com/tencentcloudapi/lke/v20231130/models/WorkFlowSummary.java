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

public class WorkFlowSummary extends AbstractModel {

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunNodes")
    @Expose
    private WorkflowRunNodeInfo [] RunNodes;

    /**
    * <p>选项卡</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>多气泡的输出结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Outputs")
    @Expose
    private String [] Outputs;

    /**
    * <p>工作流发布时间，unix时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowReleaseTime")
    @Expose
    private String WorkflowReleaseTime;

    /**
    * <p>中间消息</p>
    */
    @SerializedName("PendingMessages")
    @Expose
    private String [] PendingMessages;

    /**
    * <p>选项卡索引</p>
    */
    @SerializedName("OptionCardIndex")
    @Expose
    private OptionCardIndex OptionCardIndex;

    /**
    * <p>工作流多气泡输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contents")
    @Expose
    private Content [] Contents;

    /**
    * <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 多选</li></ul>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
     * Get <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunNodes <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowRunNodeInfo [] getRunNodes() {
        return this.RunNodes;
    }

    /**
     * Set <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunNodes <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunNodes(WorkflowRunNodeInfo [] RunNodes) {
        this.RunNodes = RunNodes;
    }

    /**
     * Get <p>选项卡</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCards <p>选项卡</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>选项卡</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCards <p>选项卡</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>多气泡的输出结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Outputs <p>多气泡的输出结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>多气泡的输出结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Outputs <p>多气泡的输出结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputs(String [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>工作流发布时间，unix时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowReleaseTime <p>工作流发布时间，unix时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowReleaseTime() {
        return this.WorkflowReleaseTime;
    }

    /**
     * Set <p>工作流发布时间，unix时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowReleaseTime <p>工作流发布时间，unix时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowReleaseTime(String WorkflowReleaseTime) {
        this.WorkflowReleaseTime = WorkflowReleaseTime;
    }

    /**
     * Get <p>中间消息</p> 
     * @return PendingMessages <p>中间消息</p>
     */
    public String [] getPendingMessages() {
        return this.PendingMessages;
    }

    /**
     * Set <p>中间消息</p>
     * @param PendingMessages <p>中间消息</p>
     */
    public void setPendingMessages(String [] PendingMessages) {
        this.PendingMessages = PendingMessages;
    }

    /**
     * Get <p>选项卡索引</p> 
     * @return OptionCardIndex <p>选项卡索引</p>
     */
    public OptionCardIndex getOptionCardIndex() {
        return this.OptionCardIndex;
    }

    /**
     * Set <p>选项卡索引</p>
     * @param OptionCardIndex <p>选项卡索引</p>
     */
    public void setOptionCardIndex(OptionCardIndex OptionCardIndex) {
        this.OptionCardIndex = OptionCardIndex;
    }

    /**
     * Get <p>工作流多气泡输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contents <p>工作流多气泡输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Content [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>工作流多气泡输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contents <p>工作流多气泡输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContents(Content [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 多选</li></ul> 
     * @return OptionMode <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 多选</li></ul>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 多选</li></ul>
     * @param OptionMode <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 多选</li></ul>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
    }

    public WorkFlowSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkFlowSummary(WorkFlowSummary source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunNodes != null) {
            this.RunNodes = new WorkflowRunNodeInfo[source.RunNodes.length];
            for (int i = 0; i < source.RunNodes.length; i++) {
                this.RunNodes[i] = new WorkflowRunNodeInfo(source.RunNodes[i]);
            }
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new String[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new String(source.Outputs[i]);
            }
        }
        if (source.WorkflowReleaseTime != null) {
            this.WorkflowReleaseTime = new String(source.WorkflowReleaseTime);
        }
        if (source.PendingMessages != null) {
            this.PendingMessages = new String[source.PendingMessages.length];
            for (int i = 0; i < source.PendingMessages.length; i++) {
                this.PendingMessages[i] = new String(source.PendingMessages[i]);
            }
        }
        if (source.OptionCardIndex != null) {
            this.OptionCardIndex = new OptionCardIndex(source.OptionCardIndex);
        }
        if (source.Contents != null) {
            this.Contents = new Content[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new Content(source.Contents[i]);
            }
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamArrayObj(map, prefix + "RunNodes.", this.RunNodes);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamArraySimple(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "WorkflowReleaseTime", this.WorkflowReleaseTime);
        this.setParamArraySimple(map, prefix + "PendingMessages.", this.PendingMessages);
        this.setParamObj(map, prefix + "OptionCardIndex.", this.OptionCardIndex);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);

    }
}

