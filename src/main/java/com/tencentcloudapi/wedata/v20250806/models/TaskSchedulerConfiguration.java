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

public class TaskSchedulerConfiguration extends AbstractModel {

    /**
    * 周期类型：支持的类型为

ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 0 2 3 1,L,2 * ?	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 生效日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行时间 左闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间 右闭区间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 日历调度 取值为 0 和 1， 1为打开，0为关闭，默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * 日历调度 日历 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * 日历调度 日历名称, 需要从 DescribeScheduleCalendarPageList 中获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] UpstreamDependencyConfigList;

    /**
    * 下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownstreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] DownstreamDependencyConfigList;

    /**
    * 事件数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListenerList")
    @Expose
    private EventListener [] EventListenerList;

    /**
    * 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * 产出登记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
    * **实例生成策略**
* T_PLUS_0: T+0生成,默认策略
* T_PLUS_1: T+1生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private Long ScheduleRunType;

    /**
    * （废弃，建议使用 DownstreamDependencyConfigList）下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownStreamDependencyConfigList")
    @Expose
    private DependencyTaskBrief [] DownStreamDependencyConfigList;

    /**
    * 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriority")
    @Expose
    private Long RunPriority;

    /**
    * 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
    * 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTTL")
    @Expose
    private Long ExecutionTTL;

    /**
    * 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitExecutionTotalTTL")
    @Expose
    private String WaitExecutionTotalTTL;

    /**
    * 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * - 任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置
- ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败
- ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行
- ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功
- ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行
- ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行
- ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行
- ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行
- ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游
- NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败
- ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行
- NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行
- ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
     * Get 周期类型：支持的类型为

ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 周期类型：支持的类型为

ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型：支持的类型为

ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型：支持的类型为

ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 0 2 3 1,L,2 * ?	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression 0 2 3 1,L,2 * ?	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set 0 2 3 1,L,2 * ?	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression 0 2 3 1,L,2 * ?	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 生效日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行时间 左闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 执行时间 左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间 左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 执行时间 左闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间 右闭区间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 执行时间 右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间 右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 执行时间 右闭区间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 日历调度 取值为 0 和 1， 1为打开，0为关闭，默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarOpen 日历调度 取值为 0 和 1， 1为打开，0为关闭，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set 日历调度 取值为 0 和 1， 1为打开，0为关闭，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarOpen 日历调度 取值为 0 和 1， 1为打开，0为关闭，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get 日历调度 日历 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarId 日历调度 日历 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set 日历调度 日历 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarId 日历调度 日历 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get 日历调度 日历名称, 需要从 DescribeScheduleCalendarPageList 中获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarName 日历调度 日历名称, 需要从 DescribeScheduleCalendarPageList 中获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set 日历调度 日历名称, 需要从 DescribeScheduleCalendarPageList 中获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarName 日历调度 日历名称, 需要从 DescribeScheduleCalendarPageList 中获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamDependencyConfigList 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamDependencyConfigList 上游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamDependencyConfigList(DependencyTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get 下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownstreamDependencyConfigList 下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependencyTaskBrief [] getDownstreamDependencyConfigList() {
        return this.DownstreamDependencyConfigList;
    }

    /**
     * Set 下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownstreamDependencyConfigList 下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownstreamDependencyConfigList(DependencyTaskBrief [] DownstreamDependencyConfigList) {
        this.DownstreamDependencyConfigList = DownstreamDependencyConfigList;
    }

    /**
     * Get 事件数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListenerList 事件数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventListener [] getEventListenerList() {
        return this.EventListenerList;
    }

    /**
     * Set 事件数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListenerList 事件数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListenerList(EventListener [] EventListenerList) {
        this.EventListenerList = EventListenerList;
    }

    /**
     * Get 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowRedoType 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowRedoType 重跑&补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTaskOutList 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTaskOutList 输出参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamTaskInList 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamTaskInList 输入参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get 产出登记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOutputRegistryList 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOutputRegistryList 产出登记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    /**
     * Get **实例生成策略**
* T_PLUS_0: T+0生成,默认策略
* T_PLUS_1: T+1生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitStrategy **实例生成策略**
* T_PLUS_0: T+0生成,默认策略
* T_PLUS_1: T+1生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set **实例生成策略**
* T_PLUS_0: T+0生成,默认策略
* T_PLUS_1: T+1生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitStrategy **实例生成策略**
* T_PLUS_0: T+0生成,默认策略
* T_PLUS_1: T+1生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setScheduleRunType(Long ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
    }

    /**
     * Get （废弃，建议使用 DownstreamDependencyConfigList）下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownStreamDependencyConfigList （废弃，建议使用 DownstreamDependencyConfigList）下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public DependencyTaskBrief [] getDownStreamDependencyConfigList() {
        return this.DownStreamDependencyConfigList;
    }

    /**
     * Set （废弃，建议使用 DownstreamDependencyConfigList）下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownStreamDependencyConfigList （废弃，建议使用 DownstreamDependencyConfigList）下游依赖数组
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDownStreamDependencyConfigList(DependencyTaskBrief [] DownStreamDependencyConfigList) {
        this.DownStreamDependencyConfigList = DownStreamDependencyConfigList;
    }

    /**
     * Get 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunPriority 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getRunPriority() {
        return this.RunPriority;
    }

    /**
     * Set 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunPriority 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRunPriority(Long RunPriority) {
        this.RunPriority = RunPriority;
    }

    /**
     * Get 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryAttempts 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryAttempts 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    /**
     * Get 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTTL 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getExecutionTTL() {
        return this.ExecutionTTL;
    }

    /**
     * Set 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTTL 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setExecutionTTL(Long ExecutionTTL) {
        this.ExecutionTTL = ExecutionTTL;
    }

    /**
     * Get 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitExecutionTotalTTL 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getWaitExecutionTotalTTL() {
        return this.WaitExecutionTotalTTL;
    }

    /**
     * Set 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitExecutionTotalTTL 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setWaitExecutionTotalTTL(String WaitExecutionTotalTTL) {
        this.WaitExecutionTotalTTL = WaitExecutionTotalTTL;
    }

    /**
     * Get 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleType 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleType 调度类型: 0 正常调度 1 空跑调度，默认为 0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunPriorityType 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunPriorityType 任务调度优先级 运行优先级 4高 5中 6低 , 默认:6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWaitMinute 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWaitMinute 重试策略 重试等待时间,单位分钟: 默认: 5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryNumber 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryNumber 重试策略 最大尝试次数, 默认: 4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTTLMinute 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTTLMinute 超时处理策略 运行耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitExecutionTotalTTLMinute 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitExecutionTotalTTLMinute 超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get - 任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置
- ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败
- ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行
- ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功
- ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行
- ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行
- ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行
- ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行
- ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游
- NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败
- ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行
- NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行
- ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTriggerPolicy - 任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置
- ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败
- ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行
- ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功
- ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行
- ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行
- ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行
- ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行
- ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游
- NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败
- ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行
- NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行
- ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set - 任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置
- ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败
- ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行
- ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功
- ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行
- ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行
- ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行
- ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行
- ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游
- NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败
- ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行
- NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行
- ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTriggerPolicy - 任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置
- ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败
- ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行
- ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功
- ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行
- ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行
- ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行
- ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行
- ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游
- NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败
- ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行
- NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行
- ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    public TaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSchedulerConfiguration(TaskSchedulerConfiguration source) {
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.CalendarName != null) {
            this.CalendarName = new String(source.CalendarName);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.UpstreamDependencyConfigList != null) {
            this.UpstreamDependencyConfigList = new DependencyTaskBrief[source.UpstreamDependencyConfigList.length];
            for (int i = 0; i < source.UpstreamDependencyConfigList.length; i++) {
                this.UpstreamDependencyConfigList[i] = new DependencyTaskBrief(source.UpstreamDependencyConfigList[i]);
            }
        }
        if (source.DownstreamDependencyConfigList != null) {
            this.DownstreamDependencyConfigList = new DependencyTaskBrief[source.DownstreamDependencyConfigList.length];
            for (int i = 0; i < source.DownstreamDependencyConfigList.length; i++) {
                this.DownstreamDependencyConfigList[i] = new DependencyTaskBrief(source.DownstreamDependencyConfigList[i]);
            }
        }
        if (source.EventListenerList != null) {
            this.EventListenerList = new EventListener[source.EventListenerList.length];
            for (int i = 0; i < source.EventListenerList.length; i++) {
                this.EventListenerList[i] = new EventListener(source.EventListenerList[i]);
            }
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.ParamTaskOutList != null) {
            this.ParamTaskOutList = new OutTaskParameter[source.ParamTaskOutList.length];
            for (int i = 0; i < source.ParamTaskOutList.length; i++) {
                this.ParamTaskOutList[i] = new OutTaskParameter(source.ParamTaskOutList[i]);
            }
        }
        if (source.ParamTaskInList != null) {
            this.ParamTaskInList = new InTaskParameter[source.ParamTaskInList.length];
            for (int i = 0; i < source.ParamTaskInList.length; i++) {
                this.ParamTaskInList[i] = new InTaskParameter(source.ParamTaskInList[i]);
            }
        }
        if (source.TaskOutputRegistryList != null) {
            this.TaskOutputRegistryList = new TaskDataRegistry[source.TaskOutputRegistryList.length];
            for (int i = 0; i < source.TaskOutputRegistryList.length; i++) {
                this.TaskOutputRegistryList[i] = new TaskDataRegistry(source.TaskOutputRegistryList[i]);
            }
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new Long(source.ScheduleRunType);
        }
        if (source.DownStreamDependencyConfigList != null) {
            this.DownStreamDependencyConfigList = new DependencyTaskBrief[source.DownStreamDependencyConfigList.length];
            for (int i = 0; i < source.DownStreamDependencyConfigList.length; i++) {
                this.DownStreamDependencyConfigList[i] = new DependencyTaskBrief(source.DownStreamDependencyConfigList[i]);
            }
        }
        if (source.RunPriority != null) {
            this.RunPriority = new Long(source.RunPriority);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new Long(source.MaxRetryAttempts);
        }
        if (source.ExecutionTTL != null) {
            this.ExecutionTTL = new Long(source.ExecutionTTL);
        }
        if (source.WaitExecutionTotalTTL != null) {
            this.WaitExecutionTotalTTL = new String(source.WaitExecutionTotalTTL);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.RunPriorityType != null) {
            this.RunPriorityType = new Long(source.RunPriorityType);
        }
        if (source.RetryWaitMinute != null) {
            this.RetryWaitMinute = new Long(source.RetryWaitMinute);
        }
        if (source.MaxRetryNumber != null) {
            this.MaxRetryNumber = new Long(source.MaxRetryNumber);
        }
        if (source.ExecutionTTLMinute != null) {
            this.ExecutionTTLMinute = new Long(source.ExecutionTTLMinute);
        }
        if (source.WaitExecutionTotalTTLMinute != null) {
            this.WaitExecutionTotalTTLMinute = new Long(source.WaitExecutionTotalTTLMinute);
        }
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamArrayObj(map, prefix + "DownstreamDependencyConfigList.", this.DownstreamDependencyConfigList);
        this.setParamArrayObj(map, prefix + "EventListenerList.", this.EventListenerList);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);
        this.setParamArrayObj(map, prefix + "DownStreamDependencyConfigList.", this.DownStreamDependencyConfigList);
        this.setParamSimple(map, prefix + "RunPriority", this.RunPriority);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);
        this.setParamSimple(map, prefix + "ExecutionTTL", this.ExecutionTTL);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTL", this.WaitExecutionTotalTTL);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "RunPriorityType", this.RunPriorityType);
        this.setParamSimple(map, prefix + "RetryWaitMinute", this.RetryWaitMinute);
        this.setParamSimple(map, prefix + "MaxRetryNumber", this.MaxRetryNumber);
        this.setParamSimple(map, prefix + "ExecutionTTLMinute", this.ExecutionTTLMinute);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTLMinute", this.WaitExecutionTotalTTLMinute);
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);

    }
}

