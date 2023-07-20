/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWorkflowByIdRequest extends AbstractModel{

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 删除后下游任务的处理方式，true:下游任务均正常运行 false:下游任务均运行失败
    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

    /**
    * 删除任务后是否通知下游任务责任人, true:通知 false:不通知
    */
    @SerializedName("EnableNotify")
    @Expose
    private Boolean EnableNotify;

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 删除后下游任务的处理方式，true:下游任务均正常运行 false:下游任务均运行失败 
     * @return DeleteMode 删除后下游任务的处理方式，true:下游任务均正常运行 false:下游任务均运行失败
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 删除后下游任务的处理方式，true:下游任务均正常运行 false:下游任务均运行失败
     * @param DeleteMode 删除后下游任务的处理方式，true:下游任务均正常运行 false:下游任务均运行失败
     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get 删除任务后是否通知下游任务责任人, true:通知 false:不通知 
     * @return EnableNotify 删除任务后是否通知下游任务责任人, true:通知 false:不通知
     */
    public Boolean getEnableNotify() {
        return this.EnableNotify;
    }

    /**
     * Set 删除任务后是否通知下游任务责任人, true:通知 false:不通知
     * @param EnableNotify 删除任务后是否通知下游任务责任人, true:通知 false:不通知
     */
    public void setEnableNotify(Boolean EnableNotify) {
        this.EnableNotify = EnableNotify;
    }

    public DeleteWorkflowByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkflowByIdRequest(DeleteWorkflowByIdRequest source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
        if (source.EnableNotify != null) {
            this.EnableNotify = new Boolean(source.EnableNotify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "EnableNotify", this.EnableNotify);

    }
}

