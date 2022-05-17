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

public class SiteDetail extends AbstractModel{

    /**
    * 站点id
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 站点描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 站点创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 光纤类型
    */
    @SerializedName("FiberType")
    @Expose
    private String FiberType;

    /**
    * 网络到腾讯云Region区域的上行链路速度
    */
    @SerializedName("UplinkSpeedGbps")
    @Expose
    private Long UplinkSpeedGbps;

    /**
    * 将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。
    */
    @SerializedName("UplinkCount")
    @Expose
    private Long UplinkCount;

    /**
    * 将CDC连接到网络时采用的光学标准
    */
    @SerializedName("OpticalStandard")
    @Expose
    private String OpticalStandard;

    /**
    * 是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。
    */
    @SerializedName("RedundantNetworking")
    @Expose
    private Boolean RedundantNetworking;

    /**
    * 电源连接器类型
    */
    @SerializedName("PowerConnectors")
    @Expose
    private String PowerConnectors;

    /**
    * 从机架上方还是下方供电。
    */
    @SerializedName("PowerFeedDrop")
    @Expose
    private String PowerFeedDrop;

    /**
    * 功耗(KW)
    */
    @SerializedName("PowerDrawKva")
    @Expose
    private Float PowerDrawKva;

    /**
    * 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。
    */
    @SerializedName("ConditionRequirement")
    @Expose
    private Boolean ConditionRequirement;

    /**
    * 是否满足下面的尺寸条件：
您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。
您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。
在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。
    */
    @SerializedName("DimensionRequirement")
    @Expose
    private Boolean DimensionRequirement;

    /**
    * 最大承重(KG)
    */
    @SerializedName("MaxWeight")
    @Expose
    private Long MaxWeight;

    /**
    * 站点地址
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
    * 站点所在地区的详细地址信息（补充）
    */
    @SerializedName("OptionalAddressLine")
    @Expose
    private String OptionalAddressLine;

    /**
    * 是否需要腾讯云团队协助完成机架支撑工作
    */
    @SerializedName("NeedHelp")
    @Expose
    private Boolean NeedHelp;

    /**
    * 上游断路器是否具备
    */
    @SerializedName("BreakerRequirement")
    @Expose
    private Boolean BreakerRequirement;

    /**
    * 是否电源冗余
    */
    @SerializedName("RedundantPower")
    @Expose
    private Boolean RedundantPower;

    /**
    * 站点所在国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 站点所在省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 站点所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 站点所在地区的邮编
    */
    @SerializedName("PostalCode")
    @Expose
    private Long PostalCode;

    /**
     * Get 站点id 
     * @return SiteId 站点id
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 站点id
     * @param SiteId 站点id
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 站点描述 
     * @return Description 站点描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 站点描述
     * @param Description 站点描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 站点创建时间 
     * @return CreateTime 站点创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 站点创建时间
     * @param CreateTime 站点创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 光纤类型 
     * @return FiberType 光纤类型
     */
    public String getFiberType() {
        return this.FiberType;
    }

    /**
     * Set 光纤类型
     * @param FiberType 光纤类型
     */
    public void setFiberType(String FiberType) {
        this.FiberType = FiberType;
    }

    /**
     * Get 网络到腾讯云Region区域的上行链路速度 
     * @return UplinkSpeedGbps 网络到腾讯云Region区域的上行链路速度
     */
    public Long getUplinkSpeedGbps() {
        return this.UplinkSpeedGbps;
    }

    /**
     * Set 网络到腾讯云Region区域的上行链路速度
     * @param UplinkSpeedGbps 网络到腾讯云Region区域的上行链路速度
     */
    public void setUplinkSpeedGbps(Long UplinkSpeedGbps) {
        this.UplinkSpeedGbps = UplinkSpeedGbps;
    }

    /**
     * Get 将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。 
     * @return UplinkCount 将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。
     */
    public Long getUplinkCount() {
        return this.UplinkCount;
    }

    /**
     * Set 将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。
     * @param UplinkCount 将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。
     */
    public void setUplinkCount(Long UplinkCount) {
        this.UplinkCount = UplinkCount;
    }

    /**
     * Get 将CDC连接到网络时采用的光学标准 
     * @return OpticalStandard 将CDC连接到网络时采用的光学标准
     */
    public String getOpticalStandard() {
        return this.OpticalStandard;
    }

