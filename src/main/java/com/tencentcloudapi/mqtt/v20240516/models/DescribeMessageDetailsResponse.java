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

public class DescribeMessageDetailsResponse extends AbstractModel {

    /**
    * <p>消息体</p>
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * <p>用户自定义属性</p>
    */
    @SerializedName("UserProperties")
    @Expose
    private UserProperty [] UserProperties;

    /**
    * <p>消息存储时间，毫秒级时间戳。</p>
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * <p>消息ID</p>
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>生产者地址</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>Topic</p>
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * <p>源topic</p>
    */
    @SerializedName("OriginTopic")
    @Expose
    private String OriginTopic;

    /**
    * <p>内容类型（MQTT5）<br>含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。<br>示例：<br>application/json：表示载荷是 JSON 格式的数据。<br>text/plain：表示载荷是纯文本。<br>application/octet-stream：表示载荷是二进制数据。</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>载荷格式指示符（MQTT5）<br>含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。<br>示例：<br>值为0：当载荷是二进制数据，如图片、音频等。<br>值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。</p>
    */
    @SerializedName("PayloadFormatIndicator")
    @Expose
    private Long PayloadFormatIndicator;

    /**
    * <p>消息过期间隔（MQTT5）<br>含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。<br>示例：<br>值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。<br>值为0：表示消息不过期，永久有效（直到被接收或会话结束）。</p>
    */
    @SerializedName("MessageExpiryInterval")
    @Expose
    private Long MessageExpiryInterval;

    /**
    * <p>响应主题（MQTT5）<br>含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。<br>示例：<br>发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。<br>接收方处理请求后，将响应发布到devices/device1/responses主题。</p>
    */
    @SerializedName("ResponseTopic")
    @Expose
    private String ResponseTopic;

    /**
    * <p>关联数据（MQTT5）<br>含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。<br>示例：<br>发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。<br>接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。</p>
    */
    @SerializedName("CorrelationData")
    @Expose
    private String CorrelationData;

    /**
    * <p>订阅标识符（MQTT5）<br>含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。<br>示例：<br>客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。<br>当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。</p>
    */
    @SerializedName("SubscriptionIdentifier")
    @Expose
    private String SubscriptionIdentifier;

    /**
    * <p>是否保留消息</p>
    */
    @SerializedName("Retain")
    @Expose
    private Boolean Retain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>消息体</p> 
     * @return Body <p>消息体</p>
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set <p>消息体</p>
     * @param Body <p>消息体</p>
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get <p>用户自定义属性</p> 
     * @return UserProperties <p>用户自定义属性</p>
     */
    public UserProperty [] getUserProperties() {
        return this.UserProperties;
    }

    /**
     * Set <p>用户自定义属性</p>
     * @param UserProperties <p>用户自定义属性</p>
     */
    public void setUserProperties(UserProperty [] UserProperties) {
        this.UserProperties = UserProperties;
    }

    /**
     * Get <p>消息存储时间，毫秒级时间戳。</p> 
     * @return StoreTimestamp <p>消息存储时间，毫秒级时间戳。</p>
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set <p>消息存储时间，毫秒级时间戳。</p>
     * @param StoreTimestamp <p>消息存储时间，毫秒级时间戳。</p>
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get <p>消息ID</p> 
     * @return MessageId <p>消息ID</p>
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>消息ID</p>
     * @param MessageId <p>消息ID</p>
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>生产者地址</p> 
     * @return ClientId <p>生产者地址</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>生产者地址</p>
     * @param ClientId <p>生产者地址</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>Topic</p> 
     * @return Qos <p>Topic</p>
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set <p>Topic</p>
     * @param Qos <p>Topic</p>
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>源topic</p> 
     * @return OriginTopic <p>源topic</p>
     */
    public String getOriginTopic() {
        return this.OriginTopic;
    }

    /**
     * Set <p>源topic</p>
     * @param OriginTopic <p>源topic</p>
     */
    public void setOriginTopic(String OriginTopic) {
        this.OriginTopic = OriginTopic;
    }

