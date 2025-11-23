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

public class DescribeWorkflowRunRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 工作流运行实例ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 指定的子工作流对应的NodePath。
格式：`[<node_id>[<index>].]*<node_id>[<index>]`
- 此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。
- 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 `节点ID[实例索引]`。
- **节点ID (node_id)**：子工作流所属的节点的ID。
- **实例索引 (index)**：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。
示例：
- "" 或 不设置 -> 查询主工作流实例 (父工作流)
- "node_id_a" -> 查询由主工作流中工作流节点`node_id_a`对应的子工作流实例
- "node_id_a.node_id_b[1]" -> 查询工作流节点`node_id_a`对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态
    */
    @SerializedName("SubWorkflowNodePath")
    @Expose
    private String SubWorkflowNodePath;

    /**
    * 是否需要返回工作流的流程图配置
    */
    @SerializedName("IncludeWorkflowGraph")
    @Expose
    private Boolean IncludeWorkflowGraph;

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 工作流运行实例ID 
     * @return WorkflowRunId 工作流运行实例ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行实例ID
     * @param WorkflowRunId 工作流运行实例ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get 指定的子工作流对应的NodePath。
格式：`[<node_id>[<index>].]*<node_id>[<index>]`
- 此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。
- 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 `节点ID[实例索引]`。
- **节点ID (node_id)**：子工作流所属的节点的ID。
- **实例索引 (index)**：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。
示例：
- "" 或 不设置 -> 查询主工作流实例 (父工作流)
- "node_id_a" -> 查询由主工作流中工作流节点`node_id_a`对应的子工作流实例
- "node_id_a.node_id_b[1]" -> 查询工作流节点`node_id_a`对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态 
     * @return SubWorkflowNodePath 指定的子工作流对应的NodePath。
格式：`[<node_id>[<index>].]*<node_id>[<index>]`
- 此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。
- 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 `节点ID[实例索引]`。
- **节点ID (node_id)**：子工作流所属的节点的ID。
- **实例索引 (index)**：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。
示例：
- "" 或 不设置 -> 查询主工作流实例 (父工作流)
- "node_id_a" -> 查询由主工作流中工作流节点`node_id_a`对应的子工作流实例
- "node_id_a.node_id_b[1]" -> 查询工作流节点`node_id_a`对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态
     */
    public String getSubWorkflowNodePath() {
        return this.SubWorkflowNodePath;
    }

    /**
     * Set 指定的子工作流对应的NodePath。
格式：`[<node_id>[<index>].]*<node_id>[<index>]`
- 此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。
- 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 `节点ID[实例索引]`。
- **节点ID (node_id)**：子工作流所属的节点的ID。
- **实例索引 (index)**：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。
示例：
- "" 或 不设置 -> 查询主工作流实例 (父工作流)
- "node_id_a" -> 查询由主工作流中工作流节点`node_id_a`对应的子工作流实例
- "node_id_a.node_id_b[1]" -> 查询工作流节点`node_id_a`对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态
     * @param SubWorkflowNodePath 指定的子工作流对应的NodePath。
格式：`[<node_id>[<index>].]*<node_id>[<index>]`
- 此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。
- 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 `节点ID[实例索引]`。
- **节点ID (node_id)**：子工作流所属的节点的ID。
- **实例索引 (index)**：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。
示例：
- "" 或 不设置 -> 查询主工作流实例 (父工作流)
- "node_id_a" -> 查询由主工作流中工作流节点`node_id_a`对应的子工作流实例
- "node_id_a.node_id_b[1]" -> 查询工作流节点`node_id_a`对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态
     */
    public void setSubWorkflowNodePath(String SubWorkflowNodePath) {
        this.SubWorkflowNodePath = SubWorkflowNodePath;
    }

    /**
     * Get 是否需要返回工作流的流程图配置 
     * @return IncludeWorkflowGraph 是否需要返回工作流的流程图配置
     */
    public Boolean getIncludeWorkflowGraph() {
        return this.IncludeWorkflowGraph;
    }

    /**
     * Set 是否需要返回工作流的流程图配置
     * @param IncludeWorkflowGraph 是否需要返回工作流的流程图配置
     */
    public void setIncludeWorkflowGraph(Boolean IncludeWorkflowGraph) {
        this.IncludeWorkflowGraph = IncludeWorkflowGraph;
    }

    public DescribeWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowRunRequest(DescribeWorkflowRunRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.SubWorkflowNodePath != null) {
            this.SubWorkflowNodePath = new String(source.SubWorkflowNodePath);
        }
        if (source.IncludeWorkflowGraph != null) {
            this.IncludeWorkflowGraph = new Boolean(source.IncludeWorkflowGraph);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "SubWorkflowNodePath", this.SubWorkflowNodePath);
        this.setParamSimple(map, prefix + "IncludeWorkflowGraph", this.IncludeWorkflowGraph);

    }
}

