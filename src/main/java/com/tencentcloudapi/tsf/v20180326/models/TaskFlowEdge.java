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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowEdge extends AbstractModel{

    /**
    * 节点 ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 子节点 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildNodeId")
    @Expose
    private String ChildNodeId;

    /**
    * 是否核心任务,Y/N
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreNode")
    @Expose
    private String CoreNode;

    /**
    * 边类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeType")
    @Expose
    private String EdgeType;

    /**
    * 任务节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * X轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PositionX")
    @Expose
    private String PositionX;

    /**
    * Y轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PositionY")
    @Expose
    private String PositionY;

    /**
    * 图 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GraphId")
    @Expose
    private String GraphId;

    /**
    * 工作流 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

    /**
     * Get 节点 ID 
     * @return NodeId 节点 ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点 ID
     * @param NodeId 节点 ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 子节点 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildNodeId 子节点 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChildNodeId() {
        return this.ChildNodeId;
    }

    /**
     * Set 子节点 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildNodeId 子节点 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildNodeId(String ChildNodeId) {
        this.ChildNodeId = ChildNodeId;
    }

    /**
     * Get 是否核心任务,Y/N
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreNode 是否核心任务,Y/N
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoreNode() {
        return this.CoreNode;
    }

    /**
     * Set 是否核心任务,Y/N
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreNode 是否核心任务,Y/N
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreNode(String CoreNode) {
        this.CoreNode = CoreNode;
    }

    /**
     * Get 边类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeType 边类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeType() {
        return this.EdgeType;
    }

    /**
     * Set 边类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeType 边类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeType(String EdgeType) {
        this.EdgeType = EdgeType;
    }

    /**
     * Get 任务节点类型 
     * @return NodeType 任务节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 任务节点类型
     * @param NodeType 任务节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get X轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PositionX X轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPositionX() {
        return this.PositionX;
    }

    /**
     * Set X轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PositionX X轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositionX(String PositionX) {
        this.PositionX = PositionX;
    }

    /**
     * Get Y轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PositionY Y轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPositionY() {
        return this.PositionY;
    }

    /**
     * Set Y轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PositionY Y轴坐标位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositionY(String PositionY) {
        this.PositionY = PositionY;
    }

    /**
     * Get 图 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GraphId 图 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGraphId() {
        return this.GraphId;
    }

    /**
     * Set 图 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GraphId 图 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGraphId(String GraphId) {
        this.GraphId = GraphId;
    }

    /**
     * Get 工作流 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 工作流 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 工作流 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 工作流 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
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
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLogId 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLogId 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLogId(String TaskLogId) {
        this.TaskLogId = TaskLogId;
    }

    public TaskFlowEdge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFlowEdge(TaskFlowEdge source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ChildNodeId != null) {
            this.ChildNodeId = new String(source.ChildNodeId);
        }
        if (source.CoreNode != null) {
            this.CoreNode = new String(source.CoreNode);
        }
        if (source.EdgeType != null) {
            this.EdgeType = new String(source.EdgeType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PositionX != null) {
            this.PositionX = new String(source.PositionX);
        }
        if (source.PositionY != null) {
            this.PositionY = new String(source.PositionY);
        }
        if (source.GraphId != null) {
            this.GraphId = new String(source.GraphId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskLogId != null) {
            this.TaskLogId = new String(source.TaskLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ChildNodeId", this.ChildNodeId);
        this.setParamSimple(map, prefix + "CoreNode", this.CoreNode);
        this.setParamSimple(map, prefix + "EdgeType", this.EdgeType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PositionX", this.PositionX);
        this.setParamSimple(map, prefix + "PositionY", this.PositionY);
        this.setParamSimple(map, prefix + "GraphId", this.GraphId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskLogId", this.TaskLogId);

    }
}

