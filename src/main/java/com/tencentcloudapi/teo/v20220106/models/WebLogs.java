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

public class WebLogs extends AbstractModel{

    /**
    * 攻击内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * 攻击IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * 攻击类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msuuid")
    @Expose
    private String Msuuid;

    /**
    * 请求方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * 请求URI
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

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
    * user agent
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * 攻击时间，为保持统一，原参数time更名为AttackTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
     * Get 攻击内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackContent 攻击内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set 攻击内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackContent 攻击内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get 攻击IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackIp 攻击IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackIp() {
        return this.AttackIp;
    }

    /**
     * Set 攻击IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackIp 攻击IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackIp(String AttackIp) {
        this.AttackIp = AttackIp;
    }

    /**
     * Get 攻击类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackType 攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackType 攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msuuid uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsuuid() {
        return this.Msuuid;
    }

    /**
     * Set uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msuuid uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsuuid(String Msuuid) {
        this.Msuuid = Msuuid;
    }

    /**
     * Get 请求方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestMethod 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestMethod 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get 请求URI
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestUri 请求URI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set 请求URI
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestUri 请求URI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
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

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get user agent
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ua user agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * Set user agent
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ua user agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * Get 攻击时间，为保持统一，原参数time更名为AttackTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackTime 攻击时间，为保持统一，原参数time更名为AttackTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击时间，为保持统一，原参数time更名为AttackTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackTime 攻击时间，为保持统一，原参数time更名为AttackTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    public WebLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebLogs(WebLogs source) {
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Msuuid != null) {
            this.Msuuid = new String(source.Msuuid);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
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
        if (source.Ua != null) {
            this.Ua = new String(source.Ua);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Msuuid", this.Msuuid);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DisposalMethod", this.DisposalMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

