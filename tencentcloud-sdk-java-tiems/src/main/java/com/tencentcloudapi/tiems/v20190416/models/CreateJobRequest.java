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

public class CreateJobRequest extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 使用的资源组 Id，默认使用共享资源组
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 处理器配置, 单位为1/1000核；范围[100, 256000]
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M；范围[100, 256000]
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 运行集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 预测输入
    */
    @SerializedName("PredictInput")
    @Expose
    private PredictInput PredictInput;

    /**
    * 任务描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 同时处理任务的 Worker 个数
    */
    @SerializedName("WorkerCount")
    @Expose
    private Long WorkerCount;

    /**
    * 使用的配置 Id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 显存配置, 单位为1M，范围 [0, 256000]
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
    * GPU类型
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * 量化输入
    */
    @SerializedName("QuantizationInput")
    @Expose
    private QuantizationInput QuantizationInput;

    /**
    * Cls日志主题ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

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
     * Get 使用的资源组 Id，默认使用共享资源组 
     * @return ResourceGroupId 使用的资源组 Id，默认使用共享资源组
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 使用的资源组 Id，默认使用共享资源组
     * @param ResourceGroupId 使用的资源组 Id，默认使用共享资源组
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 处理器配置, 单位为1/1000核；范围[100, 256000] 
     * @return Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 处理器配置, 单位为1/1000核；范围[100, 256000]
     * @param Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存配置, 单位为1M；范围[100, 256000] 
     * @return Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存配置, 单位为1M；范围[100, 256000]
     * @param Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 运行集群 
     * @return Cluster 运行集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 运行集群
     * @param Cluster 运行集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 预测输入 
     * @return PredictInput 预测输入
     */
    public PredictInput getPredictInput() {
        return this.PredictInput;
    }

    /**
     * Set 预测输入
     * @param PredictInput 预测输入
     */
    public void setPredictInput(PredictInput PredictInput) {
        this.PredictInput = PredictInput;
    }

    /**
     * Get 任务描述 
     * @return Description 任务描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
     * @param Description 任务描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 同时处理任务的 Worker 个数 
     * @return WorkerCount 同时处理任务的 Worker 个数
     */
    public Long getWorkerCount() {
        return this.WorkerCount;
    }

    /**
     * Set 同时处理任务的 Worker 个数
     * @param WorkerCount 同时处理任务的 Worker 个数
     */
    public void setWorkerCount(Long WorkerCount) {
        this.WorkerCount = WorkerCount;
    }

    /**
     * Get 使用的配置 Id 
     * @return ConfigId 使用的配置 Id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 使用的配置 Id
     * @param ConfigId 使用的配置 Id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get GPU算力配置，单位为1/1000 卡，范围 [0, 256000] 
     * @return Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     * @param Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 显存配置, 单位为1M，范围 [0, 256000] 
     * @return GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * Set 显存配置, 单位为1M，范围 [0, 256000]
     * @param GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * Get GPU类型 
     * @return GpuType GPU类型
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU类型
     * @param GpuType GPU类型
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get 量化输入 
     * @return QuantizationInput 量化输入
     */
    public QuantizationInput getQuantizationInput() {
        return this.QuantizationInput;
    }

    /**
     * Set 量化输入
     * @param QuantizationInput 量化输入
     */
    public void setQuantizationInput(QuantizationInput QuantizationInput) {
        this.QuantizationInput = QuantizationInput;
    }

    /**
     * Get Cls日志主题ID 
     * @return LogTopicId Cls日志主题ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Cls日志主题ID
     * @param LogTopicId Cls日志主题ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamObj(map, prefix + "PredictInput.", this.PredictInput);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkerCount", this.WorkerCount);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamObj(map, prefix + "QuantizationInput.", this.QuantizationInput);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

