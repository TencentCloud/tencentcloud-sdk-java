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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledTaskLogStats extends AbstractModel {

    /**
    * <p>总执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>成功次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>失败次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * <p>平均执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgDurationMs")
    @Expose
    private Long AvgDurationMs;

    /**
     * Get <p>总执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>总执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>总执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>成功次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount <p>成功次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount <p>成功次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>失败次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedCount <p>失败次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set <p>失败次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedCount <p>失败次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get <p>平均执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgDurationMs <p>平均执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvgDurationMs() {
        return this.AvgDurationMs;
    }

    /**
     * Set <p>平均执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgDurationMs <p>平均执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgDurationMs(Long AvgDurationMs) {
        this.AvgDurationMs = AvgDurationMs;
    }

    public ScheduledTaskLogStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledTaskLogStats(ScheduledTaskLogStats source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.AvgDurationMs != null) {
            this.AvgDurationMs = new Long(source.AvgDurationMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "AvgDurationMs", this.AvgDurationMs);

    }
}

