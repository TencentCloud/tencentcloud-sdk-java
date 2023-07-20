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

public class MakeUpTasksByWorkflowRequest extends AbstractModel{

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补数据开始时间 格式：2023-03-02 15:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 补数据结束时间 格式：2023-03-03 15:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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
     * Get 补数据开始时间 格式：2023-03-02 15:00:00 
     * @return StartTime 补数据开始时间 格式：2023-03-02 15:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 补数据开始时间 格式：2023-03-02 15:00:00
     * @param StartTime 补数据开始时间 格式：2023-03-02 15:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 补数据结束时间 格式：2023-03-03 15:00:00 
     * @return EndTime 补数据结束时间 格式：2023-03-03 15:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 补数据结束时间 格式：2023-03-03 15:00:00
     * @param EndTime 补数据结束时间 格式：2023-03-03 15:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public MakeUpTasksByWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakeUpTasksByWorkflowRequest(MakeUpTasksByWorkflowRequest source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

