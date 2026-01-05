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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillTriggerWorkflowRunsRequest extends AbstractModel {

    /**
    * 项目ID	
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 指定要停止的工作流执行ID
    */
    @SerializedName("WorkflowExecutionIdList")
    @Expose
    private String [] WorkflowExecutionIdList;

    /**
    * 当指定的工作流运行为空时，是否全部终止正在运行的工作流执行	
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 当指定的工作流运行为空时，是否仅停止等待中的工作流运行
    */
    @SerializedName("Pending")
    @Expose
    private Boolean Pending;

    /**
     * Get 项目ID	 
     * @return ProjectId 项目ID	
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID	
     * @param ProjectId 项目ID	
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 指定要停止的工作流执行ID 
     * @return WorkflowExecutionIdList 指定要停止的工作流执行ID
     */
    public String [] getWorkflowExecutionIdList() {
        return this.WorkflowExecutionIdList;
    }

    /**
     * Set 指定要停止的工作流执行ID
     * @param WorkflowExecutionIdList 指定要停止的工作流执行ID
     */
    public void setWorkflowExecutionIdList(String [] WorkflowExecutionIdList) {
        this.WorkflowExecutionIdList = WorkflowExecutionIdList;
    }

    /**
     * Get 当指定的工作流运行为空时，是否全部终止正在运行的工作流执行	 
     * @return All 当指定的工作流运行为空时，是否全部终止正在运行的工作流执行	
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 当指定的工作流运行为空时，是否全部终止正在运行的工作流执行	
     * @param All 当指定的工作流运行为空时，是否全部终止正在运行的工作流执行	
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 当指定的工作流运行为空时，是否仅停止等待中的工作流运行 
     * @return Pending 当指定的工作流运行为空时，是否仅停止等待中的工作流运行
     */
    public Boolean getPending() {
        return this.Pending;
    }

    /**
     * Set 当指定的工作流运行为空时，是否仅停止等待中的工作流运行
     * @param Pending 当指定的工作流运行为空时，是否仅停止等待中的工作流运行
     */
    public void setPending(Boolean Pending) {
        this.Pending = Pending;
    }

    public KillTriggerWorkflowRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillTriggerWorkflowRunsRequest(KillTriggerWorkflowRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionIdList != null) {
            this.WorkflowExecutionIdList = new String[source.WorkflowExecutionIdList.length];
            for (int i = 0; i < source.WorkflowExecutionIdList.length; i++) {
                this.WorkflowExecutionIdList[i] = new String(source.WorkflowExecutionIdList[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Pending != null) {
            this.Pending = new Boolean(source.Pending);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "WorkflowExecutionIdList.", this.WorkflowExecutionIdList);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "Pending", this.Pending);

    }
}

