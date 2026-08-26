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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvEntry extends AbstractModel {

    /**
    * <p>环境变量value</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>是否脱敏</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sensitive")
    @Expose
    private Boolean Sensitive;

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
     * Get <p>是否脱敏</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sensitive <p>是否脱敏</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSensitive() {
        return this.Sensitive;
    }

    /**
     * Set <p>是否脱敏</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sensitive <p>是否脱敏</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitive(Boolean Sensitive) {
        this.Sensitive = Sensitive;
    }

    public EnvEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvEntry(EnvEntry source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Sensitive != null) {
            this.Sensitive = new Boolean(source.Sensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Sensitive", this.Sensitive);

    }
}

