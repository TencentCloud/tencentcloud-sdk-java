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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubEks extends AbstractModel {

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * cu数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuNum")
    @Expose
    private Long CuNum;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 运行cu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * 总的CPU
    */
    @SerializedName("TotalCpu")
    @Expose
    private Float TotalCpu;

    /**
    * 总的内存
    */
    @SerializedName("TotalMem")
    @Expose
    private Float TotalMem;

    /**
    * 运行的CPU
    */
    @SerializedName("RunningCpu")
    @Expose
    private Float RunningCpu;

    /**
    * 运行的内存
    */
    @SerializedName("RunningMem")
    @Expose
    private Float RunningMem;

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get cu数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuNum cu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCuNum() {
        return this.CuNum;
    }

    /**
     * Set cu数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuNum cu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuNum(Long CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 运行cu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu 运行cu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set 运行cu
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu 运行cu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get 总的CPU 
     * @return TotalCpu 总的CPU
     */
    public Float getTotalCpu() {
        return this.TotalCpu;
    }

    /**
     * Set 总的CPU
     * @param TotalCpu 总的CPU
     */
    public void setTotalCpu(Float TotalCpu) {
        this.TotalCpu = TotalCpu;
    }

    /**
     * Get 总的内存 
     * @return TotalMem 总的内存
     */
    public Float getTotalMem() {
        return this.TotalMem;
    }

    /**
     * Set 总的内存
     * @param TotalMem 总的内存
     */
    public void setTotalMem(Float TotalMem) {
        this.TotalMem = TotalMem;
    }

    /**
     * Get 运行的CPU 
     * @return RunningCpu 运行的CPU
     */
    public Float getRunningCpu() {
        return this.RunningCpu;
    }

    /**
     * Set 运行的CPU
     * @param RunningCpu 运行的CPU
     */
    public void setRunningCpu(Float RunningCpu) {
        this.RunningCpu = RunningCpu;
    }

    /**
     * Get 运行的内存 
     * @return RunningMem 运行的内存
     */
    public Float getRunningMem() {
        return this.RunningMem;
    }

    /**
     * Set 运行的内存
     * @param RunningMem 运行的内存
     */
    public void setRunningMem(Float RunningMem) {
        this.RunningMem = RunningMem;
    }

    public SubEks() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubEks(SubEks source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.CuNum != null) {
            this.CuNum = new Long(source.CuNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.TotalCpu != null) {
            this.TotalCpu = new Float(source.TotalCpu);
        }
        if (source.TotalMem != null) {
            this.TotalMem = new Float(source.TotalMem);
        }
        if (source.RunningCpu != null) {
            this.RunningCpu = new Float(source.RunningCpu);
        }
        if (source.RunningMem != null) {
            this.RunningMem = new Float(source.RunningMem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "CuNum", this.CuNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamSimple(map, prefix + "TotalCpu", this.TotalCpu);
        this.setParamSimple(map, prefix + "TotalMem", this.TotalMem);
        this.setParamSimple(map, prefix + "RunningCpu", this.RunningCpu);
        this.setParamSimple(map, prefix + "RunningMem", this.RunningMem);

    }
}

