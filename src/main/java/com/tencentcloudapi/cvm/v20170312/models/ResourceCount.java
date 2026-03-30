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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceCount extends AbstractModel {

    /**
    * vCPU核数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 本地盘大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
     * Get vCPU核数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu vCPU核数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set vCPU核数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu vCPU核数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu GPU数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu GPU数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 本地盘大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk 本地盘大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 本地盘大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk 本地盘大小，单位：GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    public ResourceCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceCount(ResourceCount source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Disk", this.Disk);

    }
}

