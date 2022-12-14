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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodNewSpec extends AbstractModel{

    /**
    * 外部资源提供者的标识符，例如"cls-a1cd23fa"。
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * 外部资源提供者类型，例如"tke",当前仅支持"tke"。
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * 资源的用途，即节点类型，当前仅支持"TASK"。
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * CPU核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位为GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Eks集群-CPU类型，当前支持"intel"和"amd"
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * Pod节点数据目录挂载信息。
    */
    @SerializedName("PodVolumes")
    @Expose
    private PodVolume [] PodVolumes;

    /**
    * 是否浮动规格，默认否
<li>true：代表是</li>
<li>false：代表否</li>
    */
    @SerializedName("EnableDynamicSpecFlag")
    @Expose
    private Boolean EnableDynamicSpecFlag;

    /**
    * 浮动规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private DynamicPodSpec DynamicPodSpec;

    /**
    * 代表vpc网络唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 代表vpc子网唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * pod name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get 外部资源提供者的标识符，例如"cls-a1cd23fa"。 
     * @return ResourceProviderIdentifier 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     * @param ResourceProviderIdentifier 外部资源提供者的标识符，例如"cls-a1cd23fa"。
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get 外部资源提供者类型，例如"tke",当前仅支持"tke"。 
     * @return ResourceProviderType 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     * @param ResourceProviderType 外部资源提供者类型，例如"tke",当前仅支持"tke"。
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get 资源的用途，即节点类型，当前仅支持"TASK"。 
     * @return NodeFlag 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set 资源的用途，即节点类型，当前仅支持"TASK"。
     * @param NodeFlag 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get CPU核数。 
     * @return Cpu CPU核数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数。
     * @param Cpu CPU核数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位为GB。 
     * @return Memory 内存大小，单位为GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位为GB。
     * @param Memory 内存大小，单位为GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Eks集群-CPU类型，当前支持"intel"和"amd" 
     * @return CpuType Eks集群-CPU类型，当前支持"intel"和"amd"
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Eks集群-CPU类型，当前支持"intel"和"amd"
     * @param CpuType Eks集群-CPU类型，当前支持"intel"和"amd"
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get Pod节点数据目录挂载信息。 
     * @return PodVolumes Pod节点数据目录挂载信息。
     */
    public PodVolume [] getPodVolumes() {
        return this.PodVolumes;
    }

    /**
     * Set Pod节点数据目录挂载信息。
     * @param PodVolumes Pod节点数据目录挂载信息。
     */
    public void setPodVolumes(PodVolume [] PodVolumes) {
        this.PodVolumes = PodVolumes;
    }

    /**
     * Get 是否浮动规格，默认否
<li>true：代表是</li>
<li>false：代表否</li> 
     * @return EnableDynamicSpecFlag 是否浮动规格，默认否
<li>true：代表是</li>
<li>false：代表否</li>
     */
    public Boolean getEnableDynamicSpecFlag() {
        return this.EnableDynamicSpecFlag;
    }

    /**
     * Set 是否浮动规格，默认否
<li>true：代表是</li>
<li>false：代表否</li>
     * @param EnableDynamicSpecFlag 是否浮动规格，默认否
<li>true：代表是</li>
<li>false：代表否</li>
     */
    public void setEnableDynamicSpecFlag(Boolean EnableDynamicSpecFlag) {
        this.EnableDynamicSpecFlag = EnableDynamicSpecFlag;
    }

    /**
     * Get 浮动规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicPodSpec 浮动规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DynamicPodSpec getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set 浮动规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicPodSpec 浮动规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicPodSpec(DynamicPodSpec DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get 代表vpc网络唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 代表vpc网络唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 代表vpc网络唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 代表vpc网络唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 代表vpc子网唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 代表vpc子网唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 代表vpc子网唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 代表vpc子网唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get pod name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName pod name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod name
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName pod name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public PodNewSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodNewSpec(PodNewSpec source) {
        if (source.ResourceProviderIdentifier != null) {
            this.ResourceProviderIdentifier = new String(source.ResourceProviderIdentifier);
        }
        if (source.ResourceProviderType != null) {
            this.ResourceProviderType = new String(source.ResourceProviderType);
        }
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.PodVolumes != null) {
            this.PodVolumes = new PodVolume[source.PodVolumes.length];
            for (int i = 0; i < source.PodVolumes.length; i++) {
                this.PodVolumes[i] = new PodVolume(source.PodVolumes[i]);
            }
        }
        if (source.EnableDynamicSpecFlag != null) {
            this.EnableDynamicSpecFlag = new Boolean(source.EnableDynamicSpecFlag);
        }
        if (source.DynamicPodSpec != null) {
            this.DynamicPodSpec = new DynamicPodSpec(source.DynamicPodSpec);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceProviderIdentifier", this.ResourceProviderIdentifier);
        this.setParamSimple(map, prefix + "ResourceProviderType", this.ResourceProviderType);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamArrayObj(map, prefix + "PodVolumes.", this.PodVolumes);
        this.setParamSimple(map, prefix + "EnableDynamicSpecFlag", this.EnableDynamicSpecFlag);
        this.setParamObj(map, prefix + "DynamicPodSpec.", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

