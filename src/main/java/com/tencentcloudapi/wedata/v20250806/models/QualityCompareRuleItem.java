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

public class QualityCompareRuleItem extends AbstractModel {

    /**
    * 比较类型【入参必填】，1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较   6.字段数据相关性  7.公平性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * 比较操作类型【入参条件必填】，CompareType ∈ {1,2,6,7} 时必填
<  <=  ==  =>  > !=
IRLCRO:在区间内(左闭右开)
IRLORC:在区间内(左开右闭)
IRLCRC:在区间内(左闭右闭)
IRLORO:在区间内(左开右开)
NRLCRO:不在区间内(左闭右开)
NRLORC:不在区间内(左开右闭)
NRLCRC:不在区间内(左闭右闭)
NRLORO:不在区间内(左开右开)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 质量统计值类型【入参条件必填】，当 CompareType ∈ {2,3,7} 时必填
可选值：
当 compareType = 2(波动值) 时：
  - 1 = 绝对值(ABS)
  - 2 = 上升(ASCEND)
  - 3 = 下降(DESCEND)

当 compareType = 3(数值范围) 时：
  - 4 = 范围内(WITH_IN_RANGE)
  - 5 = 范围外(OUT_OF_RANGE)

当 compareType = 7(公平性) 时：
  - 6 = 公平率(FAIRNESS_RATE)
  - 7 = 公平差(FAIRNESS_GAP)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueComputeType")
    @Expose
    private Long ValueComputeType;

    /**
    * 比较阈值列表【入参必填】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueList")
    @Expose
    private QualityThresholdValue [] ValueList;

    /**
     * Get 比较类型【入参必填】，1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较   6.字段数据相关性  7.公平性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareType 比较类型【入参必填】，1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较   6.字段数据相关性  7.公平性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set 比较类型【入参必填】，1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较   6.字段数据相关性  7.公平性
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareType 比较类型【入参必填】，1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较   6.字段数据相关性  7.公平性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get 比较操作类型【入参条件必填】，CompareType ∈ {1,2,6,7} 时必填
<  <=  ==  =>  > !=
IRLCRO:在区间内(左闭右开)
IRLORC:在区间内(左开右闭)
IRLCRC:在区间内(左闭右闭)
IRLORO:在区间内(左开右开)
NRLCRO:不在区间内(左闭右开)
NRLORC:不在区间内(左开右闭)
NRLCRC:不在区间内(左闭右闭)
NRLORO:不在区间内(左开右开)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 比较操作类型【入参条件必填】，CompareType ∈ {1,2,6,7} 时必填
<  <=  ==  =>  > !=
IRLCRO:在区间内(左闭右开)
IRLORC:在区间内(左开右闭)
IRLCRC:在区间内(左闭右闭)
IRLORO:在区间内(左开右开)
NRLCRO:不在区间内(左闭右开)
NRLORC:不在区间内(左开右闭)
NRLCRC:不在区间内(左闭右闭)
NRLORO:不在区间内(左开右开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 比较操作类型【入参条件必填】，CompareType ∈ {1,2,6,7} 时必填
<  <=  ==  =>  > !=
IRLCRO:在区间内(左闭右开)
IRLORC:在区间内(左开右闭)
IRLCRC:在区间内(左闭右闭)
IRLORO:在区间内(左开右开)
NRLCRO:不在区间内(左闭右开)
NRLORC:不在区间内(左开右闭)
NRLCRC:不在区间内(左闭右闭)
NRLORO:不在区间内(左开右开)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 比较操作类型【入参条件必填】，CompareType ∈ {1,2,6,7} 时必填
<  <=  ==  =>  > !=
IRLCRO:在区间内(左闭右开)
IRLORC:在区间内(左开右闭)
IRLCRC:在区间内(左闭右闭)
IRLORO:在区间内(左开右开)
NRLCRO:不在区间内(左闭右开)
NRLORC:不在区间内(左开右闭)
NRLCRC:不在区间内(左闭右闭)
NRLORO:不在区间内(左开右开)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 质量统计值类型【入参条件必填】，当 CompareType ∈ {2,3,7} 时必填
可选值：
当 compareType = 2(波动值) 时：
  - 1 = 绝对值(ABS)
  - 2 = 上升(ASCEND)
  - 3 = 下降(DESCEND)

当 compareType = 3(数值范围) 时：
  - 4 = 范围内(WITH_IN_RANGE)
  - 5 = 范围外(OUT_OF_RANGE)

当 compareType = 7(公平性) 时：
  - 6 = 公平率(FAIRNESS_RATE)
  - 7 = 公平差(FAIRNESS_GAP)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueComputeType 质量统计值类型【入参条件必填】，当 CompareType ∈ {2,3,7} 时必填
可选值：
当 compareType = 2(波动值) 时：
  - 1 = 绝对值(ABS)
  - 2 = 上升(ASCEND)
  - 3 = 下降(DESCEND)

当 compareType = 3(数值范围) 时：
  - 4 = 范围内(WITH_IN_RANGE)
  - 5 = 范围外(OUT_OF_RANGE)

当 compareType = 7(公平性) 时：
  - 6 = 公平率(FAIRNESS_RATE)
  - 7 = 公平差(FAIRNESS_GAP)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValueComputeType() {
        return this.ValueComputeType;
    }

    /**
     * Set 质量统计值类型【入参条件必填】，当 CompareType ∈ {2,3,7} 时必填
可选值：
当 compareType = 2(波动值) 时：
  - 1 = 绝对值(ABS)
  - 2 = 上升(ASCEND)
  - 3 = 下降(DESCEND)

当 compareType = 3(数值范围) 时：
  - 4 = 范围内(WITH_IN_RANGE)
  - 5 = 范围外(OUT_OF_RANGE)

当 compareType = 7(公平性) 时：
  - 6 = 公平率(FAIRNESS_RATE)
  - 7 = 公平差(FAIRNESS_GAP)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueComputeType 质量统计值类型【入参条件必填】，当 CompareType ∈ {2,3,7} 时必填
可选值：
当 compareType = 2(波动值) 时：
  - 1 = 绝对值(ABS)
  - 2 = 上升(ASCEND)
  - 3 = 下降(DESCEND)

当 compareType = 3(数值范围) 时：
  - 4 = 范围内(WITH_IN_RANGE)
  - 5 = 范围外(OUT_OF_RANGE)

当 compareType = 7(公平性) 时：
  - 6 = 公平率(FAIRNESS_RATE)
  - 7 = 公平差(FAIRNESS_GAP)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueComputeType(Long ValueComputeType) {
        this.ValueComputeType = ValueComputeType;
    }

    /**
     * Get 比较阈值列表【入参必填】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueList 比较阈值列表【入参必填】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityThresholdValue [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 比较阈值列表【入参必填】
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueList 比较阈值列表【入参必填】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueList(QualityThresholdValue [] ValueList) {
        this.ValueList = ValueList;
    }

    public QualityCompareRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityCompareRuleItem(QualityCompareRuleItem source) {
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ValueComputeType != null) {
            this.ValueComputeType = new Long(source.ValueComputeType);
        }
        if (source.ValueList != null) {
            this.ValueList = new QualityThresholdValue[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new QualityThresholdValue(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ValueComputeType", this.ValueComputeType);
        this.setParamArrayObj(map, prefix + "ValueList.", this.ValueList);

    }
}

