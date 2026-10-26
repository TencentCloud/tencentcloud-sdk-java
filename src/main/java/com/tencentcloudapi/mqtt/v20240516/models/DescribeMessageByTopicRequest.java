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

public class DescribeMessageByTopicRequest extends AbstractModel {

    /**
    * <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>home/room</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>开始时间，毫秒级时间戳 。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>查询消息条数，最大1024，默认100.</p>
    */
    @SerializedName("MaxNumber")
    @Expose
    private Long MaxNumber;

    /**
    * <p>消息 body 过滤表达式（Base64 编码），jq 1.6 语法</p><p>枚举值：</p><ul><li>LmxldmVsID09ICJFUlJPUiI=： .level == &quot;ERROR&quot; Base64编码后的字符串</li></ul>
    */
    @SerializedName("FilterExpression")
    @Expose
    private String FilterExpression;

    /**
     * Get <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p> 
     * @return InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     * @param InstanceId <p>腾讯云MQTT实例ID，从 <a href="https://cloud.tencent.com/document/api/1778/111029">DescribeInstanceList</a>接口或控制台获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>home/room</p> 
     * @return Topic <p>home/room</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>home/room</p>
     * @param Topic <p>home/room</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>开始时间，毫秒级时间戳 。</p> 
     * @return StartTime <p>开始时间，毫秒级时间戳 。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，毫秒级时间戳 。</p>
     * @param StartTime <p>开始时间，毫秒级时间戳 。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询消息条数，最大1024，默认100.</p> 
     * @return MaxNumber <p>查询消息条数，最大1024，默认100.</p>
     */
    public Long getMaxNumber() {
        return this.MaxNumber;
    }

    /**
     * Set <p>查询消息条数，最大1024，默认100.</p>
     * @param MaxNumber <p>查询消息条数，最大1024，默认100.</p>
     */
    public void setMaxNumber(Long MaxNumber) {
        this.MaxNumber = MaxNumber;
    }

    /**
     * Get <p>消息 body 过滤表达式（Base64 编码），jq 1.6 语法</p><p>枚举值：</p><ul><li>LmxldmVsID09ICJFUlJPUiI=： .level == &quot;ERROR&quot; Base64编码后的字符串</li></ul> 
     * @return FilterExpression <p>消息 body 过滤表达式（Base64 编码），jq 1.6 语法</p><p>枚举值：</p><ul><li>LmxldmVsID09ICJFUlJPUiI=： .level == &quot;ERROR&quot; Base64编码后的字符串</li></ul>
     */
    public String getFilterExpression() {
        return this.FilterExpression;
    }

    /**
     * Set <p>消息 body 过滤表达式（Base64 编码），jq 1.6 语法</p><p>枚举值：</p><ul><li>LmxldmVsID09ICJFUlJPUiI=： .level == &quot;ERROR&quot; Base64编码后的字符串</li></ul>
     * @param FilterExpression <p>消息 body 过滤表达式（Base64 编码），jq 1.6 语法</p><p>枚举值：</p><ul><li>LmxldmVsID09ICJFUlJPUiI=： .level == &quot;ERROR&quot; Base64编码后的字符串</li></ul>
     */
    public void setFilterExpression(String FilterExpression) {
        this.FilterExpression = FilterExpression;
    }

    public DescribeMessageByTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageByTopicRequest(DescribeMessageByTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.MaxNumber != null) {
            this.MaxNumber = new Long(source.MaxNumber);
        }
        if (source.FilterExpression != null) {
            this.FilterExpression = new String(source.FilterExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "MaxNumber", this.MaxNumber);
        this.setParamSimple(map, prefix + "FilterExpression", this.FilterExpression);

    }
}

