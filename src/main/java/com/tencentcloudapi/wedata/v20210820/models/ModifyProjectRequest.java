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
    * <p>目标修改的项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目显示名称，可以为中文名,需要租户范围内唯一</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>备注</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>true/false则修改，不带该参数不修改。</p>
    */
    @SerializedName("TaskSubmitApproval")
    @Expose
    private Boolean TaskSubmitApproval;

    /**
    * <p>资源池信息</p>
    */
    @SerializedName("ResourcePoolInfo")
    @Expose
    private ResourcePoolInfo ResourcePoolInfo;

    /**
    * <p>项目管理员</p>
    */
    @SerializedName("ProjectManagers")
    @Expose
    private String [] ProjectManagers;

    /**
    * <p>调度任务严格模式</p>
    */
    @SerializedName("TaskStrictMode")
    @Expose
    private Boolean TaskStrictMode;

    /**
    * <p>以后新增选项可以直接通过前端的json格式写入去实现</p>
    */
    @SerializedName("ExtraOptions")
    @Expose
    private String ExtraOptions;

    /**
    * <p>项目类型，SIMPLE：简单模式 STANDARD：标准模式</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>项目负责人</p>
    */
    @SerializedName("ProjectOwner")
    @Expose
    private String [] ProjectOwner;

    /**
    * <p>更新类型</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
     * Get <p>目标修改的项目ID</p> 
     * @return ProjectId <p>目标修改的项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>目标修改的项目ID</p>
     * @param ProjectId <p>目标修改的项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目显示名称，可以为中文名,需要租户范围内唯一</p> 
     * @return DisplayName <p>项目显示名称，可以为中文名,需要租户范围内唯一</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>项目显示名称，可以为中文名,需要租户范围内唯一</p>
     * @param DisplayName <p>项目显示名称，可以为中文名,需要租户范围内唯一</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>备注</p> 
     * @return Description <p>备注</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注</p>
     * @param Description <p>备注</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>true/false则修改，不带该参数不修改。</p> 
     * @return TaskSubmitApproval <p>true/false则修改，不带该参数不修改。</p>
     */
    public Boolean getTaskSubmitApproval() {
        return this.TaskSubmitApproval;
    }

    /**
     * Set <p>true/false则修改，不带该参数不修改。</p>
     * @param TaskSubmitApproval <p>true/false则修改，不带该参数不修改。</p>
     */
    public void setTaskSubmitApproval(Boolean TaskSubmitApproval) {
        this.TaskSubmitApproval = TaskSubmitApproval;
    }

    /**
     * Get <p>资源池信息</p> 
     * @return ResourcePoolInfo <p>资源池信息</p>
     */
    public ResourcePoolInfo getResourcePoolInfo() {
        return this.ResourcePoolInfo;
    }

    /**
     * Set <p>资源池信息</p>
     * @param ResourcePoolInfo <p>资源池信息</p>
     */
    public void setResourcePoolInfo(ResourcePoolInfo ResourcePoolInfo) {
        this.ResourcePoolInfo = ResourcePoolInfo;
    }

    /**
     * Get <p>项目管理员</p> 
     * @return ProjectManagers <p>项目管理员</p>
     */
    public String [] getProjectManagers() {
        return this.ProjectManagers;
    }

    /**
     * Set <p>项目管理员</p>
     * @param ProjectManagers <p>项目管理员</p>
     */
    public void setProjectManagers(String [] ProjectManagers) {
        this.ProjectManagers = ProjectManagers;
    }

    /**
     * Get <p>调度任务严格模式</p> 
     * @return TaskStrictMode <p>调度任务严格模式</p>
     */
    public Boolean getTaskStrictMode() {
        return this.TaskStrictMode;
    }

    /**
     * Set <p>调度任务严格模式</p>
     * @param TaskStrictMode <p>调度任务严格模式</p>
     */
    public void setTaskStrictMode(Boolean TaskStrictMode) {
        this.TaskStrictMode = TaskStrictMode;
    }

    /**
     * Get <p>以后新增选项可以直接通过前端的json格式写入去实现</p> 
     * @return ExtraOptions <p>以后新增选项可以直接通过前端的json格式写入去实现</p>
     */
    public String getExtraOptions() {
        return this.ExtraOptions;
    }

    /**
     * Set <p>以后新增选项可以直接通过前端的json格式写入去实现</p>
     * @param ExtraOptions <p>以后新增选项可以直接通过前端的json格式写入去实现</p>
     */
    public void setExtraOptions(String ExtraOptions) {
        this.ExtraOptions = ExtraOptions;
    }

    /**
     * Get <p>项目类型，SIMPLE：简单模式 STANDARD：标准模式</p> 
     * @return Model <p>项目类型，SIMPLE：简单模式 STANDARD：标准模式</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>项目类型，SIMPLE：简单模式 STANDARD：标准模式</p>
     * @param Model <p>项目类型，SIMPLE：简单模式 STANDARD：标准模式</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>项目负责人</p> 
     * @return ProjectOwner <p>项目负责人</p>
     */
    public String [] getProjectOwner() {
        return this.ProjectOwner;
    }

    /**
     * Set <p>项目负责人</p>
     * @param ProjectOwner <p>项目负责人</p>
     */
    public void setProjectOwner(String [] ProjectOwner) {
        this.ProjectOwner = ProjectOwner;
    }

    /**
     * Get <p>更新类型</p> 
     * @return ModifyType <p>更新类型</p>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>更新类型</p>
     * @param ModifyType <p>更新类型</p>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
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
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaskSubmitApproval", this.TaskSubmitApproval);
        this.setParamObj(map, prefix + "ResourcePoolInfo.", this.ResourcePoolInfo);
        this.setParamArraySimple(map, prefix + "ProjectManagers.", this.ProjectManagers);
        this.setParamSimple(map, prefix + "TaskStrictMode", this.TaskStrictMode);
        this.setParamSimple(map, prefix + "ExtraOptions", this.ExtraOptions);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "ProjectOwner.", this.ProjectOwner);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);

    }
}

