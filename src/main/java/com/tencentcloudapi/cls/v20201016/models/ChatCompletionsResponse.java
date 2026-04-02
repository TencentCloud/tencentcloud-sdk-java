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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsResponse extends SSEResponseModel {

    /**
    * <p>Unix 时间戳，单位为秒。</p>
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * <p>Token 统计信息。</p>
    */
    @SerializedName("Usage")
    @Expose
    private ChatUsage Usage;

    /**
    * <p>本次请求的 Id。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>回复内容。</p>
    */
    @SerializedName("Choices")
    @Expose
    private Choice [] Choices;

    /**
    * <p>功能名称</p><p>枚举值：</p><ul><li>text2sql： 智能生成检索分析语句</li><li>text2sql-reasoning： 智能生成检索分析语句-深度思考</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Unix 时间戳，单位为秒。</p> 
     * @return Created <p>Unix 时间戳，单位为秒。</p>
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set <p>Unix 时间戳，单位为秒。</p>
     * @param Created <p>Unix 时间戳，单位为秒。</p>
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get <p>Token 统计信息。</p> 
     * @return Usage <p>Token 统计信息。</p>
     */
    public ChatUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Token 统计信息。</p>
     * @param Usage <p>Token 统计信息。</p>
     */
    public void setUsage(ChatUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>本次请求的 Id。</p> 
     * @return Id <p>本次请求的 Id。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>本次请求的 Id。</p>
     * @param Id <p>本次请求的 Id。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>回复内容。</p> 
     * @return Choices <p>回复内容。</p>
     */
    public Choice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set <p>回复内容。</p>
     * @param Choices <p>回复内容。</p>
     */
    public void setChoices(Choice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get <p>功能名称</p><p>枚举值：</p><ul><li>text2sql： 智能生成检索分析语句</li><li>text2sql-reasoning： 智能生成检索分析语句-深度思考</li></ul> 
     * @return Model <p>功能名称</p><p>枚举值：</p><ul><li>text2sql： 智能生成检索分析语句</li><li>text2sql-reasoning： 智能生成检索分析语句-深度思考</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>功能名称</p><p>枚举值：</p><ul><li>text2sql： 智能生成检索分析语句</li><li>text2sql-reasoning： 智能生成检索分析语句-深度思考</li></ul>
     * @param Model <p>功能名称</p><p>枚举值：</p><ul><li>text2sql： 智能生成检索分析语句</li><li>text2sql-reasoning： 智能生成检索分析语句-深度思考</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
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
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Usage != null) {
            this.Usage = new ChatUsage(source.Usage);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Choices != null) {
            this.Choices = new Choice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new Choice(source.Choices[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

