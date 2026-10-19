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

public class DescribeWorkflowRunRequest extends AbstractModel {

    /**
    * <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>工作流运行实例ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>指定的子工作流对应的NodePath。 格式：[&lt;node_id&gt;[&lt;index&gt;].]*&lt;node_id&gt;[&lt;index&gt;]  此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 节点ID[实例索引]。 节点ID (node_id)：子工作流所属的节点的ID。 实例索引 (index)：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。 示例： &quot;&quot; 或 不设置 -&gt; 查询主工作流实例 (父工作流) &quot;node_id_a&quot; -&gt; 查询由主工作流中工作流节点node_id_a对应的子工作流实例 &quot;node_id_a.node_id_b[1]&quot; -&gt; 查询工作流节点node_id_a对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态</p>
    */
    @SerializedName("SubWorkflowNodePath")
    @Expose
    private String SubWorkflowNodePath;

    /**
    * <p>是否需要返回工作流的流程图配置</p>
    */
    @SerializedName("IncludeWorkflowGraph")
    @Expose
    private Boolean IncludeWorkflowGraph;

    /**
     * Get <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p> 
     * @return AppId <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     * @param AppId <p>应用ID, 获取方法参看如何获取 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>工作流运行实例ID</p> 
     * @return WorkflowRunId <p>工作流运行实例ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行实例ID</p>
     * @param WorkflowRunId <p>工作流运行实例ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>指定的子工作流对应的NodePath。 格式：[&lt;node_id&gt;[&lt;index&gt;].]*&lt;node_id&gt;[&lt;index&gt;]  此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 节点ID[实例索引]。 节点ID (node_id)：子工作流所属的节点的ID。 实例索引 (index)：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。 示例： &quot;&quot; 或 不设置 -&gt; 查询主工作流实例 (父工作流) &quot;node_id_a&quot; -&gt; 查询由主工作流中工作流节点node_id_a对应的子工作流实例 &quot;node_id_a.node_id_b[1]&quot; -&gt; 查询工作流节点node_id_a对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态</p> 
     * @return SubWorkflowNodePath <p>指定的子工作流对应的NodePath。 格式：[&lt;node_id&gt;[&lt;index&gt;].]*&lt;node_id&gt;[&lt;index&gt;]  此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 节点ID[实例索引]。 节点ID (node_id)：子工作流所属的节点的ID。 实例索引 (index)：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。 示例： &quot;&quot; 或 不设置 -&gt; 查询主工作流实例 (父工作流) &quot;node_id_a&quot; -&gt; 查询由主工作流中工作流节点node_id_a对应的子工作流实例 &quot;node_id_a.node_id_b[1]&quot; -&gt; 查询工作流节点node_id_a对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态</p>
     */
    public String getSubWorkflowNodePath() {
        return this.SubWorkflowNodePath;
    }

    /**
     * Set <p>指定的子工作流对应的NodePath。 格式：[&lt;node_id&gt;[&lt;index&gt;].]*&lt;node_id&gt;[&lt;index&gt;]  此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 节点ID[实例索引]。 节点ID (node_id)：子工作流所属的节点的ID。 实例索引 (index)：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。 示例： &quot;&quot; 或 不设置 -&gt; 查询主工作流实例 (父工作流) &quot;node_id_a&quot; -&gt; 查询由主工作流中工作流节点node_id_a对应的子工作流实例 &quot;node_id_a.node_id_b[1]&quot; -&gt; 查询工作流节点node_id_a对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态</p>
     * @param SubWorkflowNodePath <p>指定的子工作流对应的NodePath。 格式：[&lt;node_id&gt;[&lt;index&gt;].]*&lt;node_id&gt;[&lt;index&gt;]  此路径用于定位一个具体的工作流实例（Workflow Run），可以是主工作流实例或某个子工作流节点产生的子实例。 路径由点号（.）分隔的节点标识符组成，每个节点标识符格式为 节点ID[实例索引]。 节点ID (node_id)：子工作流所属的节点的ID。 实例索引 (index)：“实例索引” 在工作流节点的时候为空，循环、批处理节点非空，从1开始。 示例： &quot;&quot; 或 不设置 -&gt; 查询主工作流实例 (父工作流) &quot;node_id_a&quot; -&gt; 查询由主工作流中工作流节点node_id_a对应的子工作流实例 &quot;node_id_a.node_id_b[1]&quot; -&gt; 查询工作流节点node_id_a对应的子工作流的循环节点node_id_b的第1轮循环的子工作流运行状态</p>
     */
    public void setSubWorkflowNodePath(String SubWorkflowNodePath) {
        this.SubWorkflowNodePath = SubWorkflowNodePath;
    }

    /**
     * Get <p>是否需要返回工作流的流程图配置</p> 
     * @return IncludeWorkflowGraph <p>是否需要返回工作流的流程图配置</p>
     */
    public Boolean getIncludeWorkflowGraph() {
        return this.IncludeWorkflowGraph;
    }

    /**
     * Set <p>是否需要返回工作流的流程图配置</p>
     * @param IncludeWorkflowGraph <p>是否需要返回工作流的流程图配置</p>
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
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "SubWorkflowNodePath", this.SubWorkflowNodePath);
        this.setParamSimple(map, prefix + "IncludeWorkflowGraph", this.IncludeWorkflowGraph);

    }
}

