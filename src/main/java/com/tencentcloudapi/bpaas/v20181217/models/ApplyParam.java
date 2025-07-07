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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyParam extends AbstractModel {

    /**
    * 审批流中表单唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 表单value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 表单参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 审批流中表单唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 审批流中表单唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 审批流中表单唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 审批流中表单唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 表单value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 表单value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 表单value
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 表单value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 表单参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 表单参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表单参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 表单参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ApplyParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyParam(ApplyParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
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
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

