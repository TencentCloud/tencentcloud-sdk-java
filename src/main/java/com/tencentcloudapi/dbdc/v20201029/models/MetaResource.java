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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetaResource extends AbstractModel {

    /**
    * <p>CPU核心</p><p>单位：核</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>内存</p><p>单位：GiB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * <p>POD数量</p><p>单位：个</p>
    */
    @SerializedName("Pods")
    @Expose
    private Long Pods;

    /**
     * Get <p>CPU核心</p><p>单位：核</p> 
     * @return Cpu <p>CPU核心</p><p>单位：核</p>
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU核心</p><p>单位：核</p>
     * @param Cpu <p>CPU核心</p><p>单位：核</p>
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存</p><p>单位：GiB</p> 
     * @return Memory <p>内存</p><p>单位：GiB</p>
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存</p><p>单位：GiB</p>
     * @param Memory <p>内存</p><p>单位：GiB</p>
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>POD数量</p><p>单位：个</p> 
     * @return Pods <p>POD数量</p><p>单位：个</p>
     */
    public Long getPods() {
        return this.Pods;
    }

    /**
     * Set <p>POD数量</p><p>单位：个</p>
     * @param Pods <p>POD数量</p><p>单位：个</p>
     */
    public void setPods(Long Pods) {
        this.Pods = Pods;
    }

    public MetaResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaResource(MetaResource source) {
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Pods != null) {
            this.Pods = new Long(source.Pods);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Pods", this.Pods);

    }
}

