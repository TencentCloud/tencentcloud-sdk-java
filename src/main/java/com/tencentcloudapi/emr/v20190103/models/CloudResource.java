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

public class CloudResource extends AbstractModel {

    /**
    * <p>组件角色名</p>
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * <p>pod请求数量</p>
    */
    @SerializedName("PodNumber")
    @Expose
    private Long PodNumber;

    /**
    * <p>Cpu请求数量最大值</p>
    */
    @SerializedName("LimitCpu")
    @Expose
    private Long LimitCpu;

    /**
    * <p>内存请求数量最大值</p>
    */
    @SerializedName("LimitMemory")
    @Expose
    private Long LimitMemory;

    /**
    * <p>服务名称，如HIVE</p>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>数据卷目录设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeDir")
    @Expose
    private VolumeSetting VolumeDir;

    /**
    * <p>组件外部访问设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalAccess")
    @Expose
    private ExternalAccess ExternalAccess;

    /**
    * <p>节点亲和性设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Affinity")
    @Expose
    private NodeAffinity Affinity;

    /**
    * <p>所选数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disks")
    @Expose
    private Disk [] Disks;

    /**
    * <p>容忍</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>pod亲和性</p>
    */
    @SerializedName("PodAffinity")
    @Expose
    private PodAffinitySpec PodAffinity;

    /**
    * <p>pod反亲和性</p>
    */
    @SerializedName("PodAntiAffinity")
    @Expose
    private PodAffinitySpec PodAntiAffinity;

    /**
    * <p>拓扑分布约束</p>
    */
    @SerializedName("TopologySpreadConstraints")
    @Expose
    private TopologySpreadConstraint [] TopologySpreadConstraints;

    /**
    * <p>pod标签</p>
    */
    @SerializedName("PodLabels")
    @Expose
    private StringMap [] PodLabels;

    /**
    * <p>是否创建默认raycluster</p>
    */
    @SerializedName("EnableDefaultRayCluster")
    @Expose
    private Boolean EnableDefaultRayCluster;

    /**
     * Get <p>组件角色名</p> 
     * @return ComponentName <p>组件角色名</p>
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set <p>组件角色名</p>
     * @param ComponentName <p>组件角色名</p>
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get <p>pod请求数量</p> 
     * @return PodNumber <p>pod请求数量</p>
     */
    public Long getPodNumber() {
        return this.PodNumber;
    }

    /**
     * Set <p>pod请求数量</p>
     * @param PodNumber <p>pod请求数量</p>
     */
    public void setPodNumber(Long PodNumber) {
        this.PodNumber = PodNumber;
    }

    /**
     * Get <p>Cpu请求数量最大值</p> 
     * @return LimitCpu <p>Cpu请求数量最大值</p>
     */
    public Long getLimitCpu() {
        return this.LimitCpu;
    }

    /**
     * Set <p>Cpu请求数量最大值</p>
     * @param LimitCpu <p>Cpu请求数量最大值</p>
     */
    public void setLimitCpu(Long LimitCpu) {
        this.LimitCpu = LimitCpu;
    }

    /**
     * Get <p>内存请求数量最大值</p> 
     * @return LimitMemory <p>内存请求数量最大值</p>
     */
    public Long getLimitMemory() {
        return this.LimitMemory;
    }

    /**
     * Set <p>内存请求数量最大值</p>
     * @param LimitMemory <p>内存请求数量最大值</p>
     */
    public void setLimitMemory(Long LimitMemory) {
        this.LimitMemory = LimitMemory;
    }

    /**
     * Get <p>服务名称，如HIVE</p> 
     * @return Service <p>服务名称，如HIVE</p>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>服务名称，如HIVE</p>
     * @param Service <p>服务名称，如HIVE</p>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>数据卷目录设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeDir <p>数据卷目录设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeSetting getVolumeDir() {
        return this.VolumeDir;
    }

    /**
     * Set <p>数据卷目录设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeDir <p>数据卷目录设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeDir(VolumeSetting VolumeDir) {
        this.VolumeDir = VolumeDir;
    }

    /**
     * Get <p>组件外部访问设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalAccess <p>组件外部访问设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalAccess getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set <p>组件外部访问设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalAccess <p>组件外部访问设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalAccess(ExternalAccess ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get <p>节点亲和性设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Affinity <p>节点亲和性设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeAffinity getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>节点亲和性设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Affinity <p>节点亲和性设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffinity(NodeAffinity Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>所选数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disks <p>所选数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Disk [] getDisks() {
        return this.Disks;
    }

    /**
     * Set <p>所选数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disks <p>所选数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisks(Disk [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get <p>容忍</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tolerations <p>容忍</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>容忍</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tolerations <p>容忍</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>pod亲和性</p> 
     * @return PodAffinity <p>pod亲和性</p>
     */
    public PodAffinitySpec getPodAffinity() {
        return this.PodAffinity;
    }

    /**
     * Set <p>pod亲和性</p>
     * @param PodAffinity <p>pod亲和性</p>
     */
    public void setPodAffinity(PodAffinitySpec PodAffinity) {
        this.PodAffinity = PodAffinity;
    }

