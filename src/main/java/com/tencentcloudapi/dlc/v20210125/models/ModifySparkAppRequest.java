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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySparkAppRequest extends AbstractModel{

    /**
    * spark作业名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * spark作业类型，1代表spark jar作业，2代表spark streaming作业
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * 执行spark作业的数据引擎名称
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * spark作业程序包文件路径
    */
    @SerializedName("AppFile")
    @Expose
    private String AppFile;

    /**
    * 数据访问策略，CAM Role arn
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
    */
    @SerializedName("AppExecutorSize")
    @Expose
    private String AppExecutorSize;

    /**
    * spark作业executor个数
    */
    @SerializedName("AppExecutorNums")
    @Expose
    private Long AppExecutorNums;

    /**
    * spark作业Id
    */
    @SerializedName("SparkAppId")
    @Expose
    private String SparkAppId;

    /**
    * 该字段已下线，请使用字段Datasource
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * spark作业主类
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * spark配置，以换行符分隔
    */
    @SerializedName("AppConf")
    @Expose
    private String AppConf;

    /**
    * spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * spark 作业依赖jar包（--jars），以逗号分隔
    */
    @SerializedName("AppJars")
    @Expose
    private String AppJars;

    /**
    * spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔
    */
    @SerializedName("AppFiles")
    @Expose
    private String AppFiles;

    /**
    * pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * spark作业程序入参
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * 最大重试次数，只对spark流任务生效
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * 数据源名
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔
    */
    @SerializedName("AppArchives")
    @Expose
    private String AppArchives;

    /**
    * Spark Image 版本号
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * Spark Image 版本名称
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
    */
    @SerializedName("AppExecutorMaxNumbers")
    @Expose
    private Long AppExecutorMaxNumbers;

    /**
    * 关联dlc查询脚本
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 任务资源配置是否继承集群配置模板：0（默认）不继承、1：继承
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * 是否使用session脚本的sql运行任务：false：否，true：是
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
     * Get spark作业名 
     * @return AppName spark作业名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set spark作业名
     * @param AppName spark作业名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get spark作业类型，1代表spark jar作业，2代表spark streaming作业 
     * @return AppType spark作业类型，1代表spark jar作业，2代表spark streaming作业
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set spark作业类型，1代表spark jar作业，2代表spark streaming作业
     * @param AppType spark作业类型，1代表spark jar作业，2代表spark streaming作业
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 执行spark作业的数据引擎名称 
     * @return DataEngine 执行spark作业的数据引擎名称
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 执行spark作业的数据引擎名称
     * @param DataEngine 执行spark作业的数据引擎名称
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get spark作业程序包文件路径 
     * @return AppFile spark作业程序包文件路径
     */
    public String getAppFile() {
        return this.AppFile;
    }

    /**
     * Set spark作业程序包文件路径
     * @param AppFile spark作业程序包文件路径
     */
    public void setAppFile(String AppFile) {
        this.AppFile = AppFile;
    }

    /**
     * Get 数据访问策略，CAM Role arn 
     * @return RoleArn 数据访问策略，CAM Role arn
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 数据访问策略，CAM Role arn
     * @param RoleArn 数据访问策略，CAM Role arn
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu） 
     * @return AppDriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param AppDriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu） 
     * @return AppExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param AppExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setAppExecutorSize(String AppExecutorSize) {
        this.AppExecutorSize = AppExecutorSize;
    }

    /**
     * Get spark作业executor个数 
     * @return AppExecutorNums spark作业executor个数
     */
    public Long getAppExecutorNums() {
        return this.AppExecutorNums;
    }

    /**
     * Set spark作业executor个数
     * @param AppExecutorNums spark作业executor个数
     */
    public void setAppExecutorNums(Long AppExecutorNums) {
        this.AppExecutorNums = AppExecutorNums;
    }

    /**
     * Get spark作业Id 
     * @return SparkAppId spark作业Id
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set spark作业Id
     * @param SparkAppId spark作业Id
     */
    public void setSparkAppId(String SparkAppId) {
        this.SparkAppId = SparkAppId;
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
     * Get spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocal spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     * @param IsLocal spark作业程序包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get spark作业主类 
     * @return MainClass spark作业主类
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set spark作业主类
     * @param MainClass spark作业主类
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get spark配置，以换行符分隔 
     * @return AppConf spark配置，以换行符分隔
     */
    public String getAppConf() {
        return this.AppConf;
    }

    /**
     * Set spark配置，以换行符分隔
     * @param AppConf spark配置，以换行符分隔
     */
    public void setAppConf(String AppConf) {
        this.AppConf = AppConf;
    }

    /**
     * Get spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocalJars spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     * @param IsLocalJars spark 作业依赖jar包是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get spark 作业依赖jar包（--jars），以逗号分隔 
     * @return AppJars spark 作业依赖jar包（--jars），以逗号分隔
     */
    public String getAppJars() {
        return this.AppJars;
    }

    /**
     * Set spark 作业依赖jar包（--jars），以逗号分隔
     * @param AppJars spark 作业依赖jar包（--jars），以逗号分隔
     */
    public void setAppJars(String AppJars) {
        this.AppJars = AppJars;
    }

    /**
     * Get spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocalFiles spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     * @param IsLocalFiles spark作业依赖文件资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔 
     * @return AppFiles spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔
     */
    public String getAppFiles() {
        return this.AppFiles;
    }

    /**
     * Set spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔
     * @param AppFiles spark作业依赖文件资源（--files）（非jar、zip），以逗号分隔
     */
    public void setAppFiles(String AppFiles) {
        this.AppFiles = AppFiles;
    }

    /**
     * Get pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocalPythonFiles pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     * @param IsLocalPythonFiles pyspark：依赖上传方式，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔 
     * @return AppPythonFiles pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔
     * @param AppPythonFiles pyspark作业依赖python资源（--py-files），支持py/zip/egg等归档格式，多文件以逗号分隔
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get spark作业程序入参 
     * @return CmdArgs spark作业程序入参
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set spark作业程序入参
     * @param CmdArgs spark作业程序入参
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 最大重试次数，只对spark流任务生效 
     * @return MaxRetries 最大重试次数，只对spark流任务生效
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set 最大重试次数，只对spark流任务生效
     * @param MaxRetries 最大重试次数，只对spark流任务生效
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get 数据源名 
     * @return DataSource 数据源名
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据源名
     * @param DataSource 数据源名
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocalArchives spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     * @param IsLocalArchives spark作业依赖archives资源是否本地上传，cos：存放与cos，lakefs：本地上传（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔 
     * @return AppArchives spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔
     */
    public String getAppArchives() {
        return this.AppArchives;
    }

    /**
     * Set spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔
     * @param AppArchives spark作业依赖archives资源（--archives），支持tar.gz/tgz/tar等归档格式，以逗号分隔
     */
    public void setAppArchives(String AppArchives) {
        this.AppArchives = AppArchives;
    }

    /**
     * Get Spark Image 版本号 
     * @return SparkImage Spark Image 版本号
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set Spark Image 版本号
     * @param SparkImage Spark Image 版本号
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get Spark Image 版本名称 
     * @return SparkImageVersion Spark Image 版本名称
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set Spark Image 版本名称
     * @param SparkImageVersion Spark Image 版本名称
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums 
     * @return AppExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     */
    public Long getAppExecutorMaxNumbers() {
        return this.AppExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     * @param AppExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     */
    public void setAppExecutorMaxNumbers(Long AppExecutorMaxNumbers) {
        this.AppExecutorMaxNumbers = AppExecutorMaxNumbers;
    }

    /**
     * Get 关联dlc查询脚本 
     * @return SessionId 关联dlc查询脚本
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 关联dlc查询脚本
     * @param SessionId 关联dlc查询脚本
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 任务资源配置是否继承集群配置模板：0（默认）不继承、1：继承 
     * @return IsInherit 任务资源配置是否继承集群配置模板：0（默认）不继承、1：继承
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 任务资源配置是否继承集群配置模板：0（默认）不继承、1：继承
     * @param IsInherit 任务资源配置是否继承集群配置模板：0（默认）不继承、1：继承
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get 是否使用session脚本的sql运行任务：false：否，true：是 
     * @return IsSessionStarted 是否使用session脚本的sql运行任务：false：否，true：是
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set 是否使用session脚本的sql运行任务：false：否，true：是
     * @param IsSessionStarted 是否使用session脚本的sql运行任务：false：否，true：是
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
    }

    public ModifySparkAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySparkAppRequest(ModifySparkAppRequest source) {
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
        if (source.SparkAppId != null) {
            this.SparkAppId = new String(source.SparkAppId);
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
        if (source.IsLocalPythonFiles != null) {
            this.IsLocalPythonFiles = new String(source.IsLocalPythonFiles);
        }
        if (source.AppPythonFiles != null) {
            this.AppPythonFiles = new String(source.AppPythonFiles);
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
        this.setParamSimple(map, prefix + "SparkAppId", this.SparkAppId);
        this.setParamSimple(map, prefix + "Eni", this.Eni);
        this.setParamSimple(map, prefix + "IsLocal", this.IsLocal);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "AppConf", this.AppConf);
        this.setParamSimple(map, prefix + "IsLocalJars", this.IsLocalJars);
        this.setParamSimple(map, prefix + "AppJars", this.AppJars);
        this.setParamSimple(map, prefix + "IsLocalFiles", this.IsLocalFiles);
        this.setParamSimple(map, prefix + "AppFiles", this.AppFiles);
        this.setParamSimple(map, prefix + "IsLocalPythonFiles", this.IsLocalPythonFiles);
        this.setParamSimple(map, prefix + "AppPythonFiles", this.AppPythonFiles);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IsLocalArchives", this.IsLocalArchives);
        this.setParamSimple(map, prefix + "AppArchives", this.AppArchives);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "AppExecutorMaxNumbers", this.AppExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "IsSessionStarted", this.IsSessionStarted);

    }
}

