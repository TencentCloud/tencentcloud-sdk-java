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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmptyValueConfig extends AbstractModel {

    /**
    * 数值类字段空值样式配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private EmptyValue Number;

    /**
    * 字符串字段空置样式配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("String")
    @Expose
    private EmptyValue String;

    /**
     * Get 数值类字段空值样式配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 数值类字段空值样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmptyValue getNumber() {
        return this.Number;
    }

    /**
     * Set 数值类字段空值样式配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 数值类字段空值样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(EmptyValue Number) {
        this.Number = Number;
    }

    /**
     * Get 字符串字段空置样式配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return String 字符串字段空置样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmptyValue getString() {
        return this.String;
    }

    /**
     * Set 字符串字段空置样式配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param String 字符串字段空置样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setString(EmptyValue String) {
        this.String = String;
    }

    public EmptyValueConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmptyValueConfig(EmptyValueConfig source) {
        if (source.Number != null) {
            this.Number = new EmptyValue(source.Number);
        }
        if (source.String != null) {
            this.String = new EmptyValue(source.String);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamObj(map, prefix + "String.", this.String);

    }
}

