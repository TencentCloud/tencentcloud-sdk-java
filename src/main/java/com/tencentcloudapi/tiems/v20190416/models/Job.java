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

public class Job  extends AbstractModel{

    /**
    * 任务 Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 集群名
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
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 预测输入
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
     * 获取任务 Id
     * @return Id 任务 Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置任务 Id
     * @param Id 任务 Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取集群名
     * @return Cluster 集群名
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群名
     * @param Cluster 集群名
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取Region 名
     * @return Region Region 名
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置Region 名
     * @param Region Region 名
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取任务名称
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取Worker 使用的运行环境
     * @return Runtime Worker 使用的运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置Worker 使用的运行环境
     * @param Runtime Worker 使用的运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取配置 Id
     * @return ConfigId 配置 Id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * 设置配置 Id
     * @param ConfigId 配置 Id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * 获取预测输入
     * @return PredictInput 预测输入
     */
    public PredictInput getPredictInput() {
        return this.PredictInput;
    }

    /**
     * 设置预测输入
     * @param PredictInput 预测输入
     */
    public void setPredictInput(PredictInput PredictInput) {
        this.PredictInput = PredictInput;
    }

    /**
     * 获取任务状态
     * @return Status 任务状态
     */
    public JobStatus getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态
     * @param Status 任务状态
     */
    public void setStatus(JobStatus Status) {
        this.Status = Status;
    }

    /**
     * 获取任务创建时间
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCancelTime() {
        return this.CancelTime;
    }

    /**
     * 设置任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancelTime 任务取消时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancelTime(String CancelTime) {
        this.CancelTime = CancelTime;
    }

    /**
     * 获取任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @return ResourceGroupId 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * 设置任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 任务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * 获取处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @return Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * 设置处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @return Memory 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存配置, 单位为1M；范围[100, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @return Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * 设置GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * 获取显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @return GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * 设置显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * 获取任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ResourceGroupName 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * 设置任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 任务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * 获取GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * 设置GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * 获取配置名
注意：此字段可能返回 null，表示取不到有效值。
     * @return ConfigName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * 设置配置名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * 获取配置版本
注意：此字段可能返回 null，表示取不到有效值。
     * @return ConfigVersion 配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * 设置配置版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersion 配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

