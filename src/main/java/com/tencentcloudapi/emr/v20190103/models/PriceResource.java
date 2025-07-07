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

public class PriceResource extends AbstractModel {

    /**
    * 需要的规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 硬盘类型
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 硬盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘大小
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * 内存大小
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 核心数量
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 硬盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * 磁盘数量
    */
    @SerializedName("DiskCnt")
    @Expose
    private Long DiskCnt;

    /**
    * 规格
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 磁盘数量
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * 本地盘的数量
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * GPU信息
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get 需要的规格 
     * @return Spec 需要的规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 需要的规格
     * @param Spec 需要的规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 硬盘类型 
     * @return StorageType 硬盘类型
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 硬盘类型
     * @param StorageType 硬盘类型
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 硬盘类型 
     * @return DiskType 硬盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘类型
     * @param DiskType 硬盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘大小 
     * @return RootSize 系统盘大小
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set 系统盘大小
     * @param RootSize 系统盘大小
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get 内存大小 
     * @return MemSize 内存大小
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小
     * @param MemSize 内存大小
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 核心数量 
     * @return Cpu 核心数量
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核心数量
     * @param Cpu 核心数量
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 硬盘大小 
     * @return DiskSize 硬盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
     * @param DiskSize 硬盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云盘列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiDisks 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiDisks 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get 磁盘数量 
     * @return DiskCnt 磁盘数量
     */
    public Long getDiskCnt() {
        return this.DiskCnt;
    }

    /**
     * Set 磁盘数量
     * @param DiskCnt 磁盘数量
     */
    public void setDiskCnt(Long DiskCnt) {
        this.DiskCnt = DiskCnt;
    }

    /**
     * Get 规格 
     * @return InstanceType 规格
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格
     * @param InstanceType 规格
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 磁盘数量 
     * @return DiskNum 磁盘数量
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set 磁盘数量
     * @param DiskNum 磁盘数量
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get 本地盘的数量 
     * @return LocalDiskNum 本地盘的数量
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set 本地盘的数量
     * @param LocalDiskNum 本地盘的数量
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
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

    public PriceResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceResource(PriceResource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
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
        if (source.MultiDisks != null) {
            this.MultiDisks = new MultiDisk[source.MultiDisks.length];
            for (int i = 0; i < source.MultiDisks.length; i++) {
                this.MultiDisks[i] = new MultiDisk(source.MultiDisks[i]);
            }
        }
        if (source.DiskCnt != null) {
            this.DiskCnt = new Long(source.DiskCnt);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
        }
        if (source.LocalDiskNum != null) {
            this.LocalDiskNum = new Long(source.LocalDiskNum);
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
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArrayObj(map, prefix + "MultiDisks.", this.MultiDisks);
        this.setParamSimple(map, prefix + "DiskCnt", this.DiskCnt);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "LocalDiskNum", this.LocalDiskNum);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

