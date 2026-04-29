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

public class DynamicInstanceGroup extends AbstractModel {

    /**
    * <p>资源组类型</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>资源组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>pod cpu核数</p>
    */
    @SerializedName("PodCpu")
    @Expose
    private Long PodCpu;

    /**
    * <p>pod mem大小（GB）</p>
    */
    @SerializedName("PodMem")
    @Expose
    private Long PodMem;

    /**
    * <p>pod gpu类型</p>
    */
    @SerializedName("PodGpuType")
    @Expose
    private String PodGpuType;

    /**
    * <p>pod gpu块数</p>
    */
    @SerializedName("PodGpu")
    @Expose
    private Long PodGpu;

    /**
    * <p>pod个数</p>
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
    * <p>pod弹性最小个数</p>
    */
    @SerializedName("MinPodNum")
    @Expose
    private Long MinPodNum;

    /**
    * <p>pod弹性最大个数，当MaxPodNum &gt; MinPodNum时，默认表示开启弹性扩缩容，将在范围内扩缩容</p>
    */
    @SerializedName("MaxPodNum")
    @Expose
    private Long MaxPodNum;

    /**
    * <p>是否支持存储配置</p>
    */
    @SerializedName("SupportPV")
    @Expose
    private Boolean SupportPV;

    /**
    * <p>cbs存储卷列表</p>
    */
    @SerializedName("CBSVolumes")
    @Expose
    private CBSVolume [] CBSVolumes;

    /**
    * <p>cfs存储卷列表</p>
    */
    @SerializedName("CFSVolumes")
    @Expose
    private CFSVolume [] CFSVolumes;

    /**
    * <p>cos存储卷列表</p>
    */
    @SerializedName("COSVolumes")
    @Expose
    private COSVolume [] COSVolumes;

    /**
    * <p>挂载卷列表</p>
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>pod标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * <p>Tolerations定义</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Envs")
    @Expose
    private NameValue [] Envs;

    /**
    * <p>节点调度策略</p>
    */
    @SerializedName("SchedulingPolicy")
    @Expose
    private String SchedulingPolicy;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("ResourceLabel")
    @Expose
    private String ResourceLabel;

    /**
    * <p>GPU资源厂商key</p>
    */
    @SerializedName("PodGpuResourceKey")
    @Expose
    private String PodGpuResourceKey;

    /**
    * <p>CFS Turbo 挂载列表</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
     * Get <p>资源组类型</p> 
     * @return GroupType <p>资源组类型</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>资源组类型</p>
     * @param GroupType <p>资源组类型</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>资源组名称</p> 
     * @return GroupName <p>资源组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>资源组名称</p>
     * @param GroupName <p>资源组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>pod cpu核数</p> 
     * @return PodCpu <p>pod cpu核数</p>
     */
    public Long getPodCpu() {
        return this.PodCpu;
    }

    /**
     * Set <p>pod cpu核数</p>
     * @param PodCpu <p>pod cpu核数</p>
     */
    public void setPodCpu(Long PodCpu) {
        this.PodCpu = PodCpu;
    }

    /**
     * Get <p>pod mem大小（GB）</p> 
     * @return PodMem <p>pod mem大小（GB）</p>
     */
    public Long getPodMem() {
        return this.PodMem;
    }

    /**
     * Set <p>pod mem大小（GB）</p>
     * @param PodMem <p>pod mem大小（GB）</p>
     */
    public void setPodMem(Long PodMem) {
        this.PodMem = PodMem;
    }

    /**
     * Get <p>pod gpu类型</p> 
     * @return PodGpuType <p>pod gpu类型</p>
     */
    public String getPodGpuType() {
        return this.PodGpuType;
    }

    /**
     * Set <p>pod gpu类型</p>
     * @param PodGpuType <p>pod gpu类型</p>
     */
    public void setPodGpuType(String PodGpuType) {
        this.PodGpuType = PodGpuType;
    }

    /**
     * Get <p>pod gpu块数</p> 
     * @return PodGpu <p>pod gpu块数</p>
     */
    public Long getPodGpu() {
        return this.PodGpu;
    }

    /**
     * Set <p>pod gpu块数</p>
     * @param PodGpu <p>pod gpu块数</p>
     */
    public void setPodGpu(Long PodGpu) {
        this.PodGpu = PodGpu;
    }

