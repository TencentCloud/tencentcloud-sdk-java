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

public class SparkJobInfo extends AbstractModel {

    /**
    * <p>spark作业ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>spark作业名</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业</p>
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * <p>引擎名</p>
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * <p>该字段已下线，请使用字段Datasource</p>
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * <p>程序包是否本地上传，cos或者lakefs</p>
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * <p>程序包路径</p>
    */
    @SerializedName("JobFile")
    @Expose
    private String JobFile;

    /**
    * <p>角色ID</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * <p>spark作业运行主类</p>
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * <p>命令行参数，spark作业命令行参数，空格分隔</p>
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * <p>spark原生配置，换行符分隔</p>
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
    * <p>依赖jars是否本地上传，cos或者lakefs</p>
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * <p>spark作业依赖jars，逗号分隔</p>
    */
    @SerializedName("JobJars")
    @Expose
    private String JobJars;

    /**
    * <p>依赖文件是否本地上传，cos或者lakefs</p>
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * <p>spark作业依赖文件，逗号分隔</p>
    */
    @SerializedName("JobFiles")
    @Expose
    private String JobFiles;

    /**
    * <p>spark作业driver资源大小</p>
    */
    @SerializedName("JobDriverSize")
    @Expose
    private String JobDriverSize;

    /**
    * <p>spark作业executor资源大小</p>
    */
    @SerializedName("JobExecutorSize")
    @Expose
    private String JobExecutorSize;

    /**
    * <p>spark作业executor个数</p>
    */
    @SerializedName("JobExecutorNums")
    @Expose
    private Long JobExecutorNums;

    /**
    * <p>spark流任务最大重试次数</p>
    */
    @SerializedName("JobMaxAttempts")
    @Expose
    private Long JobMaxAttempts;

    /**
    * <p>spark作业创建者</p>
    */
    @SerializedName("JobCreator")
    @Expose
    private String JobCreator;

    /**
    * <p>spark作业创建时间</p>
    */
    @SerializedName("JobCreateTime")
    @Expose
    private Long JobCreateTime;

    /**
    * <p>spark作业更新时间</p>
    */
    @SerializedName("JobUpdateTime")
    @Expose
    private Long JobUpdateTime;

    /**
    * <p>spark作业最近任务ID</p>
    */
    @SerializedName("CurrentTaskId")
    @Expose
    private String CurrentTaskId;

    /**
    * <p>spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5</p>
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
    * <p>spark流作业统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamingStat")
    @Expose
    private StreamingStatistics StreamingStat;

    /**
    * <p>数据源名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * <p>pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * <p>注：该返回值已废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * <p>archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * <p>archives：依赖资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobArchives")
    @Expose
    private String JobArchives;

    /**
    * <p>Spark Image 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * <p>pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobPythonFiles")
    @Expose
    private String JobPythonFiles;

    /**
    * <p>当前job正在运行或准备运行的任务个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * <p>引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineStatus")
    @Expose
    private Long DataEngineStatus;

    /**
    * <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutorMaxNumbers")
    @Expose
    private Long JobExecutorMaxNumbers;

    /**
    * <p>镜像版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * <p>查询脚本关联id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>spark_emr_livy</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineClusterType")
    @Expose
    private String DataEngineClusterType;

    /**
    * <p>Spark 3.2-EMR</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineImageVersion")
    @Expose
    private String DataEngineImageVersion;

    /**
    * <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
    * <p>引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * <p>标准引擎依赖包</p>
    */
    @SerializedName("DependencyPackages")
    @Expose
    private DependencyPackage [] DependencyPackages;

    /**
    * <p>作业运行鉴权身份</p>
    */
    @SerializedName("RunAsIdentity")
    @Expose
    private String RunAsIdentity;

    /**
     * Get <p>spark作业ID</p> 
     * @return JobId <p>spark作业ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>spark作业ID</p>
     * @param JobId <p>spark作业ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>spark作业名</p> 
     * @return JobName <p>spark作业名</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>spark作业名</p>
     * @param JobName <p>spark作业名</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业</p> 
     * @return JobType <p>spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业</p>
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业</p>
     * @param JobType <p>spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业</p>
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>引擎名</p> 
     * @return DataEngine <p>引擎名</p>
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set <p>引擎名</p>
     * @param DataEngine <p>引擎名</p>
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get <p>该字段已下线，请使用字段Datasource</p> 
     * @return Eni <p>该字段已下线，请使用字段Datasource</p>
     */
    public String getEni() {
        return this.Eni;
    }

