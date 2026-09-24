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

public class JobDefinitionItemInfo extends AbstractModel {

    /**
    * <p>作业定义唯一标识符（ID）。</p>
    */
    @SerializedName("JobDefinitionId")
    @Expose
    private String JobDefinitionId;

    /**
    * <p>作业定义名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>作业定义描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>作业主类型。</p>
    */
    @SerializedName("MajorType")
    @Expose
    private String MajorType;

    /**
    * <p>作业子类型。</p>
    */
    @SerializedName("MinorType")
    @Expose
    private String MinorType;

    /**
    * <p>流作业 checkpoint 路径（MinorType=SPARK_STREAM 时非空）。同一流作业的多次运行必须复用同一路径，变更等于重置消费进度。</p>
    */
    @SerializedName("CheckpointLocation")
    @Expose
    private String CheckpointLocation;

    /**
    * <p>创建者（子账号 UIN）。</p>
    */
    @SerializedName("CreatorSubUin")
    @Expose
    private String CreatorSubUin;

    /**
    * <p>创建时间（Unix 毫秒时间戳）。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（Unix 毫秒时间戳）。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>分区编码。</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>分区展示名（解析不到时为空）。</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>队列名称。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>运行模式: JOB | WAREHOUSE.</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>计算仓库 ID, RunMode=WAREHOUSE 时非空.</p>
    */
    @SerializedName("WarehouseId")
    @Expose
    private String WarehouseId;

    /**
    * <p>请求时间窗口（InstanceTimeRange，默认 7 天）内的作业实例数。</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。JOB 模式取定义自身配置，WAREHOUSE 模式取所属计算仓库运行时；解析不到时为空。</p>
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
    * <p>计算仓库名称（列表整页按去重后的仓库反查填充；warehouse 模式下非空，仓库已销毁时仍回填历史名称）。</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
     * Get <p>作业定义唯一标识符（ID）。</p> 
     * @return JobDefinitionId <p>作业定义唯一标识符（ID）。</p>
     */
    public String getJobDefinitionId() {
        return this.JobDefinitionId;
    }

    /**
     * Set <p>作业定义唯一标识符（ID）。</p>
     * @param JobDefinitionId <p>作业定义唯一标识符（ID）。</p>
     */
    public void setJobDefinitionId(String JobDefinitionId) {
        this.JobDefinitionId = JobDefinitionId;
    }

    /**
     * Get <p>作业定义名称。</p> 
     * @return Name <p>作业定义名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>作业定义名称。</p>
     * @param Name <p>作业定义名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>作业定义描述。</p> 
     * @return Description <p>作业定义描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>作业定义描述。</p>
     * @param Description <p>作业定义描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>作业主类型。</p> 
     * @return MajorType <p>作业主类型。</p>
     */
    public String getMajorType() {
        return this.MajorType;
    }

    /**
     * Set <p>作业主类型。</p>
     * @param MajorType <p>作业主类型。</p>
     */
    public void setMajorType(String MajorType) {
        this.MajorType = MajorType;
    }

    /**
     * Get <p>作业子类型。</p> 
     * @return MinorType <p>作业子类型。</p>
     */
    public String getMinorType() {
        return this.MinorType;
    }

