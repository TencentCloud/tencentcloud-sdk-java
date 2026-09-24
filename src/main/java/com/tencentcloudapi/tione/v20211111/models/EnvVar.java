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

public class EnvVar extends AbstractModel {

    /**
    * <p>环境变量key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>是否对外不可见,true 表示该环境变量的 Value 为敏感值.</p>
    */
    @SerializedName("IsPrivate")
    @Expose
    private Boolean IsPrivate;

    /**
     * Get <p>环境变量key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>环境变量key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>环境变量key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>环境变量key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>是否对外不可见,true 表示该环境变量的 Value 为敏感值.</p> 
     * @return IsPrivate <p>是否对外不可见,true 表示该环境变量的 Value 为敏感值.</p>
     */
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    /**
     * Set <p>是否对外不可见,true 表示该环境变量的 Value 为敏感值.</p>
     * @param IsPrivate <p>是否对外不可见,true 表示该环境变量的 Value 为敏感值.</p>
     */
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    public EnvVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvVar(EnvVar source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.IsPrivate != null) {
            this.IsPrivate = new Boolean(source.IsPrivate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IsPrivate", this.IsPrivate);

    }
}

