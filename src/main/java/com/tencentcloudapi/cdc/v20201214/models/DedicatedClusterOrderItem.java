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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterOrderItem extends AbstractModel{

    /**
    * 专用集群类型id
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * 支持的存储类型列表
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * 支持的上连交换机的链路传输速率(GiB)
    */
    @SerializedName("SupportedUplinkSpeed")
    @Expose
    private Long [] SupportedUplinkSpeed;

    /**
    * 支持的实例族列表
    */
    @SerializedName("SupportedInstanceFamily")
    @Expose
    private String [] SupportedInstanceFamily;

    /**
    * 地板承重要求(KG)
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 功率要求(KW)
    */
    @SerializedName("PowerDraw")
    @Expose
    private Float PowerDraw;

    /**
    * 订单状态
    */
    @SerializedName("SubOrderStatus")
    @Expose
    private String SubOrderStatus;

    /**
    * 订单创建的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 子订单ID
    */
    @SerializedName("SubOrderId")
    @Expose
    private String SubOrderId;

    /**
    * 关联的集群规格数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 规格简单描述
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规格详细描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CPU数
    */
    @SerializedName("TotalCpu")
    @Expose
    private Long TotalCpu;

    /**
    * 内存数
    */
    @SerializedName("TotalMem")
    @Expose
    private Long TotalMem;

    /**
    * GPU数
    */
    @SerializedName("TotalGpu")
    @Expose
    private Long TotalGpu;

    /**
    * 规格英文名
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 规格展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeFormat")
    @Expose
    private String ComputeFormat;

    /**
     * Get 专用集群类型id 
     * @return DedicatedClusterTypeId 专用集群类型id
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set 专用集群类型id
     * @param DedicatedClusterTypeId 专用集群类型id
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get 支持的存储类型列表 
     * @return SupportedStorageType 支持的存储类型列表
     */
    public String [] getSupportedStorageType() {
        return this.SupportedStorageType;
    }

    /**
     * Set 支持的存储类型列表
     * @param SupportedStorageType 支持的存储类型列表
     */
    public void setSupportedStorageType(String [] SupportedStorageType) {
        this.SupportedStorageType = SupportedStorageType;
    }

    /**
     * Get 支持的上连交换机的链路传输速率(GiB) 
     * @return SupportedUplinkSpeed 支持的上连交换机的链路传输速率(GiB)
     */
    public Long [] getSupportedUplinkSpeed() {
        return this.SupportedUplinkSpeed;
    }

    /**
     * Set 支持的上连交换机的链路传输速率(GiB)
     * @param SupportedUplinkSpeed 支持的上连交换机的链路传输速率(GiB)
     */
    public void setSupportedUplinkSpeed(Long [] SupportedUplinkSpeed) {
        this.SupportedUplinkSpeed = SupportedUplinkSpeed;
    }

    /**
     * Get 支持的实例族列表 
     * @return SupportedInstanceFamily 支持的实例族列表
     */
    public String [] getSupportedInstanceFamily() {
        return this.SupportedInstanceFamily;
    }

    /**
     * Set 支持的实例族列表
     * @param SupportedInstanceFamily 支持的实例族列表
     */
    public void setSupportedInstanceFamily(String [] SupportedInstanceFamily) {
        this.SupportedInstanceFamily = SupportedInstanceFamily;
    }

    /**
     * Get 地板承重要求(KG) 
     * @return Weight 地板承重要求(KG)
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 地板承重要求(KG)
     * @param Weight 地板承重要求(KG)
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 功率要求(KW) 
     * @return PowerDraw 功率要求(KW)
     */
    public Float getPowerDraw() {
        return this.PowerDraw;
    }

    /**
     * Set 功率要求(KW)
     * @param PowerDraw 功率要求(KW)
     */
    public void setPowerDraw(Float PowerDraw) {
        this.PowerDraw = PowerDraw;
    }

    /**
     * Get 订单状态 
     * @return SubOrderStatus 订单状态
     */
    public String getSubOrderStatus() {
        return this.SubOrderStatus;
    }

    /**
     * Set 订单状态
     * @param SubOrderStatus 订单状态
     */
    public void setSubOrderStatus(String SubOrderStatus) {
        this.SubOrderStatus = SubOrderStatus;
    }

    /**
     * Get 订单创建的时间 
     * @return CreateTime 订单创建的时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 订单创建的时间
     * @param CreateTime 订单创建的时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 子订单ID 
     * @return SubOrderId 子订单ID
     */
    public String getSubOrderId() {
        return this.SubOrderId;
    }

    /**
     * Set 子订单ID
     * @param SubOrderId 子订单ID
     */
    public void setSubOrderId(String SubOrderId) {
        this.SubOrderId = SubOrderId;
    }

    /**
     * Get 关联的集群规格数量 
     * @return Count 关联的集群规格数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 关联的集群规格数量
     * @param Count 关联的集群规格数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 规格简单描述 
     * @return Name 规格简单描述
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规格简单描述
     * @param Name 规格简单描述
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规格详细描述 
     * @return Description 规格详细描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规格详细描述
     * @param Description 规格详细描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CPU数 
     * @return TotalCpu CPU数
     */
    public Long getTotalCpu() {
        return this.TotalCpu;
    }

    /**
     * Set CPU数
     * @param TotalCpu CPU数
     */
    public void setTotalCpu(Long TotalCpu) {
        this.TotalCpu = TotalCpu;
    }

    /**
     * Get 内存数 
     * @return TotalMem 内存数
     */
    public Long getTotalMem() {
        return this.TotalMem;
    }

    /**
     * Set 内存数
     * @param TotalMem 内存数
     */
    public void setTotalMem(Long TotalMem) {
        this.TotalMem = TotalMem;
    }

    /**
     * Get GPU数 
     * @return TotalGpu GPU数
     */
    public Long getTotalGpu() {
        return this.TotalGpu;
    }

    /**
     * Set GPU数
     * @param TotalGpu GPU数
     */
    public void setTotalGpu(Long TotalGpu) {
        this.TotalGpu = TotalGpu;
    }

    /**
     * Get 规格英文名 
     * @return TypeName 规格英文名
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 规格英文名
     * @param TypeName 规格英文名
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 规格展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeFormat 规格展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeFormat() {
        return this.ComputeFormat;
    }

    /**
     * Set 规格展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeFormat 规格展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeFormat(String ComputeFormat) {
        this.ComputeFormat = ComputeFormat;
    }

    public DedicatedClusterOrderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterOrderItem(DedicatedClusterOrderItem source) {
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkSpeed != null) {
            this.SupportedUplinkSpeed = new Long[source.SupportedUplinkSpeed.length];
            for (int i = 0; i < source.SupportedUplinkSpeed.length; i++) {
                this.SupportedUplinkSpeed[i] = new Long(source.SupportedUplinkSpeed[i]);
            }
        }
        if (source.SupportedInstanceFamily != null) {
            this.SupportedInstanceFamily = new String[source.SupportedInstanceFamily.length];
            for (int i = 0; i < source.SupportedInstanceFamily.length; i++) {
                this.SupportedInstanceFamily[i] = new String(source.SupportedInstanceFamily[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PowerDraw != null) {
            this.PowerDraw = new Float(source.PowerDraw);
        }
        if (source.SubOrderStatus != null) {
            this.SubOrderStatus = new String(source.SubOrderStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SubOrderId != null) {
            this.SubOrderId = new String(source.SubOrderId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TotalCpu != null) {
            this.TotalCpu = new Long(source.TotalCpu);
        }
        if (source.TotalMem != null) {
            this.TotalMem = new Long(source.TotalMem);
        }
        if (source.TotalGpu != null) {
            this.TotalGpu = new Long(source.TotalGpu);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.ComputeFormat != null) {
            this.ComputeFormat = new String(source.ComputeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkSpeed.", this.SupportedUplinkSpeed);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDraw", this.PowerDraw);
        this.setParamSimple(map, prefix + "SubOrderStatus", this.SubOrderStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SubOrderId", this.SubOrderId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TotalCpu", this.TotalCpu);
        this.setParamSimple(map, prefix + "TotalMem", this.TotalMem);
        this.setParamSimple(map, prefix + "TotalGpu", this.TotalGpu);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "ComputeFormat", this.ComputeFormat);

    }
}

