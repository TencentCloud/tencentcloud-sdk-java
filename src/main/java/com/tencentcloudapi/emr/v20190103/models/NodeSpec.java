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

public class NodeSpec  extends AbstractModel{

    /**
    * 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPUCores")
    @Expose
    private Integer CPUCores;

    /**
    * 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootDiskVolume")
    @Expose
    private Integer RootDiskVolume;

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Integer StorageType;

    /**
    * 规格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 多盘数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
     * 获取内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     * @return Memory 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @return CPUCores CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getCPUCores() {
        return this.CPUCores;
    }

    /**
     * 设置CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPUCores CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPUCores(Integer CPUCores) {
        this.CPUCores = CPUCores;
    }

    /**
     * 获取数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @return Volume 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Volume 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return Spec 节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * 设置节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * 获取系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @return RootDiskVolume 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getRootDiskVolume() {
        return this.RootDiskVolume;
    }

    /**
     * 设置系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootDiskVolume 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootDiskVolume(Integer RootDiskVolume) {
        this.RootDiskVolume = RootDiskVolume;
    }

    /**
     * 获取存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getStorageType() {
        return this.StorageType;
    }

    /**
     * 设置存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(Integer StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * 获取规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * 设置规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * 获取多盘数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return MultiDisks 多盘数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * 设置多盘数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiDisks 多盘数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPUCores", this.CPUCores);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "RootDiskVolume", this.RootDiskVolume);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamArrayObj(map, prefix + "MultiDisks.", this.MultiDisks);

    }
}

