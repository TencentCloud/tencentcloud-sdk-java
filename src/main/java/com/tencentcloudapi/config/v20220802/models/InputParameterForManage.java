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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputParameterForManage extends AbstractModel {

    /**
    * 值类型。数值：Integer， 字符串：String
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 参数Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterKey")
    @Expose
    private String ParameterKey;

    /**
    * 参数类型。必填类型：Require，可选类型：Optional。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 值类型。数值：Integer， 字符串：String
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueType 值类型。数值：Integer， 字符串：String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 值类型。数值：Integer， 字符串：String
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueType 值类型。数值：Integer， 字符串：String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 参数Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterKey 参数Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterKey() {
        return this.ParameterKey;
    }

    /**
     * Set 参数Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterKey 参数Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterKey(String ParameterKey) {
        this.ParameterKey = ParameterKey;
    }

    /**
     * Get 参数类型。必填类型：Require，可选类型：Optional。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 参数类型。必填类型：Require，可选类型：Optional。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型。必填类型：Require，可选类型：Optional。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 参数类型。必填类型：Require，可选类型：Optional。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
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

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public InputParameterForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputParameterForManage(InputParameterForManage source) {
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.ParameterKey != null) {
            this.ParameterKey = new String(source.ParameterKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "ParameterKey", this.ParameterKey);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

