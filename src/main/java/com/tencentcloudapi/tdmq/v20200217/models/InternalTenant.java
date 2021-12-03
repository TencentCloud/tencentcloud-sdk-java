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

public class InternalTenant extends AbstractModel{

    /**
    * 虚拟集群ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 虚拟集群名称
    */
    @SerializedName("TenantName")
    @Expose
    private String TenantName;

    /**
    * 客户UIN
    */
    @SerializedName("CustomerUin")
    @Expose
    private String CustomerUin;

    /**
    * 客户的APPID
    */
    @SerializedName("CustomerAppId")
    @Expose
    private String CustomerAppId;

    /**
    * 物理集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群协议类型，支持的值为TDMQ，ROCKETMQ，AMQP，CMQ
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 命名空间配额
    */
    @SerializedName("MaxNamespaces")
    @Expose
    private Long MaxNamespaces;

    /**
    * 已使用命名空间配额
    */
    @SerializedName("UsedNamespaces")
    @Expose
    private Long UsedNamespaces;

    /**
    * Topic配额
    */
    @SerializedName("MaxTopics")
    @Expose
    private Long MaxTopics;

    /**
    * 已使用Topic配额
    */
    @SerializedName("UsedTopics")
    @Expose
    private Long UsedTopics;

    /**
    * Topic分区数配额
    */
    @SerializedName("MaxPartitions")
    @Expose
    private Long MaxPartitions;

    /**
    * 已使用Topic分区数配额
    */
    @SerializedName("UsedPartitions")
    @Expose
    private Long UsedPartitions;

    /**
    * 存储配额, byte为单位
    */
    @SerializedName("MaxMsgBacklogSize")
    @Expose
    private Long MaxMsgBacklogSize;

    /**
    * 命名空间最大生产TPS
    */
    @SerializedName("MaxPublishTps")
    @Expose
    private Long MaxPublishTps;

    /**
    * 消息最大保留时间，秒为单位
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * 创建时间，毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间，毫秒为单位
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 命名空间最大消费TPS
    */
    @SerializedName("MaxDispatchTps")
    @Expose
    private Long MaxDispatchTps;

    /**
    * 命名空间最大消费带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDispatchRateInBytes")
    @Expose
    private Long MaxDispatchRateInBytes;

    /**
    * 命名空间最大生产带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPublishRateInBytes")
    @Expose
    private Long MaxPublishRateInBytes;

    /**
    * 消息最大保留空间，MB为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetentionSizeInMB")
    @Expose
    private Long MaxRetentionSizeInMB;

    /**
     * Get 虚拟集群ID 
     * @return TenantId 虚拟集群ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 虚拟集群ID
     * @param TenantId 虚拟集群ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 虚拟集群名称 
     * @return TenantName 虚拟集群名称
     */
    public String getTenantName() {
        return this.TenantName;
    }

    /**
     * Set 虚拟集群名称
     * @param TenantName 虚拟集群名称
     */
    public void setTenantName(String TenantName) {
        this.TenantName = TenantName;
    }

