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

public class CmqSubscription extends AbstractModel{

    /**
    * 订阅名字，在单个地域同一帐号的同一主题下唯一。订阅名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 订阅 ID。订阅 ID 在拉取监控数据时会用到。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionId")
    @Expose
    private String SubscriptionId;

    /**
    * 订阅拥有者的 APPID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicOwner")
    @Expose
    private Long TopicOwner;

    /**
    * 该订阅待投递的消息数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * 最后一次修改订阅属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * 订阅的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 表示订阅接收消息的过滤策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingKey")
    @Expose
    private String [] BindingKey;

    /**
    * 接收通知的 endpoint，根据协议 protocol 区分：对于 HTTP，endpoint 必须以http://开头，host 可以是域名或 IP；对于 queue，则填 queueName。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 描述用户创建订阅时选择的过滤策略：
filterType = 1表示用户使用 filterTag 标签过滤
filterType = 2表示用户使用 bindingKey 过滤。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * 订阅的协议，目前支持两种协议：HTTP、queue。使用 HTTP 协议，用户需自己搭建接受消息的 Web Server。使用 queue，消息会自动推送到 CMQ queue，用户可以并发地拉取消息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 向 endpoint 推送消息出现错误时，CMQ 推送服务器的重试策略。取值有：
（1）BACKOFF_RETRY，退避重试。每隔一定时间重试一次，重试够一定次数后，就把该消息丢弃，继续推送下一条消息；
（2）EXPONENTIAL_DECAY_RETRY，指数衰退重试。每次重试的间隔是指数递增的，例如开始 1s，后面是 2s，4s，8s...由于 Topic 消息的周期是一天，所以最多重试一天就把消息丢弃。默认值是 EXPONENTIAL_DECAY_RETRY。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * 推送内容的格式。取值：（1）JSON；（2）SIMPLIFIED，即 raw 格式。如果 protocol 是 queue，则取值必须为 SIMPLIFIED。如果 protocol 是 HTTP，两个值均可以，默认值是 JSON。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
     * Get 订阅名字，在单个地域同一帐号的同一主题下唯一。订阅名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionName 订阅名字，在单个地域同一帐号的同一主题下唯一。订阅名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 订阅名字，在单个地域同一帐号的同一主题下唯一。订阅名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionName 订阅名字，在单个地域同一帐号的同一主题下唯一。订阅名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 订阅 ID。订阅 ID 在拉取监控数据时会用到。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionId 订阅 ID。订阅 ID 在拉取监控数据时会用到。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscriptionId() {
        return this.SubscriptionId;
    }

    /**
     * Set 订阅 ID。订阅 ID 在拉取监控数据时会用到。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionId 订阅 ID。订阅 ID 在拉取监控数据时会用到。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionId(String SubscriptionId) {
        this.SubscriptionId = SubscriptionId;
    }

    /**
     * Get 订阅拥有者的 APPID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicOwner 订阅拥有者的 APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicOwner() {
        return this.TopicOwner;
    }

    /**
     * Set 订阅拥有者的 APPID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicOwner 订阅拥有者的 APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicOwner(Long TopicOwner) {
        this.TopicOwner = TopicOwner;
    }

    /**
     * Get 该订阅待投递的消息数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgCount 该订阅待投递的消息数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set 该订阅待投递的消息数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgCount 该订阅待投递的消息数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get 最后一次修改订阅属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime 最后一次修改订阅属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set 最后一次修改订阅属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime 最后一次修改订阅属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get 订阅的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 订阅的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 订阅的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 订阅的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 表示订阅接收消息的过滤策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingKey 表示订阅接收消息的过滤策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBindingKey() {
        return this.BindingKey;
    }

    /**
     * Set 表示订阅接收消息的过滤策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingKey 表示订阅接收消息的过滤策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingKey(String [] BindingKey) {
        this.BindingKey = BindingKey;
    }

    /**
     * Get 接收通知的 endpoint，根据协议 protocol 区分：对于 HTTP，endpoint 必须以http://开头，host 可以是域名或 IP；对于 queue，则填 queueName。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint 接收通知的 endpoint，根据协议 protocol 区分：对于 HTTP，endpoint 必须以http://开头，host 可以是域名或 IP；对于 queue，则填 queueName。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 接收通知的 endpoint，根据协议 protocol 区分：对于 HTTP，endpoint 必须以http://开头，host 可以是域名或 IP；对于 queue，则填 queueName。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint 接收通知的 endpoint，根据协议 protocol 区分：对于 HTTP，endpoint 必须以http://开头，host 可以是域名或 IP；对于 queue，则填 queueName。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 描述用户创建订阅时选择的过滤策略：
filterType = 1表示用户使用 filterTag 标签过滤
filterType = 2表示用户使用 bindingKey 过滤。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterTags 描述用户创建订阅时选择的过滤策略：
filterType = 1表示用户使用 filterTag 标签过滤
filterType = 2表示用户使用 bindingKey 过滤。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set 描述用户创建订阅时选择的过滤策略：
filterType = 1表示用户使用 filterTag 标签过滤
filterType = 2表示用户使用 bindingKey 过滤。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterTags 描述用户创建订阅时选择的过滤策略：
filterType = 1表示用户使用 filterTag 标签过滤
filterType = 2表示用户使用 bindingKey 过滤。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get 订阅的协议，目前支持两种协议：HTTP、queue。使用 HTTP 协议，用户需自己搭建接受消息的 Web Server。使用 queue，消息会自动推送到 CMQ queue，用户可以并发地拉取消息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 订阅的协议，目前支持两种协议：HTTP、queue。使用 HTTP 协议，用户需自己搭建接受消息的 Web Server。使用 queue，消息会自动推送到 CMQ queue，用户可以并发地拉取消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 订阅的协议，目前支持两种协议：HTTP、queue。使用 HTTP 协议，用户需自己搭建接受消息的 Web Server。使用 queue，消息会自动推送到 CMQ queue，用户可以并发地拉取消息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 订阅的协议，目前支持两种协议：HTTP、queue。使用 HTTP 协议，用户需自己搭建接受消息的 Web Server。使用 queue，消息会自动推送到 CMQ queue，用户可以并发地拉取消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 向 endpoint 推送消息出现错误时，CMQ 推送服务器的重试策略。取值有：
（1）BACKOFF_RETRY，退避重试。每隔一定时间重试一次，重试够一定次数后，就把该消息丢弃，继续推送下一条消息；
（2）EXPONENTIAL_DECAY_RETRY，指数衰退重试。每次重试的间隔是指数递增的，例如开始 1s，后面是 2s，4s，8s...由于 Topic 消息的周期是一天，所以最多重试一天就把消息丢弃。默认值是 EXPONENTIAL_DECAY_RETRY。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyStrategy 向 endpoint 推送消息出现错误时，CMQ 推送服务器的重试策略。取值有：
（1）BACKOFF_RETRY，退避重试。每隔一定时间重试一次，重试够一定次数后，就把该消息丢弃，继续推送下一条消息；
（2）EXPONENTIAL_DECAY_RETRY，指数衰退重试。每次重试的间隔是指数递增的，例如开始 1s，后面是 2s，4s，8s...由于 Topic 消息的周期是一天，所以最多重试一天就把消息丢弃。默认值是 EXPONENTIAL_DECAY_RETRY。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set 向 endpoint 推送消息出现错误时，CMQ 推送服务器的重试策略。取值有：
（1）BACKOFF_RETRY，退避重试。每隔一定时间重试一次，重试够一定次数后，就把该消息丢弃，继续推送下一条消息；
（2）EXPONENTIAL_DECAY_RETRY，指数衰退重试。每次重试的间隔是指数递增的，例如开始 1s，后面是 2s，4s，8s...由于 Topic 消息的周期是一天，所以最多重试一天就把消息丢弃。默认值是 EXPONENTIAL_DECAY_RETRY。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyStrategy 向 endpoint 推送消息出现错误时，CMQ 推送服务器的重试策略。取值有：
（1）BACKOFF_RETRY，退避重试。每隔一定时间重试一次，重试够一定次数后，就把该消息丢弃，继续推送下一条消息；
（2）EXPONENTIAL_DECAY_RETRY，指数衰退重试。每次重试的间隔是指数递增的，例如开始 1s，后面是 2s，4s，8s...由于 Topic 消息的周期是一天，所以最多重试一天就把消息丢弃。默认值是 EXPONENTIAL_DECAY_RETRY。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get 推送内容的格式。取值：（1）JSON；（2）SIMPLIFIED，即 raw 格式。如果 protocol 是 queue，则取值必须为 SIMPLIFIED。如果 protocol 是 HTTP，两个值均可以，默认值是 JSON。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyContentFormat 推送内容的格式。取值：（1）JSON；（2）SIMPLIFIED，即 raw 格式。如果 protocol 是 queue，则取值必须为 SIMPLIFIED。如果 protocol 是 HTTP，两个值均可以，默认值是 JSON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set 推送内容的格式。取值：（1）JSON；（2）SIMPLIFIED，即 raw 格式。如果 protocol 是 queue，则取值必须为 SIMPLIFIED。如果 protocol 是 HTTP，两个值均可以，默认值是 JSON。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyContentFormat 推送内容的格式。取值：（1）JSON；（2）SIMPLIFIED，即 raw 格式。如果 protocol 是 queue，则取值必须为 SIMPLIFIED。如果 protocol 是 HTTP，两个值均可以，默认值是 JSON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
    }

    public CmqSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqSubscription(CmqSubscription source) {
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.SubscriptionId != null) {
            this.SubscriptionId = new String(source.SubscriptionId);
        }
        if (source.TopicOwner != null) {
            this.TopicOwner = new Long(source.TopicOwner);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.BindingKey != null) {
            this.BindingKey = new String[source.BindingKey.length];
            for (int i = 0; i < source.BindingKey.length; i++) {
                this.BindingKey[i] = new String(source.BindingKey[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.FilterTags != null) {
            this.FilterTags = new String[source.FilterTags.length];
            for (int i = 0; i < source.FilterTags.length; i++) {
                this.FilterTags[i] = new String(source.FilterTags[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NotifyStrategy != null) {
            this.NotifyStrategy = new String(source.NotifyStrategy);
        }
        if (source.NotifyContentFormat != null) {
            this.NotifyContentFormat = new String(source.NotifyContentFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "SubscriptionId", this.SubscriptionId);
        this.setParamSimple(map, prefix + "TopicOwner", this.TopicOwner);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "BindingKey.", this.BindingKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "FilterTags.", this.FilterTags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NotifyStrategy", this.NotifyStrategy);
        this.setParamSimple(map, prefix + "NotifyContentFormat", this.NotifyContentFormat);

    }
}

