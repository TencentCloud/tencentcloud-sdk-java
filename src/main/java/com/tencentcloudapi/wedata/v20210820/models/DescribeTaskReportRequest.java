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

public class DescribeTaskReportRequest extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 统计周期的开始日期，格式为 yyyy-MM-dd
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 统计周期的结束日期，格式为 yyyy-MM-dd
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * WeData项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 统计周期的开始日期，格式为 yyyy-MM-dd 
     * @return BeginDate 统计周期的开始日期，格式为 yyyy-MM-dd
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 统计周期的开始日期，格式为 yyyy-MM-dd
     * @param BeginDate 统计周期的开始日期，格式为 yyyy-MM-dd
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 统计周期的结束日期，格式为 yyyy-MM-dd 
     * @return EndDate 统计周期的结束日期，格式为 yyyy-MM-dd
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 统计周期的结束日期，格式为 yyyy-MM-dd
     * @param EndDate 统计周期的结束日期，格式为 yyyy-MM-dd
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get WeData项目id 
     * @return ProjectId WeData项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目id
     * @param ProjectId WeData项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeTaskReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskReportRequest(DescribeTaskReportRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

