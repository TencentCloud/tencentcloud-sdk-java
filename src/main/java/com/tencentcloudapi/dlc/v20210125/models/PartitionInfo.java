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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionInfo extends AbstractModel {

    /**
    * <p>分区名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分区编码</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>状态：11-发货中，1-运行中，2-隔离中，3-已销毁</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>队列数量</p>
    */
    @SerializedName("QueueCount")
    @Expose
    private Long QueueCount;

    /**
    * <p>资源配置（配额）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceQuota")
    @Expose
    private ResourceQuota [] ResourceQuota;

    /**
    * <p>各计费项的单 worker/executor 最大可调度资源量列表，用于约束提交作业时可申请的规格上限；仅包含分区已有的非 GPU 计费项，无可返回项时为空数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulableLimitList")
    @Expose
    private SchedulableLimit [] SchedulableLimitList;

    /**
    * <p>计费类型：1-包年包月，0-按量计费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）；按量计费分区无该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>资源池形态：SYSTEM（系统）/ USER（用户）/ EXTERNAL_TKE（纳管外部 TKE 集群）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePoolKind")
    @Expose
    private String ResourcePoolKind;

    /**
    * <p>纳管外部集群的原始 ID（例如 EMR 实例 ID emr-xxx），仅 EXTERNAL_TKE 等纳管场景有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalClusterId")
    @Expose
    private String ExternalClusterId;

    /**
    * <p>资源已绑定的标签列表，由标签平台 GetResources 接口实时查询得到；列表场景下仅对当前页分区加载，单分区标签查询失败时降级留空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private CloudTag [] Tags;

    /**
     * Get <p>分区名称</p> 
     * @return Name <p>分区名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分区名称</p>
     * @param Name <p>分区名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分区编码</p> 
     * @return PartitionCode <p>分区编码</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>分区编码</p>
     * @param PartitionCode <p>分区编码</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>状态：11-发货中，1-运行中，2-隔离中，3-已销毁</p> 
     * @return Status <p>状态：11-发货中，1-运行中，2-隔离中，3-已销毁</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：11-发货中，1-运行中，2-隔离中，3-已销毁</p>
     * @param Status <p>状态：11-发货中，1-运行中，2-隔离中，3-已销毁</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>队列数量</p> 
     * @return QueueCount <p>队列数量</p>
     */
    public Long getQueueCount() {
        return this.QueueCount;
    }

    /**
     * Set <p>队列数量</p>
     * @param QueueCount <p>队列数量</p>
     */
    public void setQueueCount(Long QueueCount) {
        this.QueueCount = QueueCount;
    }

    /**
     * Get <p>资源配置（配额）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceQuota <p>资源配置（配额）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceQuota [] getResourceQuota() {
        return this.ResourceQuota;
    }

    /**
     * Set <p>资源配置（配额）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceQuota <p>资源配置（配额）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceQuota(ResourceQuota [] ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    /**
     * Get <p>各计费项的单 worker/executor 最大可调度资源量列表，用于约束提交作业时可申请的规格上限；仅包含分区已有的非 GPU 计费项，无可返回项时为空数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulableLimitList <p>各计费项的单 worker/executor 最大可调度资源量列表，用于约束提交作业时可申请的规格上限；仅包含分区已有的非 GPU 计费项，无可返回项时为空数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchedulableLimit [] getSchedulableLimitList() {
        return this.SchedulableLimitList;
    }

    /**
     * Set <p>各计费项的单 worker/executor 最大可调度资源量列表，用于约束提交作业时可申请的规格上限；仅包含分区已有的非 GPU 计费项，无可返回项时为空数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulableLimitList <p>各计费项的单 worker/executor 最大可调度资源量列表，用于约束提交作业时可申请的规格上限；仅包含分区已有的非 GPU 计费项，无可返回项时为空数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulableLimitList(SchedulableLimit [] SchedulableLimitList) {
        this.SchedulableLimitList = SchedulableLimitList;
    }

    /**
     * Get <p>计费类型：1-包年包月，0-按量计费</p> 
     * @return PayMode <p>计费类型：1-包年包月，0-按量计费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费类型：1-包年包月，0-按量计费</p>
     * @param PayMode <p>计费类型：1-包年包月，0-按量计费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）；按量计费分区无该字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag <p>续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）；按量计费分区无该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）；按量计费分区无该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag <p>续费标志：0-默认，1-自动续费，2-不自动续费（仅预付费有效）；按量计费分区无该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>资源池形态：SYSTEM（系统）/ USER（用户）/ EXTERNAL_TKE（纳管外部 TKE 集群）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePoolKind <p>资源池形态：SYSTEM（系统）/ USER（用户）/ EXTERNAL_TKE（纳管外部 TKE 集群）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePoolKind() {
        return this.ResourcePoolKind;
    }

    /**
     * Set <p>资源池形态：SYSTEM（系统）/ USER（用户）/ EXTERNAL_TKE（纳管外部 TKE 集群）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePoolKind <p>资源池形态：SYSTEM（系统）/ USER（用户）/ EXTERNAL_TKE（纳管外部 TKE 集群）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePoolKind(String ResourcePoolKind) {
        this.ResourcePoolKind = ResourcePoolKind;
    }

    /**
     * Get <p>纳管外部集群的原始 ID（例如 EMR 实例 ID emr-xxx），仅 EXTERNAL_TKE 等纳管场景有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalClusterId <p>纳管外部集群的原始 ID（例如 EMR 实例 ID emr-xxx），仅 EXTERNAL_TKE 等纳管场景有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalClusterId() {
        return this.ExternalClusterId;
    }

    /**
     * Set <p>纳管外部集群的原始 ID（例如 EMR 实例 ID emr-xxx），仅 EXTERNAL_TKE 等纳管场景有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalClusterId <p>纳管外部集群的原始 ID（例如 EMR 实例 ID emr-xxx），仅 EXTERNAL_TKE 等纳管场景有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalClusterId(String ExternalClusterId) {
        this.ExternalClusterId = ExternalClusterId;
    }

    /**
     * Get <p>资源已绑定的标签列表，由标签平台 GetResources 接口实时查询得到；列表场景下仅对当前页分区加载，单分区标签查询失败时降级留空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>资源已绑定的标签列表，由标签平台 GetResources 接口实时查询得到；列表场景下仅对当前页分区加载，单分区标签查询失败时降级留空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源已绑定的标签列表，由标签平台 GetResources 接口实时查询得到；列表场景下仅对当前页分区加载，单分区标签查询失败时降级留空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>资源已绑定的标签列表，由标签平台 GetResources 接口实时查询得到；列表场景下仅对当前页分区加载，单分区标签查询失败时降级留空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(CloudTag [] Tags) {
        this.Tags = Tags;
    }

    public PartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionInfo(PartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.QueueCount != null) {
            this.QueueCount = new Long(source.QueueCount);
        }
        if (source.ResourceQuota != null) {
            this.ResourceQuota = new ResourceQuota[source.ResourceQuota.length];
            for (int i = 0; i < source.ResourceQuota.length; i++) {
                this.ResourceQuota[i] = new ResourceQuota(source.ResourceQuota[i]);
            }
        }
        if (source.SchedulableLimitList != null) {
            this.SchedulableLimitList = new SchedulableLimit[source.SchedulableLimitList.length];
            for (int i = 0; i < source.SchedulableLimitList.length; i++) {
                this.SchedulableLimitList[i] = new SchedulableLimit(source.SchedulableLimitList[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ResourcePoolKind != null) {
            this.ResourcePoolKind = new String(source.ResourcePoolKind);
        }
        if (source.ExternalClusterId != null) {
            this.ExternalClusterId = new String(source.ExternalClusterId);
        }
        if (source.Tags != null) {
            this.Tags = new CloudTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CloudTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "QueueCount", this.QueueCount);
        this.setParamArrayObj(map, prefix + "ResourceQuota.", this.ResourceQuota);
        this.setParamArrayObj(map, prefix + "SchedulableLimitList.", this.SchedulableLimitList);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ResourcePoolKind", this.ResourcePoolKind);
        this.setParamSimple(map, prefix + "ExternalClusterId", this.ExternalClusterId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

