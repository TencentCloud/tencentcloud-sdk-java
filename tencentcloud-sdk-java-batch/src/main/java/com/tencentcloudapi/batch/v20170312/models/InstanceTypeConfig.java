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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel{

    /**
    * 内存容量，单位：`GB`。
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * CPU核数，单位：核。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * Get 内存容量，单位：`GB`。 
     * @return Mem 内存容量，单位：`GB`。
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存容量，单位：`GB`。
     * @param Mem 内存容量，单位：`GB`。
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get CPU核数，单位：核。 
     * @return Cpu CPU核数，单位：核。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数，单位：核。
     * @param Cpu CPU核数，单位：核。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

