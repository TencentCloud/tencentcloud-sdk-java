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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupResource extends AbstractModel{

    /**
    * CPU核数; 单位为1/1000核，比如100表示0.1核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存；单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 总卡数；GPUDetail 显卡数之和；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * Gpu详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuDetailSet")
    @Expose
    private GpuDetail [] GpuDetailSet;

    /**
     * Get CPU核数; 单位为1/1000核，比如100表示0.1核 
     * @return Cpu CPU核数; 单位为1/1000核，比如100表示0.1核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数; 单位为1/1000核，比如100表示0.1核
     * @param Cpu CPU核数; 单位为1/1000核，比如100表示0.1核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存；单位为MB 
     * @return Memory 内存；单位为MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存；单位为MB
     * @param Memory 内存；单位为MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 总卡数；GPUDetail 显卡数之和；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu 总卡数；GPUDetail 显卡数之和；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set 总卡数；GPUDetail 显卡数之和；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu 总卡数；GPUDetail 显卡数之和；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get Gpu详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuDetailSet Gpu详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GpuDetail [] getGpuDetailSet() {
        return this.GpuDetailSet;
    }

    /**
     * Set Gpu详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuDetailSet Gpu详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuDetailSet(GpuDetail [] GpuDetailSet) {
        this.GpuDetailSet = GpuDetailSet;
    }

    public GroupResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupResource(GroupResource source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.GpuDetailSet != null) {
            this.GpuDetailSet = new GpuDetail[source.GpuDetailSet.length];
            for (int i = 0; i < source.GpuDetailSet.length; i++) {
                this.GpuDetailSet[i] = new GpuDetail(source.GpuDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamArrayObj(map, prefix + "GpuDetailSet.", this.GpuDetailSet);

    }
}

