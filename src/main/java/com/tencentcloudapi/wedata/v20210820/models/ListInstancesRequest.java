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

public class ListInstancesRequest extends AbstractModel {

    /**
    * **项目ID**
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **实例计划调度时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ScheduleTimeFrom")
    @Expose
    private String ScheduleTimeFrom;

    /**
    * **实例计划调度时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ScheduleTimeTo")
    @Expose
    private String ScheduleTimeTo;

    /**
    * **页码，整型**
配合pageSize使用且不能小于1， 默认值1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * **每页数目，整型**
配合pageNumber使用且不能大于200, 默认值 10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * **查询结果排序字段**

- SCHEDULE_DATE 表示 根据计划调度时间排序
- START_TIME 表示 根据实例开始执行时间排序
- END_TIME 表示 根据实例结束执行时间排序
- COST_TIME 表示 根据实例执行时长排序
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
    * **实例类型**

- 0 表示补录类型
- 1 表示周期实例
- 2 表示非周期实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * **实例执行状态**
支持过滤多个，条件间为 或 的过滤关系

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
    */
    @SerializedName("InstanceStateList")
    @Expose
    private Long [] InstanceStateList;

    /**
    * **任务类型Id**

- 支持过滤多个，条件间为 或 的过滤关系
- 可以通过接口 DescribeAllTaskType 获取项目支持的全部任务类型
    */
    @SerializedName("TaskTypeIdList")
    @Expose
    private Long [] TaskTypeIdList;

    /**
    * **任务周期类型**
支持过滤多个，条件间为 或 的过滤关系
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
    */
    @SerializedName("TaskCycleList")
    @Expose
    private String [] TaskCycleList;

    /**
    * **任务名称 或 任务ID**
支持模糊搜索过滤, 多个用 英文逗号, 分割
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * **任务负责人**
支持过滤多个，条件间为 或 的过滤关系
    */
    @SerializedName("InChargeList")
    @Expose
    private String [] InChargeList;

    /**
    * **任务所属文件件**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 FindAllFolder 获取项目下的所有文件夹列表
    */
    @SerializedName("TaskFolderIdList")
    @Expose
    private String [] TaskFolderIdList;

    /**
    * **任务所属工作流**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeOpsWorkflows 获取项目下的所有工作流列表
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * **执行资源组Id**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeNormalSchedulerExecutorGroups 获取项目下的所有调度资源组列表
可以通过接口 DescribeNormalIntegrationExecutorGroups 获取项目下的所有集成资源组列表
    */
    @SerializedName("ExecutorGroupIdList")
    @Expose
    private String [] ExecutorGroupIdList;

    /**
    * **实例执行开始时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
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
    * **时区**
timeZone, 默认UTC+8
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

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
     * Get **实例计划调度时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return ScheduleTimeFrom **实例计划调度时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getScheduleTimeFrom() {
        return this.ScheduleTimeFrom;
    }

    /**
     * Set **实例计划调度时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param ScheduleTimeFrom **实例计划调度时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setScheduleTimeFrom(String ScheduleTimeFrom) {
        this.ScheduleTimeFrom = ScheduleTimeFrom;
    }

    /**
     * Get **实例计划调度时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return ScheduleTimeTo **实例计划调度时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getScheduleTimeTo() {
        return this.ScheduleTimeTo;
    }

    /**
     * Set **实例计划调度时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param ScheduleTimeTo **实例计划调度时间过滤条件**
过滤截止时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public void setScheduleTimeTo(String ScheduleTimeTo) {
        this.ScheduleTimeTo = ScheduleTimeTo;
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
     * Get **每页数目，整型**
配合pageNumber使用且不能大于200, 默认值 10 
     * @return PageSize **每页数目，整型**
配合pageNumber使用且不能大于200, 默认值 10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set **每页数目，整型**
配合pageNumber使用且不能大于200, 默认值 10
     * @param PageSize **每页数目，整型**
配合pageNumber使用且不能大于200, 默认值 10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get **查询结果排序字段**

- SCHEDULE_DATE 表示 根据计划调度时间排序
- START_TIME 表示 根据实例开始执行时间排序
- END_TIME 表示 根据实例结束执行时间排序
- COST_TIME 表示 根据实例执行时长排序 
     * @return SortColumn **查询结果排序字段**

- SCHEDULE_DATE 表示 根据计划调度时间排序
- START_TIME 表示 根据实例开始执行时间排序
- END_TIME 表示 根据实例结束执行时间排序
- COST_TIME 表示 根据实例执行时长排序
     */
    public String getSortColumn() {
        return this.SortColumn;
    }

