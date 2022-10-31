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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictHandleOption extends AbstractModel{

    /**
    * 条件覆盖的列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionColumn")
    @Expose
    private String ConditionColumn;

    /**
    * 条件覆盖操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionOperator")
    @Expose
    private String ConditionOperator;

    /**
    * 条件覆盖优先级处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionOrderInSrcAndDst")
    @Expose
    private String ConditionOrderInSrcAndDst;

    /**
     * Get 条件覆盖的列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionColumn 条件覆盖的列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionColumn() {
        return this.ConditionColumn;
    }

    /**
     * Set 条件覆盖的列
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionColumn 条件覆盖的列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionColumn(String ConditionColumn) {
        this.ConditionColumn = ConditionColumn;
    }

    /**
     * Get 条件覆盖操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionOperator 条件覆盖操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionOperator() {
        return this.ConditionOperator;
    }

    /**
     * Set 条件覆盖操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionOperator 条件覆盖操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionOperator(String ConditionOperator) {
        this.ConditionOperator = ConditionOperator;
    }

    /**
     * Get 条件覆盖优先级处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionOrderInSrcAndDst 条件覆盖优先级处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionOrderInSrcAndDst() {
        return this.ConditionOrderInSrcAndDst;
    }

    /**
     * Set 条件覆盖优先级处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionOrderInSrcAndDst 条件覆盖优先级处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionOrderInSrcAndDst(String ConditionOrderInSrcAndDst) {
        this.ConditionOrderInSrcAndDst = ConditionOrderInSrcAndDst;
    }

    public ConflictHandleOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictHandleOption(ConflictHandleOption source) {
        if (source.ConditionColumn != null) {
            this.ConditionColumn = new String(source.ConditionColumn);
        }
        if (source.ConditionOperator != null) {
            this.ConditionOperator = new String(source.ConditionOperator);
        }
        if (source.ConditionOrderInSrcAndDst != null) {
            this.ConditionOrderInSrcAndDst = new String(source.ConditionOrderInSrcAndDst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConditionColumn", this.ConditionColumn);
        this.setParamSimple(map, prefix + "ConditionOperator", this.ConditionOperator);
        this.setParamSimple(map, prefix + "ConditionOrderInSrcAndDst", this.ConditionOrderInSrcAndDst);

    }
}

