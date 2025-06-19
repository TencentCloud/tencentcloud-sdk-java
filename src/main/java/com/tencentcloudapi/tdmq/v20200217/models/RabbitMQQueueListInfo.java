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

public class RabbitMQQueueListInfo extends AbstractModel {

    /**
    * 队列名
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 备注说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消费者信息
    */
    @SerializedName("ConsumerDetail")
    @Expose
    private RabbitMQQueueListConsumerDetailInfo ConsumerDetail;

    /**
    * 队列类型，取值 "classic"，"quorum"
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 队列是否持久化，true 为持久化，false 为非持久化
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * 队列是否为自动删除队列，true 为自动删除，false 为非自动删除
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 队列所属实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 队列所属虚拟主机名称
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 队列所在主节点名称
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 扩展参数 key-value 对象
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * 是否独占队列
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
    * 创建时间时间戳
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * 修改时间时间戳
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
     * Get 队列名 
     * @return QueueName 队列名
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名
     * @param QueueName 队列名
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 备注说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 消费者信息 
     * @return ConsumerDetail 消费者信息
     */
    public RabbitMQQueueListConsumerDetailInfo getConsumerDetail() {
        return this.ConsumerDetail;
    }

    /**
     * Set 消费者信息
     * @param ConsumerDetail 消费者信息
     */
    public void setConsumerDetail(RabbitMQQueueListConsumerDetailInfo ConsumerDetail) {
        this.ConsumerDetail = ConsumerDetail;
    }

    /**
     * Get 队列类型，取值 "classic"，"quorum" 
     * @return QueueType 队列类型，取值 "classic"，"quorum"
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型，取值 "classic"，"quorum"
     * @param QueueType 队列类型，取值 "classic"，"quorum"
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateIn 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateIn 消息生产速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateOut 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateOut 消息消费速率，每秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 队列是否持久化，true 为持久化，false 为非持久化 
     * @return Durable 队列是否持久化，true 为持久化，false 为非持久化
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set 队列是否持久化，true 为持久化，false 为非持久化
     * @param Durable 队列是否持久化，true 为持久化，false 为非持久化
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get 队列是否为自动删除队列，true 为自动删除，false 为非自动删除 
     * @return AutoDelete 队列是否为自动删除队列，true 为自动删除，false 为非自动删除
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 队列是否为自动删除队列，true 为自动删除，false 为非自动删除
     * @param AutoDelete 队列是否为自动删除队列，true 为自动删除，false 为非自动删除
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 队列所属实例 ID 
     * @return InstanceId 队列所属实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 队列所属实例 ID
     * @param InstanceId 队列所属实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 队列所属虚拟主机名称 
     * @return VirtualHost 队列所属虚拟主机名称
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set 队列所属虚拟主机名称
     * @param VirtualHost 队列所属虚拟主机名称
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 队列所在主节点名称 
     * @return Node 队列所在主节点名称
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set 队列所在主节点名称
     * @param Node 队列所在主节点名称
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 扩展参数 key-value 对象 
     * @return Arguments 扩展参数 key-value 对象
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set 扩展参数 key-value 对象
     * @param Arguments 扩展参数 key-value 对象
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get 是否独占队列 
     * @return Exclusive 是否独占队列
     */
    public Boolean getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 是否独占队列
     * @param Exclusive 是否独占队列
     */
    public void setExclusive(Boolean Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 创建时间时间戳 
     * @return CreateTs 创建时间时间戳
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set 创建时间时间戳
     * @param CreateTs 创建时间时间戳
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get 修改时间时间戳 
     * @return ModifyTs 修改时间时间戳
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set 修改时间时间戳
     * @param ModifyTs 修改时间时间戳
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    public RabbitMQQueueListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQQueueListInfo(RabbitMQQueueListInfo source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerDetail != null) {
            this.ConsumerDetail = new RabbitMQQueueListConsumerDetailInfo(source.ConsumerDetail);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.MessageHeapCount != null) {
            this.MessageHeapCount = new Long(source.MessageHeapCount);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Boolean(source.Exclusive);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "ConsumerDetail.", this.ConsumerDetail);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

