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

public class DevicePriceInfo  extends AbstractModel{

    /**
    * 物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备型号
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 是否是弹性机型，1：是，0：否
    */
    @SerializedName("IsElastic")
    @Expose
    private Integer IsElastic;

    /**
    * 付费模式ID, 1:预付费; 2:后付费; 3:预付费转后付费中
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Integer CpmPayMode;

    /**
    * Cpu信息描述
    */
    @SerializedName("CpuDescription")
    @Expose
    private String CpuDescription;

    /**
    * 内存信息描述
    */
    @SerializedName("MemDescription")
    @Expose
    private String MemDescription;

    /**
    * 硬盘信息描述
    */
    @SerializedName("DiskDescription")
    @Expose
    private String DiskDescription;

    /**
    * 网卡信息描述
    */
    @SerializedName("NicDescription")
    @Expose
    private String NicDescription;

    /**
    * Gpu信息描述
    */
    @SerializedName("GpuDescription")
    @Expose
    private String GpuDescription;

    /**
    * Raid信息描述
    */
    @SerializedName("RaidDescription")
    @Expose
    private String RaidDescription;

    /**
    * 客户的单价
    */
    @SerializedName("Price")
    @Expose
    private Integer Price;

    /**
    * 刊例单价
    */
    @SerializedName("NormalPrice")
    @Expose
    private Integer NormalPrice;

    /**
    * 原价
    */
    @SerializedName("TotalCost")
    @Expose
    private Integer TotalCost;

    /**
    * 折扣价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Integer RealTotalCost;

    /**
    * 计费时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 计费时长单位, m:按月计费; d:按天计费
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 商品数量
    */
    @SerializedName("GoodsCount")
    @Expose
    private Integer GoodsCount;

    /**
     * 获取物理机ID
     * @return InstanceId 物理机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置物理机ID
     * @param InstanceId 物理机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取设备型号
     * @return DeviceClassCode 设备型号
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置设备型号
     * @param DeviceClassCode 设备型号
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取是否是弹性机型，1：是，0：否
     * @return IsElastic 是否是弹性机型，1：是，0：否
     */
    public Integer getIsElastic() {
        return this.IsElastic;
    }

    /**
     * 设置是否是弹性机型，1：是，0：否
     * @param IsElastic 是否是弹性机型，1：是，0：否
     */
    public void setIsElastic(Integer IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * 获取付费模式ID, 1:预付费; 2:后付费; 3:预付费转后付费中
     * @return CpmPayMode 付费模式ID, 1:预付费; 2:后付费; 3:预付费转后付费中
     */
    public Integer getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * 设置付费模式ID, 1:预付费; 2:后付费; 3:预付费转后付费中
     * @param CpmPayMode 付费模式ID, 1:预付费; 2:后付费; 3:预付费转后付费中
     */
    public void setCpmPayMode(Integer CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * 获取Cpu信息描述
     * @return CpuDescription Cpu信息描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * 设置Cpu信息描述
     * @param CpuDescription Cpu信息描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * 获取内存信息描述
     * @return MemDescription 内存信息描述
     */
    public String getMemDescription() {
        return this.MemDescription;
    }

    /**
     * 设置内存信息描述
     * @param MemDescription 内存信息描述
     */
    public void setMemDescription(String MemDescription) {
        this.MemDescription = MemDescription;
    }

    /**
     * 获取硬盘信息描述
     * @return DiskDescription 硬盘信息描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * 设置硬盘信息描述
     * @param DiskDescription 硬盘信息描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * 获取网卡信息描述
     * @return NicDescription 网卡信息描述
     */
    public String getNicDescription() {
        return this.NicDescription;
    }

    /**
     * 设置网卡信息描述
     * @param NicDescription 网卡信息描述
     */
    public void setNicDescription(String NicDescription) {
        this.NicDescription = NicDescription;
    }

    /**
     * 获取Gpu信息描述
     * @return GpuDescription Gpu信息描述
     */
    public String getGpuDescription() {
        return this.GpuDescription;
    }

    /**
     * 设置Gpu信息描述
     * @param GpuDescription Gpu信息描述
     */
    public void setGpuDescription(String GpuDescription) {
        this.GpuDescription = GpuDescription;
    }

    /**
     * 获取Raid信息描述
     * @return RaidDescription Raid信息描述
     */
    public String getRaidDescription() {
        return this.RaidDescription;
    }

    /**
     * 设置Raid信息描述
     * @param RaidDescription Raid信息描述
     */
    public void setRaidDescription(String RaidDescription) {
        this.RaidDescription = RaidDescription;
    }

    /**
     * 获取客户的单价
     * @return Price 客户的单价
     */
    public Integer getPrice() {
        return this.Price;
    }

    /**
     * 设置客户的单价
     * @param Price 客户的单价
     */
    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    /**
     * 获取刊例单价
     * @return NormalPrice 刊例单价
     */
    public Integer getNormalPrice() {
        return this.NormalPrice;
    }

    /**
     * 设置刊例单价
     * @param NormalPrice 刊例单价
     */
    public void setNormalPrice(Integer NormalPrice) {
        this.NormalPrice = NormalPrice;
    }

    /**
     * 获取原价
     * @return TotalCost 原价
     */
    public Integer getTotalCost() {
        return this.TotalCost;
    }

    /**
     * 设置原价
     * @param TotalCost 原价
     */
    public void setTotalCost(Integer TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * 获取折扣价
     * @return RealTotalCost 折扣价
     */
    public Integer getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * 设置折扣价
     * @param RealTotalCost 折扣价
     */
    public void setRealTotalCost(Integer RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * 获取计费时长
     * @return TimeSpan 计费时长
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置计费时长
     * @param TimeSpan 计费时长
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取计费时长单位, m:按月计费; d:按天计费
     * @return TimeUnit 计费时长单位, m:按月计费; d:按天计费
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置计费时长单位, m:按月计费; d:按天计费
     * @param TimeUnit 计费时长单位, m:按月计费; d:按天计费
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取商品数量
     * @return GoodsCount 商品数量
     */
    public Integer getGoodsCount() {
        return this.GoodsCount;
    }

    /**
     * 设置商品数量
     * @param GoodsCount 商品数量
     */
    public void setGoodsCount(Integer GoodsCount) {
        this.GoodsCount = GoodsCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "IsElastic", this.IsElastic);
        this.setParamSimple(map, prefix + "CpmPayMode", this.CpmPayMode);
        this.setParamSimple(map, prefix + "CpuDescription", this.CpuDescription);
        this.setParamSimple(map, prefix + "MemDescription", this.MemDescription);
        this.setParamSimple(map, prefix + "DiskDescription", this.DiskDescription);
        this.setParamSimple(map, prefix + "NicDescription", this.NicDescription);
        this.setParamSimple(map, prefix + "GpuDescription", this.GpuDescription);
        this.setParamSimple(map, prefix + "RaidDescription", this.RaidDescription);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "NormalPrice", this.NormalPrice);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "GoodsCount", this.GoodsCount);

    }
}

