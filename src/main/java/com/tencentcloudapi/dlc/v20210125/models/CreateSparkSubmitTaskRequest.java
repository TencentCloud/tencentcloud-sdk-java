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

public class CreateSparkSubmitTaskRequest extends AbstractModel {

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型：当前支持1: BatchType, 2: StreamingType, 4: SQLType
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 引擎名称，当前仅支持Spark批作业集群
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 指定运行的程序脚本路径，当前仅支持jar和py，对于SQLType该值设为空字符串
    */
    @SerializedName("PackagePath")
    @Expose
    private String PackagePath;

    /**
    * 指定的鉴权信息
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * 运行任务所需资源是否继承自集群上配置资源信息，0（默认，不继承）、1（继承，当设置为该值，则任务级资源配置可不额外指定）
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * jar任务时需要指定主程序
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 当前DriverSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * 当前ExecutorSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定使用的executor数量，最小为1
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private Long ExecutorNumbers;

    /**
    * 指定使用的executor最大数量, 当该值大于ExecutorNums则自动开启动态
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * 提交任务的附加配置集合，当前支持Key包含：MAINARGS：程序入口参数，空格分割(SqlType任务通过该值指定base64加密后的sql)、SPARKCONFIG：Spark配置，以换行符分隔、ENI：Eni连接信息、DEPENDENCYPACKAGEPATH：依赖的程序包（--jars、--py-files:支持py/zip/egg等归档格式），多文件以逗号分隔、DEPENDENCYFILEPATH：依赖文件资源（--files: 非jar、zip），多文件以逗号分隔、DEPENDENCYARCHIVESPATH：依赖archives资源（--archives: 支持tar.gz/tgz/tar等归档格式)，多文件以逗号分隔、MAXRETRIES：任务重试次数，非流任务默认为1、SPARKIMAGE：Spark镜像版本号，支持使用dlc镜像/用户自定的tcr镜像运行任务、SPARKIMAGEVERSION：Spark镜像版本名称，与SPARKIMAGE一一对应；SPARKPRESETCODE：base64后的notebook预置代码；SPARKENV：base64后的spark环境变量；SPARKGITINFO：base64后的git相关信息
    */
    @SerializedName("CmdArgs")
    @Expose
    private KVPair [] CmdArgs;

    /**
    * 任务来源信息
    */
    @SerializedName("SourceInfo")
    @Expose
    private KVPair [] SourceInfo;

    /**
    * ai资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型：当前支持1: BatchType, 2: StreamingType, 4: SQLType 
     * @return TaskType 任务类型：当前支持1: BatchType, 2: StreamingType, 4: SQLType
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型：当前支持1: BatchType, 2: StreamingType, 4: SQLType
     * @param TaskType 任务类型：当前支持1: BatchType, 2: StreamingType, 4: SQLType
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 引擎名称，当前仅支持Spark批作业集群 
     * @return DataEngineName 引擎名称，当前仅支持Spark批作业集群
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名称，当前仅支持Spark批作业集群
     * @param DataEngineName 引擎名称，当前仅支持Spark批作业集群
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 指定运行的程序脚本路径，当前仅支持jar和py，对于SQLType该值设为空字符串 
     * @return PackagePath 指定运行的程序脚本路径，当前仅支持jar和py，对于SQLType该值设为空字符串
     */
    public String getPackagePath() {
        return this.PackagePath;
    }

    /**
     * Set 指定运行的程序脚本路径，当前仅支持jar和py，对于SQLType该值设为空字符串
     * @param PackagePath 指定运行的程序脚本路径，当前仅支持jar和py，对于SQLType该值设为空字符串
     */
    public void setPackagePath(String PackagePath) {
        this.PackagePath = PackagePath;
    }

