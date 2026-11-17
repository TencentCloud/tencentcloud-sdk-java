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

public class GPUResourceSpec extends AbstractModel {

    /**
    * <p>GPU 类型标识，例如 5090d。</p>
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * <p>GPU 类型展示名称；为空时使用 GPUType 展示。</p>
    */
    @SerializedName("GPUTypeAlias")
    @Expose
    private String GPUTypeAlias;

    /**
    * <p>单台实例全部 GPU 的总显存，单位 GiB；不需要再乘 GPUNum。0 表示展示元数据未维护。</p>
    */
    @SerializedName("GPUMemoryGiB")
    @Expose
    private Long GPUMemoryGiB;

    /**
    * <p>单台实例 CPU 核数。</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>单台实例主机内存，单位 GiB；不是 GPU 显存。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>单台实例的 GPU 卡数。</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Long GPUNum;

    /**
    * <p>当前可购买数量，单位台，不是卡数；0 表示确认无额度，null 表示额度未知。实际购买时仍会重新校验。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
     * Get <p>GPU 类型标识，例如 5090d。</p> 
     * @return GPUType <p>GPU 类型标识，例如 5090d。</p>
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set <p>GPU 类型标识，例如 5090d。</p>
     * @param GPUType <p>GPU 类型标识，例如 5090d。</p>
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get <p>GPU 类型展示名称；为空时使用 GPUType 展示。</p> 
     * @return GPUTypeAlias <p>GPU 类型展示名称；为空时使用 GPUType 展示。</p>
     */
    public String getGPUTypeAlias() {
        return this.GPUTypeAlias;
    }

    /**
     * Set <p>GPU 类型展示名称；为空时使用 GPUType 展示。</p>
     * @param GPUTypeAlias <p>GPU 类型展示名称；为空时使用 GPUType 展示。</p>
     */
    public void setGPUTypeAlias(String GPUTypeAlias) {
        this.GPUTypeAlias = GPUTypeAlias;
    }

    /**
     * Get <p>单台实例全部 GPU 的总显存，单位 GiB；不需要再乘 GPUNum。0 表示展示元数据未维护。</p> 
     * @return GPUMemoryGiB <p>单台实例全部 GPU 的总显存，单位 GiB；不需要再乘 GPUNum。0 表示展示元数据未维护。</p>
     */
    public Long getGPUMemoryGiB() {
        return this.GPUMemoryGiB;
    }

    /**
     * Set <p>单台实例全部 GPU 的总显存，单位 GiB；不需要再乘 GPUNum。0 表示展示元数据未维护。</p>
     * @param GPUMemoryGiB <p>单台实例全部 GPU 的总显存，单位 GiB；不需要再乘 GPUNum。0 表示展示元数据未维护。</p>
     */
    public void setGPUMemoryGiB(Long GPUMemoryGiB) {
        this.GPUMemoryGiB = GPUMemoryGiB;
    }

    /**
     * Get <p>单台实例 CPU 核数。</p> 
     * @return CPU <p>单台实例 CPU 核数。</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>单台实例 CPU 核数。</p>
     * @param CPU <p>单台实例 CPU 核数。</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>单台实例主机内存，单位 GiB；不是 GPU 显存。</p> 
     * @return Memory <p>单台实例主机内存，单位 GiB；不是 GPU 显存。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>单台实例主机内存，单位 GiB；不是 GPU 显存。</p>
     * @param Memory <p>单台实例主机内存，单位 GiB；不是 GPU 显存。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>单台实例的 GPU 卡数。</p> 
     * @return GPUNum <p>单台实例的 GPU 卡数。</p>
     */
    public Long getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>单台实例的 GPU 卡数。</p>
     * @param GPUNum <p>单台实例的 GPU 卡数。</p>
     */
    public void setGPUNum(Long GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>当前可购买数量，单位台，不是卡数；0 表示确认无额度，null 表示额度未知。实际购买时仍会重新校验。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableCount <p>当前可购买数量，单位台，不是卡数；0 表示确认无额度，null 表示额度未知。实际购买时仍会重新校验。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set <p>当前可购买数量，单位台，不是卡数；0 表示确认无额度，null 表示额度未知。实际购买时仍会重新校验。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableCount <p>当前可购买数量，单位台，不是卡数；0 表示确认无额度，null 表示额度未知。实际购买时仍会重新校验。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
    }

    public GPUResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUResourceSpec(GPUResourceSpec source) {
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.GPUTypeAlias != null) {
            this.GPUTypeAlias = new String(source.GPUTypeAlias);
        }
        if (source.GPUMemoryGiB != null) {
            this.GPUMemoryGiB = new Long(source.GPUMemoryGiB);
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
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamSimple(map, prefix + "GPUTypeAlias", this.GPUTypeAlias);
        this.setParamSimple(map, prefix + "GPUMemoryGiB", this.GPUMemoryGiB);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);

    }
}

