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

public class CreateJobRequest extends AbstractModel {

    /**
    * <p>作业名称，长度 ≤256；可省略，省略时服务端回退为 JobId。</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint）。MinorType=SPARK_STREAM 时必填；同一作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
    */
    @SerializedName("CheckpointLocation")
    @Expose
    private String CheckpointLocation;

    /**
    * <p>引擎大类，非必传，缺省 SPARK；当前仅支持 SPARK。</p>
    */
    @SerializedName("MajorType")
    @Expose
    private String MajorType;

    /**
    * <p>作业子类型，决定入口形态：SPARK_SQL（SQL 作业，Entrypoint.Statement 必填）/ SPARK_BATCH（批处理作业，Entrypoint.EntryFile 必填）/ SPARK_STREAM（流作业，EntryFile 与 CheckpointLocation 必填）。</p>
    */
    @SerializedName("MinorType")
    @Expose
    private String MinorType;

    /**
    * <p>工作流实例关联 ID（长度 ≤64）：同一工作流/会话的多条 SQL 作业传相同 FlowId，可共享同一 Spark 会话、复用已就绪引擎。MinorType=SPARK_SQL 时必填；FlowId 非空时必须同时传 ExecutionId。WAREHOUSE 模式下 FlowId 即会话句柄（一个 FlowId 只对应一个会话）：会话过期或已销毁后须换新 FlowId，否则返回 FailedOperation.FlowIdNotExists。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>工作流内部执行标识（长度 ≤64），同一 FlowId 下每次提交须唯一（如自增序号/UUID）。用于重复提交防重：同一账号下命中未删除的同 (FlowId, ExecutionId) 作业时返回 FailedOperation.FlowExecutionConflict。FlowId 非空时必填（SPARK_SQL 因 FlowId 必填而必填）。</p>
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>运行模式，必填。WAREHOUSE / JOB.</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>计算仓库 ID。RunMode=WAREHOUSE 时必填（仓库需处于 RUNNING，或 STOPPED 且 AutoStart 开启（提交后冷启动拉起））；RunMode=JOB 时必须为空。</p>
    */
    @SerializedName("WarehouseId")
    @Expose
    private String WarehouseId;

    /**
    * <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。RunMode=JOB 时必填；RunMode=WAREHOUSE 时忽略。</p>
    */
    @SerializedName("RuntimeCode")
    @Expose
    private String RuntimeCode;

    /**
    * <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型）。RunMode=JOB 时条件必填：未传时若可用（enabled）SysCatalog 唯一则自动选中，多个/零个报错；RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("SysCatalogVersion")
    @Expose
    private String SysCatalogVersion;

    /**
    * <p>资源分区代码，仅 RunMode=JOB 可传（QueueName 非空时必填）；RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>队列名称，必须与 PartitionCode 成对使用（RunMode=JOB 下可选）；RunMode=WAREHOUSE 下被仓库反查值覆盖，无需传。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），作为 SPARK_CUSTOM 配置通道落库，两种运行模式均生效。</p>
    */
    @SerializedName("CustomProperties")
    @Expose
    private String CustomProperties;

    /**
    * <p>环境变量（KEY=VALUE）列表。仅 RunMode=JOB 可传；RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private KVPair [] EnvVars;

    /**
     * Get <p>作业名称，长度 ≤256；可省略，省略时服务端回退为 JobId。</p> 
     * @return JobName <p>作业名称，长度 ≤256；可省略，省略时服务端回退为 JobId。</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>作业名称，长度 ≤256；可省略，省略时服务端回退为 JobId。</p>
     * @param JobName <p>作业名称，长度 ≤256；可省略，省略时服务端回退为 JobId。</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint）。MinorType=SPARK_STREAM 时必填；同一作业的多次运行必须复用同一路径，变更等于重置消费进度。</p> 
     * @return CheckpointLocation <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint）。MinorType=SPARK_STREAM 时必填；同一作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     */
    public String getCheckpointLocation() {
        return this.CheckpointLocation;
    }

    /**
     * Set <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint）。MinorType=SPARK_STREAM 时必填；同一作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     * @param CheckpointLocation <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint）。MinorType=SPARK_STREAM 时必填；同一作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     */
    public void setCheckpointLocation(String CheckpointLocation) {
        this.CheckpointLocation = CheckpointLocation;
    }

