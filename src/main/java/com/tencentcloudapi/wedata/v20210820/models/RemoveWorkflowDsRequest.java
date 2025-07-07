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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveWorkflowDsRequest extends AbstractModel {

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
    * 是否删除脚本
    */
    @SerializedName("DeleteScript")
    @Expose
    private String DeleteScript;

    /**
    * 删除是否通知下游
    */
    @SerializedName("OperateIsInform")
    @Expose
    private String OperateIsInform;

    /**
    * 是否终止进行中的任务
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

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
     * Get 是否删除脚本 
     * @return DeleteScript 是否删除脚本
     */
    public String getDeleteScript() {
        return this.DeleteScript;
    }

    /**
     * Set 是否删除脚本
     * @param DeleteScript 是否删除脚本
     */
    public void setDeleteScript(String DeleteScript) {
        this.DeleteScript = DeleteScript;
    }

    /**
     * Get 删除是否通知下游 
     * @return OperateIsInform 删除是否通知下游
     */
    public String getOperateIsInform() {
        return this.OperateIsInform;
    }

    /**
     * Set 删除是否通知下游
     * @param OperateIsInform 删除是否通知下游
     */
    public void setOperateIsInform(String OperateIsInform) {
        this.OperateIsInform = OperateIsInform;
    }

    /**
     * Get 是否终止进行中的任务 
     * @return DeleteMode 是否终止进行中的任务
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 是否终止进行中的任务
     * @param DeleteMode 是否终止进行中的任务
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public RemoveWorkflowDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveWorkflowDsRequest(RemoveWorkflowDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.DeleteScript != null) {
            this.DeleteScript = new String(source.DeleteScript);
        }
        if (source.OperateIsInform != null) {
            this.OperateIsInform = new String(source.OperateIsInform);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new String(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DeleteScript", this.DeleteScript);
        this.setParamSimple(map, prefix + "OperateIsInform", this.OperateIsInform);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

