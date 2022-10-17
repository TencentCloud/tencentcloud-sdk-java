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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePart extends AbstractModel{

    /**
    * 码段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 码段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 码段内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 码段长度
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
     * Get 码段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 码段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 码段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 码段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 码段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 码段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 码段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 码段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 码段内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 码段内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 码段内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 码段内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 码段长度 
     * @return Length 码段长度
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 码段长度
     * @param Length 码段长度
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 扩展字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    public CodePart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodePart(CodePart source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Ext", this.Ext);

    }
}

