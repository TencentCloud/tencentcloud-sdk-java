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

public class DescribeWorkflowRunResponse extends AbstractModel {

    /**
    * <p>工作流运行实例详情</p>
    */
    @SerializedName("WorkflowRun")
    @Expose
    private WorkflowRun WorkflowRun;

    /**
    * <p>节点列表</p>
    */
    @SerializedName("NodeRunList")
    @Expose
    private NodeRun [] NodeRunList;

    /**
    * <p>子工作流对应的NodePath</p>
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
     * Get <p>工作流运行实例详情</p> 
     * @return WorkflowRun <p>工作流运行实例详情</p>
     */
    public WorkflowRun getWorkflowRun() {
        return this.WorkflowRun;
    }

    /**
     * Set <p>工作流运行实例详情</p>
     * @param WorkflowRun <p>工作流运行实例详情</p>
     */
    public void setWorkflowRun(WorkflowRun WorkflowRun) {
        this.WorkflowRun = WorkflowRun;
    }

    /**
     * Get <p>节点列表</p> 
     * @return NodeRunList <p>节点列表</p>
     */
    public NodeRun [] getNodeRunList() {
        return this.NodeRunList;
    }

    /**
     * Set <p>节点列表</p>
     * @param NodeRunList <p>节点列表</p>
     */
    public void setNodeRunList(NodeRun [] NodeRunList) {
        this.NodeRunList = NodeRunList;
    }

    /**
     * Get <p>子工作流对应的NodePath</p> 
     * @return SubWorkflowNodePath <p>子工作流对应的NodePath</p>
     */
    public String getSubWorkflowNodePath() {
        return this.SubWorkflowNodePath;
    }

    /**
     * Set <p>子工作流对应的NodePath</p>
     * @param SubWorkflowNodePath <p>子工作流对应的NodePath</p>
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
            this.WorkflowRun = new WorkflowRun(source.WorkflowRun);
        }
        if (source.NodeRunList != null) {
            this.NodeRunList = new NodeRun[source.NodeRunList.length];
            for (int i = 0; i < source.NodeRunList.length; i++) {
                this.NodeRunList[i] = new NodeRun(source.NodeRunList[i]);
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
        this.setParamArrayObj(map, prefix + "NodeRunList.", this.NodeRunList);
        this.setParamSimple(map, prefix + "SubWorkflowNodePath", this.SubWorkflowNodePath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

