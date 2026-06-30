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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareResultItem extends AbstractModel {

    /**
    * 对比结果， 1为真 2为假
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixResult")
    @Expose
    private Long FixResult;

    /**
    * 质量sql执行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultValue")
    @Expose
    private String ResultValue;

    /**
    * 阈值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private ThresholdValue [] Values;

    /**
    * 比较操作类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 比较类型：1-固定值, 2-波动值, 3-数值范围比较, 4-枚举范围比较, 5-不用比较, 6-字段数据相关性, 7-公平性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * 值比较类型：1-绝对值, 2-上升, 3-下降, 4-范围内, 5-范围外, 6-公平率, 7-公平差
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueComputeType")
    @Expose
    private Long ValueComputeType;

    /**
     * Get 对比结果， 1为真 2为假
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixResult 对比结果， 1为真 2为假
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFixResult() {
        return this.FixResult;
    }

    /**
     * Set 对比结果， 1为真 2为假
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixResult 对比结果， 1为真 2为假
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixResult(Long FixResult) {
        this.FixResult = FixResult;
    }

    /**
     * Get 质量sql执行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultValue 质量sql执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultValue() {
        return this.ResultValue;
    }

    /**
     * Set 质量sql执行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultValue 质量sql执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultValue(String ResultValue) {
        this.ResultValue = ResultValue;
    }

    /**
     * Get 阈值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThresholdValue [] getValues() {
        return this.Values;
    }

    /**
     * Set 阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(ThresholdValue [] Values) {
        this.Values = Values;
    }

    /**
     * Get 比较操作类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 比较操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 比较操作类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 比较操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 比较类型：1-固定值, 2-波动值, 3-数值范围比较, 4-枚举范围比较, 5-不用比较, 6-字段数据相关性, 7-公平性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareType 比较类型：1-固定值, 2-波动值, 3-数值范围比较, 4-枚举范围比较, 5-不用比较, 6-字段数据相关性, 7-公平性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set 比较类型：1-固定值, 2-波动值, 3-数值范围比较, 4-枚举范围比较, 5-不用比较, 6-字段数据相关性, 7-公平性
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareType 比较类型：1-固定值, 2-波动值, 3-数值范围比较, 4-枚举范围比较, 5-不用比较, 6-字段数据相关性, 7-公平性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get 值比较类型：1-绝对值, 2-上升, 3-下降, 4-范围内, 5-范围外, 6-公平率, 7-公平差
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueComputeType 值比较类型：1-绝对值, 2-上升, 3-下降, 4-范围内, 5-范围外, 6-公平率, 7-公平差
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValueComputeType() {
        return this.ValueComputeType;
    }

    /**
     * Set 值比较类型：1-绝对值, 2-上升, 3-下降, 4-范围内, 5-范围外, 6-公平率, 7-公平差
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueComputeType 值比较类型：1-绝对值, 2-上升, 3-下降, 4-范围内, 5-范围外, 6-公平率, 7-公平差
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueComputeType(Long ValueComputeType) {
        this.ValueComputeType = ValueComputeType;
    }

    public CompareResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResultItem(CompareResultItem source) {
        if (source.FixResult != null) {
            this.FixResult = new Long(source.FixResult);
        }
        if (source.ResultValue != null) {
            this.ResultValue = new String(source.ResultValue);
        }
        if (source.Values != null) {
            this.Values = new ThresholdValue[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new ThresholdValue(source.Values[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.ValueComputeType != null) {
            this.ValueComputeType = new Long(source.ValueComputeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixResult", this.FixResult);
        this.setParamSimple(map, prefix + "ResultValue", this.ResultValue);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "ValueComputeType", this.ValueComputeType);

    }
}

