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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSpec extends AbstractModel{

    /**
    * 实例CPU，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例最大可用存储，单位：GB
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * 实例最小可用存储，单位：GB
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
     * Get 实例CPU，单位：核 
     * @return Cpu 实例CPU，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU，单位：核
     * @param Cpu 实例CPU，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存，单位：GB 
     * @return Memory 实例内存，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存，单位：GB
     * @param Memory 实例内存，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例最大可用存储，单位：GB 
     * @return MaxStorageSize 实例最大可用存储，单位：GB
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set 实例最大可用存储，单位：GB
     * @param MaxStorageSize 实例最大可用存储，单位：GB
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get 实例最小可用存储，单位：GB 
     * @return MinStorageSize 实例最小可用存储，单位：GB
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set 实例最小可用存储，单位：GB
     * @param MinStorageSize 实例最小可用存储，单位：GB
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    public InstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSpec(InstanceSpec source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);

    }
}

