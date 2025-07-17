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

public class ModifyProjectRequest extends AbstractModel {

    /**
    * 目标修改的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * true/false则修改，不带该参数不修改。
    */
    @SerializedName("TaskSubmitApproval")
    @Expose
    private Boolean TaskSubmitApproval;

    /**
    * 资源池信息
    */
    @SerializedName("ResourcePoolInfo")
    @Expose
    private ResourcePoolInfo ResourcePoolInfo;

    /**
    * 项目管理员
    */
    @SerializedName("ProjectManagers")
    @Expose
    private String [] ProjectManagers;

    /**
    * 调度任务严格模式
    */
    @SerializedName("TaskStrictMode")
    @Expose
    private Boolean TaskStrictMode;

    /**
    * 以后新增选项可以直接通过前端的json格式写入去实现
    */
    @SerializedName("ExtraOptions")
    @Expose
    private String ExtraOptions;

    /**
    * 项目类型，SIMPLE：简单模式 STANDARD：标准模式
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 项目负责人
    */
    @SerializedName("ProjectOwner")
    @Expose
    private String [] ProjectOwner;

    /**
     * Get 目标修改的项目ID 
     * @return ProjectId 目标修改的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 目标修改的项目ID
     * @param ProjectId 目标修改的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get true/false则修改，不带该参数不修改。 
     * @return TaskSubmitApproval true/false则修改，不带该参数不修改。
     */
    public Boolean getTaskSubmitApproval() {
        return this.TaskSubmitApproval;
    }

    /**
     * Set true/false则修改，不带该参数不修改。
     * @param TaskSubmitApproval true/false则修改，不带该参数不修改。
     */
    public void setTaskSubmitApproval(Boolean TaskSubmitApproval) {
        this.TaskSubmitApproval = TaskSubmitApproval;
    }

    /**
     * Get 资源池信息 
     * @return ResourcePoolInfo 资源池信息
     */
    public ResourcePoolInfo getResourcePoolInfo() {
        return this.ResourcePoolInfo;
    }

    /**
     * Set 资源池信息
     * @param ResourcePoolInfo 资源池信息
     */
    public void setResourcePoolInfo(ResourcePoolInfo ResourcePoolInfo) {
        this.ResourcePoolInfo = ResourcePoolInfo;
    }

    /**
     * Get 项目管理员 
     * @return ProjectManagers 项目管理员
     */
    public String [] getProjectManagers() {
        return this.ProjectManagers;
    }

    /**
     * Set 项目管理员
     * @param ProjectManagers 项目管理员
     */
    public void setProjectManagers(String [] ProjectManagers) {
        this.ProjectManagers = ProjectManagers;
    }

    /**
     * Get 调度任务严格模式 
     * @return TaskStrictMode 调度任务严格模式
     */
    public Boolean getTaskStrictMode() {
        return this.TaskStrictMode;
    }

    /**
     * Set 调度任务严格模式
     * @param TaskStrictMode 调度任务严格模式
     */
    public void setTaskStrictMode(Boolean TaskStrictMode) {
        this.TaskStrictMode = TaskStrictMode;
    }

    /**
     * Get 以后新增选项可以直接通过前端的json格式写入去实现 
     * @return ExtraOptions 以后新增选项可以直接通过前端的json格式写入去实现
     */
    public String getExtraOptions() {
        return this.ExtraOptions;
    }

    /**
     * Set 以后新增选项可以直接通过前端的json格式写入去实现
     * @param ExtraOptions 以后新增选项可以直接通过前端的json格式写入去实现
     */
    public void setExtraOptions(String ExtraOptions) {
        this.ExtraOptions = ExtraOptions;
    }

    /**
     * Get 项目类型，SIMPLE：简单模式 STANDARD：标准模式 
     * @return Model 项目类型，SIMPLE：简单模式 STANDARD：标准模式
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 项目类型，SIMPLE：简单模式 STANDARD：标准模式
     * @param Model 项目类型，SIMPLE：简单模式 STANDARD：标准模式
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 项目负责人 
     * @return ProjectOwner 项目负责人
     */
    public String [] getProjectOwner() {
        return this.ProjectOwner;
    }

    /**
     * Set 项目负责人
     * @param ProjectOwner 项目负责人
     */
    public void setProjectOwner(String [] ProjectOwner) {
        this.ProjectOwner = ProjectOwner;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskSubmitApproval != null) {
            this.TaskSubmitApproval = new Boolean(source.TaskSubmitApproval);
        }
        if (source.ResourcePoolInfo != null) {
            this.ResourcePoolInfo = new ResourcePoolInfo(source.ResourcePoolInfo);
        }
        if (source.ProjectManagers != null) {
            this.ProjectManagers = new String[source.ProjectManagers.length];
            for (int i = 0; i < source.ProjectManagers.length; i++) {
                this.ProjectManagers[i] = new String(source.ProjectManagers[i]);
            }
        }
        if (source.TaskStrictMode != null) {
            this.TaskStrictMode = new Boolean(source.TaskStrictMode);
        }
        if (source.ExtraOptions != null) {
            this.ExtraOptions = new String(source.ExtraOptions);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.ProjectOwner != null) {
            this.ProjectOwner = new String[source.ProjectOwner.length];
            for (int i = 0; i < source.ProjectOwner.length; i++) {
                this.ProjectOwner[i] = new String(source.ProjectOwner[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskSubmitApproval", this.TaskSubmitApproval);
        this.setParamObj(map, prefix + "ResourcePoolInfo.", this.ResourcePoolInfo);
        this.setParamArraySimple(map, prefix + "ProjectManagers.", this.ProjectManagers);
        this.setParamSimple(map, prefix + "TaskStrictMode", this.TaskStrictMode);
        this.setParamSimple(map, prefix + "ExtraOptions", this.ExtraOptions);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "ProjectOwner.", this.ProjectOwner);

    }
}

