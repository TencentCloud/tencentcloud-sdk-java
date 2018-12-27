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

public class DeviceClass  extends AbstractModel{

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
    private Integer HaveRaidCard;

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
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 用户刊例价格
    */
    @SerializedName("UnitPrice")
    @Expose
    private Integer UnitPrice;

    /**
    * 实际价格
    */
    @SerializedName("RealPrice")
    @Expose
    private Integer RealPrice;

    /**
    * 官网刊例价格
    */
    @SerializedName("NormalPrice")
    @Expose
    private Integer NormalPrice;

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
    private Integer Series;

    /**
     * 获取机型ID
     * @return DeviceClassCode 机型ID
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置机型ID
     * @param DeviceClassCode 机型ID
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取CPU描述
     * @return CpuDescription CPU描述
     */
    public String getCpuDescription() {
        return this.CpuDescription;
    }

    /**
     * 设置CPU描述
     * @param CpuDescription CPU描述
     */
    public void setCpuDescription(String CpuDescription) {
        this.CpuDescription = CpuDescription;
    }

    /**
     * 获取内存描述
     * @return MemDescription 内存描述
     */
    public String getMemDescription() {
        return this.MemDescription;
    }

    /**
     * 设置内存描述
     * @param MemDescription 内存描述
     */
    public void setMemDescription(String MemDescription) {
        this.MemDescription = MemDescription;
    }

    /**
     * 获取硬盘描述
     * @return DiskDescription 硬盘描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * 设置硬盘描述
     * @param DiskDescription 硬盘描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * 获取是否支持RAID. 0:不支持; 1:支持
     * @return HaveRaidCard 是否支持RAID. 0:不支持; 1:支持
     */
    public Integer getHaveRaidCard() {
        return this.HaveRaidCard;
    }

    /**
     * 设置是否支持RAID. 0:不支持; 1:支持
     * @param HaveRaidCard 是否支持RAID. 0:不支持; 1:支持
     */
    public void setHaveRaidCard(Integer HaveRaidCard) {
        this.HaveRaidCard = HaveRaidCard;
    }

    /**
     * 获取网卡描述
     * @return NicDescription 网卡描述
     */
    public String getNicDescription() {
        return this.NicDescription;
    }

    /**
     * 设置网卡描述
     * @param NicDescription 网卡描述
     */
    public void setNicDescription(String NicDescription) {
        this.NicDescription = NicDescription;
    }

    /**
     * 获取GPU描述
     * @return GpuDescription GPU描述
     */
    public String getGpuDescription() {
        return this.GpuDescription;
    }

    /**
     * 设置GPU描述
     * @param GpuDescription GPU描述
     */
    public void setGpuDescription(String GpuDescription) {
        this.GpuDescription = GpuDescription;
    }

    /**
     * 获取单价折扣
     * @return Discount 单价折扣
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * 设置单价折扣
     * @param Discount 单价折扣
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * 获取用户刊例价格
     * @return UnitPrice 用户刊例价格
     */
    public Integer getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * 设置用户刊例价格
     * @param UnitPrice 用户刊例价格
     */
    public void setUnitPrice(Integer UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * 获取实际价格
     * @return RealPrice 实际价格
     */
    public Integer getRealPrice() {
        return this.RealPrice;
    }

    /**
     * 设置实际价格
     * @param RealPrice 实际价格
     */
    public void setRealPrice(Integer RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * 获取官网刊例价格
     * @return NormalPrice 官网刊例价格
     */
    public Integer getNormalPrice() {
        return this.NormalPrice;
    }

    /**
     * 设置官网刊例价格
     * @param NormalPrice 官网刊例价格
     */
    public void setNormalPrice(Integer NormalPrice) {
        this.NormalPrice = NormalPrice;
    }

    /**
     * 获取设备使用场景类型
     * @return DeviceType 设备使用场景类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置设备使用场景类型
     * @param DeviceType 设备使用场景类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取机型系列
     * @return Series 机型系列
     */
    public Integer getSeries() {
        return this.Series;
    }

    /**
     * 设置机型系列
     * @param Series 机型系列
     */
    public void setSeries(Integer Series) {
        this.Series = Series;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

