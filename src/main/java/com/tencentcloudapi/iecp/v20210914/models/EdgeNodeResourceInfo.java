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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeNodeResourceInfo extends AbstractModel{

    /**
    * 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllocatedCPU")
    @Expose
    private String AllocatedCPU;

    /**
    * CPU总量 单位:m核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCPU")
    @Expose
    private String TotalCPU;

    /**
    * 已分配的内存 单位G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllocatedMemory")
    @Expose
    private String AllocatedMemory;

    /**
    * 内存总量 单位G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalMemory")
    @Expose
    private String TotalMemory;

    /**
    * 已分配的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllocatedGPU")
    @Expose
    private String AllocatedGPU;

    /**
    * GPU总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalGPU")
    @Expose
    private String TotalGPU;

    /**
    * 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableCPU")
    @Expose
    private String AvailableCPU;

    /**
    * 可使用的内存 单位: G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableMemory")
    @Expose
    private String AvailableMemory;

    /**
    * 可使用的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableGPU")
    @Expose
    private String AvailableGPU;

    /**
     * Get 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllocatedCPU 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllocatedCPU() {
        return this.AllocatedCPU;
    }

    /**
     * Set 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllocatedCPU 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocatedCPU(String AllocatedCPU) {
        this.AllocatedCPU = AllocatedCPU;
    }

    /**
     * Get CPU总量 单位:m核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCPU CPU总量 单位:m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCPU() {
        return this.TotalCPU;
    }

    /**
     * Set CPU总量 单位:m核
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCPU CPU总量 单位:m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCPU(String TotalCPU) {
        this.TotalCPU = TotalCPU;
    }

    /**
     * Get 已分配的内存 单位G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllocatedMemory 已分配的内存 单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllocatedMemory() {
        return this.AllocatedMemory;
    }

    /**
     * Set 已分配的内存 单位G
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllocatedMemory 已分配的内存 单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocatedMemory(String AllocatedMemory) {
        this.AllocatedMemory = AllocatedMemory;
    }

    /**
     * Get 内存总量 单位G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalMemory 内存总量 单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalMemory() {
        return this.TotalMemory;
    }

    /**
     * Set 内存总量 单位G
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalMemory 内存总量 单位G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalMemory(String TotalMemory) {
        this.TotalMemory = TotalMemory;
    }

    /**
     * Get 已分配的GPU资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllocatedGPU 已分配的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllocatedGPU() {
        return this.AllocatedGPU;
    }

    /**
     * Set 已分配的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllocatedGPU 已分配的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocatedGPU(String AllocatedGPU) {
        this.AllocatedGPU = AllocatedGPU;
    }

    /**
     * Get GPU总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalGPU GPU总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalGPU() {
        return this.TotalGPU;
    }

    /**
     * Set GPU总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalGPU GPU总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalGPU(String TotalGPU) {
        this.TotalGPU = TotalGPU;
    }

    /**
     * Get 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableCPU 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableCPU() {
        return this.AvailableCPU;
    }

    /**
     * Set 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableCPU 可使用的CPU 单位: m核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableCPU(String AvailableCPU) {
        this.AvailableCPU = AvailableCPU;
    }

    /**
     * Get 可使用的内存 单位: G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableMemory 可使用的内存 单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableMemory() {
        return this.AvailableMemory;
    }

    /**
     * Set 可使用的内存 单位: G
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableMemory 可使用的内存 单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableMemory(String AvailableMemory) {
        this.AvailableMemory = AvailableMemory;
    }

    /**
     * Get 可使用的GPU资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableGPU 可使用的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableGPU() {
        return this.AvailableGPU;
    }

    /**
     * Set 可使用的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableGPU 可使用的GPU资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableGPU(String AvailableGPU) {
        this.AvailableGPU = AvailableGPU;
    }

    public EdgeNodeResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeNodeResourceInfo(EdgeNodeResourceInfo source) {
        if (source.AllocatedCPU != null) {
            this.AllocatedCPU = new String(source.AllocatedCPU);
        }
        if (source.TotalCPU != null) {
            this.TotalCPU = new String(source.TotalCPU);
        }
        if (source.AllocatedMemory != null) {
            this.AllocatedMemory = new String(source.AllocatedMemory);
        }
        if (source.TotalMemory != null) {
            this.TotalMemory = new String(source.TotalMemory);
        }
        if (source.AllocatedGPU != null) {
            this.AllocatedGPU = new String(source.AllocatedGPU);
        }
        if (source.TotalGPU != null) {
            this.TotalGPU = new String(source.TotalGPU);
        }
        if (source.AvailableCPU != null) {
            this.AvailableCPU = new String(source.AvailableCPU);
        }
        if (source.AvailableMemory != null) {
            this.AvailableMemory = new String(source.AvailableMemory);
        }
        if (source.AvailableGPU != null) {
            this.AvailableGPU = new String(source.AvailableGPU);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedCPU", this.AllocatedCPU);
        this.setParamSimple(map, prefix + "TotalCPU", this.TotalCPU);
        this.setParamSimple(map, prefix + "AllocatedMemory", this.AllocatedMemory);
        this.setParamSimple(map, prefix + "TotalMemory", this.TotalMemory);
        this.setParamSimple(map, prefix + "AllocatedGPU", this.AllocatedGPU);
        this.setParamSimple(map, prefix + "TotalGPU", this.TotalGPU);
        this.setParamSimple(map, prefix + "AvailableCPU", this.AvailableCPU);
        this.setParamSimple(map, prefix + "AvailableMemory", this.AvailableMemory);
        this.setParamSimple(map, prefix + "AvailableGPU", this.AvailableGPU);

    }
}

