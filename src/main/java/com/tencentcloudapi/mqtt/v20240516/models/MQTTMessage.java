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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTMessage extends AbstractModel {

    /**
    * 消息id
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 消息发送的客户端Id
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 消息服务质量等级
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 消息在服务端的存储时间，毫秒级时间戳
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * 源topic
    */
    @SerializedName("OriginTopic")
    @Expose
    private String OriginTopic;

    /**
     * Get 消息id 
     * @return MessageId 消息id
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息id
     * @param MessageId 消息id
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 消息发送的客户端Id 
     * @return ClientId 消息发送的客户端Id
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 消息发送的客户端Id
     * @param ClientId 消息发送的客户端Id
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 消息服务质量等级 
     * @return Qos 消息服务质量等级
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 消息服务质量等级
     * @param Qos 消息服务质量等级
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 消息在服务端的存储时间，毫秒级时间戳 
     * @return StoreTimestamp 消息在服务端的存储时间，毫秒级时间戳
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set 消息在服务端的存储时间，毫秒级时间戳
     * @param StoreTimestamp 消息在服务端的存储时间，毫秒级时间戳
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get 源topic 
     * @return OriginTopic 源topic
     */
    public String getOriginTopic() {
        return this.OriginTopic;
    }

    /**
     * Set 源topic
     * @param OriginTopic 源topic
     */
    public void setOriginTopic(String OriginTopic) {
        this.OriginTopic = OriginTopic;
    }

    public MQTTMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTMessage(MQTTMessage source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.StoreTimestamp != null) {
            this.StoreTimestamp = new Long(source.StoreTimestamp);
        }
        if (source.OriginTopic != null) {
            this.OriginTopic = new String(source.OriginTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "StoreTimestamp", this.StoreTimestamp);
        this.setParamSimple(map, prefix + "OriginTopic", this.OriginTopic);

    }
}

