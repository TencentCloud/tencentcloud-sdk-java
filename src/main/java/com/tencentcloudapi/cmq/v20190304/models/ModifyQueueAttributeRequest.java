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

public class ModifyQueueAttributeRequest extends AbstractModel{

    /**
    * QueueName
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * MaxMsgHeapNum
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * PollingWaitSeconds
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * VisibilityTimeout
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * MaxMsgSize
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * MsgRetentionSeconds
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * RewindSeconds
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * FirstQueryInterval
    */
    @SerializedName("FirstQueryInterval")
    @Expose
    private Long FirstQueryInterval;

    /**
    * MaxQueryCount
    */
    @SerializedName("MaxQueryCount")
    @Expose
    private Long MaxQueryCount;

    /**
    * DeadLetterQueueName
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * MaxTimeToLive
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * MaxReceiveCount
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
    * Policy
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

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
     * Get MaxMsgHeapNum 
     * @return MaxMsgHeapNum MaxMsgHeapNum
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set MaxMsgHeapNum
     * @param MaxMsgHeapNum MaxMsgHeapNum
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get PollingWaitSeconds 
     * @return PollingWaitSeconds PollingWaitSeconds
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set PollingWaitSeconds
     * @param PollingWaitSeconds PollingWaitSeconds
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get VisibilityTimeout 
     * @return VisibilityTimeout VisibilityTimeout
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set VisibilityTimeout
     * @param VisibilityTimeout VisibilityTimeout
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get MaxMsgSize 
     * @return MaxMsgSize MaxMsgSize
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
     * @param MaxMsgSize MaxMsgSize
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get MsgRetentionSeconds 
     * @return MsgRetentionSeconds MsgRetentionSeconds
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
     * @param MsgRetentionSeconds MsgRetentionSeconds
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get RewindSeconds 
     * @return RewindSeconds RewindSeconds
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set RewindSeconds
     * @param RewindSeconds RewindSeconds
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get FirstQueryInterval 
     * @return FirstQueryInterval FirstQueryInterval
     */
    public Long getFirstQueryInterval() {
        return this.FirstQueryInterval;
    }

    /**
     * Set FirstQueryInterval
     * @param FirstQueryInterval FirstQueryInterval
     */
    public void setFirstQueryInterval(Long FirstQueryInterval) {
        this.FirstQueryInterval = FirstQueryInterval;
    }

    /**
     * Get MaxQueryCount 
     * @return MaxQueryCount MaxQueryCount
     */
    public Long getMaxQueryCount() {
        return this.MaxQueryCount;
    }

    /**
     * Set MaxQueryCount
     * @param MaxQueryCount MaxQueryCount
     */
    public void setMaxQueryCount(Long MaxQueryCount) {
        this.MaxQueryCount = MaxQueryCount;
    }

    /**
     * Get DeadLetterQueueName 
     * @return DeadLetterQueueName DeadLetterQueueName
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set DeadLetterQueueName
     * @param DeadLetterQueueName DeadLetterQueueName
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get MaxTimeToLive 
     * @return MaxTimeToLive MaxTimeToLive
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set MaxTimeToLive
     * @param MaxTimeToLive MaxTimeToLive
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get MaxReceiveCount 
     * @return MaxReceiveCount MaxReceiveCount
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set MaxReceiveCount
     * @param MaxReceiveCount MaxReceiveCount
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    /**
     * Get Policy 
     * @return Policy Policy
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Policy
     * @param Policy Policy
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。 
     * @return Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     * @param Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MaxMsgHeapNum", this.MaxMsgHeapNum);
        this.setParamSimple(map, prefix + "PollingWaitSeconds", this.PollingWaitSeconds);
        this.setParamSimple(map, prefix + "VisibilityTimeout", this.VisibilityTimeout);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "RewindSeconds", this.RewindSeconds);
        this.setParamSimple(map, prefix + "FirstQueryInterval", this.FirstQueryInterval);
        this.setParamSimple(map, prefix + "MaxQueryCount", this.MaxQueryCount);
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

