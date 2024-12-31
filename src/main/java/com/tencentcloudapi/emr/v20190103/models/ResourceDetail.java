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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDetail extends AbstractModel {

    /**
    * 规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 规格名
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

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
    * CPU个数
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
    * 规格
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 规格 
     * @return Spec 规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 规格
     * @param Spec 规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 规格名 
     * @return SpecName 规格名
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名
     * @param SpecName 规格名
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
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
     * Get CPU个数 
     * @return Cpu CPU个数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU个数
     * @param Cpu CPU个数
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

    public ResourceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDetail(ResourceDetail source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
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
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