    /**
     * Get <p>内容类型（MQTT5）<br>含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。<br>示例：<br>application/json：表示载荷是 JSON 格式的数据。<br>text/plain：表示载荷是纯文本。<br>application/octet-stream：表示载荷是二进制数据。</p> 
     * @return ContentType <p>内容类型（MQTT5）<br>含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。<br>示例：<br>application/json：表示载荷是 JSON 格式的数据。<br>text/plain：表示载荷是纯文本。<br>application/octet-stream：表示载荷是二进制数据。</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>内容类型（MQTT5）<br>含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。<br>示例：<br>application/json：表示载荷是 JSON 格式的数据。<br>text/plain：表示载荷是纯文本。<br>application/octet-stream：表示载荷是二进制数据。</p>
     * @param ContentType <p>内容类型（MQTT5）<br>含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。<br>示例：<br>application/json：表示载荷是 JSON 格式的数据。<br>text/plain：表示载荷是纯文本。<br>application/octet-stream：表示载荷是二进制数据。</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>载荷格式指示符（MQTT5）<br>含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。<br>示例：<br>值为0：当载荷是二进制数据，如图片、音频等。<br>值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。</p> 
     * @return PayloadFormatIndicator <p>载荷格式指示符（MQTT5）<br>含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。<br>示例：<br>值为0：当载荷是二进制数据，如图片、音频等。<br>值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。</p>
     */
    public Long getPayloadFormatIndicator() {
        return this.PayloadFormatIndicator;
    }

    /**
     * Set <p>载荷格式指示符（MQTT5）<br>含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。<br>示例：<br>值为0：当载荷是二进制数据，如图片、音频等。<br>值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。</p>
     * @param PayloadFormatIndicator <p>载荷格式指示符（MQTT5）<br>含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。<br>示例：<br>值为0：当载荷是二进制数据，如图片、音频等。<br>值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。</p>
     */
    public void setPayloadFormatIndicator(Long PayloadFormatIndicator) {
        this.PayloadFormatIndicator = PayloadFormatIndicator;
    }

    /**
     * Get <p>消息过期间隔（MQTT5）<br>含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。<br>示例：<br>值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。<br>值为0：表示消息不过期，永久有效（直到被接收或会话结束）。</p> 
     * @return MessageExpiryInterval <p>消息过期间隔（MQTT5）<br>含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。<br>示例：<br>值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。<br>值为0：表示消息不过期，永久有效（直到被接收或会话结束）。</p>
     */
    public Long getMessageExpiryInterval() {
        return this.MessageExpiryInterval;
    }

    /**
     * Set <p>消息过期间隔（MQTT5）<br>含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。<br>示例：<br>值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。<br>值为0：表示消息不过期，永久有效（直到被接收或会话结束）。</p>
     * @param MessageExpiryInterval <p>消息过期间隔（MQTT5）<br>含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。<br>示例：<br>值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。<br>值为0：表示消息不过期，永久有效（直到被接收或会话结束）。</p>
     */
    public void setMessageExpiryInterval(Long MessageExpiryInterval) {
        this.MessageExpiryInterval = MessageExpiryInterval;
    }

    /**
     * Get <p>响应主题（MQTT5）<br>含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。<br>示例：<br>发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。<br>接收方处理请求后，将响应发布到devices/device1/responses主题。</p> 
     * @return ResponseTopic <p>响应主题（MQTT5）<br>含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。<br>示例：<br>发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。<br>接收方处理请求后，将响应发布到devices/device1/responses主题。</p>
     */
    public String getResponseTopic() {
        return this.ResponseTopic;
    }

    /**
     * Set <p>响应主题（MQTT5）<br>含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。<br>示例：<br>发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。<br>接收方处理请求后，将响应发布到devices/device1/responses主题。</p>
     * @param ResponseTopic <p>响应主题（MQTT5）<br>含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。<br>示例：<br>发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。<br>接收方处理请求后，将响应发布到devices/device1/responses主题。</p>
     */
    public void setResponseTopic(String ResponseTopic) {
        this.ResponseTopic = ResponseTopic;
    }

