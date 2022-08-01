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

public class DeleteScenariosRequest extends AbstractModel{

    /**
    * 场景ID数组
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否删除场景相关的任务。默认为否。
    */
    @SerializedName("DeleteJobs")
    @Expose
    private Boolean DeleteJobs;

    /**
     * Get 场景ID数组 
     * @return ScenarioIds 场景ID数组
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set 场景ID数组
     * @param ScenarioIds 场景ID数组
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否删除场景相关的任务。默认为否。 
     * @return DeleteJobs 是否删除场景相关的任务。默认为否。
     */
    public Boolean getDeleteJobs() {
        return this.DeleteJobs;
    }

    /**
     * Set 是否删除场景相关的任务。默认为否。
     * @param DeleteJobs 是否删除场景相关的任务。默认为否。
     */
    public void setDeleteJobs(Boolean DeleteJobs) {
        this.DeleteJobs = DeleteJobs;
    }

    public DeleteScenariosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScenariosRequest(DeleteScenariosRequest source) {
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteJobs != null) {
            this.DeleteJobs = new Boolean(source.DeleteJobs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteJobs", this.DeleteJobs);

    }
}

