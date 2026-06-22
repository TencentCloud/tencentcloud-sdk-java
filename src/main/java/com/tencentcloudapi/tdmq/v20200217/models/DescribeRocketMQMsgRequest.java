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
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>命名空间，4.x 通用集群命名空间固定为: tdmq_default</p>
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * <p>主题，查询死信时传groupId</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>消息id</p>
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * <p>pulsar消息id</p>
    */
    @SerializedName("PulsarMsgId")
    @Expose
    private String PulsarMsgId;

    /**
    * <p>查询死信时该值为true，只对Rocketmq有效</p>
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * <p>查询死信时该值为true，只对Rocketmq有效</p>
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private Boolean QueryDeadLetterMessage;

    /**
    * <p>分页Offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页Limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据消费组名称过滤消费详情</p>
    */
    @SerializedName("FilterTrackGroup")
    @Expose
    private String FilterTrackGroup;

    /**
    * <p>查询延迟消息或定时消息时，该值为true</p>
    */
    @SerializedName("QueryDelayMessage")
    @Expose
    private Boolean QueryDelayMessage;

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>命名空间，4.x 通用集群命名空间固定为: tdmq_default</p> 
     * @return EnvironmentId <p>命名空间，4.x 通用集群命名空间固定为: tdmq_default</p>
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set <p>命名空间，4.x 通用集群命名空间固定为: tdmq_default</p>
     * @param EnvironmentId <p>命名空间，4.x 通用集群命名空间固定为: tdmq_default</p>
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get <p>主题，查询死信时传groupId</p> 
     * @return TopicName <p>主题，查询死信时传groupId</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>主题，查询死信时传groupId</p>
     * @param TopicName <p>主题，查询死信时传groupId</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>消息id</p> 
     * @return MsgId <p>消息id</p>
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set <p>消息id</p>
     * @param MsgId <p>消息id</p>
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get <p>pulsar消息id</p> 
     * @return PulsarMsgId <p>pulsar消息id</p>
     */
    public String getPulsarMsgId() {
        return this.PulsarMsgId;
    }

    /**
     * Set <p>pulsar消息id</p>
     * @param PulsarMsgId <p>pulsar消息id</p>
     */
    public void setPulsarMsgId(String PulsarMsgId) {
        this.PulsarMsgId = PulsarMsgId;
    }

    /**
     * Get <p>查询死信时该值为true，只对Rocketmq有效</p> 
     * @return QueryDlqMsg <p>查询死信时该值为true，只对Rocketmq有效</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set <p>查询死信时该值为true，只对Rocketmq有效</p>
     * @param QueryDlqMsg <p>查询死信时该值为true，只对Rocketmq有效</p>
     * @deprecated
     */
    @Deprecated
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get <p>查询死信时该值为true，只对Rocketmq有效</p> 
     * @return QueryDeadLetterMessage <p>查询死信时该值为true，只对Rocketmq有效</p>
     */
    public Boolean getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set <p>查询死信时该值为true，只对Rocketmq有效</p>
     * @param QueryDeadLetterMessage <p>查询死信时该值为true，只对Rocketmq有效</p>
     */
    public void setQueryDeadLetterMessage(Boolean QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    /**
     * Get <p>分页Offset</p> 
     * @return Offset <p>分页Offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页Offset</p>
     * @param Offset <p>分页Offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页Limit</p> 
     * @return Limit <p>分页Limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页Limit</p>
     * @param Limit <p>分页Limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据消费组名称过滤消费详情</p> 
     * @return FilterTrackGroup <p>根据消费组名称过滤消费详情</p>
     */
    public String getFilterTrackGroup() {
        return this.FilterTrackGroup;
    }

    /**
     * Set <p>根据消费组名称过滤消费详情</p>
     * @param FilterTrackGroup <p>根据消费组名称过滤消费详情</p>
     */
    public void setFilterTrackGroup(String FilterTrackGroup) {
        this.FilterTrackGroup = FilterTrackGroup;
    }

    /**
     * Get <p>查询延迟消息或定时消息时，该值为true</p> 
     * @return QueryDelayMessage <p>查询延迟消息或定时消息时，该值为true</p>
     */
    public Boolean getQueryDelayMessage() {
        return this.QueryDelayMessage;
    }

    /**
     * Set <p>查询延迟消息或定时消息时，该值为true</p>
     * @param QueryDelayMessage <p>查询延迟消息或定时消息时，该值为true</p>
     */
    public void setQueryDelayMessage(Boolean QueryDelayMessage) {
        this.QueryDelayMessage = QueryDelayMessage;
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
        if (source.QueryDelayMessage != null) {
            this.QueryDelayMessage = new Boolean(source.QueryDelayMessage);
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
        this.setParamSimple(map, prefix + "QueryDelayMessage", this.QueryDelayMessage);

    }
}

