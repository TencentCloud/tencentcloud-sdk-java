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

public class CreateSparkAppForTDLCRequest extends AbstractModel {

    /**
    * <p>spark作业名</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>spark作业类型，1代表spark jar作业，2代表spark streaming作业</p>
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * <p>执行spark作业的数据引擎名称</p>
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * <p>spark作业程序包文件路径</p>
    */
    @SerializedName("AppFile")
    @Expose
    private String AppFile;

    /**
    * <p>数据访问策略，CAM Role arn，控制台通过数据作业—&gt;作业配置获取，SDK通过DescribeUserRoles接口获取对应的值；</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * <p>指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * <p>指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
    */
    @SerializedName("AppExecutorSize")
    @Expose
    private String AppExecutorSize;

    /**
    * <p>spark作业executor个数</p>
    */
    @SerializedName("AppExecutorNums")
    @Expose
    private Long AppExecutorNums;

    /**
    * <p>该字段已下线，请使用字段Datasource</p>
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * <p>spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * <p>spark作业主类</p>
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * <p>spark配置，以换行符分隔</p>
    */
    @SerializedName("AppConf")
    @Expose
    private String AppConf;

    /**
    * <p>spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * <p>spark 作业依赖jar包（--jars），以逗号分隔</p>
    */
    @SerializedName("AppJars")
    @Expose
    private String AppJars;

    /**
    * <p>spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * <p>spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔</p>
    */
    @SerializedName("AppFiles")
    @Expose
    private String AppFiles;

    /**
    * <p>spark作业程序入参，空格分割</p>
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * <p>最大重试次数，只对spark流任务生效</p>
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * <p>数据源名称</p>
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * <p>pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * <p>pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔</p>
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * <p>spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * <p>spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔</p>
    */
    @SerializedName("AppArchives")
    @Expose
    private String AppArchives;

    /**
    * <p>Spark Image 版本号</p>
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * <p>Spark Image 版本名称</p>
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums</p>
    */
    @SerializedName("AppExecutorMaxNumbers")
    @Expose
    private Long AppExecutorMaxNumbers;

    /**
    * <p>关联dlc查询脚本id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
    * <p>依赖包信息</p>
    */
    @SerializedName("DependencyPackages")
    @Expose
    private DependencyPackage [] DependencyPackages;

    /**
     * Get <p>spark作业名</p> 
     * @return AppName <p>spark作业名</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>spark作业名</p>
     * @param AppName <p>spark作业名</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>spark作业类型，1代表spark jar作业，2代表spark streaming作业</p> 
     * @return AppType <p>spark作业类型，1代表spark jar作业，2代表spark streaming作业</p>
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>spark作业类型，1代表spark jar作业，2代表spark streaming作业</p>
     * @param AppType <p>spark作业类型，1代表spark jar作业，2代表spark streaming作业</p>
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>执行spark作业的数据引擎名称</p> 
     * @return DataEngine <p>执行spark作业的数据引擎名称</p>
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set <p>执行spark作业的数据引擎名称</p>
     * @param DataEngine <p>执行spark作业的数据引擎名称</p>
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get <p>spark作业程序包文件路径</p> 
     * @return AppFile <p>spark作业程序包文件路径</p>
     */
    public String getAppFile() {
        return this.AppFile;
    }

    /**
     * Set <p>spark作业程序包文件路径</p>
     * @param AppFile <p>spark作业程序包文件路径</p>
     */
    public void setAppFile(String AppFile) {
        this.AppFile = AppFile;
    }

    /**
     * Get <p>数据访问策略，CAM Role arn，控制台通过数据作业—&gt;作业配置获取，SDK通过DescribeUserRoles接口获取对应的值；</p> 
     * @return RoleArn <p>数据访问策略，CAM Role arn，控制台通过数据作业—&gt;作业配置获取，SDK通过DescribeUserRoles接口获取对应的值；</p>
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>数据访问策略，CAM Role arn，控制台通过数据作业—&gt;作业配置获取，SDK通过DescribeUserRoles接口获取对应的值；</p>
     * @param RoleArn <p>数据访问策略，CAM Role arn，控制台通过数据作业—&gt;作业配置获取，SDK通过DescribeUserRoles接口获取对应的值；</p>
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p> 
     * @return AppDriverSize <p>指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set <p>指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     * @param AppDriverSize <p>指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get <p>指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p> 
     * @return AppExecutorSize <p>指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set <p>指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     * @param AppExecutorSize <p>指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）</p>
     */
    public void setAppExecutorSize(String AppExecutorSize) {
        this.AppExecutorSize = AppExecutorSize;
    }

