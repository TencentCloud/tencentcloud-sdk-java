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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel {

    /**
    * <p>可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例机型。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例机型系列。</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>GPU核数，单位：核。</p>
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * <p>CPU核数，单位：核。</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>内存容量，单位：<code>GiB</code>。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>FPGA核数，单位：核。</p>
    */
    @SerializedName("FPGA")
    @Expose
    private Long FPGA;

    /**
    * <p>实例机型映射的物理GPU卡数，单位：卡。vGPU卡型小于1，直通卡型大于等于1。vGPU是通过分片虚拟化技术，将物理GPU卡重新划分，同一块GPU卡经虚拟化分割后可分配至不同的实例使用。直通卡型会将GPU设备直接挂载给实例使用。</p>
    */
    @SerializedName("GpuCount")
    @Expose
    private Float GpuCount;

    /**
    * <p>实例GPU类型</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>实例GPU单块显存,单位：GiB。</p>
    */
    @SerializedName("GpuMemory")
    @Expose
    private Float GpuMemory;

    /**
     * Get <p>可用区。</p> 
     * @return Zone <p>可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。</p>
     * @param Zone <p>可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例机型。</p> 
     * @return InstanceType <p>实例机型。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例机型。</p>
     * @param InstanceType <p>实例机型。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例机型系列。</p> 
     * @return InstanceFamily <p>实例机型系列。</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>实例机型系列。</p>
     * @param InstanceFamily <p>实例机型系列。</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get <p>GPU核数，单位：核。</p> 
     * @return GPU <p>GPU核数，单位：核。</p>
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set <p>GPU核数，单位：核。</p>
     * @param GPU <p>GPU核数，单位：核。</p>
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get <p>CPU核数，单位：核。</p> 
     * @return CPU <p>CPU核数，单位：核。</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU核数，单位：核。</p>
     * @param CPU <p>CPU核数，单位：核。</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>内存容量，单位：<code>GiB</code>。</p> 
     * @return Memory <p>内存容量，单位：<code>GiB</code>。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存容量，单位：<code>GiB</code>。</p>
     * @param Memory <p>内存容量，单位：<code>GiB</code>。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>FPGA核数，单位：核。</p> 
     * @return FPGA <p>FPGA核数，单位：核。</p>
     */
    public Long getFPGA() {
        return this.FPGA;
    }

    /**
     * Set <p>FPGA核数，单位：核。</p>
     * @param FPGA <p>FPGA核数，单位：核。</p>
     */
    public void setFPGA(Long FPGA) {
        this.FPGA = FPGA;
    }

    /**
     * Get <p>实例机型映射的物理GPU卡数，单位：卡。vGPU卡型小于1，直通卡型大于等于1。vGPU是通过分片虚拟化技术，将物理GPU卡重新划分，同一块GPU卡经虚拟化分割后可分配至不同的实例使用。直通卡型会将GPU设备直接挂载给实例使用。</p> 
     * @return GpuCount <p>实例机型映射的物理GPU卡数，单位：卡。vGPU卡型小于1，直通卡型大于等于1。vGPU是通过分片虚拟化技术，将物理GPU卡重新划分，同一块GPU卡经虚拟化分割后可分配至不同的实例使用。直通卡型会将GPU设备直接挂载给实例使用。</p>
     */
    public Float getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set <p>实例机型映射的物理GPU卡数，单位：卡。vGPU卡型小于1，直通卡型大于等于1。vGPU是通过分片虚拟化技术，将物理GPU卡重新划分，同一块GPU卡经虚拟化分割后可分配至不同的实例使用。直通卡型会将GPU设备直接挂载给实例使用。</p>
     * @param GpuCount <p>实例机型映射的物理GPU卡数，单位：卡。vGPU卡型小于1，直通卡型大于等于1。vGPU是通过分片虚拟化技术，将物理GPU卡重新划分，同一块GPU卡经虚拟化分割后可分配至不同的实例使用。直通卡型会将GPU设备直接挂载给实例使用。</p>
     */
    public void setGpuCount(Float GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get <p>实例GPU类型</p> 
     * @return GpuType <p>实例GPU类型</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>实例GPU类型</p>
     * @param GpuType <p>实例GPU类型</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>实例GPU单块显存,单位：GiB。</p> 
     * @return GpuMemory <p>实例GPU单块显存,单位：GiB。</p>
     */
    public Float getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * Set <p>实例GPU单块显存,单位：GiB。</p>
     * @param GpuMemory <p>实例GPU单块显存,单位：GiB。</p>
     */
    public void setGpuMemory(Float GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    public InstanceTypeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeConfig(InstanceTypeConfig source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.GPU != null) {
            this.GPU = new Long(source.GPU);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.FPGA != null) {
            this.FPGA = new Long(source.FPGA);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new Float(source.GpuCount);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.GpuMemory != null) {
            this.GpuMemory = new Float(source.GpuMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "FPGA", this.FPGA);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);

    }
}

