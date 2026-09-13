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

public class InferenceHardwareConfig extends AbstractModel {

    /**
    * <p>推理服务单个实例分配的 GPU 卡数，当前仅支持整数值，且必须为 <code>HardwareSpecId</code> 对应规格的 <code>AllowedGPUNums</code> 中的可选值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>GPUNum</code> 值。</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * <p>推理服务单个实例分配的 CPU 核数，当前仅支持整数值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>CPUNum</code> 值。</p>
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * <p>推理服务单实例分配的内存大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>MemSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>推理服务单实例分配的临时磁盘大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>DiskSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get <p>推理服务单个实例分配的 GPU 卡数，当前仅支持整数值，且必须为 <code>HardwareSpecId</code> 对应规格的 <code>AllowedGPUNums</code> 中的可选值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>GPUNum</code> 值。</p> 
     * @return GPUNum <p>推理服务单个实例分配的 GPU 卡数，当前仅支持整数值，且必须为 <code>HardwareSpecId</code> 对应规格的 <code>AllowedGPUNums</code> 中的可选值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>GPUNum</code> 值。</p>
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>推理服务单个实例分配的 GPU 卡数，当前仅支持整数值，且必须为 <code>HardwareSpecId</code> 对应规格的 <code>AllowedGPUNums</code> 中的可选值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>GPUNum</code> 值。</p>
     * @param GPUNum <p>推理服务单个实例分配的 GPU 卡数，当前仅支持整数值，且必须为 <code>HardwareSpecId</code> 对应规格的 <code>AllowedGPUNums</code> 中的可选值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>GPUNum</code> 值。</p>
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>推理服务单个实例分配的 CPU 核数，当前仅支持整数值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>CPUNum</code> 值。</p> 
     * @return CPUNum <p>推理服务单个实例分配的 CPU 核数，当前仅支持整数值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>CPUNum</code> 值。</p>
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set <p>推理服务单个实例分配的 CPU 核数，当前仅支持整数值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>CPUNum</code> 值。</p>
     * @param CPUNum <p>推理服务单个实例分配的 CPU 核数，当前仅支持整数值。</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 规格对应的默认 <code>CPUNum</code> 值。</p>
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get <p>推理服务单实例分配的内存大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>MemSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p> 
     * @return MemSize <p>推理服务单实例分配的内存大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>MemSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>推理服务单实例分配的内存大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>MemSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     * @param MemSize <p>推理服务单实例分配的内存大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>MemSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>推理服务单实例分配的临时磁盘大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>DiskSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p> 
     * @return DiskSize <p>推理服务单实例分配的临时磁盘大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>DiskSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>推理服务单实例分配的临时磁盘大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>DiskSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     * @param DiskSize <p>推理服务单实例分配的临时磁盘大小。</p><p>单位：MB</p><p>若不填充，则使用所选 <code>HardwareSpecId</code> 对应规格的默认 <code>DiskSize</code> 值；若填充，则必须为 <code>1024</code> 的整数倍。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public InferenceHardwareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareConfig(InferenceHardwareConfig source) {
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

