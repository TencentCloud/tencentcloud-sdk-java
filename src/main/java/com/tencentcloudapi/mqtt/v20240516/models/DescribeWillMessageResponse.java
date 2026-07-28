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

public class DescribeWillMessageResponse extends AbstractModel {

    /**
    * <p>保留消息Topic</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>消息服务质量</p>
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * <p>是否保留消息</p>
    */
    @SerializedName("Retained")
    @Expose
    private Boolean Retained;

    /**
    * <p>消息负载(Base64编码)</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>创建时间，毫秒级时间戳 。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间，毫秒级时间戳 。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>遗嘱消息延迟时间，单位秒</p>
    */
    @SerializedName("WillDelayInterval")
    @Expose
    private Long WillDelayInterval;

    /**
    * <p>响应内容类型</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>响应主题</p>
    */
    @SerializedName("ResponseTopic")
    @Expose
    private String ResponseTopic;

    /**
    * <p>关联数据（Base64编码）</p>
    */
    @SerializedName("CorrelationData")
    @Expose
    private String CorrelationData;

    /**
    * <p>消息过期时间，单位秒</p>
    */
    @SerializedName("MessageExpiryInterval")
    @Expose
    private Long MessageExpiryInterval;

    /**
    * <p>负载格式指示器 1:UTF-8文本</p>
    */
    @SerializedName("PayloadFormatIndicator")
    @Expose
    private Long PayloadFormatIndicator;

    /**
    * <p>用户属性</p>
    */
    @SerializedName("UserProperties")
    @Expose
    private UserProperty [] UserProperties;

    /**
    * <p>遗嘱消息发布时间</p>
    */
    @SerializedName("PublishAfter")
    @Expose
    private Long PublishAfter;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>保留消息Topic</p> 
     * @return Topic <p>保留消息Topic</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>保留消息Topic</p>
     * @param Topic <p>保留消息Topic</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>消息服务质量</p> 
     * @return Qos <p>消息服务质量</p>
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set <p>消息服务质量</p>
     * @param Qos <p>消息服务质量</p>
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get <p>是否保留消息</p> 
     * @return Retained <p>是否保留消息</p>
     */
    public Boolean getRetained() {
        return this.Retained;
    }

    /**
     * Set <p>是否保留消息</p>
     * @param Retained <p>是否保留消息</p>
     */
    public void setRetained(Boolean Retained) {
        this.Retained = Retained;
    }

    /**
     * Get <p>消息负载(Base64编码)</p> 
     * @return Payload <p>消息负载(Base64编码)</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>消息负载(Base64编码)</p>
     * @param Payload <p>消息负载(Base64编码)</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>创建时间，毫秒级时间戳 。</p> 
     * @return CreateTime <p>创建时间，毫秒级时间戳 。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒级时间戳 。</p>
     * @param CreateTime <p>创建时间，毫秒级时间戳 。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，毫秒级时间戳 。</p> 
     * @return UpdateTime <p>更新时间，毫秒级时间戳 。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，毫秒级时间戳 。</p>
     * @param UpdateTime <p>更新时间，毫秒级时间戳 。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>遗嘱消息延迟时间，单位秒</p> 
     * @return WillDelayInterval <p>遗嘱消息延迟时间，单位秒</p>
     */
    public Long getWillDelayInterval() {
        return this.WillDelayInterval;
    }

    /**
     * Set <p>遗嘱消息延迟时间，单位秒</p>
     * @param WillDelayInterval <p>遗嘱消息延迟时间，单位秒</p>
     */
    public void setWillDelayInterval(Long WillDelayInterval) {
        this.WillDelayInterval = WillDelayInterval;
    }

    /**
     * Get <p>响应内容类型</p> 
     * @return ContentType <p>响应内容类型</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>响应内容类型</p>
     * @param ContentType <p>响应内容类型</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>响应主题</p> 
     * @return ResponseTopic <p>响应主题</p>
     */
    public String getResponseTopic() {
        return this.ResponseTopic;
    }

    /**
     * Set <p>响应主题</p>
     * @param ResponseTopic <p>响应主题</p>
     */
    public void setResponseTopic(String ResponseTopic) {
        this.ResponseTopic = ResponseTopic;
    }

