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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel{

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * GPU核数，单位：核。
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * FPGA核数，单位：核。
    */
    @SerializedName("FPGA")
    @Expose
    private Long FPGA;

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例机型系列。 
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get GPU核数，单位：核。 
     * @return GPU GPU核数，单位：核。
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set GPU核数，单位：核。
     * @param GPU GPU核数，单位：核。
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get CPU核数，单位：核。 
     * @return CPU CPU核数，单位：核。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数，单位：核。
     * @param CPU CPU核数，单位：核。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存容量，单位：`GB`。 
     * @return Memory 内存容量，单位：`GB`。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存容量，单位：`GB`。
     * @param Memory 内存容量，单位：`GB`。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get FPGA核数，单位：核。 
     * @return FPGA FPGA核数，单位：核。
     */
    public Long getFPGA() {
        return this.FPGA;
    }

    /**
     * Set FPGA核数，单位：核。
     * @param FPGA FPGA核数，单位：核。
     */
    public void setFPGA(Long FPGA) {
        this.FPGA = FPGA;
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

    }
}

