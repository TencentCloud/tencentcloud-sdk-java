/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodDeductionRate extends AbstractModel{

    /**
    * Pod的 CPU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Pod 的内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    *  Pod 的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    *  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuNum")
    @Expose
    private String GpuNum;

    /**
    * 这种规格的 Pod总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 这种规格的 Pod被预留券抵扣的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductionNum")
    @Expose
    private Long DeductionNum;

    /**
     * Get Pod的 CPU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu Pod的 CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Pod的 CPU
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu Pod的 CPU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Pod 的内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory Pod 的内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Pod 的内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory Pod 的内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  Pod 的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type  Pod 的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set  Pod 的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type  Pod 的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuNum  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuNum  Pod 的 GPU 卡数，Pod 类型为 GPU 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuNum(String GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get 这种规格的 Pod总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 这种规格的 Pod总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 这种规格的 Pod总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 这种规格的 Pod总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 这种规格的 Pod被预留券抵扣的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductionNum 这种规格的 Pod被预留券抵扣的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeductionNum() {
        return this.DeductionNum;
    }

    /**
     * Set 这种规格的 Pod被预留券抵扣的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductionNum 这种规格的 Pod被预留券抵扣的数量
注意：此字段可能返回 null，表示取不到有效值。
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

