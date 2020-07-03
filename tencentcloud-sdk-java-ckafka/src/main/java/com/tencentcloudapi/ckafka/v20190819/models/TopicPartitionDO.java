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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicPartitionDO extends AbstractModel{

    /**
    * Partition ID
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Leader 运行状态
    */
    @SerializedName("LeaderStatus")
    @Expose
    private Long LeaderStatus;

    /**
    * ISR 个数
    */
    @SerializedName("IsrNum")
    @Expose
    private Long IsrNum;

    /**
    * 副本个数
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
     * Get Partition ID 
     * @return Partition Partition ID
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition ID
     * @param Partition Partition ID
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Leader 运行状态 
     * @return LeaderStatus Leader 运行状态
     */
    public Long getLeaderStatus() {
        return this.LeaderStatus;
    }

    /**
     * Set Leader 运行状态
     * @param LeaderStatus Leader 运行状态
     */
    public void setLeaderStatus(Long LeaderStatus) {
        this.LeaderStatus = LeaderStatus;
    }

    /**
     * Get ISR 个数 
     * @return IsrNum ISR 个数
     */
    public Long getIsrNum() {
        return this.IsrNum;
    }

    /**
     * Set ISR 个数
     * @param IsrNum ISR 个数
     */
    public void setIsrNum(Long IsrNum) {
        this.IsrNum = IsrNum;
    }

    /**
     * Get 副本个数 
     * @return ReplicaNum 副本个数
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本个数
     * @param ReplicaNum 副本个数
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "LeaderStatus", this.LeaderStatus);
        this.setParamSimple(map, prefix + "IsrNum", this.IsrNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);

    }
}

