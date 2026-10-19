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

public class DescribeNodeBatchRunRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>索引号</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>工作流节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>子工作流所属节点</p><p>node_id_a.node_id_b[1]</p>
    */
    @SerializedName("SubWorkflowNodePath")
    @Expose
    private String SubWorkflowNodePath;

    /**
    * <p>工作流运行ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>索引号</p> 
     * @return Index <p>索引号</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>索引号</p>
     * @param Index <p>索引号</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>工作流节点ID</p> 
     * @return NodeId <p>工作流节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>工作流节点ID</p>
     * @param NodeId <p>工作流节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>子工作流所属节点</p><p>node_id_a.node_id_b[1]</p> 
     * @return SubWorkflowNodePath <p>子工作流所属节点</p><p>node_id_a.node_id_b[1]</p>
     */
    public String getSubWorkflowNodePath() {
        return this.SubWorkflowNodePath;
    }

    /**
     * Set <p>子工作流所属节点</p><p>node_id_a.node_id_b[1]</p>
     * @param SubWorkflowNodePath <p>子工作流所属节点</p><p>node_id_a.node_id_b[1]</p>
     */
    public void setSubWorkflowNodePath(String SubWorkflowNodePath) {
        this.SubWorkflowNodePath = SubWorkflowNodePath;
    }

    /**
     * Get <p>工作流运行ID</p> 
     * @return WorkflowRunId <p>工作流运行ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行ID</p>
     * @param WorkflowRunId <p>工作流运行ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public DescribeNodeBatchRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeBatchRunRequest(DescribeNodeBatchRunRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.SubWorkflowNodePath != null) {
            this.SubWorkflowNodePath = new String(source.SubWorkflowNodePath);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "SubWorkflowNodePath", this.SubWorkflowNodePath);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

