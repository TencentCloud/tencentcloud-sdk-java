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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProjectRequest extends AbstractModel {

    /**
    * 目标修改的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目显示名称，可以为中文名,需要租户范围内唯一
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 项目负责人id
    */
    @SerializedName("ProjectOwnerUin")
    @Expose
    private String ProjectOwnerUin;

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
     * Get 项目显示名称，可以为中文名,需要租户范围内唯一 
     * @return DisplayName 项目显示名称，可以为中文名,需要租户范围内唯一
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 项目显示名称，可以为中文名,需要租户范围内唯一
     * @param DisplayName 项目显示名称，可以为中文名,需要租户范围内唯一
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
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
     * Get 项目负责人id 
     * @return ProjectOwnerUin 项目负责人id
     */
    public String getProjectOwnerUin() {
        return this.ProjectOwnerUin;
    }

    /**
     * Set 项目负责人id
     * @param ProjectOwnerUin 项目负责人id
     */
    public void setProjectOwnerUin(String ProjectOwnerUin) {
        this.ProjectOwnerUin = ProjectOwnerUin;
    }

    public UpdateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProjectRequest(UpdateProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectOwnerUin != null) {
            this.ProjectOwnerUin = new String(source.ProjectOwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectOwnerUin", this.ProjectOwnerUin);

    }
}

