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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorUsageTrendInfo extends AbstractModel {

    /**
    * 时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuUsagePercent")
    @Expose
    private Float CpuUsagePercent;

    /**
    * 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemUsagePercent")
    @Expose
    private Float MemUsagePercent;

    /**
    * 当前并发度使用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcurrencyUsage")
    @Expose
    private Float ConcurrencyUsage;

    /**
    * oceanus CU使用百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OceanusCuUsage")
    @Expose
    private Float OceanusCuUsage;

    /**
     * Get 时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 时间戳，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuUsagePercent CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuUsagePercent() {
        return this.CpuUsagePercent;
    }

    /**
     * Set CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuUsagePercent CPU占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuUsagePercent(Float CpuUsagePercent) {
        this.CpuUsagePercent = CpuUsagePercent;
    }

    /**
     * Get 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemUsagePercent 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemUsagePercent() {
        return this.MemUsagePercent;
    }

    /**
     * Set 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemUsagePercent 内存占用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemUsagePercent(Float MemUsagePercent) {
        this.MemUsagePercent = MemUsagePercent;
    }

    /**
     * Get 当前并发度使用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcurrencyUsage 当前并发度使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConcurrencyUsage() {
        return this.ConcurrencyUsage;
    }

    /**
     * Set 当前并发度使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcurrencyUsage 当前并发度使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcurrencyUsage(Float ConcurrencyUsage) {
        this.ConcurrencyUsage = ConcurrencyUsage;
    }

    /**
     * Get oceanus CU使用百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OceanusCuUsage oceanus CU使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOceanusCuUsage() {
        return this.OceanusCuUsage;
    }

    /**
     * Set oceanus CU使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param OceanusCuUsage oceanus CU使用百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOceanusCuUsage(Float OceanusCuUsage) {
        this.OceanusCuUsage = OceanusCuUsage;
    }

    public ExecutorUsageTrendInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorUsageTrendInfo(ExecutorUsageTrendInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.CpuUsagePercent != null) {
            this.CpuUsagePercent = new Float(source.CpuUsagePercent);
        }
        if (source.MemUsagePercent != null) {
            this.MemUsagePercent = new Float(source.MemUsagePercent);
        }
        if (source.ConcurrencyUsage != null) {
            this.ConcurrencyUsage = new Float(source.ConcurrencyUsage);
        }
        if (source.OceanusCuUsage != null) {
            this.OceanusCuUsage = new Float(source.OceanusCuUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "CpuUsagePercent", this.CpuUsagePercent);
        this.setParamSimple(map, prefix + "MemUsagePercent", this.MemUsagePercent);
        this.setParamSimple(map, prefix + "ConcurrencyUsage", this.ConcurrencyUsage);
        this.setParamSimple(map, prefix + "OceanusCuUsage", this.OceanusCuUsage);

    }
}

