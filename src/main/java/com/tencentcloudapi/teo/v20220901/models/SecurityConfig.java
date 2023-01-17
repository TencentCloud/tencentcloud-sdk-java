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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityConfig extends AbstractModel{

    /**
    * 托管规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * 速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * 自定义规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * Bot配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * 七层防护总开关。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
    * 基础访问管控。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpTableConfig")
    @Expose
    private IpTableConfig IpTableConfig;

    /**
    * 例外规则配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptConfig")
    @Expose
    private ExceptConfig ExceptConfig;

    /**
    * 自定义拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropPageConfig")
    @Expose
    private DropPageConfig DropPageConfig;

    /**
    * 模板配置。此处仅出参数使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateConfig")
    @Expose
    private TemplateConfig TemplateConfig;

    /**
    * 慢速攻击配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlowPostConfig")
    @Expose
    private SlowPostConfig SlowPostConfig;

    /**
     * Get 托管规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafConfig 托管规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set 托管规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafConfig 托管规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get 速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitConfig 速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set 速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitConfig 速率限制。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get 自定义规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclConfig 自定义规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set 自定义规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclConfig 自定义规则。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get Bot配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotConfig Bot配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set Bot配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotConfig Bot配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get 七层防护总开关。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchConfig 七层防护总开关。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set 七层防护总开关。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchConfig 七层防护总开关。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
    }

    /**
     * Get 基础访问管控。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpTableConfig 基础访问管控。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpTableConfig getIpTableConfig() {
        return this.IpTableConfig;
    }

    /**
     * Set 基础访问管控。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpTableConfig 基础访问管控。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpTableConfig(IpTableConfig IpTableConfig) {
        this.IpTableConfig = IpTableConfig;
    }

    /**
     * Get 例外规则配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptConfig 例外规则配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExceptConfig getExceptConfig() {
        return this.ExceptConfig;
    }

    /**
     * Set 例外规则配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptConfig 例外规则配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptConfig(ExceptConfig ExceptConfig) {
        this.ExceptConfig = ExceptConfig;
    }

    /**
     * Get 自定义拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropPageConfig 自定义拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropPageConfig getDropPageConfig() {
        return this.DropPageConfig;
    }

    /**
     * Set 自定义拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropPageConfig 自定义拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropPageConfig(DropPageConfig DropPageConfig) {
        this.DropPageConfig = DropPageConfig;
    }

    /**
     * Get 模板配置。此处仅出参数使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateConfig 模板配置。此处仅出参数使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemplateConfig getTemplateConfig() {
        return this.TemplateConfig;
    }

    /**
     * Set 模板配置。此处仅出参数使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateConfig 模板配置。此处仅出参数使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateConfig(TemplateConfig TemplateConfig) {
        this.TemplateConfig = TemplateConfig;
    }

    /**
     * Get 慢速攻击配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlowPostConfig 慢速攻击配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlowPostConfig getSlowPostConfig() {
        return this.SlowPostConfig;
    }

    /**
     * Set 慢速攻击配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlowPostConfig 慢速攻击配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlowPostConfig(SlowPostConfig SlowPostConfig) {
        this.SlowPostConfig = SlowPostConfig;
    }

    public SecurityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityConfig(SecurityConfig source) {
        if (source.WafConfig != null) {
            this.WafConfig = new WafConfig(source.WafConfig);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfig(source.RateLimitConfig);
        }
        if (source.AclConfig != null) {
            this.AclConfig = new AclConfig(source.AclConfig);
        }
        if (source.BotConfig != null) {
            this.BotConfig = new BotConfig(source.BotConfig);
        }
        if (source.SwitchConfig != null) {
            this.SwitchConfig = new SwitchConfig(source.SwitchConfig);
        }
        if (source.IpTableConfig != null) {
            this.IpTableConfig = new IpTableConfig(source.IpTableConfig);
        }
        if (source.ExceptConfig != null) {
            this.ExceptConfig = new ExceptConfig(source.ExceptConfig);
        }
        if (source.DropPageConfig != null) {
            this.DropPageConfig = new DropPageConfig(source.DropPageConfig);
        }
        if (source.TemplateConfig != null) {
            this.TemplateConfig = new TemplateConfig(source.TemplateConfig);
        }
        if (source.SlowPostConfig != null) {
            this.SlowPostConfig = new SlowPostConfig(source.SlowPostConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WafConfig.", this.WafConfig);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "AclConfig.", this.AclConfig);
        this.setParamObj(map, prefix + "BotConfig.", this.BotConfig);
        this.setParamObj(map, prefix + "SwitchConfig.", this.SwitchConfig);
        this.setParamObj(map, prefix + "IpTableConfig.", this.IpTableConfig);
        this.setParamObj(map, prefix + "ExceptConfig.", this.ExceptConfig);
        this.setParamObj(map, prefix + "DropPageConfig.", this.DropPageConfig);
        this.setParamObj(map, prefix + "TemplateConfig.", this.TemplateConfig);
        this.setParamObj(map, prefix + "SlowPostConfig.", this.SlowPostConfig);

    }
}

