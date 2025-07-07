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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageListRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 要查询消息的开始时间，**Unix时间戳（毫秒）**
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 要查询消息的结束时间，**Unix时间戳（毫秒）**
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 一次查询标识。第一次查询可传空字符串，当查询结果涉及分页，请求下一页数据时该入参的值取上一次请求响应中的出参TaskRequestId 值即可。
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * 查询起始位置，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消息 ID，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息 Key，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
    */
    @SerializedName("RecentMessageNum")
    @Expose
    private Long RecentMessageNum;

    /**
    * 是否查询死信消息，默认为false
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * 消息 Tag，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。 
     * @return Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     * @param Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 要查询消息的开始时间，**Unix时间戳（毫秒）** 
     * @return StartTime 要查询消息的开始时间，**Unix时间戳（毫秒）**
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 要查询消息的开始时间，**Unix时间戳（毫秒）**
     * @param StartTime 要查询消息的开始时间，**Unix时间戳（毫秒）**
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 要查询消息的结束时间，**Unix时间戳（毫秒）** 
     * @return EndTime 要查询消息的结束时间，**Unix时间戳（毫秒）**
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 要查询消息的结束时间，**Unix时间戳（毫秒）**
     * @param EndTime 要查询消息的结束时间，**Unix时间戳（毫秒）**
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 一次查询标识。第一次查询可传空字符串，当查询结果涉及分页，请求下一页数据时该入参的值取上一次请求响应中的出参TaskRequestId 值即可。 
     * @return TaskRequestId 一次查询标识。第一次查询可传空字符串，当查询结果涉及分页，请求下一页数据时该入参的值取上一次请求响应中的出参TaskRequestId 值即可。
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 一次查询标识。第一次查询可传空字符串，当查询结果涉及分页，请求下一页数据时该入参的值取上一次请求响应中的出参TaskRequestId 值即可。
     * @param TaskRequestId 一次查询标识。第一次查询可传空字符串，当查询结果涉及分页，请求下一页数据时该入参的值取上一次请求响应中的出参TaskRequestId 值即可。
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get 查询起始位置，默认为0。 
     * @return Offset 查询起始位置，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置，默认为0。
     * @param Offset 查询起始位置，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制数量，默认20。 
     * @return Limit 查询结果限制数量，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量，默认20。
     * @param Limit 查询结果限制数量，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。 
     * @return ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     * @param ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消息 ID，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。 
     * @return MsgId 消息 ID，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息 ID，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     * @param MsgId 消息 ID，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消息 Key，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。 
     * @return MsgKey 消息 Key，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息 Key，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     * @param MsgKey 消息 Key，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 查询最近N条消息 最大不超过1024，默认-1为其他查询条件 
     * @return RecentMessageNum 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     */
    public Long getRecentMessageNum() {
        return this.RecentMessageNum;
    }

    /**
     * Set 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     * @param RecentMessageNum 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     */
    public void setRecentMessageNum(Long RecentMessageNum) {
        this.RecentMessageNum = RecentMessageNum;
    }

    /**
     * Get 是否查询死信消息，默认为false 
     * @return QueryDeadLetterMessage 是否查询死信消息，默认为false
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set 是否查询死信消息，默认为false
     * @param QueryDeadLetterMessage 是否查询死信消息，默认为false
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get 消息 Tag，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。 
     * @return Tag 消息 Tag，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 消息 Tag，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     * @param Tag 消息 Tag，从 [DescribeMessageList](https://cloud.tencent.com/document/api/1493/114593) 接口返回的 [MessageItem](https://cloud.tencent.com/document/api/1493/96031#MessageItem) 或业务日志中获得。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public DescribeMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageListRequest(DescribeMessageListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.RecentMessageNum != null) {
            this.RecentMessageNum = new Long(source.RecentMessageNum);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "RecentMessageNum", this.RecentMessageNum);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

