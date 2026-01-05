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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteQualityRuleGroupResultVO extends AbstractModel {

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SumCount")
    @Expose
    private Long SumCount;

    /**
    * 成功条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 操作详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private CommonQualityOperateResult [] Results;

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SumCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSumCount() {
        return this.SumCount;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SumCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSumCount(Long SumCount) {
        this.SumCount = SumCount;
    }

    /**
     * Get 成功条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedCount 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedCount 失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 操作详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 操作详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonQualityOperateResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 操作详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 操作详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(CommonQualityOperateResult [] Results) {
        this.Results = Results;
    }

    public DeleteQualityRuleGroupResultVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteQualityRuleGroupResultVO(DeleteQualityRuleGroupResultVO source) {
        if (source.SumCount != null) {
            this.SumCount = new Long(source.SumCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.Results != null) {
            this.Results = new CommonQualityOperateResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new CommonQualityOperateResult(source.Results[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SumCount", this.SumCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);

    }
}

