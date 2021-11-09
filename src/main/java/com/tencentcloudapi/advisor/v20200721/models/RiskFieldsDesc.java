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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskFieldsDesc extends AbstractModel{

    /**
    * 字段ID
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 字段类型, 
string: 字符串类型，例如"aa"
int: 整形，例如 111
stringSlice : 字符串数组类型，例如["a", "b"]
tags: 标签类型, 例如: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 字段值对应字典
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldDict")
    @Expose
    private KeyValue [] FieldDict;

    /**
     * Get 字段ID 
     * @return Field 字段ID
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 字段ID
     * @param Field 字段ID
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 字段名称 
     * @return FieldName 字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称
     * @param FieldName 字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 字段类型, 
string: 字符串类型，例如"aa"
int: 整形，例如 111
stringSlice : 字符串数组类型，例如["a", "b"]
tags: 标签类型, 例如: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}] 
     * @return FieldType 字段类型, 
string: 字符串类型，例如"aa"
int: 整形，例如 111
stringSlice : 字符串数组类型，例如["a", "b"]
tags: 标签类型, 例如: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set 字段类型, 
string: 字符串类型，例如"aa"
int: 整形，例如 111
stringSlice : 字符串数组类型，例如["a", "b"]
tags: 标签类型, 例如: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     * @param FieldType 字段类型, 
string: 字符串类型，例如"aa"
int: 整形，例如 111
stringSlice : 字符串数组类型，例如["a", "b"]
tags: 标签类型, 例如: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 字段值对应字典
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldDict 字段值对应字典
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValue [] getFieldDict() {
        return this.FieldDict;
    }

    /**
     * Set 字段值对应字典
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldDict 字段值对应字典
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldDict(KeyValue [] FieldDict) {
        this.FieldDict = FieldDict;
    }

    public RiskFieldsDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskFieldsDesc(RiskFieldsDesc source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldDict != null) {
            this.FieldDict = new KeyValue[source.FieldDict.length];
            for (int i = 0; i < source.FieldDict.length; i++) {
                this.FieldDict[i] = new KeyValue(source.FieldDict[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamArrayObj(map, prefix + "FieldDict.", this.FieldDict);

    }
}

