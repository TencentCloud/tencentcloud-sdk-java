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

public class QualityRuleGroupExecStrategy extends AbstractModel {

    /**
    * <p>监控类型 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * <p>执行资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * <p>监控任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupName")
    @Expose
    private String RuleGroupName;

    /**
    * <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>数据源id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>监控任务的Id，编辑更新监控任务时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * <p>计算队列，数据源为HIVE、ICEBERG、DLC时必填，数据源为DLC时，该字段填写DLC数据引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecQueue")
    @Expose
    private String ExecQueue;

    /**
    * <p>执行资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * <p>关联的生产调度任务列表，MonitorType=2时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private QualityProdSchedulerTask [] Tasks;

    /**
    * <p>周期开始时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>周期结束时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>调度周期类型，MonitorType=3时必填，具体可填值参考：<br>I：按分钟调度<br>H：按小时调度<br>D：按天调度<br>W：按周调度<br>M：按月调度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>延迟调度时间，MonitorType=3时必填，主要用于调度周期为天/周/月的任务，<br>计量单位为分钟，比如天任务需要延迟到02:00执行，则该字段值为120，表示延迟2小时（120分钟）<br>对于小时/分钟任务，该字段无意义，填固定值0，否则字段校验不通过</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>间隔，MonitorType=3时必填，表示周期任务间隔时间<br>周/月/天任务可选：1<br>分钟任务可选：10，20，30<br>小时任务可选：1，2，3，4，6，8，12</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * <p>时间指定，主要用于调度周期为周/月的任务<br>调度周期为周时：含义为指定周几运行，可选多个，英文逗号隔开<br>可填1,2...7，依次代表周日，周一...周六，例如填“1,2”，表示周日、周一执行；</p><p>调度周期为月时，含义为指定每月的几号运行，可选多个，英文逗号隔开<br>可填1,2,...,31，依次代表1号，2号...31号，例如填“1,2”，表示每月的1号、2号执行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * <p>运行的执行引擎，不传时会请求该数据源下默认的执行引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecEngineType")
    @Expose
    private String ExecEngineType;

    /**
    * <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecPlan")
    @Expose
    private String ExecPlan;

    /**
    * <p>规则id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>触发类型，主要用于“关联生产调度”（MonitorType=2）的监控任务，可选值：<br>CYCLE：周期调度<br>MAKE_UP：补录<br>RERUN：重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerTypes")
    @Expose
    private String [] TriggerTypes;

    /**
    * <p>数据源为DLC时，对应DLC资源组，根据ExecQueue中填的DLC引擎名称，选择对应引擎下的资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcGroupName")
    @Expose
    private String DlcGroupName;

    /**
    * <p>schema名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>时区，默认为UTC+8</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>任务监控参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupConfig")
    @Expose
    private QualityRuleGroupConfig GroupConfig;

    /**
    * <p>引擎参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineParam")
    @Expose
    private String EngineParam;

    /**
    * <p>数据目录名称，不填默认为DataLakeCatalog（更新质量监控时该参数无效）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>执行失败是否阻塞下游</p><p>枚举值：</p><ul><li>0： 失败不阻塞（默认）</li><li>1： 失败阻塞</li></ul><p>默认值：0</p><p>仅作用于“关联生产调度”类型的质量监控</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecFailBlock")
    @Expose
    private Long ExecFailBlock;

    /**
     * Get <p>监控类型 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType <p>监控类型 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType <p>监控类型 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>执行资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId <p>执行资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set <p>执行资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId <p>执行资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get <p>监控任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupName <p>监控任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleGroupName() {
        return this.RuleGroupName;
    }

    /**
     * Set <p>监控任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupName <p>监控任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupName(String RuleGroupName) {
        this.RuleGroupName = RuleGroupName;
    }

    /**
     * Get <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>数据源id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId <p>数据源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set <p>数据源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId <p>数据源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>监控任务的Id，编辑更新监控任务时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId <p>监控任务的Id，编辑更新监控任务时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set <p>监控任务的Id，编辑更新监控任务时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId <p>监控任务的Id，编辑更新监控任务时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get <p>计算队列，数据源为HIVE、ICEBERG、DLC时必填，数据源为DLC时，该字段填写DLC数据引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecQueue <p>计算队列，数据源为HIVE、ICEBERG、DLC时必填，数据源为DLC时，该字段填写DLC数据引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecQueue() {
        return this.ExecQueue;
    }

    /**
     * Set <p>计算队列，数据源为HIVE、ICEBERG、DLC时必填，数据源为DLC时，该字段填写DLC数据引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecQueue <p>计算队列，数据源为HIVE、ICEBERG、DLC时必填，数据源为DLC时，该字段填写DLC数据引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecQueue(String ExecQueue) {
        this.ExecQueue = ExecQueue;
    }

    /**
     * Get <p>执行资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName <p>执行资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set <p>执行资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName <p>执行资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get <p>关联的生产调度任务列表，MonitorType=2时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>关联的生产调度任务列表，MonitorType=2时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityProdSchedulerTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>关联的生产调度任务列表，MonitorType=2时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>关联的生产调度任务列表，MonitorType=2时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(QualityProdSchedulerTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>周期开始时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>周期开始时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>周期开始时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>周期开始时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>周期结束时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>周期结束时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>周期结束时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>周期结束时间，MonitorType=3时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>调度周期类型，MonitorType=3时必填，具体可填值参考：<br>I：按分钟调度<br>H：按小时调度<br>D：按天调度<br>W：按周调度<br>M：按月调度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>调度周期类型，MonitorType=3时必填，具体可填值参考：<br>I：按分钟调度<br>H：按小时调度<br>D：按天调度<br>W：按周调度<br>M：按月调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>调度周期类型，MonitorType=3时必填，具体可填值参考：<br>I：按分钟调度<br>H：按小时调度<br>D：按天调度<br>W：按周调度<br>M：按月调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>调度周期类型，MonitorType=3时必填，具体可填值参考：<br>I：按分钟调度<br>H：按小时调度<br>D：按天调度<br>W：按周调度<br>M：按月调度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>延迟调度时间，MonitorType=3时必填，主要用于调度周期为天/周/月的任务，<br>计量单位为分钟，比如天任务需要延迟到02:00执行，则该字段值为120，表示延迟2小时（120分钟）<br>对于小时/分钟任务，该字段无意义，填固定值0，否则字段校验不通过</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime <p>延迟调度时间，MonitorType=3时必填，主要用于调度周期为天/周/月的任务，<br>计量单位为分钟，比如天任务需要延迟到02:00执行，则该字段值为120，表示延迟2小时（120分钟）<br>对于小时/分钟任务，该字段无意义，填固定值0，否则字段校验不通过</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延迟调度时间，MonitorType=3时必填，主要用于调度周期为天/周/月的任务，<br>计量单位为分钟，比如天任务需要延迟到02:00执行，则该字段值为120，表示延迟2小时（120分钟）<br>对于小时/分钟任务，该字段无意义，填固定值0，否则字段校验不通过</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime <p>延迟调度时间，MonitorType=3时必填，主要用于调度周期为天/周/月的任务，<br>计量单位为分钟，比如天任务需要延迟到02:00执行，则该字段值为120，表示延迟2小时（120分钟）<br>对于小时/分钟任务，该字段无意义，填固定值0，否则字段校验不通过</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>间隔，MonitorType=3时必填，表示周期任务间隔时间<br>周/月/天任务可选：1<br>分钟任务可选：10，20，30<br>小时任务可选：1，2，3，4，6，8，12</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep <p>间隔，MonitorType=3时必填，表示周期任务间隔时间<br>周/月/天任务可选：1<br>分钟任务可选：10，20，30<br>小时任务可选：1，2，3，4，6，8，12</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set <p>间隔，MonitorType=3时必填，表示周期任务间隔时间<br>周/月/天任务可选：1<br>分钟任务可选：10，20，30<br>小时任务可选：1，2，3，4，6，8，12</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep <p>间隔，MonitorType=3时必填，表示周期任务间隔时间<br>周/月/天任务可选：1<br>分钟任务可选：10，20，30<br>小时任务可选：1，2，3，4，6，8，12</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get <p>时间指定，主要用于调度周期为周/月的任务<br>调度周期为周时：含义为指定周几运行，可选多个，英文逗号隔开<br>可填1,2...7，依次代表周日，周一...周六，例如填“1,2”，表示周日、周一执行；</p><p>调度周期为月时，含义为指定每月的几号运行，可选多个，英文逗号隔开<br>可填1,2,...,31，依次代表1号，2号...31号，例如填“1,2”，表示每月的1号、2号执行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction <p>时间指定，主要用于调度周期为周/月的任务<br>调度周期为周时：含义为指定周几运行，可选多个，英文逗号隔开<br>可填1,2...7，依次代表周日，周一...周六，例如填“1,2”，表示周日、周一执行；</p><p>调度周期为月时，含义为指定每月的几号运行，可选多个，英文逗号隔开<br>可填1,2,...,31，依次代表1号，2号...31号，例如填“1,2”，表示每月的1号、2号执行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>时间指定，主要用于调度周期为周/月的任务<br>调度周期为周时：含义为指定周几运行，可选多个，英文逗号隔开<br>可填1,2...7，依次代表周日，周一...周六，例如填“1,2”，表示周日、周一执行；</p><p>调度周期为月时，含义为指定每月的几号运行，可选多个，英文逗号隔开<br>可填1,2,...,31，依次代表1号，2号...31号，例如填“1,2”，表示每月的1号、2号执行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction <p>时间指定，主要用于调度周期为周/月的任务<br>调度周期为周时：含义为指定周几运行，可选多个，英文逗号隔开<br>可填1,2...7，依次代表周日，周一...周六，例如填“1,2”，表示周日、周一执行；</p><p>调度周期为月时，含义为指定每月的几号运行，可选多个，英文逗号隔开<br>可填1,2,...,31，依次代表1号，2号...31号，例如填“1,2”，表示每月的1号、2号执行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get <p>运行的执行引擎，不传时会请求该数据源下默认的执行引擎</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecEngineType <p>运行的执行引擎，不传时会请求该数据源下默认的执行引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecEngineType() {
        return this.ExecEngineType;
    }

    /**
     * Set <p>运行的执行引擎，不传时会请求该数据源下默认的执行引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecEngineType <p>运行的执行引擎，不传时会请求该数据源下默认的执行引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecEngineType(String ExecEngineType) {
        this.ExecEngineType = ExecEngineType;
    }

    /**
     * Get <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecPlan <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecPlan() {
        return this.ExecPlan;
    }

    /**
     * Set <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecPlan <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecPlan(String ExecPlan) {
        this.ExecPlan = ExecPlan;
    }

    /**
     * Get <p>规则id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId <p>规则id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId <p>规则id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>触发类型，主要用于“关联生产调度”（MonitorType=2）的监控任务，可选值：<br>CYCLE：周期调度<br>MAKE_UP：补录<br>RERUN：重跑</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerTypes <p>触发类型，主要用于“关联生产调度”（MonitorType=2）的监控任务，可选值：<br>CYCLE：周期调度<br>MAKE_UP：补录<br>RERUN：重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTriggerTypes() {
        return this.TriggerTypes;
    }

    /**
     * Set <p>触发类型，主要用于“关联生产调度”（MonitorType=2）的监控任务，可选值：<br>CYCLE：周期调度<br>MAKE_UP：补录<br>RERUN：重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerTypes <p>触发类型，主要用于“关联生产调度”（MonitorType=2）的监控任务，可选值：<br>CYCLE：周期调度<br>MAKE_UP：补录<br>RERUN：重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerTypes(String [] TriggerTypes) {
        this.TriggerTypes = TriggerTypes;
    }

    /**
     * Get <p>数据源为DLC时，对应DLC资源组，根据ExecQueue中填的DLC引擎名称，选择对应引擎下的资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcGroupName <p>数据源为DLC时，对应DLC资源组，根据ExecQueue中填的DLC引擎名称，选择对应引擎下的资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcGroupName() {
        return this.DlcGroupName;
    }

    /**
     * Set <p>数据源为DLC时，对应DLC资源组，根据ExecQueue中填的DLC引擎名称，选择对应引擎下的资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcGroupName <p>数据源为DLC时，对应DLC资源组，根据ExecQueue中填的DLC引擎名称，选择对应引擎下的资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcGroupName(String DlcGroupName) {
        this.DlcGroupName = DlcGroupName;
    }

    /**
     * Get <p>schema名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName <p>schema名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName <p>schema名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>时区，默认为UTC+8</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>时区，默认为UTC+8</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>时区，默认为UTC+8</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>时区，默认为UTC+8</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>任务监控参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupConfig <p>任务监控参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleGroupConfig getGroupConfig() {
        return this.GroupConfig;
    }

    /**
     * Set <p>任务监控参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupConfig <p>任务监控参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupConfig(QualityRuleGroupConfig GroupConfig) {
        this.GroupConfig = GroupConfig;
    }

    /**
     * Get <p>引擎参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineParam <p>引擎参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineParam() {
        return this.EngineParam;
    }

    /**
     * Set <p>引擎参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineParam <p>引擎参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineParam(String EngineParam) {
        this.EngineParam = EngineParam;
    }

    /**
     * Get <p>数据目录名称，不填默认为DataLakeCatalog（更新质量监控时该参数无效）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName <p>数据目录名称，不填默认为DataLakeCatalog（更新质量监控时该参数无效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称，不填默认为DataLakeCatalog（更新质量监控时该参数无效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName <p>数据目录名称，不填默认为DataLakeCatalog（更新质量监控时该参数无效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>执行失败是否阻塞下游</p><p>枚举值：</p><ul><li>0： 失败不阻塞（默认）</li><li>1： 失败阻塞</li></ul><p>默认值：0</p><p>仅作用于“关联生产调度”类型的质量监控</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecFailBlock <p>执行失败是否阻塞下游</p><p>枚举值：</p><ul><li>0： 失败不阻塞（默认）</li><li>1： 失败阻塞</li></ul><p>默认值：0</p><p>仅作用于“关联生产调度”类型的质量监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecFailBlock() {
        return this.ExecFailBlock;
    }

    /**
     * Set <p>执行失败是否阻塞下游</p><p>枚举值：</p><ul><li>0： 失败不阻塞（默认）</li><li>1： 失败阻塞</li></ul><p>默认值：0</p><p>仅作用于“关联生产调度”类型的质量监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecFailBlock <p>执行失败是否阻塞下游</p><p>枚举值：</p><ul><li>0： 失败不阻塞（默认）</li><li>1： 失败阻塞</li></ul><p>默认值：0</p><p>仅作用于“关联生产调度”类型的质量监控</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecFailBlock(Long ExecFailBlock) {
        this.ExecFailBlock = ExecFailBlock;
    }

    public QualityRuleGroupExecStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleGroupExecStrategy(QualityRuleGroupExecStrategy source) {
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.RuleGroupName != null) {
            this.RuleGroupName = new String(source.RuleGroupName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.ExecQueue != null) {
            this.ExecQueue = new String(source.ExecQueue);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.Tasks != null) {
            this.Tasks = new QualityProdSchedulerTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new QualityProdSchedulerTask(source.Tasks[i]);
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
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.GroupConfig != null) {
            this.GroupConfig = new QualityRuleGroupConfig(source.GroupConfig);
        }
        if (source.EngineParam != null) {
            this.EngineParam = new String(source.EngineParam);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.ExecFailBlock != null) {
            this.ExecFailBlock = new Long(source.ExecFailBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "RuleGroupName", this.RuleGroupName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "ExecQueue", this.ExecQueue);
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
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamObj(map, prefix + "GroupConfig.", this.GroupConfig);
        this.setParamSimple(map, prefix + "EngineParam", this.EngineParam);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "ExecFailBlock", this.ExecFailBlock);

    }
}

