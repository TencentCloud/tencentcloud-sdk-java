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

public class AnalyzeDependentTasksRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据库表信息列表
    */
    @SerializedName("AnalyzeTasks")
    @Expose
    private AnalyzeDependentTask [] AnalyzeTasks;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据库表信息列表 
     * @return AnalyzeTasks 数据库表信息列表
     */
    public AnalyzeDependentTask [] getAnalyzeTasks() {
        return this.AnalyzeTasks;
    }

    /**
     * Set 数据库表信息列表
     * @param AnalyzeTasks 数据库表信息列表
     */
    public void setAnalyzeTasks(AnalyzeDependentTask [] AnalyzeTasks) {
        this.AnalyzeTasks = AnalyzeTasks;
    }

    public AnalyzeDependentTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyzeDependentTasksRequest(AnalyzeDependentTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AnalyzeTasks != null) {
            this.AnalyzeTasks = new AnalyzeDependentTask[source.AnalyzeTasks.length];
            for (int i = 0; i < source.AnalyzeTasks.length; i++) {
                this.AnalyzeTasks[i] = new AnalyzeDependentTask(source.AnalyzeTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "AnalyzeTasks.", this.AnalyzeTasks);

    }
}

