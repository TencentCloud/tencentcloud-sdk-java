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

public class DescribeTaskInstanceRequest extends AbstractModel{

    /**
    * WeData项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务实例数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 任务实例运行时间
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
     * Get WeData项目ID 
     * @return ProjectId WeData项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目ID
     * @param ProjectId WeData项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务实例数据时间 
     * @return CurRunDate 任务实例数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 任务实例数据时间
     * @param CurRunDate 任务实例数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 任务实例运行时间 
     * @return IssueDate 任务实例运行时间
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 任务实例运行时间
     * @param IssueDate 任务实例运行时间
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public DescribeTaskInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInstanceRequest(DescribeTaskInstanceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);

    }
}

