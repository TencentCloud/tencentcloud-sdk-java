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

public class Resource extends AbstractModel {

    /**
    * 节点规格描述，如CVM.SA2。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 取值范围:
"LOCAL_SSD"   3     //本地SSD 
"CLOUD_SSD"   4     //云SSD 
"CLOUD_PREMIUM"  5  //高效云盘
"CLOUD_HSSD"   6    //增强型SSD云硬盘 
"CLOUD_THROUGHPUT" 11//吞吐型云硬盘 
"CLOUD_TSSD"  12     //极速型SSD云硬盘 
"CLOUD_BSSD"    13   //通用型SSD云硬盘 
"CLOUD_BIGDATA" 14   //大数据型云硬盘
"CLOUD_HIGHIO"  15   //高IO型云硬盘 

该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 数据盘类型 取值范围：

CLOUD_SSD：表示云SSD。

CLOUD_PREMIUM：表示高效云盘。

CLOUD_BASIC：表示云硬盘。

LOCAL_BASIC：表示本地盘。

LOCAL_SSD：表示本地SSD。

CLOUD_HSSD：表示增强型SSD云硬盘。

CLOUD_THROUGHPUT：表示吞吐型云硬盘。

CLOUD_TSSD：表示极速型SSD云硬盘。

CLOUD_BIGDATA：表示大数据型云硬盘。

CLOUD_HIGHIO：表示高IO型云硬盘。

CLOUD_BSSD：表示通用型SSD云硬盘。

REMOTE_SSD：表示远端SSD盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 内存容量,单位为M
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 数据盘容量
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 系统盘容量
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 规格类型，如S2.MEDIUM8
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 本地盘数量，该字段已废弃
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * 本地盘数量，如2
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * GPU信息
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get 节点规格描述，如CVM.SA2。 
     * @return Spec 节点规格描述，如CVM.SA2。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 节点规格描述，如CVM.SA2。
     * @param Spec 节点规格描述，如CVM.SA2。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 取值范围:
"LOCAL_SSD"   3     //本地SSD 
"CLOUD_SSD"   4     //云SSD 
"CLOUD_PREMIUM"  5  //高效云盘
"CLOUD_HSSD"   6    //增强型SSD云硬盘 
"CLOUD_THROUGHPUT" 11//吞吐型云硬盘 
"CLOUD_TSSD"  12     //极速型SSD云硬盘 
"CLOUD_BSSD"    13   //通用型SSD云硬盘 
"CLOUD_BIGDATA" 14   //大数据型云硬盘
"CLOUD_HIGHIO"  15   //高IO型云硬盘 

该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口 
     * @return StorageType 取值范围:
"LOCAL_SSD"   3     //本地SSD 
"CLOUD_SSD"   4     //云SSD 
"CLOUD_PREMIUM"  5  //高效云盘
"CLOUD_HSSD"   6    //增强型SSD云硬盘 
"CLOUD_THROUGHPUT" 11//吞吐型云硬盘 
"CLOUD_TSSD"  12     //极速型SSD云硬盘 
"CLOUD_BSSD"    13   //通用型SSD云硬盘 
"CLOUD_BIGDATA" 14   //大数据型云硬盘
"CLOUD_HIGHIO"  15   //高IO型云硬盘 

该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 取值范围:
"LOCAL_SSD"   3     //本地SSD 
"CLOUD_SSD"   4     //云SSD 
"CLOUD_PREMIUM"  5  //高效云盘
"CLOUD_HSSD"   6    //增强型SSD云硬盘 
"CLOUD_THROUGHPUT" 11//吞吐型云硬盘 
"CLOUD_TSSD"  12     //极速型SSD云硬盘 
"CLOUD_BSSD"    13   //通用型SSD云硬盘 
"CLOUD_BIGDATA" 14   //大数据型云硬盘
"CLOUD_HIGHIO"  15   //高IO型云硬盘 

该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口
     * @param StorageType 取值范围:
"LOCAL_SSD"   3     //本地SSD 
"CLOUD_SSD"   4     //云SSD 
"CLOUD_PREMIUM"  5  //高效云盘
"CLOUD_HSSD"   6    //增强型SSD云硬盘 
"CLOUD_THROUGHPUT" 11//吞吐型云硬盘 
"CLOUD_TSSD"  12     //极速型SSD云硬盘 
"CLOUD_BSSD"    13   //通用型SSD云硬盘 
"CLOUD_BIGDATA" 14   //大数据型云硬盘
"CLOUD_HIGHIO"  15   //高IO型云硬盘 

该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 数据盘类型 取值范围：

CLOUD_SSD：表示云SSD。

CLOUD_PREMIUM：表示高效云盘。

CLOUD_BASIC：表示云硬盘。

LOCAL_BASIC：表示本地盘。

LOCAL_SSD：表示本地SSD。

CLOUD_HSSD：表示增强型SSD云硬盘。

CLOUD_THROUGHPUT：表示吞吐型云硬盘。

CLOUD_TSSD：表示极速型SSD云硬盘。

CLOUD_BIGDATA：表示大数据型云硬盘。

CLOUD_HIGHIO：表示高IO型云硬盘。

CLOUD_BSSD：表示通用型SSD云硬盘。

REMOTE_SSD：表示远端SSD盘。 
     * @return DiskType 数据盘类型 取值范围：

CLOUD_SSD：表示云SSD。

CLOUD_PREMIUM：表示高效云盘。

CLOUD_BASIC：表示云硬盘。

LOCAL_BASIC：表示本地盘。

LOCAL_SSD：表示本地SSD。

CLOUD_HSSD：表示增强型SSD云硬盘。

CLOUD_THROUGHPUT：表示吞吐型云硬盘。

CLOUD_TSSD：表示极速型SSD云硬盘。

CLOUD_BIGDATA：表示大数据型云硬盘。

CLOUD_HIGHIO：表示高IO型云硬盘。

CLOUD_BSSD：表示通用型SSD云硬盘。

REMOTE_SSD：表示远端SSD盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型 取值范围：

CLOUD_SSD：表示云SSD。

CLOUD_PREMIUM：表示高效云盘。

CLOUD_BASIC：表示云硬盘。

LOCAL_BASIC：表示本地盘。

LOCAL_SSD：表示本地SSD。

CLOUD_HSSD：表示增强型SSD云硬盘。

CLOUD_THROUGHPUT：表示吞吐型云硬盘。

CLOUD_TSSD：表示极速型SSD云硬盘。

CLOUD_BIGDATA：表示大数据型云硬盘。

CLOUD_HIGHIO：表示高IO型云硬盘。

CLOUD_BSSD：表示通用型SSD云硬盘。

REMOTE_SSD：表示远端SSD盘。
     * @param DiskType 数据盘类型 取值范围：

CLOUD_SSD：表示云SSD。

CLOUD_PREMIUM：表示高效云盘。

CLOUD_BASIC：表示云硬盘。

LOCAL_BASIC：表示本地盘。

LOCAL_SSD：表示本地SSD。

CLOUD_HSSD：表示增强型SSD云硬盘。

CLOUD_THROUGHPUT：表示吞吐型云硬盘。

CLOUD_TSSD：表示极速型SSD云硬盘。

CLOUD_BIGDATA：表示大数据型云硬盘。

CLOUD_HIGHIO：表示高IO型云硬盘。

CLOUD_BSSD：表示通用型SSD云硬盘。

REMOTE_SSD：表示远端SSD盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 内存容量,单位为M 
     * @return MemSize 内存容量,单位为M
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量,单位为M
     * @param MemSize 内存容量,单位为M
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 数据盘容量 
     * @return DiskSize 数据盘容量
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据盘容量
     * @param DiskSize 数据盘容量
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 系统盘容量 
     * @return RootSize 系统盘容量
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set 系统盘容量
     * @param RootSize 系统盘容量
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiDisks 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiDisks 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 需要绑定的标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 规格类型，如S2.MEDIUM8 
     * @return InstanceType 规格类型，如S2.MEDIUM8
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格类型，如S2.MEDIUM8
     * @param InstanceType 规格类型，如S2.MEDIUM8
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 本地盘数量，该字段已废弃 
     * @return LocalDiskNum 本地盘数量，该字段已废弃
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set 本地盘数量，该字段已废弃
     * @param LocalDiskNum 本地盘数量，该字段已废弃
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
    }

    /**
     * Get 本地盘数量，如2 
     * @return DiskNum 本地盘数量，如2
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set 本地盘数量，如2
     * @param DiskNum 本地盘数量，如2
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get GPU信息 
     * @return GpuDesc GPU信息
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set GPU信息
     * @param GpuDesc GPU信息
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
        }
        if (source.MultiDisks != null) {
            this.MultiDisks = new MultiDisk[source.MultiDisks.length];
            for (int i = 0; i < source.MultiDisks.length; i++) {
                this.MultiDisks[i] = new MultiDisk(source.MultiDisks[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.LocalDiskNum != null) {
            this.LocalDiskNum = new Long(source.LocalDiskNum);
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamArrayObj(map, prefix + "MultiDisks.", this.MultiDisks);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "LocalDiskNum", this.LocalDiskNum);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

