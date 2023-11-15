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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiContent extends AbstractModel {

    /**
    * 所属API的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 参数名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否为动态值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dynamic")
    @Expose
    private Boolean Dynamic;

    /**
    * 是否必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * 参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get 所属API的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 所属API的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 所属API的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 所属API的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 参数名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 是否为动态值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dynamic 是否为动态值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDynamic() {
        return this.Dynamic;
    }

    /**
     * Set 是否为动态值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dynamic 是否为动态值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamic(Boolean Dynamic) {
        this.Dynamic = Dynamic;
    }

    /**
     * Get 是否必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Required 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Required 是否必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get 参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    public ApiContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiContent(ApiContent source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Dynamic != null) {
            this.Dynamic = new Boolean(source.Dynamic);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Dynamic", this.Dynamic);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);

    }
}

