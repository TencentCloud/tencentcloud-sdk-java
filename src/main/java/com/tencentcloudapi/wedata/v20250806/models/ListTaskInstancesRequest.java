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

public class ListTaskInstancesRequest extends AbstractModel {

    /**
    * **项目ID**
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **页码，整型**
配合pageSize使用且不能小于1， 默认值1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * **每页显示的条数，默认为10，最小值为1、最大值为100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * **实例类型** 
- 0 表示补录类型 
- 1 表示周期实例 
- 2 表示非周期实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * **实例状态** - WAIT_EVENT: 等待事件 - WAIT_UPSTREAM: 等待上游 - WAIT_RUN: 等待运行 - RUNNING: 运行中 - SKIP_RUNNING: 跳过运行 - FAILED_RETRY: 失败重试 - EXPIRED: 失败 - COMPLETED: 成功
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * **任务类型Id**
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * **任务周期类型** * ONEOFF_CYCLE: 一次性 * YEAR_CYCLE: 年 * MONTH_CYCLE: 月 * WEEK_CYCLE: 周 * DAY_CYCLE: 天 * HOUR_CYCLE: 小时 * MINUTE_CYCLE: 分钟 * CRONTAB_CYCLE: crontab表达式类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * **任务负责人id**
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * **任务所属文件id**
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * **任务所属工作流id**
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * **执行资源组Id**
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * **实例计划调度时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ScheduleTimeFrom")
    @Expose
    private String ScheduleTimeFrom;

    /**
    * **实例计划调度时间过滤条件**过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ScheduleTimeTo")
    @Expose
    private String ScheduleTimeTo;

    /**
    * **实例执行开始时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTimeFrom")
    @Expose
    private String StartTimeFrom;

    /**
    * **实例执行开始时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTimeTo")
    @Expose
    private String StartTimeTo;

    /**
    * **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("LastUpdateTimeFrom")
    @Expose
    private String LastUpdateTimeFrom;

    /**
    * **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("LastUpdateTimeTo")
    @Expose
    private String LastUpdateTimeTo;

    /**
    * **查询结果排序字段**- SCHEDULE_DATE 表示 根据计划调度时间排序- START_TIME 表示 根据实例开始执行时间排序- END_TIME 表示 根据实例结束执行时间排序- COST_TIME 表示 根据实例执行时长排序
    */
    @SerializedName("SortColumn")
    @Expose
    private String SortColumn;

