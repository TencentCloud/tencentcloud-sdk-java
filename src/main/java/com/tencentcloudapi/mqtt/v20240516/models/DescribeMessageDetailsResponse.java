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
    * 消息体
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 用户自定义属性
    */
    @SerializedName("UserProperties")
    @Expose
    private UserProperty [] UserProperties;

    /**
    * 消息存储时间，毫秒级时间戳。
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * 消息ID
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 生产者地址
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Topic
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * 源topic
    */
    @SerializedName("OriginTopic")
    @Expose
    private String OriginTopic;

    /**
    * 内容类型（MQTT5）
含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。
示例：
application/json：表示载荷是 JSON 格式的数据。
text/plain：表示载荷是纯文本。
application/octet-stream：表示载荷是二进制数据。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 载荷格式指示符（MQTT5）
含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。
示例：
值为0：当载荷是二进制数据，如图片、音频等。
值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。
    */
    @SerializedName("PayloadFormatIndicator")
    @Expose
    private Long PayloadFormatIndicator;

    /**
    * 消息过期间隔（MQTT5）
含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。
示例：
值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。
值为0：表示消息不过期，永久有效（直到被接收或会话结束）。
    */
    @SerializedName("MessageExpiryInterval")
    @Expose
    private Long MessageExpiryInterval;

    /**
    * 响应主题（MQTT5）
含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。
示例：
发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。
接收方处理请求后，将响应发布到devices/device1/responses主题。
    */
    @SerializedName("ResponseTopic")
    @Expose
    private String ResponseTopic;

    /**
    * 关联数据（MQTT5）
含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。
示例：
发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。
接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。
    */
    @SerializedName("CorrelationData")
    @Expose
    private String CorrelationData;

    /**
    * 订阅标识符（MQTT5）
含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。
示例：
客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。
当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。
    */
    @SerializedName("SubscriptionIdentifier")
    @Expose
    private String SubscriptionIdentifier;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消息体 
     * @return Body 消息体
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 消息体
     * @param Body 消息体
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 用户自定义属性 
     * @return UserProperties 用户自定义属性
     */
    public UserProperty [] getUserProperties() {
        return this.UserProperties;
    }

    /**
     * Set 用户自定义属性
     * @param UserProperties 用户自定义属性
     */
    public void setUserProperties(UserProperty [] UserProperties) {
        this.UserProperties = UserProperties;
    }

    /**
     * Get 消息存储时间，毫秒级时间戳。 
     * @return StoreTimestamp 消息存储时间，毫秒级时间戳。
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set 消息存储时间，毫秒级时间戳。
     * @param StoreTimestamp 消息存储时间，毫秒级时间戳。
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get 消息ID 
     * @return MessageId 消息ID
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息ID
     * @param MessageId 消息ID
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 生产者地址 
     * @return ClientId 生产者地址
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 生产者地址
     * @param ClientId 生产者地址
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Topic 
     * @return Qos Topic
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set Topic
     * @param Qos Topic
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
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

    /**
     * Get 内容类型（MQTT5）
含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。
示例：
application/json：表示载荷是 JSON 格式的数据。
text/plain：表示载荷是纯文本。
application/octet-stream：表示载荷是二进制数据。 
     * @return ContentType 内容类型（MQTT5）
含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。
示例：
application/json：表示载荷是 JSON 格式的数据。
text/plain：表示载荷是纯文本。
application/octet-stream：表示载荷是二进制数据。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容类型（MQTT5）
含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。
示例：
application/json：表示载荷是 JSON 格式的数据。
text/plain：表示载荷是纯文本。
application/octet-stream：表示载荷是二进制数据。
     * @param ContentType 内容类型（MQTT5）
含义：指示消息载荷的内容类型，使用标准的 MIME 类型格式。这帮助接收方正确解析和处理消息内容。
示例：
application/json：表示载荷是 JSON 格式的数据。
text/plain：表示载荷是纯文本。
application/octet-stream：表示载荷是二进制数据。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 载荷格式指示符（MQTT5）
含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。
示例：
值为0：当载荷是二进制数据，如图片、音频等。
值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。 
     * @return PayloadFormatIndicator 载荷格式指示符（MQTT5）
含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。
示例：
值为0：当载荷是二进制数据，如图片、音频等。
值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。
     */
    public Long getPayloadFormatIndicator() {
        return this.PayloadFormatIndicator;
    }

    /**
     * Set 载荷格式指示符（MQTT5）
含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。
示例：
值为0：当载荷是二进制数据，如图片、音频等。
值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。
     * @param PayloadFormatIndicator 载荷格式指示符（MQTT5）
含义：指示载荷的格式，是一个布尔值。0表示未指定格式（二进制），1表示 UTF-8 编码的字符串。
示例：
值为0：当载荷是二进制数据，如图片、音频等。
值为1：当载荷是 UTF-8 编码的文本，如 JSON 字符串、XML 等。
     */
    public void setPayloadFormatIndicator(Long PayloadFormatIndicator) {
        this.PayloadFormatIndicator = PayloadFormatIndicator;
    }

    /**
     * Get 消息过期间隔（MQTT5）
含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。
示例：
值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。
值为0：表示消息不过期，永久有效（直到被接收或会话结束）。 
     * @return MessageExpiryInterval 消息过期间隔（MQTT5）
含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。
示例：
值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。
值为0：表示消息不过期，永久有效（直到被接收或会话结束）。
     */
    public Long getMessageExpiryInterval() {
        return this.MessageExpiryInterval;
    }

    /**
     * Set 消息过期间隔（MQTT5）
含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。
示例：
值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。
值为0：表示消息不过期，永久有效（直到被接收或会话结束）。
     * @param MessageExpiryInterval 消息过期间隔（MQTT5）
含义：指定消息在被丢弃前的有效时间（秒）。如果消息在过期前未能送达，则会被 MQTT 服务器丢弃。
示例：
值为60：表示消息在发布后的 60 秒内有效，过期后未送达则被丢弃。
值为0：表示消息不过期，永久有效（直到被接收或会话结束）。
     */
    public void setMessageExpiryInterval(Long MessageExpiryInterval) {
        this.MessageExpiryInterval = MessageExpiryInterval;
    }

    /**
     * Get 响应主题（MQTT5）
含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。
示例：
发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。
接收方处理请求后，将响应发布到devices/device1/responses主题。 
     * @return ResponseTopic 响应主题（MQTT5）
含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。
示例：
发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。
接收方处理请求后，将响应发布到devices/device1/responses主题。
     */
    public String getResponseTopic() {
        return this.ResponseTopic;
    }

    /**
     * Set 响应主题（MQTT5）
含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。
示例：
发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。
接收方处理请求后，将响应发布到devices/device1/responses主题。
     * @param ResponseTopic 响应主题（MQTT5）
含义：指定一个主题，用于请求 - 响应模式中的响应消息。发送方可以指定接收方应该将响应发送到哪个主题。
示例：
发送方发布请求到主题devices/device1/commands，并设置ResponseTopic为devices/device1/responses。
接收方处理请求后，将响应发布到devices/device1/responses主题。
     */
    public void setResponseTopic(String ResponseTopic) {
        this.ResponseTopic = ResponseTopic;
    }

    /**
     * Get 关联数据（MQTT5）
含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。
示例：
发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。
接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。 
     * @return CorrelationData 关联数据（MQTT5）
含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。
示例：
发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。
接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。
     */
    public String getCorrelationData() {
        return this.CorrelationData;
    }

    /**
     * Set 关联数据（MQTT5）
含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。
示例：
发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。
接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。
     * @param CorrelationData 关联数据（MQTT5）
含义：用于关联请求和响应的标识符，通常是一个字节数组。在请求 - 响应模式中，发送方设置此值，接收方在响应中包含相同的值，以便发送方识别响应对应的请求。
示例：
发送方生成一个唯一 ID（如 UUID 的字节数组）作为CorrelationData，附加到请求消息中。
接收方在响应消息中包含相同的CorrelationData，发送方通过比较此值来匹配响应和请求。
     */
    public void setCorrelationData(String CorrelationData) {
        this.CorrelationData = CorrelationData;
    }

    /**
     * Get 订阅标识符（MQTT5）
含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。
示例：
客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。
当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。 
     * @return SubscriptionIdentifier 订阅标识符（MQTT5）
含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。
示例：
客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。
当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。
     */
    public String getSubscriptionIdentifier() {
        return this.SubscriptionIdentifier;
    }

    /**
     * Set 订阅标识符（MQTT5）
含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。
示例：
客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。
当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。
     * @param SubscriptionIdentifier 订阅标识符（MQTT5）
含义：为订阅分配的唯一标识符，用于标识客户端的特定订阅。当服务器向客户端发送消息时，可以包含此标识符，帮助客户端识别消息对应的订阅。
示例：
客户端订阅主题devices/+/temperature，并设置SubscriptionIdentifier为123。
当服务器向客户端发送此主题的消息时，会在消息中包含SubscriptionIdentifier: 123，客户端可以根据此值知道消息是通过哪个订阅接收的。
     */
    public void setSubscriptionIdentifier(String SubscriptionIdentifier) {
        this.SubscriptionIdentifier = SubscriptionIdentifier;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

