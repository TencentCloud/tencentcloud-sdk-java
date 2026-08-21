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
    * <p>算力套餐ID</p>
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * <p>节点数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>显卡数量</p>
    */
    @SerializedName("GPUCount")
    @Expose
    private String GPUCount;

    /**
    * <p>显存</p>
    */
    @SerializedName("GPUMemory")
    @Expose
    private String GPUMemory;

    /**
    * <p>算力</p>
    */
    @SerializedName("GPUPerformance")
    @Expose
    private String GPUPerformance;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("CPU")
    @Expose
    private String CPU;

    /**
    * <p>内存</p>
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * <p>该套餐是否支持包年包月</p>
    */
    @SerializedName("PrepaidEnable")
    @Expose
    private Boolean PrepaidEnable;

    /**
    * <p>该套餐是否支持按量计费</p>
    */
    @SerializedName("PostpaidEnable")
    @Expose
    private Boolean PostpaidEnable;

    /**
     * Get <p>算力套餐ID</p> 
     * @return BundleType <p>算力套餐ID</p>
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set <p>算力套餐ID</p>
     * @param BundleType <p>算力套餐ID</p>
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get <p>节点数量</p> 
     * @return Count <p>节点数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>节点数量</p>
     * @param Count <p>节点数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>显卡数量</p> 
     * @return GPUCount <p>显卡数量</p>
     */
    public String getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set <p>显卡数量</p>
     * @param GPUCount <p>显卡数量</p>
     */
    public void setGPUCount(String GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get <p>显存</p> 
     * @return GPUMemory <p>显存</p>
     */
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * Set <p>显存</p>
     * @param GPUMemory <p>显存</p>
     */
    public void setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
    }

    /**
     * Get <p>算力</p> 
     * @return GPUPerformance <p>算力</p>
     */
    public String getGPUPerformance() {
        return this.GPUPerformance;
    }

    /**
     * Set <p>算力</p>
     * @param GPUPerformance <p>算力</p>
     */
    public void setGPUPerformance(String GPUPerformance) {
        this.GPUPerformance = GPUPerformance;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return CPU <p>CPU核数</p>
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU核数</p>
     * @param CPU <p>CPU核数</p>
     */
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>内存</p> 
     * @return Memory <p>内存</p>
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存</p>
     * @param Memory <p>内存</p>
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>该套餐是否支持包年包月</p> 
     * @return PrepaidEnable <p>该套餐是否支持包年包月</p>
     */
    public Boolean getPrepaidEnable() {
        return this.PrepaidEnable;
    }

    /**
     * Set <p>该套餐是否支持包年包月</p>
     * @param PrepaidEnable <p>该套餐是否支持包年包月</p>
     */
    public void setPrepaidEnable(Boolean PrepaidEnable) {
        this.PrepaidEnable = PrepaidEnable;
    }

    /**
     * Get <p>该套餐是否支持按量计费</p> 
     * @return PostpaidEnable <p>该套餐是否支持按量计费</p>
     */
    public Boolean getPostpaidEnable() {
        return this.PostpaidEnable;
    }

    /**
     * Set <p>该套餐是否支持按量计费</p>
     * @param PostpaidEnable <p>该套餐是否支持按量计费</p>
     */
    public void setPostpaidEnable(Boolean PostpaidEnable) {
        this.PostpaidEnable = PostpaidEnable;
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
        if (source.PrepaidEnable != null) {
            this.PrepaidEnable = new Boolean(source.PrepaidEnable);
        }
        if (source.PostpaidEnable != null) {
            this.PostpaidEnable = new Boolean(source.PostpaidEnable);
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
        this.setParamSimple(map, prefix + "PrepaidEnable", this.PrepaidEnable);
        this.setParamSimple(map, prefix + "PostpaidEnable", this.PostpaidEnable);

    }
}

