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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LimitHeaderName extends AbstractModel {

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamsName")
    @Expose
    private String ParamsName;

    /**
    * 操作符号,支持REGEX(正则),IN(属于),NOT_IN(不属于), EACH(每个参数值)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamsName 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamsName() {
        return this.ParamsName;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamsName 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamsName(String ParamsName) {
        this.ParamsName = ParamsName;
    }

    /**
     * Get 操作符号,支持REGEX(正则),IN(属于),NOT_IN(不属于), EACH(每个参数值)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 操作符号,支持REGEX(正则),IN(属于),NOT_IN(不属于), EACH(每个参数值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作符号,支持REGEX(正则),IN(属于),NOT_IN(不属于), EACH(每个参数值)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 操作符号,支持REGEX(正则),IN(属于),NOT_IN(不属于), EACH(每个参数值)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public LimitHeaderName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitHeaderName(LimitHeaderName source) {
        if (source.ParamsName != null) {
            this.ParamsName = new String(source.ParamsName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamsName", this.ParamsName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

