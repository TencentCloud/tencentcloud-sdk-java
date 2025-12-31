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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceConfiguration extends AbstractModel {

    /**
    * cpu 资源量
    */
    @SerializedName("CPU")
    @Expose
    private String CPU;

    /**
    * 内存资源量
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
     * Get cpu 资源量 
     * @return CPU cpu 资源量
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Set cpu 资源量
     * @param CPU cpu 资源量
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存资源量 
     * @return Memory 内存资源量
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存资源量
     * @param Memory 内存资源量
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    public ResourceConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConfiguration(ResourceConfiguration source) {
        if (source.CPU != null) {
            this.CPU = new String(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