    /**
     * Get <p>引擎大类，非必传，缺省 SPARK；当前仅支持 SPARK。</p> 
     * @return MajorType <p>引擎大类，非必传，缺省 SPARK；当前仅支持 SPARK。</p>
     */
    public String getMajorType() {
        return this.MajorType;
    }

    /**
     * Set <p>引擎大类，非必传，缺省 SPARK；当前仅支持 SPARK。</p>
     * @param MajorType <p>引擎大类，非必传，缺省 SPARK；当前仅支持 SPARK。</p>
     */
    public void setMajorType(String MajorType) {
        this.MajorType = MajorType;
    }

    /**
     * Get <p>作业子类型，决定入口形态：SPARK_SQL（SQL 作业，Entrypoint.Statement 必填）/ SPARK_BATCH（批处理作业，Entrypoint.EntryFile 必填）/ SPARK_STREAM（流作业，EntryFile 与 CheckpointLocation 必填）。</p> 
     * @return MinorType <p>作业子类型，决定入口形态：SPARK_SQL（SQL 作业，Entrypoint.Statement 必填）/ SPARK_BATCH（批处理作业，Entrypoint.EntryFile 必填）/ SPARK_STREAM（流作业，EntryFile 与 CheckpointLocation 必填）。</p>
     */
    public String getMinorType() {
        return this.MinorType;
    }

    /**
     * Set <p>作业子类型，决定入口形态：SPARK_SQL（SQL 作业，Entrypoint.Statement 必填）/ SPARK_BATCH（批处理作业，Entrypoint.EntryFile 必填）/ SPARK_STREAM（流作业，EntryFile 与 CheckpointLocation 必填）。</p>
     * @param MinorType <p>作业子类型，决定入口形态：SPARK_SQL（SQL 作业，Entrypoint.Statement 必填）/ SPARK_BATCH（批处理作业，Entrypoint.EntryFile 必填）/ SPARK_STREAM（流作业，EntryFile 与 CheckpointLocation 必填）。</p>
     */
    public void setMinorType(String MinorType) {
        this.MinorType = MinorType;
    }

