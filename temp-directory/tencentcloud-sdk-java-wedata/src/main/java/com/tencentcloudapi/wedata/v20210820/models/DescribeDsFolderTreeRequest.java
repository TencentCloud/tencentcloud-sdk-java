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

public class DescribeDsFolderTreeRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否一级拉取
    */
    @SerializedName("FirstLevelPull")
    @Expose
    private Boolean FirstLevelPull;

    /**
    * 文件夹ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 关键字搜索
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 是否包含工作流
    */
    @SerializedName("IncludeWorkflow")
    @Expose
    private Boolean IncludeWorkflow;

    /**
    * 是否包含任务
    */
    @SerializedName("IncludeTask")
    @Expose
    private Boolean IncludeTask;

    /**
    * 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
    */
    @SerializedName("IncludeVirtualTask")
    @Expose
    private Boolean IncludeVirtualTask;

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
     * Get 是否一级拉取 
     * @return FirstLevelPull 是否一级拉取
     */
    public Boolean getFirstLevelPull() {
        return this.FirstLevelPull;
    }

    /**
     * Set 是否一级拉取
     * @param FirstLevelPull 是否一级拉取
     */
    public void setFirstLevelPull(Boolean FirstLevelPull) {
        this.FirstLevelPull = FirstLevelPull;
    }

    /**
     * Get 文件夹ID 
     * @return FolderId 文件夹ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
     * @param FolderId 文件夹ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
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
     * Get 关键字搜索 
     * @return Keyword 关键字搜索
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字搜索
     * @param Keyword 关键字搜索
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 是否包含工作流 
     * @return IncludeWorkflow 是否包含工作流
     */
    public Boolean getIncludeWorkflow() {
        return this.IncludeWorkflow;
    }

    /**
     * Set 是否包含工作流
     * @param IncludeWorkflow 是否包含工作流
     */
    public void setIncludeWorkflow(Boolean IncludeWorkflow) {
        this.IncludeWorkflow = IncludeWorkflow;
    }

    /**
     * Get 是否包含任务 
     * @return IncludeTask 是否包含任务
     */
    public Boolean getIncludeTask() {
        return this.IncludeTask;
    }

    /**
     * Set 是否包含任务
     * @param IncludeTask 是否包含任务
     */
    public void setIncludeTask(Boolean IncludeTask) {
        this.IncludeTask = IncludeTask;
    }

    /**
     * Get 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true 
     * @return IncludeVirtualTask 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     */
    public Boolean getIncludeVirtualTask() {
        return this.IncludeVirtualTask;
    }

    /**
     * Set 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     * @param IncludeVirtualTask 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     */
    public void setIncludeVirtualTask(Boolean IncludeVirtualTask) {
        this.IncludeVirtualTask = IncludeVirtualTask;
    }

    public DescribeDsFolderTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsFolderTreeRequest(DescribeDsFolderTreeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FirstLevelPull != null) {
            this.FirstLevelPull = new Boolean(source.FirstLevelPull);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IncludeWorkflow != null) {
            this.IncludeWorkflow = new Boolean(source.IncludeWorkflow);
        }
        if (source.IncludeTask != null) {
            this.IncludeTask = new Boolean(source.IncludeTask);
        }
        if (source.IncludeVirtualTask != null) {
            this.IncludeVirtualTask = new Boolean(source.IncludeVirtualTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FirstLevelPull", this.FirstLevelPull);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "IncludeWorkflow", this.IncludeWorkflow);
        this.setParamSimple(map, prefix + "IncludeTask", this.IncludeTask);
        this.setParamSimple(map, prefix + "IncludeVirtualTask", this.IncludeVirtualTask);

    }
}

