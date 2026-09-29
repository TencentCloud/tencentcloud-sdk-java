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

public class GetSQLRunResultRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 查询任务ID，由 RunSQLScript 返回
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 子查询任务运行ID。不传则返回该任务下全部子查询的结果
    */
    @SerializedName("JobExecutionId")
    @Expose
    private String JobExecutionId;

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
     * Get 查询任务ID，由 RunSQLScript 返回 
     * @return JobId 查询任务ID，由 RunSQLScript 返回
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 查询任务ID，由 RunSQLScript 返回
     * @param JobId 查询任务ID，由 RunSQLScript 返回
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 子查询任务运行ID。不传则返回该任务下全部子查询的结果 
     * @return JobExecutionId 子查询任务运行ID。不传则返回该任务下全部子查询的结果
     */
    public String getJobExecutionId() {
        return this.JobExecutionId;
    }

    /**
     * Set 子查询任务运行ID。不传则返回该任务下全部子查询的结果
     * @param JobExecutionId 子查询任务运行ID。不传则返回该任务下全部子查询的结果
     */
    public void setJobExecutionId(String JobExecutionId) {
        this.JobExecutionId = JobExecutionId;
    }

    public GetSQLRunResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSQLRunResultRequest(GetSQLRunResultRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobExecutionId != null) {
            this.JobExecutionId = new String(source.JobExecutionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobExecutionId", this.JobExecutionId);

    }
}

