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

public class ModelService extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 运行集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 模型地址
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 处理器配置, 单位为1/1000核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存配置, 单位为1M
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU 配置, 单位为1/1000 卡
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 显存配置, 单位为1M
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 支持AUTO, MANUAL
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 弹性伸缩配置
    */
    @SerializedName("Scaler")
    @Expose
    private Scaler Scaler;

    /**
    * 服务状态
    */
    @SerializedName("Status")
    @Expose
    private ServiceStatus Status;

    /**
    * 访问密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 服务配置Id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 服务配置名
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 服务运行时长
    */
    @SerializedName("ServeSeconds")
    @Expose
    private Long ServeSeconds;

    /**
    * 配置版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * 服务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 暴露方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exposes")
    @Expose
    private ExposeInfo [] Exposes;

    /**
    * Region 名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 服务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * GPU类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * Cls日志主题Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get 服务ID 
     * @return Id 服务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务ID
     * @param Id 服务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 运行集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster 运行集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 运行集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster 运行集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 服务名称 
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运行环境 
     * @return Runtime 运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行环境
     * @param Runtime 运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 模型地址 
     * @return ModelUri 模型地址
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * Set 模型地址
     * @param ModelUri 模型地址
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * Get 处理器配置, 单位为1/1000核 
     * @return Cpu 处理器配置, 单位为1/1000核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 处理器配置, 单位为1/1000核
     * @param Cpu 处理器配置, 单位为1/1000核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存配置, 单位为1M 
     * @return Memory 内存配置, 单位为1M
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存配置, 单位为1M
     * @param Memory 内存配置, 单位为1M
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU 配置, 单位为1/1000 卡 
     * @return Gpu GPU 配置, 单位为1/1000 卡
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU 配置, 单位为1/1000 卡
     * @param Gpu GPU 配置, 单位为1/1000 卡
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 显存配置, 单位为1M 
     * @return GpuMemory 显存配置, 单位为1M
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * Set 显存配置, 单位为1M
     * @param GpuMemory 显存配置, 单位为1M
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 支持AUTO, MANUAL 
     * @return ScaleMode 支持AUTO, MANUAL
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set 支持AUTO, MANUAL
     * @param ScaleMode 支持AUTO, MANUAL
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get 弹性伸缩配置 
     * @return Scaler 弹性伸缩配置
     */
    public Scaler getScaler() {
        return this.Scaler;
    }

    /**
     * Set 弹性伸缩配置
     * @param Scaler 弹性伸缩配置
     */
    public void setScaler(Scaler Scaler) {
        this.Scaler = Scaler;
    }

    /**
     * Get 服务状态 
     * @return Status 服务状态
     */
    public ServiceStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态
     * @param Status 服务状态
     */
    public void setStatus(ServiceStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 访问密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessToken 访问密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 访问密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessToken 访问密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get 服务配置Id 
     * @return ConfigId 服务配置Id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 服务配置Id
     * @param ConfigId 服务配置Id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 服务配置名 
     * @return ConfigName 服务配置名
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 服务配置名
     * @param ConfigName 服务配置名
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 服务运行时长 
     * @return ServeSeconds 服务运行时长
     */
    public Long getServeSeconds() {
        return this.ServeSeconds;
    }

    /**
     * Set 服务运行时长
     * @param ServeSeconds 服务运行时长
     */
    public void setServeSeconds(Long ServeSeconds) {
        this.ServeSeconds = ServeSeconds;
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
     * Get 服务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 服务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 服务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 服务使用资源组 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 暴露方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exposes 暴露方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExposeInfo [] getExposes() {
        return this.Exposes;
    }

    /**
     * Set 暴露方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exposes 暴露方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExposes(ExposeInfo [] Exposes) {
        this.Exposes = Exposes;
    }

    /**
     * Get Region 名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region Region 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region 名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region Region 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 服务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 服务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 服务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 服务使用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get Cls日志主题Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId Cls日志主题Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Cls日志主题Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId Cls日志主题Id
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamObj(map, prefix + "Scaler.", this.Scaler);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ServeSeconds", this.ServeSeconds);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Exposes.", this.Exposes);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

