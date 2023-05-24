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

public class ModifyExecStrategyRequest extends AbstractModel{

    /**
    * 规则组ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 计算队列
    */
    @SerializedName("ExecQueue")
    @Expose
    private String ExecQueue;

    /**
    * 执行资源组ID
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 执行资源组名称
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 关联的生产调度任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ProdSchedulerTask [] Tasks;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 离线周期模式下,生效日期-开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 离线周期模式下,生效日期-结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 离线周期模式下,调度周期 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 离线周期模式下,调度步长
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 离线周期模式下,指定时间
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 延时执行时间，单位分钟，可选: <0-1439
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 数据库Id
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据源Id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据表Id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
    */
    @SerializedName("ExecEngineType")
    @Expose
    private String ExecEngineType;

    /**
     * Get 规则组ID 
     * @return RuleGroupId 规则组ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组ID
     * @param RuleGroupId 规则组ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测 
     * @return MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
     * @param MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 计算队列 
     * @return ExecQueue 计算队列
     */
    public String getExecQueue() {
        return this.ExecQueue;
    }

    /**
     * Set 计算队列
     * @param ExecQueue 计算队列
     */
    public void setExecQueue(String ExecQueue) {
        this.ExecQueue = ExecQueue;
    }

    /**
     * Get 执行资源组ID 
     * @return ExecutorGroupId 执行资源组ID
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组ID
     * @param ExecutorGroupId 执行资源组ID
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 执行资源组名称 
     * @return ExecutorGroupName 执行资源组名称
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 执行资源组名称
     * @param ExecutorGroupName 执行资源组名称
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 关联的生产调度任务列表 
     * @return Tasks 关联的生产调度任务列表
     */
    public ProdSchedulerTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 关联的生产调度任务列表
     * @param Tasks 关联的生产调度任务列表
     */
    public void setTasks(ProdSchedulerTask [] Tasks) {
        this.Tasks = Tasks;
    }

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
     * Get 离线周期模式下,生效日期-开始时间 
     * @return StartTime 离线周期模式下,生效日期-开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 离线周期模式下,生效日期-开始时间
     * @param StartTime 离线周期模式下,生效日期-开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 离线周期模式下,生效日期-结束时间 
     * @return EndTime 离线周期模式下,生效日期-结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 离线周期模式下,生效日期-结束时间
     * @param EndTime 离线周期模式下,生效日期-结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 离线周期模式下,调度周期 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M 
     * @return CycleType 离线周期模式下,调度周期 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 离线周期模式下,调度周期 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     * @param CycleType 离线周期模式下,调度周期 
MINUTE_CYCLE:I,
HOUR_CYCLE:H,
DAY_CYCLE:D,
WEEK_CYCLE:W,
MONTH_CYCLE:M
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 离线周期模式下,调度步长 
     * @return CycleStep 离线周期模式下,调度步长
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 离线周期模式下,调度步长
     * @param CycleStep 离线周期模式下,调度步长
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 离线周期模式下,指定时间 
     * @return TaskAction 离线周期模式下,指定时间
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 离线周期模式下,指定时间
     * @param TaskAction 离线周期模式下,指定时间
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 延时执行时间，单位分钟，可选: <0-1439 
     * @return DelayTime 延时执行时间，单位分钟，可选: <0-1439
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延时执行时间，单位分钟，可选: <0-1439
     * @param DelayTime 延时执行时间，单位分钟，可选: <0-1439
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 数据库Id 
     * @return DatabaseId 数据库Id
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库Id
     * @param DatabaseId 数据库Id
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据源Id 
     * @return DatasourceId 数据源Id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
     * @param DatasourceId 数据源Id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据表Id 
     * @return TableId 数据表Id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 数据表Id
     * @param TableId 数据表Id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 运行的执行引擎，不传时会请求该数据源下默认的执行引擎 
     * @return ExecEngineType 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     */
    public String getExecEngineType() {
        return this.ExecEngineType;
    }

    /**
     * Set 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     * @param ExecEngineType 运行的执行引擎，不传时会请求该数据源下默认的执行引擎
     */
    public void setExecEngineType(String ExecEngineType) {
        this.ExecEngineType = ExecEngineType;
    }

    public ModifyExecStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExecStrategyRequest(ModifyExecStrategyRequest source) {
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.ExecEngineType != null) {
            this.ExecEngineType = new String(source.ExecEngineType);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "ExecEngineType", this.ExecEngineType);

    }
}