    /**
     * Get <p>pod反亲和性</p> 
     * @return PodAntiAffinity <p>pod反亲和性</p>
     */
    public PodAffinitySpec getPodAntiAffinity() {
        return this.PodAntiAffinity;
    }

    /**
     * Set <p>pod反亲和性</p>
     * @param PodAntiAffinity <p>pod反亲和性</p>
     */
    public void setPodAntiAffinity(PodAffinitySpec PodAntiAffinity) {
        this.PodAntiAffinity = PodAntiAffinity;
    }

    /**
     * Get <p>拓扑分布约束</p> 
     * @return TopologySpreadConstraints <p>拓扑分布约束</p>
     */
    public TopologySpreadConstraint [] getTopologySpreadConstraints() {
        return this.TopologySpreadConstraints;
    }

    /**
     * Set <p>拓扑分布约束</p>
     * @param TopologySpreadConstraints <p>拓扑分布约束</p>
     */
    public void setTopologySpreadConstraints(TopologySpreadConstraint [] TopologySpreadConstraints) {
        this.TopologySpreadConstraints = TopologySpreadConstraints;
    }

    /**
     * Get <p>pod标签</p> 
     * @return PodLabels <p>pod标签</p>
     */
    public StringMap [] getPodLabels() {
        return this.PodLabels;
    }

    /**
     * Set <p>pod标签</p>
     * @param PodLabels <p>pod标签</p>
     */
    public void setPodLabels(StringMap [] PodLabels) {
        this.PodLabels = PodLabels;
    }

    /**
     * Get <p>是否创建默认raycluster</p> 
     * @return EnableDefaultRayCluster <p>是否创建默认raycluster</p>
     */
    public Boolean getEnableDefaultRayCluster() {
        return this.EnableDefaultRayCluster;
    }

    /**
     * Set <p>是否创建默认raycluster</p>
     * @param EnableDefaultRayCluster <p>是否创建默认raycluster</p>
     */
    public void setEnableDefaultRayCluster(Boolean EnableDefaultRayCluster) {
        this.EnableDefaultRayCluster = EnableDefaultRayCluster;
    }

    public CloudResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudResource(CloudResource source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.PodNumber != null) {
            this.PodNumber = new Long(source.PodNumber);
        }
        if (source.LimitCpu != null) {
            this.LimitCpu = new Long(source.LimitCpu);
        }
        if (source.LimitMemory != null) {
            this.LimitMemory = new Long(source.LimitMemory);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.VolumeDir != null) {
            this.VolumeDir = new VolumeSetting(source.VolumeDir);
        }
        if (source.ExternalAccess != null) {
            this.ExternalAccess = new ExternalAccess(source.ExternalAccess);
        }
        if (source.Affinity != null) {
            this.Affinity = new NodeAffinity(source.Affinity);
        }
        if (source.Disks != null) {
            this.Disks = new Disk[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new Disk(source.Disks[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.PodAffinity != null) {
            this.PodAffinity = new PodAffinitySpec(source.PodAffinity);
        }
        if (source.PodAntiAffinity != null) {
            this.PodAntiAffinity = new PodAffinitySpec(source.PodAntiAffinity);
        }
        if (source.TopologySpreadConstraints != null) {
            this.TopologySpreadConstraints = new TopologySpreadConstraint[source.TopologySpreadConstraints.length];
            for (int i = 0; i < source.TopologySpreadConstraints.length; i++) {
                this.TopologySpreadConstraints[i] = new TopologySpreadConstraint(source.TopologySpreadConstraints[i]);
            }
        }
        if (source.PodLabels != null) {
            this.PodLabels = new StringMap[source.PodLabels.length];
            for (int i = 0; i < source.PodLabels.length; i++) {
                this.PodLabels[i] = new StringMap(source.PodLabels[i]);
            }
        }
        if (source.EnableDefaultRayCluster != null) {
            this.EnableDefaultRayCluster = new Boolean(source.EnableDefaultRayCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "PodNumber", this.PodNumber);
        this.setParamSimple(map, prefix + "LimitCpu", this.LimitCpu);
        this.setParamSimple(map, prefix + "LimitMemory", this.LimitMemory);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamObj(map, prefix + "VolumeDir.", this.VolumeDir);
        this.setParamObj(map, prefix + "ExternalAccess.", this.ExternalAccess);
        this.setParamObj(map, prefix + "Affinity.", this.Affinity);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamObj(map, prefix + "PodAffinity.", this.PodAffinity);
        this.setParamObj(map, prefix + "PodAntiAffinity.", this.PodAntiAffinity);
        this.setParamArrayObj(map, prefix + "TopologySpreadConstraints.", this.TopologySpreadConstraints);
        this.setParamArrayObj(map, prefix + "PodLabels.", this.PodLabels);
        this.setParamSimple(map, prefix + "EnableDefaultRayCluster", this.EnableDefaultRayCluster);

    }
}

