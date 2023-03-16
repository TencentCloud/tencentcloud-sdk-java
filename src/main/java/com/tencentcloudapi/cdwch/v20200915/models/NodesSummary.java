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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodesSummary extends AbstractModel{

    /**
    * 机型，如 S1
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 节点数目
    */
    @SerializedName("NodeSize")
    @Expose
    private Long NodeSize;

    /**
    * cpu核数，单位个
    */
    @SerializedName("Core")
    @Expose
    private Long Core;

    /**
    * 内存大小，单位G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘大小，单位G
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘描述
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachCBSSpec")
    @Expose
    private AttachCBSSpec AttachCBSSpec;

    /**
    * 子产品类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductType")
    @Expose
    private String SubProductType;

    /**
    * 规格对应的核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecCore")
    @Expose
    private Long SpecCore;

    /**
    * 规格对应的内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecMemory")
    @Expose
    private Long SpecMemory;

    /**
    * 磁盘的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 磁盘的最大大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 是否为加密云盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
     * Get 机型，如 S1 
     * @return Spec 机型，如 S1
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 机型，如 S1
     * @param Spec 机型，如 S1
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 节点数目 
     * @return NodeSize 节点数目
     */
    public Long getNodeSize() {
        return this.NodeSize;
    }

    /**
     * Set 节点数目
     * @param NodeSize 节点数目
     */
    public void setNodeSize(Long NodeSize) {
        this.NodeSize = NodeSize;
    }

    /**
     * Get cpu核数，单位个 
     * @return Core cpu核数，单位个
     */
    public Long getCore() {
        return this.Core;
    }

    /**
     * Set cpu核数，单位个
     * @param Core cpu核数，单位个
     */
    public void setCore(Long Core) {
        this.Core = Core;
    }

    /**
     * Get 内存大小，单位G 
     * @return Memory 内存大小，单位G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位G
     * @param Memory 内存大小，单位G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘大小，单位G 
     * @return Disk 磁盘大小，单位G
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 磁盘大小，单位G
     * @param Disk 磁盘大小，单位G
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 磁盘类型 
     * @return DiskType 磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
     * @param DiskType 磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘描述 
     * @return DiskDesc 磁盘描述
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set 磁盘描述
     * @param DiskDesc 磁盘描述
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachCBSSpec 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachCBSSpec getAttachCBSSpec() {
        return this.AttachCBSSpec;
    }

    /**
     * Set 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachCBSSpec 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachCBSSpec(AttachCBSSpec AttachCBSSpec) {
        this.AttachCBSSpec = AttachCBSSpec;
    }

    /**
     * Get 子产品类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductType 子产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductType() {
        return this.SubProductType;
    }

    /**
     * Set 子产品类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductType 子产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductType(String SubProductType) {
        this.SubProductType = SubProductType;
    }

    /**
     * Get 规格对应的核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecCore 规格对应的核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpecCore() {
        return this.SpecCore;
    }

    /**
     * Set 规格对应的核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecCore 规格对应的核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecCore(Long SpecCore) {
        this.SpecCore = SpecCore;
    }

    /**
     * Get 规格对应的内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecMemory 规格对应的内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpecMemory() {
        return this.SpecMemory;
    }

    /**
     * Set 规格对应的内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecMemory 规格对应的内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecMemory(Long SpecMemory) {
        this.SpecMemory = SpecMemory;
    }

    /**
     * Get 磁盘的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCount 磁盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 磁盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCount 磁盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 磁盘的最大大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDiskSize 磁盘的最大大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 磁盘的最大大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDiskSize 磁盘的最大大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 是否为加密云盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 是否为加密云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 是否为加密云盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 是否为加密云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    public NodesSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodesSummary(NodesSummary source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.NodeSize != null) {
            this.NodeSize = new Long(source.NodeSize);
        }
        if (source.Core != null) {
            this.Core = new Long(source.Core);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.AttachCBSSpec != null) {
            this.AttachCBSSpec = new AttachCBSSpec(source.AttachCBSSpec);
        }
        if (source.SubProductType != null) {
            this.SubProductType = new String(source.SubProductType);
        }
        if (source.SpecCore != null) {
            this.SpecCore = new Long(source.SpecCore);
        }
        if (source.SpecMemory != null) {
            this.SpecMemory = new Long(source.SpecMemory);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "NodeSize", this.NodeSize);
        this.setParamSimple(map, prefix + "Core", this.Core);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamObj(map, prefix + "AttachCBSSpec.", this.AttachCBSSpec);
        this.setParamSimple(map, prefix + "SubProductType", this.SubProductType);
        this.setParamSimple(map, prefix + "SpecCore", this.SpecCore);
        this.setParamSimple(map, prefix + "SpecMemory", this.SpecMemory);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);

    }
}

