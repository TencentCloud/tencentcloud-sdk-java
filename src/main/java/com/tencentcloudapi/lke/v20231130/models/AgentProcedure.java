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

public class AgentProcedure extends AbstractModel {

    /**
    * 索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Debugging")
    @Expose
    private AgentProcedureDebugging Debugging;

    /**
    * 是否切换Agent，取值为"main"或者"workflow",不切换为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * 工作流节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 用于展示思考放在哪个回复气泡中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyIndex")
    @Expose
    private Long ReplyIndex;

    /**
    * 主agent
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAgentName")
    @Expose
    private String SourceAgentName;

    /**
    * 挂号agent
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAgentName")
    @Expose
    private String TargetAgentName;

    /**
    * Agent的图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentIcon")
    @Expose
    private String AgentIcon;

    /**
     * Get 索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 执行过程英语名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 中文名, 用于展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态常量: 使用中: processing, 成功: success, 失败: failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icon 图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icon 图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Debugging Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentProcedureDebugging getDebugging() {
        return this.Debugging;
    }

    /**
     * Set Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Debugging Agent调试信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDebugging(AgentProcedureDebugging Debugging) {
        this.Debugging = Debugging;
    }

    /**
     * Get 是否切换Agent，取值为"main"或者"workflow",不切换为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 是否切换Agent，取值为"main"或者"workflow",不切换为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否切换Agent，取值为"main"或者"workflow",不切换为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 是否切换Agent，取值为"main"或者"workflow",不切换为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elapsed 当前请求执行时间, 单位 ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get 工作流节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 工作流节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 工作流节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 工作流节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 用于展示思考放在哪个回复气泡中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyIndex 用于展示思考放在哪个回复气泡中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyIndex() {
        return this.ReplyIndex;
    }

    /**
     * Set 用于展示思考放在哪个回复气泡中
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyIndex 用于展示思考放在哪个回复气泡中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyIndex(Long ReplyIndex) {
        this.ReplyIndex = ReplyIndex;
    }

    /**
     * Get 主agent
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAgentName 主agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceAgentName() {
        return this.SourceAgentName;
    }

    /**
     * Set 主agent
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAgentName 主agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAgentName(String SourceAgentName) {
        this.SourceAgentName = SourceAgentName;
    }

    /**
     * Get 挂号agent
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAgentName 挂号agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetAgentName() {
        return this.TargetAgentName;
    }

    /**
     * Set 挂号agent
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAgentName 挂号agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAgentName(String TargetAgentName) {
        this.TargetAgentName = TargetAgentName;
    }

    /**
     * Get Agent的图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentIcon Agent的图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentIcon() {
        return this.AgentIcon;
    }

    /**
     * Set Agent的图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentIcon Agent的图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentIcon(String AgentIcon) {
        this.AgentIcon = AgentIcon;
    }

    public AgentProcedure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProcedure(AgentProcedure source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Debugging != null) {
            this.Debugging = new AgentProcedureDebugging(source.Debugging);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ReplyIndex != null) {
            this.ReplyIndex = new Long(source.ReplyIndex);
        }
        if (source.SourceAgentName != null) {
            this.SourceAgentName = new String(source.SourceAgentName);
        }
        if (source.TargetAgentName != null) {
            this.TargetAgentName = new String(source.TargetAgentName);
        }
        if (source.AgentIcon != null) {
            this.AgentIcon = new String(source.AgentIcon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamObj(map, prefix + "Debugging.", this.Debugging);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ReplyIndex", this.ReplyIndex);
        this.setParamSimple(map, prefix + "SourceAgentName", this.SourceAgentName);
        this.setParamSimple(map, prefix + "TargetAgentName", this.TargetAgentName);
        this.setParamSimple(map, prefix + "AgentIcon", this.AgentIcon);

    }
}

