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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageItem extends AbstractModel {

    /**
    * 消息类型。0表示文本消息，1表示图片消息
    */
    @SerializedName("MessageType")
    @Expose
    private Long MessageType;

    /**
    * 文本消息内容。message type为0时有效。
    */
    @SerializedName("TextMessage")
    @Expose
    private String TextMessage;

    /**
    * 图片消息URL。 message type为1时有效。
    */
    @SerializedName("ImageMessage")
    @Expose
    private String ImageMessage;

    /**
    * 自定义消息内容。message type为2时有效。
    */
    @SerializedName("CustomMessage")
    @Expose
    private CustomMsgContent CustomMessage;

    /**
     * Get 消息类型。0表示文本消息，1表示图片消息 
     * @return MessageType 消息类型。0表示文本消息，1表示图片消息
     */
    public Long getMessageType() {
        return this.MessageType;
    }

    /**
     * Set 消息类型。0表示文本消息，1表示图片消息
     * @param MessageType 消息类型。0表示文本消息，1表示图片消息
     */
    public void setMessageType(Long MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get 文本消息内容。message type为0时有效。 
     * @return TextMessage 文本消息内容。message type为0时有效。
     */
    public String getTextMessage() {
        return this.TextMessage;
    }

    /**
     * Set 文本消息内容。message type为0时有效。
     * @param TextMessage 文本消息内容。message type为0时有效。
     */
    public void setTextMessage(String TextMessage) {
        this.TextMessage = TextMessage;
    }

    /**
     * Get 图片消息URL。 message type为1时有效。 
     * @return ImageMessage 图片消息URL。 message type为1时有效。
     */
    public String getImageMessage() {
        return this.ImageMessage;
    }

    /**
     * Set 图片消息URL。 message type为1时有效。
     * @param ImageMessage 图片消息URL。 message type为1时有效。
     */
    public void setImageMessage(String ImageMessage) {
        this.ImageMessage = ImageMessage;
    }

    /**
     * Get 自定义消息内容。message type为2时有效。 
     * @return CustomMessage 自定义消息内容。message type为2时有效。
     */
    public CustomMsgContent getCustomMessage() {
        return this.CustomMessage;
    }

    /**
     * Set 自定义消息内容。message type为2时有效。
     * @param CustomMessage 自定义消息内容。message type为2时有效。
     */
    public void setCustomMessage(CustomMsgContent CustomMessage) {
        this.CustomMessage = CustomMessage;
    }

    public MessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageItem(MessageItem source) {
        if (source.MessageType != null) {
            this.MessageType = new Long(source.MessageType);
        }
        if (source.TextMessage != null) {
            this.TextMessage = new String(source.TextMessage);
        }
        if (source.ImageMessage != null) {
            this.ImageMessage = new String(source.ImageMessage);
        }
        if (source.CustomMessage != null) {
            this.CustomMessage = new CustomMsgContent(source.CustomMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "TextMessage", this.TextMessage);
        this.setParamSimple(map, prefix + "ImageMessage", this.ImageMessage);
        this.setParamObj(map, prefix + "CustomMessage.", this.CustomMessage);

    }
}

