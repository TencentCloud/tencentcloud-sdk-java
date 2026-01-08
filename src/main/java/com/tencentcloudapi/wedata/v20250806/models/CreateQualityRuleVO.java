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

public class CreateQualityRuleVO extends AbstractModel {

    /**
    * 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 单条数据新增结果对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private QualityRuleCreateResult [] Results;

    /**
    * 总新增条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SumCount")
    @Expose
    private Long SumCount;

    /**
    * 新增成功条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 新增失败条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 新增成功的 ruleId集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessRuleIds")
    @Expose
    private Long [] SuccessRuleIds;

    /**
     * Get 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 单条数据新增结果对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 单条数据新增结果对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleCreateResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 单条数据新增结果对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 单条数据新增结果对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(QualityRuleCreateResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 总新增条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SumCount 总新增条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSumCount() {
        return this.SumCount;
    }

    /**
     * Set 总新增条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SumCount 总新增条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSumCount(Long SumCount) {
        this.SumCount = SumCount;
    }

    /**
     * Get 新增成功条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 新增成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 新增成功条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 新增成功条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 新增失败条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedCount 新增失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 新增失败条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedCount 新增失败条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 新增成功的 ruleId集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessRuleIds 新增成功的 ruleId集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSuccessRuleIds() {
        return this.SuccessRuleIds;
    }

    /**
     * Set 新增成功的 ruleId集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessRuleIds 新增成功的 ruleId集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessRuleIds(Long [] SuccessRuleIds) {
        this.SuccessRuleIds = SuccessRuleIds;
    }

    public CreateQualityRuleVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityRuleVO(CreateQualityRuleVO source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Results != null) {
            this.Results = new QualityRuleCreateResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new QualityRuleCreateResult(source.Results[i]);
            }
        }
        if (source.SumCount != null) {
            this.SumCount = new Long(source.SumCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.SuccessRuleIds != null) {
            this.SuccessRuleIds = new Long[source.SuccessRuleIds.length];
            for (int i = 0; i < source.SuccessRuleIds.length; i++) {
                this.SuccessRuleIds[i] = new Long(source.SuccessRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "SumCount", this.SumCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamArraySimple(map, prefix + "SuccessRuleIds.", this.SuccessRuleIds);

    }
}

