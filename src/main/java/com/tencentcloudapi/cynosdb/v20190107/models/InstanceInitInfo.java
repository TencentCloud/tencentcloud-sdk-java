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

public class InstanceInitInfo extends AbstractModel{

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
    * Serverless实例个数最小值，范围[1,15]
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * Serverless实例个数最大值，范围[1,15]
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * Serverless实例最小规格
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * Serverless实例最大规格
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

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
     * Get Serverless实例个数最小值，范围[1,15] 
     * @return MinRoCount Serverless实例个数最小值，范围[1,15]
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set Serverless实例个数最小值，范围[1,15]
     * @param MinRoCount Serverless实例个数最小值，范围[1,15]
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get Serverless实例个数最大值，范围[1,15] 
     * @return MaxRoCount Serverless实例个数最大值，范围[1,15]
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set Serverless实例个数最大值，范围[1,15]
     * @param MaxRoCount Serverless实例个数最大值，范围[1,15]
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get Serverless实例最小规格 
     * @return MinRoCpu Serverless实例最小规格
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set Serverless实例最小规格
     * @param MinRoCpu Serverless实例最小规格
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get Serverless实例最大规格 
     * @return MaxRoCpu Serverless实例最大规格
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set Serverless实例最大规格
     * @param MaxRoCpu Serverless实例最大规格
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    public InstanceInitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInitInfo(InstanceInitInfo source) {
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
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
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
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);

    }
}

