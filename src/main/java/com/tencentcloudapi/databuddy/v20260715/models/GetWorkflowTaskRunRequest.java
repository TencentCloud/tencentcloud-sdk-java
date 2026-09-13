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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWorkflowTaskRunRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>任务运行ID，可通过 ListWorkflowTaskRuns 获取。必填</p>
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * <p>内嵌工作流任务运行列表选项（仅限 FOR_EACH 任务使用）。非必填</p>
    */
    @SerializedName("InnerWorkflowTaskRunListOption")
    @Expose
    private InnerWorkflowTaskRunListOption InnerWorkflowTaskRunListOption;

    /**
     * Get <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p> 
     * @return WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     * @param WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>任务运行ID，可通过 ListWorkflowTaskRuns 获取。必填</p> 
     * @return WorkflowTaskRunId <p>任务运行ID，可通过 ListWorkflowTaskRuns 获取。必填</p>
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>任务运行ID，可通过 ListWorkflowTaskRuns 获取。必填</p>
     * @param WorkflowTaskRunId <p>任务运行ID，可通过 ListWorkflowTaskRuns 获取。必填</p>
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get <p>内嵌工作流任务运行列表选项（仅限 FOR_EACH 任务使用）。非必填</p> 
     * @return InnerWorkflowTaskRunListOption <p>内嵌工作流任务运行列表选项（仅限 FOR_EACH 任务使用）。非必填</p>
     */
    public InnerWorkflowTaskRunListOption getInnerWorkflowTaskRunListOption() {
        return this.InnerWorkflowTaskRunListOption;
    }

    /**
     * Set <p>内嵌工作流任务运行列表选项（仅限 FOR_EACH 任务使用）。非必填</p>
     * @param InnerWorkflowTaskRunListOption <p>内嵌工作流任务运行列表选项（仅限 FOR_EACH 任务使用）。非必填</p>
     */
    public void setInnerWorkflowTaskRunListOption(InnerWorkflowTaskRunListOption InnerWorkflowTaskRunListOption) {
        this.InnerWorkflowTaskRunListOption = InnerWorkflowTaskRunListOption;
    }

    public GetWorkflowTaskRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWorkflowTaskRunRequest(GetWorkflowTaskRunRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
        }
        if (source.InnerWorkflowTaskRunListOption != null) {
            this.InnerWorkflowTaskRunListOption = new InnerWorkflowTaskRunListOption(source.InnerWorkflowTaskRunListOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamObj(map, prefix + "InnerWorkflowTaskRunListOption.", this.InnerWorkflowTaskRunListOption);

    }
}

