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
    * spark作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * spark作业名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 引擎名
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * 该字段已下线，请使用字段Datasource
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * 程序包是否本地上传，cos或者lakefs
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * 程序包路径
    */
    @SerializedName("JobFile")
    @Expose
    private String JobFile;

    /**
    * 角色ID
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * spark作业运行主类
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 命令行参数，spark作业命令行参数，空格分隔
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * spark原生配置，换行符分隔
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
    * 依赖jars是否本地上传，cos或者lakefs
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * spark作业依赖jars，逗号分隔
    */
    @SerializedName("JobJars")
    @Expose
    private String JobJars;

    /**
    * 依赖文件是否本地上传，cos或者lakefs
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * spark作业依赖文件，逗号分隔
    */
    @SerializedName("JobFiles")
    @Expose
    private String JobFiles;

    /**
    * spark作业driver资源大小
    */
    @SerializedName("JobDriverSize")
    @Expose
    private String JobDriverSize;

    /**
    * spark作业executor资源大小
    */
    @SerializedName("JobExecutorSize")
    @Expose
    private String JobExecutorSize;

    /**
    * spark作业executor个数
    */
    @SerializedName("JobExecutorNums")
    @Expose
    private Long JobExecutorNums;

    /**
    * spark流任务最大重试次数
    */
    @SerializedName("JobMaxAttempts")
    @Expose
    private Long JobMaxAttempts;

    /**
    * spark作业创建者
    */
    @SerializedName("JobCreator")
    @Expose
    private String JobCreator;

    /**
    * spark作业创建时间
    */
    @SerializedName("JobCreateTime")
    @Expose
    private Long JobCreateTime;

    /**
    * spark作业更新时间
    */
    @SerializedName("JobUpdateTime")
    @Expose
    private Long JobUpdateTime;

    /**
    * spark作业最近任务ID
    */
    @SerializedName("CurrentTaskId")
    @Expose
    private String CurrentTaskId;

    /**
    * spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
    * spark流作业统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamingStat")
    @Expose
    private StreamingStatistics StreamingStat;

    /**
    * 数据源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * 注：该返回值已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * archives：依赖资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobArchives")
    @Expose
    private String JobArchives;

    /**
    * Spark Image 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobPythonFiles")
    @Expose
    private String JobPythonFiles;

    /**
    * 当前job正在运行或准备运行的任务个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * 引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineStatus")
    @Expose
    private Long DataEngineStatus;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutorMaxNumbers")
    @Expose
    private Long JobExecutorMaxNumbers;

    /**
    * 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * 查询脚本关联id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * spark_emr_livy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineClusterType")
    @Expose
    private String DataEngineClusterType;

    /**
    * Spark 3.2-EMR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineImageVersion")
    @Expose
    private String DataEngineImageVersion;

    /**
    * 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * 是否使用session脚本的sql运行任务：false：否，true：是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
    * 引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
     * Get spark作业ID 
     * @return JobId spark作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set spark作业ID
     * @param JobId spark作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get spark作业名 
     * @return JobName spark作业名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set spark作业名
     * @param JobName spark作业名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业 
     * @return JobType spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业
     * @param JobType spark作业类型，可去1或者2，1表示batch作业， 2表示streaming作业
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 引擎名 
     * @return DataEngine 引擎名
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 引擎名
     * @param DataEngine 引擎名
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get 该字段已下线，请使用字段Datasource 
     * @return Eni 该字段已下线，请使用字段Datasource
     */
    public String getEni() {
        return this.Eni;
    }

    /**
     * Set 该字段已下线，请使用字段Datasource
     * @param Eni 该字段已下线，请使用字段Datasource
     */
    public void setEni(String Eni) {
        this.Eni = Eni;
    }

    /**
     * Get 程序包是否本地上传，cos或者lakefs 
     * @return IsLocal 程序包是否本地上传，cos或者lakefs
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set 程序包是否本地上传，cos或者lakefs
     * @param IsLocal 程序包是否本地上传，cos或者lakefs
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get 程序包路径 
     * @return JobFile 程序包路径
     */
    public String getJobFile() {
        return this.JobFile;
    }

    /**
     * Set 程序包路径
     * @param JobFile 程序包路径
     */
    public void setJobFile(String JobFile) {
        this.JobFile = JobFile;
    }

    /**
     * Get 角色ID 
     * @return RoleArn 角色ID
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色ID
     * @param RoleArn 角色ID
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get spark作业运行主类 
     * @return MainClass spark作业运行主类
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set spark作业运行主类
     * @param MainClass spark作业运行主类
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 命令行参数，spark作业命令行参数，空格分隔 
     * @return CmdArgs 命令行参数，spark作业命令行参数，空格分隔
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set 命令行参数，spark作业命令行参数，空格分隔
     * @param CmdArgs 命令行参数，spark作业命令行参数，空格分隔
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get spark原生配置，换行符分隔 
     * @return JobConf spark原生配置，换行符分隔
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set spark原生配置，换行符分隔
     * @param JobConf spark原生配置，换行符分隔
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    /**
     * Get 依赖jars是否本地上传，cos或者lakefs 
     * @return IsLocalJars 依赖jars是否本地上传，cos或者lakefs
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set 依赖jars是否本地上传，cos或者lakefs
     * @param IsLocalJars 依赖jars是否本地上传，cos或者lakefs
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get spark作业依赖jars，逗号分隔 
     * @return JobJars spark作业依赖jars，逗号分隔
     */
    public String getJobJars() {
        return this.JobJars;
    }

    /**
     * Set spark作业依赖jars，逗号分隔
     * @param JobJars spark作业依赖jars，逗号分隔
     */
    public void setJobJars(String JobJars) {
        this.JobJars = JobJars;
    }

    /**
     * Get 依赖文件是否本地上传，cos或者lakefs 
     * @return IsLocalFiles 依赖文件是否本地上传，cos或者lakefs
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set 依赖文件是否本地上传，cos或者lakefs
     * @param IsLocalFiles 依赖文件是否本地上传，cos或者lakefs
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get spark作业依赖文件，逗号分隔 
     * @return JobFiles spark作业依赖文件，逗号分隔
     */
    public String getJobFiles() {
        return this.JobFiles;
    }

    /**
     * Set spark作业依赖文件，逗号分隔
     * @param JobFiles spark作业依赖文件，逗号分隔
     */
    public void setJobFiles(String JobFiles) {
        this.JobFiles = JobFiles;
    }

    /**
     * Get spark作业driver资源大小 
     * @return JobDriverSize spark作业driver资源大小
     */
    public String getJobDriverSize() {
        return this.JobDriverSize;
    }

    /**
     * Set spark作业driver资源大小
     * @param JobDriverSize spark作业driver资源大小
     */
    public void setJobDriverSize(String JobDriverSize) {
        this.JobDriverSize = JobDriverSize;
    }

    /**
     * Get spark作业executor资源大小 
     * @return JobExecutorSize spark作业executor资源大小
     */
    public String getJobExecutorSize() {
        return this.JobExecutorSize;
    }

    /**
     * Set spark作业executor资源大小
     * @param JobExecutorSize spark作业executor资源大小
     */
    public void setJobExecutorSize(String JobExecutorSize) {
        this.JobExecutorSize = JobExecutorSize;
    }

    /**
     * Get spark作业executor个数 
     * @return JobExecutorNums spark作业executor个数
     */
    public Long getJobExecutorNums() {
        return this.JobExecutorNums;
    }

    /**
     * Set spark作业executor个数
     * @param JobExecutorNums spark作业executor个数
     */
    public void setJobExecutorNums(Long JobExecutorNums) {
        this.JobExecutorNums = JobExecutorNums;
    }

    /**
     * Get spark流任务最大重试次数 
     * @return JobMaxAttempts spark流任务最大重试次数
     */
    public Long getJobMaxAttempts() {
        return this.JobMaxAttempts;
    }

    /**
     * Set spark流任务最大重试次数
     * @param JobMaxAttempts spark流任务最大重试次数
     */
    public void setJobMaxAttempts(Long JobMaxAttempts) {
        this.JobMaxAttempts = JobMaxAttempts;
    }

    /**
     * Get spark作业创建者 
     * @return JobCreator spark作业创建者
     */
    public String getJobCreator() {
        return this.JobCreator;
    }

    /**
     * Set spark作业创建者
     * @param JobCreator spark作业创建者
     */
    public void setJobCreator(String JobCreator) {
        this.JobCreator = JobCreator;
    }

    /**
     * Get spark作业创建时间 
     * @return JobCreateTime spark作业创建时间
     */
    public Long getJobCreateTime() {
        return this.JobCreateTime;
    }

    /**
     * Set spark作业创建时间
     * @param JobCreateTime spark作业创建时间
     */
    public void setJobCreateTime(Long JobCreateTime) {
        this.JobCreateTime = JobCreateTime;
    }

    /**
     * Get spark作业更新时间 
     * @return JobUpdateTime spark作业更新时间
     */
    public Long getJobUpdateTime() {
        return this.JobUpdateTime;
    }

    /**
     * Set spark作业更新时间
     * @param JobUpdateTime spark作业更新时间
     */
    public void setJobUpdateTime(Long JobUpdateTime) {
        this.JobUpdateTime = JobUpdateTime;
    }

    /**
     * Get spark作业最近任务ID 
     * @return CurrentTaskId spark作业最近任务ID
     */
    public String getCurrentTaskId() {
        return this.CurrentTaskId;
    }

    /**
     * Set spark作业最近任务ID
     * @param CurrentTaskId spark作业最近任务ID
     */
    public void setCurrentTaskId(String CurrentTaskId) {
        this.CurrentTaskId = CurrentTaskId;
    }

    /**
     * Get spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5 
     * @return JobStatus spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5
     * @param JobStatus spark作业最近运行状态，初始化：0，运行中：1，成功：2，数据写入中： 3， 排队中： 4， 失败： -1， 已删除： -3，已过期： -5
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get spark流作业统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamingStat spark流作业统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamingStatistics getStreamingStat() {
        return this.StreamingStat;
    }

    /**
     * Set spark流作业统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamingStat spark流作业统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamingStat(StreamingStatistics StreamingStat) {
        this.StreamingStat = StreamingStat;
    }

    /**
     * Get 数据源名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocalPythonFiles pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocalPythonFiles pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get 注：该返回值已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppPythonFiles 注：该返回值已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set 注：该返回值已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppPythonFiles 注：该返回值已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLocalArchives archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLocalArchives archives：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get archives：依赖资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobArchives archives：依赖资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobArchives() {
        return this.JobArchives;
    }

    /**
     * Set archives：依赖资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobArchives archives：依赖资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobArchives(String JobArchives) {
        this.JobArchives = JobArchives;
    }

    /**
     * Get Spark Image 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImage Spark Image 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set Spark Image 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImage Spark Image 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobPythonFiles pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobPythonFiles() {
        return this.JobPythonFiles;
    }

    /**
     * Set pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobPythonFiles pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobPythonFiles(String JobPythonFiles) {
        this.JobPythonFiles = JobPythonFiles;
    }

    /**
     * Get 当前job正在运行或准备运行的任务个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNum 当前job正在运行或准备运行的任务个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set 当前job正在运行或准备运行的任务个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNum 当前job正在运行或准备运行的任务个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get 引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineStatus 引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataEngineStatus() {
        return this.DataEngineStatus;
    }

    /**
     * Set 引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineStatus 引擎状态：-100（默认：未知状态），-2~11：引擎正常状态；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineStatus(Long DataEngineStatus) {
        this.DataEngineStatus = DataEngineStatus;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobExecutorMaxNumbers() {
        return this.JobExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于JobExecutorNums
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutorMaxNumbers(Long JobExecutorMaxNumbers) {
        this.JobExecutorMaxNumbers = JobExecutorMaxNumbers;
    }

    /**
     * Get 镜像版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageVersion 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageVersion 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get 查询脚本关联id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 查询脚本关联id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 查询脚本关联id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 查询脚本关联id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get spark_emr_livy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineClusterType spark_emr_livy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineClusterType() {
        return this.DataEngineClusterType;
    }

    /**
     * Set spark_emr_livy
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineClusterType spark_emr_livy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineClusterType(String DataEngineClusterType) {
        this.DataEngineClusterType = DataEngineClusterType;
    }

    /**
     * Get Spark 3.2-EMR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineImageVersion Spark 3.2-EMR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineImageVersion() {
        return this.DataEngineImageVersion;
    }

    /**
     * Set Spark 3.2-EMR
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineImageVersion Spark 3.2-EMR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineImageVersion(String DataEngineImageVersion) {
        this.DataEngineImageVersion = DataEngineImageVersion;
    }

    /**
     * Get 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get 是否使用session脚本的sql运行任务：false：否，true：是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSessionStarted 是否使用session脚本的sql运行任务：false：否，true：是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set 是否使用session脚本的sql运行任务：false：否，true：是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSessionStarted 是否使用session脚本的sql运行任务：false：否，true：是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
    }

    /**
     * Get 引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineTypeDetail 引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set 引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineTypeDetail 引擎详细类型：SparkSQL、PrestoSQL、SparkBatch、StandardSpark、StandardPresto
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
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

    }
}

