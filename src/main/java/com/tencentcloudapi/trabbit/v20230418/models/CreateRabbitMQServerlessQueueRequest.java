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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQServerlessQueueRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VHost参数
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 只支持 classic
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 持久标记,classic类型必传,quorum类型无需传入固定为true
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * 自动清除,classic类型必传,quorum类型无需传入固定为false
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * MessageTTL参数,classic类型专用
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * AutoExpire参数，单位为 ms，队列在指定时间内没有被使用，将会被删除
    */
    @SerializedName("AutoExpire")
    @Expose
    private Long AutoExpire;

    /**
    * MaxLength参数。队列可以容纳的最大条数。若超出上限，将根据 overview behavior 处理
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * MaxLengthBytes参数。若超出上限，将根据 overview behavior 处理。
    */
    @SerializedName("MaxLengthBytes")
    @Expose
    private Long MaxLengthBytes;

    /**
    * DeliveryLimit参数,quorum类型专用
    */
    @SerializedName("DeliveryLimit")
    @Expose
    private Long DeliveryLimit;

    /**
    * OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
    */
    @SerializedName("OverflowBehaviour")
    @Expose
    private String OverflowBehaviour;

    /**
    * DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * SingleActiveConsumer参数。若开启，需确保每次有且只有一个消费者从队列中消费
    */
    @SerializedName("SingleActiveConsumer")
    @Expose
    private Boolean SingleActiveConsumer;

    /**
    * MaximumPriority参数,classic类型专用
    */
    @SerializedName("MaximumPriority")
    @Expose
    private Long MaximumPriority;

    /**
    * LazyMode参数,classic类型专用
    */
    @SerializedName("LazyMode")
    @Expose
    private Boolean LazyMode;

    /**
    * MasterLocator参数,classic类型专用,取值为min-masters,client-local或random
    */
    @SerializedName("MasterLocator")
    @Expose
    private String MasterLocator;

    /**
    * MaxInMemoryLength参数，quorum类型专用。quorum 队列的内存中最大消息数量
    */
    @SerializedName("MaxInMemoryLength")
    @Expose
    private Long MaxInMemoryLength;

    /**
    * MaxInMemoryBytes参数，quorum类型专用。quorum 队列的内存中最大数总消息大小
    */
    @SerializedName("MaxInMemoryBytes")
    @Expose
    private Long MaxInMemoryBytes;

    /**
    * Node参数，非必填，指定创建 queue 所在节点
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * 仲裁队列死信一致性策略，at-most-once、at-least-once，默认是at-most-once
    */
    @SerializedName("DeadLetterStrategy")
    @Expose
    private String DeadLetterStrategy;

    /**
    * 仲裁队列的领导者选举策略，client-local、balanced，默认是client-local
    */
    @SerializedName("QueueLeaderLocator")
    @Expose
    private String QueueLeaderLocator;

    /**
    * 仲裁队列的初始副本组大小，默认3
    */
    @SerializedName("QuorumInitialGroupSize")
    @Expose
    private Long QuorumInitialGroupSize;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VHost参数 
     * @return VirtualHost VHost参数
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VHost参数
     * @param VirtualHost VHost参数
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 只支持 classic 
     * @return QueueType 只支持 classic
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 只支持 classic
     * @param QueueType 只支持 classic
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 持久标记,classic类型必传,quorum类型无需传入固定为true 
     * @return Durable 持久标记,classic类型必传,quorum类型无需传入固定为true
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set 持久标记,classic类型必传,quorum类型无需传入固定为true
     * @param Durable 持久标记,classic类型必传,quorum类型无需传入固定为true
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get 自动清除,classic类型必传,quorum类型无需传入固定为false 
     * @return AutoDelete 自动清除,classic类型必传,quorum类型无需传入固定为false
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 自动清除,classic类型必传,quorum类型无需传入固定为false
     * @param AutoDelete 自动清除,classic类型必传,quorum类型无需传入固定为false
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get MessageTTL参数,classic类型专用 
     * @return MessageTTL MessageTTL参数,classic类型专用
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set MessageTTL参数,classic类型专用
     * @param MessageTTL MessageTTL参数,classic类型专用
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get AutoExpire参数，单位为 ms，队列在指定时间内没有被使用，将会被删除 
     * @return AutoExpire AutoExpire参数，单位为 ms，队列在指定时间内没有被使用，将会被删除
     */
    public Long getAutoExpire() {
        return this.AutoExpire;
    }

    /**
     * Set AutoExpire参数，单位为 ms，队列在指定时间内没有被使用，将会被删除
     * @param AutoExpire AutoExpire参数，单位为 ms，队列在指定时间内没有被使用，将会被删除
     */
    public void setAutoExpire(Long AutoExpire) {
        this.AutoExpire = AutoExpire;
    }

    /**
     * Get MaxLength参数。队列可以容纳的最大条数。若超出上限，将根据 overview behavior 处理 
     * @return MaxLength MaxLength参数。队列可以容纳的最大条数。若超出上限，将根据 overview behavior 处理
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set MaxLength参数。队列可以容纳的最大条数。若超出上限，将根据 overview behavior 处理
     * @param MaxLength MaxLength参数。队列可以容纳的最大条数。若超出上限，将根据 overview behavior 处理
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get MaxLengthBytes参数。若超出上限，将根据 overview behavior 处理。 
     * @return MaxLengthBytes MaxLengthBytes参数。若超出上限，将根据 overview behavior 处理。
     */
    public Long getMaxLengthBytes() {
        return this.MaxLengthBytes;
    }

    /**
     * Set MaxLengthBytes参数。若超出上限，将根据 overview behavior 处理。
     * @param MaxLengthBytes MaxLengthBytes参数。若超出上限，将根据 overview behavior 处理。
     */
    public void setMaxLengthBytes(Long MaxLengthBytes) {
        this.MaxLengthBytes = MaxLengthBytes;
    }

    /**
     * Get DeliveryLimit参数,quorum类型专用 
     * @return DeliveryLimit DeliveryLimit参数,quorum类型专用
     */
    public Long getDeliveryLimit() {
        return this.DeliveryLimit;
    }

    /**
     * Set DeliveryLimit参数,quorum类型专用
     * @param DeliveryLimit DeliveryLimit参数,quorum类型专用
     */
    public void setDeliveryLimit(Long DeliveryLimit) {
        this.DeliveryLimit = DeliveryLimit;
    }

    /**
     * Get OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx 
     * @return OverflowBehaviour OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
     */
    public String getOverflowBehaviour() {
        return this.OverflowBehaviour;
    }

    /**
     * Set OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
     * @param OverflowBehaviour OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
     */
    public void setOverflowBehaviour(String OverflowBehaviour) {
        this.OverflowBehaviour = OverflowBehaviour;
    }

    /**
     * Get DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。 
     * @return DeadLetterExchange DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     * @param DeadLetterExchange DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_" 
     * @return DeadLetterRoutingKey DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     * @param DeadLetterRoutingKey DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get SingleActiveConsumer参数。若开启，需确保每次有且只有一个消费者从队列中消费 
     * @return SingleActiveConsumer SingleActiveConsumer参数。若开启，需确保每次有且只有一个消费者从队列中消费
     */
    public Boolean getSingleActiveConsumer() {
        return this.SingleActiveConsumer;
    }

    /**
     * Set SingleActiveConsumer参数。若开启，需确保每次有且只有一个消费者从队列中消费
     * @param SingleActiveConsumer SingleActiveConsumer参数。若开启，需确保每次有且只有一个消费者从队列中消费
     */
    public void setSingleActiveConsumer(Boolean SingleActiveConsumer) {
        this.SingleActiveConsumer = SingleActiveConsumer;
    }

    /**
     * Get MaximumPriority参数,classic类型专用 
     * @return MaximumPriority MaximumPriority参数,classic类型专用
     */
    public Long getMaximumPriority() {
        return this.MaximumPriority;
    }

    /**
     * Set MaximumPriority参数,classic类型专用
     * @param MaximumPriority MaximumPriority参数,classic类型专用
     */
    public void setMaximumPriority(Long MaximumPriority) {
        this.MaximumPriority = MaximumPriority;
    }

    /**
     * Get LazyMode参数,classic类型专用 
     * @return LazyMode LazyMode参数,classic类型专用
     */
    public Boolean getLazyMode() {
        return this.LazyMode;
    }

    /**
     * Set LazyMode参数,classic类型专用
     * @param LazyMode LazyMode参数,classic类型专用
     */
    public void setLazyMode(Boolean LazyMode) {
        this.LazyMode = LazyMode;
    }

    /**
     * Get MasterLocator参数,classic类型专用,取值为min-masters,client-local或random 
     * @return MasterLocator MasterLocator参数,classic类型专用,取值为min-masters,client-local或random
     */
    public String getMasterLocator() {
        return this.MasterLocator;
    }

    /**
     * Set MasterLocator参数,classic类型专用,取值为min-masters,client-local或random
     * @param MasterLocator MasterLocator参数,classic类型专用,取值为min-masters,client-local或random
     */
    public void setMasterLocator(String MasterLocator) {
        this.MasterLocator = MasterLocator;
    }

    /**
     * Get MaxInMemoryLength参数，quorum类型专用。quorum 队列的内存中最大消息数量 
     * @return MaxInMemoryLength MaxInMemoryLength参数，quorum类型专用。quorum 队列的内存中最大消息数量
     */
    public Long getMaxInMemoryLength() {
        return this.MaxInMemoryLength;
    }

    /**
     * Set MaxInMemoryLength参数，quorum类型专用。quorum 队列的内存中最大消息数量
     * @param MaxInMemoryLength MaxInMemoryLength参数，quorum类型专用。quorum 队列的内存中最大消息数量
     */
    public void setMaxInMemoryLength(Long MaxInMemoryLength) {
        this.MaxInMemoryLength = MaxInMemoryLength;
    }

    /**
     * Get MaxInMemoryBytes参数，quorum类型专用。quorum 队列的内存中最大数总消息大小 
     * @return MaxInMemoryBytes MaxInMemoryBytes参数，quorum类型专用。quorum 队列的内存中最大数总消息大小
     */
    public Long getMaxInMemoryBytes() {
        return this.MaxInMemoryBytes;
    }

    /**
     * Set MaxInMemoryBytes参数，quorum类型专用。quorum 队列的内存中最大数总消息大小
     * @param MaxInMemoryBytes MaxInMemoryBytes参数，quorum类型专用。quorum 队列的内存中最大数总消息大小
     */
    public void setMaxInMemoryBytes(Long MaxInMemoryBytes) {
        this.MaxInMemoryBytes = MaxInMemoryBytes;
    }

    /**
     * Get Node参数，非必填，指定创建 queue 所在节点 
     * @return Node Node参数，非必填，指定创建 queue 所在节点
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Node参数，非必填，指定创建 queue 所在节点
     * @param Node Node参数，非必填，指定创建 queue 所在节点
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get 仲裁队列死信一致性策略，at-most-once、at-least-once，默认是at-most-once 
     * @return DeadLetterStrategy 仲裁队列死信一致性策略，at-most-once、at-least-once，默认是at-most-once
     */
    public String getDeadLetterStrategy() {
        return this.DeadLetterStrategy;
    }

    /**
     * Set 仲裁队列死信一致性策略，at-most-once、at-least-once，默认是at-most-once
     * @param DeadLetterStrategy 仲裁队列死信一致性策略，at-most-once、at-least-once，默认是at-most-once
     */
    public void setDeadLetterStrategy(String DeadLetterStrategy) {
        this.DeadLetterStrategy = DeadLetterStrategy;
    }

    /**
     * Get 仲裁队列的领导者选举策略，client-local、balanced，默认是client-local 
     * @return QueueLeaderLocator 仲裁队列的领导者选举策略，client-local、balanced，默认是client-local
     */
    public String getQueueLeaderLocator() {
        return this.QueueLeaderLocator;
    }

    /**
     * Set 仲裁队列的领导者选举策略，client-local、balanced，默认是client-local
     * @param QueueLeaderLocator 仲裁队列的领导者选举策略，client-local、balanced，默认是client-local
     */
    public void setQueueLeaderLocator(String QueueLeaderLocator) {
        this.QueueLeaderLocator = QueueLeaderLocator;
    }

    /**
     * Get 仲裁队列的初始副本组大小，默认3 
     * @return QuorumInitialGroupSize 仲裁队列的初始副本组大小，默认3
     */
    public Long getQuorumInitialGroupSize() {
        return this.QuorumInitialGroupSize;
    }

    /**
     * Set 仲裁队列的初始副本组大小，默认3
     * @param QuorumInitialGroupSize 仲裁队列的初始副本组大小，默认3
     */
    public void setQuorumInitialGroupSize(Long QuorumInitialGroupSize) {
        this.QuorumInitialGroupSize = QuorumInitialGroupSize;
    }

    public CreateRabbitMQServerlessQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQServerlessQueueRequest(CreateRabbitMQServerlessQueueRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageTTL != null) {
            this.MessageTTL = new Long(source.MessageTTL);
        }
        if (source.AutoExpire != null) {
            this.AutoExpire = new Long(source.AutoExpire);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.MaxLengthBytes != null) {
            this.MaxLengthBytes = new Long(source.MaxLengthBytes);
        }
        if (source.DeliveryLimit != null) {
            this.DeliveryLimit = new Long(source.DeliveryLimit);
        }
        if (source.OverflowBehaviour != null) {
            this.OverflowBehaviour = new String(source.OverflowBehaviour);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
        if (source.SingleActiveConsumer != null) {
            this.SingleActiveConsumer = new Boolean(source.SingleActiveConsumer);
        }
        if (source.MaximumPriority != null) {
            this.MaximumPriority = new Long(source.MaximumPriority);
        }
        if (source.LazyMode != null) {
            this.LazyMode = new Boolean(source.LazyMode);
        }
        if (source.MasterLocator != null) {
            this.MasterLocator = new String(source.MasterLocator);
        }
        if (source.MaxInMemoryLength != null) {
            this.MaxInMemoryLength = new Long(source.MaxInMemoryLength);
        }
        if (source.MaxInMemoryBytes != null) {
            this.MaxInMemoryBytes = new Long(source.MaxInMemoryBytes);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.DeadLetterStrategy != null) {
            this.DeadLetterStrategy = new String(source.DeadLetterStrategy);
        }
        if (source.QueueLeaderLocator != null) {
            this.QueueLeaderLocator = new String(source.QueueLeaderLocator);
        }
        if (source.QuorumInitialGroupSize != null) {
            this.QuorumInitialGroupSize = new Long(source.QuorumInitialGroupSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageTTL", this.MessageTTL);
        this.setParamSimple(map, prefix + "AutoExpire", this.AutoExpire);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamSimple(map, prefix + "MaxLengthBytes", this.MaxLengthBytes);
        this.setParamSimple(map, prefix + "DeliveryLimit", this.DeliveryLimit);
        this.setParamSimple(map, prefix + "OverflowBehaviour", this.OverflowBehaviour);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);
        this.setParamSimple(map, prefix + "SingleActiveConsumer", this.SingleActiveConsumer);
        this.setParamSimple(map, prefix + "MaximumPriority", this.MaximumPriority);
        this.setParamSimple(map, prefix + "LazyMode", this.LazyMode);
        this.setParamSimple(map, prefix + "MasterLocator", this.MasterLocator);
        this.setParamSimple(map, prefix + "MaxInMemoryLength", this.MaxInMemoryLength);
        this.setParamSimple(map, prefix + "MaxInMemoryBytes", this.MaxInMemoryBytes);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "DeadLetterStrategy", this.DeadLetterStrategy);
        this.setParamSimple(map, prefix + "QueueLeaderLocator", this.QueueLeaderLocator);
        this.setParamSimple(map, prefix + "QuorumInitialGroupSize", this.QuorumInitialGroupSize);

    }
}

