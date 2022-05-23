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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuotaItem extends AbstractModel{

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[专用宿主机](https://cloud.tencent.com/document/product/416)付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 网卡类型，例如：25代表25G网卡
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 机型名称。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
    */
    @SerializedName("LocalDiskTypeList")
    @Expose
    private LocalDiskType [] LocalDiskTypeList;

    /**
    * 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例的售卖价格。
    */
    @SerializedName("Price")
    @Expose
    private ItemPrice Price;

    /**
    * 售罄原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoldOutReason")
    @Expose
    private String SoldOutReason;

    /**
    * 内网带宽，单位Gbps。
    */
    @SerializedName("InstanceBandwidth")
    @Expose
    private Float InstanceBandwidth;

    /**
    * 网络收发包能力，单位万PPS。
    */
    @SerializedName("InstancePps")
    @Expose
    private Long InstancePps;

    /**
    * 本地存储块数量。
    */
    @SerializedName("StorageBlockAmount")
    @Expose
    private Long StorageBlockAmount;

    /**
    * 处理器型号。
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 实例的GPU数量。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 实例的FPGA数量。
    */
    @SerializedName("Fpga")
    @Expose
    private Long Fpga;

    /**
    * 实例备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例机型。 
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[专用宿主机](https://cloud.tencent.com/document/product/416)付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。 
     * @return InstanceChargeType 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[专用宿主机](https://cloud.tencent.com/document/product/416)付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[专用宿主机](https://cloud.tencent.com/document/product/416)付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     * @param InstanceChargeType 实例计费模式。取值范围： <br><li>PREPAID：表示预付费，即包年包月<br><li>POSTPAID_BY_HOUR：表示后付费，即按量计费<br><li>CDHPAID：表示[专用宿主机](https://cloud.tencent.com/document/product/416)付费，即只对`专用宿主机`计费，不对`专用宿主机`上的实例计费。<br><li>`SPOTPAID`：表示竞价实例付费。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 网卡类型，例如：25代表25G网卡 
     * @return NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set 网卡类型，例如：25代表25G网卡
     * @param NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Externals 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Externals 扩展属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get 实例的CPU核数，单位：核。 
     * @return Cpu 实例的CPU核数，单位：核。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例的CPU核数，单位：核。
     * @param Cpu 实例的CPU核数，单位：核。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存容量，单位：`GB`。 
     * @return Memory 实例内存容量，单位：`GB`。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：`GB`。
     * @param Memory 实例内存容量，单位：`GB`。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例机型系列。 
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 机型名称。 
     * @return TypeName 机型名称。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 机型名称。
     * @param TypeName 机型名称。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。 
     * @return LocalDiskTypeList 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     */
    public LocalDiskType [] getLocalDiskTypeList() {
        return this.LocalDiskTypeList;
    }

    /**
     * Set 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     * @param LocalDiskTypeList 本地磁盘规格列表。当该参数返回为空值时，表示当前情况下无法创建本地盘。
     */
    public void setLocalDiskTypeList(LocalDiskType [] LocalDiskTypeList) {
        this.LocalDiskTypeList = LocalDiskTypeList;
    }

    /**
     * Get 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。 
     * @return Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     * @param Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例的售卖价格。 
     * @return Price 实例的售卖价格。
     */
    public ItemPrice getPrice() {
        return this.Price;
    }

    /**
     * Set 实例的售卖价格。
     * @param Price 实例的售卖价格。
     */
    public void setPrice(ItemPrice Price) {
        this.Price = Price;
    }

    /**
     * Get 售罄原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoldOutReason 售罄原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSoldOutReason() {
        return this.SoldOutReason;
    }

    /**
     * Set 售罄原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoldOutReason 售罄原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoldOutReason(String SoldOutReason) {
        this.SoldOutReason = SoldOutReason;
    }

    /**
     * Get 内网带宽，单位Gbps。 
     * @return InstanceBandwidth 内网带宽，单位Gbps。
     */
    public Float getInstanceBandwidth() {
        return this.InstanceBandwidth;
    }

    /**
     * Set 内网带宽，单位Gbps。
     * @param InstanceBandwidth 内网带宽，单位Gbps。
     */
    public void setInstanceBandwidth(Float InstanceBandwidth) {
        this.InstanceBandwidth = InstanceBandwidth;
    }

    /**
     * Get 网络收发包能力，单位万PPS。 
     * @return InstancePps 网络收发包能力，单位万PPS。
     */
    public Long getInstancePps() {
        return this.InstancePps;
    }

    /**
     * Set 网络收发包能力，单位万PPS。
     * @param InstancePps 网络收发包能力，单位万PPS。
     */
    public void setInstancePps(Long InstancePps) {
        this.InstancePps = InstancePps;
    }

    /**
     * Get 本地存储块数量。 
     * @return StorageBlockAmount 本地存储块数量。
     */
    public Long getStorageBlockAmount() {
        return this.StorageBlockAmount;
    }

    /**
     * Set 本地存储块数量。
     * @param StorageBlockAmount 本地存储块数量。
     */
    public void setStorageBlockAmount(Long StorageBlockAmount) {
        this.StorageBlockAmount = StorageBlockAmount;
    }

    /**
     * Get 处理器型号。 
     * @return CpuType 处理器型号。
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set 处理器型号。
     * @param CpuType 处理器型号。
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 实例的GPU数量。 
     * @return Gpu 实例的GPU数量。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set 实例的GPU数量。
     * @param Gpu 实例的GPU数量。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 实例的FPGA数量。 
     * @return Fpga 实例的FPGA数量。
     */
    public Long getFpga() {
        return this.Fpga;
    }

    /**
     * Set 实例的FPGA数量。
     * @param Fpga 实例的FPGA数量。
     */
    public void setFpga(Long Fpga) {
        this.Fpga = Fpga;
    }

    /**
     * Get 实例备注信息。 
     * @return Remark 实例备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 实例备注信息。
     * @param Remark 实例备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public InstanceTypeQuotaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeQuotaItem(InstanceTypeQuotaItem source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
        if (source.Externals != null) {
            this.Externals = new Externals(source.Externals);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.LocalDiskTypeList != null) {
            this.LocalDiskTypeList = new LocalDiskType[source.LocalDiskTypeList.length];
            for (int i = 0; i < source.LocalDiskTypeList.length; i++) {
                this.LocalDiskTypeList[i] = new LocalDiskType(source.LocalDiskTypeList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Price != null) {
            this.Price = new ItemPrice(source.Price);
        }
        if (source.SoldOutReason != null) {
            this.SoldOutReason = new String(source.SoldOutReason);
        }
        if (source.InstanceBandwidth != null) {
            this.InstanceBandwidth = new Float(source.InstanceBandwidth);
        }
        if (source.InstancePps != null) {
            this.InstancePps = new Long(source.InstancePps);
        }
        if (source.StorageBlockAmount != null) {
            this.StorageBlockAmount = new Long(source.StorageBlockAmount);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.Fpga != null) {
            this.Fpga = new Long(source.Fpga);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArrayObj(map, prefix + "LocalDiskTypeList.", this.LocalDiskTypeList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "SoldOutReason", this.SoldOutReason);
        this.setParamSimple(map, prefix + "InstanceBandwidth", this.InstanceBandwidth);
        this.setParamSimple(map, prefix + "InstancePps", this.InstancePps);
        this.setParamSimple(map, prefix + "StorageBlockAmount", this.StorageBlockAmount);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Fpga", this.Fpga);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

