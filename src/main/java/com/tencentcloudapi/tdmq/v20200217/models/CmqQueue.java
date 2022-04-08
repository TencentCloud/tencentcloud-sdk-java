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

public class CmqQueue extends AbstractModel{

    /**
    * 消息队列ID。
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * 消息队列名字。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 每秒钟生产消息条数的限制，消费消息的大小是该值的1.1倍。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 带宽限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bps")
    @Expose
    private Long Bps;

    /**
    * 飞行消息最大保留时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDelaySeconds")
    @Expose
    private Long MaxDelaySeconds;

    /**
    * 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * 消息接收长轮询等待时间。取值范围0 - 30秒，默认值0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * 消息保留周期。取值范围60-1296000秒（1min-15天），默认值345600秒（4 天）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 消息可见性超时。取值范围1 - 43200秒（即12小时内），默认值30。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * 消息最大长度。取值范围1024 - 1048576 Byte（即1K - 1024K），默认值65536。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * 回溯队列的消息回溯时间最大值，取值范围0 - 43200秒，0表示不开启消息回溯。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * 队列的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后一次修改队列属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * 在队列中处于 Active 状态（不处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveMsgNum")
    @Expose
    private Long ActiveMsgNum;

    /**
    * 在队列中处于 Inactive 状态（正处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InactiveMsgNum")
    @Expose
    private Long InactiveMsgNum;

    /**
    * 延迟消息数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayMsgNum")
    @Expose
    private Long DelayMsgNum;

    /**
    * 已调用 DelMsg 接口删除，但还在回溯保留时间内的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewindMsgNum")
    @Expose
    private Long RewindMsgNum;

    /**
    * 消息最小未消费时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinMsgTime")
    @Expose
    private Long MinMsgTime;

    /**
    * 事务消息队列。true表示是事务消息，false表示不是事务消息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transaction")
    @Expose
    private Boolean Transaction;

    /**
    * 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterSource")
    @Expose
    private CmqDeadLetterSource [] DeadLetterSource;

    /**
    * 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterPolicy")
    @Expose
    private CmqDeadLetterPolicy DeadLetterPolicy;

    /**
    * 事务消息策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionPolicy")
    @Expose
    private CmqTransactionPolicy TransactionPolicy;

    /**
    * 创建者Uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最大未确认消息数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxUnackedMsgNum")
    @Expose
    private Long MaxUnackedMsgNum;

    /**
    * 最大消息堆积大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMsgBacklogSize")
    @Expose
    private Long MaxMsgBacklogSize;

    /**
    * 队列可回溯存储空间，取值范围1024MB - 10240MB，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionSizeInMB")
    @Expose
    private Long RetentionSizeInMB;

    /**
     * Get 消息队列ID。 
     * @return QueueId 消息队列ID。
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set 消息队列ID。
     * @param QueueId 消息队列ID。
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get 消息队列名字。 
     * @return QueueName 消息队列名字。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 消息队列名字。
     * @param QueueName 消息队列名字。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 每秒钟生产消息条数的限制，消费消息的大小是该值的1.1倍。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps 每秒钟生产消息条数的限制，消费消息的大小是该值的1.1倍。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒钟生产消息条数的限制，消费消息的大小是该值的1.1倍。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps 每秒钟生产消息条数的限制，消费消息的大小是该值的1.1倍。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 带宽限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bps 带宽限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBps() {
        return this.Bps;
    }

    /**
     * Set 带宽限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bps 带宽限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBps(Long Bps) {
        this.Bps = Bps;
    }

    /**
     * Get 飞行消息最大保留时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDelaySeconds 飞行消息最大保留时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDelaySeconds() {
        return this.MaxDelaySeconds;
    }

    /**
     * Set 飞行消息最大保留时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDelaySeconds 飞行消息最大保留时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDelaySeconds(Long MaxDelaySeconds) {
        this.MaxDelaySeconds = MaxDelaySeconds;
    }

    /**
     * Get 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。 
     * @return MaxMsgHeapNum 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     * @param MaxMsgHeapNum 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get 消息接收长轮询等待时间。取值范围0 - 30秒，默认值0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PollingWaitSeconds 消息接收长轮询等待时间。取值范围0 - 30秒，默认值0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set 消息接收长轮询等待时间。取值范围0 - 30秒，默认值0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PollingWaitSeconds 消息接收长轮询等待时间。取值范围0 - 30秒，默认值0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get 消息保留周期。取值范围60-1296000秒（1min-15天），默认值345600秒（4 天）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRetentionSeconds 消息保留周期。取值范围60-1296000秒（1min-15天），默认值345600秒（4 天）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set 消息保留周期。取值范围60-1296000秒（1min-15天），默认值345600秒（4 天）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRetentionSeconds 消息保留周期。取值范围60-1296000秒（1min-15天），默认值345600秒（4 天）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 消息可见性超时。取值范围1 - 43200秒（即12小时内），默认值30。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisibilityTimeout 消息可见性超时。取值范围1 - 43200秒（即12小时内），默认值30。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set 消息可见性超时。取值范围1 - 43200秒（即12小时内），默认值30。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisibilityTimeout 消息可见性超时。取值范围1 - 43200秒（即12小时内），默认值30。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get 消息最大长度。取值范围1024 - 1048576 Byte（即1K - 1024K），默认值65536。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMsgSize 消息最大长度。取值范围1024 - 1048576 Byte（即1K - 1024K），默认值65536。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set 消息最大长度。取值范围1024 - 1048576 Byte（即1K - 1024K），默认值65536。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMsgSize 消息最大长度。取值范围1024 - 1048576 Byte（即1K - 1024K），默认值65536。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get 回溯队列的消息回溯时间最大值，取值范围0 - 43200秒，0表示不开启消息回溯。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewindSeconds 回溯队列的消息回溯时间最大值，取值范围0 - 43200秒，0表示不开启消息回溯。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set 回溯队列的消息回溯时间最大值，取值范围0 - 43200秒，0表示不开启消息回溯。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewindSeconds 回溯队列的消息回溯时间最大值，取值范围0 - 43200秒，0表示不开启消息回溯。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get 队列的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 队列的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 队列的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 队列的创建时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次修改队列属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime 最后一次修改队列属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set 最后一次修改队列属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime 最后一次修改队列属性的时间。返回 Unix 时间戳，精确到毫秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get 在队列中处于 Active 状态（不处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveMsgNum 在队列中处于 Active 状态（不处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveMsgNum() {
        return this.ActiveMsgNum;
    }

    /**
     * Set 在队列中处于 Active 状态（不处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveMsgNum 在队列中处于 Active 状态（不处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveMsgNum(Long ActiveMsgNum) {
        this.ActiveMsgNum = ActiveMsgNum;
    }

    /**
     * Get 在队列中处于 Inactive 状态（正处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InactiveMsgNum 在队列中处于 Inactive 状态（正处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInactiveMsgNum() {
        return this.InactiveMsgNum;
    }

    /**
     * Set 在队列中处于 Inactive 状态（正处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InactiveMsgNum 在队列中处于 Inactive 状态（正处于被消费状态）的消息总数，为近似值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInactiveMsgNum(Long InactiveMsgNum) {
        this.InactiveMsgNum = InactiveMsgNum;
    }

    /**
     * Get 延迟消息数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayMsgNum 延迟消息数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayMsgNum() {
        return this.DelayMsgNum;
    }

    /**
     * Set 延迟消息数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayMsgNum 延迟消息数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayMsgNum(Long DelayMsgNum) {
        this.DelayMsgNum = DelayMsgNum;
    }

    /**
     * Get 已调用 DelMsg 接口删除，但还在回溯保留时间内的消息数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewindMsgNum 已调用 DelMsg 接口删除，但还在回溯保留时间内的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRewindMsgNum() {
        return this.RewindMsgNum;
    }

    /**
     * Set 已调用 DelMsg 接口删除，但还在回溯保留时间内的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewindMsgNum 已调用 DelMsg 接口删除，但还在回溯保留时间内的消息数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewindMsgNum(Long RewindMsgNum) {
        this.RewindMsgNum = RewindMsgNum;
    }

    /**
     * Get 消息最小未消费时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinMsgTime 消息最小未消费时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinMsgTime() {
        return this.MinMsgTime;
    }

    /**
     * Set 消息最小未消费时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinMsgTime 消息最小未消费时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinMsgTime(Long MinMsgTime) {
        this.MinMsgTime = MinMsgTime;
    }

    /**
     * Get 事务消息队列。true表示是事务消息，false表示不是事务消息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transaction 事务消息队列。true表示是事务消息，false表示不是事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTransaction() {
        return this.Transaction;
    }

    /**
     * Set 事务消息队列。true表示是事务消息，false表示不是事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transaction 事务消息队列。true表示是事务消息，false表示不是事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransaction(Boolean Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get 死信队列。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterSource 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CmqDeadLetterSource [] getDeadLetterSource() {
        return this.DeadLetterSource;
    }

    /**
     * Set 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterSource 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterSource(CmqDeadLetterSource [] DeadLetterSource) {
        this.DeadLetterSource = DeadLetterSource;
    }

    /**
     * Get 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterPolicy 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CmqDeadLetterPolicy getDeadLetterPolicy() {
        return this.DeadLetterPolicy;
    }

    /**
     * Set 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterPolicy 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterPolicy(CmqDeadLetterPolicy DeadLetterPolicy) {
        this.DeadLetterPolicy = DeadLetterPolicy;
    }

    /**
     * Get 事务消息策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionPolicy 事务消息策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CmqTransactionPolicy getTransactionPolicy() {
        return this.TransactionPolicy;
    }

    /**
     * Set 事务消息策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionPolicy 事务消息策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionPolicy(CmqTransactionPolicy TransactionPolicy) {
        this.TransactionPolicy = TransactionPolicy;
    }

    /**
     * Get 创建者Uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建者Uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者Uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建者Uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trace 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trace 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 最大未确认消息数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxUnackedMsgNum 最大未确认消息数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxUnackedMsgNum() {
        return this.MaxUnackedMsgNum;
    }

    /**
     * Set 最大未确认消息数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxUnackedMsgNum 最大未确认消息数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxUnackedMsgNum(Long MaxUnackedMsgNum) {
        this.MaxUnackedMsgNum = MaxUnackedMsgNum;
    }

    /**
     * Get 最大消息堆积大小（字节）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMsgBacklogSize 最大消息堆积大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMsgBacklogSize() {
        return this.MaxMsgBacklogSize;
    }

    /**
     * Set 最大消息堆积大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMsgBacklogSize 最大消息堆积大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMsgBacklogSize(Long MaxMsgBacklogSize) {
        this.MaxMsgBacklogSize = MaxMsgBacklogSize;
    }

    /**
     * Get 队列可回溯存储空间，取值范围1024MB - 10240MB，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionSizeInMB 队列可回溯存储空间，取值范围1024MB - 10240MB，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionSizeInMB() {
        return this.RetentionSizeInMB;
    }

    /**
     * Set 队列可回溯存储空间，取值范围1024MB - 10240MB，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionSizeInMB 队列可回溯存储空间，取值范围1024MB - 10240MB，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionSizeInMB(Long RetentionSizeInMB) {
        this.RetentionSizeInMB = RetentionSizeInMB;
    }

    public CmqQueue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqQueue(CmqQueue source) {
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Bps != null) {
            this.Bps = new Long(source.Bps);
        }
        if (source.MaxDelaySeconds != null) {
            this.MaxDelaySeconds = new Long(source.MaxDelaySeconds);
        }
        if (source.MaxMsgHeapNum != null) {
            this.MaxMsgHeapNum = new Long(source.MaxMsgHeapNum);
        }
        if (source.PollingWaitSeconds != null) {
            this.PollingWaitSeconds = new Long(source.PollingWaitSeconds);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.VisibilityTimeout != null) {
            this.VisibilityTimeout = new Long(source.VisibilityTimeout);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.RewindSeconds != null) {
            this.RewindSeconds = new Long(source.RewindSeconds);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.ActiveMsgNum != null) {
            this.ActiveMsgNum = new Long(source.ActiveMsgNum);
        }
        if (source.InactiveMsgNum != null) {
            this.InactiveMsgNum = new Long(source.InactiveMsgNum);
        }
        if (source.DelayMsgNum != null) {
            this.DelayMsgNum = new Long(source.DelayMsgNum);
        }
        if (source.RewindMsgNum != null) {
            this.RewindMsgNum = new Long(source.RewindMsgNum);
        }
        if (source.MinMsgTime != null) {
            this.MinMsgTime = new Long(source.MinMsgTime);
        }
        if (source.Transaction != null) {
            this.Transaction = new Boolean(source.Transaction);
        }
        if (source.DeadLetterSource != null) {
            this.DeadLetterSource = new CmqDeadLetterSource[source.DeadLetterSource.length];
            for (int i = 0; i < source.DeadLetterSource.length; i++) {
                this.DeadLetterSource[i] = new CmqDeadLetterSource(source.DeadLetterSource[i]);
            }
        }
        if (source.DeadLetterPolicy != null) {
            this.DeadLetterPolicy = new CmqDeadLetterPolicy(source.DeadLetterPolicy);
        }
        if (source.TransactionPolicy != null) {
            this.TransactionPolicy = new CmqTransactionPolicy(source.TransactionPolicy);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MaxUnackedMsgNum != null) {
            this.MaxUnackedMsgNum = new Long(source.MaxUnackedMsgNum);
        }
        if (source.MaxMsgBacklogSize != null) {
            this.MaxMsgBacklogSize = new Long(source.MaxMsgBacklogSize);
        }
        if (source.RetentionSizeInMB != null) {
            this.RetentionSizeInMB = new Long(source.RetentionSizeInMB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Bps", this.Bps);
        this.setParamSimple(map, prefix + "MaxDelaySeconds", this.MaxDelaySeconds);
        this.setParamSimple(map, prefix + "MaxMsgHeapNum", this.MaxMsgHeapNum);
        this.setParamSimple(map, prefix + "PollingWaitSeconds", this.PollingWaitSeconds);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "VisibilityTimeout", this.VisibilityTimeout);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "RewindSeconds", this.RewindSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "ActiveMsgNum", this.ActiveMsgNum);
        this.setParamSimple(map, prefix + "InactiveMsgNum", this.InactiveMsgNum);
        this.setParamSimple(map, prefix + "DelayMsgNum", this.DelayMsgNum);
        this.setParamSimple(map, prefix + "RewindMsgNum", this.RewindMsgNum);
        this.setParamSimple(map, prefix + "MinMsgTime", this.MinMsgTime);
        this.setParamSimple(map, prefix + "Transaction", this.Transaction);
        this.setParamArrayObj(map, prefix + "DeadLetterSource.", this.DeadLetterSource);
        this.setParamObj(map, prefix + "DeadLetterPolicy.", this.DeadLetterPolicy);
        this.setParamObj(map, prefix + "TransactionPolicy.", this.TransactionPolicy);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxUnackedMsgNum", this.MaxUnackedMsgNum);
        this.setParamSimple(map, prefix + "MaxMsgBacklogSize", this.MaxMsgBacklogSize);
        this.setParamSimple(map, prefix + "RetentionSizeInMB", this.RetentionSizeInMB);

    }
}

