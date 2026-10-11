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

public class JobDetailInfo extends AbstractModel {

    /**
    * <p>作业唯一标识.</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>作业名称.</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>创建/提交者子账号 UIN。</p>
    */
    @SerializedName("CreatorSubUin")
    @Expose
    private String CreatorSubUin;

    /**
    * <p>作业状态.</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>引擎大类.</p>
    */
    @SerializedName("MajorType")
    @Expose
    private String MajorType;

    /**
    * <p>引擎子类型.</p>
    */
    @SerializedName("MinorType")
    @Expose
    private String MinorType;

    /**
    * <p>运行模式（WAREHOUSE / JOB）.</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>计算仓库 ID，RunMode=WAREHOUSE 时非空.</p>
    */
    @SerializedName("WarehouseId")
    @Expose
    private String WarehouseId;

    /**
    * <p>资源分区编码.</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>资源分区展示名（解析不到时为空）.</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>队列名称.</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
    */
    @SerializedName("CheckpointLocation")
    @Expose
    private String CheckpointLocation;

    /**
    * <p>创建时间（Unix 毫秒时间戳）.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>提交时间（Unix 毫秒时间戳）.</p>
    */
    @SerializedName("SubmitTime")
    @Expose
    private Long SubmitTime;

    /**
    * <p>完成时间（Unix 毫秒时间戳）.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

    /**
    * <p>运行时长（毫秒）.</p>
    */
    @SerializedName("RunningTimeMs")
    @Expose
    private Long RunningTimeMs;

    /**
    * <p>计算仓库名称（详情接口反查填充，warehouse 模式下非空）.</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>流程 ID。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>执行 ID。</p>
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>作业来源。</p>
    */
    @SerializedName("JobSource")
    @Expose
    private String JobSource;

    /**
    * <p>排队等待时长（毫秒）。</p>
    */
    @SerializedName("WaitingTimeMs")
    @Expose
    private Long WaitingTimeMs;

    /**
    * <p>Spark UI 历史链接。</p>
    */
    @SerializedName("HistoryUrl")
    @Expose
    private String HistoryUrl;

    /**
    * <p>失败时的错误信息。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>自定义 Spark conf（JSON 字符串，由 job_config 组装）.</p>
    */
    @SerializedName("CustomProperties")
    @Expose
    private String CustomProperties;

    /**
    * <p>环境变量.</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private KVPair [] EnvVars;

    /**
    * <p>运行时/镜像。</p>
    */
    @SerializedName("RuntimeCode")
    @Expose
    private String RuntimeCode;

    /**
    * <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空。</p>
    */
    @SerializedName("RuntimeName")
    @Expose
    private String RuntimeName;

    /**
    * <p>Catalog 版本码。</p>
    */
    @SerializedName("SysCatalogVersion")
    @Expose
    private String SysCatalogVersion;

    /**
     * Get <p>作业唯一标识.</p> 
     * @return JobId <p>作业唯一标识.</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业唯一标识.</p>
     * @param JobId <p>作业唯一标识.</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>作业名称.</p> 
     * @return JobName <p>作业名称.</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>作业名称.</p>
     * @param JobName <p>作业名称.</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>创建/提交者子账号 UIN。</p> 
     * @return CreatorSubUin <p>创建/提交者子账号 UIN。</p>
     */
    public String getCreatorSubUin() {
        return this.CreatorSubUin;
    }

    /**
     * Set <p>创建/提交者子账号 UIN。</p>
     * @param CreatorSubUin <p>创建/提交者子账号 UIN。</p>
     */
    public void setCreatorSubUin(String CreatorSubUin) {
        this.CreatorSubUin = CreatorSubUin;
    }

    /**
     * Get <p>作业状态.</p> 
     * @return State <p>作业状态.</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>作业状态.</p>
     * @param State <p>作业状态.</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>引擎大类.</p> 
     * @return MajorType <p>引擎大类.</p>
     */
    public String getMajorType() {
        return this.MajorType;
    }

    /**
     * Set <p>引擎大类.</p>
     * @param MajorType <p>引擎大类.</p>
     */
    public void setMajorType(String MajorType) {
        this.MajorType = MajorType;
    }

    /**
     * Get <p>引擎子类型.</p> 
     * @return MinorType <p>引擎子类型.</p>
     */
    public String getMinorType() {
        return this.MinorType;
    }

    /**
     * Set <p>引擎子类型.</p>
     * @param MinorType <p>引擎子类型.</p>
     */
    public void setMinorType(String MinorType) {
        this.MinorType = MinorType;
    }

