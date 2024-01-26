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

public class DependencyWorkflowDTO extends AbstractModel {

    /**
    * 已选工作流id
    */
    @SerializedName("SelectedWorkflowId")
    @Expose
    private String SelectedWorkflowId;

    /**
    * 已选工作流名称
    */
    @SerializedName("SelectedWorkflowName")
    @Expose
    private String SelectedWorkflowName;

    /**
    * 依赖工作流id
    */
    @SerializedName("DependencyWorkflowId")
    @Expose
    private String DependencyWorkflowId;

    /**
    * 依赖工作流名称
    */
    @SerializedName("DependencyWorkflowName")
    @Expose
    private String DependencyWorkflowName;

    /**
    * 依赖工作流是否跨项目
    */
    @SerializedName("CrossProject")
    @Expose
    private Boolean CrossProject;

    /**
    * 依赖工作流对应项目id
    */
    @SerializedName("DependencyProjectId")
    @Expose
    private String DependencyProjectId;

    /**
    * 依赖工作流对应项目名称
    */
    @SerializedName("DependencyProjectName")
    @Expose
    private String DependencyProjectName;

    /**
     * Get 已选工作流id 
     * @return SelectedWorkflowId 已选工作流id
     */
    public String getSelectedWorkflowId() {
        return this.SelectedWorkflowId;
    }

    /**
     * Set 已选工作流id
     * @param SelectedWorkflowId 已选工作流id
     */
    public void setSelectedWorkflowId(String SelectedWorkflowId) {
        this.SelectedWorkflowId = SelectedWorkflowId;
    }

    /**
     * Get 已选工作流名称 
     * @return SelectedWorkflowName 已选工作流名称
     */
    public String getSelectedWorkflowName() {
        return this.SelectedWorkflowName;
    }

    /**
     * Set 已选工作流名称
     * @param SelectedWorkflowName 已选工作流名称
     */
    public void setSelectedWorkflowName(String SelectedWorkflowName) {
        this.SelectedWorkflowName = SelectedWorkflowName;
    }

    /**
     * Get 依赖工作流id 
     * @return DependencyWorkflowId 依赖工作流id
     */
    public String getDependencyWorkflowId() {
        return this.DependencyWorkflowId;
    }

    /**
     * Set 依赖工作流id
     * @param DependencyWorkflowId 依赖工作流id
     */
    public void setDependencyWorkflowId(String DependencyWorkflowId) {
        this.DependencyWorkflowId = DependencyWorkflowId;
    }

    /**
     * Get 依赖工作流名称 
     * @return DependencyWorkflowName 依赖工作流名称
     */
    public String getDependencyWorkflowName() {
        return this.DependencyWorkflowName;
    }

    /**
     * Set 依赖工作流名称
     * @param DependencyWorkflowName 依赖工作流名称
     */
    public void setDependencyWorkflowName(String DependencyWorkflowName) {
        this.DependencyWorkflowName = DependencyWorkflowName;
    }

    /**
     * Get 依赖工作流是否跨项目 
     * @return CrossProject 依赖工作流是否跨项目
     */
    public Boolean getCrossProject() {
        return this.CrossProject;
    }

    /**
     * Set 依赖工作流是否跨项目
     * @param CrossProject 依赖工作流是否跨项目
     */
    public void setCrossProject(Boolean CrossProject) {
        this.CrossProject = CrossProject;
    }

    /**
     * Get 依赖工作流对应项目id 
     * @return DependencyProjectId 依赖工作流对应项目id
     */
    public String getDependencyProjectId() {
        return this.DependencyProjectId;
    }

    /**
     * Set 依赖工作流对应项目id
     * @param DependencyProjectId 依赖工作流对应项目id
     */
    public void setDependencyProjectId(String DependencyProjectId) {
        this.DependencyProjectId = DependencyProjectId;
    }

    /**
     * Get 依赖工作流对应项目名称 
     * @return DependencyProjectName 依赖工作流对应项目名称
     */
    public String getDependencyProjectName() {
        return this.DependencyProjectName;
    }

    /**
     * Set 依赖工作流对应项目名称
     * @param DependencyProjectName 依赖工作流对应项目名称
     */
    public void setDependencyProjectName(String DependencyProjectName) {
        this.DependencyProjectName = DependencyProjectName;
    }

    public DependencyWorkflowDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyWorkflowDTO(DependencyWorkflowDTO source) {
        if (source.SelectedWorkflowId != null) {
            this.SelectedWorkflowId = new String(source.SelectedWorkflowId);
        }
        if (source.SelectedWorkflowName != null) {
            this.SelectedWorkflowName = new String(source.SelectedWorkflowName);
        }
        if (source.DependencyWorkflowId != null) {
            this.DependencyWorkflowId = new String(source.DependencyWorkflowId);
        }
        if (source.DependencyWorkflowName != null) {
            this.DependencyWorkflowName = new String(source.DependencyWorkflowName);
        }
        if (source.CrossProject != null) {
            this.CrossProject = new Boolean(source.CrossProject);
        }
        if (source.DependencyProjectId != null) {
            this.DependencyProjectId = new String(source.DependencyProjectId);
        }
        if (source.DependencyProjectName != null) {
            this.DependencyProjectName = new String(source.DependencyProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectedWorkflowId", this.SelectedWorkflowId);
        this.setParamSimple(map, prefix + "SelectedWorkflowName", this.SelectedWorkflowName);
        this.setParamSimple(map, prefix + "DependencyWorkflowId", this.DependencyWorkflowId);
        this.setParamSimple(map, prefix + "DependencyWorkflowName", this.DependencyWorkflowName);
        this.setParamSimple(map, prefix + "CrossProject", this.CrossProject);
        this.setParamSimple(map, prefix + "DependencyProjectId", this.DependencyProjectId);
        this.setParamSimple(map, prefix + "DependencyProjectName", this.DependencyProjectName);

    }
}

