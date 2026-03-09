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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfig extends AbstractModel {

    /**
    * 核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小Gi
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 集群规模
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 核数 
     * @return Cpu 核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核数
     * @param Cpu 核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小Gi 
     * @return Mem 内存大小Gi
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小Gi
     * @param Mem 内存大小Gi
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 集群规模 
     * @return Size 集群规模
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 集群规模
     * @param Size 集群规模
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public InstanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfig(InstanceConfig source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