    /**
     * Set <p>作业子类型。</p>
     * @param MinorType <p>作业子类型。</p>
     */
    public void setMinorType(String MinorType) {
        this.MinorType = MinorType;
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
     * Get <p>创建者（子账号 UIN）。</p> 
     * @return CreatorSubUin <p>创建者（子账号 UIN）。</p>
     */
    public String getCreatorSubUin() {
        return this.CreatorSubUin;
    }

    /**
     * Set <p>创建者（子账号 UIN）。</p>
     * @param CreatorSubUin <p>创建者（子账号 UIN）。</p>
     */
    public void setCreatorSubUin(String CreatorSubUin) {
        this.CreatorSubUin = CreatorSubUin;
    }

    /**
     * Get <p>创建时间（Unix 毫秒时间戳）。</p> 
     * @return CreateTime <p>创建时间（Unix 毫秒时间戳）。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix 毫秒时间戳）。</p>
     * @param CreateTime <p>创建时间（Unix 毫秒时间戳）。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（Unix 毫秒时间戳）。</p> 
     * @return UpdateTime <p>更新时间（Unix 毫秒时间戳）。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix 毫秒时间戳）。</p>
     * @param UpdateTime <p>更新时间（Unix 毫秒时间戳）。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>分区编码。</p> 
     * @return PartitionCode <p>分区编码。</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>分区编码。</p>
     * @param PartitionCode <p>分区编码。</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>分区展示名（解析不到时为空）。</p> 
     * @return PartitionName <p>分区展示名（解析不到时为空）。</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>分区展示名（解析不到时为空）。</p>
     * @param PartitionName <p>分区展示名（解析不到时为空）。</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>队列名称。</p> 
     * @return QueueName <p>队列名称。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称。</p>
     * @param QueueName <p>队列名称。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>运行模式: JOB | WAREHOUSE.</p> 
     * @return RunMode <p>运行模式: JOB | WAREHOUSE.</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>运行模式: JOB | WAREHOUSE.</p>
     * @param RunMode <p>运行模式: JOB | WAREHOUSE.</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>计算仓库 ID, RunMode=WAREHOUSE 时非空.</p> 
     * @return WarehouseId <p>计算仓库 ID, RunMode=WAREHOUSE 时非空.</p>
     */
    public String getWarehouseId() {
        return this.WarehouseId;
    }

    /**
     * Set <p>计算仓库 ID, RunMode=WAREHOUSE 时非空.</p>
     * @param WarehouseId <p>计算仓库 ID, RunMode=WAREHOUSE 时非空.</p>
     */
    public void setWarehouseId(String WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    /**
     * Get <p>请求时间窗口（InstanceTimeRange，默认 7 天）内的作业实例数。</p> 
     * @return InstanceCount <p>请求时间窗口（InstanceTimeRange，默认 7 天）内的作业实例数。</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>请求时间窗口（InstanceTimeRange，默认 7 天）内的作业实例数。</p>
     * @param InstanceCount <p>请求时间窗口（InstanceTimeRange，默认 7 天）内的作业实例数。</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。JOB 模式取定义自身配置，WAREHOUSE 模式取所属计算仓库运行时；解析不到时为空。</p> 
     * @return RuntimeCode <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。JOB 模式取定义自身配置，WAREHOUSE 模式取所属计算仓库运行时；解析不到时为空。</p>
     */
    public String getRuntimeCode() {
        return this.RuntimeCode;
    }

    /**
     * Set <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。JOB 模式取定义自身配置，WAREHOUSE 模式取所属计算仓库运行时；解析不到时为空。</p>
     * @param RuntimeCode <p>运行时/镜像编码（可选值见 DescribeSparkRuntimes）。JOB 模式取定义自身配置，WAREHOUSE 模式取所属计算仓库运行时；解析不到时为空。</p>
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
     * Get <p>计算仓库名称（列表整页按去重后的仓库反查填充；warehouse 模式下非空，仓库已销毁时仍回填历史名称）。</p> 
     * @return WarehouseName <p>计算仓库名称（列表整页按去重后的仓库反查填充；warehouse 模式下非空，仓库已销毁时仍回填历史名称）。</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>计算仓库名称（列表整页按去重后的仓库反查填充；warehouse 模式下非空，仓库已销毁时仍回填历史名称）。</p>
     * @param WarehouseName <p>计算仓库名称（列表整页按去重后的仓库反查填充；warehouse 模式下非空，仓库已销毁时仍回填历史名称）。</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    public JobDefinitionItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDefinitionItemInfo(JobDefinitionItemInfo source) {
        if (source.JobDefinitionId != null) {
            this.JobDefinitionId = new String(source.JobDefinitionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MajorType != null) {
            this.MajorType = new String(source.MajorType);
        }
        if (source.MinorType != null) {
            this.MinorType = new String(source.MinorType);
        }
        if (source.CheckpointLocation != null) {
            this.CheckpointLocation = new String(source.CheckpointLocation);
        }
        if (source.CreatorSubUin != null) {
            this.CreatorSubUin = new String(source.CreatorSubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
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
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.WarehouseId != null) {
            this.WarehouseId = new String(source.WarehouseId);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.RuntimeCode != null) {
            this.RuntimeCode = new String(source.RuntimeCode);
        }
        if (source.RuntimeName != null) {
            this.RuntimeName = new String(source.RuntimeName);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobDefinitionId", this.JobDefinitionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MajorType", this.MajorType);
        this.setParamSimple(map, prefix + "MinorType", this.MinorType);
        this.setParamSimple(map, prefix + "CheckpointLocation", this.CheckpointLocation);
        this.setParamSimple(map, prefix + "CreatorSubUin", this.CreatorSubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "WarehouseId", this.WarehouseId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RuntimeCode", this.RuntimeCode);
        this.setParamSimple(map, prefix + "RuntimeName", this.RuntimeName);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);

    }
}

