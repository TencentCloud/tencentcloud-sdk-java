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

public class SubmitTaskTestRunRequest extends AbstractModel {

    /**
    * taskId列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String TaskIds;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流id
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * 工作流名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作流任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private StageCloudApiRequest [] Tasks;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 运行参数，map的Json形式
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * 脚本内容
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 版本号
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 提交任务测试运行类型
    */
    @SerializedName("SubmitTaskTestRunType")
    @Expose
    private String SubmitTaskTestRunType;

    /**
     * Get taskId列表 
     * @return TaskIds taskId列表
     */
    public String getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set taskId列表
     * @param TaskIds taskId列表
     */
    public void setTaskIds(String TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流id 
     * @return WorkFlowId 工作流id
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 工作流id
     * @param WorkFlowId 工作流id
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get 工作流名称 
     * @return Name 工作流名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作流名称
     * @param Name 工作流名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工作流任务列表 
     * @return Tasks 工作流任务列表
     */
    public StageCloudApiRequest [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 工作流任务列表
     * @param Tasks 工作流任务列表
     */
    public void setTasks(StageCloudApiRequest [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 运行参数，map的Json形式 
     * @return RunParams 运行参数，map的Json形式
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 运行参数，map的Json形式
     * @param RunParams 运行参数，map的Json形式
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get 脚本内容 
     * @return ScriptContent 脚本内容
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
     * @param ScriptContent 脚本内容
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 版本号 
     * @return VersionId 版本号
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本号
     * @param VersionId 版本号
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 提交任务测试运行类型 
     * @return SubmitTaskTestRunType 提交任务测试运行类型
     */
    public String getSubmitTaskTestRunType() {
        return this.SubmitTaskTestRunType;
    }

    /**
     * Set 提交任务测试运行类型
     * @param SubmitTaskTestRunType 提交任务测试运行类型
     */
    public void setSubmitTaskTestRunType(String SubmitTaskTestRunType) {
        this.SubmitTaskTestRunType = SubmitTaskTestRunType;
    }

    public SubmitTaskTestRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskTestRunRequest(SubmitTaskTestRunRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String(source.TaskIds);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tasks != null) {
            this.Tasks = new StageCloudApiRequest[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new StageCloudApiRequest(source.Tasks[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.SubmitTaskTestRunType != null) {
            this.SubmitTaskTestRunType = new String(source.SubmitTaskTestRunType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskIds", this.TaskIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SubmitTaskTestRunType", this.SubmitTaskTestRunType);

    }
}

