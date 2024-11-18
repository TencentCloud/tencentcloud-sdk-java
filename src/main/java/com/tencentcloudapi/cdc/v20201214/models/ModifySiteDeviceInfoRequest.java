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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySiteDeviceInfoRequest extends AbstractModel {

    /**
    * 机房ID
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * 您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。
    */
    @SerializedName("FiberType")
    @Expose
    private String FiberType;

    /**
    * 您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。
    */
    @SerializedName("OpticalStandard")
    @Expose
    private String OpticalStandard;

    /**
    * 电源连接器类型
    */
    @SerializedName("PowerConnectors")
    @Expose
    private String PowerConnectors;

    /**
    * 从机架上方还是下方供电。取值范围：["UP","DOWN"]
    */
    @SerializedName("PowerFeedDrop")
    @Expose
    private String PowerFeedDrop;

    /**
    * 最大承重(KG)
    */
    @SerializedName("MaxWeight")
    @Expose
    private Long MaxWeight;

    /**
    * 功耗(KW)
    */
    @SerializedName("PowerDrawKva")
    @Expose
    private Long PowerDrawKva;

    /**
    * 网络到腾讯云Region区域的上行链路速度(Gbps)
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
    * 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)，散热功率须达到CDC运行功率值的 145.8 倍以上。
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
    * 是否提供冗余的上游设备(交换机或路由器)，以便实现网络出口的高可用。
    */
    @SerializedName("RedundantNetworking")
    @Expose
    private Boolean RedundantNetworking;

    /**
    * 是否需要腾讯云团队协助完成机架支撑工作
    */
    @SerializedName("NeedHelp")
    @Expose
    private Boolean NeedHelp;

    /**
    * 是否电源冗余
    */
    @SerializedName("RedundantPower")
    @Expose
    private Boolean RedundantPower;

    /**
    * 上游断路器是否具备
    */
    @SerializedName("BreakerRequirement")
    @Expose
    private Boolean BreakerRequirement;

    /**
     * Get 机房ID 
     * @return SiteId 机房ID
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 机房ID
     * @param SiteId 机房ID
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。 
     * @return FiberType 您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。
     */
    public String getFiberType() {
        return this.FiberType;
    }

    /**
     * Set 您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。
     * @param FiberType 您将使用光纤类型将CDC设备连接到网络。有单模和多模两种选项。
     */
    public void setFiberType(String FiberType) {
        this.FiberType = FiberType;
    }

    /**
     * Get 您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。 
     * @return OpticalStandard 您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。
     */
    public String getOpticalStandard() {
        return this.OpticalStandard;
    }

    /**
     * Set 您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。
     * @param OpticalStandard 您将CDC连接到网络时采用的光学标准。此字段取决于上行链路速度、光纤类型和到上游设备的距离。
     */
    public void setOpticalStandard(String OpticalStandard) {
        this.OpticalStandard = OpticalStandard;
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
     * Get 从机架上方还是下方供电。取值范围：["UP","DOWN"] 
     * @return PowerFeedDrop 从机架上方还是下方供电。取值范围：["UP","DOWN"]
     */
    public String getPowerFeedDrop() {
        return this.PowerFeedDrop;
    }

    /**
     * Set 从机架上方还是下方供电。取值范围：["UP","DOWN"]
     * @param PowerFeedDrop 从机架上方还是下方供电。取值范围：["UP","DOWN"]
     */
    public void setPowerFeedDrop(String PowerFeedDrop) {
        this.PowerFeedDrop = PowerFeedDrop;
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
     * Get 功耗(KW) 
     * @return PowerDrawKva 功耗(KW)
     */
    public Long getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set 功耗(KW)
     * @param PowerDrawKva 功耗(KW)
     */
    public void setPowerDrawKva(Long PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get 网络到腾讯云Region区域的上行链路速度(Gbps) 
     * @return UplinkSpeedGbps 网络到腾讯云Region区域的上行链路速度(Gbps)
     */
    public Long getUplinkSpeedGbps() {
        return this.UplinkSpeedGbps;
    }

    /**
     * Set 网络到腾讯云Region区域的上行链路速度(Gbps)
     * @param UplinkSpeedGbps 网络到腾讯云Region区域的上行链路速度(Gbps)
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
     * Get 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)，散热功率须达到CDC运行功率值的 145.8 倍以上。 
     * @return ConditionRequirement 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)，散热功率须达到CDC运行功率值的 145.8 倍以上。
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
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)，散热功率须达到CDC运行功率值的 145.8 倍以上。
     * @param ConditionRequirement 是否满足下面环境条件：
1、场地没有材料要求或验收标准会影响 CDC 设备配送和安装。
2、确定的机架位置包含:
温度范围为 41 到 104°F (5 到 40°C)。
湿度范围为 10°F (-12°C)和 8% RH (相对湿度)到 70°F(21°C)和 80% RH。
机架位置的气流方向为从前向后，且应具有足够的 CFM (每分钟立方英尺)，散热功率须达到CDC运行功率值的 145.8 倍以上。
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
     * Get 是否提供冗余的上游设备(交换机或路由器)，以便实现网络出口的高可用。 
     * @return RedundantNetworking 是否提供冗余的上游设备(交换机或路由器)，以便实现网络出口的高可用。
     */
    public Boolean getRedundantNetworking() {
        return this.RedundantNetworking;
    }

    /**
     * Set 是否提供冗余的上游设备(交换机或路由器)，以便实现网络出口的高可用。
     * @param RedundantNetworking 是否提供冗余的上游设备(交换机或路由器)，以便实现网络出口的高可用。
     */
    public void setRedundantNetworking(Boolean RedundantNetworking) {
        this.RedundantNetworking = RedundantNetworking;
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

    public ModifySiteDeviceInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySiteDeviceInfoRequest(ModifySiteDeviceInfoRequest source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
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
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
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
        this.setParamSimple(map, prefix + "NeedHelp", this.NeedHelp);
        this.setParamSimple(map, prefix + "RedundantPower", this.RedundantPower);
        this.setParamSimple(map, prefix + "BreakerRequirement", this.BreakerRequirement);

    }
}