    /**
     * Get <p>pod个数</p> 
     * @return PodNum <p>pod个数</p>
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set <p>pod个数</p>
     * @param PodNum <p>pod个数</p>
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    /**
     * Get <p>pod弹性最小个数</p> 
     * @return MinPodNum <p>pod弹性最小个数</p>
     */
    public Long getMinPodNum() {
        return this.MinPodNum;
    }

    /**
     * Set <p>pod弹性最小个数</p>
     * @param MinPodNum <p>pod弹性最小个数</p>
     */
    public void setMinPodNum(Long MinPodNum) {
        this.MinPodNum = MinPodNum;
    }

    /**
     * Get <p>pod弹性最大个数，当MaxPodNum &gt; MinPodNum时，默认表示开启弹性扩缩容，将在范围内扩缩容</p> 
     * @return MaxPodNum <p>pod弹性最大个数，当MaxPodNum &gt; MinPodNum时，默认表示开启弹性扩缩容，将在范围内扩缩容</p>
     */
    public Long getMaxPodNum() {
        return this.MaxPodNum;
    }

    /**
     * Set <p>pod弹性最大个数，当MaxPodNum &gt; MinPodNum时，默认表示开启弹性扩缩容，将在范围内扩缩容</p>
     * @param MaxPodNum <p>pod弹性最大个数，当MaxPodNum &gt; MinPodNum时，默认表示开启弹性扩缩容，将在范围内扩缩容</p>
     */
    public void setMaxPodNum(Long MaxPodNum) {
        this.MaxPodNum = MaxPodNum;
    }

    /**
     * Get <p>是否支持存储配置</p> 
     * @return SupportPV <p>是否支持存储配置</p>
     */
    public Boolean getSupportPV() {
        return this.SupportPV;
    }

    /**
     * Set <p>是否支持存储配置</p>
     * @param SupportPV <p>是否支持存储配置</p>
     */
    public void setSupportPV(Boolean SupportPV) {
        this.SupportPV = SupportPV;
    }

    /**
     * Get <p>cbs存储卷列表</p> 
     * @return CBSVolumes <p>cbs存储卷列表</p>
     */
    public CBSVolume [] getCBSVolumes() {
        return this.CBSVolumes;
    }

    /**
     * Set <p>cbs存储卷列表</p>
     * @param CBSVolumes <p>cbs存储卷列表</p>
     */
    public void setCBSVolumes(CBSVolume [] CBSVolumes) {
        this.CBSVolumes = CBSVolumes;
    }

    /**
     * Get <p>cfs存储卷列表</p> 
     * @return CFSVolumes <p>cfs存储卷列表</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>cfs存储卷列表</p>
     * @param CFSVolumes <p>cfs存储卷列表</p>
     */
    public void setCFSVolumes(CFSVolume [] CFSVolumes) {
        this.CFSVolumes = CFSVolumes;
    }

    /**
     * Get <p>cos存储卷列表</p> 
     * @return COSVolumes <p>cos存储卷列表</p>
     */
    public COSVolume [] getCOSVolumes() {
        return this.COSVolumes;
    }

    /**
     * Set <p>cos存储卷列表</p>
     * @param COSVolumes <p>cos存储卷列表</p>
     */
    public void setCOSVolumes(COSVolume [] COSVolumes) {
        this.COSVolumes = COSVolumes;
    }

