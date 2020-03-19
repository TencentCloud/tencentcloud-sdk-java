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

public class DeadLetterPolicy extends AbstractModel{

    /**
    * DeadLetterQueueName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * DeadLetterQueue
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterQueue")
    @Expose
    private String DeadLetterQueue;

    /**
    * Policy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * MaxTimeToLive
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * MaxReceiveCount
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
     * Get DeadLetterQueueName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterQueueName DeadLetterQueueName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set DeadLetterQueueName
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterQueueName DeadLetterQueueName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get DeadLetterQueue
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterQueue DeadLetterQueue
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadLetterQueue() {
        return this.DeadLetterQueue;
    }

    /**
     * Set DeadLetterQueue
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterQueue DeadLetterQueue
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterQueue(String DeadLetterQueue) {
        this.DeadLetterQueue = DeadLetterQueue;
    }

    /**
     * Get Policy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy Policy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Policy
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy Policy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get MaxTimeToLive
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTimeToLive MaxTimeToLive
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set MaxTimeToLive
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTimeToLive MaxTimeToLive
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get MaxReceiveCount
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxReceiveCount MaxReceiveCount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set MaxReceiveCount
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxReceiveCount MaxReceiveCount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "DeadLetterQueue", this.DeadLetterQueue);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);

    }
}

