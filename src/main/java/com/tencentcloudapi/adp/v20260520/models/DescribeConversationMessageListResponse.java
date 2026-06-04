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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConversationMessageListResponse extends AbstractModel {

    /**
    * <p>第一个记录 ID</p>
    */
    @SerializedName("FirstRecordId")
    @Expose
    private String FirstRecordId;

    /**
    * <p>更新消息方向是否还有更多</p>
    */
    @SerializedName("HasMoreAfter")
    @Expose
    private Boolean HasMoreAfter;

    /**
    * <p>更早消息方向是否还有更多</p>
    */
    @SerializedName("HasMoreBefore")
    @Expose
    private Boolean HasMoreBefore;

    /**
    * <p>最后一个记录 ID</p>
    */
    @SerializedName("LastRecordId")
    @Expose
    private String LastRecordId;

    /**
    * <p>消息列表</p>
    */
    @SerializedName("MessageList")
    @Expose
    private ConversationMessage [] MessageList;

    /**
    * <p>消息列表</p>
    */
    @SerializedName("Messages")
    @Expose
    private ConversationMessage [] Messages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>第一个记录 ID</p> 
     * @return FirstRecordId <p>第一个记录 ID</p>
     */
    public String getFirstRecordId() {
        return this.FirstRecordId;
    }

    /**
     * Set <p>第一个记录 ID</p>
     * @param FirstRecordId <p>第一个记录 ID</p>
     */
    public void setFirstRecordId(String FirstRecordId) {
        this.FirstRecordId = FirstRecordId;
    }

    /**
     * Get <p>更新消息方向是否还有更多</p> 
     * @return HasMoreAfter <p>更新消息方向是否还有更多</p>
     */
    public Boolean getHasMoreAfter() {
        return this.HasMoreAfter;
    }

    /**
     * Set <p>更新消息方向是否还有更多</p>
     * @param HasMoreAfter <p>更新消息方向是否还有更多</p>
     */
    public void setHasMoreAfter(Boolean HasMoreAfter) {
        this.HasMoreAfter = HasMoreAfter;
    }

    /**
     * Get <p>更早消息方向是否还有更多</p> 
     * @return HasMoreBefore <p>更早消息方向是否还有更多</p>
     */
    public Boolean getHasMoreBefore() {
        return this.HasMoreBefore;
    }

    /**
     * Set <p>更早消息方向是否还有更多</p>
     * @param HasMoreBefore <p>更早消息方向是否还有更多</p>
     */
    public void setHasMoreBefore(Boolean HasMoreBefore) {
        this.HasMoreBefore = HasMoreBefore;
    }

    /**
     * Get <p>最后一个记录 ID</p> 
     * @return LastRecordId <p>最后一个记录 ID</p>
     */
    public String getLastRecordId() {
        return this.LastRecordId;
    }

    /**
     * Set <p>最后一个记录 ID</p>
     * @param LastRecordId <p>最后一个记录 ID</p>
     */
    public void setLastRecordId(String LastRecordId) {
        this.LastRecordId = LastRecordId;
    }

    /**
     * Get <p>消息列表</p> 
     * @return MessageList <p>消息列表</p>
     */
    public ConversationMessage [] getMessageList() {
        return this.MessageList;
    }

    /**
     * Set <p>消息列表</p>
     * @param MessageList <p>消息列表</p>
     */
    public void setMessageList(ConversationMessage [] MessageList) {
        this.MessageList = MessageList;
    }

    /**
     * Get <p>消息列表</p> 
     * @return Messages <p>消息列表</p>
     */
    public ConversationMessage [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>消息列表</p>
     * @param Messages <p>消息列表</p>
     */
    public void setMessages(ConversationMessage [] Messages) {
        this.Messages = Messages;
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

    public DescribeConversationMessageListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConversationMessageListResponse(DescribeConversationMessageListResponse source) {
        if (source.FirstRecordId != null) {
            this.FirstRecordId = new String(source.FirstRecordId);
        }
        if (source.HasMoreAfter != null) {
            this.HasMoreAfter = new Boolean(source.HasMoreAfter);
        }
        if (source.HasMoreBefore != null) {
            this.HasMoreBefore = new Boolean(source.HasMoreBefore);
        }
        if (source.LastRecordId != null) {
            this.LastRecordId = new String(source.LastRecordId);
        }
        if (source.MessageList != null) {
            this.MessageList = new ConversationMessage[source.MessageList.length];
            for (int i = 0; i < source.MessageList.length; i++) {
                this.MessageList[i] = new ConversationMessage(source.MessageList[i]);
            }
        }
        if (source.Messages != null) {
            this.Messages = new ConversationMessage[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new ConversationMessage(source.Messages[i]);
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
        this.setParamSimple(map, prefix + "FirstRecordId", this.FirstRecordId);
        this.setParamSimple(map, prefix + "HasMoreAfter", this.HasMoreAfter);
        this.setParamSimple(map, prefix + "HasMoreBefore", this.HasMoreBefore);
        this.setParamSimple(map, prefix + "LastRecordId", this.LastRecordId);
        this.setParamArrayObj(map, prefix + "MessageList.", this.MessageList);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

