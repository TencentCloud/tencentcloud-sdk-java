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

public class CreateSparkAppRequest extends AbstractModel{

    /**
    * spark应用名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 1代表spark jar应用，2代表spark streaming应用
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * 执行spark作业的数据引擎
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * spark应用的执行入口
    */
    @SerializedName("AppFile")
    @Expose
    private String AppFile;

    /**
    * 执行spark作业的角色ID
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * spark作业driver资源规格大小, 可取small,medium,large,xlarge
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * spark作业executor资源规格大小, 可取small,medium,large,xlarge
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
    * 该字段已下线，请使用字段Datasource
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * 是否本地上传，可去cos,lakefs
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * spark jar作业时的主类
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
    * 是否本地上传，包含cos,lakefs
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * spark jar作业依赖jars，以逗号分隔
    */
    @SerializedName("AppJars")
    @Expose
    private String AppJars;

    /**
    * 是否本地上传，包含cos,lakefs
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * spark作业依赖资源，以逗号分隔
    */
    @SerializedName("AppFiles")
    @Expose
    private String AppFiles;

    /**
    * spark作业命令行参数
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * 只对spark流任务生效
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
    * pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
     * Get spark应用名 
     * @return AppName spark应用名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set spark应用名
     * @param AppName spark应用名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 1代表spark jar应用，2代表spark streaming应用 
     * @return AppType 1代表spark jar应用，2代表spark streaming应用
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set 1代表spark jar应用，2代表spark streaming应用
     * @param AppType 1代表spark jar应用，2代表spark streaming应用
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 执行spark作业的数据引擎 
     * @return DataEngine 执行spark作业的数据引擎
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 执行spark作业的数据引擎
     * @param DataEngine 执行spark作业的数据引擎
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get spark应用的执行入口 
     * @return AppFile spark应用的执行入口
     */
    public String getAppFile() {
        return this.AppFile;
    }

    /**
     * Set spark应用的执行入口
     * @param AppFile spark应用的执行入口
     */
    public void setAppFile(String AppFile) {
        this.AppFile = AppFile;
    }

    /**
     * Get 执行spark作业的角色ID 
     * @return RoleArn 执行spark作业的角色ID
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 执行spark作业的角色ID
     * @param RoleArn 执行spark作业的角色ID
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get spark作业driver资源规格大小, 可取small,medium,large,xlarge 
     * @return AppDriverSize spark作业driver资源规格大小, 可取small,medium,large,xlarge
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set spark作业driver资源规格大小, 可取small,medium,large,xlarge
     * @param AppDriverSize spark作业driver资源规格大小, 可取small,medium,large,xlarge
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get spark作业executor资源规格大小, 可取small,medium,large,xlarge 
     * @return AppExecutorSize spark作业executor资源规格大小, 可取small,medium,large,xlarge
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set spark作业executor资源规格大小, 可取small,medium,large,xlarge
     * @param AppExecutorSize spark作业executor资源规格大小, 可取small,medium,large,xlarge
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
     * Get 是否本地上传，可去cos,lakefs 
     * @return IsLocal 是否本地上传，可去cos,lakefs
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set 是否本地上传，可去cos,lakefs
     * @param IsLocal 是否本地上传，可去cos,lakefs
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get spark jar作业时的主类 
     * @return MainClass spark jar作业时的主类
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set spark jar作业时的主类
     * @param MainClass spark jar作业时的主类
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
     * Get 是否本地上传，包含cos,lakefs 
     * @return IsLocalJars 是否本地上传，包含cos,lakefs
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set 是否本地上传，包含cos,lakefs
     * @param IsLocalJars 是否本地上传，包含cos,lakefs
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get spark jar作业依赖jars，以逗号分隔 
     * @return AppJars spark jar作业依赖jars，以逗号分隔
     */
    public String getAppJars() {
        return this.AppJars;
    }

    /**
     * Set spark jar作业依赖jars，以逗号分隔
     * @param AppJars spark jar作业依赖jars，以逗号分隔
     */
    public void setAppJars(String AppJars) {
        this.AppJars = AppJars;
    }

    /**
     * Get 是否本地上传，包含cos,lakefs 
     * @return IsLocalFiles 是否本地上传，包含cos,lakefs
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set 是否本地上传，包含cos,lakefs
     * @param IsLocalFiles 是否本地上传，包含cos,lakefs
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get spark作业依赖资源，以逗号分隔 
     * @return AppFiles spark作业依赖资源，以逗号分隔
     */
    public String getAppFiles() {
        return this.AppFiles;
    }

    /**
     * Set spark作业依赖资源，以逗号分隔
     * @param AppFiles spark作业依赖资源，以逗号分隔
     */
    public void setAppFiles(String AppFiles) {
        this.AppFiles = AppFiles;
    }

    /**
     * Get spark作业命令行参数 
     * @return CmdArgs spark作业命令行参数
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set spark作业命令行参数
     * @param CmdArgs spark作业命令行参数
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 只对spark流任务生效 
     * @return MaxRetries 只对spark流任务生效
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set 只对spark流任务生效
     * @param MaxRetries 只对spark流任务生效
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
     * Get pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用） 
     * @return IsLocalPythonFiles pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
     * @param IsLocalPythonFiles pyspark：依赖上传方式，1、cos；2、lakefs（控制台使用，该方式不支持直接接口调用）
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔 
     * @return AppPythonFiles pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
     * @param AppPythonFiles pyspark：python依赖, 除py文件外，还支持zip/egg等归档格式，多文件以逗号分隔
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    public CreateSparkAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkAppRequest(CreateSparkAppRequest source) {
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

    }
}

