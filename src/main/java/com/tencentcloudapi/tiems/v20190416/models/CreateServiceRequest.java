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

public class CreateServiceRequest  extends AbstractModel{

    /**
    * 扩缩容配置
    */
    @SerializedName("Scaler")
    @Expose
    private Scaler Scaler;

    /**
    * 服务配置Id
    */
    @SerializedName("ServiceConfigId")
    @Expose
    private String ServiceConfigId;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

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
    * 集群，不填则使用默认集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 部署要使用的资源组Id，默认为共享资源组
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 默认为空，表示不需要鉴权，TOKEN 表示选择 Token 鉴权方式
    */
    @SerializedName("Authentication")
    @Expose
    private String Authentication;

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
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * GPU类型
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
     * 获取扩缩容配置
     * @return Scaler 扩缩容配置
     */
    public Scaler getScaler() {
        return this.Scaler;
    }

    /**
     * 设置扩缩容配置
     * @param Scaler 扩缩容配置
     */
    public void setScaler(Scaler Scaler) {
        this.Scaler = Scaler;
    }

    /**
     * 获取服务配置Id
     * @return ServiceConfigId 服务配置Id
     */
    public String getServiceConfigId() {
        return this.ServiceConfigId;
    }

    /**
     * 设置服务配置Id
     * @param ServiceConfigId 服务配置Id
     */
    public void setServiceConfigId(String ServiceConfigId) {
        this.ServiceConfigId = ServiceConfigId;
    }

    /**
     * 获取服务名称
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     * @return ScaleMode 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * 设置扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     * @param ScaleMode 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * 获取处理器配置, 单位为1/1000核；范围[100, 256000]
     * @return Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * 设置处理器配置, 单位为1/1000核；范围[100, 256000]
     * @param Cpu 处理器配置, 单位为1/1000核；范围[100, 256000]
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存配置, 单位为1M；范围[100, 256000]
     * @return Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存配置, 单位为1M；范围[100, 256000]
     * @param Memory 内存配置, 单位为1M；范围[100, 256000]
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取集群，不填则使用默认集群
     * @return Cluster 集群，不填则使用默认集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群，不填则使用默认集群
     * @param Cluster 集群，不填则使用默认集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取部署要使用的资源组Id，默认为共享资源组
     * @return ResourceGroupId 部署要使用的资源组Id，默认为共享资源组
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * 设置部署要使用的资源组Id，默认为共享资源组
     * @param ResourceGroupId 部署要使用的资源组Id，默认为共享资源组
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * 获取默认为空，表示不需要鉴权，TOKEN 表示选择 Token 鉴权方式
     * @return Authentication 默认为空，表示不需要鉴权，TOKEN 表示选择 Token 鉴权方式
     */
    public String getAuthentication() {
        return this.Authentication;
    }

    /**
     * 设置默认为空，表示不需要鉴权，TOKEN 表示选择 Token 鉴权方式
     * @param Authentication 默认为空，表示不需要鉴权，TOKEN 表示选择 Token 鉴权方式
     */
    public void setAuthentication(String Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * 获取GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     * @return Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * 设置GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     * @param Gpu GPU算力配置，单位为1/1000 卡，范围 [0, 256000]
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * 获取显存配置, 单位为1M，范围 [0, 256000]
     * @return GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * 设置显存配置, 单位为1M，范围 [0, 256000]
     * @param GpuMemory 显存配置, 单位为1M，范围 [0, 256000]
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    /**
     * 获取备注
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取GPU类型
     * @return GpuType GPU类型
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * 设置GPU类型
     * @param GpuType GPU类型
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scaler.", this.Scaler);
        this.setParamSimple(map, prefix + "ServiceConfigId", this.ServiceConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Authentication", this.Authentication);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);

    }
}

