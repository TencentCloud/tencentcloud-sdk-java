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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceData extends AbstractModel {

    /**
    * 变配后CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 变配后内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 变配后存储上限
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 变配前CPU
    */
    @SerializedName("OldCpu")
    @Expose
    private Long OldCpu;

    /**
    * 变配前内存
    */
    @SerializedName("OldMemory")
    @Expose
    private Long OldMemory;

    /**
    * 变配前存储上限
    */
    @SerializedName("OldStorageLimit")
    @Expose
    private Long OldStorageLimit;

    /**
    * 变配前实例机器类型
    */
    @SerializedName("OldDeviceType")
    @Expose
    private String OldDeviceType;

    /**
    * 变配后实例机器类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 升级方式。升级完成后切换或维护时间内切换
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
     * Get 变配后CPU 
     * @return Cpu 变配后CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 变配后CPU
     * @param Cpu 变配后CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 变配后内存 
     * @return Memory 变配后内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 变配后内存
     * @param Memory 变配后内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 变配后存储上限 
     * @return StorageLimit 变配后存储上限
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 变配后存储上限
     * @param StorageLimit 变配后存储上限
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 变配前CPU 
     * @return OldCpu 变配前CPU
     */
    public Long getOldCpu() {
        return this.OldCpu;
    }

    /**
     * Set 变配前CPU
     * @param OldCpu 变配前CPU
     */
    public void setOldCpu(Long OldCpu) {
        this.OldCpu = OldCpu;
    }

    /**
     * Get 变配前内存 
     * @return OldMemory 变配前内存
     */
    public Long getOldMemory() {
        return this.OldMemory;
    }

    /**
     * Set 变配前内存
     * @param OldMemory 变配前内存
     */
    public void setOldMemory(Long OldMemory) {
        this.OldMemory = OldMemory;
    }

    /**
     * Get 变配前存储上限 
     * @return OldStorageLimit 变配前存储上限
     */
    public Long getOldStorageLimit() {
        return this.OldStorageLimit;
    }

    /**
     * Set 变配前存储上限
     * @param OldStorageLimit 变配前存储上限
     */
    public void setOldStorageLimit(Long OldStorageLimit) {
        this.OldStorageLimit = OldStorageLimit;
    }

    /**
     * Get 变配前实例机器类型 
     * @return OldDeviceType 变配前实例机器类型
     */
    public String getOldDeviceType() {
        return this.OldDeviceType;
    }

    /**
     * Set 变配前实例机器类型
     * @param OldDeviceType 变配前实例机器类型
     */
    public void setOldDeviceType(String OldDeviceType) {
        this.OldDeviceType = OldDeviceType;
    }

    /**
     * Get 变配后实例机器类型 
     * @return DeviceType 变配后实例机器类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 变配后实例机器类型
     * @param DeviceType 变配后实例机器类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 升级方式。升级完成后切换或维护时间内切换 
     * @return UpgradeType 升级方式。升级完成后切换或维护时间内切换
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级方式。升级完成后切换或维护时间内切换
     * @param UpgradeType 升级方式。升级完成后切换或维护时间内切换
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    public ModifyInstanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceData(ModifyInstanceData source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.OldCpu != null) {
            this.OldCpu = new Long(source.OldCpu);
        }
        if (source.OldMemory != null) {
            this.OldMemory = new Long(source.OldMemory);
        }
        if (source.OldStorageLimit != null) {
            this.OldStorageLimit = new Long(source.OldStorageLimit);
        }
        if (source.OldDeviceType != null) {
            this.OldDeviceType = new String(source.OldDeviceType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "OldCpu", this.OldCpu);
        this.setParamSimple(map, prefix + "OldMemory", this.OldMemory);
        this.setParamSimple(map, prefix + "OldStorageLimit", this.OldStorageLimit);
        this.setParamSimple(map, prefix + "OldDeviceType", this.OldDeviceType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);

    }
}

