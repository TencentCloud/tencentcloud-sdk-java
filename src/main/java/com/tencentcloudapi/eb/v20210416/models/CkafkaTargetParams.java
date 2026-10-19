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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaTargetParams extends AbstractModel {

    /**
    * <p>要投递到的ckafka topic</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>重试策略</p>
    */
    @SerializedName("RetryPolicy")
    @Expose
    private RetryPolicy RetryPolicy;

    /**
    * <p>事件投递kafka时的协议格式；目前只支持两种格式：1.CloudEvent(完整的cloudevent消息协议)2.CloudEventDataKey(cloudevent协议中的data字段内容)</p>
    */
    @SerializedName("EventDeliveryFormat")
    @Expose
    private String EventDeliveryFormat;

    /**
    * <p>事件顶层Time参数投递格式</p><p>枚举值：</p><ul><li>RFC3339： 将时间戳转换成 YYYY-MM-DDTHH:mm:ssZ 格式</li></ul>
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get <p>要投递到的ckafka topic</p> 
     * @return TopicName <p>要投递到的ckafka topic</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>要投递到的ckafka topic</p>
     * @param TopicName <p>要投递到的ckafka topic</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>重试策略</p> 
     * @return RetryPolicy <p>重试策略</p>
     */
    public RetryPolicy getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set <p>重试策略</p>
     * @param RetryPolicy <p>重试策略</p>
     */
    public void setRetryPolicy(RetryPolicy RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get <p>事件投递kafka时的协议格式；目前只支持两种格式：1.CloudEvent(完整的cloudevent消息协议)2.CloudEventDataKey(cloudevent协议中的data字段内容)</p> 
     * @return EventDeliveryFormat <p>事件投递kafka时的协议格式；目前只支持两种格式：1.CloudEvent(完整的cloudevent消息协议)2.CloudEventDataKey(cloudevent协议中的data字段内容)</p>
     */
    public String getEventDeliveryFormat() {
        return this.EventDeliveryFormat;
    }

    /**
     * Set <p>事件投递kafka时的协议格式；目前只支持两种格式：1.CloudEvent(完整的cloudevent消息协议)2.CloudEventDataKey(cloudevent协议中的data字段内容)</p>
     * @param EventDeliveryFormat <p>事件投递kafka时的协议格式；目前只支持两种格式：1.CloudEvent(完整的cloudevent消息协议)2.CloudEventDataKey(cloudevent协议中的data字段内容)</p>
     */
    public void setEventDeliveryFormat(String EventDeliveryFormat) {
        this.EventDeliveryFormat = EventDeliveryFormat;
    }

    /**
     * Get <p>事件顶层Time参数投递格式</p><p>枚举值：</p><ul><li>RFC3339： 将时间戳转换成 YYYY-MM-DDTHH:mm:ssZ 格式</li></ul> 
     * @return TimeFormat <p>事件顶层Time参数投递格式</p><p>枚举值：</p><ul><li>RFC3339： 将时间戳转换成 YYYY-MM-DDTHH:mm:ssZ 格式</li></ul>
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set <p>事件顶层Time参数投递格式</p><p>枚举值：</p><ul><li>RFC3339： 将时间戳转换成 YYYY-MM-DDTHH:mm:ssZ 格式</li></ul>
     * @param TimeFormat <p>事件顶层Time参数投递格式</p><p>枚举值：</p><ul><li>RFC3339： 将时间戳转换成 YYYY-MM-DDTHH:mm:ssZ 格式</li></ul>
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public CkafkaTargetParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaTargetParams(CkafkaTargetParams source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new RetryPolicy(source.RetryPolicy);
        }
        if (source.EventDeliveryFormat != null) {
            this.EventDeliveryFormat = new String(source.EventDeliveryFormat);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamObj(map, prefix + "RetryPolicy.", this.RetryPolicy);
        this.setParamSimple(map, prefix + "EventDeliveryFormat", this.EventDeliveryFormat);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