    /**
     * Set **查询结果排序字段**

- SCHEDULE_DATE 表示 根据计划调度时间排序
- START_TIME 表示 根据实例开始执行时间排序
- END_TIME 表示 根据实例结束执行时间排序
- COST_TIME 表示 根据实例执行时长排序
     * @param SortColumn **查询结果排序字段**

- SCHEDULE_DATE 表示 根据计划调度时间排序
- START_TIME 表示 根据实例开始执行时间排序
- END_TIME 表示 根据实例结束执行时间排序
- COST_TIME 表示 根据实例执行时长排序
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
     * Get **实例执行状态**
支持过滤多个，条件间为 或 的过滤关系

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功 
     * @return InstanceStateList **实例执行状态**
支持过滤多个，条件间为 或 的过滤关系

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
     */
    public Long [] getInstanceStateList() {
        return this.InstanceStateList;
    }

    /**
     * Set **实例执行状态**
支持过滤多个，条件间为 或 的过滤关系

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
     * @param InstanceStateList **实例执行状态**
支持过滤多个，条件间为 或 的过滤关系

- [0] 表示 等待事件
- [12] 表示 等待上游
- [6, 7, 9, 10, 18] 表示 等待运行
- [1, 19, 22] 表示 运行中
- [21] 表示 跳过运行
- [3] 表示 失败重试
- [8, 4, 5, 13] 表示 失败
- [2] 表示 成功
     */
    public void setInstanceStateList(Long [] InstanceStateList) {
        this.InstanceStateList = InstanceStateList;
    }

    /**
     * Get **任务类型Id**

- 支持过滤多个，条件间为 或 的过滤关系
- 可以通过接口 DescribeAllTaskType 获取项目支持的全部任务类型 
     * @return TaskTypeIdList **任务类型Id**

- 支持过滤多个，条件间为 或 的过滤关系
- 可以通过接口 DescribeAllTaskType 获取项目支持的全部任务类型
     */
    public Long [] getTaskTypeIdList() {
        return this.TaskTypeIdList;
    }

    /**
     * Set **任务类型Id**

- 支持过滤多个，条件间为 或 的过滤关系
- 可以通过接口 DescribeAllTaskType 获取项目支持的全部任务类型
     * @param TaskTypeIdList **任务类型Id**

- 支持过滤多个，条件间为 或 的过滤关系
- 可以通过接口 DescribeAllTaskType 获取项目支持的全部任务类型
     */
    public void setTaskTypeIdList(Long [] TaskTypeIdList) {
        this.TaskTypeIdList = TaskTypeIdList;
    }

    /**
     * Get **任务周期类型**
支持过滤多个，条件间为 或 的过滤关系
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE 
     * @return TaskCycleList **任务周期类型**
支持过滤多个，条件间为 或 的过滤关系
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     */
    public String [] getTaskCycleList() {
        return this.TaskCycleList;
    }

