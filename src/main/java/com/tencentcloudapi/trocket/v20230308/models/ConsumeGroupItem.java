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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumeGroupItem extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 消费组名称
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 是否开启消费
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * 顺序投递：true
并发投递：false
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * 最大重试次数
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 4.x的集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * 4.x的消费组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroupV4")
    @Expose
    private String ConsumerGroupV4;

    /**
    * 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * 订阅的主题个数
    */
    @SerializedName("SubscribeTopicNum")
    @Expose
    private Long SubscribeTopicNum;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 绑定的标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 消费组名称 
     * @return ConsumerGroup 消费组名称
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称
     * @param ConsumerGroup 消费组名称
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 是否开启消费 
     * @return ConsumeEnable 是否开启消费
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set 是否开启消费
     * @param ConsumeEnable 是否开启消费
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get 顺序投递：true
并发投递：false 
     * @return ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set 顺序投递：true
并发投递：false
     * @param ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get 最大重试次数 
     * @return MaxRetryTimes 最大重试次数
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set 最大重试次数
     * @param MaxRetryTimes 最大重试次数
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 4.x的集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIdV4 4.x的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set 4.x的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIdV4 4.x的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 4.x的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get 4.x的消费组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroupV4 4.x的消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerGroupV4() {
        return this.ConsumerGroupV4;
    }

    /**
     * Set 4.x的消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroupV4 4.x的消费组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroupV4(String ConsumerGroupV4) {
        this.ConsumerGroupV4 = ConsumerGroupV4;
    }

    /**
     * Get 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 4.x的完整命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get 订阅的主题个数 
     * @return SubscribeTopicNum 订阅的主题个数
     */
    public Long getSubscribeTopicNum() {
        return this.SubscribeTopicNum;
    }

    /**
     * Set 订阅的主题个数
     * @param SubscribeTopicNum 订阅的主题个数
     */
    public void setSubscribeTopicNum(Long SubscribeTopicNum) {
        this.SubscribeTopicNum = SubscribeTopicNum;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 绑定的标签列表 
     * @return TagList 绑定的标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 绑定的标签列表
     * @param TagList 绑定的标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public ConsumeGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumeGroupItem(ConsumeGroupItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterIdV4 != null) {
            this.ClusterIdV4 = new String(source.ClusterIdV4);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.ConsumerGroupV4 != null) {
            this.ConsumerGroupV4 = new String(source.ConsumerGroupV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.SubscribeTopicNum != null) {
            this.SubscribeTopicNum = new Long(source.SubscribeTopicNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterIdV4", this.ClusterIdV4);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "ConsumerGroupV4", this.ConsumerGroupV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "SubscribeTopicNum", this.SubscribeTopicNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

