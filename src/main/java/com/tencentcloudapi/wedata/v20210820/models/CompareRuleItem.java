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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareRuleItem extends AbstractModel{

    /**
    * 比较类型 1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * 比较操作类型 <  <=  ==  =>  >
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 质量统计值类型 1.绝对值  2.上升 3. 下降  4._C包含   5. N_C不包含
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueComputeType")
    @Expose
    private Long ValueComputeType;

    /**
    * 比较阈值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueList")
    @Expose
    private ThresholdValue [] ValueList;

    /**
     * Get 比较类型 1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareType 比较类型 1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set 比较类型 1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareType 比较类型 1.固定值  2.波动值  3.数值范围比较  4.枚举范围比较  5.不用比较
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get 比较操作类型 <  <=  ==  =>  >
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 比较操作类型 <  <=  ==  =>  >
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 比较操作类型 <  <=  ==  =>  >
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 比较操作类型 <  <=  ==  =>  >
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 质量统计值类型 1.绝对值  2.上升 3. 下降  4._C包含   5. N_C不包含
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueComputeType 质量统计值类型 1.绝对值  2.上升 3. 下降  4._C包含   5. N_C不包含
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValueComputeType() {
        return this.ValueComputeType;
    }

    /**
     * Set 质量统计值类型 1.绝对值  2.上升 3. 下降  4._C包含   5. N_C不包含
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueComputeType 质量统计值类型 1.绝对值  2.上升 3. 下降  4._C包含   5. N_C不包含
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueComputeType(Long ValueComputeType) {
        this.ValueComputeType = ValueComputeType;
    }

    /**
     * Get 比较阈值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueList 比较阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThresholdValue [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 比较阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueList 比较阈值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueList(ThresholdValue [] ValueList) {
        this.ValueList = ValueList;
    }

    public CompareRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareRuleItem(CompareRuleItem source) {
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
            this.ValueList = new ThresholdValue[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new ThresholdValue(source.ValueList[i]);
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

