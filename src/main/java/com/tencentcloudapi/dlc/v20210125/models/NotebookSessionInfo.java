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

public class NotebookSessionInfo extends AbstractModel{

    /**
    * Session名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型，当前支持：spark、pyspark、sparkr、sql
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * DLC Spark作业引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Session相关配置，当前支持：eni、roleArn以及用户指定的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Arguments")
    @Expose
    private KVPair [] Arguments;

    /**
    * 运行程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramDependentFiles")
    @Expose
    private String [] ProgramDependentFiles;

    /**
    * 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramDependentJars")
    @Expose
    private String [] ProgramDependentJars;

    /**
    * 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramDependentPython")
    @Expose
    private String [] ProgramDependentPython;

    /**
    * 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramArchives")
    @Expose
    private String [] ProgramArchives;

    /**
    * 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定的Executor数量，默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private Long ExecutorNumbers;

    /**
    * 代理用户，默认为root
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyUser")
    @Expose
    private String ProxyUser;

    /**
    * 指定的Session超时时间，单位秒，默认3600秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutInSecond")
    @Expose
    private Long TimeoutInSecond;

    /**
    * Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkAppId")
    @Expose
    private String SparkAppId;

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Session创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 其它信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppInfo")
    @Expose
    private KVPair [] AppInfo;

    /**
    * Spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkUiUrl")
    @Expose
    private String SparkUiUrl;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
     * Get Session名称 
     * @return Name Session名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Session名称
     * @param Name Session名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型，当前支持：spark、pyspark、sparkr、sql 
     * @return Kind 类型，当前支持：spark、pyspark、sparkr、sql
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 类型，当前支持：spark、pyspark、sparkr、sql
     * @param Kind 类型，当前支持：spark、pyspark、sparkr、sql
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get DLC Spark作业引擎名称 
     * @return DataEngineName DLC Spark作业引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DLC Spark作业引擎名称
     * @param DataEngineName DLC Spark作业引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Session相关配置，当前支持：eni、roleArn以及用户指定的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Arguments Session相关配置，当前支持：eni、roleArn以及用户指定的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set Session相关配置，当前支持：eni、roleArn以及用户指定的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Arguments Session相关配置，当前支持：eni、roleArn以及用户指定的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArguments(KVPair [] Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get 运行程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramDependentFiles 运行程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProgramDependentFiles() {
        return this.ProgramDependentFiles;
    }

    /**
     * Set 运行程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramDependentFiles 运行程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramDependentFiles(String [] ProgramDependentFiles) {
        this.ProgramDependentFiles = ProgramDependentFiles;
    }

    /**
     * Get 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramDependentJars 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProgramDependentJars() {
        return this.ProgramDependentJars;
    }

    /**
     * Set 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramDependentJars 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramDependentJars(String [] ProgramDependentJars) {
        this.ProgramDependentJars = ProgramDependentJars;
    }

    /**
     * Get 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramDependentPython 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProgramDependentPython() {
        return this.ProgramDependentPython;
    }

    /**
     * Set 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramDependentPython 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramDependentPython(String [] ProgramDependentPython) {
        this.ProgramDependentPython = ProgramDependentPython;
    }

    /**
     * Get 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramArchives 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProgramArchives() {
        return this.ProgramArchives;
    }

    /**
     * Set 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramArchives 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramArchives(String [] ProgramArchives) {
        this.ProgramArchives = ProgramArchives;
    }

    /**
     * Get 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定的Executor数量，默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorNumbers 指定的Executor数量，默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set 指定的Executor数量，默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorNumbers 指定的Executor数量，默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorNumbers(Long ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get 代理用户，默认为root
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyUser 代理用户，默认为root
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyUser() {
        return this.ProxyUser;
    }

    /**
     * Set 代理用户，默认为root
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyUser 代理用户，默认为root
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyUser(String ProxyUser) {
        this.ProxyUser = ProxyUser;
    }

    /**
     * Get 指定的Session超时时间，单位秒，默认3600秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutInSecond() {
        return this.TimeoutInSecond;
    }

    /**
     * Set 指定的Session超时时间，单位秒，默认3600秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutInSecond(Long TimeoutInSecond) {
        this.TimeoutInSecond = TimeoutInSecond;
    }

    /**
     * Get Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkAppId Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkAppId Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkAppId(String SparkAppId) {
        this.SparkAppId = SparkAppId;
    }

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止） 
     * @return State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     * @param State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Session创建时间 
     * @return CreateTime Session创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Session创建时间
     * @param CreateTime Session创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 其它信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppInfo 其它信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getAppInfo() {
        return this.AppInfo;
    }

    /**
     * Set 其它信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppInfo 其它信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppInfo(KVPair [] AppInfo) {
        this.AppInfo = AppInfo;
    }

    /**
     * Get Spark ui地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkUiUrl Spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkUiUrl() {
        return this.SparkUiUrl;
    }

    /**
     * Set Spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkUiUrl Spark ui地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkUiUrl(String SparkUiUrl) {
        this.SparkUiUrl = SparkUiUrl;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    public NotebookSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSessionInfo(NotebookSessionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.Arguments != null) {
            this.Arguments = new KVPair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new KVPair(source.Arguments[i]);
            }
        }
        if (source.ProgramDependentFiles != null) {
            this.ProgramDependentFiles = new String[source.ProgramDependentFiles.length];
            for (int i = 0; i < source.ProgramDependentFiles.length; i++) {
                this.ProgramDependentFiles[i] = new String(source.ProgramDependentFiles[i]);
            }
        }
        if (source.ProgramDependentJars != null) {
            this.ProgramDependentJars = new String[source.ProgramDependentJars.length];
            for (int i = 0; i < source.ProgramDependentJars.length; i++) {
                this.ProgramDependentJars[i] = new String(source.ProgramDependentJars[i]);
            }
        }
        if (source.ProgramDependentPython != null) {
            this.ProgramDependentPython = new String[source.ProgramDependentPython.length];
            for (int i = 0; i < source.ProgramDependentPython.length; i++) {
                this.ProgramDependentPython[i] = new String(source.ProgramDependentPython[i]);
            }
        }
        if (source.ProgramArchives != null) {
            this.ProgramArchives = new String[source.ProgramArchives.length];
            for (int i = 0; i < source.ProgramArchives.length; i++) {
                this.ProgramArchives[i] = new String(source.ProgramArchives[i]);
            }
        }
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNumbers != null) {
            this.ExecutorNumbers = new Long(source.ExecutorNumbers);
        }
        if (source.ProxyUser != null) {
            this.ProxyUser = new String(source.ProxyUser);
        }
        if (source.TimeoutInSecond != null) {
            this.TimeoutInSecond = new Long(source.TimeoutInSecond);
        }
        if (source.SparkAppId != null) {
            this.SparkAppId = new String(source.SparkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AppInfo != null) {
            this.AppInfo = new KVPair[source.AppInfo.length];
            for (int i = 0; i < source.AppInfo.length; i++) {
                this.AppInfo[i] = new KVPair(source.AppInfo[i]);
            }
        }
        if (source.SparkUiUrl != null) {
            this.SparkUiUrl = new String(source.SparkUiUrl);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);
        this.setParamArraySimple(map, prefix + "ProgramDependentFiles.", this.ProgramDependentFiles);
        this.setParamArraySimple(map, prefix + "ProgramDependentJars.", this.ProgramDependentJars);
        this.setParamArraySimple(map, prefix + "ProgramDependentPython.", this.ProgramDependentPython);
        this.setParamArraySimple(map, prefix + "ProgramArchives.", this.ProgramArchives);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "ProxyUser", this.ProxyUser);
        this.setParamSimple(map, prefix + "TimeoutInSecond", this.TimeoutInSecond);
        this.setParamSimple(map, prefix + "SparkAppId", this.SparkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "AppInfo.", this.AppInfo);
        this.setParamSimple(map, prefix + "SparkUiUrl", this.SparkUiUrl);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);

    }
}

