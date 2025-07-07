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

public class NotebookSessionInfo extends AbstractModel {

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
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定的Executor数量，默认为1
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private Long ExecutorNumbers;

    /**
    * 代理用户，默认为root
    */
    @SerializedName("ProxyUser")
    @Expose
    private String ProxyUser;

    /**
    * 指定的Session超时时间，单位秒，默认3600秒
    */
    @SerializedName("TimeoutInSecond")
    @Expose
    private Long TimeoutInSecond;

    /**
    * Spark任务返回的AppId
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
    */
    @SerializedName("SparkUiUrl")
    @Expose
    private String SparkUiUrl;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * session类型，group：资源组下session independent：独立资源session， 不依赖资源组
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * session，pod大小
    */
    @SerializedName("PodSize")
    @Expose
    private Long PodSize;

    /**
    * pod数量
    */
    @SerializedName("PodNumbers")
    @Expose
    private Long PodNumbers;

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
     * @return DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu） 
     * @return ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定的Executor数量，默认为1 
     * @return ExecutorNumbers 指定的Executor数量，默认为1
     */
    public Long getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set 指定的Executor数量，默认为1
     * @param ExecutorNumbers 指定的Executor数量，默认为1
     */
    public void setExecutorNumbers(Long ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get 代理用户，默认为root 
     * @return ProxyUser 代理用户，默认为root
     */
    public String getProxyUser() {
        return this.ProxyUser;
    }

    /**
     * Set 代理用户，默认为root
     * @param ProxyUser 代理用户，默认为root
     */
    public void setProxyUser(String ProxyUser) {
        this.ProxyUser = ProxyUser;
    }

    /**
     * Get 指定的Session超时时间，单位秒，默认3600秒 
     * @return TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
     */
    public Long getTimeoutInSecond() {
        return this.TimeoutInSecond;
    }

    /**
     * Set 指定的Session超时时间，单位秒，默认3600秒
     * @param TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
     */
    public void setTimeoutInSecond(Long TimeoutInSecond) {
        this.TimeoutInSecond = TimeoutInSecond;
    }

    /**
     * Get Spark任务返回的AppId 
     * @return SparkAppId Spark任务返回的AppId
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set Spark任务返回的AppId
     * @param SparkAppId Spark任务返回的AppId
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
     * @return SparkUiUrl Spark ui地址
     */
    public String getSparkUiUrl() {
        return this.SparkUiUrl;
    }

    /**
     * Set Spark ui地址
     * @param SparkUiUrl Spark ui地址
     */
    public void setSparkUiUrl(String SparkUiUrl) {
        this.SparkUiUrl = SparkUiUrl;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers 
     * @return ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     * @param ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get session类型，group：资源组下session independent：独立资源session， 不依赖资源组 
     * @return SessionType session类型，group：资源组下session independent：独立资源session， 不依赖资源组
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set session类型，group：资源组下session independent：独立资源session， 不依赖资源组
     * @param SessionType session类型，group：资源组下session independent：独立资源session， 不依赖资源组
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组名称 
     * @return ResourceGroupName 资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称
     * @param ResourceGroupName 资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get session，pod大小 
     * @return PodSize session，pod大小
     */
    public Long getPodSize() {
        return this.PodSize;
    }

    /**
     * Set session，pod大小
     * @param PodSize session，pod大小
     */
    public void setPodSize(Long PodSize) {
        this.PodSize = PodSize;
    }

    /**
     * Get pod数量 
     * @return PodNumbers pod数量
     */
    public Long getPodNumbers() {
        return this.PodNumbers;
    }

    /**
     * Set pod数量
     * @param PodNumbers pod数量
     */
    public void setPodNumbers(Long PodNumbers) {
        this.PodNumbers = PodNumbers;
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
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.PodSize != null) {
            this.PodSize = new Long(source.PodSize);
        }
        if (source.PodNumbers != null) {
            this.PodNumbers = new Long(source.PodNumbers);
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
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "PodSize", this.PodSize);
        this.setParamSimple(map, prefix + "PodNumbers", this.PodNumbers);

    }
}

