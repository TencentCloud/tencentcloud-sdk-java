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

public class NodeRunBase extends AbstractModel {

    /**
    * <p>节点运行的ID</p>
    */
    @SerializedName("NodeRunId")
    @Expose
    private String NodeRunId;

    /**
    * <p>节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>工作流运行实例的ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点类型。<br>1： 开始节点<br>2：参数提取节点<br>3：大模型节点<br>4：知识问答节点<br>5：知识检索节点<br>6：标签提取节点<br>7：代码执行节点<br>8：工具节点<br>9：逻辑判断节点<br>10：回复节点<br>11：选项卡节点<br>12：循环节点<br>13：意图识别节点<br>14：工作流节点<br>15：插件节点<br>16：结束节点<br>17: 变量聚合节点数据<br>18: 批处理节点<br>19: 消息队列节点</p>
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * <p>运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>错误码</p>
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * <p>消耗时间（毫秒）</p>
    */
    @SerializedName("CostMilliseconds")
    @Expose
    private Long CostMilliseconds;

    /**
    * <p>消耗的token总数</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>分支下标列表</p><p>单位：无</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BranchIndexList")
    @Expose
    private Long [] BranchIndexList;

    /**
     * Get <p>节点运行的ID</p> 
     * @return NodeRunId <p>节点运行的ID</p>
     */
    public String getNodeRunId() {
        return this.NodeRunId;
    }

    /**
     * Set <p>节点运行的ID</p>
     * @param NodeRunId <p>节点运行的ID</p>
     */
    public void setNodeRunId(String NodeRunId) {
        this.NodeRunId = NodeRunId;
    }

    /**
     * Get <p>节点ID</p> 
     * @return NodeId <p>节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
     * @param NodeId <p>节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>工作流运行实例的ID</p> 
     * @return WorkflowRunId <p>工作流运行实例的ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行实例的ID</p>
     * @param WorkflowRunId <p>工作流运行实例的ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>节点名称</p> 
     * @return NodeName <p>节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
     * @param NodeName <p>节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点类型。<br>1： 开始节点<br>2：参数提取节点<br>3：大模型节点<br>4：知识问答节点<br>5：知识检索节点<br>6：标签提取节点<br>7：代码执行节点<br>8：工具节点<br>9：逻辑判断节点<br>10：回复节点<br>11：选项卡节点<br>12：循环节点<br>13：意图识别节点<br>14：工作流节点<br>15：插件节点<br>16：结束节点<br>17: 变量聚合节点数据<br>18: 批处理节点<br>19: 消息队列节点</p> 
     * @return NodeType <p>节点类型。<br>1： 开始节点<br>2：参数提取节点<br>3：大模型节点<br>4：知识问答节点<br>5：知识检索节点<br>6：标签提取节点<br>7：代码执行节点<br>8：工具节点<br>9：逻辑判断节点<br>10：回复节点<br>11：选项卡节点<br>12：循环节点<br>13：意图识别节点<br>14：工作流节点<br>15：插件节点<br>16：结束节点<br>17: 变量聚合节点数据<br>18: 批处理节点<br>19: 消息队列节点</p>
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型。<br>1： 开始节点<br>2：参数提取节点<br>3：大模型节点<br>4：知识问答节点<br>5：知识检索节点<br>6：标签提取节点<br>7：代码执行节点<br>8：工具节点<br>9：逻辑判断节点<br>10：回复节点<br>11：选项卡节点<br>12：循环节点<br>13：意图识别节点<br>14：工作流节点<br>15：插件节点<br>16：结束节点<br>17: 变量聚合节点数据<br>18: 批处理节点<br>19: 消息队列节点</p>
     * @param NodeType <p>节点类型。<br>1： 开始节点<br>2：参数提取节点<br>3：大模型节点<br>4：知识问答节点<br>5：知识检索节点<br>6：标签提取节点<br>7：代码执行节点<br>8：工具节点<br>9：逻辑判断节点<br>10：回复节点<br>11：选项卡节点<br>12：循环节点<br>13：意图识别节点<br>14：工作流节点<br>15：插件节点<br>16：结束节点<br>17: 变量聚合节点数据<br>18: 批处理节点<br>19: 消息队列节点</p>
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消</p> 
     * @return State <p>运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消</p>
     * @param State <p>运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>错误码</p> 
     * @return FailCode <p>错误码</p>
     */
    public String getFailCode() {
        return this.FailCode;
    }

    /**
     * Set <p>错误码</p>
     * @param FailCode <p>错误码</p>
     */
    public void setFailCode(String FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get <p>错误信息</p> 
     * @return FailMessage <p>错误信息</p>
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set <p>错误信息</p>
     * @param FailMessage <p>错误信息</p>
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get <p>消耗时间（毫秒）</p> 
     * @return CostMilliseconds <p>消耗时间（毫秒）</p>
     */
    public Long getCostMilliseconds() {
        return this.CostMilliseconds;
    }

    /**
     * Set <p>消耗时间（毫秒）</p>
     * @param CostMilliseconds <p>消耗时间（毫秒）</p>
     */
    public void setCostMilliseconds(Long CostMilliseconds) {
        this.CostMilliseconds = CostMilliseconds;
    }

    /**
     * Get <p>消耗的token总数</p> 
     * @return TotalTokens <p>消耗的token总数</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>消耗的token总数</p>
     * @param TotalTokens <p>消耗的token总数</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>分支下标列表</p><p>单位：无</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BranchIndexList <p>分支下标列表</p><p>单位：无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getBranchIndexList() {
        return this.BranchIndexList;
    }

    /**
     * Set <p>分支下标列表</p><p>单位：无</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BranchIndexList <p>分支下标列表</p><p>单位：无</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranchIndexList(Long [] BranchIndexList) {
        this.BranchIndexList = BranchIndexList;
    }

    public NodeRunBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunBase(NodeRunBase source) {
        if (source.NodeRunId != null) {
            this.NodeRunId = new String(source.NodeRunId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.CostMilliseconds != null) {
            this.CostMilliseconds = new Long(source.CostMilliseconds);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.BranchIndexList != null) {
            this.BranchIndexList = new Long[source.BranchIndexList.length];
            for (int i = 0; i < source.BranchIndexList.length; i++) {
                this.BranchIndexList[i] = new Long(source.BranchIndexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRunId", this.NodeRunId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "CostMilliseconds", this.CostMilliseconds);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamArraySimple(map, prefix + "BranchIndexList.", this.BranchIndexList);

    }
}

