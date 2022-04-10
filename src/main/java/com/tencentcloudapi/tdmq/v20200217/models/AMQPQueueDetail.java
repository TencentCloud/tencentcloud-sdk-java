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

public class AMQPQueueDetail extends AbstractModel{

    /**
    * Queue名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 被绑定数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestBindedNum")
    @Expose
    private Long DestBindedNum;

    /**
    * 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 在线消费者数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineConsumerNum")
    @Expose
    private Long OnlineConsumerNum;

    /**
    * 每秒钟的事务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tps")
    @Expose
    private Long Tps;

    /**
    * 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccumulativeMsgNum")
    @Expose
    private Long AccumulativeMsgNum;

    /**
    * 是否自动删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 死信交换机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * 死信交换机路由键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * Queue对应的Topic名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Queue名称 
     * @return Name Queue名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Queue名称
     * @param Name Queue名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 被绑定数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestBindedNum 被绑定数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDestBindedNum() {
        return this.DestBindedNum;
    }

    /**
     * Set 被绑定数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestBindedNum 被绑定数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestBindedNum(Long DestBindedNum) {
        this.DestBindedNum = DestBindedNum;
    }

    /**
     * Get 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 创建时间，以毫秒为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 在线消费者数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineConsumerNum 在线消费者数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnlineConsumerNum() {
        return this.OnlineConsumerNum;
    }

    /**
     * Set 在线消费者数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineConsumerNum 在线消费者数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineConsumerNum(Long OnlineConsumerNum) {
        this.OnlineConsumerNum = OnlineConsumerNum;
    }

    /**
     * Get 每秒钟的事务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tps 每秒钟的事务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTps() {
        return this.Tps;
    }

    /**
     * Set 每秒钟的事务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tps 每秒钟的事务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTps(Long Tps) {
        this.Tps = Tps;
    }

    /**
     * Get 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccumulativeMsgNum 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccumulativeMsgNum() {
        return this.AccumulativeMsgNum;
    }

    /**
     * Set 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccumulativeMsgNum 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccumulativeMsgNum(Long AccumulativeMsgNum) {
        this.AccumulativeMsgNum = AccumulativeMsgNum;
    }

    /**
     * Get 是否自动删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoDelete 是否自动删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 是否自动删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoDelete 是否自动删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 死信交换机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterExchange 死信交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set 死信交换机
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterExchange 死信交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get 死信交换机路由键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterRoutingKey 死信交换机路由键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set 死信交换机路由键
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterRoutingKey 死信交换机路由键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get Queue对应的Topic名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName Queue对应的Topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Queue对应的Topic名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName Queue对应的Topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public AMQPQueueDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPQueueDetail(AMQPQueueDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DestBindedNum != null) {
            this.DestBindedNum = new Long(source.DestBindedNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.OnlineConsumerNum != null) {
            this.OnlineConsumerNum = new Long(source.OnlineConsumerNum);
        }
        if (source.Tps != null) {
            this.Tps = new Long(source.Tps);
        }
        if (source.AccumulativeMsgNum != null) {
            this.AccumulativeMsgNum = new Long(source.AccumulativeMsgNum);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DestBindedNum", this.DestBindedNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OnlineConsumerNum", this.OnlineConsumerNum);
        this.setParamSimple(map, prefix + "Tps", this.Tps);
        this.setParamSimple(map, prefix + "AccumulativeMsgNum", this.AccumulativeMsgNum);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

