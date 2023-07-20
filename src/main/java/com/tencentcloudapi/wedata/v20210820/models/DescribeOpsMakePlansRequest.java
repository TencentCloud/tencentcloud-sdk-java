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

public class DescribeOpsMakePlansRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页数，默认值1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，默认值10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 补录计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 补录计划名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 补录任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 补录任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 补录计划创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 补录计划最小创建时间
    */
    @SerializedName("MinCreateTime")
    @Expose
    private String MinCreateTime;

    /**
    * 补录计划最大创建时间
    */
    @SerializedName("MaxCreateTime")
    @Expose
    private String MaxCreateTime;

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
     * Get 分页数，默认值1 
     * @return PageNumber 分页数，默认值1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页数，默认值1
     * @param PageNumber 分页数，默认值1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，默认值10 
     * @return PageSize 分页大小，默认值10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认值10
     * @param PageSize 分页大小，默认值10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 补录计划ID 
     * @return PlanId 补录计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 补录计划ID
     * @param PlanId 补录计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 补录计划名称 
     * @return PlanName 补录计划名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 补录计划名称
     * @param PlanName 补录计划名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 补录任务名称 
     * @return TaskName 补录任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 补录任务名称
     * @param TaskName 补录任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 补录任务ID 
     * @return TaskId 补录任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 补录任务ID
     * @param TaskId 补录任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 补录计划创建者 
     * @return Creator 补录计划创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 补录计划创建者
     * @param Creator 补录计划创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 补录计划最小创建时间 
     * @return MinCreateTime 补录计划最小创建时间
     */
    public String getMinCreateTime() {
        return this.MinCreateTime;
    }

    /**
     * Set 补录计划最小创建时间
     * @param MinCreateTime 补录计划最小创建时间
     */
    public void setMinCreateTime(String MinCreateTime) {
        this.MinCreateTime = MinCreateTime;
    }

    /**
     * Get 补录计划最大创建时间 
     * @return MaxCreateTime 补录计划最大创建时间
     */
    public String getMaxCreateTime() {
        return this.MaxCreateTime;
    }

    /**
     * Set 补录计划最大创建时间
     * @param MaxCreateTime 补录计划最大创建时间
     */
    public void setMaxCreateTime(String MaxCreateTime) {
        this.MaxCreateTime = MaxCreateTime;
    }

    public DescribeOpsMakePlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpsMakePlansRequest(DescribeOpsMakePlansRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.MinCreateTime != null) {
            this.MinCreateTime = new String(source.MinCreateTime);
        }
        if (source.MaxCreateTime != null) {
            this.MaxCreateTime = new String(source.MaxCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "MinCreateTime", this.MinCreateTime);
        this.setParamSimple(map, prefix + "MaxCreateTime", this.MaxCreateTime);

    }
}

