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

public class PodDeductionRate extends AbstractModel {

    /**
    * Pod的 CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Pod 的内存
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    *  Pod 的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    *  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
    */
    @SerializedName("GpuNum")
    @Expose
    private String GpuNum;

    /**
    * 这种规格的 Pod总数
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 这种规格的 Pod被预留券抵扣的数量
    */
    @SerializedName("DeductionNum")
    @Expose
    private Long DeductionNum;

    /**
     * Get Pod的 CPU 
     * @return Cpu Pod的 CPU
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Pod的 CPU
     * @param Cpu Pod的 CPU
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Pod 的内存 
     * @return Memory Pod 的内存
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Pod 的内存
     * @param Memory Pod 的内存
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  Pod 的类型 
     * @return Type  Pod 的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set  Pod 的类型
     * @param Type  Pod 的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。 
     * @return GpuNum  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
     */
    public String getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
     * @param GpuNum  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
     */
    public void setGpuNum(String GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get 这种规格的 Pod总数 
     * @return TotalNum 这种规格的 Pod总数
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 这种规格的 Pod总数
     * @param TotalNum 这种规格的 Pod总数
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 这种规格的 Pod被预留券抵扣的数量 
     * @return DeductionNum 这种规格的 Pod被预留券抵扣的数量
     */
    public Long getDeductionNum() {
        return this.DeductionNum;
    }

    /**
     * Set 这种规格的 Pod被预留券抵扣的数量
     * @param DeductionNum 这种规格的 Pod被预留券抵扣的数量
     */
    public void setDeductionNum(Long DeductionNum) {
        this.DeductionNum = DeductionNum;
    }

    public PodDeductionRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodDeductionRate(PodDeductionRate source) {
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GpuNum != null) {
            this.GpuNum = new String(source.GpuNum);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.DeductionNum != null) {
            this.DeductionNum = new Long(source.DeductionNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "DeductionNum", this.DeductionNum);

    }
}

