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

public class DescribeMqMsgTraceRequest extends AbstractModel {

    /**
    * pulsar、rocketmq、rabbitmq、cmq
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 集群id，cmq为空
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间，cmq为空
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题，cmq为空，rocketmq查询死信时值为groupId
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * cmq必填，其他协议填空
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 消费组、订阅
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 查询死信时该值为true，只对Rocketmq有效
    */
    @SerializedName("QueryDlqMsg")
    @Expose
    private Boolean QueryDlqMsg;

    /**
    * 生产时间
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
     * Get pulsar、rocketmq、rabbitmq、cmq 
     * @return Protocol pulsar、rocketmq、rabbitmq、cmq
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set pulsar、rocketmq、rabbitmq、cmq
     * @param Protocol pulsar、rocketmq、rabbitmq、cmq
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
     * Get 集群id，cmq为空 
     * @return ClusterId 集群id，cmq为空
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id，cmq为空
     * @param ClusterId 集群id，cmq为空
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间，cmq为空 
     * @return EnvironmentId 命名空间，cmq为空
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间，cmq为空
     * @param EnvironmentId 命名空间，cmq为空
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题，cmq为空，rocketmq查询死信时值为groupId 
     * @return TopicName 主题，cmq为空，rocketmq查询死信时值为groupId
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题，cmq为空，rocketmq查询死信时值为groupId
     * @param TopicName 主题，cmq为空，rocketmq查询死信时值为groupId
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get cmq必填，其他协议填空 
     * @return QueueName cmq必填，其他协议填空
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set cmq必填，其他协议填空
     * @param QueueName cmq必填，其他协议填空
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
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
     * Get 查询死信时该值为true，只对Rocketmq有效 
     * @return QueryDlqMsg 查询死信时该值为true，只对Rocketmq有效
     */
    public Boolean getQueryDlqMsg() {
        return this.QueryDlqMsg;
    }

    /**
     * Set 查询死信时该值为true，只对Rocketmq有效
     * @param QueryDlqMsg 查询死信时该值为true，只对Rocketmq有效
     */
    public void setQueryDlqMsg(Boolean QueryDlqMsg) {
        this.QueryDlqMsg = QueryDlqMsg;
    }

    /**
     * Get 生产时间 
     * @return ProduceTime 生产时间
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 生产时间
     * @param ProduceTime 生产时间
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    public DescribeMqMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMqMsgTraceRequest(DescribeMqMsgTraceRequest source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.QueryDlqMsg != null) {
            this.QueryDlqMsg = new Boolean(source.QueryDlqMsg);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "QueryDlqMsg", this.QueryDlqMsg);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);

    }
}

