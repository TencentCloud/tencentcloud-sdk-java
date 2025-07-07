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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQTopicMsgsRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称，查询死信时为groupId
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 消息 ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息 key
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 查询偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询限额
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标志一次分页事务
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * 死信查询时该值为true，只对Rocketmq有效
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
    */
    @SerializedName("NumOfLatestMsg")
    @Expose
    private Long NumOfLatestMsg;

    /**
    * TAG表达式
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 死信查询时该值为true，只对Rocketmq有效
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间 
     * @return EnvironmentId 命名空间
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间
     * @param EnvironmentId 命名空间
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名称，查询死信时为groupId 
     * @return TopicName 主题名称，查询死信时为groupId
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，查询死信时为groupId
     * @param TopicName 主题名称，查询死信时为groupId
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 消息 key 
     * @return MsgKey 消息 key
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息 key
     * @param MsgKey 消息 key
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 查询偏移 
     * @return Offset 查询偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移
     * @param Offset 查询偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询限额 
     * @return Limit 查询限额
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询限额
     * @param Limit 查询限额
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 标志一次分页事务 
     * @return TaskRequestId 标志一次分页事务
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 标志一次分页事务
     * @param TaskRequestId 标志一次分页事务
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get 死信查询时该值为true，只对Rocketmq有效 
     * @return QueryDlqMsg 死信查询时该值为true，只对Rocketmq有效
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set 死信查询时该值为true，只对Rocketmq有效
     * @param QueryDlqMsg 死信查询时该值为true，只对Rocketmq有效
     * @deprecated
     */
    @Deprecated
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get 查询最近N条消息 最大不超过1024，默认-1为其他查询条件 
     * @return NumOfLatestMsg 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     */
    public Long getNumOfLatestMsg() {
        return this.NumOfLatestMsg;
    }

    /**
     * Set 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     * @param NumOfLatestMsg 查询最近N条消息 最大不超过1024，默认-1为其他查询条件
     */
    public void setNumOfLatestMsg(Long NumOfLatestMsg) {
        this.NumOfLatestMsg = NumOfLatestMsg;
    }

    /**
     * Get TAG表达式 
     * @return Tag TAG表达式
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set TAG表达式
     * @param Tag TAG表达式
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 死信查询时该值为true，只对Rocketmq有效 
     * @return QueryDeadLetterMessage 死信查询时该值为true，只对Rocketmq有效
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set 死信查询时该值为true，只对Rocketmq有效
     * @param QueryDeadLetterMessage 死信查询时该值为true，只对Rocketmq有效
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    public DescribeRocketMQTopicMsgsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopicMsgsRequest(DescribeRocketMQTopicMsgsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.NumOfLatestMsg != null) {
            this.NumOfLatestMsg = new Long(source.NumOfLatestMsg);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "NumOfLatestMsg", this.NumOfLatestMsg);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);

    }
}

