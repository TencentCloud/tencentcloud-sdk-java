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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamConstraint extends AbstractModel{

    /**
    * 约束类型,如枚举enum，区间section
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 约束类型为enum时的可选值列表
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
     * @return Enum 约束类型为enum时的可选值列表
     */
    public String getEnum() {
        return this.Enum;
    }

    /**
     * Set 约束类型为enum时的可选值列表
     * @param Enum 约束类型为enum时的可选值列表
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
     * @return String 约束类型为string时的可选值列表
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set 约束类型为string时的可选值列表
     * @param String 约束类型为string时的可选值列表
     */
    public void setString(String String) {
        this.String = String;
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

