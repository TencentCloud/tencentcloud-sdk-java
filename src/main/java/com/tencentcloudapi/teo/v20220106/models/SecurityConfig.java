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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityConfig extends AbstractModel{

    /**
    * 门神配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * RateLimit配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * DDoS配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosConfig")
    @Expose
    private DDoSConfig DdosConfig;

    /**
    * ACL配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * Bot配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * 总开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
     * Get 门神配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafConfig 门神配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set 门神配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafConfig 门神配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get RateLimit配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitConfig RateLimit配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set RateLimit配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitConfig RateLimit配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get DDoS配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosConfig DDoS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSConfig getDdosConfig() {
        return this.DdosConfig;
    }

    /**
     * Set DDoS配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosConfig DDoS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosConfig(DDoSConfig DdosConfig) {
        this.DdosConfig = DdosConfig;
    }

    /**
     * Get ACL配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclConfig ACL配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set ACL配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclConfig ACL配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get Bot配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotConfig Bot配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set Bot配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotConfig Bot配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get 总开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchConfig 总开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set 总开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchConfig 总开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
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
        if (source.DdosConfig != null) {
            this.DdosConfig = new DDoSConfig(source.DdosConfig);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WafConfig.", this.WafConfig);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "DdosConfig.", this.DdosConfig);
        this.setParamObj(map, prefix + "AclConfig.", this.AclConfig);
        this.setParamObj(map, prefix + "BotConfig.", this.BotConfig);
        this.setParamObj(map, prefix + "SwitchConfig.", this.SwitchConfig);

    }
}