    /**
    * **实例排序方式**

- ASC 
- DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
     * Get **项目ID** 
     * @return ProjectId **项目ID**
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **项目ID**
     * @param ProjectId **项目ID**
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **页码，整型**
配合pageSize使用且不能小于1， 默认值1 
     * @return PageNumber **页码，整型**
配合pageSize使用且不能小于1， 默认值1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set **页码，整型**
配合pageSize使用且不能小于1， 默认值1
     * @param PageNumber **页码，整型**
配合pageSize使用且不能小于1， 默认值1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get **每页显示的条数，默认为10，最小值为1、最大值为100 
     * @return PageSize **每页显示的条数，默认为10，最小值为1、最大值为100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set **每页显示的条数，默认为10，最小值为1、最大值为100
     * @param PageSize **每页显示的条数，默认为10，最小值为1、最大值为100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割 
     * @return Keyword **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割
     * @param Keyword **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8 
     * @return TimeZone **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     * @param TimeZone **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get **实例类型** 
- 0 表示补录类型 
- 1 表示周期实例 
- 2 表示非周期实例 
     * @return InstanceType **实例类型** 
- 0 表示补录类型 
- 1 表示周期实例 
- 2 表示非周期实例
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set **实例类型** 
- 0 表示补录类型 
- 1 表示周期实例 
- 2 表示非周期实例
     * @param InstanceType **实例类型** 
- 0 表示补录类型 
- 1 表示周期实例 
- 2 表示非周期实例
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get **实例状态** - WAIT_EVENT: 等待事件 - WAIT_UPSTREAM: 等待上游 - WAIT_RUN: 等待运行 - RUNNING: 运行中 - SKIP_RUNNING: 跳过运行 - FAILED_RETRY: 失败重试 - EXPIRED: 失败 - COMPLETED: 成功 
     * @return InstanceState **实例状态** - WAIT_EVENT: 等待事件 - WAIT_UPSTREAM: 等待上游 - WAIT_RUN: 等待运行 - RUNNING: 运行中 - SKIP_RUNNING: 跳过运行 - FAILED_RETRY: 失败重试 - EXPIRED: 失败 - COMPLETED: 成功
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **实例状态** - WAIT_EVENT: 等待事件 - WAIT_UPSTREAM: 等待上游 - WAIT_RUN: 等待运行 - RUNNING: 运行中 - SKIP_RUNNING: 跳过运行 - FAILED_RETRY: 失败重试 - EXPIRED: 失败 - COMPLETED: 成功
     * @param InstanceState **实例状态** - WAIT_EVENT: 等待事件 - WAIT_UPSTREAM: 等待上游 - WAIT_RUN: 等待运行 - RUNNING: 运行中 - SKIP_RUNNING: 跳过运行 - FAILED_RETRY: 失败重试 - EXPIRED: 失败 - COMPLETED: 成功
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get **任务类型Id** 
     * @return TaskTypeId **任务类型Id**
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set **任务类型Id**
     * @param TaskTypeId **任务类型Id**
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get **任务周期类型** * ONEOFF_CYCLE: 一次性 * YEAR_CYCLE: 年 * MONTH_CYCLE: 月 * WEEK_CYCLE: 周 * DAY_CYCLE: 天 * HOUR_CYCLE: 小时 * MINUTE_CYCLE: 分钟 * CRONTAB_CYCLE: crontab表达式类型 
     * @return CycleType **任务周期类型** * ONEOFF_CYCLE: 一次性 * YEAR_CYCLE: 年 * MONTH_CYCLE: 月 * WEEK_CYCLE: 周 * DAY_CYCLE: 天 * HOUR_CYCLE: 小时 * MINUTE_CYCLE: 分钟 * CRONTAB_CYCLE: crontab表达式类型
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set **任务周期类型** * ONEOFF_CYCLE: 一次性 * YEAR_CYCLE: 年 * MONTH_CYCLE: 月 * WEEK_CYCLE: 周 * DAY_CYCLE: 天 * HOUR_CYCLE: 小时 * MINUTE_CYCLE: 分钟 * CRONTAB_CYCLE: crontab表达式类型
     * @param CycleType **任务周期类型** * ONEOFF_CYCLE: 一次性 * YEAR_CYCLE: 年 * MONTH_CYCLE: 月 * WEEK_CYCLE: 周 * DAY_CYCLE: 天 * HOUR_CYCLE: 小时 * MINUTE_CYCLE: 分钟 * CRONTAB_CYCLE: crontab表达式类型
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get **任务负责人id** 
     * @return OwnerUin **任务负责人id**
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set **任务负责人id**
     * @param OwnerUin **任务负责人id**
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get **任务所属文件id** 
     * @return FolderId **任务所属文件id**
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set **任务所属文件id**
     * @param FolderId **任务所属文件id**
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get **任务所属工作流id** 
     * @return WorkflowId **任务所属工作流id**
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set **任务所属工作流id**
     * @param WorkflowId **任务所属工作流id**
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get **执行资源组Id** 
     * @return ExecutorGroupId **执行资源组Id**
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set **执行资源组Id**
     * @param ExecutorGroupId **执行资源组Id**
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get **实例计划调度时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return ScheduleTimeFrom **实例计划调度时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getScheduleTimeFrom() {
        return this.ScheduleTimeFrom;
    }

    /**
     * Set **实例计划调度时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param ScheduleTimeFrom **实例计划调度时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setScheduleTimeFrom(String ScheduleTimeFrom) {
        this.ScheduleTimeFrom = ScheduleTimeFrom;
    }

    /**
     * Get **实例计划调度时间过滤条件**过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return ScheduleTimeTo **实例计划调度时间过滤条件**过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getScheduleTimeTo() {
        return this.ScheduleTimeTo;
    }

    /**
     * Set **实例计划调度时间过滤条件**过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param ScheduleTimeTo **实例计划调度时间过滤条件**过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setScheduleTimeTo(String ScheduleTimeTo) {
        this.ScheduleTimeTo = ScheduleTimeTo;
    }

    /**
     * Get **实例执行开始时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return StartTimeFrom **实例执行开始时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set **实例执行开始时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param StartTimeFrom **实例执行开始时间过滤条件**过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTimeFrom(String StartTimeFrom) {
        this.StartTimeFrom = StartTimeFrom;
    }

    /**
     * Get **实例执行开始时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return StartTimeTo **实例执行开始时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTimeTo() {
        return this.StartTimeTo;
    }

    /**
     * Set **实例执行开始时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param StartTimeTo **实例执行开始时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTimeTo(String StartTimeTo) {
        this.StartTimeTo = StartTimeTo;
    }

    /**
     * Get **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return LastUpdateTimeFrom **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getLastUpdateTimeFrom() {
        return this.LastUpdateTimeFrom;
    }

    /**
     * Set **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param LastUpdateTimeFrom **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setLastUpdateTimeFrom(String LastUpdateTimeFrom) {
        this.LastUpdateTimeFrom = LastUpdateTimeFrom;
    }

    /**
     * Get **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return LastUpdateTimeTo **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getLastUpdateTimeTo() {
        return this.LastUpdateTimeTo;
    }

    /**
     * Set **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param LastUpdateTimeTo **实例最近更新时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setLastUpdateTimeTo(String LastUpdateTimeTo) {
        this.LastUpdateTimeTo = LastUpdateTimeTo;
    }

    /**
     * Get **查询结果排序字段**- SCHEDULE_DATE 表示 根据计划调度时间排序- START_TIME 表示 根据实例开始执行时间排序- END_TIME 表示 根据实例结束执行时间排序- COST_TIME 表示 根据实例执行时长排序 
     * @return SortColumn **查询结果排序字段**- SCHEDULE_DATE 表示 根据计划调度时间排序- START_TIME 表示 根据实例开始执行时间排序- END_TIME 表示 根据实例结束执行时间排序- COST_TIME 表示 根据实例执行时长排序
     */
    public String getSortColumn() {
        return this.SortColumn;
    }

