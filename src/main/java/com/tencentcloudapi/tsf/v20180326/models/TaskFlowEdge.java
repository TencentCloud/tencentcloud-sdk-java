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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFlowEdge extends AbstractModel {

    /**
    * 节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR，节点类型为头节点时为字符串"head"
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 子节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR
    */
    @SerializedName("ChildNodeId")
    @Expose
    private String ChildNodeId;

    /**
    * 是否核心任务,Y/N
    */
    @SerializedName("CoreNode")
    @Expose
    private String CoreNode;

    /**
    * 边类型，上下游任务依赖触发关系。一共2个值，Y：成功触发，N：失败触发
    */
    @SerializedName("EdgeType")
    @Expose
    private String EdgeType;

    /**
    * 任务节点类型，一共有4种类型，AND：逻辑节点且，OR：逻辑节点或，TASK：任务节点，START：头节点
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * X轴坐标位置
    */
    @SerializedName("PositionX")
    @Expose
    private String PositionX;

    /**
    * Y轴坐标位置
    */
    @SerializedName("PositionY")
    @Expose
    private String PositionY;

    /**
    * 图 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
    */
    @SerializedName("GraphId")
    @Expose
    private String GraphId;

    /**
    * 工作流 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 任务ID，新建工作流时不需要填写，查看工作流图时后端返回
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务历史ID，新建工作流时不需要填写，查看工作流图时后端返回
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

    /**
     * Get 节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR，节点类型为头节点时为字符串"head" 
     * @return NodeId 节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR，节点类型为头节点时为字符串"head"
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR，节点类型为头节点时为字符串"head"
     * @param NodeId 节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR，节点类型为头节点时为字符串"head"
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 子节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR 
     * @return ChildNodeId 子节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR
     */
    public String getChildNodeId() {
        return this.ChildNodeId;
    }

    /**
     * Set 子节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR
     * @param ChildNodeId 子节点 ID，节点类型为任务时为任务ID，节点类型为逻辑节点"且"时为 AND，为逻辑节点"或"时为 OR
     */
    public void setChildNodeId(String ChildNodeId) {
        this.ChildNodeId = ChildNodeId;
    }

    /**
     * Get 是否核心任务,Y/N 
     * @return CoreNode 是否核心任务,Y/N
     */
    public String getCoreNode() {
        return this.CoreNode;
    }

    /**
     * Set 是否核心任务,Y/N
     * @param CoreNode 是否核心任务,Y/N
     */
    public void setCoreNode(String CoreNode) {
        this.CoreNode = CoreNode;
    }

    /**
     * Get 边类型，上下游任务依赖触发关系。一共2个值，Y：成功触发，N：失败触发 
     * @return EdgeType 边类型，上下游任务依赖触发关系。一共2个值，Y：成功触发，N：失败触发
     */
    public String getEdgeType() {
        return this.EdgeType;
    }

    /**
     * Set 边类型，上下游任务依赖触发关系。一共2个值，Y：成功触发，N：失败触发
     * @param EdgeType 边类型，上下游任务依赖触发关系。一共2个值，Y：成功触发，N：失败触发
     */
    public void setEdgeType(String EdgeType) {
        this.EdgeType = EdgeType;
    }

    /**
     * Get 任务节点类型，一共有4种类型，AND：逻辑节点且，OR：逻辑节点或，TASK：任务节点，START：头节点 
     * @return NodeType 任务节点类型，一共有4种类型，AND：逻辑节点且，OR：逻辑节点或，TASK：任务节点，START：头节点
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 任务节点类型，一共有4种类型，AND：逻辑节点且，OR：逻辑节点或，TASK：任务节点，START：头节点
     * @param NodeType 任务节点类型，一共有4种类型，AND：逻辑节点且，OR：逻辑节点或，TASK：任务节点，START：头节点
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get X轴坐标位置 
     * @return PositionX X轴坐标位置
     */
    public String getPositionX() {
        return this.PositionX;
    }

    /**
     * Set X轴坐标位置
     * @param PositionX X轴坐标位置
     */
    public void setPositionX(String PositionX) {
        this.PositionX = PositionX;
    }

    /**
     * Get Y轴坐标位置 
     * @return PositionY Y轴坐标位置
     */
    public String getPositionY() {
        return this.PositionY;
    }

    /**
     * Set Y轴坐标位置
     * @param PositionY Y轴坐标位置
     */
    public void setPositionY(String PositionY) {
        this.PositionY = PositionY;
    }

    /**
     * Get 图 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回 
     * @return GraphId 图 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     */
    public String getGraphId() {
        return this.GraphId;
    }

    /**
     * Set 图 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     * @param GraphId 图 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     */
    public void setGraphId(String GraphId) {
        this.GraphId = GraphId;
    }

    /**
     * Get 工作流 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回 
     * @return FlowId 工作流 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 工作流 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     * @param FlowId 工作流 ID，新建工作流时自动生成，不需要填写，查看工作流图时后端返回
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 任务ID，新建工作流时不需要填写，查看工作流图时后端返回 
     * @return TaskId 任务ID，新建工作流时不需要填写，查看工作流图时后端返回
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，新建工作流时不需要填写，查看工作流图时后端返回
     * @param TaskId 任务ID，新建工作流时不需要填写，查看工作流图时后端返回
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务历史ID，新建工作流时不需要填写，查看工作流图时后端返回 
     * @return TaskLogId 任务历史ID，新建工作流时不需要填写，查看工作流图时后端返回
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set 任务历史ID，新建工作流时不需要填写，查看工作流图时后端返回
     * @param TaskLogId 任务历史ID，新建工作流时不需要填写，查看工作流图时后端返回
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