    /**
     * Set <p>该字段已下线，请使用字段Datasource</p>
     * @param Eni <p>该字段已下线，请使用字段Datasource</p>
     */
    public void setEni(String Eni) {
        this.Eni = Eni;
    }

    /**
     * Get <p>程序包是否本地上传，cos或者lakefs</p> 
     * @return IsLocal <p>程序包是否本地上传，cos或者lakefs</p>
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set <p>程序包是否本地上传，cos或者lakefs</p>
     * @param IsLocal <p>程序包是否本地上传，cos或者lakefs</p>
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get <p>程序包路径</p> 
     * @return JobFile <p>程序包路径</p>
     */
    public String getJobFile() {
        return this.JobFile;
    }

    /**
     * Set <p>程序包路径</p>
     * @param JobFile <p>程序包路径</p>
     */
    public void setJobFile(String JobFile) {
        this.JobFile = JobFile;
    }

    /**
     * Get <p>角色ID</p> 
     * @return RoleArn <p>角色ID</p>
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色ID</p>
     * @param RoleArn <p>角色ID</p>
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>spark作业运行主类</p> 
     * @return MainClass <p>spark作业运行主类</p>
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set <p>spark作业运行主类</p>
     * @param MainClass <p>spark作业运行主类</p>
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get <p>命令行参数，spark作业命令行参数，空格分隔</p> 
     * @return CmdArgs <p>命令行参数，spark作业命令行参数，空格分隔</p>
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set <p>命令行参数，spark作业命令行参数，空格分隔</p>
     * @param CmdArgs <p>命令行参数，spark作业命令行参数，空格分隔</p>
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get <p>spark原生配置，换行符分隔</p> 
     * @return JobConf <p>spark原生配置，换行符分隔</p>
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set <p>spark原生配置，换行符分隔</p>
     * @param JobConf <p>spark原生配置，换行符分隔</p>
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    /**
     * Get <p>依赖jars是否本地上传，cos或者lakefs</p> 
     * @return IsLocalJars <p>依赖jars是否本地上传，cos或者lakefs</p>
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set <p>依赖jars是否本地上传，cos或者lakefs</p>
     * @param IsLocalJars <p>依赖jars是否本地上传，cos或者lakefs</p>
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get <p>spark作业依赖jars，逗号分隔</p> 
     * @return JobJars <p>spark作业依赖jars，逗号分隔</p>
     */
    public String getJobJars() {
        return this.JobJars;
    }

    /**
     * Set <p>spark作业依赖jars，逗号分隔</p>
     * @param JobJars <p>spark作业依赖jars，逗号分隔</p>
     */
    public void setJobJars(String JobJars) {
        this.JobJars = JobJars;
    }

    /**
     * Get <p>依赖文件是否本地上传，cos或者lakefs</p> 
     * @return IsLocalFiles <p>依赖文件是否本地上传，cos或者lakefs</p>
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set <p>依赖文件是否本地上传，cos或者lakefs</p>
     * @param IsLocalFiles <p>依赖文件是否本地上传，cos或者lakefs</p>
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get <p>spark作业依赖文件，逗号分隔</p> 
     * @return JobFiles <p>spark作业依赖文件，逗号分隔</p>
     */
    public String getJobFiles() {
        return this.JobFiles;
    }

    /**
     * Set <p>spark作业依赖文件，逗号分隔</p>
     * @param JobFiles <p>spark作业依赖文件，逗号分隔</p>
     */
    public void setJobFiles(String JobFiles) {
        this.JobFiles = JobFiles;
    }

    /**
     * Get <p>spark作业driver资源大小</p> 
     * @return JobDriverSize <p>spark作业driver资源大小</p>
     */
    public String getJobDriverSize() {
        return this.JobDriverSize;
    }

    /**
     * Set <p>spark作业driver资源大小</p>
     * @param JobDriverSize <p>spark作业driver资源大小</p>
     */
    public void setJobDriverSize(String JobDriverSize) {
        this.JobDriverSize = JobDriverSize;
    }

    /**
     * Get <p>spark作业executor资源大小</p> 
     * @return JobExecutorSize <p>spark作业executor资源大小</p>
     */
    public String getJobExecutorSize() {
        return this.JobExecutorSize;
    }

    /**
     * Set <p>spark作业executor资源大小</p>
     * @param JobExecutorSize <p>spark作业executor资源大小</p>
     */
    public void setJobExecutorSize(String JobExecutorSize) {
        this.JobExecutorSize = JobExecutorSize;
    }

    /**
     * Get <p>spark作业executor个数</p> 
     * @return JobExecutorNums <p>spark作业executor个数</p>
     */
    public Long getJobExecutorNums() {
        return this.JobExecutorNums;
    }

