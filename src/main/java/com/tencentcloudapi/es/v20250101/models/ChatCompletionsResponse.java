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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsResponse extends SSEResponseModel {

    /**
    * 此次请求的id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 回复内容
    */
    @SerializedName("Choices")
    @Expose
    private Choice [] Choices;

    /**
    * token使用量
    */
    @SerializedName("Usage")
    @Expose
    private TokenUsage Usage;

    /**
    * 联网搜索结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineSearchContent")
    @Expose
    private WebContent [] OnlineSearchContent;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 此次请求的id 
     * @return Id 此次请求的id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 此次请求的id
     * @param Id 此次请求的id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 回复内容 
     * @return Choices 回复内容
     */
    public Choice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 回复内容
     * @param Choices 回复内容
     */
    public void setChoices(Choice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get token使用量 
     * @return Usage token使用量
     */
    public TokenUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set token使用量
     * @param Usage token使用量
     */
    public void setUsage(TokenUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 联网搜索结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineSearchContent 联网搜索结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebContent [] getOnlineSearchContent() {
        return this.OnlineSearchContent;
    }

    /**
     * Set 联网搜索结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineSearchContent 联网搜索结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineSearchContent(WebContent [] OnlineSearchContent) {
        this.OnlineSearchContent = OnlineSearchContent;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChatCompletionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsResponse(ChatCompletionsResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Choices != null) {
            this.Choices = new Choice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new Choice(source.Choices[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new TokenUsage(source.Usage);
        }
        if (source.OnlineSearchContent != null) {
            this.OnlineSearchContent = new WebContent[source.OnlineSearchContent.length];
            for (int i = 0; i < source.OnlineSearchContent.length; i++) {
                this.OnlineSearchContent[i] = new WebContent(source.OnlineSearchContent[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamArrayObj(map, prefix + "OnlineSearchContent.", this.OnlineSearchContent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

