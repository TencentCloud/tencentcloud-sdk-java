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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeDetail extends AbstractModel {

    /**
    * 算力套餐ID
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * 节点数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 显卡数量
    */
    @SerializedName("GPUCount")
    @Expose
    private String GPUCount;

    /**
    * 显存
    */
    @SerializedName("GPUMemory")
    @Expose
    private String GPUMemory;

    /**
    * 算力
    */
    @SerializedName("GPUPerformance")
    @Expose
    private String GPUPerformance;

    /**
    * CPU核数
    */
    @SerializedName("CPU")
    @Expose
    private String CPU;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
     * Get 算力套餐ID 
     * @return BundleType 算力套餐ID
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set 算力套餐ID
     * @param BundleType 算力套餐ID
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get 节点数量 
     * @return Count 节点数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 节点数量
     * @param Count 节点数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 显卡数量 
     * @return GPUCount 显卡数量
     */
    public String getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set 显卡数量
     * @param GPUCount 显卡数量
     */
    public void setGPUCount(String GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get 显存 
     * @return GPUMemory 显存
     */
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * Set 显存
     * @param GPUMemory 显存
     */
    public void setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
    }

    /**
     * Get 算力 
     * @return GPUPerformance 算力
     */
    public String getGPUPerformance() {
        return this.GPUPerformance;
    }

    /**
     * Set 算力
     * @param GPUPerformance 算力
     */
    public void setGPUPerformance(String GPUPerformance) {
        this.GPUPerformance = GPUPerformance;
    }

    /**
     * Get CPU核数 
     * @return CPU CPU核数
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数
     * @param CPU CPU核数
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    public ComputeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeDetail(ComputeDetail source) {
        if (source.BundleType != null) {
            this.BundleType = new String(source.BundleType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.GPUCount != null) {
            this.GPUCount = new String(source.GPUCount);
        }
        if (source.GPUMemory != null) {
            this.GPUMemory = new String(source.GPUMemory);
        }
        if (source.GPUPerformance != null) {
            this.GPUPerformance = new String(source.GPUPerformance);
        }
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
        this.setParamSimple(map, prefix + "BundleType", this.BundleType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "GPUCount", this.GPUCount);
        this.setParamSimple(map, prefix + "GPUMemory", this.GPUMemory);
        this.setParamSimple(map, prefix + "GPUPerformance", this.GPUPerformance);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

