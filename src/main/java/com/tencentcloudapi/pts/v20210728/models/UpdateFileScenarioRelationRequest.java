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

public class UpdateFileScenarioRelationRequest extends AbstractModel{

    /**
    * 文件 ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 场景 ID 数组
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
     * Get 文件 ID 
     * @return FileId 文件 ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 ID
     * @param FileId 文件 ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 场景 ID 数组 
     * @return ScenarioIds 场景 ID 数组
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set 场景 ID 数组
     * @param ScenarioIds 场景 ID 数组
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    public UpdateFileScenarioRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFileScenarioRelationRequest(UpdateFileScenarioRelationRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);

    }
}

