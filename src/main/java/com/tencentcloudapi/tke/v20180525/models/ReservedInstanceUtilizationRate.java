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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceUtilizationRate extends AbstractModel {

    /**
    * 使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * 预留券数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * 内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    *  预留券类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuNum")
    @Expose
    private String GpuNum;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Pod 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
     * Get 使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set 使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 预留券数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Num 预留券数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 预留券数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Num 预留券数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set 核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  预留券类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type  预留券类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set  预留券类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type  预留券类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuNum GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuNum GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuNum(String GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Pod 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodNum Pod 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set Pod 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodNum Pod 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    public ReservedInstanceUtilizationRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceUtilizationRate(ReservedInstanceUtilizationRate source) {
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);

    }
}

