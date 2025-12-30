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
package com.tencentcloudapi.cloudmate.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudMateAgentResponse extends SSEResponseModel {

    /**
    * 会话ID，用于后续继续对话
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Unix 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 诊断内容
    */
    @SerializedName("Content")
    @Expose
    private ChatContent Content;

    /**
    * 是否为部分内容（流式场景）
    */
    @SerializedName("Partial")
    @Expose
    private Boolean Partial;

    /**
    * 本轮对话是否完成
    */
    @SerializedName("TurnComplete")
    @Expose
    private Boolean TurnComplete;

    /**
    * 错误代码，无错误时无该字段
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误详细信息，无错误时无该字段
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话ID，用于后续继续对话 
     * @return SessionId 会话ID，用于后续继续对话
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID，用于后续继续对话
     * @param SessionId 会话ID，用于后续继续对话
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Unix 时间戳 
     * @return Timestamp Unix 时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Unix 时间戳
     * @param Timestamp Unix 时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 诊断内容 
     * @return Content 诊断内容
     */
    public ChatContent getContent() {
        return this.Content;
    }

    /**
     * Set 诊断内容
     * @param Content 诊断内容
     */
    public void setContent(ChatContent Content) {
        this.Content = Content;
    }

    /**
     * Get 是否为部分内容（流式场景） 
     * @return Partial 是否为部分内容（流式场景）
     */
    public Boolean getPartial() {
        return this.Partial;
    }

    /**
     * Set 是否为部分内容（流式场景）
     * @param Partial 是否为部分内容（流式场景）
     */
    public void setPartial(Boolean Partial) {
        this.Partial = Partial;
    }

    /**
     * Get 本轮对话是否完成 
     * @return TurnComplete 本轮对话是否完成
     */
    public Boolean getTurnComplete() {
        return this.TurnComplete;
    }

    /**
     * Set 本轮对话是否完成
     * @param TurnComplete 本轮对话是否完成
     */
    public void setTurnComplete(Boolean TurnComplete) {
        this.TurnComplete = TurnComplete;
    }

    /**
     * Get 错误代码，无错误时无该字段 
     * @return ErrorCode 错误代码，无错误时无该字段
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误代码，无错误时无该字段
     * @param ErrorCode 错误代码，无错误时无该字段
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误详细信息，无错误时无该字段 
     * @return ErrorMessage 错误详细信息，无错误时无该字段
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误详细信息，无错误时无该字段
     * @param ErrorMessage 错误详细信息，无错误时无该字段
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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

    public CloudMateAgentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudMateAgentResponse(CloudMateAgentResponse source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Content != null) {
            this.Content = new ChatContent(source.Content);
        }
        if (source.Partial != null) {
            this.Partial = new Boolean(source.Partial);
        }
        if (source.TurnComplete != null) {
            this.TurnComplete = new Boolean(source.TurnComplete);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Partial", this.Partial);
        this.setParamSimple(map, prefix + "TurnComplete", this.TurnComplete);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

