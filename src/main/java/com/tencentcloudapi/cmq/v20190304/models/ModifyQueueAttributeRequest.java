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
    * 队列名字，在单个地域同一帐号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * 消息保留周期。取值范围 60-1296000 秒（1min-15天），默认值 345600 (4 天)。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 消息最长回溯时间，取值范围0-msgRetentionSeconds，消息的最大回溯之间为消息在队列中的保存周期，0表示不开启消息回溯。
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * 第一次查询时间
    */
    @SerializedName("FirstQueryInterval")
    @Expose
    private Long FirstQueryInterval;

    /**
    * 最大查询次数
    */
    @SerializedName("MaxQueryCount")
    @Expose
    private Long MaxQueryCount;

    /**
    * 死信队列名称
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * MaxTimeToLivepolicy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * 最大接收次数
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
    * 死信队列策略
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
     * Get 队列名字，在单个地域同一帐号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。 
     * @return QueueName 队列名字，在单个地域同一帐号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名字，在单个地域同一帐号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     * @param QueueName 队列名字，在单个地域同一帐号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
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
     * Get 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。 
     * @return PollingWaitSeconds 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     * @param PollingWaitSeconds 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。 
     * @return VisibilityTimeout 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     * @param VisibilityTimeout 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。 
     * @return MaxMsgSize 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     * @param MaxMsgSize 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get 消息保留周期。取值范围 60-1296000 秒（1min-15天），默认值 345600 (4 天)。 
     * @return MsgRetentionSeconds 消息保留周期。取值范围 60-1296000 秒（1min-15天），默认值 345600 (4 天)。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set 消息保留周期。取值范围 60-1296000 秒（1min-15天），默认值 345600 (4 天)。
     * @param MsgRetentionSeconds 消息保留周期。取值范围 60-1296000 秒（1min-15天），默认值 345600 (4 天)。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 消息最长回溯时间，取值范围0-msgRetentionSeconds，消息的最大回溯之间为消息在队列中的保存周期，0表示不开启消息回溯。 
     * @return RewindSeconds 消息最长回溯时间，取值范围0-msgRetentionSeconds，消息的最大回溯之间为消息在队列中的保存周期，0表示不开启消息回溯。
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set 消息最长回溯时间，取值范围0-msgRetentionSeconds，消息的最大回溯之间为消息在队列中的保存周期，0表示不开启消息回溯。
     * @param RewindSeconds 消息最长回溯时间，取值范围0-msgRetentionSeconds，消息的最大回溯之间为消息在队列中的保存周期，0表示不开启消息回溯。
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get 第一次查询时间 
     * @return FirstQueryInterval 第一次查询时间
     */
    public Long getFirstQueryInterval() {
        return this.FirstQueryInterval;
    }

    /**
     * Set 第一次查询时间
     * @param FirstQueryInterval 第一次查询时间
     */
    public void setFirstQueryInterval(Long FirstQueryInterval) {
        this.FirstQueryInterval = FirstQueryInterval;
    }

    /**
     * Get 最大查询次数 
     * @return MaxQueryCount 最大查询次数
     */
    public Long getMaxQueryCount() {
        return this.MaxQueryCount;
    }

    /**
     * Set 最大查询次数
     * @param MaxQueryCount 最大查询次数
     */
    public void setMaxQueryCount(Long MaxQueryCount) {
        this.MaxQueryCount = MaxQueryCount;
    }

    /**
     * Get 死信队列名称 
     * @return DeadLetterQueueName 死信队列名称
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set 死信队列名称
     * @param DeadLetterQueueName 死信队列名称
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get MaxTimeToLivepolicy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds 
     * @return MaxTimeToLive MaxTimeToLivepolicy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set MaxTimeToLivepolicy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds
     * @param MaxTimeToLive MaxTimeToLivepolicy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get 最大接收次数 
     * @return MaxReceiveCount 最大接收次数
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set 最大接收次数
     * @param MaxReceiveCount 最大接收次数
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    /**
     * Get 死信队列策略 
     * @return Policy 死信队列策略
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set 死信队列策略
     * @param Policy 死信队列策略
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