    /**
     * Set **任务周期类型**
支持过滤多个，条件间为 或 的过滤关系
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     * @param TaskCycleList **任务周期类型**
支持过滤多个，条件间为 或 的过滤关系
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
     */
    public void setTaskCycleList(String [] TaskCycleList) {
        this.TaskCycleList = TaskCycleList;
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
     * Get **任务负责人**
支持过滤多个，条件间为 或 的过滤关系 
     * @return InChargeList **任务负责人**
支持过滤多个，条件间为 或 的过滤关系
     */
    public String [] getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set **任务负责人**
支持过滤多个，条件间为 或 的过滤关系
     * @param InChargeList **任务负责人**
支持过滤多个，条件间为 或 的过滤关系
     */
    public void setInChargeList(String [] InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get **任务所属文件件**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 FindAllFolder 获取项目下的所有文件夹列表 
     * @return TaskFolderIdList **任务所属文件件**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 FindAllFolder 获取项目下的所有文件夹列表
     */
    public String [] getTaskFolderIdList() {
        return this.TaskFolderIdList;
    }

    /**
     * Set **任务所属文件件**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 FindAllFolder 获取项目下的所有文件夹列表
     * @param TaskFolderIdList **任务所属文件件**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 FindAllFolder 获取项目下的所有文件夹列表
     */
    public void setTaskFolderIdList(String [] TaskFolderIdList) {
        this.TaskFolderIdList = TaskFolderIdList;
    }

    /**
     * Get **任务所属工作流**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeOpsWorkflows 获取项目下的所有工作流列表 
     * @return WorkflowIdList **任务所属工作流**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeOpsWorkflows 获取项目下的所有工作流列表
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set **任务所属工作流**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeOpsWorkflows 获取项目下的所有工作流列表
     * @param WorkflowIdList **任务所属工作流**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeOpsWorkflows 获取项目下的所有工作流列表
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get **执行资源组Id**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeNormalSchedulerExecutorGroups 获取项目下的所有调度资源组列表
可以通过接口 DescribeNormalIntegrationExecutorGroups 获取项目下的所有集成资源组列表 
     * @return ExecutorGroupIdList **执行资源组Id**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeNormalSchedulerExecutorGroups 获取项目下的所有调度资源组列表
可以通过接口 DescribeNormalIntegrationExecutorGroups 获取项目下的所有集成资源组列表
     */
    public String [] getExecutorGroupIdList() {
        return this.ExecutorGroupIdList;
    }

    /**
     * Set **执行资源组Id**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeNormalSchedulerExecutorGroups 获取项目下的所有调度资源组列表
可以通过接口 DescribeNormalIntegrationExecutorGroups 获取项目下的所有集成资源组列表
     * @param ExecutorGroupIdList **执行资源组Id**
支持过滤多个，条件间为 或 的过滤关系
可以通过接口 DescribeNormalSchedulerExecutorGroups 获取项目下的所有调度资源组列表
可以通过接口 DescribeNormalIntegrationExecutorGroups 获取项目下的所有集成资源组列表
     */
    public void setExecutorGroupIdList(String [] ExecutorGroupIdList) {
        this.ExecutorGroupIdList = ExecutorGroupIdList;
    }

    /**
     * Get **实例执行开始时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss 
     * @return StartTimeFrom **实例执行开始时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set **实例执行开始时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
     * @param StartTimeFrom **实例执行开始时间过滤条件**
过滤起始时间，时间格式为 yyyy-MM-dd HH:mm:ss
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
     * Get **时区**
timeZone, 默认UTC+8 
     * @return ScheduleTimeZone **时区**
timeZone, 默认UTC+8
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set **时区**
timeZone, 默认UTC+8
     * @param ScheduleTimeZone **时区**
timeZone, 默认UTC+8
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public ListInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListInstancesRequest(ListInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScheduleTimeFrom != null) {
            this.ScheduleTimeFrom = new String(source.ScheduleTimeFrom);
        }
        if (source.ScheduleTimeTo != null) {
            this.ScheduleTimeTo = new String(source.ScheduleTimeTo);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortColumn != null) {
            this.SortColumn = new String(source.SortColumn);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceStateList != null) {
            this.InstanceStateList = new Long[source.InstanceStateList.length];
            for (int i = 0; i < source.InstanceStateList.length; i++) {
                this.InstanceStateList[i] = new Long(source.InstanceStateList[i]);
            }
        }
        if (source.TaskTypeIdList != null) {
            this.TaskTypeIdList = new Long[source.TaskTypeIdList.length];
            for (int i = 0; i < source.TaskTypeIdList.length; i++) {
                this.TaskTypeIdList[i] = new Long(source.TaskTypeIdList[i]);
            }
        }
        if (source.TaskCycleList != null) {
            this.TaskCycleList = new String[source.TaskCycleList.length];
            for (int i = 0; i < source.TaskCycleList.length; i++) {
                this.TaskCycleList[i] = new String(source.TaskCycleList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String[source.InChargeList.length];
            for (int i = 0; i < source.InChargeList.length; i++) {
                this.InChargeList[i] = new String(source.InChargeList[i]);
            }
        }
        if (source.TaskFolderIdList != null) {
            this.TaskFolderIdList = new String[source.TaskFolderIdList.length];
            for (int i = 0; i < source.TaskFolderIdList.length; i++) {
                this.TaskFolderIdList[i] = new String(source.TaskFolderIdList[i]);
            }
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.ExecutorGroupIdList != null) {
            this.ExecutorGroupIdList = new String[source.ExecutorGroupIdList.length];
            for (int i = 0; i < source.ExecutorGroupIdList.length; i++) {
                this.ExecutorGroupIdList[i] = new String(source.ExecutorGroupIdList[i]);
            }
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScheduleTimeFrom", this.ScheduleTimeFrom);
        this.setParamSimple(map, prefix + "ScheduleTimeTo", this.ScheduleTimeTo);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortColumn", this.SortColumn);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "InstanceStateList.", this.InstanceStateList);
        this.setParamArraySimple(map, prefix + "TaskTypeIdList.", this.TaskTypeIdList);
        this.setParamArraySimple(map, prefix + "TaskCycleList.", this.TaskCycleList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "InChargeList.", this.InChargeList);
        this.setParamArraySimple(map, prefix + "TaskFolderIdList.", this.TaskFolderIdList);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "ExecutorGroupIdList.", this.ExecutorGroupIdList);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

