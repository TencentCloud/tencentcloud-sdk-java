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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommitWorkflowRequest extends AbstractModel {

    /**
    * 项目编号
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流编号
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 提交信息
    */
    @SerializedName("CommitDesc")
    @Expose
    private String CommitDesc;

    /**
     * Get 项目编号 
     * @return ProjectId 项目编号
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
     * @param ProjectId 项目编号
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流编号 
     * @return WorkflowId 工作流编号
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流编号
     * @param WorkflowId 工作流编号
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 提交信息 
     * @return CommitDesc 提交信息
     */
    public String getCommitDesc() {
        return this.CommitDesc;
    }

    /**
     * Set 提交信息
     * @param CommitDesc 提交信息
     */
    public void setCommitDesc(String CommitDesc) {
        this.CommitDesc = CommitDesc;
    }

    public CommitWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitWorkflowRequest(CommitWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CommitDesc != null) {
            this.CommitDesc = new String(source.CommitDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CommitDesc", this.CommitDesc);

    }
}

