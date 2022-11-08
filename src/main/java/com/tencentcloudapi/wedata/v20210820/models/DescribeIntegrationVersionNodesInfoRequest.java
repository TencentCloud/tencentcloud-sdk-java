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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationVersionNodesInfoRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * task version path
    */
    @SerializedName("TaskVersionPath")
    @Expose
    private String TaskVersionPath;

    /**
    * task version
    */
    @SerializedName("TaskVersion")
    @Expose
    private String TaskVersion;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

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
     * Get task version path 
     * @return TaskVersionPath task version path
     */
    public String getTaskVersionPath() {
        return this.TaskVersionPath;
    }

    /**
     * Set task version path
     * @param TaskVersionPath task version path
     */
    public void setTaskVersionPath(String TaskVersionPath) {
        this.TaskVersionPath = TaskVersionPath;
    }

    /**
     * Get task version 
     * @return TaskVersion task version
     */
    public String getTaskVersion() {
        return this.TaskVersion;
    }

    /**
     * Set task version
     * @param TaskVersion task version
     */
    public void setTaskVersion(String TaskVersion) {
        this.TaskVersion = TaskVersion;
    }

    public DescribeIntegrationVersionNodesInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationVersionNodesInfoRequest(DescribeIntegrationVersionNodesInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskVersionPath != null) {
            this.TaskVersionPath = new String(source.TaskVersionPath);
        }
        if (source.TaskVersion != null) {
            this.TaskVersion = new String(source.TaskVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskVersionPath", this.TaskVersionPath);
        this.setParamSimple(map, prefix + "TaskVersion", this.TaskVersion);

    }
}

