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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSAIConf extends AbstractModel {

    /**
    * <p>广告决策服务器URL(ADS)。注意：填了AdsUrl会自动代替覆盖AdsUrls[0]</p>
    */
    @SerializedName("AdsUrl")
    @Expose
    private String AdsUrl;

    /**
    * <p>广告决策服务器URL数组(ADS)</p>
    */
    @SerializedName("AdsUrls")
    @Expose
    private String [] AdsUrls;

    /**
    * <p>参数配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigAliases")
    @Expose
    private ConfigAliasesInfo [] ConfigAliases;

    /**
    * <p>是否开启广告标记透传。</p>
    */
    @SerializedName("AdMarkerPassthrough")
    @Expose
    private Boolean AdMarkerPassthrough;

    /**
    * <p>如何处理广告中的标记,可选值[1-2]：<br>1:所有SCTE-35类型标记全部处理-all（默认）<br>2:SCTE-35enhanced，解析部分类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SCTE35AdType")
    @Expose
    private Long SCTE35AdType;

    /**
    * <p>默认广告url。</p>
    */
    @SerializedName("SlateAd")
    @Expose
    private String SlateAd;

    /**
    * <p>未填充的最大时长，单位：秒。</p>
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * <p>是否开启mpd location, true对应enable， false对应disable。</p>
    */
    @SerializedName("DashMPDLocation")
    @Expose
    private Boolean DashMPDLocation;

    /**
    * <p>被视作广告的标记类型，可选值[1-8]：</p><ol><li>Splice insert<br>2.Provider advertisement</li><li>Distributor advertisement</li><li>Provider placement opportunity</li><li>Distributor placement opportunity</li><li>Break</li><li>Provider overlay placement opportunity</li><li>Distributor overlay placement opportunity。</li></ol>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdTriggers")
    @Expose
    private Long [] AdTriggers;

    /**
    * <p>被视作广告的分发限制类型，可选值[1-4]：<br>1:None<br>2:Restricted（默认） 3:Unrestricted<br>4.Both</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryRestrictions")
    @Expose
    private Long DeliveryRestrictions;

    /**
    * <p>源流CDN前缀，需要以http://或者https://开头。</p>
    */
    @SerializedName("SourceCDNPrefix")
    @Expose
    private String SourceCDNPrefix;

    /**
    * <p>广告CDN前缀，需要以http://或者https://开头。</p>
    */
    @SerializedName("AdCDNPrefix")
    @Expose
    private String AdCDNPrefix;

    /**
    * <p>预加载广告决策服务地址。注意：填了PreRollAdsUrl会自动代替覆盖PreRollAdsUrls[0]</p>
    */
    @SerializedName("PreRollAdsUrl")
    @Expose
    private String PreRollAdsUrl;

    /**
    * <p>预加载广告决策服务地址数组</p>
    */
    @SerializedName("PreRollAdsUrls")
    @Expose
    private String [] PreRollAdsUrls;

    /**
    * <p>预加载广告最大允许时长，0-3600。</p>
    */
    @SerializedName("PreRollMaxAllowedDuration")
    @Expose
    private Long PreRollMaxAllowedDuration;

    /**
    * <p>是否开启多次请求ADS,开启后将优先请求ADS，请求失败后再请求兜底广告</p>
    */
    @SerializedName("MultiRequest")
    @Expose
    private Boolean MultiRequest;

    /**
    * <p>dash周期类型：SinglePeriod 或 MultiPeriod，默认 MultiPeriod</p>
    */
    @SerializedName("DashOriginManifestType")
    @Expose
    private String DashOriginManifestType;

    /**
    * <p>广告为空时是否插入Slate，默认开启(true)</p>
    */
    @SerializedName("SlateOnEmptyVast")
    @Expose
    private Boolean SlateOnEmptyVast;

    /**
    * <p>SCTE marker duration，默认180，范围0-3600</p>
    */
    @SerializedName("SCTEMarkerDuration")
    @Expose
    private Long SCTEMarkerDuration;

    /**
    * <p>安全组Id</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
     * Get <p>广告决策服务器URL(ADS)。注意：填了AdsUrl会自动代替覆盖AdsUrls[0]</p> 
     * @return AdsUrl <p>广告决策服务器URL(ADS)。注意：填了AdsUrl会自动代替覆盖AdsUrls[0]</p>
     */
    public String getAdsUrl() {
        return this.AdsUrl;
    }

    /**
     * Set <p>广告决策服务器URL(ADS)。注意：填了AdsUrl会自动代替覆盖AdsUrls[0]</p>
     * @param AdsUrl <p>广告决策服务器URL(ADS)。注意：填了AdsUrl会自动代替覆盖AdsUrls[0]</p>
     */
    public void setAdsUrl(String AdsUrl) {
        this.AdsUrl = AdsUrl;
    }

    /**
     * Get <p>广告决策服务器URL数组(ADS)</p> 
     * @return AdsUrls <p>广告决策服务器URL数组(ADS)</p>
     */
    public String [] getAdsUrls() {
        return this.AdsUrls;
    }

    /**
     * Set <p>广告决策服务器URL数组(ADS)</p>
     * @param AdsUrls <p>广告决策服务器URL数组(ADS)</p>
     */
    public void setAdsUrls(String [] AdsUrls) {
        this.AdsUrls = AdsUrls;
    }

    /**
     * Get <p>参数配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigAliases <p>参数配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigAliasesInfo [] getConfigAliases() {
        return this.ConfigAliases;
    }

    /**
     * Set <p>参数配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigAliases <p>参数配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigAliases(ConfigAliasesInfo [] ConfigAliases) {
        this.ConfigAliases = ConfigAliases;
    }

    /**
     * Get <p>是否开启广告标记透传。</p> 
     * @return AdMarkerPassthrough <p>是否开启广告标记透传。</p>
     */
    public Boolean getAdMarkerPassthrough() {
        return this.AdMarkerPassthrough;
    }

    /**
     * Set <p>是否开启广告标记透传。</p>
     * @param AdMarkerPassthrough <p>是否开启广告标记透传。</p>
     */
    public void setAdMarkerPassthrough(Boolean AdMarkerPassthrough) {
        this.AdMarkerPassthrough = AdMarkerPassthrough;
    }

    /**
     * Get <p>如何处理广告中的标记,可选值[1-2]：<br>1:所有SCTE-35类型标记全部处理-all（默认）<br>2:SCTE-35enhanced，解析部分类型。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SCTE35AdType <p>如何处理广告中的标记,可选值[1-2]：<br>1:所有SCTE-35类型标记全部处理-all（默认）<br>2:SCTE-35enhanced，解析部分类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSCTE35AdType() {
        return this.SCTE35AdType;
    }

    /**
     * Set <p>如何处理广告中的标记,可选值[1-2]：<br>1:所有SCTE-35类型标记全部处理-all（默认）<br>2:SCTE-35enhanced，解析部分类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SCTE35AdType <p>如何处理广告中的标记,可选值[1-2]：<br>1:所有SCTE-35类型标记全部处理-all（默认）<br>2:SCTE-35enhanced，解析部分类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSCTE35AdType(Long SCTE35AdType) {
        this.SCTE35AdType = SCTE35AdType;
    }

    /**
     * Get <p>默认广告url。</p> 
     * @return SlateAd <p>默认广告url。</p>
     */
    public String getSlateAd() {
        return this.SlateAd;
    }

    /**
     * Set <p>默认广告url。</p>
     * @param SlateAd <p>默认广告url。</p>
     */
    public void setSlateAd(String SlateAd) {
        this.SlateAd = SlateAd;
    }

    /**
     * Get <p>未填充的最大时长，单位：秒。</p> 
     * @return Threshold <p>未填充的最大时长，单位：秒。</p>
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set <p>未填充的最大时长，单位：秒。</p>
     * @param Threshold <p>未填充的最大时长，单位：秒。</p>
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get <p>是否开启mpd location, true对应enable， false对应disable。</p> 
     * @return DashMPDLocation <p>是否开启mpd location, true对应enable， false对应disable。</p>
     */
    public Boolean getDashMPDLocation() {
        return this.DashMPDLocation;
    }

    /**
     * Set <p>是否开启mpd location, true对应enable， false对应disable。</p>
     * @param DashMPDLocation <p>是否开启mpd location, true对应enable， false对应disable。</p>
     */
    public void setDashMPDLocation(Boolean DashMPDLocation) {
        this.DashMPDLocation = DashMPDLocation;
    }

    /**
     * Get <p>被视作广告的标记类型，可选值[1-8]：</p><ol><li>Splice insert<br>2.Provider advertisement</li><li>Distributor advertisement</li><li>Provider placement opportunity</li><li>Distributor placement opportunity</li><li>Break</li><li>Provider overlay placement opportunity</li><li>Distributor overlay placement opportunity。</li></ol>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdTriggers <p>被视作广告的标记类型，可选值[1-8]：</p><ol><li>Splice insert<br>2.Provider advertisement</li><li>Distributor advertisement</li><li>Provider placement opportunity</li><li>Distributor placement opportunity</li><li>Break</li><li>Provider overlay placement opportunity</li><li>Distributor overlay placement opportunity。</li></ol>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAdTriggers() {
        return this.AdTriggers;
    }

    /**
     * Set <p>被视作广告的标记类型，可选值[1-8]：</p><ol><li>Splice insert<br>2.Provider advertisement</li><li>Distributor advertisement</li><li>Provider placement opportunity</li><li>Distributor placement opportunity</li><li>Break</li><li>Provider overlay placement opportunity</li><li>Distributor overlay placement opportunity。</li></ol>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdTriggers <p>被视作广告的标记类型，可选值[1-8]：</p><ol><li>Splice insert<br>2.Provider advertisement</li><li>Distributor advertisement</li><li>Provider placement opportunity</li><li>Distributor placement opportunity</li><li>Break</li><li>Provider overlay placement opportunity</li><li>Distributor overlay placement opportunity。</li></ol>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdTriggers(Long [] AdTriggers) {
        this.AdTriggers = AdTriggers;
    }

    /**
     * Get <p>被视作广告的分发限制类型，可选值[1-4]：<br>1:None<br>2:Restricted（默认） 3:Unrestricted<br>4.Both</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryRestrictions <p>被视作广告的分发限制类型，可选值[1-4]：<br>1:None<br>2:Restricted（默认） 3:Unrestricted<br>4.Both</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeliveryRestrictions() {
        return this.DeliveryRestrictions;
    }

    /**
     * Set <p>被视作广告的分发限制类型，可选值[1-4]：<br>1:None<br>2:Restricted（默认） 3:Unrestricted<br>4.Both</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryRestrictions <p>被视作广告的分发限制类型，可选值[1-4]：<br>1:None<br>2:Restricted（默认） 3:Unrestricted<br>4.Both</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryRestrictions(Long DeliveryRestrictions) {
        this.DeliveryRestrictions = DeliveryRestrictions;
    }

    /**
     * Get <p>源流CDN前缀，需要以http://或者https://开头。</p> 
     * @return SourceCDNPrefix <p>源流CDN前缀，需要以http://或者https://开头。</p>
     */
    public String getSourceCDNPrefix() {
        return this.SourceCDNPrefix;
    }

    /**
     * Set <p>源流CDN前缀，需要以http://或者https://开头。</p>
     * @param SourceCDNPrefix <p>源流CDN前缀，需要以http://或者https://开头。</p>
     */
    public void setSourceCDNPrefix(String SourceCDNPrefix) {
        this.SourceCDNPrefix = SourceCDNPrefix;
    }

    /**
     * Get <p>广告CDN前缀，需要以http://或者https://开头。</p> 
     * @return AdCDNPrefix <p>广告CDN前缀，需要以http://或者https://开头。</p>
     */
    public String getAdCDNPrefix() {
        return this.AdCDNPrefix;
    }

    /**
     * Set <p>广告CDN前缀，需要以http://或者https://开头。</p>
     * @param AdCDNPrefix <p>广告CDN前缀，需要以http://或者https://开头。</p>
     */
    public void setAdCDNPrefix(String AdCDNPrefix) {
        this.AdCDNPrefix = AdCDNPrefix;
    }

    /**
     * Get <p>预加载广告决策服务地址。注意：填了PreRollAdsUrl会自动代替覆盖PreRollAdsUrls[0]</p> 
     * @return PreRollAdsUrl <p>预加载广告决策服务地址。注意：填了PreRollAdsUrl会自动代替覆盖PreRollAdsUrls[0]</p>
     */
    public String getPreRollAdsUrl() {
        return this.PreRollAdsUrl;
    }

    /**
     * Set <p>预加载广告决策服务地址。注意：填了PreRollAdsUrl会自动代替覆盖PreRollAdsUrls[0]</p>
     * @param PreRollAdsUrl <p>预加载广告决策服务地址。注意：填了PreRollAdsUrl会自动代替覆盖PreRollAdsUrls[0]</p>
     */
    public void setPreRollAdsUrl(String PreRollAdsUrl) {
        this.PreRollAdsUrl = PreRollAdsUrl;
    }

    /**
     * Get <p>预加载广告决策服务地址数组</p> 
     * @return PreRollAdsUrls <p>预加载广告决策服务地址数组</p>
     */
    public String [] getPreRollAdsUrls() {
        return this.PreRollAdsUrls;
    }

    /**
     * Set <p>预加载广告决策服务地址数组</p>
     * @param PreRollAdsUrls <p>预加载广告决策服务地址数组</p>
     */
    public void setPreRollAdsUrls(String [] PreRollAdsUrls) {
        this.PreRollAdsUrls = PreRollAdsUrls;
    }

    /**
     * Get <p>预加载广告最大允许时长，0-3600。</p> 
     * @return PreRollMaxAllowedDuration <p>预加载广告最大允许时长，0-3600。</p>
     */
    public Long getPreRollMaxAllowedDuration() {
        return this.PreRollMaxAllowedDuration;
    }

    /**
     * Set <p>预加载广告最大允许时长，0-3600。</p>
     * @param PreRollMaxAllowedDuration <p>预加载广告最大允许时长，0-3600。</p>
     */
    public void setPreRollMaxAllowedDuration(Long PreRollMaxAllowedDuration) {
        this.PreRollMaxAllowedDuration = PreRollMaxAllowedDuration;
    }

    /**
     * Get <p>是否开启多次请求ADS,开启后将优先请求ADS，请求失败后再请求兜底广告</p> 
     * @return MultiRequest <p>是否开启多次请求ADS,开启后将优先请求ADS，请求失败后再请求兜底广告</p>
     */
    public Boolean getMultiRequest() {
        return this.MultiRequest;
    }

    /**
     * Set <p>是否开启多次请求ADS,开启后将优先请求ADS，请求失败后再请求兜底广告</p>
     * @param MultiRequest <p>是否开启多次请求ADS,开启后将优先请求ADS，请求失败后再请求兜底广告</p>
     */
    public void setMultiRequest(Boolean MultiRequest) {
        this.MultiRequest = MultiRequest;
    }

    /**
     * Get <p>dash周期类型：SinglePeriod 或 MultiPeriod，默认 MultiPeriod</p> 
     * @return DashOriginManifestType <p>dash周期类型：SinglePeriod 或 MultiPeriod，默认 MultiPeriod</p>
     */
    public String getDashOriginManifestType() {
        return this.DashOriginManifestType;
    }

    /**
     * Set <p>dash周期类型：SinglePeriod 或 MultiPeriod，默认 MultiPeriod</p>
     * @param DashOriginManifestType <p>dash周期类型：SinglePeriod 或 MultiPeriod，默认 MultiPeriod</p>
     */
    public void setDashOriginManifestType(String DashOriginManifestType) {
        this.DashOriginManifestType = DashOriginManifestType;
    }

    /**
     * Get <p>广告为空时是否插入Slate，默认开启(true)</p> 
     * @return SlateOnEmptyVast <p>广告为空时是否插入Slate，默认开启(true)</p>
     */
    public Boolean getSlateOnEmptyVast() {
        return this.SlateOnEmptyVast;
    }

    /**
     * Set <p>广告为空时是否插入Slate，默认开启(true)</p>
     * @param SlateOnEmptyVast <p>广告为空时是否插入Slate，默认开启(true)</p>
     */
    public void setSlateOnEmptyVast(Boolean SlateOnEmptyVast) {
        this.SlateOnEmptyVast = SlateOnEmptyVast;
    }

    /**
     * Get <p>SCTE marker duration，默认180，范围0-3600</p> 
     * @return SCTEMarkerDuration <p>SCTE marker duration，默认180，范围0-3600</p>
     */
    public Long getSCTEMarkerDuration() {
        return this.SCTEMarkerDuration;
    }

    /**
     * Set <p>SCTE marker duration，默认180，范围0-3600</p>
     * @param SCTEMarkerDuration <p>SCTE marker duration，默认180，范围0-3600</p>
     */
    public void setSCTEMarkerDuration(Long SCTEMarkerDuration) {
        this.SCTEMarkerDuration = SCTEMarkerDuration;
    }

    /**
     * Get <p>安全组Id</p> 
     * @return SecurityGroupId <p>安全组Id</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>安全组Id</p>
     * @param SecurityGroupId <p>安全组Id</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    public SSAIConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIConf(SSAIConf source) {
        if (source.AdsUrl != null) {
            this.AdsUrl = new String(source.AdsUrl);
        }
        if (source.AdsUrls != null) {
            this.AdsUrls = new String[source.AdsUrls.length];
            for (int i = 0; i < source.AdsUrls.length; i++) {
                this.AdsUrls[i] = new String(source.AdsUrls[i]);
            }
        }
        if (source.ConfigAliases != null) {
            this.ConfigAliases = new ConfigAliasesInfo[source.ConfigAliases.length];
            for (int i = 0; i < source.ConfigAliases.length; i++) {
                this.ConfigAliases[i] = new ConfigAliasesInfo(source.ConfigAliases[i]);
            }
        }
        if (source.AdMarkerPassthrough != null) {
            this.AdMarkerPassthrough = new Boolean(source.AdMarkerPassthrough);
        }
        if (source.SCTE35AdType != null) {
            this.SCTE35AdType = new Long(source.SCTE35AdType);
        }
        if (source.SlateAd != null) {
            this.SlateAd = new String(source.SlateAd);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.DashMPDLocation != null) {
            this.DashMPDLocation = new Boolean(source.DashMPDLocation);
        }
        if (source.AdTriggers != null) {
            this.AdTriggers = new Long[source.AdTriggers.length];
            for (int i = 0; i < source.AdTriggers.length; i++) {
                this.AdTriggers[i] = new Long(source.AdTriggers[i]);
            }
        }
        if (source.DeliveryRestrictions != null) {
            this.DeliveryRestrictions = new Long(source.DeliveryRestrictions);
        }
        if (source.SourceCDNPrefix != null) {
            this.SourceCDNPrefix = new String(source.SourceCDNPrefix);
        }
        if (source.AdCDNPrefix != null) {
            this.AdCDNPrefix = new String(source.AdCDNPrefix);
        }
        if (source.PreRollAdsUrl != null) {
            this.PreRollAdsUrl = new String(source.PreRollAdsUrl);
        }
        if (source.PreRollAdsUrls != null) {
            this.PreRollAdsUrls = new String[source.PreRollAdsUrls.length];
            for (int i = 0; i < source.PreRollAdsUrls.length; i++) {
                this.PreRollAdsUrls[i] = new String(source.PreRollAdsUrls[i]);
            }
        }
        if (source.PreRollMaxAllowedDuration != null) {
            this.PreRollMaxAllowedDuration = new Long(source.PreRollMaxAllowedDuration);
        }
        if (source.MultiRequest != null) {
            this.MultiRequest = new Boolean(source.MultiRequest);
        }
        if (source.DashOriginManifestType != null) {
            this.DashOriginManifestType = new String(source.DashOriginManifestType);
        }
        if (source.SlateOnEmptyVast != null) {
            this.SlateOnEmptyVast = new Boolean(source.SlateOnEmptyVast);
        }
        if (source.SCTEMarkerDuration != null) {
            this.SCTEMarkerDuration = new Long(source.SCTEMarkerDuration);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdsUrl", this.AdsUrl);
        this.setParamArraySimple(map, prefix + "AdsUrls.", this.AdsUrls);
        this.setParamArrayObj(map, prefix + "ConfigAliases.", this.ConfigAliases);
        this.setParamSimple(map, prefix + "AdMarkerPassthrough", this.AdMarkerPassthrough);
        this.setParamSimple(map, prefix + "SCTE35AdType", this.SCTE35AdType);
        this.setParamSimple(map, prefix + "SlateAd", this.SlateAd);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "DashMPDLocation", this.DashMPDLocation);
        this.setParamArraySimple(map, prefix + "AdTriggers.", this.AdTriggers);
        this.setParamSimple(map, prefix + "DeliveryRestrictions", this.DeliveryRestrictions);
        this.setParamSimple(map, prefix + "SourceCDNPrefix", this.SourceCDNPrefix);
        this.setParamSimple(map, prefix + "AdCDNPrefix", this.AdCDNPrefix);
        this.setParamSimple(map, prefix + "PreRollAdsUrl", this.PreRollAdsUrl);
        this.setParamArraySimple(map, prefix + "PreRollAdsUrls.", this.PreRollAdsUrls);
        this.setParamSimple(map, prefix + "PreRollMaxAllowedDuration", this.PreRollMaxAllowedDuration);
        this.setParamSimple(map, prefix + "MultiRequest", this.MultiRequest);
        this.setParamSimple(map, prefix + "DashOriginManifestType", this.DashOriginManifestType);
        this.setParamSimple(map, prefix + "SlateOnEmptyVast", this.SlateOnEmptyVast);
        this.setParamSimple(map, prefix + "SCTEMarkerDuration", this.SCTEMarkerDuration);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

