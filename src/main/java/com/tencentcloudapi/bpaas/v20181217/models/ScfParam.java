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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScfParam extends AbstractModel{

    /**
    * 参数Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 参数类型 1用户输入 2预设参数 3表单参数
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 参数值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 参数Key 
     * @return Key 参数Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 参数Key
     * @param Key 参数Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 参数类型 1用户输入 2预设参数 3表单参数 
     * @return Type 参数类型 1用户输入 2预设参数 3表单参数
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参数类型 1用户输入 2预设参数 3表单参数
     * @param Type 参数类型 1用户输入 2预设参数 3表单参数
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 参数值 
     * @return Values 参数值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 参数值
     * @param Values 参数值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ScfParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScfParam(ScfParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

