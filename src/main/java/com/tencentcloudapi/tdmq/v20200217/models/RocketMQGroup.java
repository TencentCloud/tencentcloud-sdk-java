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

public class RocketMQGroup extends AbstractModel{

    /**
    * 消费组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 在线消费者数量
    */
    @SerializedName("ConsumerNum")
    @Expose
    private Long ConsumerNum;

    /**
    * 消费TPS
    */
    @SerializedName("TPS")
    @Expose
    private Long TPS;

    /**
    * 总堆积数量
    */
    @SerializedName("TotalAccumulative")
    @Expose
    private Long TotalAccumulative;

    /**
    * 0表示集群消费模式，1表示广播消费模式，-1表示未知
    */
    @SerializedName("ConsumptionMode")
    @Expose
    private Long ConsumptionMode;

    /**
    * 是否允许消费
    */
    @SerializedName("ReadEnabled")
    @Expose
    private Boolean ReadEnabled;

    /**
    * 重试队列分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryPartitionNum")
    @Expose
    private Long RetryPartitionNum;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间，以毫秒为单位
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 客户端协议
    */
    @SerializedName("ClientProtocol")
    @Expose
    private String ClientProtocol;

    /**
    * 说明信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消费者类型，枚举值ACTIVELY, PASSIVELY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerType")
    @Expose
    private String ConsumerType;

    /**
    * 是否开启广播消费
    */
    @SerializedName("BroadcastEnabled")
    @Expose
    private Boolean BroadcastEnabled;

    /**
     * Get 消费组名称 
     * @return Name 消费组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 消费组名称
     * @param Name 消费组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 在线消费者数量 
     * @return ConsumerNum 在线消费者数量
     */
    public Long getConsumerNum() {
        return this.ConsumerNum;
    }

    /**
     * Set 在线消费者数量
     * @param ConsumerNum 在线消费者数量
     */
    public void setConsumerNum(Long ConsumerNum) {
        this.ConsumerNum = ConsumerNum;
    }

    /**
     * Get 消费TPS 
     * @return TPS 消费TPS
     */
    public Long getTPS() {
        return this.TPS;
    }

    /**
     * Set 消费TPS
     * @param TPS 消费TPS
     */
    public void setTPS(Long TPS) {
        this.TPS = TPS;
    }

    /**
     * Get 总堆积数量 
     * @return TotalAccumulative 总堆积数量
     */
    public Long getTotalAccumulative() {
        return this.TotalAccumulative;
    }

    /**
     * Set 总堆积数量
     * @param TotalAccumulative 总堆积数量
     */
    public void setTotalAccumulative(Long TotalAccumulative) {
        this.TotalAccumulative = TotalAccumulative;
    }

    /**
     * Get 0表示集群消费模式，1表示广播消费模式，-1表示未知 
     * @return ConsumptionMode 0表示集群消费模式，1表示广播消费模式，-1表示未知
     */
    public Long getConsumptionMode() {
        return this.ConsumptionMode;
    }

    /**
     * Set 0表示集群消费模式，1表示广播消费模式，-1表示未知
     * @param ConsumptionMode 0表示集群消费模式，1表示广播消费模式，-1表示未知
     */
    public void setConsumptionMode(Long ConsumptionMode) {
        this.ConsumptionMode = ConsumptionMode;
    }

    /**
     * Get 是否允许消费 
     * @return ReadEnabled 是否允许消费
     */
    public Boolean getReadEnabled() {
        return this.ReadEnabled;
    }

    /**
     * Set 是否允许消费
     * @param ReadEnabled 是否允许消费
     */
    public void setReadEnabled(Boolean ReadEnabled) {
        this.ReadEnabled = ReadEnabled;
    }

    /**
     * Get 重试队列分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryPartitionNum 重试队列分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryPartitionNum() {
        return this.RetryPartitionNum;
    }

    /**
     * Set 重试队列分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryPartitionNum 重试队列分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryPartitionNum(Long RetryPartitionNum) {
        this.RetryPartitionNum = RetryPartitionNum;
    }

    /**
     * Get 创建时间，以毫秒为单位 
     * @return CreateTime 创建时间，以毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
     * @param CreateTime 创建时间，以毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间，以毫秒为单位 
     * @return UpdateTime 修改时间，以毫秒为单位
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间，以毫秒为单位
     * @param UpdateTime 修改时间，以毫秒为单位
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 客户端协议 
     * @return ClientProtocol 客户端协议
     */
    public String getClientProtocol() {
        return this.ClientProtocol;
    }

    /**
     * Set 客户端协议
     * @param ClientProtocol 客户端协议
     */
    public void setClientProtocol(String ClientProtocol) {
        this.ClientProtocol = ClientProtocol;
    }

    /**
     * Get 说明信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 消费者类型，枚举值ACTIVELY, PASSIVELY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerType 消费者类型，枚举值ACTIVELY, PASSIVELY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerType() {
        return this.ConsumerType;
    }

    /**
     * Set 消费者类型，枚举值ACTIVELY, PASSIVELY
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerType 消费者类型，枚举值ACTIVELY, PASSIVELY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerType(String ConsumerType) {
        this.ConsumerType = ConsumerType;
    }

    /**
     * Get 是否开启广播消费 
     * @return BroadcastEnabled 是否开启广播消费
     */
    public Boolean getBroadcastEnabled() {
        return this.BroadcastEnabled;
    }

    /**
     * Set 是否开启广播消费
     * @param BroadcastEnabled 是否开启广播消费
     */
    public void setBroadcastEnabled(Boolean BroadcastEnabled) {
        this.BroadcastEnabled = BroadcastEnabled;
    }

    public RocketMQGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQGroup(RocketMQGroup source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ConsumerNum != null) {
            this.ConsumerNum = new Long(source.ConsumerNum);
        }
        if (source.TPS != null) {
            this.TPS = new Long(source.TPS);
        }
        if (source.TotalAccumulative != null) {
            this.TotalAccumulative = new Long(source.TotalAccumulative);
        }
        if (source.ConsumptionMode != null) {
            this.ConsumptionMode = new Long(source.ConsumptionMode);
        }
        if (source.ReadEnabled != null) {
            this.ReadEnabled = new Boolean(source.ReadEnabled);
        }
        if (source.RetryPartitionNum != null) {
            this.RetryPartitionNum = new Long(source.RetryPartitionNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ClientProtocol != null) {
            this.ClientProtocol = new String(source.ClientProtocol);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerType != null) {
            this.ConsumerType = new String(source.ConsumerType);
        }
        if (source.BroadcastEnabled != null) {
            this.BroadcastEnabled = new Boolean(source.BroadcastEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ConsumerNum", this.ConsumerNum);
        this.setParamSimple(map, prefix + "TPS", this.TPS);
        this.setParamSimple(map, prefix + "TotalAccumulative", this.TotalAccumulative);
        this.setParamSimple(map, prefix + "ConsumptionMode", this.ConsumptionMode);
        this.setParamSimple(map, prefix + "ReadEnabled", this.ReadEnabled);
        this.setParamSimple(map, prefix + "RetryPartitionNum", this.RetryPartitionNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ClientProtocol", this.ClientProtocol);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsumerType", this.ConsumerType);
        this.setParamSimple(map, prefix + "BroadcastEnabled", this.BroadcastEnabled);

    }
}

