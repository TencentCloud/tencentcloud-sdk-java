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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMessagesRequest extends AbstractModel{

    /**
    * Token 是用来做鉴权使用的
    */
    @SerializedName("StringToken")
    @Expose
    private String StringToken;

    /**
    * 消息要发送的topic的名字
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 要发送的消息的内容
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 设置 producer 的名字，要求全局唯一，用户不配置，系统会随机生成
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 设置消息发送的超时时间，默认为30s
    */
    @SerializedName("SendTimeout")
    @Expose
    private Long SendTimeout;

    /**
    * 内存中缓存的最大的生产消息的数量，默认为1000条
    */
    @SerializedName("MaxPendingMessages")
    @Expose
    private Long MaxPendingMessages;

    /**
     * Get Token 是用来做鉴权使用的 
     * @return StringToken Token 是用来做鉴权使用的
     */
    public String getStringToken() {
        return this.StringToken;
    }

    /**
     * Set Token 是用来做鉴权使用的
     * @param StringToken Token 是用来做鉴权使用的
     */
    public void setStringToken(String StringToken) {
        this.StringToken = StringToken;
    }

    /**
     * Get 消息要发送的topic的名字 
     * @return Topic 消息要发送的topic的名字
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 消息要发送的topic的名字
     * @param Topic 消息要发送的topic的名字
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 要发送的消息的内容 
     * @return Payload 要发送的消息的内容
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 要发送的消息的内容
     * @param Payload 要发送的消息的内容
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 设置 producer 的名字，要求全局唯一，用户不配置，系统会随机生成 
     * @return ProducerName 设置 producer 的名字，要求全局唯一，用户不配置，系统会随机生成
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 设置 producer 的名字，要求全局唯一，用户不配置，系统会随机生成
     * @param ProducerName 设置 producer 的名字，要求全局唯一，用户不配置，系统会随机生成
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 设置消息发送的超时时间，默认为30s 
     * @return SendTimeout 设置消息发送的超时时间，默认为30s
     */
    public Long getSendTimeout() {
        return this.SendTimeout;
    }

    /**
     * Set 设置消息发送的超时时间，默认为30s
     * @param SendTimeout 设置消息发送的超时时间，默认为30s
     */
    public void setSendTimeout(Long SendTimeout) {
        this.SendTimeout = SendTimeout;
    }

    /**
     * Get 内存中缓存的最大的生产消息的数量，默认为1000条 
     * @return MaxPendingMessages 内存中缓存的最大的生产消息的数量，默认为1000条
     */
    public Long getMaxPendingMessages() {
        return this.MaxPendingMessages;
    }

    /**
     * Set 内存中缓存的最大的生产消息的数量，默认为1000条
     * @param MaxPendingMessages 内存中缓存的最大的生产消息的数量，默认为1000条
     */
    public void setMaxPendingMessages(Long MaxPendingMessages) {
        this.MaxPendingMessages = MaxPendingMessages;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StringToken", this.StringToken);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "SendTimeout", this.SendTimeout);
        this.setParamSimple(map, prefix + "MaxPendingMessages", this.MaxPendingMessages);

    }
}

