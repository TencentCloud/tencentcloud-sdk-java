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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyValueInfo extends AbstractModel{

    /**
    * 需要配置键值或者元字段索引的字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 字段的索引描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private AccessValueInfo Value;

    /**
     * Get 需要配置键值或者元字段索引的字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 需要配置键值或者元字段索引的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 需要配置键值或者元字段索引的字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 需要配置键值或者元字段索引的字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 字段的索引描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 字段的索引描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessValueInfo getValue() {
        return this.Value;
    }

    /**
     * Set 字段的索引描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 字段的索引描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(AccessValueInfo Value) {
        this.Value = Value;
    }

    public AccessKeyValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyValueInfo(AccessKeyValueInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new AccessValueInfo(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

