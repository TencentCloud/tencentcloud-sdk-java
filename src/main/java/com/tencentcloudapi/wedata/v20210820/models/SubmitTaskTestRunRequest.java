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

public class SubmitTaskTestRunRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("TaskIds")
    @Expose
    private String TaskIds;

    /**
    * 无
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 无
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * 无
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 无
    */
    @SerializedName("Tasks")
    @Expose
    private StageCloudApiRequest [] Tasks;

    /**
    * 无
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 无
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * 无
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 无
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get 无 
     * @return TaskIds 无
     */
    public String getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 无
     * @param TaskIds 无
     */
    public void setTaskIds(String TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 无 
     * @return ProjectId 无
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 无
     * @param ProjectId 无
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 无 
     * @return WorkFlowId 无
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 无
     * @param WorkFlowId 无
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get 无 
     * @return Name 无
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 无
     * @param Name 无
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 无 
     * @return Tasks 无
     */
    public StageCloudApiRequest [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 无
     * @param Tasks 无
     */
    public void setTasks(StageCloudApiRequest [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 无 
     * @return Description 无
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 无
     * @param Description 无
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 无 
     * @return RunParams 无
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 无
     * @param RunParams 无
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get 无 
     * @return ScriptContent 无
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 无
     * @param ScriptContent 无
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 无 
     * @return VersionId 无
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 无
     * @param VersionId 无
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
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

    }
}

