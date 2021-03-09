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

public class SendBatchMessagesRequest extends AbstractModel{

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 需要发送消息的内容
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * String 类型的 token，用来校验客户端和服务端之间的连接
    */
    @SerializedName("StringToken")
    @Expose
    private String StringToken;

    /**
    * producer 的名字，要求全局是唯一的，如果不设置，系统会自动生成
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 单位：s。消息发送的超时时间。默认值为：30s
    */
    @SerializedName("SendTimeout")
    @Expose
    private Long SendTimeout;

    /**
    * 内存中允许缓存的生产消息的最大数量，默认值：1000条
    */
    @SerializedName("MaxPendingMessages")
    @Expose
    private Long MaxPendingMessages;

    /**
    * 每一个batch中消息的最大数量，默认值：1000条/batch
    */
    @SerializedName("BatchingMaxMessages")
    @Expose
    private Long BatchingMaxMessages;

    /**
    * 每一个batch最大等待的时间，超过这个时间，不管是否达到指定的batch中消息的数量和大小，都会将该batch发送出去，默认：10ms
    */
    @SerializedName("BatchingMaxPublishDelay")
    @Expose
    private Long BatchingMaxPublishDelay;

    /**
    * 每一个batch中最大允许的消息的大小，默认：128KB
    */
    @SerializedName("BatchingMaxBytes")
    @Expose
    private Long BatchingMaxBytes;

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 需要发送消息的内容 
     * @return Payload 需要发送消息的内容
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 需要发送消息的内容
     * @param Payload 需要发送消息的内容
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get String 类型的 token，用来校验客户端和服务端之间的连接 
     * @return StringToken String 类型的 token，用来校验客户端和服务端之间的连接
     */
    public String getStringToken() {
        return this.StringToken;
    }

    /**
     * Set String 类型的 token，用来校验客户端和服务端之间的连接
     * @param StringToken String 类型的 token，用来校验客户端和服务端之间的连接
     */
    public void setStringToken(String StringToken) {
        this.StringToken = StringToken;
    }

    /**
     * Get producer 的名字，要求全局是唯一的，如果不设置，系统会自动生成 
     * @return ProducerName producer 的名字，要求全局是唯一的，如果不设置，系统会自动生成
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set producer 的名字，要求全局是唯一的，如果不设置，系统会自动生成
     * @param ProducerName producer 的名字，要求全局是唯一的，如果不设置，系统会自动生成
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 单位：s。消息发送的超时时间。默认值为：30s 
     * @return SendTimeout 单位：s。消息发送的超时时间。默认值为：30s
     */
    public Long getSendTimeout() {
        return this.SendTimeout;
    }

    /**
     * Set 单位：s。消息发送的超时时间。默认值为：30s
     * @param SendTimeout 单位：s。消息发送的超时时间。默认值为：30s
     */
    public void setSendTimeout(Long SendTimeout) {
        this.SendTimeout = SendTimeout;
    }

    /**
     * Get 内存中允许缓存的生产消息的最大数量，默认值：1000条 
     * @return MaxPendingMessages 内存中允许缓存的生产消息的最大数量，默认值：1000条
     */
    public Long getMaxPendingMessages() {
        return this.MaxPendingMessages;
    }

    /**
     * Set 内存中允许缓存的生产消息的最大数量，默认值：1000条
     * @param MaxPendingMessages 内存中允许缓存的生产消息的最大数量，默认值：1000条
     */
    public void setMaxPendingMessages(Long MaxPendingMessages) {
        this.MaxPendingMessages = MaxPendingMessages;
    }

    /**
     * Get 每一个batch中消息的最大数量，默认值：1000条/batch 
     * @return BatchingMaxMessages 每一个batch中消息的最大数量，默认值：1000条/batch
     */
    public Long getBatchingMaxMessages() {
        return this.BatchingMaxMessages;
    }

    /**
     * Set 每一个batch中消息的最大数量，默认值：1000条/batch
     * @param BatchingMaxMessages 每一个batch中消息的最大数量，默认值：1000条/batch
     */
    public void setBatchingMaxMessages(Long BatchingMaxMessages) {
        this.BatchingMaxMessages = BatchingMaxMessages;
    }

    /**
     * Get 每一个batch最大等待的时间，超过这个时间，不管是否达到指定的batch中消息的数量和大小，都会将该batch发送出去，默认：10ms 
     * @return BatchingMaxPublishDelay 每一个batch最大等待的时间，超过这个时间，不管是否达到指定的batch中消息的数量和大小，都会将该batch发送出去，默认：10ms
     */
    public Long getBatchingMaxPublishDelay() {
        return this.BatchingMaxPublishDelay;
    }

    /**
     * Set 每一个batch最大等待的时间，超过这个时间，不管是否达到指定的batch中消息的数量和大小，都会将该batch发送出去，默认：10ms
     * @param BatchingMaxPublishDelay 每一个batch最大等待的时间，超过这个时间，不管是否达到指定的batch中消息的数量和大小，都会将该batch发送出去，默认：10ms
     */
    public void setBatchingMaxPublishDelay(Long BatchingMaxPublishDelay) {
        this.BatchingMaxPublishDelay = BatchingMaxPublishDelay;
    }

    /**
     * Get 每一个batch中最大允许的消息的大小，默认：128KB 
     * @return BatchingMaxBytes 每一个batch中最大允许的消息的大小，默认：128KB
     */
    public Long getBatchingMaxBytes() {
        return this.BatchingMaxBytes;
    }

    /**
     * Set 每一个batch中最大允许的消息的大小，默认：128KB
     * @param BatchingMaxBytes 每一个batch中最大允许的消息的大小，默认：128KB
     */
    public void setBatchingMaxBytes(Long BatchingMaxBytes) {
        this.BatchingMaxBytes = BatchingMaxBytes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "StringToken", this.StringToken);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "SendTimeout", this.SendTimeout);
        this.setParamSimple(map, prefix + "MaxPendingMessages", this.MaxPendingMessages);
        this.setParamSimple(map, prefix + "BatchingMaxMessages", this.BatchingMaxMessages);
        this.setParamSimple(map, prefix + "BatchingMaxPublishDelay", this.BatchingMaxPublishDelay);
        this.setParamSimple(map, prefix + "BatchingMaxBytes", this.BatchingMaxBytes);

    }
}

