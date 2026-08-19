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

public class GpuSummaryItem extends AbstractModel {

    /**
    * <p>GPU 型号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>GPU 总数（gpuNum × replicas）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuCount")
    @Expose
    private Long GpuCount;

    /**
    * <p>运行中的副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get <p>GPU 型号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType <p>GPU 型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU 型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType <p>GPU 型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>GPU 总数（gpuNum × replicas）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuCount <p>GPU 总数（gpuNum × replicas）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set <p>GPU 总数（gpuNum × replicas）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuCount <p>GPU 总数（gpuNum × replicas）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuCount(Long GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get <p>运行中的副本数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas <p>运行中的副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>运行中的副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas <p>运行中的副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public GpuSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GpuSummaryItem(GpuSummaryItem source) {
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new Long(source.GpuCount);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