    /**
     * Set 将CDC连接到网络时采用的光学标准
     * @param OpticalStandard 将CDC连接到网络时采用的光学标准
     */
    public void setOpticalStandard(String OpticalStandard) {
        this.OpticalStandard = OpticalStandard;
    }

    /**
     * Get 是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。 
     * @return RedundantNetworking 是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。
     */
    public Boolean getRedundantNetworking() {
        return this.RedundantNetworking;
    }

    /**
     * Set 是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。
     * @param RedundantNetworking 是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。
     */
    public void setRedundantNetworking(Boolean RedundantNetworking) {
        this.RedundantNetworking = RedundantNetworking;
    }

    /**
     * Get 电源连接器类型 
     * @return PowerConnectors 电源连接器类型
     */
    public String getPowerConnectors() {
        return this.PowerConnectors;
    }

    /**
     * Set 电源连接器类型
     * @param PowerConnectors 电源连接器类型
     */
    public void setPowerConnectors(String PowerConnectors) {
        this.PowerConnectors = PowerConnectors;
    }

    /**
     * Get 从机架上方还是下方供电。 
     * @return PowerFeedDrop 从机架上方还是下方供电。
     */
    public String getPowerFeedDrop() {
        return this.PowerFeedDrop;
    }

    /**
     * Set 从机架上方还是下方供电。
     * @param PowerFeedDrop 从机架上方还是下方供电。
     */
    public void setPowerFeedDrop(String PowerFeedDrop) {
        this.PowerFeedDrop = PowerFeedDrop;
    }

