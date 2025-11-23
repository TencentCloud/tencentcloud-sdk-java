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

public class DescribeWorkflowRunResponse extends AbstractModel {

    /**
    * 工作流的详情
    */
    @SerializedName("WorkflowRun")
    @Expose
    private WorkflowRunDetail WorkflowRun;

    /**
    * 节点列表
    */
    @SerializedName("NodeRuns")
    @Expose
    private NodeRunBase [] NodeRuns;

    /**
    * 子工作流对应的NodePath
    */
    @SerializedName("SubWorkflowNodePath")
    @Expose
    private String SubWorkflowNodePath;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 工作流的详情 
     * @return WorkflowRun 工作流的详情
     */
    public WorkflowRunDetail getWorkflowRun() {
        return this.WorkflowRun;
    }

    /**
     * Set 工作流的详情
     * @param WorkflowRun 工作流的详情
     */
    public void setWorkflowRun(WorkflowRunDetail WorkflowRun) {
        this.WorkflowRun = WorkflowRun;
    }

    /**
     * Get 节点列表 
     * @return NodeRuns 节点列表
     */
    public NodeRunBase [] getNodeRuns() {
        return this.NodeRuns;
    }

    /**
     * Set 节点列表
     * @param NodeRuns 节点列表
     */
    public void setNodeRuns(NodeRunBase [] NodeRuns) {
        this.NodeRuns = NodeRuns;
    }

    /**
     * Get 子工作流对应的NodePath 
     * @return SubWorkflowNodePath 子工作流对应的NodePath
     */
    public String getSubWorkflowNodePath() {
        return this.SubWorkflowNodePath;
    }

    /**
     * Set 子工作流对应的NodePath
     * @param SubWorkflowNodePath 子工作流对应的NodePath
     */
    public void setSubWorkflowNodePath(String SubWorkflowNodePath) {
        this.SubWorkflowNodePath = SubWorkflowNodePath;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWorkflowRunResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowRunResponse(DescribeWorkflowRunResponse source) {
        if (source.WorkflowRun != null) {
            this.WorkflowRun = new WorkflowRunDetail(source.WorkflowRun);
        }
        if (source.NodeRuns != null) {
            this.NodeRuns = new NodeRunBase[source.NodeRuns.length];
            for (int i = 0; i < source.NodeRuns.length; i++) {
                this.NodeRuns[i] = new NodeRunBase(source.NodeRuns[i]);
            }
        }
        if (source.SubWorkflowNodePath != null) {
            this.SubWorkflowNodePath = new String(source.SubWorkflowNodePath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WorkflowRun.", this.WorkflowRun);
        this.setParamArrayObj(map, prefix + "NodeRuns.", this.NodeRuns);
        this.setParamSimple(map, prefix + "SubWorkflowNodePath", this.SubWorkflowNodePath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

