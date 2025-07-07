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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulerRunTimeInstanceCntByStatusRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 周期类型
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 时间单元 eg: 12h
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 开始日期：2023-03-02
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日前：2023-03-20
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 责任人
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 排序字段
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * 升序降序
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 项目ID列表，如果传了 ProjectIds，则 ProjectId 不会生效，用于多项目筛选
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

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
     * Get 周期类型 
     * @return CycleUnit 周期类型
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期类型
     * @param CycleUnit 周期类型
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 时间单元 eg: 12h 
     * @return TimeUnit 时间单元 eg: 12h
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单元 eg: 12h
     * @param TimeUnit 时间单元 eg: 12h
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 开始日期：2023-03-02 
     * @return StartTime 开始日期：2023-03-02
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期：2023-03-02
     * @param StartTime 开始日期：2023-03-02
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日前：2023-03-20 
     * @return EndTime 结束日前：2023-03-20
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日前：2023-03-20
     * @param EndTime 结束日前：2023-03-20
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 责任人 
     * @return InCharge 责任人
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
     * @param InCharge 责任人
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 排序字段 
     * @return SortItem 排序字段
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序字段
     * @param SortItem 排序字段
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get 升序降序 
     * @return SortType 升序降序
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 升序降序
     * @param SortType 升序降序
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 项目ID列表，如果传了 ProjectIds，则 ProjectId 不会生效，用于多项目筛选 
     * @return ProjectIds 项目ID列表，如果传了 ProjectIds，则 ProjectId 不会生效，用于多项目筛选
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID列表，如果传了 ProjectIds，则 ProjectId 不会生效，用于多项目筛选
     * @param ProjectIds 项目ID列表，如果传了 ProjectIds，则 ProjectId 不会生效，用于多项目筛选
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeSchedulerRunTimeInstanceCntByStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusRequest(DescribeSchedulerRunTimeInstanceCntByStatusRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

