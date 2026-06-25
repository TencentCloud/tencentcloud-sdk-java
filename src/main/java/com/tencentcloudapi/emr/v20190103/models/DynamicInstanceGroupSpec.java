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
    * <p>group 名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>pod 数量</p>
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * <p>最小节点数</p>
    */
    @SerializedName("MinNodes")
    @Expose
    private Long MinNodes;

    /**
    * <p>最大节点数</p>
    */
    @SerializedName("MaxNodes")
    @Expose
    private Long MaxNodes;

    /**
    * <p>是否开启存储配置</p>
    */
    @SerializedName("StorageConfigEnabled")
    @Expose
    private Boolean StorageConfigEnabled;

    /**
    * <p>headGroup:head;<br>workerGroup:worker</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>CPU 核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存(GB)</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>GPU类型</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>GPU核数</p>
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("ResourceLabels")
    @Expose
    private String ResourceLabels;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Env")
    @Expose
    private NameValue [] Env;

    /**
    * <p>标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private NameValue [] Labels;

    /**
    * <p>容忍度</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>调度策略</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>卷目录</p>
    */
    @SerializedName("PersistentVolume")
    @Expose
    private PersistentVolume PersistentVolume;

    /**
    * <p>前置启动命令</p>
    */
    @SerializedName("PreStartCommand")
    @Expose
    private String PreStartCommand;

    /**
    * <p>RayStart启动参数</p>
    */
    @SerializedName("RayStartParams")
    @Expose
    private String RayStartParams;

    /**
     * Get <p>group 名称</p> 
     * @return Name <p>group 名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>group 名称</p>
     * @param Name <p>group 名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>pod 数量</p> 
     * @return PodCount <p>pod 数量</p>
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set <p>pod 数量</p>
     * @param PodCount <p>pod 数量</p>
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get <p>最小节点数</p> 
     * @return MinNodes <p>最小节点数</p>
     */
    public Long getMinNodes() {
        return this.MinNodes;
    }

    /**
     * Set <p>最小节点数</p>
     * @param MinNodes <p>最小节点数</p>
     */
    public void setMinNodes(Long MinNodes) {
        this.MinNodes = MinNodes;
    }

    /**
     * Get <p>最大节点数</p> 
     * @return MaxNodes <p>最大节点数</p>
     */
    public Long getMaxNodes() {
        return this.MaxNodes;
    }

    /**
     * Set <p>最大节点数</p>
     * @param MaxNodes <p>最大节点数</p>
     */
    public void setMaxNodes(Long MaxNodes) {
        this.MaxNodes = MaxNodes;
    }

    /**
     * Get <p>是否开启存储配置</p> 
     * @return StorageConfigEnabled <p>是否开启存储配置</p>
     */
    public Boolean getStorageConfigEnabled() {
        return this.StorageConfigEnabled;
    }

    /**
     * Set <p>是否开启存储配置</p>
     * @param StorageConfigEnabled <p>是否开启存储配置</p>
     */
    public void setStorageConfigEnabled(Boolean StorageConfigEnabled) {
        this.StorageConfigEnabled = StorageConfigEnabled;
    }

    /**
     * Get <p>headGroup:head;<br>workerGroup:worker</p> 
     * @return GroupType <p>headGroup:head;<br>workerGroup:worker</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>headGroup:head;<br>workerGroup:worker</p>
     * @param GroupType <p>headGroup:head;<br>workerGroup:worker</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>CPU 核数</p> 
     * @return Cpu <p>CPU 核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU 核数</p>
     * @param Cpu <p>CPU 核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存(GB)</p> 
     * @return MemSize <p>内存(GB)</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存(GB)</p>
     * @param MemSize <p>内存(GB)</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>GPU类型</p> 
     * @return GpuType <p>GPU类型</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU类型</p>
     * @param GpuType <p>GPU类型</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>GPU核数</p> 
     * @return Gpu <p>GPU核数</p>
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set <p>GPU核数</p>
     * @param Gpu <p>GPU核数</p>
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get <p>资源标签</p> 
     * @return ResourceLabels <p>资源标签</p>
     */
    public String getResourceLabels() {
        return this.ResourceLabels;
    }

    /**
     * Set <p>资源标签</p>
     * @param ResourceLabels <p>资源标签</p>
     */
    public void setResourceLabels(String ResourceLabels) {
        this.ResourceLabels = ResourceLabels;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Env <p>环境变量</p>
     */
    public NameValue [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境变量</p>
     * @param Env <p>环境变量</p>
     */
    public void setEnv(NameValue [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>标签</p> 
     * @return Labels <p>标签</p>
     */
    public NameValue [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签</p>
     * @param Labels <p>标签</p>
     */
    public void setLabels(NameValue [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>容忍度</p> 
     * @return Tolerations <p>容忍度</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>容忍度</p>
     * @param Tolerations <p>容忍度</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>调度策略</p> 
     * @return Scheduler <p>调度策略</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>调度策略</p>
     * @param Scheduler <p>调度策略</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>卷目录</p> 
     * @return PersistentVolume <p>卷目录</p>
     */
    public PersistentVolume getPersistentVolume() {
        return this.PersistentVolume;
    }

    /**
     * Set <p>卷目录</p>
     * @param PersistentVolume <p>卷目录</p>
     */
    public void setPersistentVolume(PersistentVolume PersistentVolume) {
        this.PersistentVolume = PersistentVolume;
    }

    /**
     * Get <p>前置启动命令</p> 
     * @return PreStartCommand <p>前置启动命令</p>
     */
    public String getPreStartCommand() {
        return this.PreStartCommand;
    }

    /**
     * Set <p>前置启动命令</p>
     * @param PreStartCommand <p>前置启动命令</p>
     */
    public void setPreStartCommand(String PreStartCommand) {
        this.PreStartCommand = PreStartCommand;
    }

    /**
     * Get <p>RayStart启动参数</p> 
     * @return RayStartParams <p>RayStart启动参数</p>
     */
    public String getRayStartParams() {
        return this.RayStartParams;
    }

    /**
     * Set <p>RayStart启动参数</p>
     * @param RayStartParams <p>RayStart启动参数</p>
     */
    public void setRayStartParams(String RayStartParams) {
        this.RayStartParams = RayStartParams;
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
        if (source.PreStartCommand != null) {
            this.PreStartCommand = new String(source.PreStartCommand);
        }
        if (source.RayStartParams != null) {
            this.RayStartParams = new String(source.RayStartParams);
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
        this.setParamSimple(map, prefix + "PreStartCommand", this.PreStartCommand);
        this.setParamSimple(map, prefix + "RayStartParams", this.RayStartParams);

    }
}

