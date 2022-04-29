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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParquetKeyInfo extends AbstractModel{

    /**
    * 键值名称
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 数据类型，目前支持6种类型：string、boolean、int32、int64、float、double
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 解析失败赋值信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyNonExistingField")
    @Expose
    private String KeyNonExistingField;

    /**
     * Get 键值名称 
     * @return KeyName 键值名称
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 键值名称
     * @param KeyName 键值名称
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 数据类型，目前支持6种类型：string、boolean、int32、int64、float、double 
     * @return KeyType 数据类型，目前支持6种类型：string、boolean、int32、int64、float、double
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 数据类型，目前支持6种类型：string、boolean、int32、int64、float、double
     * @param KeyType 数据类型，目前支持6种类型：string、boolean、int32、int64、float、double
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 解析失败赋值信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyNonExistingField 解析失败赋值信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyNonExistingField() {
        return this.KeyNonExistingField;
    }

    /**
     * Set 解析失败赋值信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyNonExistingField 解析失败赋值信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyNonExistingField(String KeyNonExistingField) {
        this.KeyNonExistingField = KeyNonExistingField;
    }

    public ParquetKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParquetKeyInfo(ParquetKeyInfo source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyNonExistingField != null) {
            this.KeyNonExistingField = new String(source.KeyNonExistingField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyNonExistingField", this.KeyNonExistingField);

    }
}

