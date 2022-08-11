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
    * 攻击请求时间，采用unix秒级时间戳。
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * 客户端ip。
    */
    @SerializedName("AttackSip")
    @Expose
    private String AttackSip;

    /**
    * 受攻击域名。
    */
    @SerializedName("AttackDomain")
    @Expose
    private String AttackDomain;

    /**
    * URI。
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * 命中次数。
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)。
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * 请求（事件）ID。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisposalMethod")
    @Expose
    private String DisposalMethod;

    /**
    * 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * User Agent，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * 请求方法，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * 规则信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDetailList")
    @Expose
    private SecRuleRelatedInfo [] RuleDetailList;

    /**
     * Get 攻击请求时间，采用unix秒级时间戳。 
     * @return AttackTime 攻击请求时间，采用unix秒级时间戳。
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击请求时间，采用unix秒级时间戳。
     * @param AttackTime 攻击请求时间，采用unix秒级时间戳。
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Get 客户端ip。 
     * @return AttackSip 客户端ip。
     */
    public String getAttackSip() {
        return this.AttackSip;
    }

    /**
     * Set 客户端ip。
     * @param AttackSip 客户端ip。
     */
    public void setAttackSip(String AttackSip) {
        this.AttackSip = AttackSip;
    }

    /**
     * Get 受攻击域名。 
     * @return AttackDomain 受攻击域名。
     */
    public String getAttackDomain() {
        return this.AttackDomain;
    }

    /**
     * Set 受攻击域名。
     * @param AttackDomain 受攻击域名。
     */
    public void setAttackDomain(String AttackDomain) {
        this.AttackDomain = AttackDomain;
    }

    /**
     * Get URI。 
     * @return RequestUri URI。
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set URI。
     * @param RequestUri URI。
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get 命中次数。 
     * @return HitCount 命中次数。
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set 命中次数。
     * @param HitCount 命中次数。
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)。 
     * @return SipCountryCode IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)。
     */
    public String getSipCountryCode() {
        return this.SipCountryCode;
    }

    /**
     * Set IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)。
     * @param SipCountryCode IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)。
     */
    public void setSipCountryCode(String SipCountryCode) {
        this.SipCountryCode = SipCountryCode;
    }

    /**
     * Get 请求（事件）ID。 
     * @return EventId 请求（事件）ID。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 请求（事件）ID。
     * @param EventId 请求（事件）ID。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisposalMethod 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisposalMethod() {
        return this.DisposalMethod;
    }

    /**
     * Set 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisposalMethod 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisposalMethod(String DisposalMethod) {
        this.DisposalMethod = DisposalMethod;
    }

    /**
     * Get 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpLog 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpLog 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 当前该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get User Agent，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ua User Agent，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * Set User Agent，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ua User Agent，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * Get 请求方法，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestMethod 请求方法，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set 请求方法，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestMethod 请求方法，仅自定义规则日志中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get 规则信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDetailList 规则信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecRuleRelatedInfo [] getRuleDetailList() {
        return this.RuleDetailList;
    }

    /**
     * Set 规则信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDetailList 规则信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDetailList(SecRuleRelatedInfo [] RuleDetailList) {
        this.RuleDetailList = RuleDetailList;
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
        if (source.Ua != null) {
            this.Ua = new String(source.Ua);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.RuleDetailList != null) {
            this.RuleDetailList = new SecRuleRelatedInfo[source.RuleDetailList.length];
            for (int i = 0; i < source.RuleDetailList.length; i++) {
                this.RuleDetailList[i] = new SecRuleRelatedInfo(source.RuleDetailList[i]);
            }
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
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamArrayObj(map, prefix + "RuleDetailList.", this.RuleDetailList);

    }
}

