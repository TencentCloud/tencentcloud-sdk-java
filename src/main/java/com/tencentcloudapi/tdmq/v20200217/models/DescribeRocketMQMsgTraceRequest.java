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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQMsgTraceRequest extends AbstractModel {

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
    * 主题，rocketmq查询死信时值为groupId
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
    * 消费组、订阅
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 查询死信时该值为true
    */
    @SerializedName("QueryDLQMsg")
    @Expose
    private Boolean QueryDLQMsg;

    /**
    * 查询死信时该值为true
    */
    @SerializedName("QueryDeadLetterMessage")
    @Expose
    private String QueryDeadLetterMessage;

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
     * Get 主题，rocketmq查询死信时值为groupId 
     * @return TopicName 主题，rocketmq查询死信时值为groupId
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题，rocketmq查询死信时值为groupId
     * @param TopicName 主题，rocketmq查询死信时值为groupId
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
     * Get 消费组、订阅 
     * @return GroupName 消费组、订阅
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 消费组、订阅
     * @param GroupName 消费组、订阅
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 查询死信时该值为true 
     * @return QueryDLQMsg 查询死信时该值为true
     * @deprecated
     */
    @Deprecated
    public Boolean getQueryDLQMsg() {
        return this.QueryDLQMsg;
    }

    /**
     * Set 查询死信时该值为true
     * @param QueryDLQMsg 查询死信时该值为true
     * @deprecated
     */
    @Deprecated
    public void setQueryDLQMsg(Boolean QueryDLQMsg) {
        this.QueryDLQMsg = QueryDLQMsg;
    }

    /**
     * Get 查询死信时该值为true 
     * @return QueryDeadLetterMessage 查询死信时该值为true
     */
    public String getQueryDeadLetterMessage() {
        return this.QueryDeadLetterMessage;
    }

    /**
     * Set 查询死信时该值为true
     * @param QueryDeadLetterMessage 查询死信时该值为true
     */
    public void setQueryDeadLetterMessage(String QueryDeadLetterMessage) {
        this.QueryDeadLetterMessage = QueryDeadLetterMessage;
    }

    public DescribeRocketMQMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgTraceRequest(DescribeRocketMQMsgTraceRequest source) {
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
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.QueryDLQMsg != null) {
            this.QueryDLQMsg = new Boolean(source.QueryDLQMsg);
        }
        if (source.QueryDeadLetterMessage != null) {
            this.QueryDeadLetterMessage = new String(source.QueryDeadLetterMessage);
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
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "QueryDLQMsg", this.QueryDLQMsg);
        this.setParamSimple(map, prefix + "QueryDeadLetterMessage", this.QueryDeadLetterMessage);

    }
}

