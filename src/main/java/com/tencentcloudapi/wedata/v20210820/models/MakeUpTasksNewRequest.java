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

public class MakeUpTasksNewRequest extends AbstractModel{

    /**
    * 补录的当前任务的taskId数组
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 补录开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 补录结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 补录选项标识，1表示当前任务；2表示当前及下游任务；3表示下游任务
    */
    @SerializedName("MakeUpType")
    @Expose
    private Long MakeUpType;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * true: 检查父任务实例状态；false: 不检查父任务实例状态
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
     * Get 补录的当前任务的taskId数组 
     * @return TaskIdList 补录的当前任务的taskId数组
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 补录的当前任务的taskId数组
     * @param TaskIdList 补录的当前任务的taskId数组
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 补录开始时间 
     * @return StartTime 补录开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 补录开始时间
     * @param StartTime 补录开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 补录结束时间 
     * @return EndTime 补录结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 补录结束时间
     * @param EndTime 补录结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 补录选项标识，1表示当前任务；2表示当前及下游任务；3表示下游任务 
     * @return MakeUpType 补录选项标识，1表示当前任务；2表示当前及下游任务；3表示下游任务
     */
    public Long getMakeUpType() {
        return this.MakeUpType;
    }

    /**
     * Set 补录选项标识，1表示当前任务；2表示当前及下游任务；3表示下游任务
     * @param MakeUpType 补录选项标识，1表示当前任务；2表示当前及下游任务；3表示下游任务
     */
    public void setMakeUpType(Long MakeUpType) {
        this.MakeUpType = MakeUpType;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get true: 检查父任务实例状态；false: 不检查父任务实例状态 
     * @return CheckParent true: 检查父任务实例状态；false: 不检查父任务实例状态
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set true: 检查父任务实例状态；false: 不检查父任务实例状态
     * @param CheckParent true: 检查父任务实例状态；false: 不检查父任务实例状态
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    public MakeUpTasksNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakeUpTasksNewRequest(MakeUpTasksNewRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MakeUpType != null) {
            this.MakeUpType = new Long(source.MakeUpType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CheckParent != null) {
            this.CheckParent = new Boolean(source.CheckParent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MakeUpType", this.MakeUpType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CheckParent", this.CheckParent);

    }
}

