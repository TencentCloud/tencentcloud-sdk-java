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

public class SubscriptionData extends AbstractModel {

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 单个节点上主题队列数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicQueueNum")
    @Expose
    private Long TopicQueueNum;

    /**
    * 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 是否在线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOnline")
    @Expose
    private Boolean IsOnline;

    /**
    * 消费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumeType")
    @Expose
    private String ConsumeType;

    /**
    * 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * 过滤类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
    * 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consistency")
    @Expose
    private Long Consistency;

    /**
    * 消费堆积
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * 最后消费进度更新时间，秒为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 最大重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * 是否顺序消费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic 主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 主题类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicType 主题类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 主题类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicType 主题类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 单个节点上主题队列数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicQueueNum 单个节点上主题队列数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicQueueNum() {
        return this.TopicQueueNum;
    }

    /**
     * Set 单个节点上主题队列数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicQueueNum 单个节点上主题队列数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicQueueNum(Long TopicQueueNum) {
        this.TopicQueueNum = TopicQueueNum;
    }

    /**
     * Get 消费组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroup 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroup 消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 是否在线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOnline 是否在线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOnline() {
        return this.IsOnline;
    }

    /**
     * Set 是否在线
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOnline 是否在线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOnline(Boolean IsOnline) {
        this.IsOnline = IsOnline;
    }

    /**
     * Get 消费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumeType 消费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set 消费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumeType 消费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumeType(String ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get 订阅规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubString 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubString 订阅规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get 过滤类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpressionType 过滤类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 过滤类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpressionType 过滤类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Get 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Consistency 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsistency() {
        return this.Consistency;
    }

    /**
     * Set 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Consistency 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsistency(Long Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get 消费堆积
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLag 消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set 消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLag 消费堆积
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get 最后消费进度更新时间，秒为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后消费进度更新时间，秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后消费进度更新时间，秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后消费进度更新时间，秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 最大重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryTimes 最大重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set 最大重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryTimes 最大重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get 是否顺序消费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumeMessageOrderly 是否顺序消费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set 是否顺序消费
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumeMessageOrderly 是否顺序消费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    public SubscriptionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscriptionData(SubscriptionData source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.TopicQueueNum != null) {
            this.TopicQueueNum = new Long(source.TopicQueueNum);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new String(source.ConsumeType);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.Consistency != null) {
            this.Consistency = new Long(source.Consistency);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "TopicQueueNum", this.TopicQueueNum);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);

    }
}

