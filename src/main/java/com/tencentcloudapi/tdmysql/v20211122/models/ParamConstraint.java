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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamConstraint extends AbstractModel {

    /**
    * 约束类型,如枚举enum，区间section
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 约束类型为enum时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enum")
    @Expose
    private String Enum;

    /**
    * 约束类型为section时的范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private ConstraintRange Range;

    /**
    * 约束类型为string时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("String")
    @Expose
    private String String;

    /**
     * Get 约束类型,如枚举enum，区间section 
     * @return Type 约束类型,如枚举enum，区间section
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 约束类型,如枚举enum，区间section
     * @param Type 约束类型,如枚举enum，区间section
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 约束类型为enum时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enum 约束类型为enum时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnum() {
        return this.Enum;
    }

    /**
     * Set 约束类型为enum时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enum 约束类型为enum时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnum(String Enum) {
        this.Enum = Enum;
    }

    /**
     * Get 约束类型为section时的范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range 约束类型为section时的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConstraintRange getRange() {
        return this.Range;
    }

    /**
     * Set 约束类型为section时的范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range 约束类型为section时的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(ConstraintRange Range) {
        this.Range = Range;
    }

    /**
     * Get 约束类型为string时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return String 约束类型为string时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set 约束类型为string时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param String 约束类型为string时的可选值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setString(String String) {
        this.String = String;
    }

    public ParamConstraint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamConstraint(ParamConstraint source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Enum != null) {
            this.Enum = new String(source.Enum);
        }
        if (source.Range != null) {
            this.Range = new ConstraintRange(source.Range);
        }
        if (source.String != null) {
            this.String = new String(source.String);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enum", this.Enum);
        this.setParamObj(map, prefix + "Range.", this.Range);
        this.setParamSimple(map, prefix + "String", this.String);

    }
}

