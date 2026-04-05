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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCGPUInfo extends AbstractModel {

    /**
    * GPU类型
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * GPU数量
    */
    @SerializedName("GPUCount")
    @Expose
    private Float GPUCount;

    /**
     * Get GPU类型 
     * @return GPUType GPU类型
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU类型
     * @param GPUType GPU类型
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get GPU数量 
     * @return GPUCount GPU数量
     */
    public Float getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set GPU数量
     * @param GPUCount GPU数量
     */
    public void setGPUCount(Float GPUCount) {
        this.GPUCount = GPUCount;
    }

    public HPCGPUInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCGPUInfo(HPCGPUInfo source) {
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.GPUCount != null) {
            this.GPUCount = new Float(source.GPUCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamSimple(map, prefix + "GPUCount", this.GPUCount);

    }
}