    /**
     * Set <p>spark作业executor个数</p>
     * @param JobExecutorNums <p>spark作业executor个数</p>
     */
    public void setJobExecutorNums(Long JobExecutorNums) {
        this.JobExecutorNums = JobExecutorNums;
    }

    /**
     * Get <p>spark流任务最大重试次数</p> 
     * @return JobMaxAttempts <p>spark流任务最大重试次数</p>
     */
    public Long getJobMaxAttempts() {
        return this.JobMaxAttempts;
    }

    /**
     * Set <p>spark流任务最大重试次数</p>
     * @param JobMaxAttempts <p>spark流任务最大重试次数</p>
     */
    public void setJobMaxAttempts(Long JobMaxAttempts) {
        this.JobMaxAttempts = JobMaxAttempts;
    }

    /**
     * Get <p>spark作业创建者</p> 
     * @return JobCreator <p>spark作业创建者</p>
     */
    public String getJobCreator() {
        return this.JobCreator;
    }

    /**
     * Set <p>spark作业创建者</p>
     * @param JobCreator <p>spark作业创建者</p>
     */
    public void setJobCreator(String JobCreator) {
        this.JobCreator = JobCreator;
    }

    /**
     * Get <p>spark作业创建时间</p> 
     * @return JobCreateTime <p>spark作业创建时间</p>
     */
    public Long getJobCreateTime() {
        return this.JobCreateTime;
    }

    /**
     * Set <p>spark作业创建时间</p>
     * @param JobCreateTime <p>spark作业创建时间</p>
     */
    public void setJobCreateTime(Long JobCreateTime) {
        this.JobCreateTime = JobCreateTime;
    }

    /**
     * Get <p>spark作业更新时间</p> 
     * @return JobUpdateTime <p>spark作业更新时间</p>
     */
    public Long getJobUpdateTime() {
        return this.JobUpdateTime;
    }

    /**
     * Set <p>spark作业更新时间</p>
     * @param JobUpdateTime <p>spark作业更新时间</p>
     */
    public void setJobUpdateTime(Long JobUpdateTime) {
        this.JobUpdateTime = JobUpdateTime;
    }

    /**
     * Get <p>spark作业最近任务ID</p> 
     * @return CurrentTaskId <p>spark作业最近任务ID</p>
     */
    public String getCurrentTaskId() {
        return this.CurrentTaskId;
    }

    /**
     * Set <p>spark作业最近任务ID</p>
     * @param CurrentTaskId <p>spark作业最近任务ID</p>
     */
    public void setCurrentTaskId(String CurrentTaskId) {
        this.CurrentTaskId = CurrentTaskId;
    }

