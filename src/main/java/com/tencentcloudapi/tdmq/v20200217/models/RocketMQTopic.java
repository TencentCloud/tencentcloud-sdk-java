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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQTopic extends AbstractModel {

    /**
    * 主题名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 主题的类别，为枚举类型，Normal，GlobalOrder，PartitionedOrder，Transaction，Retry及DeadLetter
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 订阅组数量
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * 说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 读写分区数
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 最后写入时间，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 订阅数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionCount")
    @Expose
    private Long SubscriptionCount;

    /**
    * 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionData")
    @Expose
    private RocketMQSubscription [] SubscriptionData;

    /**
     * Get 主题名称 
     * @return Name 主题名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主题名称
     * @param Name 主题名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 主题的类别，为枚举类型，Normal，GlobalOrder，PartitionedOrder，Transaction，Retry及DeadLetter 
     * @return Type 主题的类别，为枚举类型，Normal，GlobalOrder，PartitionedOrder，Transaction，Retry及DeadLetter
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主题的类别，为枚举类型，Normal，GlobalOrder，PartitionedOrder，Transaction，Retry及DeadLetter
     * @param Type 主题的类别，为枚举类型，Normal，GlobalOrder，PartitionedOrder，Transaction，Retry及DeadLetter
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 订阅组数量 
     * @return GroupNum 订阅组数量
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 订阅组数量
     * @param GroupNum 订阅组数量
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get 说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 读写分区数 
     * @return PartitionNum 读写分区数
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 读写分区数
     * @param PartitionNum 读写分区数
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
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
     * Get 创建时间，以毫秒为单位 
     * @return UpdateTime 创建时间，以毫秒为单位
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
     * @param UpdateTime 创建时间，以毫秒为单位
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 最后写入时间，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后写入时间，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后写入时间，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后写入时间，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 订阅数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionCount 订阅数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubscriptionCount() {
        return this.SubscriptionCount;
    }

    /**
     * Set 订阅数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionCount 订阅数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionCount(Long SubscriptionCount) {
        this.SubscriptionCount = SubscriptionCount;
    }

    /**
     * Get 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionData 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQSubscription [] getSubscriptionData() {
        return this.SubscriptionData;
    }

    /**
     * Set 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionData 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionData(RocketMQSubscription [] SubscriptionData) {
        this.SubscriptionData = SubscriptionData;
    }

    public RocketMQTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQTopic(RocketMQTopic source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.SubscriptionCount != null) {
            this.SubscriptionCount = new Long(source.SubscriptionCount);
        }
        if (source.SubscriptionData != null) {
            this.SubscriptionData = new RocketMQSubscription[source.SubscriptionData.length];
            for (int i = 0; i < source.SubscriptionData.length; i++) {
                this.SubscriptionData[i] = new RocketMQSubscription(source.SubscriptionData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "SubscriptionCount", this.SubscriptionCount);
        this.setParamArrayObj(map, prefix + "SubscriptionData.", this.SubscriptionData);

    }
}