    /**
     * Get 客户UIN 
     * @return CustomerUin 客户UIN
     */
    public String getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set 客户UIN
     * @param CustomerUin 客户UIN
     */
    public void setCustomerUin(String CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get 客户的APPID 
     * @return CustomerAppId 客户的APPID
     */
    public String getCustomerAppId() {
        return this.CustomerAppId;
    }

    /**
     * Set 客户的APPID
     * @param CustomerAppId 客户的APPID
     */
    public void setCustomerAppId(String CustomerAppId) {
        this.CustomerAppId = CustomerAppId;
    }

    /**
     * Get 物理集群名称 
     * @return ClusterName 物理集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 物理集群名称
     * @param ClusterName 物理集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群协议类型，支持的值为TDMQ，ROCKETMQ，AMQP，CMQ 
     * @return Type 集群协议类型，支持的值为TDMQ，ROCKETMQ，AMQP，CMQ
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 集群协议类型，支持的值为TDMQ，ROCKETMQ，AMQP，CMQ
     * @param Type 集群协议类型，支持的值为TDMQ，ROCKETMQ，AMQP，CMQ
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 命名空间配额 
     * @return MaxNamespaces 命名空间配额
     */
    public Long getMaxNamespaces() {
        return this.MaxNamespaces;
    }

    /**
     * Set 命名空间配额
     * @param MaxNamespaces 命名空间配额
     */
    public void setMaxNamespaces(Long MaxNamespaces) {
        this.MaxNamespaces = MaxNamespaces;
    }

    /**
     * Get 已使用命名空间配额 
     * @return UsedNamespaces 已使用命名空间配额
     */
    public Long getUsedNamespaces() {
        return this.UsedNamespaces;
    }

    /**
     * Set 已使用命名空间配额
     * @param UsedNamespaces 已使用命名空间配额
     */
    public void setUsedNamespaces(Long UsedNamespaces) {
        this.UsedNamespaces = UsedNamespaces;
    }

    /**
     * Get Topic配额 
     * @return MaxTopics Topic配额
     */
    public Long getMaxTopics() {
        return this.MaxTopics;
    }

    /**
     * Set Topic配额
     * @param MaxTopics Topic配额
     */
    public void setMaxTopics(Long MaxTopics) {
        this.MaxTopics = MaxTopics;
    }

    /**
     * Get 已使用Topic配额 
     * @return UsedTopics 已使用Topic配额
     */
    public Long getUsedTopics() {
        return this.UsedTopics;
    }

    /**
     * Set 已使用Topic配额
     * @param UsedTopics 已使用Topic配额
     */
    public void setUsedTopics(Long UsedTopics) {
        this.UsedTopics = UsedTopics;
    }

    /**
     * Get Topic分区数配额 
     * @return MaxPartitions Topic分区数配额
     */
    public Long getMaxPartitions() {
        return this.MaxPartitions;
    }

    /**
     * Set Topic分区数配额
     * @param MaxPartitions Topic分区数配额
     */
    public void setMaxPartitions(Long MaxPartitions) {
        this.MaxPartitions = MaxPartitions;
    }

    /**
     * Get 已使用Topic分区数配额 
     * @return UsedPartitions 已使用Topic分区数配额
     */
    public Long getUsedPartitions() {
        return this.UsedPartitions;
    }

    /**
     * Set 已使用Topic分区数配额
     * @param UsedPartitions 已使用Topic分区数配额
     */
    public void setUsedPartitions(Long UsedPartitions) {
        this.UsedPartitions = UsedPartitions;
    }

    /**
     * Get 存储配额, byte为单位 
     * @return MaxMsgBacklogSize 存储配额, byte为单位
     */
    public Long getMaxMsgBacklogSize() {
        return this.MaxMsgBacklogSize;
    }

    /**
     * Set 存储配额, byte为单位
     * @param MaxMsgBacklogSize 存储配额, byte为单位
     */
    public void setMaxMsgBacklogSize(Long MaxMsgBacklogSize) {
        this.MaxMsgBacklogSize = MaxMsgBacklogSize;
    }

    /**
     * Get 命名空间最大生产TPS 
     * @return MaxPublishTps 命名空间最大生产TPS
     */
    public Long getMaxPublishTps() {
        return this.MaxPublishTps;
    }

    /**
     * Set 命名空间最大生产TPS
     * @param MaxPublishTps 命名空间最大生产TPS
     */
    public void setMaxPublishTps(Long MaxPublishTps) {
        this.MaxPublishTps = MaxPublishTps;
    }

    /**
     * Get 消息最大保留时间，秒为单位 
     * @return MaxRetention 消息最大保留时间，秒为单位
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set 消息最大保留时间，秒为单位
     * @param MaxRetention 消息最大保留时间，秒为单位
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get 创建时间，毫秒为单位 
     * @return CreateTime 创建时间，毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒为单位
     * @param CreateTime 创建时间，毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间，毫秒为单位 
     * @return UpdateTime 修改时间，毫秒为单位
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间，毫秒为单位
     * @param UpdateTime 修改时间，毫秒为单位
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 命名空间最大消费TPS 
     * @return MaxDispatchTps 命名空间最大消费TPS
     */
    public Long getMaxDispatchTps() {
        return this.MaxDispatchTps;
    }

    /**
     * Set 命名空间最大消费TPS
     * @param MaxDispatchTps 命名空间最大消费TPS
     */
    public void setMaxDispatchTps(Long MaxDispatchTps) {
        this.MaxDispatchTps = MaxDispatchTps;
    }

    /**
     * Get 命名空间最大消费带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDispatchRateInBytes 命名空间最大消费带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDispatchRateInBytes() {
        return this.MaxDispatchRateInBytes;
    }

    /**
     * Set 命名空间最大消费带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDispatchRateInBytes 命名空间最大消费带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDispatchRateInBytes(Long MaxDispatchRateInBytes) {
        this.MaxDispatchRateInBytes = MaxDispatchRateInBytes;
    }

    /**
     * Get 命名空间最大生产带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPublishRateInBytes 命名空间最大生产带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPublishRateInBytes() {
        return this.MaxPublishRateInBytes;
    }

    /**
     * Set 命名空间最大生产带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPublishRateInBytes 命名空间最大生产带宽，byte为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPublishRateInBytes(Long MaxPublishRateInBytes) {
        this.MaxPublishRateInBytes = MaxPublishRateInBytes;
    }

    /**
     * Get 消息最大保留空间，MB为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetentionSizeInMB 消息最大保留空间，MB为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetentionSizeInMB() {
        return this.MaxRetentionSizeInMB;
    }

    /**
     * Set 消息最大保留空间，MB为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetentionSizeInMB 消息最大保留空间，MB为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetentionSizeInMB(Long MaxRetentionSizeInMB) {
        this.MaxRetentionSizeInMB = MaxRetentionSizeInMB;
    }

    public InternalTenant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalTenant(InternalTenant source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.TenantName != null) {
            this.TenantName = new String(source.TenantName);
        }
        if (source.CustomerUin != null) {
            this.CustomerUin = new String(source.CustomerUin);
        }
        if (source.CustomerAppId != null) {
            this.CustomerAppId = new String(source.CustomerAppId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MaxNamespaces != null) {
            this.MaxNamespaces = new Long(source.MaxNamespaces);
        }
        if (source.UsedNamespaces != null) {
            this.UsedNamespaces = new Long(source.UsedNamespaces);
        }
        if (source.MaxTopics != null) {
            this.MaxTopics = new Long(source.MaxTopics);
        }
        if (source.UsedTopics != null) {
            this.UsedTopics = new Long(source.UsedTopics);
        }
        if (source.MaxPartitions != null) {
            this.MaxPartitions = new Long(source.MaxPartitions);
        }
        if (source.UsedPartitions != null) {
            this.UsedPartitions = new Long(source.UsedPartitions);
        }
        if (source.MaxMsgBacklogSize != null) {
            this.MaxMsgBacklogSize = new Long(source.MaxMsgBacklogSize);
        }
        if (source.MaxPublishTps != null) {
            this.MaxPublishTps = new Long(source.MaxPublishTps);
        }
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.MaxDispatchTps != null) {
            this.MaxDispatchTps = new Long(source.MaxDispatchTps);
        }
        if (source.MaxDispatchRateInBytes != null) {
            this.MaxDispatchRateInBytes = new Long(source.MaxDispatchRateInBytes);
        }
        if (source.MaxPublishRateInBytes != null) {
            this.MaxPublishRateInBytes = new Long(source.MaxPublishRateInBytes);
        }
        if (source.MaxRetentionSizeInMB != null) {
            this.MaxRetentionSizeInMB = new Long(source.MaxRetentionSizeInMB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "TenantName", this.TenantName);
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "CustomerAppId", this.CustomerAppId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxNamespaces", this.MaxNamespaces);
        this.setParamSimple(map, prefix + "UsedNamespaces", this.UsedNamespaces);
        this.setParamSimple(map, prefix + "MaxTopics", this.MaxTopics);
        this.setParamSimple(map, prefix + "UsedTopics", this.UsedTopics);
        this.setParamSimple(map, prefix + "MaxPartitions", this.MaxPartitions);
        this.setParamSimple(map, prefix + "UsedPartitions", this.UsedPartitions);
        this.setParamSimple(map, prefix + "MaxMsgBacklogSize", this.MaxMsgBacklogSize);
        this.setParamSimple(map, prefix + "MaxPublishTps", this.MaxPublishTps);
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MaxDispatchTps", this.MaxDispatchTps);
        this.setParamSimple(map, prefix + "MaxDispatchRateInBytes", this.MaxDispatchRateInBytes);
        this.setParamSimple(map, prefix + "MaxPublishRateInBytes", this.MaxPublishRateInBytes);
        this.setParamSimple(map, prefix + "MaxRetentionSizeInMB", this.MaxRetentionSizeInMB);

    }
}

