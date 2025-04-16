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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueRange extends AbstractModel {

    /**
    * 参数类型，可以为 enum，string，section; 其中enum表示枚举，类似： utf8,latin1,gbk; string表示返回的参数值是字符串; section表示返回的参数值是一个取值范围，类似：[4-8]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * type 取section的时候，返回的参数值
    */
    @SerializedName("Range")
    @Expose
    private Range Range;

    /**
    * type 取enum的时候，返回参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enum")
    @Expose
    private String [] Enum;

    /**
    * type 取string的时候，返回的参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("String")
    @Expose
    private String String;

    /**
     * Get 参数类型，可以为 enum，string，section; 其中enum表示枚举，类似： utf8,latin1,gbk; string表示返回的参数值是字符串; section表示返回的参数值是一个取值范围，类似：[4-8] 
     * @return Type 参数类型，可以为 enum，string，section; 其中enum表示枚举，类似： utf8,latin1,gbk; string表示返回的参数值是字符串; section表示返回的参数值是一个取值范围，类似：[4-8]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型，可以为 enum，string，section; 其中enum表示枚举，类似： utf8,latin1,gbk; string表示返回的参数值是字符串; section表示返回的参数值是一个取值范围，类似：[4-8]
     * @param Type 参数类型，可以为 enum，string，section; 其中enum表示枚举，类似： utf8,latin1,gbk; string表示返回的参数值是字符串; section表示返回的参数值是一个取值范围，类似：[4-8]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get type 取section的时候，返回的参数值 
     * @return Range type 取section的时候，返回的参数值
     */
    public Range getRange() {
        return this.Range;
    }

    /**
     * Set type 取section的时候，返回的参数值
     * @param Range type 取section的时候，返回的参数值
     */
    public void setRange(Range Range) {
        this.Range = Range;
    }

    /**
     * Get type 取enum的时候，返回参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enum type 取enum的时候，返回参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnum() {
        return this.Enum;
    }

    /**
     * Set type 取enum的时候，返回参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enum type 取enum的时候，返回参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnum(String [] Enum) {
        this.Enum = Enum;
    }

    /**
     * Get type 取string的时候，返回的参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return String type 取string的时候，返回的参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set type 取string的时候，返回的参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param String type 取string的时候，返回的参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setString(String String) {
        this.String = String;
    }

    public ValueRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueRange(ValueRange source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Range != null) {
            this.Range = new Range(source.Range);
        }
        if (source.Enum != null) {
            this.Enum = new String[source.Enum.length];
            for (int i = 0; i < source.Enum.length; i++) {
                this.Enum[i] = new String(source.Enum[i]);
            }
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
        this.setParamObj(map, prefix + "Range.", this.Range);
        this.setParamArraySimple(map, prefix + "Enum.", this.Enum);
        this.setParamSimple(map, prefix + "String", this.String);

    }
}

