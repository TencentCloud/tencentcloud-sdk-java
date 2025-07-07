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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceSpec extends AbstractModel {

    /**
    * 资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v、a10\*pnv4、windows-common、windows-amd，common表示通用类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 核数
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * GPU卡数，当Type为GPU类型时设置。
    */
    @SerializedName("Gpu")
    @Expose
    private Float Gpu;

    /**
     * Get 资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v、a10\*pnv4、windows-common、windows-amd，common表示通用类型。 
     * @return Type 资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v、a10\*pnv4、windows-common、windows-amd，common表示通用类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v、a10\*pnv4、windows-common、windows-amd，common表示通用类型。
     * @param Type 资源类型：common、amd、v100、t4、a10\*gnv4、a10\*gnv4v、a10\*pnv4、windows-common、windows-amd，common表示通用类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 核数 
     * @return Cpu 核数
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核数
     * @param Cpu 核数
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU卡数，当Type为GPU类型时设置。 
     * @return Gpu GPU卡数，当Type为GPU类型时设置。
     */
    public Float getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU卡数，当Type为GPU类型时设置。
     * @param Gpu GPU卡数，当Type为GPU类型时设置。
     */
    public void setGpu(Float Gpu) {
        this.Gpu = Gpu;
    }

    public ReservedInstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceSpec(ReservedInstanceSpec source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Float(source.Gpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);

    }
}

