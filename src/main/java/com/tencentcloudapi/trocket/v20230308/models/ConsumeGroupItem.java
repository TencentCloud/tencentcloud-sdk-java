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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>消费组名称</p>
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * <p>是否开启消费</p>
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * <p>顺序投递：true<br>并发投递：false</p>
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * <p>最大重试次数</p>
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>4.x的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * <p>4.x的消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroupV4")
    @Expose
    private String ConsumerGroupV4;

    /**
    * <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * <p>订阅的主题个数</p>
    */
    @SerializedName("SubscribeTopicNum")
    @Expose
    private Long SubscribeTopicNum;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>绑定的标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>重试策略</p>
    */
    @SerializedName("RetryPolicy")
    @Expose
    private RetryPolicy RetryPolicy;

    /**
    * <p>消费模式，枚举值如下：</p><ul><li>CLUSTERING：集群/广播消费</li><li>LITE：LiteTopic 消费</li></ul>
    */
    @SerializedName("ConsumeModel")
    @Expose
    private String ConsumeModel;

    /**
    * <p>自定义的死信Topic名称</p>
    */
    @SerializedName("DeadLetterTargetTopic")
    @Expose
    private String DeadLetterTargetTopic;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>消费组名称</p> 
     * @return ConsumerGroup <p>消费组名称</p>
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set <p>消费组名称</p>
     * @param ConsumerGroup <p>消费组名称</p>
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get <p>是否开启消费</p> 
     * @return ConsumeEnable <p>是否开启消费</p>
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set <p>是否开启消费</p>
     * @param ConsumeEnable <p>是否开启消费</p>
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get <p>顺序投递：true<br>并发投递：false</p> 
     * @return ConsumeMessageOrderly <p>顺序投递：true<br>并发投递：false</p>
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set <p>顺序投递：true<br>并发投递：false</p>
     * @param ConsumeMessageOrderly <p>顺序投递：true<br>并发投递：false</p>
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get <p>最大重试次数</p> 
     * @return MaxRetryTimes <p>最大重试次数</p>
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set <p>最大重试次数</p>
     * @param MaxRetryTimes <p>最大重试次数</p>
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>4.x的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIdV4 <p>4.x的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set <p>4.x的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIdV4 <p>4.x的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceV4 <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceV4 <p>4.x的命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get <p>4.x的消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroupV4 <p>4.x的消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerGroupV4() {
        return this.ConsumerGroupV4;
    }

    /**
     * Set <p>4.x的消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroupV4 <p>4.x的消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroupV4(String ConsumerGroupV4) {
        this.ConsumerGroupV4 = ConsumerGroupV4;
    }

    /**
     * Get <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullNamespaceV4 <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullNamespaceV4 <p>4.x的完整命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get <p>订阅的主题个数</p> 
     * @return SubscribeTopicNum <p>订阅的主题个数</p>
     */
    public Long getSubscribeTopicNum() {
        return this.SubscribeTopicNum;
    }

    /**
     * Set <p>订阅的主题个数</p>
     * @param SubscribeTopicNum <p>订阅的主题个数</p>
     */
    public void setSubscribeTopicNum(Long SubscribeTopicNum) {
        this.SubscribeTopicNum = SubscribeTopicNum;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>绑定的标签列表</p> 
     * @return TagList <p>绑定的标签列表</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>绑定的标签列表</p>
     * @param TagList <p>绑定的标签列表</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>重试策略</p> 
     * @return RetryPolicy <p>重试策略</p>
     */
    public RetryPolicy getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set <p>重试策略</p>
     * @param RetryPolicy <p>重试策略</p>
     */
    public void setRetryPolicy(RetryPolicy RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get <p>消费模式，枚举值如下：</p><ul><li>CLUSTERING：集群/广播消费</li><li>LITE：LiteTopic 消费</li></ul> 
     * @return ConsumeModel <p>消费模式，枚举值如下：</p><ul><li>CLUSTERING：集群/广播消费</li><li>LITE：LiteTopic 消费</li></ul>
     */
    public String getConsumeModel() {
        return this.ConsumeModel;
    }

    /**
     * Set <p>消费模式，枚举值如下：</p><ul><li>CLUSTERING：集群/广播消费</li><li>LITE：LiteTopic 消费</li></ul>
     * @param ConsumeModel <p>消费模式，枚举值如下：</p><ul><li>CLUSTERING：集群/广播消费</li><li>LITE：LiteTopic 消费</li></ul>
     */
    public void setConsumeModel(String ConsumeModel) {
        this.ConsumeModel = ConsumeModel;
    }

    /**
     * Get <p>自定义的死信Topic名称</p> 
     * @return DeadLetterTargetTopic <p>自定义的死信Topic名称</p>
     */
    public String getDeadLetterTargetTopic() {
        return this.DeadLetterTargetTopic;
    }

    /**
     * Set <p>自定义的死信Topic名称</p>
     * @param DeadLetterTargetTopic <p>自定义的死信Topic名称</p>
     */
    public void setDeadLetterTargetTopic(String DeadLetterTargetTopic) {
        this.DeadLetterTargetTopic = DeadLetterTargetTopic;
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
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new RetryPolicy(source.RetryPolicy);
        }
        if (source.ConsumeModel != null) {
            this.ConsumeModel = new String(source.ConsumeModel);
        }
        if (source.DeadLetterTargetTopic != null) {
            this.DeadLetterTargetTopic = new String(source.DeadLetterTargetTopic);
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
        this.setParamObj(map, prefix + "RetryPolicy.", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ConsumeModel", this.ConsumeModel);
        this.setParamSimple(map, prefix + "DeadLetterTargetTopic", this.DeadLetterTargetTopic);

    }
}