    /**
     * Get <p>spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5</p> 
     * @return JobStatus <p>spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5</p>
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set <p>spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5</p>
     * @param JobStatus <p>spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5</p>
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get <p>spark流作业统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamingStat <p>spark流作业统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamingStatistics getStreamingStat() {
        return this.StreamingStat;
    }

    /**
     * Set <p>spark流作业统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamingStat <p>spark流作业统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamingStat(StreamingStatistics StreamingStat) {
        this.StreamingStat = StreamingStat;
    }

    /**
     * Get <p>数据源名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource <p>数据源名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set <p>数据源名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource <p>数据源名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get <p>pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocalPythonFiles <p>pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set <p>pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocalPythonFiles <p>pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get <p>注：该返回值已废弃</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppPythonFiles <p>注：该返回值已废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set <p>注：该返回值已废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppPythonFiles <p>注：该返回值已废弃</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get <p>archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocalArchives <p>archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set <p>archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocalArchives <p>archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get <p>archives：依赖资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobArchives <p>archives：依赖资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobArchives() {
        return this.JobArchives;
    }

    /**
     * Set <p>archives：依赖资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobArchives <p>archives：依赖资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobArchives(String JobArchives) {
        this.JobArchives = JobArchives;
    }

    /**
     * Get <p>Spark Image 版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImage <p>Spark Image 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set <p>Spark Image 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImage <p>Spark Image 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get <p>pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobPythonFiles <p>pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobPythonFiles() {
        return this.JobPythonFiles;
    }

    /**
     * Set <p>pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobPythonFiles <p>pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobPythonFiles(String JobPythonFiles) {
        this.JobPythonFiles = JobPythonFiles;
    }

    /**
     * Get <p>当前job正在运行或准备运行的任务个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNum <p>当前job正在运行或准备运行的任务个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set <p>当前job正在运行或准备运行的任务个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNum <p>当前job正在运行或准备运行的任务个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get <p>引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineStatus <p>引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataEngineStatus() {
        return this.DataEngineStatus;
    }

    /**
     * Set <p>引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineStatus <p>引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineStatus(Long DataEngineStatus) {
        this.DataEngineStatus = DataEngineStatus;
    }

    /**
     * Get <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutorMaxNumbers <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobExecutorMaxNumbers() {
        return this.JobExecutorMaxNumbers;
    }

    /**
     * Set <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutorMaxNumbers <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutorMaxNumbers(Long JobExecutorMaxNumbers) {
        this.JobExecutorMaxNumbers = JobExecutorMaxNumbers;
    }

    /**
     * Get <p>镜像版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageVersion <p>镜像版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set <p>镜像版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageVersion <p>镜像版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get <p>查询脚本关联id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>查询脚本关联id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>查询脚本关联id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>查询脚本关联id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>spark_emr_livy</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineClusterType <p>spark_emr_livy</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineClusterType() {
        return this.DataEngineClusterType;
    }

    /**
     * Set <p>spark_emr_livy</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineClusterType <p>spark_emr_livy</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineClusterType(String DataEngineClusterType) {
        this.DataEngineClusterType = DataEngineClusterType;
    }

    /**
     * Get <p>Spark 3.2-EMR</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineImageVersion <p>Spark 3.2-EMR</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineImageVersion() {
        return this.DataEngineImageVersion;
    }

    /**
     * Set <p>Spark 3.2-EMR</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineImageVersion <p>Spark 3.2-EMR</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineImageVersion(String DataEngineImageVersion) {
        this.DataEngineImageVersion = DataEngineImageVersion;
    }

    /**
     * Get <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInherit <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInherit <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSessionStarted <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSessionStarted <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
    }

    /**
     * Get <p>引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineTypeDetail <p>引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set <p>引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineTypeDetail <p>引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get <p>标准引擎依赖包</p> 
     * @return DependencyPackages <p>标准引擎依赖包</p>
     */
    public DependencyPackage [] getDependencyPackages() {
        return this.DependencyPackages;
    }

    /**
     * Set <p>标准引擎依赖包</p>
     * @param DependencyPackages <p>标准引擎依赖包</p>
     */
    public void setDependencyPackages(DependencyPackage [] DependencyPackages) {
        this.DependencyPackages = DependencyPackages;
    }

    /**
     * Get <p>作业运行鉴权身份</p> 
     * @return RunAsIdentity <p>作业运行鉴权身份</p>
     */
    public String getRunAsIdentity() {
        return this.RunAsIdentity;
    }

    /**
     * Set <p>作业运行鉴权身份</p>
     * @param RunAsIdentity <p>作业运行鉴权身份</p>
     */
    public void setRunAsIdentity(String RunAsIdentity) {
        this.RunAsIdentity = RunAsIdentity;
    }

