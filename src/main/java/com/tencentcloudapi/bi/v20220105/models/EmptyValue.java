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

public class EmptyValue extends AbstractModel {

    /**
    * 空值展示样式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 空值展示样式类型对应具体的展示字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Custom")
    @Expose
    private String Custom;

    /**
     * Get 空值展示样式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 空值展示样式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 空值展示样式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 空值展示样式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 空值展示样式类型对应具体的展示字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Custom 空值展示样式类型对应具体的展示字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustom() {
        return this.Custom;
    }

    /**
     * Set 空值展示样式类型对应具体的展示字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Custom 空值展示样式类型对应具体的展示字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustom(String Custom) {
        this.Custom = Custom;
    }

    public EmptyValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmptyValue(EmptyValue source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Custom != null) {
            this.Custom = new String(source.Custom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Custom", this.Custom);

    }
}

