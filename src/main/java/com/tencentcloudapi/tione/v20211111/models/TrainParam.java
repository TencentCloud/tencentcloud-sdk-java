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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainParam extends AbstractModel {

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 默认参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 参数注释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 参数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否必选
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 参数范围
    */
    @SerializedName("Range")
    @Expose
    private String [] Range;

    /**
    * 参数选项
    */
    @SerializedName("Enum")
    @Expose
    private String [] Enum;

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 默认参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 默认参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 默认参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 参数注释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 参数注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 参数注释
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 参数注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 参数类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否必选 
     * @return Required 是否必选
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 是否必选
     * @param Required 是否必选
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get 参数值 
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数值
     * @param Value 参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 参数范围 
     * @return Range 参数范围
     */
    public String [] getRange() {
        return this.Range;
    }

    /**
     * Set 参数范围
     * @param Range 参数范围
     */
    public void setRange(String [] Range) {
        this.Range = Range;
    }

    /**
     * Get 参数选项 
     * @return Enum 参数选项
     */
    public String [] getEnum() {
        return this.Enum;
    }

    /**
     * Set 参数选项
     * @param Enum 参数选项
     */
    public void setEnum(String [] Enum) {
        this.Enum = Enum;
    }

    public TrainParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainParam(TrainParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Range != null) {
            this.Range = new String[source.Range.length];
            for (int i = 0; i < source.Range.length; i++) {
                this.Range[i] = new String(source.Range[i]);
            }
        }
        if (source.Enum != null) {
            this.Enum = new String[source.Enum.length];
            for (int i = 0; i < source.Enum.length; i++) {
                this.Enum[i] = new String(source.Enum[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "Range.", this.Range);
        this.setParamArraySimple(map, prefix + "Enum.", this.Enum);

    }
}

