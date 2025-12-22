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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomLabel extends AbstractModel {

    /**
    * 标签的键。
- 必须以字母或下划线开头，但不可以双下划线（__）开头，后面可以跟任意字母，数字或下划线。
- 最大支持256个字符。
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签的值。
- 最大支持256个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 标签的键。
- 必须以字母或下划线开头，但不可以双下划线（__）开头，后面可以跟任意字母，数字或下划线。
- 最大支持256个字符。
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 标签的键。
- 必须以字母或下划线开头，但不可以双下划线（__）开头，后面可以跟任意字母，数字或下划线。
- 最大支持256个字符。
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签的键。
- 必须以字母或下划线开头，但不可以双下划线（__）开头，后面可以跟任意字母，数字或下划线。
- 最大支持256个字符。
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 标签的键。
- 必须以字母或下划线开头，但不可以双下划线（__）开头，后面可以跟任意字母，数字或下划线。
- 最大支持256个字符。
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 标签的值。
- 最大支持256个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 标签的值。
- 最大支持256个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签的值。
- 最大支持256个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 标签的值。
- 最大支持256个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public CustomLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomLabel(CustomLabel source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

