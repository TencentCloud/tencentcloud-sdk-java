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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlotSharingGroupSpec extends AbstractModel{

    /**
    * 适用的cpu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeapMemory")
    @Expose
    private String HeapMemory;

    /**
    * 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffHeapMemory")
    @Expose
    private String OffHeapMemory;

    /**
    * 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagedMemory")
    @Expose
    private String ManagedMemory;

    /**
     * Get 适用的cpu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPU 适用的cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set 适用的cpu
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPU 适用的cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeapMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeapMemory() {
        return this.HeapMemory;
    }

    /**
     * Set 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeapMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeapMemory(String HeapMemory) {
        this.HeapMemory = HeapMemory;
    }

    /**
     * Get 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffHeapMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffHeapMemory() {
        return this.OffHeapMemory;
    }

    /**
     * Set 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffHeapMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffHeapMemory(String OffHeapMemory) {
        this.OffHeapMemory = OffHeapMemory;
    }

    /**
     * Get 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagedMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagedMemory() {
        return this.ManagedMemory;
    }

    /**
     * Set 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagedMemory 默认为b, 支持单位有 b, kb, mb, gb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagedMemory(String ManagedMemory) {
        this.ManagedMemory = ManagedMemory;
    }

    public SlotSharingGroupSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotSharingGroupSpec(SlotSharingGroupSpec source) {
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.HeapMemory != null) {
            this.HeapMemory = new String(source.HeapMemory);
        }
        if (source.OffHeapMemory != null) {
            this.OffHeapMemory = new String(source.OffHeapMemory);
        }
        if (source.ManagedMemory != null) {
            this.ManagedMemory = new String(source.ManagedMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "HeapMemory", this.HeapMemory);
        this.setParamSimple(map, prefix + "OffHeapMemory", this.OffHeapMemory);
        this.setParamSimple(map, prefix + "ManagedMemory", this.ManagedMemory);

    }
}