    public SparkJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkJobInfo(SparkJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.Eni != null) {
            this.Eni = new String(source.Eni);
        }
        if (source.IsLocal != null) {
            this.IsLocal = new String(source.IsLocal);
        }
        if (source.JobFile != null) {
            this.JobFile = new String(source.JobFile);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new Long(source.RoleArn);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.JobConf != null) {
            this.JobConf = new String(source.JobConf);
        }
        if (source.IsLocalJars != null) {
            this.IsLocalJars = new String(source.IsLocalJars);
        }
        if (source.JobJars != null) {
            this.JobJars = new String(source.JobJars);
        }
        if (source.IsLocalFiles != null) {
            this.IsLocalFiles = new String(source.IsLocalFiles);
        }
        if (source.JobFiles != null) {
            this.JobFiles = new String(source.JobFiles);
        }
        if (source.JobDriverSize != null) {
            this.JobDriverSize = new String(source.JobDriverSize);
        }
        if (source.JobExecutorSize != null) {
            this.JobExecutorSize = new String(source.JobExecutorSize);
        }
        if (source.JobExecutorNums != null) {
            this.JobExecutorNums = new Long(source.JobExecutorNums);
        }
        if (source.JobMaxAttempts != null) {
            this.JobMaxAttempts = new Long(source.JobMaxAttempts);
        }
        if (source.JobCreator != null) {
            this.JobCreator = new String(source.JobCreator);
        }
        if (source.JobCreateTime != null) {
            this.JobCreateTime = new Long(source.JobCreateTime);
        }
        if (source.JobUpdateTime != null) {
            this.JobUpdateTime = new Long(source.JobUpdateTime);
        }
        if (source.CurrentTaskId != null) {
            this.CurrentTaskId = new String(source.CurrentTaskId);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new Long(source.JobStatus);
        }
        if (source.StreamingStat != null) {
            this.StreamingStat = new StreamingStatistics(source.StreamingStat);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.IsLocalPythonFiles != null) {
            this.IsLocalPythonFiles = new String(source.IsLocalPythonFiles);
        }
        if (source.AppPythonFiles != null) {
            this.AppPythonFiles = new String(source.AppPythonFiles);
        }
        if (source.IsLocalArchives != null) {
            this.IsLocalArchives = new String(source.IsLocalArchives);
        }
        if (source.JobArchives != null) {
            this.JobArchives = new String(source.JobArchives);
        }
        if (source.SparkImage != null) {
            this.SparkImage = new String(source.SparkImage);
        }
        if (source.JobPythonFiles != null) {
            this.JobPythonFiles = new String(source.JobPythonFiles);
        }
        if (source.TaskNum != null) {
            this.TaskNum = new Long(source.TaskNum);
        }
        if (source.DataEngineStatus != null) {
            this.DataEngineStatus = new Long(source.DataEngineStatus);
        }
        if (source.JobExecutorMaxNumbers != null) {
            this.JobExecutorMaxNumbers = new Long(source.JobExecutorMaxNumbers);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DataEngineClusterType != null) {
            this.DataEngineClusterType = new String(source.DataEngineClusterType);
        }
        if (source.DataEngineImageVersion != null) {
            this.DataEngineImageVersion = new String(source.DataEngineImageVersion);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
        if (source.IsSessionStarted != null) {
            this.IsSessionStarted = new Boolean(source.IsSessionStarted);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
        if (source.DependencyPackages != null) {
            this.DependencyPackages = new DependencyPackage[source.DependencyPackages.length];
            for (int i = 0; i < source.DependencyPackages.length; i++) {
                this.DependencyPackages[i] = new DependencyPackage(source.DependencyPackages[i]);
            }
        }
        if (source.RunAsIdentity != null) {
            this.RunAsIdentity = new String(source.RunAsIdentity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "Eni", this.Eni);
        this.setParamSimple(map, prefix + "IsLocal", this.IsLocal);
        this.setParamSimple(map, prefix + "JobFile", this.JobFile);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "JobConf", this.JobConf);
        this.setParamSimple(map, prefix + "IsLocalJars", this.IsLocalJars);
        this.setParamSimple(map, prefix + "JobJars", this.JobJars);
        this.setParamSimple(map, prefix + "IsLocalFiles", this.IsLocalFiles);
        this.setParamSimple(map, prefix + "JobFiles", this.JobFiles);
        this.setParamSimple(map, prefix + "JobDriverSize", this.JobDriverSize);
        this.setParamSimple(map, prefix + "JobExecutorSize", this.JobExecutorSize);
        this.setParamSimple(map, prefix + "JobExecutorNums", this.JobExecutorNums);
        this.setParamSimple(map, prefix + "JobMaxAttempts", this.JobMaxAttempts);
        this.setParamSimple(map, prefix + "JobCreator", this.JobCreator);
        this.setParamSimple(map, prefix + "JobCreateTime", this.JobCreateTime);
        this.setParamSimple(map, prefix + "JobUpdateTime", this.JobUpdateTime);
        this.setParamSimple(map, prefix + "CurrentTaskId", this.CurrentTaskId);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamObj(map, prefix + "StreamingStat.", this.StreamingStat);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IsLocalPythonFiles", this.IsLocalPythonFiles);
        this.setParamSimple(map, prefix + "AppPythonFiles", this.AppPythonFiles);
        this.setParamSimple(map, prefix + "IsLocalArchives", this.IsLocalArchives);
        this.setParamSimple(map, prefix + "JobArchives", this.JobArchives);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "JobPythonFiles", this.JobPythonFiles);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamSimple(map, prefix + "DataEngineStatus", this.DataEngineStatus);
        this.setParamSimple(map, prefix + "JobExecutorMaxNumbers", this.JobExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DataEngineClusterType", this.DataEngineClusterType);
        this.setParamSimple(map, prefix + "DataEngineImageVersion", this.DataEngineImageVersion);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "IsSessionStarted", this.IsSessionStarted);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);
        this.setParamArrayObj(map, prefix + "DependencyPackages.", this.DependencyPackages);
        this.setParamSimple(map, prefix + "RunAsIdentity", this.RunAsIdentity);

    }
}

