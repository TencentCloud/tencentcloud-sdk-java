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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueSet extends AbstractModel{

    /**
    * QueueId
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * QueueName
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Qps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Bps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bps")
    @Expose
    private Long Bps;

    /**
    * MaxDelaySeconds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDelaySeconds")
    @Expose
    private Long MaxDelaySeconds;

    /**
    * MaxMsgHeapNum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * PollingWaitSeconds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * VisibilityTimeout
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * RewindSeconds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * CreateTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * ActiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveMsgNum")
    @Expose
    private Long ActiveMsgNum;

    /**
    * InactiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InactiveMsgNum")
    @Expose
    private Long InactiveMsgNum;

    /**
    * DelayMsgNum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayMsgNum")
    @Expose
    private Long DelayMsgNum;

    /**
    * RewindMsgNum
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewindMsgNum")
    @Expose
    private Long RewindMsgNum;

    /**
    * MinMsgTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinMsgTime")
    @Expose
    private Long MinMsgTime;

    /**
    * Transaction
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transaction")
    @Expose
    private Boolean Transaction;

    /**
    * DeadLetterSource
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterSource")
    @Expose
    private DeadLetterSource [] DeadLetterSource;

    /**
    * DeadLetterPolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterPolicy")
    @Expose
    private DeadLetterPolicy DeadLetterPolicy;

    /**
    * TransactionPolicy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionPolicy")
    @Expose
    private TransactionPolicy TransactionPolicy;

    /**
    * 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 消息轨迹表示，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get QueueId 
     * @return QueueId QueueId
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set QueueId
     * @param QueueId QueueId
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get QueueName 
     * @return QueueName QueueName
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set QueueName
     * @param QueueName QueueName
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Qps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps Qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Qps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps Qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Bps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bps Bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBps() {
        return this.Bps;
    }

    /**
     * Set Bps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bps Bps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBps(Long Bps) {
        this.Bps = Bps;
    }

    /**
     * Get MaxDelaySeconds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDelaySeconds MaxDelaySeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDelaySeconds() {
        return this.MaxDelaySeconds;
    }

    /**
     * Set MaxDelaySeconds
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDelaySeconds MaxDelaySeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDelaySeconds(Long MaxDelaySeconds) {
        this.MaxDelaySeconds = MaxDelaySeconds;
    }

    /**
     * Get MaxMsgHeapNum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMsgHeapNum MaxMsgHeapNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set MaxMsgHeapNum
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMsgHeapNum MaxMsgHeapNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get PollingWaitSeconds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PollingWaitSeconds PollingWaitSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set PollingWaitSeconds
注意：此字段可能返回 null，表示取不到有效值。
     * @param PollingWaitSeconds PollingWaitSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRetentionSeconds MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRetentionSeconds MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get VisibilityTimeout
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisibilityTimeout VisibilityTimeout
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set VisibilityTimeout
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisibilityTimeout VisibilityTimeout
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMsgSize MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMsgSize MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get RewindSeconds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewindSeconds RewindSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set RewindSeconds
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewindSeconds RewindSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get CreateTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get ActiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveMsgNum ActiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveMsgNum() {
        return this.ActiveMsgNum;
    }

    /**
     * Set ActiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveMsgNum ActiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveMsgNum(Long ActiveMsgNum) {
        this.ActiveMsgNum = ActiveMsgNum;
    }

    /**
     * Get InactiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InactiveMsgNum InactiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInactiveMsgNum() {
        return this.InactiveMsgNum;
    }

    /**
     * Set InactiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     * @param InactiveMsgNum InactiveMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInactiveMsgNum(Long InactiveMsgNum) {
        this.InactiveMsgNum = InactiveMsgNum;
    }

    /**
     * Get DelayMsgNum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayMsgNum DelayMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayMsgNum() {
        return this.DelayMsgNum;
    }

    /**
     * Set DelayMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayMsgNum DelayMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayMsgNum(Long DelayMsgNum) {
        this.DelayMsgNum = DelayMsgNum;
    }

    /**
     * Get RewindMsgNum
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewindMsgNum RewindMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRewindMsgNum() {
        return this.RewindMsgNum;
    }

    /**
     * Set RewindMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewindMsgNum RewindMsgNum
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewindMsgNum(Long RewindMsgNum) {
        this.RewindMsgNum = RewindMsgNum;
    }

    /**
     * Get MinMsgTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinMsgTime MinMsgTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinMsgTime() {
        return this.MinMsgTime;
    }

    /**
     * Set MinMsgTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinMsgTime MinMsgTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinMsgTime(Long MinMsgTime) {
        this.MinMsgTime = MinMsgTime;
    }

    /**
     * Get Transaction
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transaction Transaction
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTransaction() {
        return this.Transaction;
    }

    /**
     * Set Transaction
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transaction Transaction
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransaction(Boolean Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get DeadLetterSource
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterSource DeadLetterSource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeadLetterSource [] getDeadLetterSource() {
        return this.DeadLetterSource;
    }

    /**
     * Set DeadLetterSource
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterSource DeadLetterSource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterSource(DeadLetterSource [] DeadLetterSource) {
        this.DeadLetterSource = DeadLetterSource;
    }

    /**
     * Get DeadLetterPolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterPolicy DeadLetterPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeadLetterPolicy getDeadLetterPolicy() {
        return this.DeadLetterPolicy;
    }

    /**
     * Set DeadLetterPolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterPolicy DeadLetterPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterPolicy(DeadLetterPolicy DeadLetterPolicy) {
        this.DeadLetterPolicy = DeadLetterPolicy;
    }

    /**
     * Get TransactionPolicy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionPolicy TransactionPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransactionPolicy getTransactionPolicy() {
        return this.TransactionPolicy;
    }

    /**
     * Set TransactionPolicy
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionPolicy TransactionPolicy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionPolicy(TransactionPolicy TransactionPolicy) {
        this.TransactionPolicy = TransactionPolicy;
    }

    /**
     * Get 创建者uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 消息轨迹表示，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trace 消息轨迹表示，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 消息轨迹表示，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trace 消息轨迹表示，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
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

    }
}

