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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailHitFilter extends AbstractModel {

    /**
    * <p>支持 PolicyId、Direction、Decision、EffectiveAction、ResourceType、ResourceId、Protocol、RouteId、RequestId、ErrorCode。Direction 使用 request/response；Protocol 应使用实际审核日志中的协议名，如 mcp-streamable-http。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>每个过滤项仅支持一个非空字符串值，不支持同一项多值 OR；不同过滤项之间为 AND。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get <p>支持 PolicyId、Direction、Decision、EffectiveAction、ResourceType、ResourceId、Protocol、RouteId、RequestId、ErrorCode。Direction 使用 request/response；Protocol 应使用实际审核日志中的协议名，如 mcp-streamable-http。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>支持 PolicyId、Direction、Decision、EffectiveAction、ResourceType、ResourceId、Protocol、RouteId、RequestId、ErrorCode。Direction 使用 request/response；Protocol 应使用实际审核日志中的协议名，如 mcp-streamable-http。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>支持 PolicyId、Direction、Decision、EffectiveAction、ResourceType、ResourceId、Protocol、RouteId、RequestId、ErrorCode。Direction 使用 request/response；Protocol 应使用实际审核日志中的协议名，如 mcp-streamable-http。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>支持 PolicyId、Direction、Decision、EffectiveAction、ResourceType、ResourceId、Protocol、RouteId、RequestId、ErrorCode。Direction 使用 request/response；Protocol 应使用实际审核日志中的协议名，如 mcp-streamable-http。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>每个过滤项仅支持一个非空字符串值，不支持同一项多值 OR；不同过滤项之间为 AND。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values <p>每个过滤项仅支持一个非空字符串值，不支持同一项多值 OR；不同过滤项之间为 AND。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>每个过滤项仅支持一个非空字符串值，不支持同一项多值 OR；不同过滤项之间为 AND。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values <p>每个过滤项仅支持一个非空字符串值，不支持同一项多值 OR；不同过滤项之间为 AND。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public CustomGuardrailHitFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailHitFilter(CustomGuardrailHitFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

