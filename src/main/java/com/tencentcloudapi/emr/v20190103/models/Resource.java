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
    * <p>节点规格描述，如CVM.SA2。</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>取值范围:<br>&quot;LOCAL_SSD&quot;   3     //本地SSD<br>&quot;CLOUD_SSD&quot;   4     //云SSD<br>&quot;CLOUD_PREMIUM&quot;  5  //高效云盘<br>&quot;CLOUD_HSSD&quot;   6    //增强型SSD云硬盘<br>&quot;CLOUD_THROUGHPUT&quot; 11//吞吐型云硬盘<br>&quot;CLOUD_TSSD&quot;  12     //极速型SSD云硬盘<br>&quot;CLOUD_BSSD&quot;    13   //通用型SSD云硬盘<br>&quot;CLOUD_BIGDATA&quot; 14   //大数据型云硬盘<br>&quot;CLOUD_HIGHIO&quot;  15   //高IO型云硬盘 </p><p>该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>数据盘类型 取值范围：</p><p>CLOUD_SSD：表示云SSD。</p><p>CLOUD_PREMIUM：表示高效云盘。</p><p>CLOUD_BASIC：表示云硬盘。</p><p>LOCAL_BASIC：表示本地盘。</p><p>LOCAL_SSD：表示本地SSD。</p><p>CLOUD_HSSD：表示增强型SSD云硬盘。</p><p>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</p><p>CLOUD_TSSD：表示极速型SSD云硬盘。</p><p>CLOUD_BIGDATA：表示大数据型云硬盘。</p><p>CLOUD_HIGHIO：表示高IO型云硬盘。</p><p>CLOUD_BSSD：表示通用型SSD云硬盘。</p><p>REMOTE_SSD：表示远端SSD盘。</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>内存容量,单位为M</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>数据盘容量</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>系统盘容量</p>
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * <p>云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * <p>需要绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>规格类型，如S2.MEDIUM8</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>本地盘数量，该字段已废弃</p>
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * <p>本地盘数量，如2</p>
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * <p>GPU信息</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>分区置放群组分区数</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>节点规格描述，如CVM.SA2。</p> 
     * @return Spec <p>节点规格描述，如CVM.SA2。</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>节点规格描述，如CVM.SA2。</p>
     * @param Spec <p>节点规格描述，如CVM.SA2。</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>取值范围:<br>&quot;LOCAL_SSD&quot;   3     //本地SSD<br>&quot;CLOUD_SSD&quot;   4     //云SSD<br>&quot;CLOUD_PREMIUM&quot;  5  //高效云盘<br>&quot;CLOUD_HSSD&quot;   6    //增强型SSD云硬盘<br>&quot;CLOUD_THROUGHPUT&quot; 11//吞吐型云硬盘<br>&quot;CLOUD_TSSD&quot;  12     //极速型SSD云硬盘<br>&quot;CLOUD_BSSD&quot;    13   //通用型SSD云硬盘<br>&quot;CLOUD_BIGDATA&quot; 14   //大数据型云硬盘<br>&quot;CLOUD_HIGHIO&quot;  15   //高IO型云硬盘 </p><p>该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口</p> 
     * @return StorageType <p>取值范围:<br>&quot;LOCAL_SSD&quot;   3     //本地SSD<br>&quot;CLOUD_SSD&quot;   4     //云SSD<br>&quot;CLOUD_PREMIUM&quot;  5  //高效云盘<br>&quot;CLOUD_HSSD&quot;   6    //增强型SSD云硬盘<br>&quot;CLOUD_THROUGHPUT&quot; 11//吞吐型云硬盘<br>&quot;CLOUD_TSSD&quot;  12     //极速型SSD云硬盘<br>&quot;CLOUD_BSSD&quot;    13   //通用型SSD云硬盘<br>&quot;CLOUD_BIGDATA&quot; 14   //大数据型云硬盘<br>&quot;CLOUD_HIGHIO&quot;  15   //高IO型云硬盘 </p><p>该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>取值范围:<br>&quot;LOCAL_SSD&quot;   3     //本地SSD<br>&quot;CLOUD_SSD&quot;   4     //云SSD<br>&quot;CLOUD_PREMIUM&quot;  5  //高效云盘<br>&quot;CLOUD_HSSD&quot;   6    //增强型SSD云硬盘<br>&quot;CLOUD_THROUGHPUT&quot; 11//吞吐型云硬盘<br>&quot;CLOUD_TSSD&quot;  12     //极速型SSD云硬盘<br>&quot;CLOUD_BSSD&quot;    13   //通用型SSD云硬盘<br>&quot;CLOUD_BIGDATA&quot; 14   //大数据型云硬盘<br>&quot;CLOUD_HIGHIO&quot;  15   //高IO型云硬盘 </p><p>该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口</p>
     * @param StorageType <p>取值范围:<br>&quot;LOCAL_SSD&quot;   3     //本地SSD<br>&quot;CLOUD_SSD&quot;   4     //云SSD<br>&quot;CLOUD_PREMIUM&quot;  5  //高效云盘<br>&quot;CLOUD_HSSD&quot;   6    //增强型SSD云硬盘<br>&quot;CLOUD_THROUGHPUT&quot; 11//吞吐型云硬盘<br>&quot;CLOUD_TSSD&quot;  12     //极速型SSD云硬盘<br>&quot;CLOUD_BSSD&quot;    13   //通用型SSD云硬盘<br>&quot;CLOUD_BIGDATA&quot; 14   //大数据型云硬盘<br>&quot;CLOUD_HIGHIO&quot;  15   //高IO型云硬盘 </p><p>该类型字段为无效字段，实际系统盘类型会根据数据盘类型和节点类型判断，如果节点支持所选的数据盘类型，系统盘类型会跟数据盘保持一致，建议使用CreateCluster接口</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>数据盘类型 取值范围：</p><p>CLOUD_SSD：表示云SSD。</p><p>CLOUD_PREMIUM：表示高效云盘。</p><p>CLOUD_BASIC：表示云硬盘。</p><p>LOCAL_BASIC：表示本地盘。</p><p>LOCAL_SSD：表示本地SSD。</p><p>CLOUD_HSSD：表示增强型SSD云硬盘。</p><p>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</p><p>CLOUD_TSSD：表示极速型SSD云硬盘。</p><p>CLOUD_BIGDATA：表示大数据型云硬盘。</p><p>CLOUD_HIGHIO：表示高IO型云硬盘。</p><p>CLOUD_BSSD：表示通用型SSD云硬盘。</p><p>REMOTE_SSD：表示远端SSD盘。</p> 
     * @return DiskType <p>数据盘类型 取值范围：</p><p>CLOUD_SSD：表示云SSD。</p><p>CLOUD_PREMIUM：表示高效云盘。</p><p>CLOUD_BASIC：表示云硬盘。</p><p>LOCAL_BASIC：表示本地盘。</p><p>LOCAL_SSD：表示本地SSD。</p><p>CLOUD_HSSD：表示增强型SSD云硬盘。</p><p>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</p><p>CLOUD_TSSD：表示极速型SSD云硬盘。</p><p>CLOUD_BIGDATA：表示大数据型云硬盘。</p><p>CLOUD_HIGHIO：表示高IO型云硬盘。</p><p>CLOUD_BSSD：表示通用型SSD云硬盘。</p><p>REMOTE_SSD：表示远端SSD盘。</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>数据盘类型 取值范围：</p><p>CLOUD_SSD：表示云SSD。</p><p>CLOUD_PREMIUM：表示高效云盘。</p><p>CLOUD_BASIC：表示云硬盘。</p><p>LOCAL_BASIC：表示本地盘。</p><p>LOCAL_SSD：表示本地SSD。</p><p>CLOUD_HSSD：表示增强型SSD云硬盘。</p><p>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</p><p>CLOUD_TSSD：表示极速型SSD云硬盘。</p><p>CLOUD_BIGDATA：表示大数据型云硬盘。</p><p>CLOUD_HIGHIO：表示高IO型云硬盘。</p><p>CLOUD_BSSD：表示通用型SSD云硬盘。</p><p>REMOTE_SSD：表示远端SSD盘。</p>
     * @param DiskType <p>数据盘类型 取值范围：</p><p>CLOUD_SSD：表示云SSD。</p><p>CLOUD_PREMIUM：表示高效云盘。</p><p>CLOUD_BASIC：表示云硬盘。</p><p>LOCAL_BASIC：表示本地盘。</p><p>LOCAL_SSD：表示本地SSD。</p><p>CLOUD_HSSD：表示增强型SSD云硬盘。</p><p>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</p><p>CLOUD_TSSD：表示极速型SSD云硬盘。</p><p>CLOUD_BIGDATA：表示大数据型云硬盘。</p><p>CLOUD_HIGHIO：表示高IO型云硬盘。</p><p>CLOUD_BSSD：表示通用型SSD云硬盘。</p><p>REMOTE_SSD：表示远端SSD盘。</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>内存容量,单位为M</p> 
     * @return MemSize <p>内存容量,单位为M</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存容量,单位为M</p>
     * @param MemSize <p>内存容量,单位为M</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return Cpu <p>CPU核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU核数</p>
     * @param Cpu <p>CPU核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>数据盘容量</p> 
     * @return DiskSize <p>数据盘容量</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>数据盘容量</p>
     * @param DiskSize <p>数据盘容量</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>系统盘容量</p> 
     * @return RootSize <p>系统盘容量</p>
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set <p>系统盘容量</p>
     * @param RootSize <p>系统盘容量</p>
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get <p>云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiDisks <p>云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set <p>云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiDisks <p>云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get <p>需要绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>需要绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>需要绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>需要绑定的标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>规格类型，如S2.MEDIUM8</p> 
     * @return InstanceType <p>规格类型，如S2.MEDIUM8</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>规格类型，如S2.MEDIUM8</p>
     * @param InstanceType <p>规格类型，如S2.MEDIUM8</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>本地盘数量，该字段已废弃</p> 
     * @return LocalDiskNum <p>本地盘数量，该字段已废弃</p>
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set <p>本地盘数量，该字段已废弃</p>
     * @param LocalDiskNum <p>本地盘数量，该字段已废弃</p>
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
    }

    /**
     * Get <p>本地盘数量，如2</p> 
     * @return DiskNum <p>本地盘数量，如2</p>
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set <p>本地盘数量，如2</p>
     * @param DiskNum <p>本地盘数量，如2</p>
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get <p>GPU信息</p> 
     * @return GpuDesc <p>GPU信息</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>GPU信息</p>
     * @param GpuDesc <p>GPU信息</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>分区置放群组分区数</p> 
     * @return PartitionNumber <p>分区置放群组分区数</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>分区置放群组分区数</p>
     * @param PartitionNumber <p>分区置放群组分区数</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
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
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
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
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