    /**
     * Get <p>挂载卷列表</p> 
     * @return VolumeMounts <p>挂载卷列表</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>挂载卷列表</p>
     * @param VolumeMounts <p>挂载卷列表</p>
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>pod标签</p> 
     * @return Labels <p>pod标签</p>
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>pod标签</p>
     * @param Labels <p>pod标签</p>
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations定义</p> 
     * @return Tolerations <p>Tolerations定义</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations定义</p>
     * @param Tolerations <p>Tolerations定义</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Envs <p>环境变量</p>
     */
    public NameValue [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量</p>
     * @param Envs <p>环境变量</p>
     */
    public void setEnvs(NameValue [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>节点调度策略</p> 
     * @return SchedulingPolicy <p>节点调度策略</p>
     */
    public String getSchedulingPolicy() {
        return this.SchedulingPolicy;
    }

    /**
     * Set <p>节点调度策略</p>
     * @param SchedulingPolicy <p>节点调度策略</p>
     */
    public void setSchedulingPolicy(String SchedulingPolicy) {
        this.SchedulingPolicy = SchedulingPolicy;
    }

    /**
     * Get <p>资源标签</p> 
     * @return ResourceLabel <p>资源标签</p>
     */
    public String getResourceLabel() {
        return this.ResourceLabel;
    }

    /**
     * Set <p>资源标签</p>
     * @param ResourceLabel <p>资源标签</p>
     */
    public void setResourceLabel(String ResourceLabel) {
        this.ResourceLabel = ResourceLabel;
    }

    /**
     * Get <p>GPU资源厂商key</p> 
     * @return PodGpuResourceKey <p>GPU资源厂商key</p>
     */
    public String getPodGpuResourceKey() {
        return this.PodGpuResourceKey;
    }

    /**
     * Set <p>GPU资源厂商key</p>
     * @param PodGpuResourceKey <p>GPU资源厂商key</p>
     */
    public void setPodGpuResourceKey(String PodGpuResourceKey) {
        this.PodGpuResourceKey = PodGpuResourceKey;
    }

    /**
     * Get <p>CFS Turbo 挂载列表</p> 
     * @return CFSTurboVolumes <p>CFS Turbo 挂载列表</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>CFS Turbo 挂载列表</p>
     * @param CFSTurboVolumes <p>CFS Turbo 挂载列表</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    public DynamicInstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicInstanceGroup(DynamicInstanceGroup source) {
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PodCpu != null) {
            this.PodCpu = new Long(source.PodCpu);
        }
        if (source.PodMem != null) {
            this.PodMem = new Long(source.PodMem);
        }
        if (source.PodGpuType != null) {
            this.PodGpuType = new String(source.PodGpuType);
        }
        if (source.PodGpu != null) {
            this.PodGpu = new Long(source.PodGpu);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
        if (source.MinPodNum != null) {
            this.MinPodNum = new Long(source.MinPodNum);
        }
        if (source.MaxPodNum != null) {
            this.MaxPodNum = new Long(source.MaxPodNum);
        }
        if (source.SupportPV != null) {
            this.SupportPV = new Boolean(source.SupportPV);
        }
        if (source.CBSVolumes != null) {
            this.CBSVolumes = new CBSVolume[source.CBSVolumes.length];
            for (int i = 0; i < source.CBSVolumes.length; i++) {
                this.CBSVolumes[i] = new CBSVolume(source.CBSVolumes[i]);
            }
        }
        if (source.CFSVolumes != null) {
            this.CFSVolumes = new CFSVolume[source.CFSVolumes.length];
            for (int i = 0; i < source.CFSVolumes.length; i++) {
                this.CFSVolumes[i] = new CFSVolume(source.CFSVolumes[i]);
            }
        }
        if (source.COSVolumes != null) {
            this.COSVolumes = new COSVolume[source.COSVolumes.length];
            for (int i = 0; i < source.COSVolumes.length; i++) {
                this.COSVolumes[i] = new COSVolume(source.COSVolumes[i]);
            }
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new TkeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TkeLabel(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new NameValue[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new NameValue(source.Envs[i]);
            }
        }
        if (source.SchedulingPolicy != null) {
            this.SchedulingPolicy = new String(source.SchedulingPolicy);
        }
        if (source.ResourceLabel != null) {
            this.ResourceLabel = new String(source.ResourceLabel);
        }
        if (source.PodGpuResourceKey != null) {
            this.PodGpuResourceKey = new String(source.PodGpuResourceKey);
        }
        if (source.CFSTurboVolumes != null) {
            this.CFSTurboVolumes = new CFSTurboVolume[source.CFSTurboVolumes.length];
            for (int i = 0; i < source.CFSTurboVolumes.length; i++) {
                this.CFSTurboVolumes[i] = new CFSTurboVolume(source.CFSTurboVolumes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "PodCpu", this.PodCpu);
        this.setParamSimple(map, prefix + "PodMem", this.PodMem);
        this.setParamSimple(map, prefix + "PodGpuType", this.PodGpuType);
        this.setParamSimple(map, prefix + "PodGpu", this.PodGpu);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);
        this.setParamSimple(map, prefix + "MinPodNum", this.MinPodNum);
        this.setParamSimple(map, prefix + "MaxPodNum", this.MaxPodNum);
        this.setParamSimple(map, prefix + "SupportPV", this.SupportPV);
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "SchedulingPolicy", this.SchedulingPolicy);
        this.setParamSimple(map, prefix + "ResourceLabel", this.ResourceLabel);
        this.setParamSimple(map, prefix + "PodGpuResourceKey", this.PodGpuResourceKey);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);

    }
}

