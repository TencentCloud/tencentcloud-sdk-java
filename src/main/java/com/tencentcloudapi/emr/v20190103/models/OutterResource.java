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

public class OutterResource  extends AbstractModel{

    /**
    * 规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 规格名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Integer StorageType;

    /**
    * 盘类型
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
    private Integer RootSize;

    /**
    * 内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * CPU个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
     * 获取规格
注意：此字段可能返回 null，表示取不到有效值。
     * @return Spec 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * 设置规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * 获取规格名
注意：此字段可能返回 null，表示取不到有效值。
     * @return SpecName 规格名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * 设置规格名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 规格名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * 获取硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return StorageType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getStorageType() {
        return this.StorageType;
    }

    /**
     * 设置硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 硬盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(Integer StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * 获取盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return DiskType 盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @return RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getRootSize() {
        return this.RootSize;
    }

    /**
     * 设置系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootSize(Integer RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * 获取内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @return MemSize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * 设置内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * 获取CPU个数
注意：此字段可能返回 null，表示取不到有效值。
     * @return Cpu CPU个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置CPU个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @return DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

