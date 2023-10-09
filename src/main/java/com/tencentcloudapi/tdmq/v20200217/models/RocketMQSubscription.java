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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQSubscription extends AbstractModel{

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题类型：
Normal 普通,
GlobalOrder 全局顺序,
PartitionedOrder 局部顺序,
Transaction 事务消息,
DelayScheduled 延时消息,
Retry 重试,
DeadLetter 死信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 过滤模式，TAG，SQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
    * 过滤表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * 订阅状态：
0，订阅关系一致
1，订阅关系不一致
2，未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 消费堆积数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    private Long ConsumeType;

    /**
    * 订阅一致性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consistency")
    @Expose
    private Long Consistency;

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
     * Get 主题类型：
Normal 普通,
GlobalOrder 全局顺序,
PartitionedOrder 局部顺序,
Transaction 事务消息,
DelayScheduled 延时消息,
Retry 重试,
DeadLetter 死信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 主题类型：
Normal 普通,
GlobalOrder 全局顺序,
PartitionedOrder 局部顺序,
Transaction 事务消息,
DelayScheduled 延时消息,
Retry 重试,
DeadLetter 死信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主题类型：
Normal 普通,
GlobalOrder 全局顺序,
PartitionedOrder 局部顺序,
Transaction 事务消息,
DelayScheduled 延时消息,
Retry 重试,
DeadLetter 死信
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 主题类型：
Normal 普通,
GlobalOrder 全局顺序,
PartitionedOrder 局部顺序,
Transaction 事务消息,
DelayScheduled 延时消息,
Retry 重试,
DeadLetter 死信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNum 分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNum 分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 过滤模式，TAG，SQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpressionType 过滤模式，TAG，SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 过滤模式，TAG，SQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpressionType 过滤模式，TAG，SQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Get 过滤表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubString 过滤表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set 过滤表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubString 过滤表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get 订阅状态：
0，订阅关系一致
1，订阅关系不一致
2，未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 订阅状态：
0，订阅关系一致
1，订阅关系不一致
2，未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅状态：
0，订阅关系一致
1，订阅关系不一致
2，未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 订阅状态：
0，订阅关系一致
1，订阅关系不一致
2，未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 消费堆积数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLag 消费堆积数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set 消费堆积数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLag 消费堆积数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
    public Long getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set 消费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumeType 消费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumeType(Long ConsumeType) {
        this.ConsumeType = ConsumeType;
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

    public RocketMQSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQSubscription(RocketMQSubscription source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new Long(source.ConsumeType);
        }
        if (source.Consistency != null) {
            this.Consistency = new Long(source.Consistency);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);

    }
}

