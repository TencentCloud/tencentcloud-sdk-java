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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFullRespInfo extends AbstractModel {

    /**
    * <p>任务所属Database的名称。</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>任务数据量。</p>
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * <p>任务Id。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>计算耗时，单位： ms</p>
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * <p>任务输出路径。</p>
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * <p>任务创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>任务SQL类型，DDL|DML等</p>
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * <p>任务SQL语句</p>
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * <p>结果是否过期。</p>
    */
    @SerializedName("ResultExpired")
    @Expose
    private Boolean ResultExpired;

    /**
    * <p>数据影响统计信息。</p>
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * <p>任务结果数据表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
    * <p>失败信息, 例如：errorMessage。该字段已废弃。</p>
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * <p>任务执行进度num/100(%)</p>
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * <p>任务执行输出信息。</p>
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * <p>执行SQL的引擎类型</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务进度明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>计算资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * <p>执行sql的子uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>计算资源名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * <p>导入类型是本地导入还是cos</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * <p>导入配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputConf")
    @Expose
    private String InputConf;

    /**
    * <p>数据条数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataNumber")
    @Expose
    private Long DataNumber;

    /**
    * <p>查询数据能不能下载</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanDownload")
    @Expose
    private Boolean CanDownload;

    /**
    * <p>用户别名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * <p>spark应用作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkJobName")
    @Expose
    private String SparkJobName;

    /**
    * <p>spark应用作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkJobId")
    @Expose
    private String SparkJobId;

    /**
    * <p>spark应用入口jar文件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkJobFile")
    @Expose
    private String SparkJobFile;

    /**
    * <p>spark ui url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
    * <p>任务耗时，单位： ms</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * <p>spark app job执行task的程序入口参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * <p>集群镜像大版本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * <p>driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * <p>executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * <p>指定executor数量，最小值为1，最大值小于集群规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorNums")
    @Expose
    private Long ExecutorNums;

    /**
    * <p>指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * <p>任务公共指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonMetrics")
    @Expose
    private CommonMetrics CommonMetrics;

    /**
    * <p>spark任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkMonitorMetrics")
    @Expose
    private SparkMonitorMetrics SparkMonitorMetrics;

    /**
    * <p>presto任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrestoMonitorMetrics")
    @Expose
    private PrestoMonitorMetrics PrestoMonitorMetrics;

    /**
    * <p>结果文件格式：默认为csv</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * <p>引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * <p>spark引擎资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>任务来源信息,如thirdPartyApi,dataExploration, sparkAppTask等</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>子渠道信息，一般由第三方调用定义</p>
    */
    @SerializedName("SourceExtra")
    @Expose
    private String SourceExtra;

    /**
    * <p>创建人uin</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>创建人名字</p>
    */
    @SerializedName("CreatorAlias")
    @Expose
    private String CreatorAlias;

    /**
    * <p>引擎参数</p>
    */
    @SerializedName("CustomizedConf")
    @Expose
    private String CustomizedConf;

    /**
    * <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和<br>示例值：4329</p>
    */
    @SerializedName("TaskTimeSum")
    @Expose
    private Long TaskTimeSum;

    /**
    * <p>引擎执行时间</p>
    */
    @SerializedName("StageStartTime")
    @Expose
    private Long StageStartTime;

    /**
    * <p>数据扫描条数</p>
    */
    @SerializedName("InputRecordsSum")
    @Expose
    private Long InputRecordsSum;

    /**
    * <p>健康状态</p>
    */
    @SerializedName("AnalysisStatusType")
    @Expose
    private Long AnalysisStatusType;

    /**
    * <p>输出总行数</p>
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * <p>输出总大小</p>
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * <p>输出文件个数</p>
    */
    @SerializedName("OutputFilesNum")
    @Expose
    private Long OutputFilesNum;

    /**
    * <p>输出小文件个数</p>
    */
    @SerializedName("OutputSmallFilesNum")
    @Expose
    private Long OutputSmallFilesNum;

    /**
    * <p>数据shuffle行数</p>
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * <p>数据shuffle大小</p>
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * <p>spark作业id</p>
    */
    @SerializedName("SparkAppId")
    @Expose
    private String SparkAppId;

    /**
    * <p>任务大类，DLC2.0中任务区分为两大类，sql任务和作业任务</p>
    */
    @SerializedName("TaskCategory")
    @Expose
    private String TaskCategory;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>引擎类型，用做任务详情页跳转引擎tab</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>引擎是否支持洞察数据采集</p>
    */
    @SerializedName("EngineHasListenerConfig")
    @Expose
    private Boolean EngineHasListenerConfig;

    /**
    * <p>spark引擎资源组id</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>任务计算耗时</p>
    */
    @SerializedName("JobTimeSum")
    @Expose
    private Long JobTimeSum;

    /**
    * <p>任务启动耗时</p>
    */
    @SerializedName("LaunchTime")
    @Expose
    private String LaunchTime;

    /**
    * <p>Gpu Driver 规格</p>
    */
    @SerializedName("GpuDriverSize")
    @Expose
    private Long GpuDriverSize;

    /**
    * <p>Gpu Executor 规格</p>
    */
    @SerializedName("GpuExecutorSize")
    @Expose
    private Long GpuExecutorSize;

    /**
    * <p>ShuffleWrite数据量</p>
    */
    @SerializedName("ShuffleWriteBytesSum")
    @Expose
    private Long ShuffleWriteBytesSum;

    /**
    * <p>活跃core</p>
    */
    @SerializedName("ActiveCore")
    @Expose
    private Long ActiveCore;

    /**
     * Get <p>任务所属Database的名称。</p> 
     * @return DatabaseName <p>任务所属Database的名称。</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>任务所属Database的名称。</p>
     * @param DatabaseName <p>任务所属Database的名称。</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>任务数据量。</p> 
     * @return DataAmount <p>任务数据量。</p>
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set <p>任务数据量。</p>
     * @param DataAmount <p>任务数据量。</p>
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get <p>任务Id。</p> 
     * @return Id <p>任务Id。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>任务Id。</p>
     * @param Id <p>任务Id。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>计算耗时，单位： ms</p> 
     * @return UsedTime <p>计算耗时，单位： ms</p>
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set <p>计算耗时，单位： ms</p>
     * @param UsedTime <p>计算耗时，单位： ms</p>
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get <p>任务输出路径。</p> 
     * @return OutputPath <p>任务输出路径。</p>
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set <p>任务输出路径。</p>
     * @param OutputPath <p>任务输出路径。</p>
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get <p>任务创建时间。</p> 
     * @return CreateTime <p>任务创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间。</p>
     * @param CreateTime <p>任务创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p> 
     * @return State <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     * @param State <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>任务SQL类型，DDL|DML等</p> 
     * @return SQLType <p>任务SQL类型，DDL|DML等</p>
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set <p>任务SQL类型，DDL|DML等</p>
     * @param SQLType <p>任务SQL类型，DDL|DML等</p>
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get <p>任务SQL语句</p> 
     * @return SQL <p>任务SQL语句</p>
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set <p>任务SQL语句</p>
     * @param SQL <p>任务SQL语句</p>
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get <p>结果是否过期。</p> 
     * @return ResultExpired <p>结果是否过期。</p>
     */
    public Boolean getResultExpired() {
        return this.ResultExpired;
    }

    /**
     * Set <p>结果是否过期。</p>
     * @param ResultExpired <p>结果是否过期。</p>
     */
    public void setResultExpired(Boolean ResultExpired) {
        this.ResultExpired = ResultExpired;
    }

    /**
     * Get <p>数据影响统计信息。</p> 
     * @return RowAffectInfo <p>数据影响统计信息。</p>
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set <p>数据影响统计信息。</p>
     * @param RowAffectInfo <p>数据影响统计信息。</p>
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get <p>任务结果数据表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSet <p>任务结果数据表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set <p>任务结果数据表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSet <p>任务结果数据表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get <p>失败信息, 例如：errorMessage。该字段已废弃。</p> 
     * @return Error <p>失败信息, 例如：errorMessage。该字段已废弃。</p>
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set <p>失败信息, 例如：errorMessage。该字段已废弃。</p>
     * @param Error <p>失败信息, 例如：errorMessage。该字段已废弃。</p>
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get <p>任务执行进度num/100(%)</p> 
     * @return Percentage <p>任务执行进度num/100(%)</p>
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set <p>任务执行进度num/100(%)</p>
     * @param Percentage <p>任务执行进度num/100(%)</p>
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get <p>任务执行输出信息。</p> 
     * @return OutputMessage <p>任务执行输出信息。</p>
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set <p>任务执行输出信息。</p>
     * @param OutputMessage <p>任务执行输出信息。</p>
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get <p>执行SQL的引擎类型</p> 
     * @return TaskType <p>执行SQL的引擎类型</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>执行SQL的引擎类型</p>
     * @param TaskType <p>执行SQL的引擎类型</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务进度明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgressDetail <p>任务进度明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set <p>任务进度明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgressDetail <p>任务进度明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>任务结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>计算资源id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineId <p>计算资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set <p>计算资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineId <p>计算资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get <p>执行sql的子uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin <p>执行sql的子uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>执行sql的子uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin <p>执行sql的子uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>计算资源名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineName <p>计算资源名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set <p>计算资源名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineName <p>计算资源名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get <p>导入类型是本地导入还是cos</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputType <p>导入类型是本地导入还是cos</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>导入类型是本地导入还是cos</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputType <p>导入类型是本地导入还是cos</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>导入配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputConf <p>导入配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputConf() {
        return this.InputConf;
    }

    /**
     * Set <p>导入配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputConf <p>导入配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputConf(String InputConf) {
        this.InputConf = InputConf;
    }

    /**
     * Get <p>数据条数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataNumber <p>数据条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataNumber() {
        return this.DataNumber;
    }

    /**
     * Set <p>数据条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataNumber <p>数据条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataNumber(Long DataNumber) {
        this.DataNumber = DataNumber;
    }

    /**
     * Get <p>查询数据能不能下载</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanDownload <p>查询数据能不能下载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Set <p>查询数据能不能下载</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanDownload <p>查询数据能不能下载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanDownload(Boolean CanDownload) {
        this.CanDownload = CanDownload;
    }

    /**
     * Get <p>用户别名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAlias <p>用户别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set <p>用户别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAlias <p>用户别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get <p>spark应用作业名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkJobName <p>spark应用作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkJobName() {
        return this.SparkJobName;
    }

    /**
     * Set <p>spark应用作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkJobName <p>spark应用作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkJobName(String SparkJobName) {
        this.SparkJobName = SparkJobName;
    }

    /**
     * Get <p>spark应用作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkJobId <p>spark应用作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkJobId() {
        return this.SparkJobId;
    }

    /**
     * Set <p>spark应用作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkJobId <p>spark应用作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkJobId(String SparkJobId) {
        this.SparkJobId = SparkJobId;
    }

    /**
     * Get <p>spark应用入口jar文件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkJobFile <p>spark应用入口jar文件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkJobFile() {
        return this.SparkJobFile;
    }

    /**
     * Set <p>spark应用入口jar文件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkJobFile <p>spark应用入口jar文件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkJobFile(String SparkJobFile) {
        this.SparkJobFile = SparkJobFile;
    }

    /**
     * Get <p>spark ui url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UiUrl <p>spark ui url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set <p>spark ui url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UiUrl <p>spark ui url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
    }

    /**
     * Get <p>任务耗时，单位： ms</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTime <p>任务耗时，单位： ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set <p>任务耗时，单位： ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTime <p>任务耗时，单位： ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get <p>spark app job执行task的程序入口参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdArgs <p>spark app job执行task的程序入口参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set <p>spark app job执行task的程序入口参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdArgs <p>spark app job执行task的程序入口参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get <p>集群镜像大版本名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageVersion <p>集群镜像大版本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set <p>集群镜像大版本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageVersion <p>集群镜像大版本名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get <p>driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DriverSize <p>driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set <p>driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DriverSize <p>driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get <p>executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorSize <p>executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set <p>executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorSize <p>executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get <p>指定executor数量，最小值为1，最大值小于集群规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorNums <p>指定executor数量，最小值为1，最大值小于集群规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorNums() {
        return this.ExecutorNums;
    }

    /**
     * Set <p>指定executor数量，最小值为1，最大值小于集群规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorNums <p>指定executor数量，最小值为1，最大值小于集群规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorNums(Long ExecutorNums) {
        this.ExecutorNums = ExecutorNums;
    }

    /**
     * Get <p>指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorMaxNumbers <p>指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set <p>指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorMaxNumbers <p>指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get <p>任务公共指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonMetrics <p>任务公共指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonMetrics getCommonMetrics() {
        return this.CommonMetrics;
    }

    /**
     * Set <p>任务公共指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonMetrics <p>任务公共指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonMetrics(CommonMetrics CommonMetrics) {
        this.CommonMetrics = CommonMetrics;
    }

    /**
     * Get <p>spark任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkMonitorMetrics <p>spark任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparkMonitorMetrics getSparkMonitorMetrics() {
        return this.SparkMonitorMetrics;
    }

    /**
     * Set <p>spark任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkMonitorMetrics <p>spark任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkMonitorMetrics(SparkMonitorMetrics SparkMonitorMetrics) {
        this.SparkMonitorMetrics = SparkMonitorMetrics;
    }

    /**
     * Get <p>presto任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrestoMonitorMetrics <p>presto任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrestoMonitorMetrics getPrestoMonitorMetrics() {
        return this.PrestoMonitorMetrics;
    }

    /**
     * Set <p>presto任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrestoMonitorMetrics <p>presto任务指标数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrestoMonitorMetrics(PrestoMonitorMetrics PrestoMonitorMetrics) {
        this.PrestoMonitorMetrics = PrestoMonitorMetrics;
    }

    /**
     * Get <p>结果文件格式：默认为csv</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultFormat <p>结果文件格式：默认为csv</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>结果文件格式：默认为csv</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultFormat <p>结果文件格式：默认为csv</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get <p>引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineTypeDetail <p>引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set <p>引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineTypeDetail <p>引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get <p>spark引擎资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>spark引擎资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>spark引擎资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>spark引擎资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>任务来源信息,如thirdPartyApi,dataExploration, sparkAppTask等</p> 
     * @return Source <p>任务来源信息,如thirdPartyApi,dataExploration, sparkAppTask等</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>任务来源信息,如thirdPartyApi,dataExploration, sparkAppTask等</p>
     * @param Source <p>任务来源信息,如thirdPartyApi,dataExploration, sparkAppTask等</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>子渠道信息，一般由第三方调用定义</p> 
     * @return SourceExtra <p>子渠道信息，一般由第三方调用定义</p>
     */
    public String getSourceExtra() {
        return this.SourceExtra;
    }

    /**
     * Set <p>子渠道信息，一般由第三方调用定义</p>
     * @param SourceExtra <p>子渠道信息，一般由第三方调用定义</p>
     */
    public void setSourceExtra(String SourceExtra) {
        this.SourceExtra = SourceExtra;
    }

    /**
     * Get <p>创建人uin</p> 
     * @return CreatorUin <p>创建人uin</p>
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建人uin</p>
     * @param CreatorUin <p>创建人uin</p>
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>创建人名字</p> 
     * @return CreatorAlias <p>创建人名字</p>
     */
    public String getCreatorAlias() {
        return this.CreatorAlias;
    }

    /**
     * Set <p>创建人名字</p>
     * @param CreatorAlias <p>创建人名字</p>
     */
    public void setCreatorAlias(String CreatorAlias) {
        this.CreatorAlias = CreatorAlias;
    }

    /**
     * Get <p>引擎参数</p> 
     * @return CustomizedConf <p>引擎参数</p>
     */
    public String getCustomizedConf() {
        return this.CustomizedConf;
    }

    /**
     * Set <p>引擎参数</p>
     * @param CustomizedConf <p>引擎参数</p>
     */
    public void setCustomizedConf(String CustomizedConf) {
        this.CustomizedConf = CustomizedConf;
    }

    /**
     * Get <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和<br>示例值：4329</p> 
     * @return TaskTimeSum <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和<br>示例值：4329</p>
     */
    public Long getTaskTimeSum() {
        return this.TaskTimeSum;
    }

    /**
     * Set <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和<br>示例值：4329</p>
     * @param TaskTimeSum <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和<br>示例值：4329</p>
     */
    public void setTaskTimeSum(Long TaskTimeSum) {
        this.TaskTimeSum = TaskTimeSum;
    }

    /**
     * Get <p>引擎执行时间</p> 
     * @return StageStartTime <p>引擎执行时间</p>
     */
    public Long getStageStartTime() {
        return this.StageStartTime;
    }

    /**
     * Set <p>引擎执行时间</p>
     * @param StageStartTime <p>引擎执行时间</p>
     */
    public void setStageStartTime(Long StageStartTime) {
        this.StageStartTime = StageStartTime;
    }

    /**
     * Get <p>数据扫描条数</p> 
     * @return InputRecordsSum <p>数据扫描条数</p>
     */
    public Long getInputRecordsSum() {
        return this.InputRecordsSum;
    }

    /**
     * Set <p>数据扫描条数</p>
     * @param InputRecordsSum <p>数据扫描条数</p>
     */
    public void setInputRecordsSum(Long InputRecordsSum) {
        this.InputRecordsSum = InputRecordsSum;
    }

    /**
     * Get <p>健康状态</p> 
     * @return AnalysisStatusType <p>健康状态</p>
     */
    public Long getAnalysisStatusType() {
        return this.AnalysisStatusType;
    }

    /**
     * Set <p>健康状态</p>
     * @param AnalysisStatusType <p>健康状态</p>
     */
    public void setAnalysisStatusType(Long AnalysisStatusType) {
        this.AnalysisStatusType = AnalysisStatusType;
    }

    /**
     * Get <p>输出总行数</p> 
     * @return OutputRecordsSum <p>输出总行数</p>
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set <p>输出总行数</p>
     * @param OutputRecordsSum <p>输出总行数</p>
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get <p>输出总大小</p> 
     * @return OutputBytesSum <p>输出总大小</p>
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set <p>输出总大小</p>
     * @param OutputBytesSum <p>输出总大小</p>
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get <p>输出文件个数</p> 
     * @return OutputFilesNum <p>输出文件个数</p>
     */
    public Long getOutputFilesNum() {
        return this.OutputFilesNum;
    }

    /**
     * Set <p>输出文件个数</p>
     * @param OutputFilesNum <p>输出文件个数</p>
     */
    public void setOutputFilesNum(Long OutputFilesNum) {
        this.OutputFilesNum = OutputFilesNum;
    }

    /**
     * Get <p>输出小文件个数</p> 
     * @return OutputSmallFilesNum <p>输出小文件个数</p>
     */
    public Long getOutputSmallFilesNum() {
        return this.OutputSmallFilesNum;
    }

    /**
     * Set <p>输出小文件个数</p>
     * @param OutputSmallFilesNum <p>输出小文件个数</p>
     */
    public void setOutputSmallFilesNum(Long OutputSmallFilesNum) {
        this.OutputSmallFilesNum = OutputSmallFilesNum;
    }

    /**
     * Get <p>数据shuffle行数</p> 
     * @return ShuffleReadRecordsSum <p>数据shuffle行数</p>
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set <p>数据shuffle行数</p>
     * @param ShuffleReadRecordsSum <p>数据shuffle行数</p>
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get <p>数据shuffle大小</p> 
     * @return ShuffleReadBytesSum <p>数据shuffle大小</p>
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set <p>数据shuffle大小</p>
     * @param ShuffleReadBytesSum <p>数据shuffle大小</p>
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get <p>spark作业id</p> 
     * @return SparkAppId <p>spark作业id</p>
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set <p>spark作业id</p>
     * @param SparkAppId <p>spark作业id</p>
     */
    public void setSparkAppId(String SparkAppId) {
        this.SparkAppId = SparkAppId;
    }

    /**
     * Get <p>任务大类，DLC2.0中任务区分为两大类，sql任务和作业任务</p> 
     * @return TaskCategory <p>任务大类，DLC2.0中任务区分为两大类，sql任务和作业任务</p>
     */
    public String getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set <p>任务大类，DLC2.0中任务区分为两大类，sql任务和作业任务</p>
     * @param TaskCategory <p>任务大类，DLC2.0中任务区分为两大类，sql任务和作业任务</p>
     */
    public void setTaskCategory(String TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>引擎类型，用做任务详情页跳转引擎tab</p> 
     * @return EngineType <p>引擎类型，用做任务详情页跳转引擎tab</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>引擎类型，用做任务详情页跳转引擎tab</p>
     * @param EngineType <p>引擎类型，用做任务详情页跳转引擎tab</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>引擎是否支持洞察数据采集</p> 
     * @return EngineHasListenerConfig <p>引擎是否支持洞察数据采集</p>
     */
    public Boolean getEngineHasListenerConfig() {
        return this.EngineHasListenerConfig;
    }

    /**
     * Set <p>引擎是否支持洞察数据采集</p>
     * @param EngineHasListenerConfig <p>引擎是否支持洞察数据采集</p>
     */
    public void setEngineHasListenerConfig(Boolean EngineHasListenerConfig) {
        this.EngineHasListenerConfig = EngineHasListenerConfig;
    }

    /**
     * Get <p>spark引擎资源组id</p> 
     * @return ResourceGroupId <p>spark引擎资源组id</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>spark引擎资源组id</p>
     * @param ResourceGroupId <p>spark引擎资源组id</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>任务计算耗时</p> 
     * @return JobTimeSum <p>任务计算耗时</p>
     */
    public Long getJobTimeSum() {
        return this.JobTimeSum;
    }

    /**
     * Set <p>任务计算耗时</p>
     * @param JobTimeSum <p>任务计算耗时</p>
     */
    public void setJobTimeSum(Long JobTimeSum) {
        this.JobTimeSum = JobTimeSum;
    }

    /**
     * Get <p>任务启动耗时</p> 
     * @return LaunchTime <p>任务启动耗时</p>
     */
    public String getLaunchTime() {
        return this.LaunchTime;
    }

    /**
     * Set <p>任务启动耗时</p>
     * @param LaunchTime <p>任务启动耗时</p>
     */
    public void setLaunchTime(String LaunchTime) {
        this.LaunchTime = LaunchTime;
    }

    /**
     * Get <p>Gpu Driver 规格</p> 
     * @return GpuDriverSize <p>Gpu Driver 规格</p>
     */
    public Long getGpuDriverSize() {
        return this.GpuDriverSize;
    }

    /**
     * Set <p>Gpu Driver 规格</p>
     * @param GpuDriverSize <p>Gpu Driver 规格</p>
     */
    public void setGpuDriverSize(Long GpuDriverSize) {
        this.GpuDriverSize = GpuDriverSize;
    }

    /**
     * Get <p>Gpu Executor 规格</p> 
     * @return GpuExecutorSize <p>Gpu Executor 规格</p>
     */
    public Long getGpuExecutorSize() {
        return this.GpuExecutorSize;
    }

    /**
     * Set <p>Gpu Executor 规格</p>
     * @param GpuExecutorSize <p>Gpu Executor 规格</p>
     */
    public void setGpuExecutorSize(Long GpuExecutorSize) {
        this.GpuExecutorSize = GpuExecutorSize;
    }

    /**
     * Get <p>ShuffleWrite数据量</p> 
     * @return ShuffleWriteBytesSum <p>ShuffleWrite数据量</p>
     */
    public Long getShuffleWriteBytesSum() {
        return this.ShuffleWriteBytesSum;
    }

    /**
     * Set <p>ShuffleWrite数据量</p>
     * @param ShuffleWriteBytesSum <p>ShuffleWrite数据量</p>
     */
    public void setShuffleWriteBytesSum(Long ShuffleWriteBytesSum) {
        this.ShuffleWriteBytesSum = ShuffleWriteBytesSum;
    }

    /**
     * Get <p>活跃core</p> 
     * @return ActiveCore <p>活跃core</p>
     */
    public Long getActiveCore() {
        return this.ActiveCore;
    }

    /**
     * Set <p>活跃core</p>
     * @param ActiveCore <p>活跃core</p>
     */
    public void setActiveCore(Long ActiveCore) {
        this.ActiveCore = ActiveCore;
    }

    public TaskFullRespInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFullRespInfo(TaskFullRespInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.ResultExpired != null) {
            this.ResultExpired = new Boolean(source.ResultExpired);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.DataSet != null) {
            this.DataSet = new String(source.DataSet);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ProgressDetail != null) {
            this.ProgressDetail = new String(source.ProgressDetail);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputConf != null) {
            this.InputConf = new String(source.InputConf);
        }
        if (source.DataNumber != null) {
            this.DataNumber = new Long(source.DataNumber);
        }
        if (source.CanDownload != null) {
            this.CanDownload = new Boolean(source.CanDownload);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.SparkJobName != null) {
            this.SparkJobName = new String(source.SparkJobName);
        }
        if (source.SparkJobId != null) {
            this.SparkJobId = new String(source.SparkJobId);
        }
        if (source.SparkJobFile != null) {
            this.SparkJobFile = new String(source.SparkJobFile);
        }
        if (source.UiUrl != null) {
            this.UiUrl = new String(source.UiUrl);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNums != null) {
            this.ExecutorNums = new Long(source.ExecutorNums);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.CommonMetrics != null) {
            this.CommonMetrics = new CommonMetrics(source.CommonMetrics);
        }
        if (source.SparkMonitorMetrics != null) {
            this.SparkMonitorMetrics = new SparkMonitorMetrics(source.SparkMonitorMetrics);
        }
        if (source.PrestoMonitorMetrics != null) {
            this.PrestoMonitorMetrics = new PrestoMonitorMetrics(source.PrestoMonitorMetrics);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.SourceExtra != null) {
            this.SourceExtra = new String(source.SourceExtra);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreatorAlias != null) {
            this.CreatorAlias = new String(source.CreatorAlias);
        }
        if (source.CustomizedConf != null) {
            this.CustomizedConf = new String(source.CustomizedConf);
        }
        if (source.TaskTimeSum != null) {
            this.TaskTimeSum = new Long(source.TaskTimeSum);
        }
        if (source.StageStartTime != null) {
            this.StageStartTime = new Long(source.StageStartTime);
        }
        if (source.InputRecordsSum != null) {
            this.InputRecordsSum = new Long(source.InputRecordsSum);
        }
        if (source.AnalysisStatusType != null) {
            this.AnalysisStatusType = new Long(source.AnalysisStatusType);
        }
        if (source.OutputRecordsSum != null) {
            this.OutputRecordsSum = new Long(source.OutputRecordsSum);
        }
        if (source.OutputBytesSum != null) {
            this.OutputBytesSum = new Long(source.OutputBytesSum);
        }
        if (source.OutputFilesNum != null) {
            this.OutputFilesNum = new Long(source.OutputFilesNum);
        }
        if (source.OutputSmallFilesNum != null) {
            this.OutputSmallFilesNum = new Long(source.OutputSmallFilesNum);
        }
        if (source.ShuffleReadRecordsSum != null) {
            this.ShuffleReadRecordsSum = new Long(source.ShuffleReadRecordsSum);
        }
        if (source.ShuffleReadBytesSum != null) {
            this.ShuffleReadBytesSum = new Long(source.ShuffleReadBytesSum);
        }
        if (source.SparkAppId != null) {
            this.SparkAppId = new String(source.SparkAppId);
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new String(source.TaskCategory);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.EngineHasListenerConfig != null) {
            this.EngineHasListenerConfig = new Boolean(source.EngineHasListenerConfig);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.JobTimeSum != null) {
            this.JobTimeSum = new Long(source.JobTimeSum);
        }
        if (source.LaunchTime != null) {
            this.LaunchTime = new String(source.LaunchTime);
        }
        if (source.GpuDriverSize != null) {
            this.GpuDriverSize = new Long(source.GpuDriverSize);
        }
        if (source.GpuExecutorSize != null) {
            this.GpuExecutorSize = new Long(source.GpuExecutorSize);
        }
        if (source.ShuffleWriteBytesSum != null) {
            this.ShuffleWriteBytesSum = new Long(source.ShuffleWriteBytesSum);
        }
        if (source.ActiveCore != null) {
            this.ActiveCore = new Long(source.ActiveCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "ResultExpired", this.ResultExpired);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamSimple(map, prefix + "DataSet", this.DataSet);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProgressDetail", this.ProgressDetail);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputConf", this.InputConf);
        this.setParamSimple(map, prefix + "DataNumber", this.DataNumber);
        this.setParamSimple(map, prefix + "CanDownload", this.CanDownload);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamSimple(map, prefix + "SparkJobName", this.SparkJobName);
        this.setParamSimple(map, prefix + "SparkJobId", this.SparkJobId);
        this.setParamSimple(map, prefix + "SparkJobFile", this.SparkJobFile);
        this.setParamSimple(map, prefix + "UiUrl", this.UiUrl);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNums", this.ExecutorNums);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamObj(map, prefix + "CommonMetrics.", this.CommonMetrics);
        this.setParamObj(map, prefix + "SparkMonitorMetrics.", this.SparkMonitorMetrics);
        this.setParamObj(map, prefix + "PrestoMonitorMetrics.", this.PrestoMonitorMetrics);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceExtra", this.SourceExtra);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreatorAlias", this.CreatorAlias);
        this.setParamSimple(map, prefix + "CustomizedConf", this.CustomizedConf);
        this.setParamSimple(map, prefix + "TaskTimeSum", this.TaskTimeSum);
        this.setParamSimple(map, prefix + "StageStartTime", this.StageStartTime);
        this.setParamSimple(map, prefix + "InputRecordsSum", this.InputRecordsSum);
        this.setParamSimple(map, prefix + "AnalysisStatusType", this.AnalysisStatusType);
        this.setParamSimple(map, prefix + "OutputRecordsSum", this.OutputRecordsSum);
        this.setParamSimple(map, prefix + "OutputBytesSum", this.OutputBytesSum);
        this.setParamSimple(map, prefix + "OutputFilesNum", this.OutputFilesNum);
        this.setParamSimple(map, prefix + "OutputSmallFilesNum", this.OutputSmallFilesNum);
        this.setParamSimple(map, prefix + "ShuffleReadRecordsSum", this.ShuffleReadRecordsSum);
        this.setParamSimple(map, prefix + "ShuffleReadBytesSum", this.ShuffleReadBytesSum);
        this.setParamSimple(map, prefix + "SparkAppId", this.SparkAppId);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "EngineHasListenerConfig", this.EngineHasListenerConfig);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "JobTimeSum", this.JobTimeSum);
        this.setParamSimple(map, prefix + "LaunchTime", this.LaunchTime);
        this.setParamSimple(map, prefix + "GpuDriverSize", this.GpuDriverSize);
        this.setParamSimple(map, prefix + "GpuExecutorSize", this.GpuExecutorSize);
        this.setParamSimple(map, prefix + "ShuffleWriteBytesSum", this.ShuffleWriteBytesSum);
        this.setParamSimple(map, prefix + "ActiveCore", this.ActiveCore);

    }
}

