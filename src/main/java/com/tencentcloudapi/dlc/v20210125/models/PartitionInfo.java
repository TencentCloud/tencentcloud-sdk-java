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
    * <p>计费类型：1-包年包月，0-按量计费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

