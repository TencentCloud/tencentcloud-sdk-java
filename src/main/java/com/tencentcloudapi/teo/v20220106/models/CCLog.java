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

public class CCLog extends AbstractModel{

    /**
    * 攻击时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackSip")
    @Expose
    private String AttackSip;

    /**
    * 攻击域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackDomain")
    @Expose
    private String AttackDomain;

    /**
    * 请求uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * 命中次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * IP所在国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * 事件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 处置方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisposalMethod")
    @Expose
    private String DisposalMethod;

    /**
    * http_log
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * 规则编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
     * Get 攻击时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackTime 攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackTime 攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Get 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackSip 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackSip() {
        return this.AttackSip;
    }

    /**
     * Set 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackSip 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackSip(String AttackSip) {
        this.AttackSip = AttackSip;
    }

    /**
     * Get 攻击域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackDomain 攻击域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackDomain() {
        return this.AttackDomain;
    }

    /**
     * Set 攻击域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackDomain 攻击域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackDomain(String AttackDomain) {
        this.AttackDomain = AttackDomain;
    }

    /**
     * Get 请求uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestUri 请求uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set 请求uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestUri 请求uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get 命中次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitCount 命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set 命中次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitCount 命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get IP所在国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SipCountryCode IP所在国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSipCountryCode() {
        return this.SipCountryCode;
    }

    /**
     * Set IP所在国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param SipCountryCode IP所在国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSipCountryCode(String SipCountryCode) {
        this.SipCountryCode = SipCountryCode;
    }

    /**
     * Get 事件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 处置方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisposalMethod 处置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisposalMethod() {
        return this.DisposalMethod;
    }

    /**
     * Set 处置方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisposalMethod 处置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisposalMethod(String DisposalMethod) {
        this.DisposalMethod = DisposalMethod;
    }

    /**
     * Get http_log
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpLog http_log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set http_log
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpLog http_log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get 规则编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public CCLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCLog(CCLog source) {
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
        if (source.AttackSip != null) {
            this.AttackSip = new String(source.AttackSip);
        }
        if (source.AttackDomain != null) {
            this.AttackDomain = new String(source.AttackDomain);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.SipCountryCode != null) {
            this.SipCountryCode = new String(source.SipCountryCode);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.DisposalMethod != null) {
            this.DisposalMethod = new String(source.DisposalMethod);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);
        this.setParamSimple(map, prefix + "AttackSip", this.AttackSip);
        this.setParamSimple(map, prefix + "AttackDomain", this.AttackDomain);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DisposalMethod", this.DisposalMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

