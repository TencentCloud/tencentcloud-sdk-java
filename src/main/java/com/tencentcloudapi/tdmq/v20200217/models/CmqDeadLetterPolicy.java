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

public class CmqDeadLetterPolicy extends AbstractModel{

    /**
    * 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterQueue")
    @Expose
    private String DeadLetterQueue;

    /**
    * 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * 最大未消费过期时间。Policy为1时必选。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * 最大接收次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
     * Get 死信队列。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterQueue 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterQueue() {
        return this.DeadLetterQueue;
    }

    /**
     * Set 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterQueue 死信队列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterQueue(String DeadLetterQueue) {
        this.DeadLetterQueue = DeadLetterQueue;
    }

    /**
     * Get 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 死信队列策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 最大未消费过期时间。Policy为1时必选。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTimeToLive 最大未消费过期时间。Policy为1时必选。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set 最大未消费过期时间。Policy为1时必选。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTimeToLive 最大未消费过期时间。Policy为1时必选。范围300-43200，单位秒，需要小于消息最大保留时间MsgRetentionSeconds。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get 最大接收次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReceiveCount 最大接收次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set 最大接收次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReceiveCount 最大接收次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    public CmqDeadLetterPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqDeadLetterPolicy(CmqDeadLetterPolicy source) {
        if (source.DeadLetterQueue != null) {
            this.DeadLetterQueue = new String(source.DeadLetterQueue);
        }
        if (source.Policy != null) {
            this.Policy = new Long(source.Policy);
        }
        if (source.MaxTimeToLive != null) {
            this.MaxTimeToLive = new Long(source.MaxTimeToLive);
        }
        if (source.MaxReceiveCount != null) {
            this.MaxReceiveCount = new Long(source.MaxReceiveCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueue", this.DeadLetterQueue);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);

    }
}

