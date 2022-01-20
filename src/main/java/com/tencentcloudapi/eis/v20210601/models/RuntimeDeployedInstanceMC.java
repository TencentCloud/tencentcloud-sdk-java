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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuntimeDeployedInstanceMC extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 项目名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 应用id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 应用名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 应用实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 应用实例版本
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * 应用实例创建时间
    */
    @SerializedName("InstanceCreatedAt")
    @Expose
    private Long InstanceCreatedAt;

    /**
    * 应用实例部署状态. 0:running, 1:deleting
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 应用实例部署创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 应用实例部署更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * 应用类型：0:NormalApp普通应用 1:TemplateApp模板应用 2:LightApp轻应用 3:MicroConnTemplate微连接模板 4:MicroConnApp微连接应用
    */
    @SerializedName("ProjectType")
    @Expose
    private Long ProjectType;

    /**
     * Get 项目id 
     * @return GroupId 项目id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 项目id
     * @param GroupId 项目id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 项目名称 
     * @return GroupName 项目名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 项目名称
     * @param GroupName 项目名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 应用id 
     * @return ProjectId 应用id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 应用id
     * @param ProjectId 应用id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 应用名称 
     * @return ProjectName 应用名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 应用名称
     * @param ProjectName 应用名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 应用实例id 
     * @return InstanceId 应用实例id
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 应用实例id
     * @param InstanceId 应用实例id
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用实例版本 
     * @return InstanceVersion 应用实例版本
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 应用实例版本
     * @param InstanceVersion 应用实例版本
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 应用实例创建时间 
     * @return InstanceCreatedAt 应用实例创建时间
     */
    public Long getInstanceCreatedAt() {
        return this.InstanceCreatedAt;
    }

    /**
     * Set 应用实例创建时间
     * @param InstanceCreatedAt 应用实例创建时间
     */
    public void setInstanceCreatedAt(Long InstanceCreatedAt) {
        this.InstanceCreatedAt = InstanceCreatedAt;
    }

    /**
     * Get 应用实例部署状态. 0:running, 1:deleting 
     * @return Status 应用实例部署状态. 0:running, 1:deleting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 应用实例部署状态. 0:running, 1:deleting
     * @param Status 应用实例部署状态. 0:running, 1:deleting
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 应用实例部署创建时间 
     * @return CreatedAt 应用实例部署创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 应用实例部署创建时间
     * @param CreatedAt 应用实例部署创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 应用实例部署更新时间 
     * @return UpdatedAt 应用实例部署更新时间
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 应用实例部署更新时间
     * @param UpdatedAt 应用实例部署更新时间
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 应用类型：0:NormalApp普通应用 1:TemplateApp模板应用 2:LightApp轻应用 3:MicroConnTemplate微连接模板 4:MicroConnApp微连接应用 
     * @return ProjectType 应用类型：0:NormalApp普通应用 1:TemplateApp模板应用 2:LightApp轻应用 3:MicroConnTemplate微连接模板 4:MicroConnApp微连接应用
     */
    public Long getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 应用类型：0:NormalApp普通应用 1:TemplateApp模板应用 2:LightApp轻应用 3:MicroConnTemplate微连接模板 4:MicroConnApp微连接应用
     * @param ProjectType 应用类型：0:NormalApp普通应用 1:TemplateApp模板应用 2:LightApp轻应用 3:MicroConnTemplate微连接模板 4:MicroConnApp微连接应用
     */
    public void setProjectType(Long ProjectType) {
        this.ProjectType = ProjectType;
    }

    public RuntimeDeployedInstanceMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeDeployedInstanceMC(RuntimeDeployedInstanceMC source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.InstanceCreatedAt != null) {
            this.InstanceCreatedAt = new Long(source.InstanceCreatedAt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.ProjectType != null) {
            this.ProjectType = new Long(source.ProjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "InstanceCreatedAt", this.InstanceCreatedAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);

    }
}

