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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceQuota extends AbstractModel {

    /**
    * CPU Limit设置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPULimit")
    @Expose
    private String CPULimit;

    /**
    * 内存Limit设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * Pods数量设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pods")
    @Expose
    private String Pods;

    /**
     * Get CPU Limit设置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPULimit CPU Limit设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCPULimit() {
        return this.CPULimit;
    }

    /**
     * Set CPU Limit设置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPULimit CPU Limit设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPULimit(String CPULimit) {
        this.CPULimit = CPULimit;
    }

    /**
     * Get 内存Limit设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLimit 内存Limit设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存Limit设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLimit 内存Limit设置（单位：Mi，Gi，Ti，M，G，T）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get Pods数量设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pods Pods数量设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPods() {
        return this.Pods;
    }

    /**
     * Set Pods数量设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pods Pods数量设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPods(String Pods) {
        this.Pods = Pods;
    }

    public ResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceQuota(ResourceQuota source) {
        if (source.CPULimit != null) {
            this.CPULimit = new String(source.CPULimit);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new String(source.MemoryLimit);
        }
        if (source.Pods != null) {
            this.Pods = new String(source.Pods);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPULimit", this.CPULimit);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "Pods", this.Pods);

    }
}

