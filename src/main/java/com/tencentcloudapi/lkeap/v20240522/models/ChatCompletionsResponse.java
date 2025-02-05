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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsResponse extends SSEResponseModel {

    /**
    * Unix 时间戳，单位为秒。
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * Token 统计信息。
按照总 Token 数量计费。
    */
    @SerializedName("Usage")
    @Expose
    private ChatUsage Usage;

    /**
    * 本次请求的 RequestId。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 回复内容。
    */
    @SerializedName("Choices")
    @Expose
    private Choice [] Choices;

    /**
    * 模型名称。
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
     * Get Unix 时间戳，单位为秒。 
     * @return Created Unix 时间戳，单位为秒。
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set Unix 时间戳，单位为秒。
     * @param Created Unix 时间戳，单位为秒。
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get Token 统计信息。
按照总 Token 数量计费。 
     * @return Usage Token 统计信息。
按照总 Token 数量计费。
     */
    public ChatUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set Token 统计信息。
按照总 Token 数量计费。
     * @param Usage Token 统计信息。
按照总 Token 数量计费。
     */
    public void setUsage(ChatUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 本次请求的 RequestId。 
     * @return Id 本次请求的 RequestId。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 本次请求的 RequestId。
     * @param Id 本次请求的 RequestId。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 回复内容。 
     * @return Choices 回复内容。
     */
    public Choice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 回复内容。
     * @param Choices 回复内容。
     */
    public void setChoices(Choice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get 模型名称。 
     * @return Model 模型名称。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称。
     * @param Model 模型名称。
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

