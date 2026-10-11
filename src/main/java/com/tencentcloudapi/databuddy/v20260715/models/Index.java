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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Index extends AbstractModel {

    /**
    * 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
     * Get 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldNames 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldNames 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexType 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexType 字段键值类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    public Index() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Index(Index source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);

    }
}

