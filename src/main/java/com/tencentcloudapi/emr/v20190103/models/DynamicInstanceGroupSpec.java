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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicInstanceGroupSpec extends AbstractModel {

    /**
    * group 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * pod 数量
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * 最小节点数
    */
    @SerializedName("MinNodes")
    @Expose
    private Long MinNodes;

    /**
    * 最大节点数
    */
    @SerializedName("MaxNodes")
    @Expose
    private Long MaxNodes;

    /**
    *  是否开启存储配置
    */
    @SerializedName("StorageConfigEnabled")
    @Expose
    private Boolean StorageConfigEnabled;

    /**
    * headGroup:head;
workerGroup:worker
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * CPU 核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存(GB)
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * GPU类型
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * GPU核数
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 资源标签
    */
    @SerializedName("ResourceLabels")
    @Expose
    private String ResourceLabels;

    /**
    * 环境变量
    */
    @SerializedName("Env")
    @Expose
    private NameValue [] Env;

    /**
    * 标签
    */
    @SerializedName("Labels")
    @Expose
    private NameValue [] Labels;

    /**
    * 容忍度
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * 调度策略
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 卷目录
    */
    @SerializedName("PersistentVolume")
    @Expose
    private PersistentVolume PersistentVolume;

    /**
     * Get group 名称 
     * @return Name group 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set group 名称
     * @param Name group 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get pod 数量 
     * @return PodCount pod 数量
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set pod 数量
     * @param PodCount pod 数量
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get 最小节点数 
     * @return MinNodes 最小节点数
     */
    public Long getMinNodes() {
        return this.MinNodes;
    }

    /**
     * Set 最小节点数
     * @param MinNodes 最小节点数
     */
    public void setMinNodes(Long MinNodes) {
        this.MinNodes = MinNodes;
    }

    /**
     * Get 最大节点数 
     * @return MaxNodes 最大节点数
     */
    public Long getMaxNodes() {
        return this.MaxNodes;
    }

    /**
     * Set 最大节点数
     * @param MaxNodes 最大节点数
     */
    public void setMaxNodes(Long MaxNodes) {
        this.MaxNodes = MaxNodes;
    }

    /**
     * Get  是否开启存储配置 
     * @return StorageConfigEnabled  是否开启存储配置
     */
    public Boolean getStorageConfigEnabled() {
        return this.StorageConfigEnabled;
    }

    /**
     * Set  是否开启存储配置
     * @param StorageConfigEnabled  是否开启存储配置
     */
    public void setStorageConfigEnabled(Boolean StorageConfigEnabled) {
        this.StorageConfigEnabled = StorageConfigEnabled;
    }

    /**
     * Get headGroup:head;
workerGroup:worker 
     * @return GroupType headGroup:head;
workerGroup:worker
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set headGroup:head;
workerGroup:worker
     * @param GroupType headGroup:head;
workerGroup:worker
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get CPU 核数 
     * @return Cpu CPU 核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU 核数
     * @param Cpu CPU 核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存(GB) 
     * @return MemSize 内存(GB)
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存(GB)
     * @param MemSize 内存(GB)
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
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
     * Get GPU核数 
     * @return Gpu GPU核数
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU核数
     * @param Gpu GPU核数
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 资源标签 
     * @return ResourceLabels 资源标签
     */
    public String getResourceLabels() {
        return this.ResourceLabels;
    }

    /**
     * Set 资源标签
     * @param ResourceLabels 资源标签
     */
    public void setResourceLabels(String ResourceLabels) {
        this.ResourceLabels = ResourceLabels;
    }

    /**
     * Get 环境变量 
     * @return Env 环境变量
     */
    public NameValue [] getEnv() {
        return this.Env;
    }

    /**
     * Set 环境变量
     * @param Env 环境变量
     */
    public void setEnv(NameValue [] Env) {
        this.Env = Env;
    }

    /**
     * Get 标签 
     * @return Labels 标签
     */
    public NameValue [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
     * @param Labels 标签
     */
    public void setLabels(NameValue [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 容忍度 
     * @return Tolerations 容忍度
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set 容忍度
     * @param Tolerations 容忍度
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get 调度策略 
     * @return Scheduler 调度策略
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 调度策略
     * @param Scheduler 调度策略
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 卷目录 
     * @return PersistentVolume 卷目录
     */
    public PersistentVolume getPersistentVolume() {
        return this.PersistentVolume;
    }

    /**
     * Set 卷目录
     * @param PersistentVolume 卷目录
     */
    public void setPersistentVolume(PersistentVolume PersistentVolume) {
        this.PersistentVolume = PersistentVolume;
    }

    public DynamicInstanceGroupSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicInstanceGroupSpec(DynamicInstanceGroupSpec source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.MinNodes != null) {
            this.MinNodes = new Long(source.MinNodes);
        }
        if (source.MaxNodes != null) {
            this.MaxNodes = new Long(source.MaxNodes);
        }
        if (source.StorageConfigEnabled != null) {
            this.StorageConfigEnabled = new Boolean(source.StorageConfigEnabled);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.ResourceLabels != null) {
            this.ResourceLabels = new String(source.ResourceLabels);
        }
        if (source.Env != null) {
            this.Env = new NameValue[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new NameValue(source.Env[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new NameValue[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new NameValue(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.PersistentVolume != null) {
            this.PersistentVolume = new PersistentVolume(source.PersistentVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "MinNodes", this.MinNodes);
        this.setParamSimple(map, prefix + "MaxNodes", this.MaxNodes);
        this.setParamSimple(map, prefix + "StorageConfigEnabled", this.StorageConfigEnabled);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "ResourceLabels", this.ResourceLabels);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamObj(map, prefix + "PersistentVolume.", this.PersistentVolume);

    }
}

