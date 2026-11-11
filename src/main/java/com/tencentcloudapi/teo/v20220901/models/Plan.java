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
    * <p>套餐类型。取值有：</p><li>plan-trial: 试用版套餐；</li><li>plan-personal: 个人版套餐；</li><li>plan-basic: 基础版套餐；</li><li>plan-standard: 标准版套餐；</li><li>plan-enterprise-v2: 企业版套餐；</li><li>plan-enterprise-model-a: 企业版 Model A 套餐；</li><li>plan-enterprise: 旧企业版套餐；</li><li>plan-makers-pro: Makers 专业版套餐；</li><li>plan-makers-business: Makers 商业版套餐；</li><p>枚举值：</p><ul><li>plan-trial： 试用版套餐</li><li>plan-personal： 个人版套餐</li><li>plan-basic： 基础版套餐</li><li>plan-standard： 标准版套餐</li><li>plan-enterprise-v2： 企业版套餐</li><li>plan-enterprise-model-a： 企业版 Model A 套餐</li><li>plan-enterprise： 旧企业版套餐</li><li>plan-makers-pro： Makers 专业版套餐</li><li>plan-makers-business： Makers 商业版套餐</li></ul>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * <p>套餐 ID。形如 edgeone-2y041pblwaxe。</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>服务区域，取值有：</p><li>mainland: 中国大陆；</li><li>overseas: 全球（不包括中国大陆）；</li><li>global: 全球（包括中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>自动续费开关。取值有：</p><li>true: 已开启自动续费；</li><li>false: 未开启自动续费。</li>
    */
    @SerializedName("AutoRenewal")
    @Expose
    private Boolean AutoRenewal;

    /**
    * <p>套餐状态，取值有：</p><li>normal：正常状态；</li><li>expiring-soon：即将到期状态；</li><li>expired：到期状态；</li><li>isolated：隔离状态；</li><li>overdue-isolated：欠费隔离状态。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>付费类型，取值有：</p><li>0: 后付费；</li><li>1: 预付费。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>套餐绑定的站点信息，包括站点id和站点名称，站点状态。</p>
    */
    @SerializedName("ZonesInfo")
    @Expose
    private ZoneInfo [] ZonesInfo;

    /**
    * <p>套餐内智能加速请求数规格，单位：次。</p>
    */
    @SerializedName("SmartRequestCapacity")
    @Expose
    private Long SmartRequestCapacity;

    /**
    * <p>套餐内VAU规格，单位：个。</p>
    */
    @SerializedName("VAUCapacity")
    @Expose
    private Long VAUCapacity;

    /**
    * <p>套餐内内容加速流量规格，单位：字节。</p>
    */
    @SerializedName("AccTrafficCapacity")
    @Expose
    private Long AccTrafficCapacity;

    /**
    * <p>套餐内客户端认证流量规格，单位：字节。</p>
    */
    @SerializedName("ClientAuthTrafficCapacity")
    @Expose
    private Long ClientAuthTrafficCapacity;

    /**
    * <p>套餐内智能加速流量规格，单位：字节。</p>
    */
    @SerializedName("SmartTrafficCapacity")
    @Expose
    private Long SmartTrafficCapacity;

    /**
    * <p>套餐内DDoS防护流量规格，单位：字节。</p>
    */
    @SerializedName("DDoSTrafficCapacity")
    @Expose
    private Long DDoSTrafficCapacity;

    /**
    * <p>套餐内安全流量规格，单位：字节。</p>
    */
    @SerializedName("SecTrafficCapacity")
    @Expose
    private Long SecTrafficCapacity;

    /**
    * <p>套餐内安全请求数规格，单位：次。</p>
    */
    @SerializedName("SecRequestCapacity")
    @Expose
    private Long SecRequestCapacity;

    /**
    * <p>套餐内四层加速流量规格，单位：字节。</p>
    */
    @SerializedName("L4TrafficCapacity")
    @Expose
    private Long L4TrafficCapacity;

    /**
    * <p>套餐内中国大陆网络优化流量规格，单位：字节。</p>
    */
    @SerializedName("CrossMLCTrafficCapacity")
    @Expose
    private Long CrossMLCTrafficCapacity;

    /**
    * <p>套餐是否允许绑定新站点，取值有：</p><li>true: 允许绑定新站点；</li><li>false: 不允许绑定新站点。</li>
    */
    @SerializedName("Bindable")
    @Expose
    private String Bindable;

    /**
    * <p>套餐生效时间。</p>
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * <p>套餐过期时间。</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li></p>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
     * Get <p>套餐类型。取值有：</p><li>plan-trial: 试用版套餐；</li><li>plan-personal: 个人版套餐；</li><li>plan-basic: 基础版套餐；</li><li>plan-standard: 标准版套餐；</li><li>plan-enterprise-v2: 企业版套餐；</li><li>plan-enterprise-model-a: 企业版 Model A 套餐；</li><li>plan-enterprise: 旧企业版套餐；</li><li>plan-makers-pro: Makers 专业版套餐；</li><li>plan-makers-business: Makers 商业版套餐；</li><p>枚举值：</p><ul><li>plan-trial： 试用版套餐</li><li>plan-personal： 个人版套餐</li><li>plan-basic： 基础版套餐</li><li>plan-standard： 标准版套餐</li><li>plan-enterprise-v2： 企业版套餐</li><li>plan-enterprise-model-a： 企业版 Model A 套餐</li><li>plan-enterprise： 旧企业版套餐</li><li>plan-makers-pro： Makers 专业版套餐</li><li>plan-makers-business： Makers 商业版套餐</li></ul> 
     * @return PlanType <p>套餐类型。取值有：</p><li>plan-trial: 试用版套餐；</li><li>plan-personal: 个人版套餐；</li><li>plan-basic: 基础版套餐；</li><li>plan-standard: 标准版套餐；</li><li>plan-enterprise-v2: 企业版套餐；</li><li>plan-enterprise-model-a: 企业版 Model A 套餐；</li><li>plan-enterprise: 旧企业版套餐；</li><li>plan-makers-pro: Makers 专业版套餐；</li><li>plan-makers-business: Makers 商业版套餐；</li><p>枚举值：</p><ul><li>plan-trial： 试用版套餐</li><li>plan-personal： 个人版套餐</li><li>plan-basic： 基础版套餐</li><li>plan-standard： 标准版套餐</li><li>plan-enterprise-v2： 企业版套餐</li><li>plan-enterprise-model-a： 企业版 Model A 套餐</li><li>plan-enterprise： 旧企业版套餐</li><li>plan-makers-pro： Makers 专业版套餐</li><li>plan-makers-business： Makers 商业版套餐</li></ul>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set <p>套餐类型。取值有：</p><li>plan-trial: 试用版套餐；</li><li>plan-personal: 个人版套餐；</li><li>plan-basic: 基础版套餐；</li><li>plan-standard: 标准版套餐；</li><li>plan-enterprise-v2: 企业版套餐；</li><li>plan-enterprise-model-a: 企业版 Model A 套餐；</li><li>plan-enterprise: 旧企业版套餐；</li><li>plan-makers-pro: Makers 专业版套餐；</li><li>plan-makers-business: Makers 商业版套餐；</li><p>枚举值：</p><ul><li>plan-trial： 试用版套餐</li><li>plan-personal： 个人版套餐</li><li>plan-basic： 基础版套餐</li><li>plan-standard： 标准版套餐</li><li>plan-enterprise-v2： 企业版套餐</li><li>plan-enterprise-model-a： 企业版 Model A 套餐</li><li>plan-enterprise： 旧企业版套餐</li><li>plan-makers-pro： Makers 专业版套餐</li><li>plan-makers-business： Makers 商业版套餐</li></ul>
     * @param PlanType <p>套餐类型。取值有：</p><li>plan-trial: 试用版套餐；</li><li>plan-personal: 个人版套餐；</li><li>plan-basic: 基础版套餐；</li><li>plan-standard: 标准版套餐；</li><li>plan-enterprise-v2: 企业版套餐；</li><li>plan-enterprise-model-a: 企业版 Model A 套餐；</li><li>plan-enterprise: 旧企业版套餐；</li><li>plan-makers-pro: Makers 专业版套餐；</li><li>plan-makers-business: Makers 商业版套餐；</li><p>枚举值：</p><ul><li>plan-trial： 试用版套餐</li><li>plan-personal： 个人版套餐</li><li>plan-basic： 基础版套餐</li><li>plan-standard： 标准版套餐</li><li>plan-enterprise-v2： 企业版套餐</li><li>plan-enterprise-model-a： 企业版 Model A 套餐</li><li>plan-enterprise： 旧企业版套餐</li><li>plan-makers-pro： Makers 专业版套餐</li><li>plan-makers-business： Makers 商业版套餐</li></ul>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get <p>套餐 ID。形如 edgeone-2y041pblwaxe。</p> 
     * @return PlanId <p>套餐 ID。形如 edgeone-2y041pblwaxe。</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>套餐 ID。形如 edgeone-2y041pblwaxe。</p>
     * @param PlanId <p>套餐 ID。形如 edgeone-2y041pblwaxe。</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>服务区域，取值有：</p><li>mainland: 中国大陆；</li><li>overseas: 全球（不包括中国大陆）；</li><li>global: 全球（包括中国大陆）。</li> 
     * @return Area <p>服务区域，取值有：</p><li>mainland: 中国大陆；</li><li>overseas: 全球（不包括中国大陆）；</li><li>global: 全球（包括中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>服务区域，取值有：</p><li>mainland: 中国大陆；</li><li>overseas: 全球（不包括中国大陆）；</li><li>global: 全球（包括中国大陆）。</li>
     * @param Area <p>服务区域，取值有：</p><li>mainland: 中国大陆；</li><li>overseas: 全球（不包括中国大陆）；</li><li>global: 全球（包括中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>自动续费开关。取值有：</p><li>true: 已开启自动续费；</li><li>false: 未开启自动续费。</li> 
     * @return AutoRenewal <p>自动续费开关。取值有：</p><li>true: 已开启自动续费；</li><li>false: 未开启自动续费。</li>
     */
    public Boolean getAutoRenewal() {
        return this.AutoRenewal;
    }

    /**
     * Set <p>自动续费开关。取值有：</p><li>true: 已开启自动续费；</li><li>false: 未开启自动续费。</li>
     * @param AutoRenewal <p>自动续费开关。取值有：</p><li>true: 已开启自动续费；</li><li>false: 未开启自动续费。</li>
     */
    public void setAutoRenewal(Boolean AutoRenewal) {
        this.AutoRenewal = AutoRenewal;
    }

    /**
     * Get <p>套餐状态，取值有：</p><li>normal：正常状态；</li><li>expiring-soon：即将到期状态；</li><li>expired：到期状态；</li><li>isolated：隔离状态；</li><li>overdue-isolated：欠费隔离状态。</li> 
     * @return Status <p>套餐状态，取值有：</p><li>normal：正常状态；</li><li>expiring-soon：即将到期状态；</li><li>expired：到期状态；</li><li>isolated：隔离状态；</li><li>overdue-isolated：欠费隔离状态。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>套餐状态，取值有：</p><li>normal：正常状态；</li><li>expiring-soon：即将到期状态；</li><li>expired：到期状态；</li><li>isolated：隔离状态；</li><li>overdue-isolated：欠费隔离状态。</li>
     * @param Status <p>套餐状态，取值有：</p><li>normal：正常状态；</li><li>expiring-soon：即将到期状态；</li><li>expired：到期状态；</li><li>isolated：隔离状态；</li><li>overdue-isolated：欠费隔离状态。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>付费类型，取值有：</p><li>0: 后付费；</li><li>1: 预付费。</li> 
     * @return PayMode <p>付费类型，取值有：</p><li>0: 后付费；</li><li>1: 预付费。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费类型，取值有：</p><li>0: 后付费；</li><li>1: 预付费。</li>
     * @param PayMode <p>付费类型，取值有：</p><li>0: 后付费；</li><li>1: 预付费。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>套餐绑定的站点信息，包括站点id和站点名称，站点状态。</p> 
     * @return ZonesInfo <p>套餐绑定的站点信息，包括站点id和站点名称，站点状态。</p>
     */
    public ZoneInfo [] getZonesInfo() {
        return this.ZonesInfo;
    }

    /**
     * Set <p>套餐绑定的站点信息，包括站点id和站点名称，站点状态。</p>
     * @param ZonesInfo <p>套餐绑定的站点信息，包括站点id和站点名称，站点状态。</p>
     */
    public void setZonesInfo(ZoneInfo [] ZonesInfo) {
        this.ZonesInfo = ZonesInfo;
    }

    /**
     * Get <p>套餐内智能加速请求数规格，单位：次。</p> 
     * @return SmartRequestCapacity <p>套餐内智能加速请求数规格，单位：次。</p>
     */
    public Long getSmartRequestCapacity() {
        return this.SmartRequestCapacity;
    }

    /**
     * Set <p>套餐内智能加速请求数规格，单位：次。</p>
     * @param SmartRequestCapacity <p>套餐内智能加速请求数规格，单位：次。</p>
     */
    public void setSmartRequestCapacity(Long SmartRequestCapacity) {
        this.SmartRequestCapacity = SmartRequestCapacity;
    }

    /**
     * Get <p>套餐内VAU规格，单位：个。</p> 
     * @return VAUCapacity <p>套餐内VAU规格，单位：个。</p>
     */
    public Long getVAUCapacity() {
        return this.VAUCapacity;
    }

    /**
     * Set <p>套餐内VAU规格，单位：个。</p>
     * @param VAUCapacity <p>套餐内VAU规格，单位：个。</p>
     */
    public void setVAUCapacity(Long VAUCapacity) {
        this.VAUCapacity = VAUCapacity;
    }

    /**
     * Get <p>套餐内内容加速流量规格，单位：字节。</p> 
     * @return AccTrafficCapacity <p>套餐内内容加速流量规格，单位：字节。</p>
     */
    public Long getAccTrafficCapacity() {
        return this.AccTrafficCapacity;
    }

    /**
     * Set <p>套餐内内容加速流量规格，单位：字节。</p>
     * @param AccTrafficCapacity <p>套餐内内容加速流量规格，单位：字节。</p>
     */
    public void setAccTrafficCapacity(Long AccTrafficCapacity) {
        this.AccTrafficCapacity = AccTrafficCapacity;
    }

    /**
     * Get <p>套餐内客户端认证流量规格，单位：字节。</p> 
     * @return ClientAuthTrafficCapacity <p>套餐内客户端认证流量规格，单位：字节。</p>
     */
    public Long getClientAuthTrafficCapacity() {
        return this.ClientAuthTrafficCapacity;
    }

    /**
     * Set <p>套餐内客户端认证流量规格，单位：字节。</p>
     * @param ClientAuthTrafficCapacity <p>套餐内客户端认证流量规格，单位：字节。</p>
     */
    public void setClientAuthTrafficCapacity(Long ClientAuthTrafficCapacity) {
        this.ClientAuthTrafficCapacity = ClientAuthTrafficCapacity;
    }

    /**
     * Get <p>套餐内智能加速流量规格，单位：字节。</p> 
     * @return SmartTrafficCapacity <p>套餐内智能加速流量规格，单位：字节。</p>
     */
    public Long getSmartTrafficCapacity() {
        return this.SmartTrafficCapacity;
    }

    /**
     * Set <p>套餐内智能加速流量规格，单位：字节。</p>
     * @param SmartTrafficCapacity <p>套餐内智能加速流量规格，单位：字节。</p>
     */
    public void setSmartTrafficCapacity(Long SmartTrafficCapacity) {
        this.SmartTrafficCapacity = SmartTrafficCapacity;
    }

    /**
     * Get <p>套餐内DDoS防护流量规格，单位：字节。</p> 
     * @return DDoSTrafficCapacity <p>套餐内DDoS防护流量规格，单位：字节。</p>
     */
    public Long getDDoSTrafficCapacity() {
        return this.DDoSTrafficCapacity;
    }

    /**
     * Set <p>套餐内DDoS防护流量规格，单位：字节。</p>
     * @param DDoSTrafficCapacity <p>套餐内DDoS防护流量规格，单位：字节。</p>
     */
    public void setDDoSTrafficCapacity(Long DDoSTrafficCapacity) {
        this.DDoSTrafficCapacity = DDoSTrafficCapacity;
    }

    /**
     * Get <p>套餐内安全流量规格，单位：字节。</p> 
     * @return SecTrafficCapacity <p>套餐内安全流量规格，单位：字节。</p>
     */
    public Long getSecTrafficCapacity() {
        return this.SecTrafficCapacity;
    }

    /**
     * Set <p>套餐内安全流量规格，单位：字节。</p>
     * @param SecTrafficCapacity <p>套餐内安全流量规格，单位：字节。</p>
     */
    public void setSecTrafficCapacity(Long SecTrafficCapacity) {
        this.SecTrafficCapacity = SecTrafficCapacity;
    }

    /**
     * Get <p>套餐内安全请求数规格，单位：次。</p> 
     * @return SecRequestCapacity <p>套餐内安全请求数规格，单位：次。</p>
     */
    public Long getSecRequestCapacity() {
        return this.SecRequestCapacity;
    }

    /**
     * Set <p>套餐内安全请求数规格，单位：次。</p>
     * @param SecRequestCapacity <p>套餐内安全请求数规格，单位：次。</p>
     */
    public void setSecRequestCapacity(Long SecRequestCapacity) {
        this.SecRequestCapacity = SecRequestCapacity;
    }

    /**
     * Get <p>套餐内四层加速流量规格，单位：字节。</p> 
     * @return L4TrafficCapacity <p>套餐内四层加速流量规格，单位：字节。</p>
     */
    public Long getL4TrafficCapacity() {
        return this.L4TrafficCapacity;
    }

    /**
     * Set <p>套餐内四层加速流量规格，单位：字节。</p>
     * @param L4TrafficCapacity <p>套餐内四层加速流量规格，单位：字节。</p>
     */
    public void setL4TrafficCapacity(Long L4TrafficCapacity) {
        this.L4TrafficCapacity = L4TrafficCapacity;
    }

    /**
     * Get <p>套餐内中国大陆网络优化流量规格，单位：字节。</p> 
     * @return CrossMLCTrafficCapacity <p>套餐内中国大陆网络优化流量规格，单位：字节。</p>
     */
    public Long getCrossMLCTrafficCapacity() {
        return this.CrossMLCTrafficCapacity;
    }

    /**
     * Set <p>套餐内中国大陆网络优化流量规格，单位：字节。</p>
     * @param CrossMLCTrafficCapacity <p>套餐内中国大陆网络优化流量规格，单位：字节。</p>
     */
    public void setCrossMLCTrafficCapacity(Long CrossMLCTrafficCapacity) {
        this.CrossMLCTrafficCapacity = CrossMLCTrafficCapacity;
    }

    /**
     * Get <p>套餐是否允许绑定新站点，取值有：</p><li>true: 允许绑定新站点；</li><li>false: 不允许绑定新站点。</li> 
     * @return Bindable <p>套餐是否允许绑定新站点，取值有：</p><li>true: 允许绑定新站点；</li><li>false: 不允许绑定新站点。</li>
     */
    public String getBindable() {
        return this.Bindable;
    }

    /**
     * Set <p>套餐是否允许绑定新站点，取值有：</p><li>true: 允许绑定新站点；</li><li>false: 不允许绑定新站点。</li>
     * @param Bindable <p>套餐是否允许绑定新站点，取值有：</p><li>true: 允许绑定新站点；</li><li>false: 不允许绑定新站点。</li>
     */
    public void setBindable(String Bindable) {
        this.Bindable = Bindable;
    }

    /**
     * Get <p>套餐生效时间。</p> 
     * @return EnabledTime <p>套餐生效时间。</p>
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set <p>套餐生效时间。</p>
     * @param EnabledTime <p>套餐生效时间。</p>
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
    }

    /**
     * Get <p>套餐过期时间。</p> 
     * @return ExpiredTime <p>套餐过期时间。</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>套餐过期时间。</p>
     * @param ExpiredTime <p>套餐过期时间。</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li></p> 
     * @return Features <p>套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li></p>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li></p>
     * @param Features <p>套餐所支持的功能，取值有：<li>ContentAcceleration：内容加速功能；</li><li>SmartAcceleration：智能加速功能；</li><li>L4：四层加速功能；</li><li>Waf：高级 Web 防护；</li><li>QUIC：QUIC功能；</li><li>CrossMLC：中国大陆网络优化功能；</li><li>ProcessMedia：媒体处理功能；</li><li>L4DDoS：四层DDoS防护功能；</li>L7DDoS功能只会出现以下所有规格中的一项<li>L7DDoS.CM30G；七层DDoS防护功能-中国大陆30G保底带宽规格；</li><li>L7DDoS.CM60G；七层DDoS防护功能-中国大陆60G保底带宽规格；</li><li>L7DDoS.CM100G；七层DDoS防护功能-中国大陆100G保底带宽规格；</li><li>L7DDoS.Anycast300G；七层DDoS防护功能-中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.AnycastUnlimited；七层DDoS防护功能-中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM30G_Anycast300G；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM60G_Anycast300G；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM100G_Anycast300G；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast300G保底带宽规格；</li><li>L7DDoS.CM30G_AnycastUnlimited；七层DDoS防护功能-中国大陆30G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM60G_AnycastUnlimited；七层DDoS防护功能-中国大陆60G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li><li>L7DDoS.CM100G_AnycastUnlimited；七层DDoS防护功能-中国大陆100G保底带宽规格，中国大陆以外Anycast无上限全力防护规格；</li></p>
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
        if (source.ClientAuthTrafficCapacity != null) {
            this.ClientAuthTrafficCapacity = new Long(source.ClientAuthTrafficCapacity);
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
        this.setParamSimple(map, prefix + "ClientAuthTrafficCapacity", this.ClientAuthTrafficCapacity);
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

