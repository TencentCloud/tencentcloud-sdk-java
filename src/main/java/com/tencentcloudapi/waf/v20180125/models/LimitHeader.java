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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitHeader extends AbstractModel {

    /**
    * key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 匹配方式，支持EXACT(等于), REGEX（正则） , IN（属于） , NOT_IN（不属于）, CONTAINS（包含）, NOT_CONTAINS（不包含）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set value
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 匹配方式，支持EXACT(等于), REGEX（正则） , IN（属于） , NOT_IN（不属于）, CONTAINS（包含）, NOT_CONTAINS（不包含）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 匹配方式，支持EXACT(等于), REGEX（正则） , IN（属于） , NOT_IN（不属于）, CONTAINS（包含）, NOT_CONTAINS（不包含）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 匹配方式，支持EXACT(等于), REGEX（正则） , IN（属于） , NOT_IN（不属于）, CONTAINS（包含）, NOT_CONTAINS（不包含）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 匹配方式，支持EXACT(等于), REGEX（正则） , IN（属于） , NOT_IN（不属于）, CONTAINS（包含）, NOT_CONTAINS（不包含）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public LimitHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitHeader(LimitHeader source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

