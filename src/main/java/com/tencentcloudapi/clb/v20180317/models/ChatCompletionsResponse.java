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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsResponse extends AbstractModel {

    /**
    * <p>聊天的返回信息</p>
    */
    @SerializedName("ChatResponseMessage")
    @Expose
    private String ChatResponseMessage;

    /**
    * <p>聊天请求发送过程中的失败信息</p>
    */
    @SerializedName("ErrorInChat")
    @Expose
    private String ErrorInChat;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>聊天的返回信息</p> 
     * @return ChatResponseMessage <p>聊天的返回信息</p>
     */
    public String getChatResponseMessage() {
        return this.ChatResponseMessage;
    }

    /**
     * Set <p>聊天的返回信息</p>
     * @param ChatResponseMessage <p>聊天的返回信息</p>
     */
    public void setChatResponseMessage(String ChatResponseMessage) {
        this.ChatResponseMessage = ChatResponseMessage;
    }

    /**
     * Get <p>聊天请求发送过程中的失败信息</p> 
     * @return ErrorInChat <p>聊天请求发送过程中的失败信息</p>
     */
    public String getErrorInChat() {
        return this.ErrorInChat;
    }

    /**
     * Set <p>聊天请求发送过程中的失败信息</p>
     * @param ErrorInChat <p>聊天请求发送过程中的失败信息</p>
     */
    public void setErrorInChat(String ErrorInChat) {
        this.ErrorInChat = ErrorInChat;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.ChatResponseMessage != null) {
            this.ChatResponseMessage = new String(source.ChatResponseMessage);
        }
        if (source.ErrorInChat != null) {
            this.ErrorInChat = new String(source.ErrorInChat);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChatResponseMessage", this.ChatResponseMessage);
        this.setParamSimple(map, prefix + "ErrorInChat", this.ErrorInChat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

