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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrateInstanceInfo extends AbstractModel {

    /**
    * 实例cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例类型 rw/ro
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例个数,范围[1,15]
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 实例机器类型 common-公通用型,exclusive-独享型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 实例cpu 
     * @return Cpu 实例cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例cpu
     * @param Cpu 实例cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存 
     * @return Memory 实例内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存
     * @param Memory 实例内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例类型 rw/ro 
     * @return InstanceType 实例类型 rw/ro
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型 rw/ro
     * @param InstanceType 实例类型 rw/ro
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例个数,范围[1,15] 
     * @return InstanceCount 实例个数,范围[1,15]
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例个数,范围[1,15]
     * @param InstanceCount 实例个数,范围[1,15]
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 实例机器类型 common-公通用型,exclusive-独享型 
     * @return DeviceType 实例机器类型 common-公通用型,exclusive-独享型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例机器类型 common-公通用型,exclusive-独享型
     * @param DeviceType 实例机器类型 common-公通用型,exclusive-独享型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public IntegrateInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrateInstanceInfo(IntegrateInstanceInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

