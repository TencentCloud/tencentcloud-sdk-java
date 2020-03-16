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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceClass extends AbstractModel{

    /**
    * 机型ID
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * CPU描述
    */
    @SerializedName("CpuDescription")
    @Expose
    private String CpuDescription;

    /**
    * 内存描述
    */
    @SerializedName("MemDescription")
    @Expose
    private String MemDescription;

    /**
    * 硬盘描述
    */
    @SerializedName("DiskDescription")
    @Expose
    private String DiskDescription;

    /**
    * 是否支持RAID. 0:不支持; 1:支持
    */
    @SerializedName("HaveRaidCard")
    @Expose
    private Long HaveRaidCard;

    /**
    * 网卡描述
    */
    @SerializedName("NicDescription")
    @Expose
    private String NicDescription;

    /**
    * GPU描述
    */
    @SerializedName("GpuDescription")
    @Expose
    private String GpuDescription;

    /**
    * 单价折扣
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 用户刊例价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Long UnitPrice;

    /**
    * 实际价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealPrice")
    @Expose
    private Long RealPrice;

    /**
    * 官网刊例价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalPrice")
    @Expose
    private Long NormalPrice;

    /**
    * 设备使用场景类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 机型系列
    */
    @SerializedName("Series")
    @Expose
    private Long Series;

    /**
    * cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存容量。单位G
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
     * Get 机型ID 
     * @return DeviceClassCode 机型ID
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 机型ID
     * @param DeviceClassCode 机型ID
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * Get CPU描述 
     * @return CpuDescription CPU描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * Set CPU描述
     * @param CpuDescription CPU描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * Get 内存描述 
     * @return MemDescription 内存描述
     */
    public String getMemDescription() {
        return this.MemDescription;
    }

    /**
     * Set 内存描述
     * @param MemDescription 内存描述
     */
    public void setMemDescription(String MemDescription) {
        this.MemDescription = MemDescription;
    }

    /**
     * Get 硬盘描述 
     * @return DiskDescription 硬盘描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * Set 硬盘描述
     * @param DiskDescription 硬盘描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * Get 是否支持RAID. 0:不支持; 1:支持 
     * @return HaveRaidCard 是否支持RAID. 0:不支持; 1:支持
     */
    public Long getHaveRaidCard() {
        return this.HaveRaidCard;
    }

    /**
     * Set 是否支持RAID. 0:不支持; 1:支持
     * @param HaveRaidCard 是否支持RAID. 0:不支持; 1:支持
     */
    public void setHaveRaidCard(Long HaveRaidCard) {
        this.HaveRaidCard = HaveRaidCard;
    }

    /**
     * Get 网卡描述 
     * @return NicDescription 网卡描述
     */
    public String getNicDescription() {
        return this.NicDescription;
    }

    /**
     * Set 网卡描述
     * @param NicDescription 网卡描述
     */
    public void setNicDescription(String NicDescription) {
        this.NicDescription = NicDescription;
    }

    /**
     * Get GPU描述 
     * @return GpuDescription GPU描述
     */
    public String getGpuDescription() {
        return this.GpuDescription;
    }

    /**
     * Set GPU描述
     * @param GpuDescription GPU描述
     */
    public void setGpuDescription(String GpuDescription) {
        this.GpuDescription = GpuDescription;
    }

    /**
     * Get 单价折扣
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 单价折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 单价折扣
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 单价折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 用户刊例价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 用户刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 用户刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 用户刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Long UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 实际价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealPrice 实际价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set 实际价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealPrice 实际价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealPrice(Long RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get 官网刊例价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalPrice 官网刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNormalPrice() {
        return this.NormalPrice;
    }

    /**
     * Set 官网刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalPrice 官网刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalPrice(Long NormalPrice) {
        this.NormalPrice = NormalPrice;
    }

    /**
     * Get 设备使用场景类型 
     * @return DeviceType 设备使用场景类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备使用场景类型
     * @param DeviceType 设备使用场景类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 机型系列 
     * @return Series 机型系列
     */
    public Long getSeries() {
        return this.Series;
    }

    /**
     * Set 机型系列
     * @param Series 机型系列
     */
    public void setSeries(Long Series) {
        this.Series = Series;
    }

    /**
     * Get cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2 
     * @return Cpu cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     * @param Cpu cpu的核心数。仅是物理服务器未开启超线程的核心数， 超线程的核心数为Cpu*2
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存容量。单位G 
     * @return Mem 内存容量。单位G
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存容量。单位G
     * @param Mem 内存容量。单位G
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "CpuDescription", this.CpuDescription);
        this.setParamSimple(map, prefix + "MemDescription", this.MemDescription);
        this.setParamSimple(map, prefix + "DiskDescription", this.DiskDescription);
        this.setParamSimple(map, prefix + "HaveRaidCard", this.HaveRaidCard);
        this.setParamSimple(map, prefix + "NicDescription", this.NicDescription);
        this.setParamSimple(map, prefix + "GpuDescription", this.GpuDescription);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "NormalPrice", this.NormalPrice);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Series", this.Series);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);

    }
}

