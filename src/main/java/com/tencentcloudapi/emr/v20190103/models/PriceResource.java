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

public class PriceResource extends AbstractModel{

    /**
    * 需要的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * 内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 核心数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCnt")
    @Expose
    private Long DiskCnt;

    /**
    * 规格
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * 本地盘的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
     * Get 需要的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec 需要的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 需要的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 需要的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get 内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 核心数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 核心数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核心数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 核心数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCnt 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCnt() {
        return this.DiskCnt;
    }

    /**
     * Set 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCnt 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCnt(Long DiskCnt) {
        this.DiskCnt = DiskCnt;
    }

    /**
     * Get 规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 规格
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskNum 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskNum 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get 本地盘的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskNum 本地盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set 本地盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskNum 本地盘的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
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

    }
}

