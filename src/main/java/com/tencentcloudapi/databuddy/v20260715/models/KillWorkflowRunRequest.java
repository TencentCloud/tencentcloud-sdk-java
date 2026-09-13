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

public class KillWorkflowRunRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>待终止的工作流运行ID列表，可通过 ListWorkflowRuns 获取</p>
    */
    @SerializedName("WorkflowRunIds")
    @Expose
    private String [] WorkflowRunIds;

    /**
    * <p>是否终止该工作流下所有未进入终态的运行。非必填，默认 false</p>
    */
    @SerializedName("KillAllRuns")
    @Expose
    private Boolean KillAllRuns;

    /**
    * <p>是否只终止处于等待中（Pending）状态的运行。非必填，默认 false</p>
    */
    @SerializedName("OnlyKillPendingRuns")
    @Expose
    private Boolean OnlyKillPendingRuns;

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
     * Get <p>工作流ID，可通过 ListWorkflows 获取。必填</p> 
     * @return WorkflowId <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     * @param WorkflowId <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>待终止的工作流运行ID列表，可通过 ListWorkflowRuns 获取</p> 
     * @return WorkflowRunIds <p>待终止的工作流运行ID列表，可通过 ListWorkflowRuns 获取</p>
     */
    public String [] getWorkflowRunIds() {
        return this.WorkflowRunIds;
    }

    /**
     * Set <p>待终止的工作流运行ID列表，可通过 ListWorkflowRuns 获取</p>
     * @param WorkflowRunIds <p>待终止的工作流运行ID列表，可通过 ListWorkflowRuns 获取</p>
     */
    public void setWorkflowRunIds(String [] WorkflowRunIds) {
        this.WorkflowRunIds = WorkflowRunIds;
    }

    /**
     * Get <p>是否终止该工作流下所有未进入终态的运行。非必填，默认 false</p> 
     * @return KillAllRuns <p>是否终止该工作流下所有未进入终态的运行。非必填，默认 false</p>
     */
    public Boolean getKillAllRuns() {
        return this.KillAllRuns;
    }

    /**
     * Set <p>是否终止该工作流下所有未进入终态的运行。非必填，默认 false</p>
     * @param KillAllRuns <p>是否终止该工作流下所有未进入终态的运行。非必填，默认 false</p>
     */
    public void setKillAllRuns(Boolean KillAllRuns) {
        this.KillAllRuns = KillAllRuns;
    }

    /**
     * Get <p>是否只终止处于等待中（Pending）状态的运行。非必填，默认 false</p> 
     * @return OnlyKillPendingRuns <p>是否只终止处于等待中（Pending）状态的运行。非必填，默认 false</p>
     */
    public Boolean getOnlyKillPendingRuns() {
        return this.OnlyKillPendingRuns;
    }

    /**
     * Set <p>是否只终止处于等待中（Pending）状态的运行。非必填，默认 false</p>
     * @param OnlyKillPendingRuns <p>是否只终止处于等待中（Pending）状态的运行。非必填，默认 false</p>
     */
    public void setOnlyKillPendingRuns(Boolean OnlyKillPendingRuns) {
        this.OnlyKillPendingRuns = OnlyKillPendingRuns;
    }

    public KillWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillWorkflowRunRequest(KillWorkflowRunRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunIds != null) {
            this.WorkflowRunIds = new String[source.WorkflowRunIds.length];
            for (int i = 0; i < source.WorkflowRunIds.length; i++) {
                this.WorkflowRunIds[i] = new String(source.WorkflowRunIds[i]);
            }
        }
        if (source.KillAllRuns != null) {
            this.KillAllRuns = new Boolean(source.KillAllRuns);
        }
        if (source.OnlyKillPendingRuns != null) {
            this.OnlyKillPendingRuns = new Boolean(source.OnlyKillPendingRuns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "WorkflowRunIds.", this.WorkflowRunIds);
        this.setParamSimple(map, prefix + "KillAllRuns", this.KillAllRuns);
        this.setParamSimple(map, prefix + "OnlyKillPendingRuns", this.OnlyKillPendingRuns);

    }
}

