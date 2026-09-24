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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAgentSourceInput extends AbstractModel {

    /**
    * <p>来源类型。MANUAL：直接提交 Agent Descriptors JSON 文本；URL_IMPORT：从远端 Agent Card / AGUI 端点导入。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Type=MANUAL 时必填；值为通用 JSON object 文本；A2A 标准校验或 AGUI/CUSTOM 规则由后端执行。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Descriptors")
    @Expose
    private String Descriptors;

    /**
    * <p>A2A：Agent Card URL；AGUI：Runtime Endpoint URL。Type=URL_IMPORT 时必填，HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointURL")
    @Expose
    private String EndpointURL;

    /**
     * Get <p>来源类型。MANUAL：直接提交 Agent Descriptors JSON 文本；URL_IMPORT：从远端 Agent Card / AGUI 端点导入。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>来源类型。MANUAL：直接提交 Agent Descriptors JSON 文本；URL_IMPORT：从远端 Agent Card / AGUI 端点导入。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>来源类型。MANUAL：直接提交 Agent Descriptors JSON 文本；URL_IMPORT：从远端 Agent Card / AGUI 端点导入。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>来源类型。MANUAL：直接提交 Agent Descriptors JSON 文本；URL_IMPORT：从远端 Agent Card / AGUI 端点导入。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Type=MANUAL 时必填；值为通用 JSON object 文本；A2A 标准校验或 AGUI/CUSTOM 规则由后端执行。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Descriptors <p>Type=MANUAL 时必填；值为通用 JSON object 文本；A2A 标准校验或 AGUI/CUSTOM 规则由后端执行。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptors() {
        return this.Descriptors;
    }

    /**
     * Set <p>Type=MANUAL 时必填；值为通用 JSON object 文本；A2A 标准校验或 AGUI/CUSTOM 规则由后端执行。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Descriptors <p>Type=MANUAL 时必填；值为通用 JSON object 文本；A2A 标准校验或 AGUI/CUSTOM 规则由后端执行。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptors(String Descriptors) {
        this.Descriptors = Descriptors;
    }

    /**
     * Get <p>A2A：Agent Card URL；AGUI：Runtime Endpoint URL。Type=URL_IMPORT 时必填，HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointURL <p>A2A：Agent Card URL；AGUI：Runtime Endpoint URL。Type=URL_IMPORT 时必填，HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointURL() {
        return this.EndpointURL;
    }

    /**
     * Set <p>A2A：Agent Card URL；AGUI：Runtime Endpoint URL。Type=URL_IMPORT 时必填，HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointURL <p>A2A：Agent Card URL；AGUI：Runtime Endpoint URL。Type=URL_IMPORT 时必填，HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointURL(String EndpointURL) {
        this.EndpointURL = EndpointURL;
    }

    public CloudAgentSourceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAgentSourceInput(CloudAgentSourceInput source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Descriptors != null) {
            this.Descriptors = new String(source.Descriptors);
        }
        if (source.EndpointURL != null) {
            this.EndpointURL = new String(source.EndpointURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Descriptors", this.Descriptors);
        this.setParamSimple(map, prefix + "EndpointURL", this.EndpointURL);

    }
}