    /**
     * Get <p>工作流实例关联 ID（长度 ≤64）：同一工作流/会话的多条 SQL 作业传相同 FlowId，可共享同一 Spark 会话、复用已就绪引擎。MinorType=SPARK_SQL 时必填；FlowId 非空时必须同时传 ExecutionId。WAREHOUSE 模式下 FlowId 即会话句柄（一个 FlowId 只对应一个会话）：会话过期或已销毁后须换新 FlowId，否则返回 FailedOperation.FlowIdNotExists。</p> 
     * @return FlowId <p>工作流实例关联 ID（长度 ≤64）：同一工作流/会话的多条 SQL 作业传相同 FlowId，可共享同一 Spark 会话、复用已就绪引擎。MinorType=SPARK_SQL 时必填；FlowId 非空时必须同时传 ExecutionId。WAREHOUSE 模式下 FlowId 即会话句柄（一个 FlowId 只对应一个会话）：会话过期或已销毁后须换新 FlowId，否则返回 FailedOperation.FlowIdNotExists。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>工作流实例关联 ID（长度 ≤64）：同一工作流/会话的多条 SQL 作业传相同 FlowId，可共享同一 Spark 会话、复用已就绪引擎。MinorType=SPARK_SQL 时必填；FlowId 非空时必须同时传 ExecutionId。WAREHOUSE 模式下 FlowId 即会话句柄（一个 FlowId 只对应一个会话）：会话过期或已销毁后须换新 FlowId，否则返回 FailedOperation.FlowIdNotExists。</p>
     * @param FlowId <p>工作流实例关联 ID（长度 ≤64）：同一工作流/会话的多条 SQL 作业传相同 FlowId，可共享同一 Spark 会话、复用已就绪引擎。MinorType=SPARK_SQL 时必填；FlowId 非空时必须同时传 ExecutionId。WAREHOUSE 模式下 FlowId 即会话句柄（一个 FlowId 只对应一个会话）：会话过期或已销毁后须换新 FlowId，否则返回 FailedOperation.FlowIdNotExists。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>工作流内部执行标识（长度 ≤64），同一 FlowId 下每次提交须唯一（如自增序号/UUID）。用于重复提交防重：同一账号下命中未删除的同 (FlowId, ExecutionId) 作业时返回 FailedOperation.FlowExecutionConflict。FlowId 非空时必填（SPARK_SQL 因 FlowId 必填而必填）。</p> 
     * @return ExecutionId <p>工作流内部执行标识（长度 ≤64），同一 FlowId 下每次提交须唯一（如自增序号/UUID）。用于重复提交防重：同一账号下命中未删除的同 (FlowId, ExecutionId) 作业时返回 FailedOperation.FlowExecutionConflict。FlowId 非空时必填（SPARK_SQL 因 FlowId 必填而必填）。</p>
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>工作流内部执行标识（长度 ≤64），同一 FlowId 下每次提交须唯一（如自增序号/UUID）。用于重复提交防重：同一账号下命中未删除的同 (FlowId, ExecutionId) 作业时返回 FailedOperation.FlowExecutionConflict。FlowId 非空时必填（SPARK_SQL 因 FlowId 必填而必填）。</p>
     * @param ExecutionId <p>工作流内部执行标识（长度 ≤64），同一 FlowId 下每次提交须唯一（如自增序号/UUID）。用于重复提交防重：同一账号下命中未删除的同 (FlowId, ExecutionId) 作业时返回 FailedOperation.FlowExecutionConflict。FlowId 非空时必填（SPARK_SQL 因 FlowId 必填而必填）。</p>
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>运行模式，必填。WAREHOUSE / JOB.</p> 
     * @return RunMode <p>运行模式，必填。WAREHOUSE / JOB.</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式，必填。WAREHOUSE / JOB.</p>
     * @param RunMode <p>运行模式，必填。WAREHOUSE / JOB.</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>计算仓库 ID。RunMode=WAREHOUSE 时必填（仓库需处于 RUNNING，或 STOPPED 且 AutoStart 开启（提交后冷启动拉起））；RunMode=JOB 时必须为空。</p> 
     * @return WarehouseId <p>计算仓库 ID。RunMode=WAREHOUSE 时必填（仓库需处于 RUNNING，或 STOPPED 且 AutoStart 开启（提交后冷启动拉起））；RunMode=JOB 时必须为空。</p>
     */
    public String getWarehouseId() {
        return this.WarehouseId;
    }

