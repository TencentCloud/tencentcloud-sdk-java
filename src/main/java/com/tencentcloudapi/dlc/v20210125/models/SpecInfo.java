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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel {

    /**
    * 规格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 当前规格的cu数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cu")
    @Expose
    private Long Cu;

    /**
    * 当前规格的cpu数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 当前规格的内存数，单位G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get 规格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 当前规格的cu数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cu 当前规格的cu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCu() {
        return this.Cu;
    }

    /**
     * Set 当前规格的cu数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cu 当前规格的cu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCu(Long Cu) {
        this.Cu = Cu;
    }

    /**
     * Get 当前规格的cpu数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 当前规格的cpu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 当前规格的cpu数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 当前规格的cpu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 当前规格的内存数，单位G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 当前规格的内存数，单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 当前规格的内存数，单位G
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 当前规格的内存数，单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    public SpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecInfo(SpecInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cu != null) {
            this.Cu = new Long(source.Cu);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cu", this.Cu);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

