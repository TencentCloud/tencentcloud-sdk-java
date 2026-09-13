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

public class UpdateWorkflowRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>待更新的工作流ID，可通过 ListWorkflows 获取。必填</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>需要清空的字段名列表，用于将指定字段重置为空</p>
    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
    * <p>更新后的工作流配置，仅传入需要变更的部分即可</p>
    */
    @SerializedName("NewSetting")
    @Expose
    private Workflow NewSetting;

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
     * Get <p>待更新的工作流ID，可通过 ListWorkflows 获取。必填</p> 
     * @return WorkflowId <p>待更新的工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>待更新的工作流ID，可通过 ListWorkflows 获取。必填</p>
     * @param WorkflowId <p>待更新的工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>需要清空的字段名列表，用于将指定字段重置为空</p> 
     * @return FieldToRemoveList <p>需要清空的字段名列表，用于将指定字段重置为空</p>
     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set <p>需要清空的字段名列表，用于将指定字段重置为空</p>
     * @param FieldToRemoveList <p>需要清空的字段名列表，用于将指定字段重置为空</p>
     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    /**
     * Get <p>更新后的工作流配置，仅传入需要变更的部分即可</p> 
     * @return NewSetting <p>更新后的工作流配置，仅传入需要变更的部分即可</p>
     */
    public Workflow getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set <p>更新后的工作流配置，仅传入需要变更的部分即可</p>
     * @param NewSetting <p>更新后的工作流配置，仅传入需要变更的部分即可</p>
     */
    public void setNewSetting(Workflow NewSetting) {
        this.NewSetting = NewSetting;
    }

    public UpdateWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowRequest(UpdateWorkflowRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.FieldToRemoveList != null) {
            this.FieldToRemoveList = new String[source.FieldToRemoveList.length];
            for (int i = 0; i < source.FieldToRemoveList.length; i++) {
                this.FieldToRemoveList[i] = new String(source.FieldToRemoveList[i]);
            }
        }
        if (source.NewSetting != null) {
            this.NewSetting = new Workflow(source.NewSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);

    }
}