    /**
     * Get <p>spark作业executor个数</p> 
     * @return AppExecutorNums <p>spark作业executor个数</p>
     */
    public Long getAppExecutorNums() {
        return this.AppExecutorNums;
    }

    /**
     * Set <p>spark作业executor个数</p>
     * @param AppExecutorNums <p>spark作业executor个数</p>
     */
    public void setAppExecutorNums(Long AppExecutorNums) {
        this.AppExecutorNums = AppExecutorNums;
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
     * Get <p>spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p> 
     * @return IsLocal <p>spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set <p>spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     * @param IsLocal <p>spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get <p>spark作业主类</p> 
     * @return MainClass <p>spark作业主类</p>
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set <p>spark作业主类</p>
     * @param MainClass <p>spark作业主类</p>
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get <p>spark配置，以换行符分隔</p> 
     * @return AppConf <p>spark配置，以换行符分隔</p>
     */
    public String getAppConf() {
        return this.AppConf;
    }

    /**
     * Set <p>spark配置，以换行符分隔</p>
     * @param AppConf <p>spark配置，以换行符分隔</p>
     */
    public void setAppConf(String AppConf) {
        this.AppConf = AppConf;
    }

    /**
     * Get <p>spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p> 
     * @return IsLocalJars <p>spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set <p>spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     * @param IsLocalJars <p>spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get <p>spark 作业依赖jar包（--jars），以逗号分隔</p> 
     * @return AppJars <p>spark 作业依赖jar包（--jars），以逗号分隔</p>
     */
    public String getAppJars() {
        return this.AppJars;
    }

    /**
     * Set <p>spark 作业依赖jar包（--jars），以逗号分隔</p>
     * @param AppJars <p>spark 作业依赖jar包（--jars），以逗号分隔</p>
     */
    public void setAppJars(String AppJars) {
        this.AppJars = AppJars;
    }

    /**
     * Get <p>spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p> 
     * @return IsLocalFiles <p>spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set <p>spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     * @param IsLocalFiles <p>spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get <p>spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔</p> 
     * @return AppFiles <p>spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔</p>
     */
    public String getAppFiles() {
        return this.AppFiles;
    }

    /**
     * Set <p>spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔</p>
     * @param AppFiles <p>spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔</p>
     */
    public void setAppFiles(String AppFiles) {
        this.AppFiles = AppFiles;
    }

    /**
     * Get <p>spark作业程序入参，空格分割</p> 
     * @return CmdArgs <p>spark作业程序入参，空格分割</p>
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set <p>spark作业程序入参，空格分割</p>
     * @param CmdArgs <p>spark作业程序入参，空格分割</p>
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get <p>最大重试次数，只对spark流任务生效</p> 
     * @return MaxRetries <p>最大重试次数，只对spark流任务生效</p>
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set <p>最大重试次数，只对spark流任务生效</p>
     * @param MaxRetries <p>最大重试次数，只对spark流任务生效</p>
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get <p>数据源名称</p> 
     * @return DataSource <p>数据源名称</p>
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set <p>数据源名称</p>
     * @param DataSource <p>数据源名称</p>
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get <p>pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p> 
     * @return IsLocalPythonFiles <p>pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set <p>pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     * @param IsLocalPythonFiles <p>pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get <p>pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔</p> 
     * @return AppPythonFiles <p>pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔</p>
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set <p>pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔</p>
     * @param AppPythonFiles <p>pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔</p>
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get <p>spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p> 
     * @return IsLocalArchives <p>spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set <p>spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     * @param IsLocalArchives <p>spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）</p>
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get <p>spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔</p> 
     * @return AppArchives <p>spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔</p>
     */
    public String getAppArchives() {
        return this.AppArchives;
    }

    /**
     * Set <p>spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔</p>
     * @param AppArchives <p>spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔</p>
     */
    public void setAppArchives(String AppArchives) {
        this.AppArchives = AppArchives;
    }

    /**
     * Get <p>Spark Image 版本号</p> 
     * @return SparkImage <p>Spark Image 版本号</p>
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set <p>Spark Image 版本号</p>
     * @param SparkImage <p>Spark Image 版本号</p>
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get <p>Spark Image 版本名称</p> 
     * @return SparkImageVersion <p>Spark Image 版本名称</p>
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set <p>Spark Image 版本名称</p>
     * @param SparkImageVersion <p>Spark Image 版本名称</p>
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums</p> 
     * @return AppExecutorMaxNumbers <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums</p>
     */
    public Long getAppExecutorMaxNumbers() {
        return this.AppExecutorMaxNumbers;
    }

    /**
     * Set <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums</p>
     * @param AppExecutorMaxNumbers <p>指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums</p>
     */
    public void setAppExecutorMaxNumbers(Long AppExecutorMaxNumbers) {
        this.AppExecutorMaxNumbers = AppExecutorMaxNumbers;
    }

    /**
     * Get <p>关联dlc查询脚本id</p> 
     * @return SessionId <p>关联dlc查询脚本id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>关联dlc查询脚本id</p>
     * @param SessionId <p>关联dlc查询脚本id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p> 
     * @return IsInherit <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
     * @param IsInherit <p>任务资源配置是否继承集群模板，0（默认）不继承，1：继承</p>
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get <p>是否使用session脚本的sql运行任务：false：否，true：是</p> 
     * @return IsSessionStarted <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
     * @param IsSessionStarted <p>是否使用session脚本的sql运行任务：false：否，true：是</p>
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
    }

    /**
     * Get <p>依赖包信息</p> 
     * @return DependencyPackages <p>依赖包信息</p>
     */
    public DependencyPackage [] getDependencyPackages() {
        return this.DependencyPackages;
    }

    /**
     * Set <p>依赖包信息</p>
     * @param DependencyPackages <p>依赖包信息</p>
     */
    public void setDependencyPackages(DependencyPackage [] DependencyPackages) {
        this.DependencyPackages = DependencyPackages;
    }

    public CreateSparkAppForTDLCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkAppForTDLCRequest(CreateSparkAppForTDLCRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.AppFile != null) {
            this.AppFile = new String(source.AppFile);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new Long(source.RoleArn);
        }
        if (source.AppDriverSize != null) {
            this.AppDriverSize = new String(source.AppDriverSize);
        }
        if (source.AppExecutorSize != null) {
            this.AppExecutorSize = new String(source.AppExecutorSize);
        }
        if (source.AppExecutorNums != null) {
            this.AppExecutorNums = new Long(source.AppExecutorNums);
        }
        if (source.Eni != null) {
            this.Eni = new String(source.Eni);
        }
        if (source.IsLocal != null) {
            this.IsLocal = new String(source.IsLocal);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.AppConf != null) {
            this.AppConf = new String(source.AppConf);
        }
        if (source.IsLocalJars != null) {
            this.IsLocalJars = new String(source.IsLocalJars);
        }
        if (source.AppJars != null) {
            this.AppJars = new String(source.AppJars);
        }
        if (source.IsLocalFiles != null) {
            this.IsLocalFiles = new String(source.IsLocalFiles);
        }
        if (source.AppFiles != null) {
            this.AppFiles = new String(source.AppFiles);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.MaxRetries != null) {
            this.MaxRetries = new Long(source.MaxRetries);
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
        if (source.AppArchives != null) {
            this.AppArchives = new String(source.AppArchives);
        }
        if (source.SparkImage != null) {
            this.SparkImage = new String(source.SparkImage);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.AppExecutorMaxNumbers != null) {
            this.AppExecutorMaxNumbers = new Long(source.AppExecutorMaxNumbers);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
        if (source.IsSessionStarted != null) {
            this.IsSessionStarted = new Boolean(source.IsSessionStarted);
        }
        if (source.DependencyPackages != null) {
            this.DependencyPackages = new DependencyPackage[source.DependencyPackages.length];
            for (int i = 0; i < source.DependencyPackages.length; i++) {
                this.DependencyPackages[i] = new DependencyPackage(source.DependencyPackages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "AppFile", this.AppFile);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "AppDriverSize", this.AppDriverSize);
        this.setParamSimple(map, prefix + "AppExecutorSize", this.AppExecutorSize);
        this.setParamSimple(map, prefix + "AppExecutorNums", this.AppExecutorNums);
        this.setParamSimple(map, prefix + "Eni", this.Eni);
        this.setParamSimple(map, prefix + "IsLocal", this.IsLocal);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "AppConf", this.AppConf);
        this.setParamSimple(map, prefix + "IsLocalJars", this.IsLocalJars);
        this.setParamSimple(map, prefix + "AppJars", this.AppJars);
        this.setParamSimple(map, prefix + "IsLocalFiles", this.IsLocalFiles);
        this.setParamSimple(map, prefix + "AppFiles", this.AppFiles);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IsLocalPythonFiles", this.IsLocalPythonFiles);
        this.setParamSimple(map, prefix + "AppPythonFiles", this.AppPythonFiles);
        this.setParamSimple(map, prefix + "IsLocalArchives", this.IsLocalArchives);
        this.setParamSimple(map, prefix + "AppArchives", this.AppArchives);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "AppExecutorMaxNumbers", this.AppExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "IsSessionStarted", this.IsSessionStarted);
        this.setParamArrayObj(map, prefix + "DependencyPackages.", this.DependencyPackages);

    }
}

