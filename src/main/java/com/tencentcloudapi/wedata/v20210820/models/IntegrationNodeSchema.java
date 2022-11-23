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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeSchema extends AbstractModel{

    /**
    * schema id
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
     * Get schema id 
     * @return Id schema id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set schema id
     * @param Id schema id
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

    }
}

