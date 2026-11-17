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

public class DescribeGPUResourceSpecsRequest extends AbstractModel {

    /**
    * <p>GPU 类型标识，例如 5090d；指定时必须同时提供 CPU、Memory、GPUNum。</p>
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * <p>CPU 核数，必须为正数；与 GPUType、Memory、GPUNum 同时提供。</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>主机内存 GiB，必须为正数；与 GPUType、CPU、GPUNum 同时提供。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>单台 GPU 卡数，必须为正整数；与 GPUType、CPU、Memory 同时提供。</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Long GPUNum;

    /**
    * <p>分页偏移量，默认为 0，必须大于等于 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>GPU 类型标识，例如 5090d；指定时必须同时提供 CPU、Memory、GPUNum。</p> 
     * @return GPUType <p>GPU 类型标识，例如 5090d；指定时必须同时提供 CPU、Memory、GPUNum。</p>
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set <p>GPU 类型标识，例如 5090d；指定时必须同时提供 CPU、Memory、GPUNum。</p>
     * @param GPUType <p>GPU 类型标识，例如 5090d；指定时必须同时提供 CPU、Memory、GPUNum。</p>
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get <p>CPU 核数，必须为正数；与 GPUType、Memory、GPUNum 同时提供。</p> 
     * @return CPU <p>CPU 核数，必须为正数；与 GPUType、Memory、GPUNum 同时提供。</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU 核数，必须为正数；与 GPUType、Memory、GPUNum 同时提供。</p>
     * @param CPU <p>CPU 核数，必须为正数；与 GPUType、Memory、GPUNum 同时提供。</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>主机内存 GiB，必须为正数；与 GPUType、CPU、GPUNum 同时提供。</p> 
     * @return Memory <p>主机内存 GiB，必须为正数；与 GPUType、CPU、GPUNum 同时提供。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>主机内存 GiB，必须为正数；与 GPUType、CPU、GPUNum 同时提供。</p>
     * @param Memory <p>主机内存 GiB，必须为正数；与 GPUType、CPU、GPUNum 同时提供。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>单台 GPU 卡数，必须为正整数；与 GPUType、CPU、Memory 同时提供。</p> 
     * @return GPUNum <p>单台 GPU 卡数，必须为正整数；与 GPUType、CPU、Memory 同时提供。</p>
     */
    public Long getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>单台 GPU 卡数，必须为正整数；与 GPUType、CPU、Memory 同时提供。</p>
     * @param GPUNum <p>单台 GPU 卡数，必须为正整数；与 GPUType、CPU、Memory 同时提供。</p>
     */
    public void setGPUNum(Long GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>分页偏移量，默认为 0，必须大于等于 0。</p> 
     * @return Offset <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     * @param Offset <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p> 
     * @return Limit <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     * @param Limit <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGPUResourceSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUResourceSpecsRequest(DescribeGPUResourceSpecsRequest source) {
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.GPUNum != null) {
            this.GPUNum = new Long(source.GPUNum);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

