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

public class ProjectRequest extends AbstractModel {

    /**
    * 项目标识，英文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目显示名称，可以为中文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 项目模式，SIMPLE（默认）：简单模式 STANDARD：标准模式
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
     * Get 项目标识，英文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符 
     * @return ProjectName 项目标识，英文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目标识，英文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     * @param ProjectName 项目标识，英文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目显示名称，可以为中文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符 
     * @return DisplayName 项目显示名称，可以为中文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 项目显示名称，可以为中文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     * @param DisplayName 项目显示名称，可以为中文名，以字母开头，可包含字母、数字和下划线，不能超过32个字符
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 项目模式，SIMPLE（默认）：简单模式 STANDARD：标准模式 
     * @return ProjectModel 项目模式，SIMPLE（默认）：简单模式 STANDARD：标准模式
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set 项目模式，SIMPLE（默认）：简单模式 STANDARD：标准模式
     * @param ProjectModel 项目模式，SIMPLE（默认）：简单模式 STANDARD：标准模式
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    public ProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectRequest(ProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);

    }
}

