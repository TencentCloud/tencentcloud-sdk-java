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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedCCRules extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 探测时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectionTime")
    @Expose
    private Long DetectionTime;

    /**
    * 限频阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrequencyLimit")
    @Expose
    private Long FrequencyLimit;

    /**
    * IP 惩罚开关，可选on|off
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishmentSwitch")
    @Expose
    private String PunishmentSwitch;

    /**
    * IP 惩罚时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishmentTime")
    @Expose
    private Long PunishmentTime;

    /**
    * 执行动作，intercept|redirect
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 动作为 redirect 时，重定向的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 七层限频具体配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configure")
    @Expose
    private ScdnSevenLayerRules [] Configure;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 探测时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectionTime 探测时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetectionTime() {
        return this.DetectionTime;
    }

    /**
     * Set 探测时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectionTime 探测时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectionTime(Long DetectionTime) {
        this.DetectionTime = DetectionTime;
    }

    /**
     * Get 限频阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrequencyLimit 限频阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrequencyLimit() {
        return this.FrequencyLimit;
    }

    /**
     * Set 限频阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrequencyLimit 限频阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequencyLimit(Long FrequencyLimit) {
        this.FrequencyLimit = FrequencyLimit;
    }

    /**
     * Get IP 惩罚开关，可选on|off
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishmentSwitch IP 惩罚开关，可选on|off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPunishmentSwitch() {
        return this.PunishmentSwitch;
    }

    /**
     * Set IP 惩罚开关，可选on|off
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishmentSwitch IP 惩罚开关，可选on|off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishmentSwitch(String PunishmentSwitch) {
        this.PunishmentSwitch = PunishmentSwitch;
    }

    /**
     * Get IP 惩罚时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishmentTime IP 惩罚时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPunishmentTime() {
        return this.PunishmentTime;
    }

    /**
     * Set IP 惩罚时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishmentTime IP 惩罚时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishmentTime(Long PunishmentTime) {
        this.PunishmentTime = PunishmentTime;
    }

    /**
     * Get 执行动作，intercept|redirect
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 执行动作，intercept|redirect
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，intercept|redirect
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 执行动作，intercept|redirect
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 动作为 redirect 时，重定向的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectUrl 动作为 redirect 时，重定向的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 动作为 redirect 时，重定向的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectUrl 动作为 redirect 时，重定向的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 七层限频具体配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configure 七层限频具体配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnSevenLayerRules [] getConfigure() {
        return this.Configure;
    }

    /**
     * Set 七层限频具体配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configure 七层限频具体配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigure(ScdnSevenLayerRules [] Configure) {
        this.Configure = Configure;
    }

    public AdvancedCCRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedCCRules(AdvancedCCRules source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectionTime != null) {
            this.DetectionTime = new Long(source.DetectionTime);
        }
        if (source.FrequencyLimit != null) {
            this.FrequencyLimit = new Long(source.FrequencyLimit);
        }
        if (source.PunishmentSwitch != null) {
            this.PunishmentSwitch = new String(source.PunishmentSwitch);
        }
        if (source.PunishmentTime != null) {
            this.PunishmentTime = new Long(source.PunishmentTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.Configure != null) {
            this.Configure = new ScdnSevenLayerRules[source.Configure.length];
            for (int i = 0; i < source.Configure.length; i++) {
                this.Configure[i] = new ScdnSevenLayerRules(source.Configure[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectionTime", this.DetectionTime);
        this.setParamSimple(map, prefix + "FrequencyLimit", this.FrequencyLimit);
        this.setParamSimple(map, prefix + "PunishmentSwitch", this.PunishmentSwitch);
        this.setParamSimple(map, prefix + "PunishmentTime", this.PunishmentTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamArrayObj(map, prefix + "Configure.", this.Configure);

    }
}

