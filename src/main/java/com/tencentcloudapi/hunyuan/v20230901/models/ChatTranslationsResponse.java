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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatTranslationsResponse extends SSEResponseModel {

    /**
    * 本次请求的 RequestId。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 免责声明。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

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
    private Usage Usage;

    /**
    * 回复内容。
    */
    @SerializedName("Choices")
    @Expose
    private TranslationChoice [] Choices;

    /**
    * 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private ErrorMsg ErrorMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 免责声明。 
     * @return Note 免责声明。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 免责声明。
     * @param Note 免责声明。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

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
    public Usage getUsage() {
        return this.Usage;
    }

    /**
     * Set Token 统计信息。
按照总 Token 数量计费。
     * @param Usage Token 统计信息。
按照总 Token 数量计费。
     */
    public void setUsage(Usage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 回复内容。 
     * @return Choices 回复内容。
     */
    public TranslationChoice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 回复内容。
     * @param Choices 回复内容。
     */
    public void setChoices(TranslationChoice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get 错误信息。
如果流式返回中服务处理异常，返回该错误信息。 
     * @return ErrorMsg 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
     */
    public ErrorMsg getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
     * @param ErrorMsg 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
     */
    public void setErrorMsg(ErrorMsg ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
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

    public ChatTranslationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatTranslationsResponse(ChatTranslationsResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Usage != null) {
            this.Usage = new Usage(source.Usage);
        }
        if (source.Choices != null) {
            this.Choices = new TranslationChoice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new TranslationChoice(source.Choices[i]);
            }
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new ErrorMsg(source.ErrorMsg);
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
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamObj(map, prefix + "ErrorMsg.", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

