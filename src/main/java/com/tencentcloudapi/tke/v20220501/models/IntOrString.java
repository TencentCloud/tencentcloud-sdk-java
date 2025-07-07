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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntOrString extends AbstractModel {

    /**
    * 数值类型，0是int,  1是字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 整数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntVal")
    @Expose
    private Long IntVal;

    /**
    * 字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrVal")
    @Expose
    private String StrVal;

    /**
     * Get 数值类型，0是int,  1是字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 数值类型，0是int,  1是字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 数值类型，0是int,  1是字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 数值类型，0是int,  1是字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 整数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntVal 整数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntVal() {
        return this.IntVal;
    }

    /**
     * Set 整数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntVal 整数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntVal(Long IntVal) {
        this.IntVal = IntVal;
    }

    /**
     * Get 字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrVal 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrVal() {
        return this.StrVal;
    }

    /**
     * Set 字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrVal 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrVal(String StrVal) {
        this.StrVal = StrVal;
    }

    public IntOrString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntOrString(IntOrString source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IntVal != null) {
            this.IntVal = new Long(source.IntVal);
        }
        if (source.StrVal != null) {
            this.StrVal = new String(source.StrVal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IntVal", this.IntVal);
        this.setParamSimple(map, prefix + "StrVal", this.StrVal);

    }
}

