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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTemplate extends AbstractModel{

    /**
    * 数字类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private NumberData Number;

    /**
    * 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("String")
    @Expose
    private StringData String;

    /**
    * 枚举类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enum")
    @Expose
    private EnumData Enum;

    /**
    * 布尔类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bool")
    @Expose
    private BoolData Bool;

    /**
     * Get 数字类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 数字类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberData getNumber() {
        return this.Number;
    }

    /**
     * Set 数字类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 数字类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(NumberData Number) {
        this.Number = Number;
    }

    /**
     * Get 字符串类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return String 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringData getString() {
        return this.String;
    }

    /**
     * Set 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param String 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setString(StringData String) {
        this.String = String;
    }

    /**
     * Get 枚举类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enum 枚举类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnumData getEnum() {
        return this.Enum;
    }

    /**
     * Set 枚举类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enum 枚举类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnum(EnumData Enum) {
        this.Enum = Enum;
    }

    /**
     * Get 布尔类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bool 布尔类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BoolData getBool() {
        return this.Bool;
    }

    /**
     * Set 布尔类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bool 布尔类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBool(BoolData Bool) {
        this.Bool = Bool;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamObj(map, prefix + "String.", this.String);
        this.setParamObj(map, prefix + "Enum.", this.Enum);
        this.setParamObj(map, prefix + "Bool.", this.Bool);

    }
}