    /**
     * Set **查询结果排序字段**- SCHEDULE_DATE 表示 根据计划调度时间排序- START_TIME 表示 根据实例开始执行时间排序- END_TIME 表示 根据实例结束执行时间排序- COST_TIME 表示 根据实例执行时长排序
     * @param SortColumn **查询结果排序字段**- SCHEDULE_DATE 表示 根据计划调度时间排序- START_TIME 表示 根据实例开始执行时间排序- END_TIME 表示 根据实例结束执行时间排序- COST_TIME 表示 根据实例执行时长排序
     */
    public void setSortColumn(String SortColumn) {
        this.SortColumn = SortColumn;
    }

    /**
     * Get **实例排序方式**

- ASC 
- DESC 
     * @return SortType **实例排序方式**

- ASC 
- DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set **实例排序方式**

- ASC 
- DESC
     * @param SortType **实例排序方式**

- ASC 
- DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public ListTaskInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskInstancesRequest(ListTaskInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ScheduleTimeFrom != null) {
            this.ScheduleTimeFrom = new String(source.ScheduleTimeFrom);
        }
        if (source.ScheduleTimeTo != null) {
            this.ScheduleTimeTo = new String(source.ScheduleTimeTo);
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.LastUpdateTimeFrom != null) {
            this.LastUpdateTimeFrom = new String(source.LastUpdateTimeFrom);
        }
        if (source.LastUpdateTimeTo != null) {
            this.LastUpdateTimeTo = new String(source.LastUpdateTimeTo);
        }
        if (source.SortColumn != null) {
            this.SortColumn = new String(source.SortColumn);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ScheduleTimeFrom", this.ScheduleTimeFrom);
        this.setParamSimple(map, prefix + "ScheduleTimeTo", this.ScheduleTimeTo);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "LastUpdateTimeFrom", this.LastUpdateTimeFrom);
        this.setParamSimple(map, prefix + "LastUpdateTimeTo", this.LastUpdateTimeTo);
        this.setParamSimple(map, prefix + "SortColumn", this.SortColumn);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

