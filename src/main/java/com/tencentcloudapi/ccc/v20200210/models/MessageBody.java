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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageBody extends AbstractModel{

    /**
    * 消息时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 发消息的用户ID
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 消息列表
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
     * Get 消息时间戳 
     * @return Timestamp 消息时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 消息时间戳
     * @param Timestamp 消息时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 发消息的用户ID 
     * @return From 发消息的用户ID
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 发消息的用户ID
     * @param From 发消息的用户ID
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 消息列表 
     * @return Messages 消息列表
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 消息列表
     * @param Messages 消息列表
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    public MessageBody() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageBody(MessageBody source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);

    }
}

