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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceHardwareSpecification extends AbstractModel {

    /**
    * <p>规格标识。已废弃，参考使用字段 <code>HardwareSpecId</code>。</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>规格唯一标识 ID。</p>
    */
    @SerializedName("HardwareSpecId")
    @Expose
    private String HardwareSpecId;

    /**
    * <p>规格名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规格默认分配的 GPU 卡数。</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * <p>规格默认分配的 CPU 核数。</p>
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * <p>规格默认分配的内存大小。</p><p>单位：MB</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>规格默认分配的显存大小。</p><p>单位：MB</p>
    */
    @SerializedName("GPUMemSize")
    @Expose
    private Long GPUMemSize;

    /**
    * <p>规格默认分配的磁盘大小。</p><p>单位：MB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>规格当前支持的 GPU 卡数列表。</p><p>若不填充或填充空数组，则仅支持规格默认分配的 GPU 卡数。</p>
    */
    @SerializedName("AllowedGPUNums")
    @Expose
    private Float [] AllowedGPUNums;

    /**
     * Get <p>规格标识。已废弃，参考使用字段 <code>HardwareSpecId</code>。</p> 
     * @return Spec <p>规格标识。已废弃，参考使用字段 <code>HardwareSpecId</code>。</p>
     * @deprecated
     */
    @Deprecated
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格标识。已废弃，参考使用字段 <code>HardwareSpecId</code>。</p>
     * @param Spec <p>规格标识。已废弃，参考使用字段 <code>HardwareSpecId</code>。</p>
     * @deprecated
     */
    @Deprecated
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>规格唯一标识 ID。</p> 
     * @return HardwareSpecId <p>规格唯一标识 ID。</p>
     */
    public String getHardwareSpecId() {
        return this.HardwareSpecId;
    }

    /**
     * Set <p>规格唯一标识 ID。</p>
     * @param HardwareSpecId <p>规格唯一标识 ID。</p>
     */
    public void setHardwareSpecId(String HardwareSpecId) {
        this.HardwareSpecId = HardwareSpecId;
    }

    /**
     * Get <p>规格名称。</p> 
     * @return Name <p>规格名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规格名称。</p>
     * @param Name <p>规格名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规格默认分配的 GPU 卡数。</p> 
     * @return GPUNum <p>规格默认分配的 GPU 卡数。</p>
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>规格默认分配的 GPU 卡数。</p>
     * @param GPUNum <p>规格默认分配的 GPU 卡数。</p>
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>规格默认分配的 CPU 核数。</p> 
     * @return CPUNum <p>规格默认分配的 CPU 核数。</p>
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set <p>规格默认分配的 CPU 核数。</p>
     * @param CPUNum <p>规格默认分配的 CPU 核数。</p>
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get <p>规格默认分配的内存大小。</p><p>单位：MB</p> 
     * @return MemSize <p>规格默认分配的内存大小。</p><p>单位：MB</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>规格默认分配的内存大小。</p><p>单位：MB</p>
     * @param MemSize <p>规格默认分配的内存大小。</p><p>单位：MB</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>规格默认分配的显存大小。</p><p>单位：MB</p> 
     * @return GPUMemSize <p>规格默认分配的显存大小。</p><p>单位：MB</p>
     */
    public Long getGPUMemSize() {
        return this.GPUMemSize;
    }

    /**
     * Set <p>规格默认分配的显存大小。</p><p>单位：MB</p>
     * @param GPUMemSize <p>规格默认分配的显存大小。</p><p>单位：MB</p>
     */
    public void setGPUMemSize(Long GPUMemSize) {
        this.GPUMemSize = GPUMemSize;
    }

    /**
     * Get <p>规格默认分配的磁盘大小。</p><p>单位：MB</p> 
     * @return DiskSize <p>规格默认分配的磁盘大小。</p><p>单位：MB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>规格默认分配的磁盘大小。</p><p>单位：MB</p>
     * @param DiskSize <p>规格默认分配的磁盘大小。</p><p>单位：MB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>规格当前支持的 GPU 卡数列表。</p><p>若不填充或填充空数组，则仅支持规格默认分配的 GPU 卡数。</p> 
     * @return AllowedGPUNums <p>规格当前支持的 GPU 卡数列表。</p><p>若不填充或填充空数组，则仅支持规格默认分配的 GPU 卡数。</p>
     */
    public Float [] getAllowedGPUNums() {
        return this.AllowedGPUNums;
    }

    /**
     * Set <p>规格当前支持的 GPU 卡数列表。</p><p>若不填充或填充空数组，则仅支持规格默认分配的 GPU 卡数。</p>
     * @param AllowedGPUNums <p>规格当前支持的 GPU 卡数列表。</p><p>若不填充或填充空数组，则仅支持规格默认分配的 GPU 卡数。</p>
     */
    public void setAllowedGPUNums(Float [] AllowedGPUNums) {
        this.AllowedGPUNums = AllowedGPUNums;
    }

    public InferenceHardwareSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareSpecification(InferenceHardwareSpecification source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.HardwareSpecId != null) {
            this.HardwareSpecId = new String(source.HardwareSpecId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GPUMemSize != null) {
            this.GPUMemSize = new Long(source.GPUMemSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AllowedGPUNums != null) {
            this.AllowedGPUNums = new Float[source.AllowedGPUNums.length];
            for (int i = 0; i < source.AllowedGPUNums.length; i++) {
                this.AllowedGPUNums[i] = new Float(source.AllowedGPUNums[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "HardwareSpecId", this.HardwareSpecId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GPUMemSize", this.GPUMemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArraySimple(map, prefix + "AllowedGPUNums.", this.AllowedGPUNums);

    }
}

