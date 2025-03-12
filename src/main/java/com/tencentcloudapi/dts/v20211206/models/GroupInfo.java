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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * 消费者组账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 消费者组名称
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 消费者组备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段
    */
    @SerializedName("ConsumerGroupOffset")
    @Expose
    private Long ConsumerGroupOffset;

    /**
    * 消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段
    */
    @SerializedName("ConsumerGroupLag")
    @Expose
    private Long ConsumerGroupLag;

    /**
    * 消费延迟(单位为秒)
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * 各分区的消费状态
    */
    @SerializedName("StateOfPartition")
    @Expose
    private MonitorInfo [] StateOfPartition;

    /**
    * 消费者组创建时间，格式为YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 消费者组修改时间，格式为YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作
    */
    @SerializedName("ConsumerGroupState")
    @Expose
    private String ConsumerGroupState;

    /**
    * 每个消费者正在消费的分区
    */
    @SerializedName("PartitionAssignment")
    @Expose
    private PartitionAssignment [] PartitionAssignment;

    /**
     * Get 消费者组账号 
     * @return Account 消费者组账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 消费者组账号
     * @param Account 消费者组账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 消费者组名称 
     * @return ConsumerGroupName 消费者组名称
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 消费者组名称
     * @param ConsumerGroupName 消费者组名称
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 消费者组备注 
     * @return Description 消费者组备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 消费者组备注
     * @param Description 消费者组备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段 
     * @return ConsumerGroupOffset 消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段
     */
    public Long getConsumerGroupOffset() {
        return this.ConsumerGroupOffset;
    }

    /**
     * Set 消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段
     * @param ConsumerGroupOffset 消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段
     */
    public void setConsumerGroupOffset(Long ConsumerGroupOffset) {
        this.ConsumerGroupOffset = ConsumerGroupOffset;
    }

    /**
     * Get 消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段 
     * @return ConsumerGroupLag 消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段
     */
    public Long getConsumerGroupLag() {
        return this.ConsumerGroupLag;
    }

    /**
     * Set 消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段
     * @param ConsumerGroupLag 消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段
     */
    public void setConsumerGroupLag(Long ConsumerGroupLag) {
        this.ConsumerGroupLag = ConsumerGroupLag;
    }

    /**
     * Get 消费延迟(单位为秒) 
     * @return Latency 消费延迟(单位为秒)
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set 消费延迟(单位为秒)
     * @param Latency 消费延迟(单位为秒)
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get 各分区的消费状态 
     * @return StateOfPartition 各分区的消费状态
     */
    public MonitorInfo [] getStateOfPartition() {
        return this.StateOfPartition;
    }

    /**
     * Set 各分区的消费状态
     * @param StateOfPartition 各分区的消费状态
     */
    public void setStateOfPartition(MonitorInfo [] StateOfPartition) {
        this.StateOfPartition = StateOfPartition;
    }

    /**
     * Get 消费者组创建时间，格式为YYYY-MM-DD hh:mm:ss 
     * @return CreatedAt 消费者组创建时间，格式为YYYY-MM-DD hh:mm:ss
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 消费者组创建时间，格式为YYYY-MM-DD hh:mm:ss
     * @param CreatedAt 消费者组创建时间，格式为YYYY-MM-DD hh:mm:ss
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 消费者组修改时间，格式为YYYY-MM-DD hh:mm:ss 
     * @return UpdatedAt 消费者组修改时间，格式为YYYY-MM-DD hh:mm:ss
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 消费者组修改时间，格式为YYYY-MM-DD hh:mm:ss
     * @param UpdatedAt 消费者组修改时间，格式为YYYY-MM-DD hh:mm:ss
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作 
     * @return ConsumerGroupState 消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作
     */
    public String getConsumerGroupState() {
        return this.ConsumerGroupState;
    }

    /**
     * Set 消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作
     * @param ConsumerGroupState 消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作
     */
    public void setConsumerGroupState(String ConsumerGroupState) {
        this.ConsumerGroupState = ConsumerGroupState;
    }

    /**
     * Get 每个消费者正在消费的分区 
     * @return PartitionAssignment 每个消费者正在消费的分区
     */
    public PartitionAssignment [] getPartitionAssignment() {
        return this.PartitionAssignment;
    }

    /**
     * Set 每个消费者正在消费的分区
     * @param PartitionAssignment 每个消费者正在消费的分区
     */
    public void setPartitionAssignment(PartitionAssignment [] PartitionAssignment) {
        this.PartitionAssignment = PartitionAssignment;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsumerGroupOffset != null) {
            this.ConsumerGroupOffset = new Long(source.ConsumerGroupOffset);
        }
        if (source.ConsumerGroupLag != null) {
            this.ConsumerGroupLag = new Long(source.ConsumerGroupLag);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.StateOfPartition != null) {
            this.StateOfPartition = new MonitorInfo[source.StateOfPartition.length];
            for (int i = 0; i < source.StateOfPartition.length; i++) {
                this.StateOfPartition[i] = new MonitorInfo(source.StateOfPartition[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ConsumerGroupState != null) {
            this.ConsumerGroupState = new String(source.ConsumerGroupState);
        }
        if (source.PartitionAssignment != null) {
            this.PartitionAssignment = new PartitionAssignment[source.PartitionAssignment.length];
            for (int i = 0; i < source.PartitionAssignment.length; i++) {
                this.PartitionAssignment[i] = new PartitionAssignment(source.PartitionAssignment[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConsumerGroupOffset", this.ConsumerGroupOffset);
        this.setParamSimple(map, prefix + "ConsumerGroupLag", this.ConsumerGroupLag);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamArrayObj(map, prefix + "StateOfPartition.", this.StateOfPartition);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ConsumerGroupState", this.ConsumerGroupState);
        this.setParamArrayObj(map, prefix + "PartitionAssignment.", this.PartitionAssignment);

    }
}