    /**
     * Get 功耗(KW) 
     * @return PowerDrawKva 功耗(KW)
     */
    public Float getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set 功耗(KW)
     * @param PowerDrawKva 功耗(KW)
     */
    public void setPowerDrawKva(Float PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。 
     * @return ConditionRequirement 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。
     */
    public Boolean getConditionRequirement() {
        return this.ConditionRequirement;
    }

    /**
     * Set 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。
     * @param ConditionRequirement 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。
     */
    public void setConditionRequirement(Boolean ConditionRequirement) {
        this.ConditionRequirement = ConditionRequirement;
    }

    /**
     * Get 是否满足下面的尺寸条件：
您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。
您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。
在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。 
     * @return DimensionRequirement 是否满足下面的尺寸条件：
您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。
您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。
在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。
     */
    public Boolean getDimensionRequirement() {
        return this.DimensionRequirement;
    }

    /**
     * Set 是否满足下面的尺寸条件：
您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。
您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。
在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。
     * @param DimensionRequirement 是否满足下面的尺寸条件：
您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。
您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。
在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。
     */
    public void setDimensionRequirement(Boolean DimensionRequirement) {
        this.DimensionRequirement = DimensionRequirement;
    }

    /**
     * Get 最大承重(KG) 
     * @return MaxWeight 最大承重(KG)
     */
    public Long getMaxWeight() {
        return this.MaxWeight;
    }

    /**
     * Set 最大承重(KG)
     * @param MaxWeight 最大承重(KG)
     */
    public void setMaxWeight(Long MaxWeight) {
        this.MaxWeight = MaxWeight;
    }

    /**
     * Get 站点地址 
     * @return AddressLine 站点地址
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set 站点地址
     * @param AddressLine 站点地址
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    /**
     * Get 站点所在地区的详细地址信息（补充） 
     * @return OptionalAddressLine 站点所在地区的详细地址信息（补充）
     */
    public String getOptionalAddressLine() {
        return this.OptionalAddressLine;
    }

    /**
     * Set 站点所在地区的详细地址信息（补充）
     * @param OptionalAddressLine 站点所在地区的详细地址信息（补充）
     */
    public void setOptionalAddressLine(String OptionalAddressLine) {
        this.OptionalAddressLine = OptionalAddressLine;
    }

    /**
     * Get 是否需要腾讯云团队协助完成机架支撑工作 
     * @return NeedHelp 是否需要腾讯云团队协助完成机架支撑工作
     */
    public Boolean getNeedHelp() {
        return this.NeedHelp;
    }

    /**
     * Set 是否需要腾讯云团队协助完成机架支撑工作
     * @param NeedHelp 是否需要腾讯云团队协助完成机架支撑工作
     */
    public void setNeedHelp(Boolean NeedHelp) {
        this.NeedHelp = NeedHelp;
    }

    /**
     * Get 上游断路器是否具备 
     * @return BreakerRequirement 上游断路器是否具备
     */
    public Boolean getBreakerRequirement() {
        return this.BreakerRequirement;
    }

    /**
     * Set 上游断路器是否具备
     * @param BreakerRequirement 上游断路器是否具备
     */
    public void setBreakerRequirement(Boolean BreakerRequirement) {
        this.BreakerRequirement = BreakerRequirement;
    }

    /**
     * Get 是否电源冗余 
     * @return RedundantPower 是否电源冗余
     */
    public Boolean getRedundantPower() {
        return this.RedundantPower;
    }

    /**
     * Set 是否电源冗余
     * @param RedundantPower 是否电源冗余
     */
    public void setRedundantPower(Boolean RedundantPower) {
        this.RedundantPower = RedundantPower;
    }

    /**
     * Get 站点所在国家 
     * @return Country 站点所在国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 站点所在国家
     * @param Country 站点所在国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 站点所在省份 
     * @return Province 站点所在省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 站点所在省份
     * @param Province 站点所在省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 站点所在城市 
     * @return City 站点所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 站点所在城市
     * @param City 站点所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 站点所在地区的邮编 
     * @return PostalCode 站点所在地区的邮编
     */
    public Long getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 站点所在地区的邮编
     * @param PostalCode 站点所在地区的邮编
     */
    public void setPostalCode(Long PostalCode) {
        this.PostalCode = PostalCode;
    }

    public SiteDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SiteDetail(SiteDetail source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FiberType != null) {
            this.FiberType = new String(source.FiberType);
        }
        if (source.UplinkSpeedGbps != null) {
            this.UplinkSpeedGbps = new Long(source.UplinkSpeedGbps);
        }
        if (source.UplinkCount != null) {
            this.UplinkCount = new Long(source.UplinkCount);
        }
        if (source.OpticalStandard != null) {
            this.OpticalStandard = new String(source.OpticalStandard);
        }
        if (source.RedundantNetworking != null) {
            this.RedundantNetworking = new Boolean(source.RedundantNetworking);
        }
        if (source.PowerConnectors != null) {
            this.PowerConnectors = new String(source.PowerConnectors);
        }
        if (source.PowerFeedDrop != null) {
            this.PowerFeedDrop = new String(source.PowerFeedDrop);
        }
        if (source.PowerDrawKva != null) {
            this.PowerDrawKva = new Float(source.PowerDrawKva);
        }
        if (source.ConditionRequirement != null) {
            this.ConditionRequirement = new Boolean(source.ConditionRequirement);
        }
        if (source.DimensionRequirement != null) {
            this.DimensionRequirement = new Boolean(source.DimensionRequirement);
        }
        if (source.MaxWeight != null) {
            this.MaxWeight = new Long(source.MaxWeight);
        }
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
        if (source.OptionalAddressLine != null) {
            this.OptionalAddressLine = new String(source.OptionalAddressLine);
        }
        if (source.NeedHelp != null) {
            this.NeedHelp = new Boolean(source.NeedHelp);
        }
        if (source.BreakerRequirement != null) {
            this.BreakerRequirement = new Boolean(source.BreakerRequirement);
        }
        if (source.RedundantPower != null) {
            this.RedundantPower = new Boolean(source.RedundantPower);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new Long(source.PostalCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FiberType", this.FiberType);
        this.setParamSimple(map, prefix + "UplinkSpeedGbps", this.UplinkSpeedGbps);
        this.setParamSimple(map, prefix + "UplinkCount", this.UplinkCount);
        this.setParamSimple(map, prefix + "OpticalStandard", this.OpticalStandard);
        this.setParamSimple(map, prefix + "RedundantNetworking", this.RedundantNetworking);
        this.setParamSimple(map, prefix + "PowerConnectors", this.PowerConnectors);
        this.setParamSimple(map, prefix + "PowerFeedDrop", this.PowerFeedDrop);
        this.setParamSimple(map, prefix + "PowerDrawKva", this.PowerDrawKva);
        this.setParamSimple(map, prefix + "ConditionRequirement", this.ConditionRequirement);
        this.setParamSimple(map, prefix + "DimensionRequirement", this.DimensionRequirement);
        this.setParamSimple(map, prefix + "MaxWeight", this.MaxWeight);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);
        this.setParamSimple(map, prefix + "OptionalAddressLine", this.OptionalAddressLine);
        this.setParamSimple(map, prefix + "NeedHelp", this.NeedHelp);
        this.setParamSimple(map, prefix + "BreakerRequirement", this.BreakerRequirement);
        this.setParamSimple(map, prefix + "RedundantPower", this.RedundantPower);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);

    }
}

