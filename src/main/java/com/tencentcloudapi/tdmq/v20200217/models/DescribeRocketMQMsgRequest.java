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

public class DescribeRocketMQMsgRequest extends AbstractModel {

    /**
    * 集群id
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
    * 主题，查询死信时传groupId
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * pulsar消息id
    */
    @SerializedName("PulsarMsgId")
    @Expose
    private String PulsarMsgId;

    /**
    * 查询死信时该值为true，只对Rocketmq有效
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * 查询死信时该值为true，只对Rocketmq有效
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据消费组名称过滤消费详情
    */
    @SerializedName("FilterTrackGroup")
    @Expose
    private String FilterTrackGroup;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
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
     * Get 主题，查询死信时传groupId 
     * @return TopicName 主题，查询死信时传groupId
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题，查询死信时传groupId
     * @param TopicName 主题，查询死信时传groupId
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息id 
     * @return MsgId 消息id
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息id
     * @param MsgId 消息id
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get pulsar消息id 
     * @return PulsarMsgId pulsar消息id
     */
    public String getPulsarMsgId() {
        return this.PulsarMsgId;
    }

    /**
     * Set pulsar消息id
     * @param PulsarMsgId pulsar消息id
     */
    public void setPulsarMsgId(String PulsarMsgId) {
        this.PulsarMsgId = PulsarMsgId;
    }

    /**
     * Get 查询死信时该值为true，只对Rocketmq有效 
     * @return QueryDlqMsg 查询死信时该值为true，只对Rocketmq有效
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set 查询死信时该值为true，只对Rocketmq有效
     * @param QueryDlqMsg 查询死信时该值为true，只对Rocketmq有效
     * @deprecated
     */
    @Deprecated
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get 查询死信时该值为true，只对Rocketmq有效 
     * @return QueryDeadLetterMessage 查询死信时该值为true，只对Rocketmq有效
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set 查询死信时该值为true，只对Rocketmq有效
     * @param QueryDeadLetterMessage 查询死信时该值为true，只对Rocketmq有效
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据消费组名称过滤消费详情 
     * @return FilterTrackGroup 根据消费组名称过滤消费详情
     */
    public String getFilterTrackGroup() {
        return this.FilterTrackGroup;
    }

    /**
     * Set 根据消费组名称过滤消费详情
     * @param FilterTrackGroup 根据消费组名称过滤消费详情
     */
    public void setFilterTrackGroup(String FilterTrackGroup) {
        this.FilterTrackGroup = FilterTrackGroup;
    }

    public DescribeRocketMQMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgRequest(DescribeRocketMQMsgRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.PulsarMsgId != null) {
            this.PulsarMsgId = new String(source.PulsarMsgId);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new Boolean(source.QueryDeadLetterMessage);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterTrackGroup != null) {
            this.FilterTrackGroup = new String(source.FilterTrackGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "PulsarMsgId", this.PulsarMsgId);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterTrackGroup", this.FilterTrackGroup);

    }
}

