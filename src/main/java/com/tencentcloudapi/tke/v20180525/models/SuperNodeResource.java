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

public class SuperNodeResource extends AbstractModel{

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点上的资源总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 节点上的总核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 节点上的总内存数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 节点上的总 GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Float Gpu;

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
     * Get 节点上的资源总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Num 节点上的资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 节点上的资源总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Num 节点上的资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 节点上的总核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 节点上的总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 节点上的总核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 节点上的总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 节点上的总内存数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 节点上的总内存数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 节点上的总内存数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 节点上的总内存数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 节点上的总 GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu 节点上的总 GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getGpu() {
        return this.Gpu;
    }

    /**
     * Set 节点上的总 GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu 节点上的总 GPU 卡数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Float Gpu) {
        this.Gpu = Gpu;
    }

    public SuperNodeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodeResource(SuperNodeResource source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Float(source.Gpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);

    }
}