    /**
     * Set <p>计算仓库 ID。RunMode=WAREHOUSE 时必填（仓库需处于 RUNNING，或 STOPPED 且 AutoStart 开启（提交后冷启动拉起））；RunMode=JOB 时必须为空。</p>
     * @param WarehouseId <p>计算仓库 ID。RunMode=WAREHOUSE 时必填（仓库需处于 RUNNING，或 STOPPED 且 AutoStart 开启（提交后冷启动拉起））；RunMode=JOB 时必须为空。</p>
     */
    public void setWarehouseId(String WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    /**
     * Get <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。RunMode=JOB 时必填；RunMode=WAREHOUSE 时忽略。</p> 
     * @return RuntimeCode <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。RunMode=JOB 时必填；RunMode=WAREHOUSE 时忽略。</p>
     */
    public String getRuntimeCode() {
        return this.RuntimeCode;
    }

    /**
     * Set <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。RunMode=JOB 时必填；RunMode=WAREHOUSE 时忽略。</p>
     * @param RuntimeCode <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。RunMode=JOB 时必填；RunMode=WAREHOUSE 时忽略。</p>
     */
    public void setRuntimeCode(String RuntimeCode) {
        this.RuntimeCode = RuntimeCode;
    }

    /**
     * Get <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型）。RunMode=JOB 时条件必填：未传时若可用（enabled）SysCatalog 唯一则自动选中，多个/零个报错；RunMode=WAREHOUSE 时禁止传。</p> 
     * @return SysCatalogVersion <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型）。RunMode=JOB 时条件必填：未传时若可用（enabled）SysCatalog 唯一则自动选中，多个/零个报错；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public String getSysCatalogVersion() {
        return this.SysCatalogVersion;
    }

    /**
     * Set <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型）。RunMode=JOB 时条件必填：未传时若可用（enabled）SysCatalog 唯一则自动选中，多个/零个报错；RunMode=WAREHOUSE 时禁止传。</p>
     * @param SysCatalogVersion <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型）。RunMode=JOB 时条件必填：未传时若可用（enabled）SysCatalog 唯一则自动选中，多个/零个报错；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setSysCatalogVersion(String SysCatalogVersion) {
        this.SysCatalogVersion = SysCatalogVersion;
    }

    /**
     * Get <p>资源分区代码，仅 RunMode=JOB 可传（QueueName 非空时必填）；RunMode=WAREHOUSE 时禁止传。</p> 
     * @return PartitionCode <p>资源分区代码，仅 RunMode=JOB 可传（QueueName 非空时必填）；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>资源分区代码，仅 RunMode=JOB 可传（QueueName 非空时必填）；RunMode=WAREHOUSE 时禁止传。</p>
     * @param PartitionCode <p>资源分区代码，仅 RunMode=JOB 可传（QueueName 非空时必填）；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>队列名称，必须与 PartitionCode 成对使用（RunMode=JOB 下可选）；RunMode=WAREHOUSE 下被仓库反查值覆盖，无需传。</p> 
     * @return QueueName <p>队列名称，必须与 PartitionCode 成对使用（RunMode=JOB 下可选）；RunMode=WAREHOUSE 下被仓库反查值覆盖，无需传。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称，必须与 PartitionCode 成对使用（RunMode=JOB 下可选）；RunMode=WAREHOUSE 下被仓库反查值覆盖，无需传。</p>
     * @param QueueName <p>队列名称，必须与 PartitionCode 成对使用（RunMode=JOB 下可选）；RunMode=WAREHOUSE 下被仓库反查值覆盖，无需传。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），作为 SPARK_CUSTOM 配置通道落库，两种运行模式均生效。</p> 
     * @return CustomProperties <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），作为 SPARK_CUSTOM 配置通道落库，两种运行模式均生效。</p>
     */
    public String getCustomProperties() {
        return this.CustomProperties;
    }

    /**
     * Set <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），作为 SPARK_CUSTOM 配置通道落库，两种运行模式均生效。</p>
     * @param CustomProperties <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），作为 SPARK_CUSTOM 配置通道落库，两种运行模式均生效。</p>
     */
    public void setCustomProperties(String CustomProperties) {
        this.CustomProperties = CustomProperties;
    }

    /**
     * Get <p>环境变量（KEY=VALUE）列表。仅 RunMode=JOB 可传；RunMode=WAREHOUSE 时禁止传。</p> 
     * @return EnvVars <p>环境变量（KEY=VALUE）列表。仅 RunMode=JOB 可传；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public KVPair [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量（KEY=VALUE）列表。仅 RunMode=JOB 可传；RunMode=WAREHOUSE 时禁止传。</p>
     * @param EnvVars <p>环境变量（KEY=VALUE）列表。仅 RunMode=JOB 可传；RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setEnvVars(KVPair [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    public CreateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJobRequest(CreateJobRequest source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CheckpointLocation != null) {
            this.CheckpointLocation = new String(source.CheckpointLocation);
        }
        if (source.MajorType != null) {
            this.MajorType = new String(source.MajorType);
        }
        if (source.MinorType != null) {
            this.MinorType = new String(source.MinorType);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.WarehouseId != null) {
            this.WarehouseId = new String(source.WarehouseId);
        }
        if (source.RuntimeCode != null) {
            this.RuntimeCode = new String(source.RuntimeCode);
        }
        if (source.SysCatalogVersion != null) {
            this.SysCatalogVersion = new String(source.SysCatalogVersion);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.CustomProperties != null) {
            this.CustomProperties = new String(source.CustomProperties);
        }
        if (source.EnvVars != null) {
            this.EnvVars = new KVPair[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new KVPair(source.EnvVars[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CheckpointLocation", this.CheckpointLocation);
        this.setParamSimple(map, prefix + "MajorType", this.MajorType);
        this.setParamSimple(map, prefix + "MinorType", this.MinorType);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "WarehouseId", this.WarehouseId);
        this.setParamSimple(map, prefix + "RuntimeCode", this.RuntimeCode);
        this.setParamSimple(map, prefix + "SysCatalogVersion", this.SysCatalogVersion);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "CustomProperties", this.CustomProperties);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);

    }
}

