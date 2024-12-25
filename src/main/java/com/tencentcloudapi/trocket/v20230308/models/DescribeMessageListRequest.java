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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageListRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 一次查询标识
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * 查询起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 消费组名称
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消息 ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息 Key
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
    * 是否查询死信消息
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * 消息 Tag
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 一次查询标识 
     * @return TaskRequestId 一次查询标识
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 一次查询标识
     * @param TaskRequestId 一次查询标识
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get 查询起始位置 
     * @return Offset 查询起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置
     * @param Offset 查询起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制数量 
     * @return Limit 查询结果限制数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量
     * @param Limit 查询结果限制数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 消费组名称 
     * @return ConsumerGroup 消费组名称
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称
     * @param ConsumerGroup 消费组名称
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消息 ID 
     * @return MsgId 消息 ID
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息 ID
     * @param MsgId 消息 ID
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消息 Key 
     * @return MsgKey 消息 Key
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息 Key
     * @param MsgKey 消息 Key
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
     * Get 是否查询死信消息 
     * @return QueryDeadLetterMessage 是否查询死信消息
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set 是否查询死信消息
     * @param QueryDeadLetterMessage 是否查询死信消息
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get 消息 Tag 
     * @return Tag 消息 Tag
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 消息 Tag
     * @param Tag 消息 Tag
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

