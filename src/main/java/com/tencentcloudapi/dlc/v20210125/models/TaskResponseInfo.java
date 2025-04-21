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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResponseInfo extends AbstractModel {

    /**
    * 任务所属Database的名称。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 任务数据量。
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * 任务Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 计算耗时，单位： ms
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * 任务输出路径。
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 任务SQL类型，DDL|DML等
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * 任务SQL语句
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * 结果是否过期。
    */
    @SerializedName("ResultExpired")
    @Expose
    private Boolean ResultExpired;

    /**
    * 数据影响统计信息。
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * 任务结果数据表。
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
    * 失败信息, 例如：errorMessage。该字段已废弃。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * 任务执行进度num/100(%)
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * 任务执行输出信息。
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * 执行SQL的引擎类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务进度明细
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * 任务结束时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 计算资源id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 执行sql的子uin
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 计算资源名字
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 导入类型是本地导入还是cos
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 导入配置
    */
    @SerializedName("InputConf")
    @Expose
    private String InputConf;

    /**
    * 数据条数
    */
    @SerializedName("DataNumber")
    @Expose
    private Long DataNumber;

    /**
    * 查询数据能不能下载
    */
    @SerializedName("CanDownload")
    @Expose
    private Boolean CanDownload;

    /**
    * 用户别名
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * spark应用作业名
    */
    @SerializedName("SparkJobName")
    @Expose
    private String SparkJobName;

    /**
    * spark应用作业Id
    */
    @SerializedName("SparkJobId")
    @Expose
    private String SparkJobId;

    /**
    * spark应用入口jar文件
    */
    @SerializedName("SparkJobFile")
    @Expose
    private String SparkJobFile;

    /**
    * spark ui url
    */
    @SerializedName("UiUrl")
    @Expose
    private String UiUrl;

    /**
    * 任务耗时，单位： ms
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * spark app job执行task的程序入口参数
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * 集群镜像大版本名称
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定executor数量，最小值为1，最大值小于集群规格
    */
    @SerializedName("ExecutorNums")
    @Expose
    private Long ExecutorNums;

    /**
    * 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * 任务公共指标数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonMetrics")
    @Expose
    private CommonMetrics CommonMetrics;

    /**
    * spark任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkMonitorMetrics")
    @Expose
    private SparkMonitorMetrics SparkMonitorMetrics;

    /**
    * presto任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrestoMonitorMetrics")
    @Expose
    private PrestoMonitorMetrics PrestoMonitorMetrics;

    /**
    * 结果文件格式：默认为csv
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * 引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * spark引擎资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get 任务所属Database的名称。 
     * @return DatabaseName 任务所属Database的名称。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 任务所属Database的名称。
     * @param DatabaseName 任务所属Database的名称。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 任务数据量。 
     * @return DataAmount 任务数据量。
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set 任务数据量。
     * @param DataAmount 任务数据量。
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get 任务Id。 
     * @return Id 任务Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务Id。
     * @param Id 任务Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 计算耗时，单位： ms 
     * @return UsedTime 计算耗时，单位： ms
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 计算耗时，单位： ms
     * @param UsedTime 计算耗时，单位： ms
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 任务输出路径。 
     * @return OutputPath 任务输出路径。
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 任务输出路径。
     * @param OutputPath 任务输出路径。
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。 
     * @return State 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     * @param State 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 任务SQL类型，DDL|DML等 
     * @return SQLType 任务SQL类型，DDL|DML等
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set 任务SQL类型，DDL|DML等
     * @param SQLType 任务SQL类型，DDL|DML等
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get 任务SQL语句 
     * @return SQL 任务SQL语句
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set 任务SQL语句
     * @param SQL 任务SQL语句
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get 结果是否过期。 
     * @return ResultExpired 结果是否过期。
     */
    public Boolean getResultExpired() {
        return this.ResultExpired;
    }

    /**
     * Set 结果是否过期。
     * @param ResultExpired 结果是否过期。
     */
    public void setResultExpired(Boolean ResultExpired) {
        this.ResultExpired = ResultExpired;
    }

    /**
     * Get 数据影响统计信息。 
     * @return RowAffectInfo 数据影响统计信息。
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set 数据影响统计信息。
     * @param RowAffectInfo 数据影响统计信息。
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get 任务结果数据表。 
     * @return DataSet 任务结果数据表。
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 任务结果数据表。
     * @param DataSet 任务结果数据表。
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get 失败信息, 例如：errorMessage。该字段已废弃。 
     * @return Error 失败信息, 例如：errorMessage。该字段已废弃。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 失败信息, 例如：errorMessage。该字段已废弃。
     * @param Error 失败信息, 例如：errorMessage。该字段已废弃。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get 任务执行进度num/100(%) 
     * @return Percentage 任务执行进度num/100(%)
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 任务执行进度num/100(%)
     * @param Percentage 任务执行进度num/100(%)
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 任务执行输出信息。 
     * @return OutputMessage 任务执行输出信息。
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set 任务执行输出信息。
     * @param OutputMessage 任务执行输出信息。
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get 执行SQL的引擎类型 
     * @return TaskType 执行SQL的引擎类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 执行SQL的引擎类型
     * @param TaskType 执行SQL的引擎类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务进度明细 
     * @return ProgressDetail 任务进度明细
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set 任务进度明细
     * @param ProgressDetail 任务进度明细
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get 任务结束时间 
     * @return UpdateTime 任务结束时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务结束时间
     * @param UpdateTime 任务结束时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 计算资源id 
     * @return DataEngineId 计算资源id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 计算资源id
     * @param DataEngineId 计算资源id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 执行sql的子uin 
     * @return OperateUin 执行sql的子uin
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 执行sql的子uin
     * @param OperateUin 执行sql的子uin
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 计算资源名字 
     * @return DataEngineName 计算资源名字
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 计算资源名字
     * @param DataEngineName 计算资源名字
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 导入类型是本地导入还是cos 
     * @return InputType 导入类型是本地导入还是cos
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 导入类型是本地导入还是cos
     * @param InputType 导入类型是本地导入还是cos
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 导入配置 
     * @return InputConf 导入配置
     */
    public String getInputConf() {
        return this.InputConf;
    }

    /**
     * Set 导入配置
     * @param InputConf 导入配置
     */
    public void setInputConf(String InputConf) {
        this.InputConf = InputConf;
    }

    /**
     * Get 数据条数 
     * @return DataNumber 数据条数
     */
    public Long getDataNumber() {
        return this.DataNumber;
    }

    /**
     * Set 数据条数
     * @param DataNumber 数据条数
     */
    public void setDataNumber(Long DataNumber) {
        this.DataNumber = DataNumber;
    }

    /**
     * Get 查询数据能不能下载 
     * @return CanDownload 查询数据能不能下载
     */
    public Boolean getCanDownload() {
        return this.CanDownload;
    }

    /**
     * Set 查询数据能不能下载
     * @param CanDownload 查询数据能不能下载
     */
    public void setCanDownload(Boolean CanDownload) {
        this.CanDownload = CanDownload;
    }

    /**
     * Get 用户别名 
     * @return UserAlias 用户别名
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户别名
     * @param UserAlias 用户别名
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get spark应用作业名 
     * @return SparkJobName spark应用作业名
     */
    public String getSparkJobName() {
        return this.SparkJobName;
    }

    /**
     * Set spark应用作业名
     * @param SparkJobName spark应用作业名
     */
    public void setSparkJobName(String SparkJobName) {
        this.SparkJobName = SparkJobName;
    }

    /**
     * Get spark应用作业Id 
     * @return SparkJobId spark应用作业Id
     */
    public String getSparkJobId() {
        return this.SparkJobId;
    }

    /**
     * Set spark应用作业Id
     * @param SparkJobId spark应用作业Id
     */
    public void setSparkJobId(String SparkJobId) {
        this.SparkJobId = SparkJobId;
    }

    /**
     * Get spark应用入口jar文件 
     * @return SparkJobFile spark应用入口jar文件
     */
    public String getSparkJobFile() {
        return this.SparkJobFile;
    }

    /**
     * Set spark应用入口jar文件
     * @param SparkJobFile spark应用入口jar文件
     */
    public void setSparkJobFile(String SparkJobFile) {
        this.SparkJobFile = SparkJobFile;
    }

    /**
     * Get spark ui url 
     * @return UiUrl spark ui url
     */
    public String getUiUrl() {
        return this.UiUrl;
    }

    /**
     * Set spark ui url
     * @param UiUrl spark ui url
     */
    public void setUiUrl(String UiUrl) {
        this.UiUrl = UiUrl;
    }

    /**
     * Get 任务耗时，单位： ms 
     * @return TotalTime 任务耗时，单位： ms
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 任务耗时，单位： ms
     * @param TotalTime 任务耗时，单位： ms
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get spark app job执行task的程序入口参数 
     * @return CmdArgs spark app job执行task的程序入口参数
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set spark app job执行task的程序入口参数
     * @param CmdArgs spark app job执行task的程序入口参数
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 集群镜像大版本名称 
     * @return ImageVersion 集群镜像大版本名称
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 集群镜像大版本名称
     * @param ImageVersion 集群镜像大版本名称
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge 
     * @return DriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     * @param DriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge 
     * @return ExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     * @param ExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定executor数量，最小值为1，最大值小于集群规格 
     * @return ExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
     */
    public Long getExecutorNums() {
        return this.ExecutorNums;
    }

    /**
     * Set 指定executor数量，最小值为1，最大值小于集群规格
     * @param ExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
     */
    public void setExecutorNums(Long ExecutorNums) {
        this.ExecutorNums = ExecutorNums;
    }

    /**
     * Get 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums） 
     * @return ExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     * @param ExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get 任务公共指标数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonMetrics 任务公共指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonMetrics getCommonMetrics() {
        return this.CommonMetrics;
    }

    /**
     * Set 任务公共指标数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonMetrics 任务公共指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonMetrics(CommonMetrics CommonMetrics) {
        this.CommonMetrics = CommonMetrics;
    }

    /**
     * Get spark任务指标数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkMonitorMetrics spark任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparkMonitorMetrics getSparkMonitorMetrics() {
        return this.SparkMonitorMetrics;
    }

    /**
     * Set spark任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkMonitorMetrics spark任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkMonitorMetrics(SparkMonitorMetrics SparkMonitorMetrics) {
        this.SparkMonitorMetrics = SparkMonitorMetrics;
    }

    /**
     * Get presto任务指标数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrestoMonitorMetrics presto任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrestoMonitorMetrics getPrestoMonitorMetrics() {
        return this.PrestoMonitorMetrics;
    }

    /**
     * Set presto任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrestoMonitorMetrics presto任务指标数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrestoMonitorMetrics(PrestoMonitorMetrics PrestoMonitorMetrics) {
        this.PrestoMonitorMetrics = PrestoMonitorMetrics;
    }

    /**
     * Get 结果文件格式：默认为csv 
     * @return ResultFormat 结果文件格式：默认为csv
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set 结果文件格式：默认为csv
     * @param ResultFormat 结果文件格式：默认为csv
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get 引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎 
     * @return EngineTypeDetail 引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set 引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎
     * @param EngineTypeDetail 引擎类型，SparkSQL：SparkSQL 引擎；SparkBatch：Spark作业引擎；PrestoSQL：Presto引擎
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get spark引擎资源组名称 
     * @return ResourceGroupName spark引擎资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set spark引擎资源组名称
     * @param ResourceGroupName spark引擎资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public TaskResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResponseInfo(TaskResponseInfo source) {
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

    }
}

