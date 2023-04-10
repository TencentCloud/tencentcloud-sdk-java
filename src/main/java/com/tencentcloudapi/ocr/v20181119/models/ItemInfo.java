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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemInfo extends AbstractModel{

    /**
    * key信息组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private Key Key;

    /**
    * Value信息组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Value Value;

    /**
     * Get key信息组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key key信息组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Key getKey() {
        return this.Key;
    }

    /**
     * Set key信息组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key key信息组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(Key Key) {
        this.Key = Key;
    }

    /**
     * Get Value信息组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value Value信息组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Value getValue() {
        return this.Value;
    }

    /**
     * Set Value信息组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value Value信息组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Value Value) {
        this.Value = Value;
    }

    public ItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemInfo(ItemInfo source) {
        if (source.Key != null) {
            this.Key = new Key(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Value(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Key.", this.Key);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

