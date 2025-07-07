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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Plan extends AbstractModel {

    /**
    * 套餐类型。取值有：
<li>plan-trial: 试用版套餐；</li>
<li>plan-personal: 个人版套餐；</li>
<li>plan-basic: 基础版套餐；</li>
<li>plan-standard: 标准版套餐；</li>
<li>plan-enterprise-v2: 企业版套餐；</li>
<li>plan-enterprise-model-a: 企业版 Model A 套餐。</li>
<li>plan-enterprise: 旧企业版套餐。</li>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 套餐 ID。形如 edgeone-2y041pblwaxe。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 服务区域，取值有：
<li>mainland: 中国大陆；</li>
<li>overseas: 全球（不包括中国大陆）；</li>
<li>global: 全球（包括中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 自动续费开关。取值有：
<li>true: 已开启自动续费；</li>
<li>false: 未开启自动续费。</li>
    */
    @SerializedName("AutoRenewal")
    @Expose
    private Boolean AutoRenewal;

    /**
    * 套餐状态，取值有：
<li>normal：正常状态；</li>
<li>expiring-soon：即将到期状态；</li>
<li>expired：到期状态；</li>
<li>isolated：隔离状态；</li>
<li>overdue-isolated：欠费隔离状态。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 付费类型，取值有：
<li>0: 后付费；</li>
<li>1: 预付费。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 套餐绑定的站点信息，包括站点id和站点名称，站点状态。
    */
    @SerializedName("ZonesInfo")
    @Expose
    private ZoneInfo [] ZonesInfo;

    /**
    * 套餐内智能加速请求数规格，单位：次。
    */
    @SerializedName("SmartRequestCapacity")
    @Expose
    private Long SmartRequestCapacity;

    /**
    * 套餐内VAU规格，单位：个。
    */
    @SerializedName("VAUCapacity")
    @Expose
    private Long VAUCapacity;

    /**
    * 套餐内内容加速流量规格，单位：字节。
    */
    @SerializedName("AccTrafficCapacity")
    @Expose
    private Long AccTrafficCapacity;

    /**
    * 套餐内智能加速流量规格，单位：字节。
    */
    @SerializedName("SmartTrafficCapacity")
    @Expose
    private Long SmartTrafficCapacity;

    /**
    * 套餐内DDoS防护流量规格，单位：字节。
    */
    @SerializedName("DDoSTrafficCapacity")
    @Expose
    private Long DDoSTrafficCapacity;

    /**
    * 套餐内安全流量规格，单位：字节。
    */
    @SerializedName("SecTrafficCapacity")
    @Expose
    private Long SecTrafficCapacity;

    /**
    * 套餐内安全请求数规格，单位：次。
    */
    @SerializedName("SecRequestCapacity")
    @Expose
    private Long SecRequestCapacity;

    /**
    * 套餐内四层加速流量规格，单位：字节。
    */
    @SerializedName("L4TrafficCapacity")
    @Expose
    private Long L4TrafficCapacity;

    /**
    * 套餐内中国大陆网络优化流量规格，单位：字节。
    */
    @SerializedName("CrossMLCTrafficCapacity")
    @Expose
    private Long CrossMLCTrafficCapacity;

    /**
    * 套餐是否允许绑定新站点，取值有：
<li>true: 允许绑定新站点；</li>
<li>false: 不允许绑定新站点。</li>
    */
    @SerializedName("Bindable")
    @Expose
    private String Bindable;

    /**
    * 套餐生效时间。
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * 套餐过期时间。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
     * Get 套餐类型。取值有：
<li>plan-trial: 试用版套餐；</li>
<li>plan-personal: 个人版套餐；</li>
<li>plan-basic: 基础版套餐；</li>
<li>plan-standard: 标准版套餐；</li>
<li>plan-enterprise-v2: 企业版套餐；</li>
<li>plan-enterprise-model-a: 企业版 Model A 套餐。</li>
<li>plan-enterprise: 旧企业版套餐。</li> 
     * @return PlanType 套餐类型。取值有：
<li>plan-trial: 试用版套餐；</li>
<li>plan-personal: 个人版套餐；</li>
<li>plan-basic: 基础版套餐；</li>
<li>plan-standard: 标准版套餐；</li>
<li>plan-enterprise-v2: 企业版套餐；</li>
<li>plan-enterprise-model-a: 企业版 Model A 套餐。</li>
<li>plan-enterprise: 旧企业版套餐。</li>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 套餐类型。取值有：
<li>plan-trial: 试用版套餐；</li>
<li>plan-personal: 个人版套餐；</li>
<li>plan-basic: 基础版套餐；</li>
<li>plan-standard: 标准版套餐；</li>
<li>plan-enterprise-v2: 企业版套餐；</li>
<li>plan-enterprise-model-a: 企业版 Model A 套餐。</li>
<li>plan-enterprise: 旧企业版套餐。</li>
     * @param PlanType 套餐类型。取值有：
<li>plan-trial: 试用版套餐；</li>
<li>plan-personal: 个人版套餐；</li>
<li>plan-basic: 基础版套餐；</li>
<li>plan-standard: 标准版套餐；</li>
<li>plan-enterprise-v2: 企业版套餐；</li>
<li>plan-enterprise-model-a: 企业版 Model A 套餐。</li>
<li>plan-enterprise: 旧企业版套餐。</li>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 套餐 ID。形如 edgeone-2y041pblwaxe。 
     * @return PlanId 套餐 ID。形如 edgeone-2y041pblwaxe。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 套餐 ID。形如 edgeone-2y041pblwaxe。
     * @param PlanId 套餐 ID。形如 edgeone-2y041pblwaxe。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 服务区域，取值有：
<li>mainland: 中国大陆；</li>
<li>overseas: 全球（不包括中国大陆）；</li>
<li>global: 全球（包括中国大陆）。</li> 
     * @return Area 服务区域，取值有：
<li>mainland: 中国大陆；</li>
<li>overseas: 全球（不包括中国大陆）；</li>
<li>global: 全球（包括中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 服务区域，取值有：
<li>mainland: 中国大陆；</li>
<li>overseas: 全球（不包括中国大陆）；</li>
<li>global: 全球（包括中国大陆）。</li>
     * @param Area 服务区域，取值有：
<li>mainland: 中国大陆；</li>
<li>overseas: 全球（不包括中国大陆）；</li>
<li>global: 全球（包括中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 自动续费开关。取值有：
<li>true: 已开启自动续费；</li>
<li>false: 未开启自动续费。</li> 
     * @return AutoRenewal 自动续费开关。取值有：
<li>true: 已开启自动续费；</li>
<li>false: 未开启自动续费。</li>
     */
    public Boolean getAutoRenewal() {
        return this.AutoRenewal;
    }

    /**
     * Set 自动续费开关。取值有：
<li>true: 已开启自动续费；</li>
<li>false: 未开启自动续费。</li>
     * @param AutoRenewal 自动续费开关。取值有：
<li>true: 已开启自动续费；</li>
<li>false: 未开启自动续费。</li>
     */
    public void setAutoRenewal(Boolean AutoRenewal) {
        this.AutoRenewal = AutoRenewal;
    }

    /**
     * Get 套餐状态，取值有：
<li>normal：正常状态；</li>
<li>expiring-soon：即将到期状态；</li>
<li>expired：到期状态；</li>
<li>isolated：隔离状态；</li>
<li>overdue-isolated：欠费隔离状态。</li> 
     * @return Status 套餐状态，取值有：
<li>normal：正常状态；</li>
<li>expiring-soon：即将到期状态；</li>
<li>expired：到期状态；</li>
<li>isolated：隔离状态；</li>
<li>overdue-isolated：欠费隔离状态。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 套餐状态，取值有：
<li>normal：正常状态；</li>
<li>expiring-soon：即将到期状态；</li>
<li>expired：到期状态；</li>
<li>isolated：隔离状态；</li>
<li>overdue-isolated：欠费隔离状态。</li>
     * @param Status 套餐状态，取值有：
<li>normal：正常状态；</li>
<li>expiring-soon：即将到期状态；</li>
<li>expired：到期状态；</li>
<li>isolated：隔离状态；</li>
<li>overdue-isolated：欠费隔离状态。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 付费类型，取值有：
<li>0: 后付费；</li>
<li>1: 预付费。</li> 
     * @return PayMode 付费类型，取值有：
<li>0: 后付费；</li>
<li>1: 预付费。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，取值有：
<li>0: 后付费；</li>
<li>1: 预付费。</li>
     * @param PayMode 付费类型，取值有：
<li>0: 后付费；</li>
<li>1: 预付费。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 套餐绑定的站点信息，包括站点id和站点名称，站点状态。 
     * @return ZonesInfo 套餐绑定的站点信息，包括站点id和站点名称，站点状态。
     */
    public ZoneInfo [] getZonesInfo() {
        return this.ZonesInfo;
    }

    /**
     * Set 套餐绑定的站点信息，包括站点id和站点名称，站点状态。
     * @param ZonesInfo 套餐绑定的站点信息，包括站点id和站点名称，站点状态。
     */
    public void setZonesInfo(ZoneInfo [] ZonesInfo) {
        this.ZonesInfo = ZonesInfo;
    }

    /**
     * Get 套餐内智能加速请求数规格，单位：次。 
     * @return SmartRequestCapacity 套餐内智能加速请求数规格，单位：次。
     */
    public Long getSmartRequestCapacity() {
        return this.SmartRequestCapacity;
    }

    /**
     * Set 套餐内智能加速请求数规格，单位：次。
     * @param SmartRequestCapacity 套餐内智能加速请求数规格，单位：次。
     */
    public void setSmartRequestCapacity(Long SmartRequestCapacity) {
        this.SmartRequestCapacity = SmartRequestCapacity;
    }

    /**
     * Get 套餐内VAU规格，单位：个。 
     * @return VAUCapacity 套餐内VAU规格，单位：个。
     */
    public Long getVAUCapacity() {
        return this.VAUCapacity;
    }

    /**
     * Set 套餐内VAU规格，单位：个。
     * @param VAUCapacity 套餐内VAU规格，单位：个。
     */
    public void setVAUCapacity(Long VAUCapacity) {
        this.VAUCapacity = VAUCapacity;
    }

    /**
     * Get 套餐内内容加速流量规格，单位：字节。 
     * @return AccTrafficCapacity 套餐内内容加速流量规格，单位：字节。
     */
    public Long getAccTrafficCapacity() {
        return this.AccTrafficCapacity;
    }

    /**
     * Set 套餐内内容加速流量规格，单位：字节。
     * @param AccTrafficCapacity 套餐内内容加速流量规格，单位：字节。
     */
    public void setAccTrafficCapacity(Long AccTrafficCapacity) {
        this.AccTrafficCapacity = AccTrafficCapacity;
    }

    /**
     * Get 套餐内智能加速流量规格，单位：字节。 
     * @return SmartTrafficCapacity 套餐内智能加速流量规格，单位：字节。
     */
    public Long getSmartTrafficCapacity() {
        return this.SmartTrafficCapacity;
    }

    /**
     * Set 套餐内智能加速流量规格，单位：字节。
     * @param SmartTrafficCapacity 套餐内智能加速流量规格，单位：字节。
     */
    public void setSmartTrafficCapacity(Long SmartTrafficCapacity) {
        this.SmartTrafficCapacity = SmartTrafficCapacity;
    }

    /**
     * Get 套餐内DDoS防护流量规格，单位：字节。 
     * @return DDoSTrafficCapacity 套餐内DDoS防护流量规格，单位：字节。
     */
    public Long getDDoSTrafficCapacity() {
        return this.DDoSTrafficCapacity;
    }

    /**
     * Set 套餐内DDoS防护流量规格，单位：字节。
     * @param DDoSTrafficCapacity 套餐内DDoS防护流量规格，单位：字节。
     */
    public void setDDoSTrafficCapacity(Long DDoSTrafficCapacity) {
        this.DDoSTrafficCapacity = DDoSTrafficCapacity;
    }

    /**
     * Get 套餐内安全流量规格，单位：字节。 
     * @return SecTrafficCapacity 套餐内安全流量规格，单位：字节。
     */
    public Long getSecTrafficCapacity() {
        return this.SecTrafficCapacity;
    }

    /**
     * Set 套餐内安全流量规格，单位：字节。
     * @param SecTrafficCapacity 套餐内安全流量规格，单位：字节。
     */
    public void setSecTrafficCapacity(Long SecTrafficCapacity) {
        this.SecTrafficCapacity = SecTrafficCapacity;
    }

    /**
     * Get 套餐内安全请求数规格，单位：次。 
     * @return SecRequestCapacity 套餐内安全请求数规格，单位：次。
     */
    public Long getSecRequestCapacity() {
        return this.SecRequestCapacity;
    }

    /**
     * Set 套餐内安全请求数规格，单位：次。
     * @param SecRequestCapacity 套餐内安全请求数规格，单位：次。
     */
    public void setSecRequestCapacity(Long SecRequestCapacity) {
        this.SecRequestCapacity = SecRequestCapacity;
    }

    /**
     * Get 套餐内四层加速流量规格，单位：字节。 
     * @return L4TrafficCapacity 套餐内四层加速流量规格，单位：字节。
     */
    public Long getL4TrafficCapacity() {
        return this.L4TrafficCapacity;
    }

    /**
     * Set 套餐内四层加速流量规格，单位：字节。
     * @param L4TrafficCapacity 套餐内四层加速流量规格，单位：字节。
     */
    public void setL4TrafficCapacity(Long L4TrafficCapacity) {
        this.L4TrafficCapacity = L4TrafficCapacity;
    }

    /**
     * Get 套餐内中国大陆网络优化流量规格，单位：字节。 
     * @return CrossMLCTrafficCapacity 套餐内中国大陆网络优化流量规格，单位：字节。
     */
    public Long getCrossMLCTrafficCapacity() {
        return this.CrossMLCTrafficCapacity;
    }

    /**
     * Set 套餐内中国大陆网络优化流量规格，单位：字节。
     * @param CrossMLCTrafficCapacity 套餐内中国大陆网络优化流量规格，单位：字节。
     */
    public void setCrossMLCTrafficCapacity(Long CrossMLCTrafficCapacity) {
        this.CrossMLCTrafficCapacity = CrossMLCTrafficCapacity;
    }

    /**
     * Get 套餐是否允许绑定新站点，取值有：
<li>true: 允许绑定新站点；</li>
<li>false: 不允许绑定新站点。</li> 
     * @return Bindable 套餐是否允许绑定新站点，取值有：
<li>true: 允许绑定新站点；</li>
<li>false: 不允许绑定新站点。</li>
     */
    public String getBindable() {
        return this.Bindable;
    }

    /**
     * Set 套餐是否允许绑定新站点，取值有：
<li>true: 允许绑定新站点；</li>
<li>false: 不允许绑定新站点。</li>
     * @param Bindable 套餐是否允许绑定新站点，取值有：
<li>true: 允许绑定新站点；</li>
<li>false: 不允许绑定新站点。</li>
     */
    public void setBindable(String Bindable) {
        this.Bindable = Bindable;
    }

    /**
     * Get 套餐生效时间。 
     * @return EnabledTime 套餐生效时间。
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set 套餐生效时间。
     * @param EnabledTime 套餐生效时间。
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
    }

    /**
     * Get 套餐过期时间。 
     * @return ExpiredTime 套餐过期时间。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 套餐过期时间。
     * @param ExpiredTime 套餐过期时间。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li> 
     * @return Features 套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li>
     * @param Features 套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li>
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    public Plan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plan(Plan source) {
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AutoRenewal != null) {
            this.AutoRenewal = new Boolean(source.AutoRenewal);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ZonesInfo != null) {
            this.ZonesInfo = new ZoneInfo[source.ZonesInfo.length];
            for (int i = 0; i < source.ZonesInfo.length; i++) {
                this.ZonesInfo[i] = new ZoneInfo(source.ZonesInfo[i]);
            }
        }
        if (source.SmartRequestCapacity != null) {
            this.SmartRequestCapacity = new Long(source.SmartRequestCapacity);
        }
        if (source.VAUCapacity != null) {
            this.VAUCapacity = new Long(source.VAUCapacity);
        }
        if (source.AccTrafficCapacity != null) {
            this.AccTrafficCapacity = new Long(source.AccTrafficCapacity);
        }
        if (source.SmartTrafficCapacity != null) {
            this.SmartTrafficCapacity = new Long(source.SmartTrafficCapacity);
        }
        if (source.DDoSTrafficCapacity != null) {
            this.DDoSTrafficCapacity = new Long(source.DDoSTrafficCapacity);
        }
        if (source.SecTrafficCapacity != null) {
            this.SecTrafficCapacity = new Long(source.SecTrafficCapacity);
        }
        if (source.SecRequestCapacity != null) {
            this.SecRequestCapacity = new Long(source.SecRequestCapacity);
        }
        if (source.L4TrafficCapacity != null) {
            this.L4TrafficCapacity = new Long(source.L4TrafficCapacity);
        }
        if (source.CrossMLCTrafficCapacity != null) {
            this.CrossMLCTrafficCapacity = new Long(source.CrossMLCTrafficCapacity);
        }
        if (source.Bindable != null) {
            this.Bindable = new String(source.Bindable);
        }
        if (source.EnabledTime != null) {
            this.EnabledTime = new String(source.EnabledTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AutoRenewal", this.AutoRenewal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ZonesInfo.", this.ZonesInfo);
        this.setParamSimple(map, prefix + "SmartRequestCapacity", this.SmartRequestCapacity);
        this.setParamSimple(map, prefix + "VAUCapacity", this.VAUCapacity);
        this.setParamSimple(map, prefix + "AccTrafficCapacity", this.AccTrafficCapacity);
        this.setParamSimple(map, prefix + "SmartTrafficCapacity", this.SmartTrafficCapacity);
        this.setParamSimple(map, prefix + "DDoSTrafficCapacity", this.DDoSTrafficCapacity);
        this.setParamSimple(map, prefix + "SecTrafficCapacity", this.SecTrafficCapacity);
        this.setParamSimple(map, prefix + "SecRequestCapacity", this.SecRequestCapacity);
        this.setParamSimple(map, prefix + "L4TrafficCapacity", this.L4TrafficCapacity);
        this.setParamSimple(map, prefix + "CrossMLCTrafficCapacity", this.CrossMLCTrafficCapacity);
        this.setParamSimple(map, prefix + "Bindable", this.Bindable);
        this.setParamSimple(map, prefix + "EnabledTime", this.EnabledTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);

    }
}

