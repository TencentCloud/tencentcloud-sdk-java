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

public class Resource  extends AbstractModel{

    /**
    * 节点规格描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Integer StorageType;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootSize")
    @Expose
    private Integer RootSize;

    /**
    * 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

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
     * 获取内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     * @return MemSize 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * 设置内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 内存容量,单位为M
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * 获取CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @return Cpu CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @return DiskSize 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 数据盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @return RootSize 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getRootSize() {
        return this.RootSize;
    }

    /**
     * 设置系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootSize 系统盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootSize(Integer RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * 获取云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     * @return MultiDisks 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * 设置云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiDisks 云盘列表，当数据盘为一块云盘时，直接使用DiskType和DiskSize参数，超出部分使用MultiDisks
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

