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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProjectsRequest extends AbstractModel{

    /**
    * 项目ID数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 是否删除项目相关的场景。默认为否。
    */
    @SerializedName("DeleteScenarios")
    @Expose
    private Boolean DeleteScenarios;

    /**
    * 是否删除项目相关的任务。默认为否。
    */
    @SerializedName("DeleteJobs")
    @Expose
    private Boolean DeleteJobs;

    /**
     * Get 项目ID数组 
     * @return ProjectIds 项目ID数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组
     * @param ProjectIds 项目ID数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 是否删除项目相关的场景。默认为否。 
     * @return DeleteScenarios 是否删除项目相关的场景。默认为否。
     */
    public Boolean getDeleteScenarios() {
        return this.DeleteScenarios;
    }

    /**
     * Set 是否删除项目相关的场景。默认为否。
     * @param DeleteScenarios 是否删除项目相关的场景。默认为否。
     */
    public void setDeleteScenarios(Boolean DeleteScenarios) {
        this.DeleteScenarios = DeleteScenarios;
    }

    /**
     * Get 是否删除项目相关的任务。默认为否。 
     * @return DeleteJobs 是否删除项目相关的任务。默认为否。
     */
    public Boolean getDeleteJobs() {
        return this.DeleteJobs;
    }

    /**
     * Set 是否删除项目相关的任务。默认为否。
     * @param DeleteJobs 是否删除项目相关的任务。默认为否。
     */
    public void setDeleteJobs(Boolean DeleteJobs) {
        this.DeleteJobs = DeleteJobs;
    }

    public DeleteProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProjectsRequest(DeleteProjectsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.DeleteScenarios != null) {
            this.DeleteScenarios = new Boolean(source.DeleteScenarios);
        }
        if (source.DeleteJobs != null) {
            this.DeleteJobs = new Boolean(source.DeleteJobs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "DeleteScenarios", this.DeleteScenarios);
        this.setParamSimple(map, prefix + "DeleteJobs", this.DeleteJobs);

    }
}

