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

public class DescribeRabbitMQQueueDetailResponse extends AbstractModel {

    /**
    * 队列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 队列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 队列类型,取值classic或quorum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 在线消费者数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consumers")
    @Expose
    private Long Consumers;

    /**
    * 持久标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * 自动清除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * MessageTTL参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * AutoExpire参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoExpire")
    @Expose
    private Long AutoExpire;

    /**
    * MaxLength参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * MaxLengthBytes参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxLengthBytes")
    @Expose
    private Long MaxLengthBytes;

    /**
    * DeliveryLimit参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryLimit")
    @Expose
    private Long DeliveryLimit;

    /**
    * OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverflowBehaviour")
    @Expose
    private String OverflowBehaviour;

    /**
    * DeadLetterExchange参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * DeadLetterRoutingKey参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
    * SingleActiveConsumer参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SingleActiveConsumer")
    @Expose
    private Boolean SingleActiveConsumer;

    /**
    * MaximumPriority参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaximumPriority")
    @Expose
    private Long MaximumPriority;

    /**
    * LazyMode参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LazyMode")
    @Expose
    private Boolean LazyMode;

    /**
    * MasterLocator参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterLocator")
    @Expose
    private String MasterLocator;

    /**
    * MaxInMemoryLength参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxInMemoryLength")
    @Expose
    private Long MaxInMemoryLength;

    /**
    * MaxInMemoryBytes参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxInMemoryBytes")
    @Expose
    private Long MaxInMemoryBytes;

    /**
    * 创建时间戳,单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 队列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHost Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHost Vhost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 队列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueName 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueName 队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 队列类型,取值classic或quorum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueType 队列类型,取值classic或quorum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型,取值classic或quorum
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueType 队列类型,取值classic或quorum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 在线消费者数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Consumers 在线消费者数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConsumers() {
        return this.Consumers;
    }

    /**
     * Set 在线消费者数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Consumers 在线消费者数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumers(Long Consumers) {
        this.Consumers = Consumers;
    }

    /**
     * Get 持久标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Durable 持久标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set 持久标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param Durable 持久标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get 自动清除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoDelete 自动清除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 自动清除
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoDelete 自动清除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get MessageTTL参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTTL MessageTTL参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set MessageTTL参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTTL MessageTTL参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get AutoExpire参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoExpire AutoExpire参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoExpire() {
        return this.AutoExpire;
    }

    /**
     * Set AutoExpire参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoExpire AutoExpire参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoExpire(Long AutoExpire) {
        this.AutoExpire = AutoExpire;
    }

    /**
     * Get MaxLength参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxLength MaxLength参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set MaxLength参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxLength MaxLength参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get MaxLengthBytes参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxLengthBytes MaxLengthBytes参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxLengthBytes() {
        return this.MaxLengthBytes;
    }

    /**
     * Set MaxLengthBytes参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxLengthBytes MaxLengthBytes参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxLengthBytes(Long MaxLengthBytes) {
        this.MaxLengthBytes = MaxLengthBytes;
    }

    /**
     * Get DeliveryLimit参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryLimit DeliveryLimit参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeliveryLimit() {
        return this.DeliveryLimit;
    }

    /**
     * Set DeliveryLimit参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryLimit DeliveryLimit参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryLimit(Long DeliveryLimit) {
        this.DeliveryLimit = DeliveryLimit;
    }

    /**
     * Get OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverflowBehaviour OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOverflowBehaviour() {
        return this.OverflowBehaviour;
    }

    /**
     * Set OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverflowBehaviour OverflowBehaviour参数,取值为drop-head, reject-publish或reject-publish-dlx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverflowBehaviour(String OverflowBehaviour) {
        this.OverflowBehaviour = OverflowBehaviour;
    }

    /**
     * Get DeadLetterExchange参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterExchange DeadLetterExchange参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set DeadLetterExchange参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterExchange DeadLetterExchange参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get DeadLetterRoutingKey参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterRoutingKey DeadLetterRoutingKey参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set DeadLetterRoutingKey参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterRoutingKey DeadLetterRoutingKey参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    /**
     * Get SingleActiveConsumer参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SingleActiveConsumer SingleActiveConsumer参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSingleActiveConsumer() {
        return this.SingleActiveConsumer;
    }

    /**
     * Set SingleActiveConsumer参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SingleActiveConsumer SingleActiveConsumer参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingleActiveConsumer(Boolean SingleActiveConsumer) {
        this.SingleActiveConsumer = SingleActiveConsumer;
    }

    /**
     * Get MaximumPriority参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaximumPriority MaximumPriority参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaximumPriority() {
        return this.MaximumPriority;
    }

    /**
     * Set MaximumPriority参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaximumPriority MaximumPriority参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaximumPriority(Long MaximumPriority) {
        this.MaximumPriority = MaximumPriority;
    }

    /**
     * Get LazyMode参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LazyMode LazyMode参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLazyMode() {
        return this.LazyMode;
    }

    /**
     * Set LazyMode参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LazyMode LazyMode参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLazyMode(Boolean LazyMode) {
        this.LazyMode = LazyMode;
    }

    /**
     * Get MasterLocator参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterLocator MasterLocator参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterLocator() {
        return this.MasterLocator;
    }

    /**
     * Set MasterLocator参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterLocator MasterLocator参数,classic类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterLocator(String MasterLocator) {
        this.MasterLocator = MasterLocator;
    }

    /**
     * Get MaxInMemoryLength参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxInMemoryLength MaxInMemoryLength参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxInMemoryLength() {
        return this.MaxInMemoryLength;
    }

    /**
     * Set MaxInMemoryLength参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxInMemoryLength MaxInMemoryLength参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxInMemoryLength(Long MaxInMemoryLength) {
        this.MaxInMemoryLength = MaxInMemoryLength;
    }

    /**
     * Get MaxInMemoryBytes参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxInMemoryBytes MaxInMemoryBytes参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxInMemoryBytes() {
        return this.MaxInMemoryBytes;
    }

    /**
     * Set MaxInMemoryBytes参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxInMemoryBytes MaxInMemoryBytes参数,quorum类型专用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxInMemoryBytes(Long MaxInMemoryBytes) {
        this.MaxInMemoryBytes = MaxInMemoryBytes;
    }

    /**
     * Get 创建时间戳,单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间戳,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间戳,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Node 节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set 节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Node 节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQQueueDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQQueueDetailResponse(DescribeRabbitMQQueueDetailResponse source) {
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
        if (source.Consumers != null) {
            this.Consumers = new Long(source.Consumers);
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "Consumers", this.Consumers);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

