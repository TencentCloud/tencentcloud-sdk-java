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

public class PodSpec extends AbstractModel{

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
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

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
    * 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。弃用
    */
    @SerializedName("DataVolumes")
    @Expose
    private String [] DataVolumes;

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
    * 是否浮动规格，1是，0否
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

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
     * @return NodeType 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 资源的用途，即节点类型，当前仅支持"TASK"。
     * @param NodeType 资源的用途，即节点类型，当前仅支持"TASK"。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
     * Get 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。弃用 
     * @return DataVolumes 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。弃用
     */
    public String [] getDataVolumes() {
        return this.DataVolumes;
    }

    /**
     * Set 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。弃用
     * @param DataVolumes 资源对宿主机的挂载点，指定的挂载点对应了宿主机的路径，该挂载点在Pod中作为数据存储目录使用。弃用
     */
    public void setDataVolumes(String [] DataVolumes) {
        this.DataVolumes = DataVolumes;
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
     * Get 是否浮动规格，1是，0否 
     * @return IsDynamicSpec 是否浮动规格，1是，0否
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set 是否浮动规格，1是，0否
     * @param IsDynamicSpec 是否浮动规格，1是，0否
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
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

    public PodSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSpec(PodSpec source) {
        if (source.ResourceProviderIdentifier != null) {
            this.ResourceProviderIdentifier = new String(source.ResourceProviderIdentifier);
        }
        if (source.ResourceProviderType != null) {
            this.ResourceProviderType = new String(source.ResourceProviderType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DataVolumes != null) {
            this.DataVolumes = new String[source.DataVolumes.length];
            for (int i = 0; i < source.DataVolumes.length; i++) {
                this.DataVolumes[i] = new String(source.DataVolumes[i]);
            }
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
        if (source.IsDynamicSpec != null) {
            this.IsDynamicSpec = new Long(source.IsDynamicSpec);
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
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "DataVolumes.", this.DataVolumes);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamArrayObj(map, prefix + "PodVolumes.", this.PodVolumes);
        this.setParamSimple(map, prefix + "IsDynamicSpec", this.IsDynamicSpec);
        this.setParamObj(map, prefix + "DynamicPodSpec.", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

