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

public class RuleGroupExecStrategy extends AbstractModel {

    /**
    * 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 计算队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecQueue")
    @Expose
    private String ExecQueue;

    /**
    * 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 执行资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 关联的生产调度任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private ProdSchedulerTask [] Tasks;

    /**
    * 周期开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 周期结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 调度周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 延迟调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 间隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 时间指定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecEngineType")
    @Expose
    private String ExecEngineType;

    /**
    * 执行计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecPlan")
    @Expose
    private String ExecPlan;

    /**
    * 规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 触发类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTypes")
    @Expose
    private String [] TriggerTypes;

    /**
    * DLC资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcGroupName")
    @Expose
    private String DlcGroupName;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupName")
    @Expose
    private String RuleGroupName;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * schema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 任务监控参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupConfig")
    @Expose
    private RuleGroupConfig GroupConfig;

    /**
    * 引擎参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineParam")
    @Expose
    private String EngineParam;

    /**
     * Get 规则组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 计算队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecQueue 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecQueue() {
        return this.ExecQueue;
    }

    /**
     * Set 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecQueue 计算队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecQueue(String ExecQueue) {
        this.ExecQueue = ExecQueue;
    }

    /**
     * Get 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 执行资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName 执行资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 执行资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName 执行资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 关联的生产调度任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 关联的生产调度任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProdSchedulerTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 关联的生产调度任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 关联的生产调度任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(ProdSchedulerTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 周期开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 周期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 周期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 周期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 周期结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 周期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 周期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 周期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 调度周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 调度周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 调度周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 调度周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 延迟调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime 延迟调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime 延迟调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 间隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep 间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 间隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep 间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 时间指定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction 时间指定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 时间指定
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction 时间指定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecEngineType 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecEngineType() {
        return this.ExecEngineType;
    }

    /**
     * Set 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecEngineType 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecEngineType(String ExecEngineType) {
        this.ExecEngineType = ExecEngineType;
    }

    /**
     * Get 执行计划
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecPlan 执行计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecPlan() {
        return this.ExecPlan;
    }

    /**
     * Set 执行计划
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecPlan 执行计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecPlan(String ExecPlan) {
        this.ExecPlan = ExecPlan;
    }

    /**
     * Get 规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 触发类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTypes 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTriggerTypes() {
        return this.TriggerTypes;
    }

    /**
     * Set 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTypes 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTypes(String [] TriggerTypes) {
        this.TriggerTypes = TriggerTypes;
    }

    /**
     * Get DLC资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcGroupName DLC资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcGroupName() {
        return this.DlcGroupName;
    }

    /**
     * Set DLC资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcGroupName DLC资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcGroupName(String DlcGroupName) {
        this.DlcGroupName = DlcGroupName;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupName() {
        return this.RuleGroupName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupName(String RuleGroupName) {
        this.RuleGroupName = RuleGroupName;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get schema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 任务监控参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupConfig 任务监控参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupConfig getGroupConfig() {
        return this.GroupConfig;
    }

    /**
     * Set 任务监控参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupConfig 任务监控参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupConfig(RuleGroupConfig GroupConfig) {
        this.GroupConfig = GroupConfig;
    }

    /**
     * Get 引擎参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineParam 引擎参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineParam() {
        return this.EngineParam;
    }

    /**
     * Set 引擎参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineParam 引擎参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineParam(String EngineParam) {
        this.EngineParam = EngineParam;
    }

    public RuleGroupExecStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupExecStrategy(RuleGroupExecStrategy source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.ExecQueue != null) {
            this.ExecQueue = new String(source.ExecQueue);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.Tasks != null) {
            this.Tasks = new ProdSchedulerTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ProdSchedulerTask(source.Tasks[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.ExecEngineType != null) {
            this.ExecEngineType = new String(source.ExecEngineType);
        }
        if (source.ExecPlan != null) {
            this.ExecPlan = new String(source.ExecPlan);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.TriggerTypes != null) {
            this.TriggerTypes = new String[source.TriggerTypes.length];
            for (int i = 0; i < source.TriggerTypes.length; i++) {
                this.TriggerTypes[i] = new String(source.TriggerTypes[i]);
            }
        }
        if (source.DlcGroupName != null) {
            this.DlcGroupName = new String(source.DlcGroupName);
        }
        if (source.RuleGroupName != null) {
            this.RuleGroupName = new String(source.RuleGroupName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.GroupConfig != null) {
            this.GroupConfig = new RuleGroupConfig(source.GroupConfig);
        }
        if (source.EngineParam != null) {
            this.EngineParam = new String(source.EngineParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "ExecQueue", this.ExecQueue);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "ExecEngineType", this.ExecEngineType);
        this.setParamSimple(map, prefix + "ExecPlan", this.ExecPlan);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "TriggerTypes.", this.TriggerTypes);
        this.setParamSimple(map, prefix + "DlcGroupName", this.DlcGroupName);
        this.setParamSimple(map, prefix + "RuleGroupName", this.RuleGroupName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamObj(map, prefix + "GroupConfig.", this.GroupConfig);
        this.setParamSimple(map, prefix + "EngineParam", this.EngineParam);

    }
}