    /**
     * Get <p>关联数据（MQTT5）<br>含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。<br>示例：<br>发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。<br>接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。</p> 
     * @return CorrelationData <p>关联数据（MQTT5）<br>含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。<br>示例：<br>发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。<br>接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。</p>
     */
    public String getCorrelationData() {
        return this.CorrelationData;
    }

    /**
     * Set <p>关联数据（MQTT5）<br>含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。<br>示例：<br>发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。<br>接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。</p>
     * @param CorrelationData <p>关联数据（MQTT5）<br>含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。<br>示例：<br>发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。<br>接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。</p>
     */
    public void setCorrelationData(String CorrelationData) {
        this.CorrelationData = CorrelationData;
    }

    /**
     * Get <p>订阅标识符（MQTT5）<br>含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。<br>示例：<br>客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。<br>当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。</p> 
     * @return SubscriptionIdentifier <p>订阅标识符（MQTT5）<br>含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。<br>示例：<br>客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。<br>当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。</p>
     */
    public String getSubscriptionIdentifier() {
        return this.SubscriptionIdentifier;
    }

    /**
     * Set <p>订阅标识符（MQTT5）<br>含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。<br>示例：<br>客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。<br>当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。</p>
     * @param SubscriptionIdentifier <p>订阅标识符（MQTT5）<br>含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。<br>示例：<br>客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。<br>当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。</p>
     */
    public void setSubscriptionIdentifier(String SubscriptionIdentifier) {
        this.SubscriptionIdentifier = SubscriptionIdentifier;
    }

    /**
     * Get <p>是否保留消息</p> 
     * @return Retain <p>是否保留消息</p>
     */
    public Boolean getRetain() {
        return this.Retain;
    }

    /**
     * Set <p>是否保留消息</p>
     * @param Retain <p>是否保留消息</p>
     */
    public void setRetain(Boolean Retain) {
        this.Retain = Retain;
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

    public DescribeMessageDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageDetailsResponse(DescribeMessageDetailsResponse source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.UserProperties != null) {
            this.UserProperties = new UserProperty[source.UserProperties.length];
            for (int i = 0; i < source.UserProperties.length; i++) {
                this.UserProperties[i] = new UserProperty(source.UserProperties[i]);
            }
        }
        if (source.StoreTimestamp != null) {
            this.StoreTimestamp = new Long(source.StoreTimestamp);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.OriginTopic != null) {
            this.OriginTopic = new String(source.OriginTopic);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.PayloadFormatIndicator != null) {
            this.PayloadFormatIndicator = new Long(source.PayloadFormatIndicator);
        }
        if (source.MessageExpiryInterval != null) {
            this.MessageExpiryInterval = new Long(source.MessageExpiryInterval);
        }
        if (source.ResponseTopic != null) {
            this.ResponseTopic = new String(source.ResponseTopic);
        }
        if (source.CorrelationData != null) {
            this.CorrelationData = new String(source.CorrelationData);
        }
        if (source.SubscriptionIdentifier != null) {
            this.SubscriptionIdentifier = new String(source.SubscriptionIdentifier);
        }
        if (source.Retain != null) {
            this.Retain = new Boolean(source.Retain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArrayObj(map, prefix + "UserProperties.", this.UserProperties);
        this.setParamSimple(map, prefix + "StoreTimestamp", this.StoreTimestamp);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "OriginTopic", this.OriginTopic);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "PayloadFormatIndicator", this.PayloadFormatIndicator);
        this.setParamSimple(map, prefix + "MessageExpiryInterval", this.MessageExpiryInterval);
        this.setParamSimple(map, prefix + "ResponseTopic", this.ResponseTopic);
        this.setParamSimple(map, prefix + "CorrelationData", this.CorrelationData);
        this.setParamSimple(map, prefix + "SubscriptionIdentifier", this.SubscriptionIdentifier);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

