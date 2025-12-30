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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSiteRequest extends AbstractModel {

    /**
    * <p>站点名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>站点所在国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>站点所在省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>站点所在城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>站点所在地区的详细地址信息</p>
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
    * <p>站点描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>注意事项</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。取值范围："MM","SM"</p>
    */
    @SerializedName("FiberType")
    @Expose
    private String FiberType;

    /**
    * <p>您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。</p>
    */
    @SerializedName("OpticalStandard")
    @Expose
    private String OpticalStandard;

    /**
    * <p>电源连接器类型</p>
    */
    @SerializedName("PowerConnectors")
    @Expose
    private String PowerConnectors;

    /**
    * <p>从机架上方还是下方供电。取值范围：["UP","DOWN"]</p>
    */
    @SerializedName("PowerFeedDrop")
    @Expose
    private String PowerFeedDrop;

    /**
    * <p>最大承重(KG)</p>
    */
    @SerializedName("MaxWeight")
    @Expose
    private Long MaxWeight;

    /**
    * <p>功耗(KW)</p>
    */
    @SerializedName("PowerDrawKva")
    @Expose
    private Long PowerDrawKva;

    /**
    * <p>网络到腾讯云Region区域的上行链路速度(Gbps)</p>
    */
    @SerializedName("UplinkSpeedGbps")
    @Expose
    private Long UplinkSpeedGbps;

    /**
    * <p>将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。</p>
    */
    @SerializedName("UplinkCount")
    @Expose
    private Long UplinkCount;

    /**
    * <p>是否满足下面环境条件：1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。2、确定的机架位置包含:温度范围为 41 到 104°F (5 到 40°C)。湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。</p>
    */
    @SerializedName("ConditionRequirement")
    @Expose
    private Boolean ConditionRequirement;

    /**
    * <p>是否满足下面的尺寸条件：您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。</p>
    */
    @SerializedName("DimensionRequirement")
    @Expose
    private Boolean DimensionRequirement;

    /**
    * <p>是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。</p>
    */
    @SerializedName("RedundantNetworking")
    @Expose
    private Boolean RedundantNetworking;

    /**
    * <p>站点所在地区的邮编</p>
    */
    @SerializedName("PostalCode")
    @Expose
    private Long PostalCode;

    /**
    * <p>站点所在地区的详细地址信息（补充）</p>
    */
    @SerializedName("OptionalAddressLine")
    @Expose
    private String OptionalAddressLine;

    /**
    * <p>是否需要腾讯云团队协助完成机架支撑工作</p>
    */
    @SerializedName("NeedHelp")
    @Expose
    private Boolean NeedHelp;

    /**
    * <p>是否电源冗余</p>
    */
    @SerializedName("RedundantPower")
    @Expose
    private Boolean RedundantPower;

    /**
    * <p>上游断路器是否具备</p>
    */
    @SerializedName("BreakerRequirement")
    @Expose
    private Boolean BreakerRequirement;

    /**
     * Get <p>站点名称</p> 
     * @return Name <p>站点名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>站点名称</p>
     * @param Name <p>站点名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>站点所在国家</p> 
     * @return Country <p>站点所在国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>站点所在国家</p>
     * @param Country <p>站点所在国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>站点所在省份</p> 
     * @return Province <p>站点所在省份</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>站点所在省份</p>
     * @param Province <p>站点所在省份</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>站点所在城市</p> 
     * @return City <p>站点所在城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>站点所在城市</p>
     * @param City <p>站点所在城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>站点所在地区的详细地址信息</p> 
     * @return AddressLine <p>站点所在地区的详细地址信息</p>
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set <p>站点所在地区的详细地址信息</p>
     * @param AddressLine <p>站点所在地区的详细地址信息</p>
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    /**
     * Get <p>站点描述</p> 
     * @return Description <p>站点描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>站点描述</p>
     * @param Description <p>站点描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>注意事项</p> 
     * @return Note <p>注意事项</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>注意事项</p>
     * @param Note <p>注意事项</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。取值范围："MM","SM"</p> 
     * @return FiberType <p>您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。取值范围："MM","SM"</p>
     */
    public String getFiberType() {
        return this.FiberType;
    }

    /**
     * Set <p>您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。取值范围："MM","SM"</p>
     * @param FiberType <p>您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。取值范围："MM","SM"</p>
     */
    public void setFiberType(String FiberType) {
        this.FiberType = FiberType;
    }

    /**
     * Get <p>您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。</p> 
     * @return OpticalStandard <p>您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。</p>
     */
    public String getOpticalStandard() {
        return this.OpticalStandard;
    }

    /**
     * Set <p>您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。</p>
     * @param OpticalStandard <p>您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。</p>
     */
    public void setOpticalStandard(String OpticalStandard) {
        this.OpticalStandard = OpticalStandard;
    }

    /**
     * Get <p>电源连接器类型</p> 
     * @return PowerConnectors <p>电源连接器类型</p>
     */
    public String getPowerConnectors() {
        return this.PowerConnectors;
    }

    /**
     * Set <p>电源连接器类型</p>
     * @param PowerConnectors <p>电源连接器类型</p>
     */
    public void setPowerConnectors(String PowerConnectors) {
        this.PowerConnectors = PowerConnectors;
    }

    /**
     * Get <p>从机架上方还是下方供电。取值范围：["UP","DOWN"]</p> 
     * @return PowerFeedDrop <p>从机架上方还是下方供电。取值范围：["UP","DOWN"]</p>
     */
    public String getPowerFeedDrop() {
        return this.PowerFeedDrop;
    }

    /**
     * Set <p>从机架上方还是下方供电。取值范围：["UP","DOWN"]</p>
     * @param PowerFeedDrop <p>从机架上方还是下方供电。取值范围：["UP","DOWN"]</p>
     */
    public void setPowerFeedDrop(String PowerFeedDrop) {
        this.PowerFeedDrop = PowerFeedDrop;
    }

    /**
     * Get <p>最大承重(KG)</p> 
     * @return MaxWeight <p>最大承重(KG)</p>
     */
    public Long getMaxWeight() {
        return this.MaxWeight;
    }

    /**
     * Set <p>最大承重(KG)</p>
     * @param MaxWeight <p>最大承重(KG)</p>
     */
    public void setMaxWeight(Long MaxWeight) {
        this.MaxWeight = MaxWeight;
    }

    /**
     * Get <p>功耗(KW)</p> 
     * @return PowerDrawKva <p>功耗(KW)</p>
     */
    public Long getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set <p>功耗(KW)</p>
     * @param PowerDrawKva <p>功耗(KW)</p>
     */
    public void setPowerDrawKva(Long PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get <p>网络到腾讯云Region区域的上行链路速度(Gbps)</p> 
     * @return UplinkSpeedGbps <p>网络到腾讯云Region区域的上行链路速度(Gbps)</p>
     */
    public Long getUplinkSpeedGbps() {
        return this.UplinkSpeedGbps;
    }

    /**
     * Set <p>网络到腾讯云Region区域的上行链路速度(Gbps)</p>
     * @param UplinkSpeedGbps <p>网络到腾讯云Region区域的上行链路速度(Gbps)</p>
     */
    public void setUplinkSpeedGbps(Long UplinkSpeedGbps) {
        this.UplinkSpeedGbps = UplinkSpeedGbps;
    }

    /**
     * Get <p>将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。</p> 
     * @return UplinkCount <p>将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。</p>
     */
    public Long getUplinkCount() {
        return this.UplinkCount;
    }

    /**
     * Set <p>将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。</p>
     * @param UplinkCount <p>将CDC连接到网络时，每台CDC网络设备(每个机架 2 台设备)使用的上行链路数量。</p>
     */
    public void setUplinkCount(Long UplinkCount) {
        this.UplinkCount = UplinkCount;
    }

    /**
     * Get <p>是否满足下面环境条件：1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。2、确定的机架位置包含:温度范围为 41 到 104°F (5 到 40°C)。湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。</p> 
     * @return ConditionRequirement <p>是否满足下面环境条件：1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。2、确定的机架位置包含:温度范围为 41 到 104°F (5 到 40°C)。湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。</p>
     */
    public Boolean getConditionRequirement() {
        return this.ConditionRequirement;
    }

    /**
     * Set <p>是否满足下面环境条件：1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。2、确定的机架位置包含:温度范围为 41 到 104°F (5 到 40°C)。湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。</p>
     * @param ConditionRequirement <p>是否满足下面环境条件：1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。2、确定的机架位置包含:温度范围为 41 到 104°F (5 到 40°C)。湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)。CFM 必须是 CDC 配置的 kVA 功耗值的 145.8 倍。</p>
     */
    public void setConditionRequirement(Boolean ConditionRequirement) {
        this.ConditionRequirement = ConditionRequirement;
    }

    /**
     * Get <p>是否满足下面的尺寸条件：您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。</p> 
     * @return DimensionRequirement <p>是否满足下面的尺寸条件：您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。</p>
     */
    public Boolean getDimensionRequirement() {
        return this.DimensionRequirement;
    }

    /**
     * Set <p>是否满足下面的尺寸条件：您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。</p>
     * @param DimensionRequirement <p>是否满足下面的尺寸条件：您的装货站台可以容纳一个机架箱(高 x 宽 x 深 = 94" x 54" x 48")。您可以提供从机架(高 x 宽 x 深 = 80" x 24" x 48")交货地点到机架最终安置位置的明确通道。测量深度时，应包括站台、走廊通道、门、转弯、坡道、货梯，并将其他通道限制考虑在内。在最终的 CDC安置位置，前部间隙可以为 48" 或更大，后部间隙可以为 24" 或更大。</p>
     */
    public void setDimensionRequirement(Boolean DimensionRequirement) {
        this.DimensionRequirement = DimensionRequirement;
    }

    /**
     * Get <p>是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。</p> 
     * @return RedundantNetworking <p>是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。</p>
     */
    public Boolean getRedundantNetworking() {
        return this.RedundantNetworking;
    }

    /**
     * Set <p>是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。</p>
     * @param RedundantNetworking <p>是否提供冗余的上游设备(交换机或路由器)，以便两台  网络设备都能连接到网络设备。</p>
     */
    public void setRedundantNetworking(Boolean RedundantNetworking) {
        this.RedundantNetworking = RedundantNetworking;
    }

    /**
     * Get <p>站点所在地区的邮编</p> 
     * @return PostalCode <p>站点所在地区的邮编</p>
     */
    public Long getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set <p>站点所在地区的邮编</p>
     * @param PostalCode <p>站点所在地区的邮编</p>
     */
    public void setPostalCode(Long PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get <p>站点所在地区的详细地址信息（补充）</p> 
     * @return OptionalAddressLine <p>站点所在地区的详细地址信息（补充）</p>
     */
    public String getOptionalAddressLine() {
        return this.OptionalAddressLine;
    }

    /**
     * Set <p>站点所在地区的详细地址信息（补充）</p>
     * @param OptionalAddressLine <p>站点所在地区的详细地址信息（补充）</p>
     */
    public void setOptionalAddressLine(String OptionalAddressLine) {
        this.OptionalAddressLine = OptionalAddressLine;
    }

    /**
     * Get <p>是否需要腾讯云团队协助完成机架支撑工作</p> 
     * @return NeedHelp <p>是否需要腾讯云团队协助完成机架支撑工作</p>
     */
    public Boolean getNeedHelp() {
        return this.NeedHelp;
    }

    /**
     * Set <p>是否需要腾讯云团队协助完成机架支撑工作</p>
     * @param NeedHelp <p>是否需要腾讯云团队协助完成机架支撑工作</p>
     */
    public void setNeedHelp(Boolean NeedHelp) {
        this.NeedHelp = NeedHelp;
    }

    /**
     * Get <p>是否电源冗余</p> 
     * @return RedundantPower <p>是否电源冗余</p>
     */
    public Boolean getRedundantPower() {
        return this.RedundantPower;
    }

    /**
     * Set <p>是否电源冗余</p>
     * @param RedundantPower <p>是否电源冗余</p>
     */
    public void setRedundantPower(Boolean RedundantPower) {
        this.RedundantPower = RedundantPower;
    }

    /**
     * Get <p>上游断路器是否具备</p> 
     * @return BreakerRequirement <p>上游断路器是否具备</p>
     */
    public Boolean getBreakerRequirement() {
        return this.BreakerRequirement;
    }

    /**
     * Set <p>上游断路器是否具备</p>
     * @param BreakerRequirement <p>上游断路器是否具备</p>
     */
    public void setBreakerRequirement(Boolean BreakerRequirement) {
        this.BreakerRequirement = BreakerRequirement;
    }

    public CreateSiteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSiteRequest(CreateSiteRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.FiberType != null) {
            this.FiberType = new String(source.FiberType);
        }
        if (source.OpticalStandard != null) {
            this.OpticalStandard = new String(source.OpticalStandard);
        }
        if (source.PowerConnectors != null) {
            this.PowerConnectors = new String(source.PowerConnectors);
        }
        if (source.PowerFeedDrop != null) {
            this.PowerFeedDrop = new String(source.PowerFeedDrop);
        }
        if (source.MaxWeight != null) {
            this.MaxWeight = new Long(source.MaxWeight);
        }
        if (source.PowerDrawKva != null) {
            this.PowerDrawKva = new Long(source.PowerDrawKva);
        }
        if (source.UplinkSpeedGbps != null) {
            this.UplinkSpeedGbps = new Long(source.UplinkSpeedGbps);
        }
        if (source.UplinkCount != null) {
            this.UplinkCount = new Long(source.UplinkCount);
        }
        if (source.ConditionRequirement != null) {
            this.ConditionRequirement = new Boolean(source.ConditionRequirement);
        }
        if (source.DimensionRequirement != null) {
            this.DimensionRequirement = new Boolean(source.DimensionRequirement);
        }
        if (source.RedundantNetworking != null) {
            this.RedundantNetworking = new Boolean(source.RedundantNetworking);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new Long(source.PostalCode);
        }
        if (source.OptionalAddressLine != null) {
            this.OptionalAddressLine = new String(source.OptionalAddressLine);
        }
        if (source.NeedHelp != null) {
            this.NeedHelp = new Boolean(source.NeedHelp);
        }
        if (source.RedundantPower != null) {
            this.RedundantPower = new Boolean(source.RedundantPower);
        }
        if (source.BreakerRequirement != null) {
            this.BreakerRequirement = new Boolean(source.BreakerRequirement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "FiberType", this.FiberType);
        this.setParamSimple(map, prefix + "OpticalStandard", this.OpticalStandard);
        this.setParamSimple(map, prefix + "PowerConnectors", this.PowerConnectors);
        this.setParamSimple(map, prefix + "PowerFeedDrop", this.PowerFeedDrop);
        this.setParamSimple(map, prefix + "MaxWeight", this.MaxWeight);
        this.setParamSimple(map, prefix + "PowerDrawKva", this.PowerDrawKva);
        this.setParamSimple(map, prefix + "UplinkSpeedGbps", this.UplinkSpeedGbps);
        this.setParamSimple(map, prefix + "UplinkCount", this.UplinkCount);
        this.setParamSimple(map, prefix + "ConditionRequirement", this.ConditionRequirement);
        this.setParamSimple(map, prefix + "DimensionRequirement", this.DimensionRequirement);
        this.setParamSimple(map, prefix + "RedundantNetworking", this.RedundantNetworking);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "OptionalAddressLine", this.OptionalAddressLine);
        this.setParamSimple(map, prefix + "NeedHelp", this.NeedHelp);
        this.setParamSimple(map, prefix + "RedundantPower", this.RedundantPower);
        this.setParamSimple(map, prefix + "BreakerRequirement", this.BreakerRequirement);

    }
}

