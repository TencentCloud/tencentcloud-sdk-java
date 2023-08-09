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

public class CreateNotebookSessionRequest extends AbstractModel{

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
    * session文件地址，当前支持：cosn://和lakefs://两种路径
    */
    @SerializedName("ProgramDependentFiles")
    @Expose
    private String [] ProgramDependentFiles;

    /**
    * 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
    */
    @SerializedName("ProgramDependentJars")
    @Expose
    private String [] ProgramDependentJars;

    /**
    * 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
    */
    @SerializedName("ProgramDependentPython")
    @Expose
    private String [] ProgramDependentPython;

    /**
    * 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
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
    * Session相关配置，当前支持：
1. dlc.eni: 用户配置的eni网关信息，可以通过该字段设置；
2. dlc.role.arn: 用户配置的roleArn鉴权策略配置信息，可以通过该字段设置；
3. dlc.sql.set.config: 用户配置的集群配置信息，可以通过该字段设置；
    */
    @SerializedName("Arguments")
    @Expose
    private KVPair [] Arguments;

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
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * 指定spark版本名称，当前任务使用该spark镜像运行
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

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
     * Get session文件地址，当前支持：cosn://和lakefs://两种路径 
     * @return ProgramDependentFiles session文件地址，当前支持：cosn://和lakefs://两种路径
     */
    public String [] getProgramDependentFiles() {
        return this.ProgramDependentFiles;
    }

    /**
     * Set session文件地址，当前支持：cosn://和lakefs://两种路径
     * @param ProgramDependentFiles session文件地址，当前支持：cosn://和lakefs://两种路径
     */
    public void setProgramDependentFiles(String [] ProgramDependentFiles) {
        this.ProgramDependentFiles = ProgramDependentFiles;
    }

    /**
     * Get 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径 
     * @return ProgramDependentJars 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
     */
    public String [] getProgramDependentJars() {
        return this.ProgramDependentJars;
    }

    /**
     * Set 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
     * @param ProgramDependentJars 依赖的jar程序地址，当前支持：cosn://和lakefs://两种路径
     */
    public void setProgramDependentJars(String [] ProgramDependentJars) {
        this.ProgramDependentJars = ProgramDependentJars;
    }

    /**
     * Get 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径 
     * @return ProgramDependentPython 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
     */
    public String [] getProgramDependentPython() {
        return this.ProgramDependentPython;
    }

    /**
     * Set 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
     * @param ProgramDependentPython 依赖的python程序地址，当前支持：cosn://和lakefs://两种路径
     */
    public void setProgramDependentPython(String [] ProgramDependentPython) {
        this.ProgramDependentPython = ProgramDependentPython;
    }

    /**
     * Get 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径 
     * @return ProgramArchives 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
     */
    public String [] getProgramArchives() {
        return this.ProgramArchives;
    }

    /**
     * Set 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
     * @param ProgramArchives 依赖的pyspark虚拟环境地址，当前支持：cosn://和lakefs://两种路径
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
     * Get Session相关配置，当前支持：
1. dlc.eni: 用户配置的eni网关信息，可以通过该字段设置；
2. dlc.role.arn: 用户配置的roleArn鉴权策略配置信息，可以通过该字段设置；
3. dlc.sql.set.config: 用户配置的集群配置信息，可以通过该字段设置； 
     * @return Arguments Session相关配置，当前支持：
1. dlc.eni: 用户配置的eni网关信息，可以通过该字段设置；
2. dlc.role.arn: 用户配置的roleArn鉴权策略配置信息，可以通过该字段设置；
3. dlc.sql.set.config: 用户配置的集群配置信息，可以通过该字段设置；
     */
    public KVPair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set Session相关配置，当前支持：
1. dlc.eni: 用户配置的eni网关信息，可以通过该字段设置；
2. dlc.role.arn: 用户配置的roleArn鉴权策略配置信息，可以通过该字段设置；
3. dlc.sql.set.config: 用户配置的集群配置信息，可以通过该字段设置；
     * @param Arguments Session相关配置，当前支持：
1. dlc.eni: 用户配置的eni网关信息，可以通过该字段设置；
2. dlc.role.arn: 用户配置的roleArn鉴权策略配置信息，可以通过该字段设置；
3. dlc.sql.set.config: 用户配置的集群配置信息，可以通过该字段设置；
     */
    public void setArguments(KVPair [] Arguments) {
        this.Arguments = Arguments;
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
     * Get 指定spark版本名称，当前任务使用该spark镜像运行 
     * @return SparkImage 指定spark版本名称，当前任务使用该spark镜像运行
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set 指定spark版本名称，当前任务使用该spark镜像运行
     * @param SparkImage 指定spark版本名称，当前任务使用该spark镜像运行
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get 是否继承集群的资源类配置：0：自定义（默认），1：继承集群； 
     * @return IsInherit 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     * @param IsInherit 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    public CreateNotebookSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookSessionRequest(CreateNotebookSessionRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
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
        if (source.Arguments != null) {
            this.Arguments = new KVPair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new KVPair(source.Arguments[i]);
            }
        }
        if (source.ProxyUser != null) {
            this.ProxyUser = new String(source.ProxyUser);
        }
        if (source.TimeoutInSecond != null) {
            this.TimeoutInSecond = new Long(source.TimeoutInSecond);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.SparkImage != null) {
            this.SparkImage = new String(source.SparkImage);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArraySimple(map, prefix + "ProgramDependentFiles.", this.ProgramDependentFiles);
        this.setParamArraySimple(map, prefix + "ProgramDependentJars.", this.ProgramDependentJars);
        this.setParamArraySimple(map, prefix + "ProgramDependentPython.", this.ProgramDependentPython);
        this.setParamArraySimple(map, prefix + "ProgramArchives.", this.ProgramArchives);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);
        this.setParamSimple(map, prefix + "ProxyUser", this.ProxyUser);
        this.setParamSimple(map, prefix + "TimeoutInSecond", this.TimeoutInSecond);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);

    }
}

