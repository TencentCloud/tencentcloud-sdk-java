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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageItem extends AbstractModel{

    /**
    * 消息类型。0表示文本消息，1表示图片消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageType")
    @Expose
    private Long MessageType;

    /**
    * 文本消息内容。message type为0时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextMessage")
    @Expose
    private String TextMessage;

    /**
    * 图片消息URL。 message type为1时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageMessage")
    @Expose
    private String ImageMessage;

    /**
     * Get 消息类型。0表示文本消息，1表示图片消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageType 消息类型。0表示文本消息，1表示图片消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageType() {
        return this.MessageType;
    }

    /**
     * Set 消息类型。0表示文本消息，1表示图片消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageType 消息类型。0表示文本消息，1表示图片消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageType(Long MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get 文本消息内容。message type为0时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextMessage 文本消息内容。message type为0时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextMessage() {
        return this.TextMessage;
    }

    /**
     * Set 文本消息内容。message type为0时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextMessage 文本消息内容。message type为0时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextMessage(String TextMessage) {
        this.TextMessage = TextMessage;
    }

    /**
     * Get 图片消息URL。 message type为1时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageMessage 图片消息URL。 message type为1时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageMessage() {
        return this.ImageMessage;
    }

    /**
     * Set 图片消息URL。 message type为1时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageMessage 图片消息URL。 message type为1时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageMessage(String ImageMessage) {
        this.ImageMessage = ImageMessage;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "TextMessage", this.TextMessage);
        this.setParamSimple(map, prefix + "ImageMessage", this.ImageMessage);

    }
}