    /**
     * Get <p>运行模式（WAREHOUSE / JOB）.</p> 
     * @return RunMode <p>运行模式（WAREHOUSE / JOB）.</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式（WAREHOUSE / JOB）.</p>
     * @param RunMode <p>运行模式（WAREHOUSE / JOB）.</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>计算仓库 ID，RunMode=WAREHOUSE 时非空.</p> 
     * @return WarehouseId <p>计算仓库 ID，RunMode=WAREHOUSE 时非空.</p>
     */
    public String getWarehouseId() {
        return this.WarehouseId;
    }

    /**
     * Set <p>计算仓库 ID，RunMode=WAREHOUSE 时非空.</p>
     * @param WarehouseId <p>计算仓库 ID，RunMode=WAREHOUSE 时非空.</p>
     */
    public void setWarehouseId(String WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    /**
     * Get <p>资源分区编码.</p> 
     * @return PartitionCode <p>资源分区编码.</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>资源分区编码.</p>
     * @param PartitionCode <p>资源分区编码.</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>资源分区展示名（解析不到时为空）.</p> 
     * @return PartitionName <p>资源分区展示名（解析不到时为空）.</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>资源分区展示名（解析不到时为空）.</p>
     * @param PartitionName <p>资源分区展示名（解析不到时为空）.</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>队列名称.</p> 
     * @return QueueName <p>队列名称.</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称.</p>
     * @param QueueName <p>队列名称.</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p> 
     * @return CheckpointLocation <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     */
    public String getCheckpointLocation() {
        return this.CheckpointLocation;
    }

    /**
     * Set <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     * @param CheckpointLocation <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
     */
    public void setCheckpointLocation(String CheckpointLocation) {
        this.CheckpointLocation = CheckpointLocation;
    }

    /**
     * Get <p>创建时间（Unix 毫秒时间戳）.</p> 
     * @return CreateTime <p>创建时间（Unix 毫秒时间戳）.</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix 毫秒时间戳）.</p>
     * @param CreateTime <p>创建时间（Unix 毫秒时间戳）.</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>提交时间（Unix 毫秒时间戳）.</p> 
     * @return SubmitTime <p>提交时间（Unix 毫秒时间戳）.</p>
     */
    public Long getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set <p>提交时间（Unix 毫秒时间戳）.</p>
     * @param SubmitTime <p>提交时间（Unix 毫秒时间戳）.</p>
     */
    public void setSubmitTime(Long SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get <p>完成时间（Unix 毫秒时间戳）.</p> 
     * @return FinishTime <p>完成时间（Unix 毫秒时间戳）.</p>
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间（Unix 毫秒时间戳）.</p>
     * @param FinishTime <p>完成时间（Unix 毫秒时间戳）.</p>
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>运行时长（毫秒）.</p> 
     * @return RunningTimeMs <p>运行时长（毫秒）.</p>
     */
    public Long getRunningTimeMs() {
        return this.RunningTimeMs;
    }

    /**
     * Set <p>运行时长（毫秒）.</p>
     * @param RunningTimeMs <p>运行时长（毫秒）.</p>
     */
    public void setRunningTimeMs(Long RunningTimeMs) {
        this.RunningTimeMs = RunningTimeMs;
    }

    /**
     * Get <p>计算仓库名称（详情接口反查填充，warehouse 模式下非空）.</p> 
     * @return WarehouseName <p>计算仓库名称（详情接口反查填充，warehouse 模式下非空）.</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>计算仓库名称（详情接口反查填充，warehouse 模式下非空）.</p>
     * @param WarehouseName <p>计算仓库名称（详情接口反查填充，warehouse 模式下非空）.</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>流程 ID。</p> 
     * @return FlowId <p>流程 ID。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>流程 ID。</p>
     * @param FlowId <p>流程 ID。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>执行 ID。</p> 
     * @return ExecutionId <p>执行 ID。</p>
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>执行 ID。</p>
     * @param ExecutionId <p>执行 ID。</p>
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>作业来源。</p> 
     * @return JobSource <p>作业来源。</p>
     */
    public String getJobSource() {
        return this.JobSource;
    }

    /**
     * Set <p>作业来源。</p>
     * @param JobSource <p>作业来源。</p>
     */
    public void setJobSource(String JobSource) {
        this.JobSource = JobSource;
    }

    /**
     * Get <p>排队等待时长（毫秒）。</p> 
     * @return WaitingTimeMs <p>排队等待时长（毫秒）。</p>
     */
    public Long getWaitingTimeMs() {
        return this.WaitingTimeMs;
    }

    /**
     * Set <p>排队等待时长（毫秒）。</p>
     * @param WaitingTimeMs <p>排队等待时长（毫秒）。</p>
     */
    public void setWaitingTimeMs(Long WaitingTimeMs) {
        this.WaitingTimeMs = WaitingTimeMs;
    }

    /**
     * Get <p>Spark UI 历史链接。</p> 
     * @return HistoryUrl <p>Spark UI 历史链接。</p>
     */
    public String getHistoryUrl() {
        return this.HistoryUrl;
    }

    /**
     * Set <p>Spark UI 历史链接。</p>
     * @param HistoryUrl <p>Spark UI 历史链接。</p>
     */
    public void setHistoryUrl(String HistoryUrl) {
        this.HistoryUrl = HistoryUrl;
    }

    /**
     * Get <p>失败时的错误信息。</p> 
     * @return ErrorMessage <p>失败时的错误信息。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败时的错误信息。</p>
     * @param ErrorMessage <p>失败时的错误信息。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>自定义 Spark conf（JSON 字符串，由 job_config 组装）.</p> 
     * @return CustomProperties <p>自定义 Spark conf（JSON 字符串，由 job_config 组装）.</p>
     */
    public String getCustomProperties() {
        return this.CustomProperties;
    }

    /**
     * Set <p>自定义 Spark conf（JSON 字符串，由 job_config 组装）.</p>
     * @param CustomProperties <p>自定义 Spark conf（JSON 字符串，由 job_config 组装）.</p>
     */
    public void setCustomProperties(String CustomProperties) {
        this.CustomProperties = CustomProperties;
    }

    /**
     * Get <p>环境变量.</p> 
     * @return EnvVars <p>环境变量.</p>
     */
    public KVPair [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量.</p>
     * @param EnvVars <p>环境变量.</p>
     */
    public void setEnvVars(KVPair [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>运行时/镜像。</p> 
     * @return RuntimeCode <p>运行时/镜像。</p>
     */
    public String getRuntimeCode() {
        return this.RuntimeCode;
    }

    /**
     * Set <p>运行时/镜像。</p>
     * @param RuntimeCode <p>运行时/镜像。</p>
     */
    public void setRuntimeCode(String RuntimeCode) {
        this.RuntimeCode = RuntimeCode;
    }

    /**
     * Get <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空。</p> 
     * @return RuntimeName <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空。</p>
     */
    public String getRuntimeName() {
        return this.RuntimeName;
    }

    /**
     * Set <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空。</p>
     * @param RuntimeName <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空。</p>
     */
    public void setRuntimeName(String RuntimeName) {
        this.RuntimeName = RuntimeName;
    }

    /**
     * Get <p>Catalog 版本码。</p> 
     * @return SysCatalogVersion <p>Catalog 版本码。</p>
     */
    public String getSysCatalogVersion() {
        return this.SysCatalogVersion;
    }

    /**
     * Set <p>Catalog 版本码。</p>
     * @param SysCatalogVersion <p>Catalog 版本码。</p>
     */
    public void setSysCatalogVersion(String SysCatalogVersion) {
        this.SysCatalogVersion = SysCatalogVersion;
    }

    public JobDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDetailInfo(JobDetailInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CreatorSubUin != null) {
            this.CreatorSubUin = new String(source.CreatorSubUin);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.MajorType != null) {
            this.MajorType = new String(source.MajorType);
        }
        if (source.MinorType != null) {
            this.MinorType = new String(source.MinorType);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.WarehouseId != null) {
            this.WarehouseId = new String(source.WarehouseId);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.CheckpointLocation != null) {
            this.CheckpointLocation = new String(source.CheckpointLocation);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new Long(source.SubmitTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
        if (source.RunningTimeMs != null) {
            this.RunningTimeMs = new Long(source.RunningTimeMs);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.JobSource != null) {
            this.JobSource = new String(source.JobSource);
        }
        if (source.WaitingTimeMs != null) {
            this.WaitingTimeMs = new Long(source.WaitingTimeMs);
        }
        if (source.HistoryUrl != null) {
            this.HistoryUrl = new String(source.HistoryUrl);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
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
        if (source.RuntimeCode != null) {
            this.RuntimeCode = new String(source.RuntimeCode);
        }
        if (source.RuntimeName != null) {
            this.RuntimeName = new String(source.RuntimeName);
        }
        if (source.SysCatalogVersion != null) {
            this.SysCatalogVersion = new String(source.SysCatalogVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CreatorSubUin", this.CreatorSubUin);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MajorType", this.MajorType);
        this.setParamSimple(map, prefix + "MinorType", this.MinorType);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "WarehouseId", this.WarehouseId);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "CheckpointLocation", this.CheckpointLocation);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "RunningTimeMs", this.RunningTimeMs);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "JobSource", this.JobSource);
        this.setParamSimple(map, prefix + "WaitingTimeMs", this.WaitingTimeMs);
        this.setParamSimple(map, prefix + "HistoryUrl", this.HistoryUrl);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CustomProperties", this.CustomProperties);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "RuntimeCode", this.RuntimeCode);
        this.setParamSimple(map, prefix + "RuntimeName", this.RuntimeName);
        this.setParamSimple(map, prefix + "SysCatalogVersion", this.SysCatalogVersion);

    }
}

