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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

