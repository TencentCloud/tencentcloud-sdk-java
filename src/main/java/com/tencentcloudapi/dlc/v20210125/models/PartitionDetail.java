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

public class PartitionDetail extends AbstractModel {

    /**
    * <p>分区编码</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>分区名称</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>分区描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * <p>产品信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductInfo")
    @Expose
    private String ProductInfo;

    /**
    * <p>资源池编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePoolCode")
    @Expose
    private String ResourcePoolCode;

    /**
    * <p>资源配额列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceQuota")
    @Expose
    private ResourceQuota [] ResourceQuota;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>续费标志</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>调度器类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get <p>分区名称</p> 
     * @return PartitionName <p>分区名称</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>分区名称</p>
     * @param PartitionName <p>分区名称</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>分区描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>分区描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>分区描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>分区描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get <p>产品信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductInfo <p>产品信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set <p>产品信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductInfo <p>产品信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductInfo(String ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get <p>资源池编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePoolCode <p>资源池编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePoolCode() {
        return this.ResourcePoolCode;
    }

    /**
     * Set <p>资源池编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePoolCode <p>资源池编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePoolCode(String ResourcePoolCode) {
        this.ResourcePoolCode = ResourcePoolCode;
    }

    /**
     * Get <p>资源配额列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceQuota <p>资源配额列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceQuota [] getResourceQuota() {
        return this.ResourceQuota;
    }

    /**
     * Set <p>资源配额列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceQuota <p>资源配额列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceQuota(ResourceQuota [] ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>续费标志</p> 
     * @return RenewFlag <p>续费标志</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标志</p>
     * @param RenewFlag <p>续费标志</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>调度器类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheduler <p>调度器类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>调度器类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheduler <p>调度器类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public PartitionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionDetail(PartitionDetail source) {
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.ProductInfo != null) {
            this.ProductInfo = new String(source.ProductInfo);
        }
        if (source.ResourcePoolCode != null) {
            this.ResourcePoolCode = new String(source.ResourcePoolCode);
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
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductInfo", this.ProductInfo);
        this.setParamSimple(map, prefix + "ResourcePoolCode", this.ResourcePoolCode);
        this.setParamArrayObj(map, prefix + "ResourceQuota.", this.ResourceQuota);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

