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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqTopic extends AbstractModel {

    /**
    * 主题的 ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息在主题中最长存活时间，从发送到该主题开始经过此参数指定的时间后，不论消息是否被成功推送给用户都将被删除，单位为秒。固定为一天（86400秒），该属性不能修改。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 消息最大长度。取值范围1024 - 1048576Byte（即1 - 1024K），默认值为1048576。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * 每秒钟发布消息的条数。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 描述用户创建订阅时选择的过滤策略：
FilterType = 1表示用户使用 FilterTag 标签过滤;
FilterType = 2表示用户使用 BindingKey 过滤。
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * 主题的创建时间。返回 Unix 时间戳，精确到毫秒。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后一次修改主题属性的时间。返回 Unix 时间戳，精确到毫秒。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * 当前该主题中消息数目（消息堆积数）。
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * 创建者 Uin，CAM 鉴权 resource 由该字段组合而成。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0表示pulsar，1表示rocketmq
    */
    @SerializedName("BrokerType")
    @Expose
    private Long BrokerType;

    /**
    * 订阅数量
    */
    @SerializedName("SubscriptionCount")
    @Expose
    private Long SubscriptionCount;

    /**
     * Get 主题的 ID。 
     * @return TopicId 主题的 ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题的 ID。
     * @param TopicId 主题的 ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息在主题中最长存活时间，从发送到该主题开始经过此参数指定的时间后，不论消息是否被成功推送给用户都将被删除，单位为秒。固定为一天（86400秒），该属性不能修改。 
     * @return MsgRetentionSeconds 消息在主题中最长存活时间，从发送到该主题开始经过此参数指定的时间后，不论消息是否被成功推送给用户都将被删除，单位为秒。固定为一天（86400秒），该属性不能修改。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set 消息在主题中最长存活时间，从发送到该主题开始经过此参数指定的时间后，不论消息是否被成功推送给用户都将被删除，单位为秒。固定为一天（86400秒），该属性不能修改。
     * @param MsgRetentionSeconds 消息在主题中最长存活时间，从发送到该主题开始经过此参数指定的时间后，不论消息是否被成功推送给用户都将被删除，单位为秒。固定为一天（86400秒），该属性不能修改。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 消息最大长度。取值范围1024 - 1048576Byte（即1 - 1024K），默认值为1048576。 
     * @return MaxMsgSize 消息最大长度。取值范围1024 - 1048576Byte（即1 - 1024K），默认值为1048576。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set 消息最大长度。取值范围1024 - 1048576Byte（即1 - 1024K），默认值为1048576。
     * @param MaxMsgSize 消息最大长度。取值范围1024 - 1048576Byte（即1 - 1024K），默认值为1048576。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get 每秒钟发布消息的条数。 
     * @return Qps 每秒钟发布消息的条数。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒钟发布消息的条数。
     * @param Qps 每秒钟发布消息的条数。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 描述用户创建订阅时选择的过滤策略：
FilterType = 1表示用户使用 FilterTag 标签过滤;
FilterType = 2表示用户使用 BindingKey 过滤。 
     * @return FilterType 描述用户创建订阅时选择的过滤策略：
FilterType = 1表示用户使用 FilterTag 标签过滤;
FilterType = 2表示用户使用 BindingKey 过滤。
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 描述用户创建订阅时选择的过滤策略：
FilterType = 1表示用户使用 FilterTag 标签过滤;
FilterType = 2表示用户使用 BindingKey 过滤。
     * @param FilterType 描述用户创建订阅时选择的过滤策略：
FilterType = 1表示用户使用 FilterTag 标签过滤;
FilterType = 2表示用户使用 BindingKey 过滤。
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 主题的创建时间。返回 Unix 时间戳，精确到毫秒。 
     * @return CreateTime 主题的创建时间。返回 Unix 时间戳，精确到毫秒。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 主题的创建时间。返回 Unix 时间戳，精确到毫秒。
     * @param CreateTime 主题的创建时间。返回 Unix 时间戳，精确到毫秒。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次修改主题属性的时间。返回 Unix 时间戳，精确到毫秒。 
     * @return LastModifyTime 最后一次修改主题属性的时间。返回 Unix 时间戳，精确到毫秒。
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set 最后一次修改主题属性的时间。返回 Unix 时间戳，精确到毫秒。
     * @param LastModifyTime 最后一次修改主题属性的时间。返回 Unix 时间戳，精确到毫秒。
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get 当前该主题中消息数目（消息堆积数）。 
     * @return MsgCount 当前该主题中消息数目（消息堆积数）。
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set 当前该主题中消息数目（消息堆积数）。
     * @param MsgCount 当前该主题中消息数目（消息堆积数）。
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get 创建者 Uin，CAM 鉴权 resource 由该字段组合而成。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建者 Uin，CAM 鉴权 resource 由该字段组合而成。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者 Uin，CAM 鉴权 resource 由该字段组合而成。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建者 Uin，CAM 鉴权 resource 由该字段组合而成。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 关联的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trace 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trace 消息轨迹。true表示开启，false表示不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败 
     * @return Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
     * @param Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0表示pulsar，1表示rocketmq 
     * @return BrokerType 0表示pulsar，1表示rocketmq
     */
    public Long getBrokerType() {
        return this.BrokerType;
    }

    /**
     * Set 0表示pulsar，1表示rocketmq
     * @param BrokerType 0表示pulsar，1表示rocketmq
     */
    public void setBrokerType(Long BrokerType) {
        this.BrokerType = BrokerType;
    }

    /**
     * Get 订阅数量 
     * @return SubscriptionCount 订阅数量
     */
    public Long getSubscriptionCount() {
        return this.SubscriptionCount;
    }

    /**
     * Set 订阅数量
     * @param SubscriptionCount 订阅数量
     */
    public void setSubscriptionCount(Long SubscriptionCount) {
        this.SubscriptionCount = SubscriptionCount;
    }

    public CmqTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqTopic(CmqTopic source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BrokerType != null) {
            this.BrokerType = new Long(source.BrokerType);
        }
        if (source.SubscriptionCount != null) {
            this.SubscriptionCount = new Long(source.SubscriptionCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BrokerType", this.BrokerType);
        this.setParamSimple(map, prefix + "SubscriptionCount", this.SubscriptionCount);

    }
}

