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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * <p>消费者组账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>消费者组名称</p>
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * <p>消费者组备注</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段</p>
    */
    @SerializedName("ConsumerGroupOffset")
    @Expose
    private Long ConsumerGroupOffset;

    /**
    * <p>消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段</p>
    */
    @SerializedName("ConsumerGroupLag")
    @Expose
    private Long ConsumerGroupLag;

    /**
    * <p>消费延迟(单位为秒)</p>
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * <p>各分区的消费状态</p>
    */
    @SerializedName("StateOfPartition")
    @Expose
    private MonitorInfo [] StateOfPartition;

    /**
    * <p>消费者组创建时间。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>消费者组修改时间。</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作</p>
    */
    @SerializedName("ConsumerGroupState")
    @Expose
    private String ConsumerGroupState;

    /**
    * <p>每个消费者正在消费的分区</p>
    */
    @SerializedName("PartitionAssignment")
    @Expose
    private PartitionAssignment [] PartitionAssignment;

    /**
     * Get <p>消费者组账号</p> 
     * @return Account <p>消费者组账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>消费者组账号</p>
     * @param Account <p>消费者组账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>消费者组名称</p> 
     * @return ConsumerGroupName <p>消费者组名称</p>
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set <p>消费者组名称</p>
     * @param ConsumerGroupName <p>消费者组名称</p>
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get <p>消费者组备注</p> 
     * @return Description <p>消费者组备注</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>消费者组备注</p>
     * @param Description <p>消费者组备注</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段</p> 
     * @return ConsumerGroupOffset <p>消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段</p>
     */
    public Long getConsumerGroupOffset() {
        return this.ConsumerGroupOffset;
    }

    /**
     * Set <p>消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段</p>
     * @param ConsumerGroupOffset <p>消费组偏移量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区的偏移量。各分区的偏移量详见StateOfPartition字段</p>
     */
    public void setConsumerGroupOffset(Long ConsumerGroupOffset) {
        this.ConsumerGroupOffset = ConsumerGroupOffset;
    }

    /**
     * Get <p>消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段</p> 
     * @return ConsumerGroupLag <p>消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段</p>
     */
    public Long getConsumerGroupLag() {
        return this.ConsumerGroupLag;
    }

    /**
     * Set <p>消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段</p>
     * @param ConsumerGroupLag <p>消费组未消费的数据量。该字段是为了兼容以前单Partition的情况，取值为最后一个分区未消费的数据量。各分区未消费数据量详见StateOfPartition字段</p>
     */
    public void setConsumerGroupLag(Long ConsumerGroupLag) {
        this.ConsumerGroupLag = ConsumerGroupLag;
    }

    /**
     * Get <p>消费延迟(单位为秒)</p> 
     * @return Latency <p>消费延迟(单位为秒)</p>
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set <p>消费延迟(单位为秒)</p>
     * @param Latency <p>消费延迟(单位为秒)</p>
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get <p>各分区的消费状态</p> 
     * @return StateOfPartition <p>各分区的消费状态</p>
     */
    public MonitorInfo [] getStateOfPartition() {
        return this.StateOfPartition;
    }

    /**
     * Set <p>各分区的消费状态</p>
     * @param StateOfPartition <p>各分区的消费状态</p>
     */
    public void setStateOfPartition(MonitorInfo [] StateOfPartition) {
        this.StateOfPartition = StateOfPartition;
    }

    /**
     * Get <p>消费者组创建时间。</p> 
     * @return CreatedAt <p>消费者组创建时间。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>消费者组创建时间。</p>
     * @param CreatedAt <p>消费者组创建时间。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>消费者组修改时间。</p> 
     * @return UpdatedAt <p>消费者组修改时间。</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>消费者组修改时间。</p>
     * @param UpdatedAt <p>消费者组修改时间。</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作</p> 
     * @return ConsumerGroupState <p>消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作</p>
     */
    public String getConsumerGroupState() {
        return this.ConsumerGroupState;
    }

    /**
     * Set <p>消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作</p>
     * @param ConsumerGroupState <p>消费者组状态，包括Dead、Empty、Stable等，只有Dead和Empty两种状态可以执行reset操作</p>
     */
    public void setConsumerGroupState(String ConsumerGroupState) {
        this.ConsumerGroupState = ConsumerGroupState;
    }

    /**
     * Get <p>每个消费者正在消费的分区</p> 
     * @return PartitionAssignment <p>每个消费者正在消费的分区</p>
     */
    public PartitionAssignment [] getPartitionAssignment() {
        return this.PartitionAssignment;
    }

    /**
     * Set <p>每个消费者正在消费的分区</p>
     * @param PartitionAssignment <p>每个消费者正在消费的分区</p>
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