    /**
     * Get 指定的鉴权信息 
     * @return RoleArn 指定的鉴权信息
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 指定的鉴权信息
     * @param RoleArn 指定的鉴权信息
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 运行任务所需资源是否继承自集群上配置资源信息，0（默认，不继承）、1（继承，当设置为该值，则任务级资源配置可不额外指定） 
     * @return IsInherit 运行任务所需资源是否继承自集群上配置资源信息，0（默认，不继承）、1（继承，当设置为该值，则任务级资源配置可不额外指定）
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 运行任务所需资源是否继承自集群上配置资源信息，0（默认，不继承）、1（继承，当设置为该值，则任务级资源配置可不额外指定）
     * @param IsInherit 运行任务所需资源是否继承自集群上配置资源信息，0（默认，不继承）、1（继承，当设置为该值，则任务级资源配置可不额外指定）
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get jar任务时需要指定主程序 
     * @return MainClass jar任务时需要指定主程序
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set jar任务时需要指定主程序
     * @param MainClass jar任务时需要指定主程序
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 当前DriverSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge 
     * @return DriverSize 当前DriverSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set 当前DriverSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     * @param DriverSize 当前DriverSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get 当前ExecutorSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge 
     * @return ExecutorSize 当前ExecutorSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set 当前ExecutorSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     * @param ExecutorSize 当前ExecutorSize规格仅支持（内存型集群则使用m前缀的枚举值）: small/medium/large/xlarge/m.small/m.medium/m.large/m.xlarge
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定使用的executor数量，最小为1 
     * @return ExecutorNumbers 指定使用的executor数量，最小为1
     */
    public Long getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set 指定使用的executor数量，最小为1
     * @param ExecutorNumbers 指定使用的executor数量，最小为1
     */
    public void setExecutorNumbers(Long ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get 指定使用的executor最大数量, 当该值大于ExecutorNums则自动开启动态 
     * @return ExecutorMaxNumbers 指定使用的executor最大数量, 当该值大于ExecutorNums则自动开启动态
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定使用的executor最大数量, 当该值大于ExecutorNums则自动开启动态
     * @param ExecutorMaxNumbers 指定使用的executor最大数量, 当该值大于ExecutorNums则自动开启动态
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get 提交任务的附加配置集合，当前支持Key包含：MAINARGS：程序入口参数，空格分割(SqlType任务通过该值指定base64加密后的sql)、SPARKCONFIG：Spark配置，以换行符分隔、ENI：Eni连接信息、DEPENDENCYPACKAGEPATH：依赖的程序包（--jars、--py-files:支持py/zip/egg等归档格式），多文件以逗号分隔、DEPENDENCYFILEPATH：依赖文件资源（--files: 非jar、zip），多文件以逗号分隔、DEPENDENCYARCHIVESPATH：依赖archives资源（--archives: 支持tar.gz/tgz/tar等归档格式)，多文件以逗号分隔、MAXRETRIES：任务重试次数，非流任务默认为1、SPARKIMAGE：Spark镜像版本号，支持使用dlc镜像/用户自定的tcr镜像运行任务、SPARKIMAGEVERSION：Spark镜像版本名称，与SPARKIMAGE一一对应；SPARKPRESETCODE：base64后的notebook预置代码；SPARKENV：base64后的spark环境变量；SPARKGITINFO：base64后的git相关信息 
     * @return CmdArgs 提交任务的附加配置集合，当前支持Key包含：MAINARGS：程序入口参数，空格分割(SqlType任务通过该值指定base64加密后的sql)、SPARKCONFIG：Spark配置，以换行符分隔、ENI：Eni连接信息、DEPENDENCYPACKAGEPATH：依赖的程序包（--jars、--py-files:支持py/zip/egg等归档格式），多文件以逗号分隔、DEPENDENCYFILEPATH：依赖文件资源（--files: 非jar、zip），多文件以逗号分隔、DEPENDENCYARCHIVESPATH：依赖archives资源（--archives: 支持tar.gz/tgz/tar等归档格式)，多文件以逗号分隔、MAXRETRIES：任务重试次数，非流任务默认为1、SPARKIMAGE：Spark镜像版本号，支持使用dlc镜像/用户自定的tcr镜像运行任务、SPARKIMAGEVERSION：Spark镜像版本名称，与SPARKIMAGE一一对应；SPARKPRESETCODE：base64后的notebook预置代码；SPARKENV：base64后的spark环境变量；SPARKGITINFO：base64后的git相关信息
     */
    public KVPair [] getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set 提交任务的附加配置集合，当前支持Key包含：MAINARGS：程序入口参数，空格分割(SqlType任务通过该值指定base64加密后的sql)、SPARKCONFIG：Spark配置，以换行符分隔、ENI：Eni连接信息、DEPENDENCYPACKAGEPATH：依赖的程序包（--jars、--py-files:支持py/zip/egg等归档格式），多文件以逗号分隔、DEPENDENCYFILEPATH：依赖文件资源（--files: 非jar、zip），多文件以逗号分隔、DEPENDENCYARCHIVESPATH：依赖archives资源（--archives: 支持tar.gz/tgz/tar等归档格式)，多文件以逗号分隔、MAXRETRIES：任务重试次数，非流任务默认为1、SPARKIMAGE：Spark镜像版本号，支持使用dlc镜像/用户自定的tcr镜像运行任务、SPARKIMAGEVERSION：Spark镜像版本名称，与SPARKIMAGE一一对应；SPARKPRESETCODE：base64后的notebook预置代码；SPARKENV：base64后的spark环境变量；SPARKGITINFO：base64后的git相关信息
     * @param CmdArgs 提交任务的附加配置集合，当前支持Key包含：MAINARGS：程序入口参数，空格分割(SqlType任务通过该值指定base64加密后的sql)、SPARKCONFIG：Spark配置，以换行符分隔、ENI：Eni连接信息、DEPENDENCYPACKAGEPATH：依赖的程序包（--jars、--py-files:支持py/zip/egg等归档格式），多文件以逗号分隔、DEPENDENCYFILEPATH：依赖文件资源（--files: 非jar、zip），多文件以逗号分隔、DEPENDENCYARCHIVESPATH：依赖archives资源（--archives: 支持tar.gz/tgz/tar等归档格式)，多文件以逗号分隔、MAXRETRIES：任务重试次数，非流任务默认为1、SPARKIMAGE：Spark镜像版本号，支持使用dlc镜像/用户自定的tcr镜像运行任务、SPARKIMAGEVERSION：Spark镜像版本名称，与SPARKIMAGE一一对应；SPARKPRESETCODE：base64后的notebook预置代码；SPARKENV：base64后的spark环境变量；SPARKGITINFO：base64后的git相关信息
     */
    public void setCmdArgs(KVPair [] CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 任务来源信息 
     * @return SourceInfo 任务来源信息
     */
    public KVPair [] getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 任务来源信息
     * @param SourceInfo 任务来源信息
     */
    public void setSourceInfo(KVPair [] SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get ai资源组名称 
     * @return ResourceGroupName ai资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set ai资源组名称
     * @param ResourceGroupName ai资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public CreateSparkSubmitTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkSubmitTaskRequest(CreateSparkSubmitTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.PackagePath != null) {
            this.PackagePath = new String(source.PackagePath);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new Long(source.RoleArn);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
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
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new KVPair[source.CmdArgs.length];
            for (int i = 0; i < source.CmdArgs.length; i++) {
                this.CmdArgs[i] = new KVPair(source.CmdArgs[i]);
            }
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new KVPair[source.SourceInfo.length];
            for (int i = 0; i < source.SourceInfo.length; i++) {
                this.SourceInfo[i] = new KVPair(source.SourceInfo[i]);
            }
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "PackagePath", this.PackagePath);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamArrayObj(map, prefix + "CmdArgs.", this.CmdArgs);
        this.setParamArrayObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