    /**
     * Get <p>关联数据（Base64编码）</p> 
     * @return CorrelationData <p>关联数据（Base64编码）</p>
     */
    public String getCorrelationData() {
        return this.CorrelationData;
    }

    /**
     * Set <p>关联数据（Base64编码）</p>
     * @param CorrelationData <p>关联数据（Base64编码）</p>
     */
    public void setCorrelationData(String CorrelationData) {
        this.CorrelationData = CorrelationData;
    }

    /**
     * Get <p>消息过期时间，单位秒</p> 
     * @return MessageExpiryInterval <p>消息过期时间，单位秒</p>
     */
    public Long getMessageExpiryInterval() {
        return this.MessageExpiryInterval;
    }

    /**
     * Set <p>消息过期时间，单位秒</p>
     * @param MessageExpiryInterval <p>消息过期时间，单位秒</p>
     */
    public void setMessageExpiryInterval(Long MessageExpiryInterval) {
        this.MessageExpiryInterval = MessageExpiryInterval;
    }

    /**
     * Get <p>负载格式指示器 1:UTF-8文本</p> 
     * @return PayloadFormatIndicator <p>负载格式指示器 1:UTF-8文本</p>
     */
    public Long getPayloadFormatIndicator() {
        return this.PayloadFormatIndicator;
    }

    /**
     * Set <p>负载格式指示器 1:UTF-8文本</p>
     * @param PayloadFormatIndicator <p>负载格式指示器 1:UTF-8文本</p>
     */
    public void setPayloadFormatIndicator(Long PayloadFormatIndicator) {
        this.PayloadFormatIndicator = PayloadFormatIndicator;
    }

    /**
     * Get <p>用户属性</p> 
     * @return UserProperties <p>用户属性</p>
     */
    public UserProperty [] getUserProperties() {
        return this.UserProperties;
    }

    /**
     * Set <p>用户属性</p>
     * @param UserProperties <p>用户属性</p>
     */
    public void setUserProperties(UserProperty [] UserProperties) {
        this.UserProperties = UserProperties;
    }

    /**
     * Get <p>遗嘱消息发布时间</p> 
     * @return PublishAfter <p>遗嘱消息发布时间</p>
     */
    public Long getPublishAfter() {
        return this.PublishAfter;
    }

    /**
     * Set <p>遗嘱消息发布时间</p>
     * @param PublishAfter <p>遗嘱消息发布时间</p>
     */
    public void setPublishAfter(Long PublishAfter) {
        this.PublishAfter = PublishAfter;
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

    public DescribeWillMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWillMessageResponse(DescribeWillMessageResponse source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.Retained != null) {
            this.Retained = new Boolean(source.Retained);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.WillDelayInterval != null) {
            this.WillDelayInterval = new Long(source.WillDelayInterval);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.ResponseTopic != null) {
            this.ResponseTopic = new String(source.ResponseTopic);
        }
        if (source.CorrelationData != null) {
            this.CorrelationData = new String(source.CorrelationData);
        }
        if (source.MessageExpiryInterval != null) {
            this.MessageExpiryInterval = new Long(source.MessageExpiryInterval);
        }
        if (source.PayloadFormatIndicator != null) {
            this.PayloadFormatIndicator = new Long(source.PayloadFormatIndicator);
        }
        if (source.UserProperties != null) {
            this.UserProperties = new UserProperty[source.UserProperties.length];
            for (int i = 0; i < source.UserProperties.length; i++) {
                this.UserProperties[i] = new UserProperty(source.UserProperties[i]);
            }
        }
        if (source.PublishAfter != null) {
            this.PublishAfter = new Long(source.PublishAfter);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Retained", this.Retained);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "WillDelayInterval", this.WillDelayInterval);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "ResponseTopic", this.ResponseTopic);
        this.setParamSimple(map, prefix + "CorrelationData", this.CorrelationData);
        this.setParamSimple(map, prefix + "MessageExpiryInterval", this.MessageExpiryInterval);
        this.setParamSimple(map, prefix + "PayloadFormatIndicator", this.PayloadFormatIndicator);
        this.setParamArrayObj(map, prefix + "UserProperties.", this.UserProperties);
        this.setParamSimple(map, prefix + "PublishAfter", this.PublishAfter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

