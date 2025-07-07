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

public class CandidateDsDTo extends AbstractModel {

    /**
    * 取值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 取值描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueDesc")
    @Expose
    private String ValueDesc;

    /**
     * Get 取值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 取值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 取值描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueDesc 取值描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueDesc() {
        return this.ValueDesc;
    }

    /**
     * Set 取值描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueDesc 取值描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueDesc(String ValueDesc) {
        this.ValueDesc = ValueDesc;
    }

    public CandidateDsDTo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CandidateDsDTo(CandidateDsDTo source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueDesc != null) {
            this.ValueDesc = new String(source.ValueDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueDesc", this.ValueDesc);

    }
}

