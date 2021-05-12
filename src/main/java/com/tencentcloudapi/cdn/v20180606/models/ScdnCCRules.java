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

public class ScdnCCRules extends AbstractModel{

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则值
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * 规则限频
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

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
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页 
     * @return RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
     * @param RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则值 
     * @return RuleValue 规则值
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set 规则值
     * @param RuleValue 规则值
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get 规则限频 
     * @return Qps 规则限频
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 规则限频
     * @param Qps 规则限频
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
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

    public ScdnCCRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnCCRules(ScdnCCRules source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "DetectionTime", this.DetectionTime);
        this.setParamSimple(map, prefix + "FrequencyLimit", this.FrequencyLimit);
        this.setParamSimple(map, prefix + "PunishmentSwitch", this.PunishmentSwitch);
        this.setParamSimple(map, prefix + "PunishmentTime", this.PunishmentTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

