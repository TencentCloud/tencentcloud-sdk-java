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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel{

    /**
    * 任务 Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 集群名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * Region 名
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Worker 使用的运行环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 配置 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 预测输入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredictInput")
    @Expose
    private PredictInput PredictInput;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private JobStatus Status;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CancelTime")
    @Expose
    private String CancelTime;

    /**
    * 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
    * 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * GPU类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * 配置名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * Job类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 量化输入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuantizationInput")
    @Expose
    private QuantizationInput QuantizationInput;

    /**
    * Cls日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get 任务 Id 
     * @return Id 任务 Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务 Id
     * @param Id 任务 Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 集群名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get Region 名 
     * @return Region Region 名
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region 名
     * @param Region Region 名
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Worker 使用的运行环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Runtime Worker 使用的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Worker 使用的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param Runtime Worker 使用的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 配置 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 配置 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 预测输入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredictInput 预测输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PredictInput getPredictInput() {
        return this.PredictInput;
    }

    /**
     * Set 预测输入
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredictInput 预测输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredictInput(PredictInput PredictInput) {
        this.PredictInput = PredictInput;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public JobStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(JobStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCancelTime() {
        return this.CancelTime;
    }

    /**
     * Set 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancelTime(String CancelTime) {
        this.CancelTime = CancelTime;
    }

    /**
     * Get 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * Set 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * Get 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get GPU类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 配置名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigVersion 配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * Set 配置版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersion 配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * Get Job类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType Job类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Job类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType Job类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 量化输入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuantizationInput 量化输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuantizationInput getQuantizationInput() {
        return this.QuantizationInput;
    }

    /**
     * Set 量化输入
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuantizationInput 量化输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuantizationInput(QuantizationInput QuantizationInput) {
        this.QuantizationInput = QuantizationInput;
    }

    /**
     * Get Cls日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId Cls日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Cls日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId Cls日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamObj(map, prefix + "PredictInput.", this.PredictInput);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CancelTime", this.CancelTime);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "QuantizationInput.", this.QuantizationInput);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

