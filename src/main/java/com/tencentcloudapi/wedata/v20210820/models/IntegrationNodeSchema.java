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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeSchema extends AbstractModel {

    /**
    * schema id 随机唯一
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * schema名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * schema类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * schema值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * schema拓展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private RecordField [] Properties;

    /**
    * schema别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 字段备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * category
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get schema id 随机唯一 
     * @return Id schema id 随机唯一
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set schema id 随机唯一
     * @param Id schema id 随机唯一
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get schema名称 
     * @return Name schema名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set schema名称
     * @param Name schema名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get schema类型 
     * @return Type schema类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set schema类型
     * @param Type schema类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get schema值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value schema值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set schema值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value schema值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get schema拓展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties schema拓展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getProperties() {
        return this.Properties;
    }

    /**
     * Set schema拓展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties schema拓展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(RecordField [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get schema别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias schema别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set schema别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias schema别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 字段备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 字段备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字段备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 字段备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get category
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category category
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set category
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category category
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public IntegrationNodeSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeSchema(IntegrationNodeSchema source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Properties != null) {
            this.Properties = new RecordField[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new RecordField(source.Properties[i]);
            }
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

