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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceResponse extends AbstractModel {

    /**
    * 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主题数量
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 实例最大主题数量
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * 消费组数量
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * 实例最大消费组数量
    */
    @SerializedName("GroupNumLimit")
    @Expose
    private Long GroupNumLimit;

    /**
    * 消息保留时间，小时为单位
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * 最大可调整消息保留时间，小时为单位
    */
    @SerializedName("RetentionUpperLimit")
    @Expose
    private Long RetentionUpperLimit;

    /**
    * 最小可调整消息保留时间，小时为单位
    */
    @SerializedName("RetentionLowerLimit")
    @Expose
    private Long RetentionLowerLimit;

    /**
    * TPS限流值
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 弹性TPS限流值
    */
    @SerializedName("ScaledTpsLimit")
    @Expose
    private Long ScaledTpsLimit;

    /**
    * 延迟消息最长时间，小时为单位
    */
    @SerializedName("MaxMessageDelay")
    @Expose
    private Long MaxMessageDelay;

    /**
    * 创建时间，秒为单位
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 消息发送接收比例
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * 接入点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointList")
    @Expose
    private Endpoint [] EndpointList;

    /**
    * 主题队列数上限
    */
    @SerializedName("TopicQueueNumUpperLimit")
    @Expose
    private Long TopicQueueNumUpperLimit;

    /**
    * 主题队列数下限
    */
    @SerializedName("TopicQueueNumLowerLimit")
    @Expose
    private Long TopicQueueNumLowerLimit;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例规格
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 计费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 是否开启弹性TPS
    */
    @SerializedName("ScaledTpsEnabled")
    @Expose
    private Boolean ScaledTpsEnabled;

    /**
    * 是否自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 到期时间
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * 角色数量限制
    */
    @SerializedName("RoleNumLimit")
    @Expose
    private Long RoleNumLimit;

    /**
    * 是否开启 ACL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * topic个数免费额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNumLowerLimit")
    @Expose
    private Long TopicNumLowerLimit;

    /**
    * 最大可设置的topic个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版 
     * @return InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     * @param InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

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
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 主题数量 
     * @return TopicNum 主题数量
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 主题数量
     * @param TopicNum 主题数量
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 实例最大主题数量 
     * @return TopicNumLimit 实例最大主题数量
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 实例最大主题数量
     * @param TopicNumLimit 实例最大主题数量
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get 消费组数量 
     * @return GroupNum 消费组数量
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 消费组数量
     * @param GroupNum 消费组数量
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get 实例最大消费组数量 
     * @return GroupNumLimit 实例最大消费组数量
     */
    public Long getGroupNumLimit() {
        return this.GroupNumLimit;
    }

    /**
     * Set 实例最大消费组数量
     * @param GroupNumLimit 实例最大消费组数量
     */
    public void setGroupNumLimit(Long GroupNumLimit) {
        this.GroupNumLimit = GroupNumLimit;
    }

    /**
     * Get 消息保留时间，小时为单位 
     * @return MessageRetention 消息保留时间，小时为单位
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set 消息保留时间，小时为单位
     * @param MessageRetention 消息保留时间，小时为单位
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get 最大可调整消息保留时间，小时为单位 
     * @return RetentionUpperLimit 最大可调整消息保留时间，小时为单位
     */
    public Long getRetentionUpperLimit() {
        return this.RetentionUpperLimit;
    }

    /**
     * Set 最大可调整消息保留时间，小时为单位
     * @param RetentionUpperLimit 最大可调整消息保留时间，小时为单位
     */
    public void setRetentionUpperLimit(Long RetentionUpperLimit) {
        this.RetentionUpperLimit = RetentionUpperLimit;
    }

    /**
     * Get 最小可调整消息保留时间，小时为单位 
     * @return RetentionLowerLimit 最小可调整消息保留时间，小时为单位
     */
    public Long getRetentionLowerLimit() {
        return this.RetentionLowerLimit;
    }

    /**
     * Set 最小可调整消息保留时间，小时为单位
     * @param RetentionLowerLimit 最小可调整消息保留时间，小时为单位
     */
    public void setRetentionLowerLimit(Long RetentionLowerLimit) {
        this.RetentionLowerLimit = RetentionLowerLimit;
    }

    /**
     * Get TPS限流值 
     * @return TpsLimit TPS限流值
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS限流值
     * @param TpsLimit TPS限流值
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 弹性TPS限流值 
     * @return ScaledTpsLimit 弹性TPS限流值
     */
    public Long getScaledTpsLimit() {
        return this.ScaledTpsLimit;
    }

    /**
     * Set 弹性TPS限流值
     * @param ScaledTpsLimit 弹性TPS限流值
     */
    public void setScaledTpsLimit(Long ScaledTpsLimit) {
        this.ScaledTpsLimit = ScaledTpsLimit;
    }

    /**
     * Get 延迟消息最长时间，小时为单位 
     * @return MaxMessageDelay 延迟消息最长时间，小时为单位
     */
    public Long getMaxMessageDelay() {
        return this.MaxMessageDelay;
    }

    /**
     * Set 延迟消息最长时间，小时为单位
     * @param MaxMessageDelay 延迟消息最长时间，小时为单位
     */
    public void setMaxMessageDelay(Long MaxMessageDelay) {
        this.MaxMessageDelay = MaxMessageDelay;
    }

    /**
     * Get 创建时间，秒为单位 
     * @return CreatedTime 创建时间，秒为单位
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，秒为单位
     * @param CreatedTime 创建时间，秒为单位
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 消息发送接收比例 
     * @return SendReceiveRatio 消息发送接收比例
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set 消息发送接收比例
     * @param SendReceiveRatio 消息发送接收比例
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 接入点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointList 接入点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Endpoint [] getEndpointList() {
        return this.EndpointList;
    }

    /**
     * Set 接入点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointList 接入点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointList(Endpoint [] EndpointList) {
        this.EndpointList = EndpointList;
    }

    /**
     * Get 主题队列数上限 
     * @return TopicQueueNumUpperLimit 主题队列数上限
     */
    public Long getTopicQueueNumUpperLimit() {
        return this.TopicQueueNumUpperLimit;
    }

    /**
     * Set 主题队列数上限
     * @param TopicQueueNumUpperLimit 主题队列数上限
     */
    public void setTopicQueueNumUpperLimit(Long TopicQueueNumUpperLimit) {
        this.TopicQueueNumUpperLimit = TopicQueueNumUpperLimit;
    }

    /**
     * Get 主题队列数下限 
     * @return TopicQueueNumLowerLimit 主题队列数下限
     */
    public Long getTopicQueueNumLowerLimit() {
        return this.TopicQueueNumLowerLimit;
    }

    /**
     * Set 主题队列数下限
     * @param TopicQueueNumLowerLimit 主题队列数下限
     */
    public void setTopicQueueNumLowerLimit(Long TopicQueueNumLowerLimit) {
        this.TopicQueueNumLowerLimit = TopicQueueNumLowerLimit;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例规格 
     * @return SkuCode 实例规格
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 实例规格
     * @param SkuCode 实例规格
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 计费模式 
     * @return PayMode 计费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式
     * @param PayMode 计费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否开启弹性TPS 
     * @return ScaledTpsEnabled 是否开启弹性TPS
     */
    public Boolean getScaledTpsEnabled() {
        return this.ScaledTpsEnabled;
    }

    /**
     * Set 是否开启弹性TPS
     * @param ScaledTpsEnabled 是否开启弹性TPS
     */
    public void setScaledTpsEnabled(Boolean ScaledTpsEnabled) {
        this.ScaledTpsEnabled = ScaledTpsEnabled;
    }

    /**
     * Get 是否自动续费 
     * @return RenewFlag 是否自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费
     * @param RenewFlag 是否自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 到期时间 
     * @return ExpiryTime 到期时间
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set 到期时间
     * @param ExpiryTime 到期时间
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get 角色数量限制 
     * @return RoleNumLimit 角色数量限制
     */
    public Long getRoleNumLimit() {
        return this.RoleNumLimit;
    }

    /**
     * Set 角色数量限制
     * @param RoleNumLimit 角色数量限制
     */
    public void setRoleNumLimit(Long RoleNumLimit) {
        this.RoleNumLimit = RoleNumLimit;
    }

    /**
     * Get 是否开启 ACL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclEnabled 是否开启 ACL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set 是否开启 ACL
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclEnabled 是否开启 ACL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get topic个数免费额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNumLowerLimit topic个数免费额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNumLowerLimit() {
        return this.TopicNumLowerLimit;
    }

    /**
     * Set topic个数免费额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNumLowerLimit topic个数免费额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNumLowerLimit(Long TopicNumLowerLimit) {
        this.TopicNumLowerLimit = TopicNumLowerLimit;
    }

    /**
     * Get 最大可设置的topic个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNumUpperLimit 最大可设置的topic个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set 最大可设置的topic个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNumUpperLimit 最大可设置的topic个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
    }

    /**
     * Get 可用区列表 
     * @return ZoneIds 可用区列表
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区列表
     * @param ZoneIds 可用区列表
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceResponse(DescribeInstanceResponse source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.GroupNumLimit != null) {
            this.GroupNumLimit = new Long(source.GroupNumLimit);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.RetentionUpperLimit != null) {
            this.RetentionUpperLimit = new Long(source.RetentionUpperLimit);
        }
        if (source.RetentionLowerLimit != null) {
            this.RetentionLowerLimit = new Long(source.RetentionLowerLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ScaledTpsLimit != null) {
            this.ScaledTpsLimit = new Long(source.ScaledTpsLimit);
        }
        if (source.MaxMessageDelay != null) {
            this.MaxMessageDelay = new Long(source.MaxMessageDelay);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.EndpointList != null) {
            this.EndpointList = new Endpoint[source.EndpointList.length];
            for (int i = 0; i < source.EndpointList.length; i++) {
                this.EndpointList[i] = new Endpoint(source.EndpointList[i]);
            }
        }
        if (source.TopicQueueNumUpperLimit != null) {
            this.TopicQueueNumUpperLimit = new Long(source.TopicQueueNumUpperLimit);
        }
        if (source.TopicQueueNumLowerLimit != null) {
            this.TopicQueueNumLowerLimit = new Long(source.TopicQueueNumLowerLimit);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ScaledTpsEnabled != null) {
            this.ScaledTpsEnabled = new Boolean(source.ScaledTpsEnabled);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.RoleNumLimit != null) {
            this.RoleNumLimit = new Long(source.RoleNumLimit);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.TopicNumLowerLimit != null) {
            this.TopicNumLowerLimit = new Long(source.TopicNumLowerLimit);
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "GroupNumLimit", this.GroupNumLimit);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "RetentionUpperLimit", this.RetentionUpperLimit);
        this.setParamSimple(map, prefix + "RetentionLowerLimit", this.RetentionLowerLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ScaledTpsLimit", this.ScaledTpsLimit);
        this.setParamSimple(map, prefix + "MaxMessageDelay", this.MaxMessageDelay);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "EndpointList.", this.EndpointList);
        this.setParamSimple(map, prefix + "TopicQueueNumUpperLimit", this.TopicQueueNumUpperLimit);
        this.setParamSimple(map, prefix + "TopicQueueNumLowerLimit", this.TopicQueueNumLowerLimit);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ScaledTpsEnabled", this.ScaledTpsEnabled);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "RoleNumLimit", this.RoleNumLimit);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "TopicNumLowerLimit", this.TopicNumLowerLimit);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

