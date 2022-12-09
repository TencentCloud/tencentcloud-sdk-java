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

public class WebLogs extends AbstractModel{

    /**
    * 请求（事件）ID。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 攻击源（客户端）Ip。
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * 受攻击子域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * http 日志内容。
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * 攻击时间，采用unix秒级时间戳。
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * 请求地址。
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * 规则相关信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDetailList")
    @Expose
    private SecRuleRelatedInfo [] RuleDetailList;

    /**
    * 请求类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqMethod")
    @Expose
    private String ReqMethod;

    /**
    * 日志所属区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * Get 攻击源（客户端）Ip。 
     * @return AttackIp 攻击源（客户端）Ip。
     */
    public String getAttackIp() {
        return this.AttackIp;
    }

    /**
     * Set 攻击源（客户端）Ip。
     * @param AttackIp 攻击源（客户端）Ip。
     */
    public void setAttackIp(String AttackIp) {
        this.AttackIp = AttackIp;
    }

    /**
     * Get 受攻击子域名。 
     * @return Domain 受攻击子域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 受攻击子域名。
     * @param Domain 受攻击子域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get http 日志内容。 
     * @return HttpLog http 日志内容。
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set http 日志内容。
     * @param HttpLog http 日志内容。
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json) 
     * @return SipCountryCode IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)
     */
    public String getSipCountryCode() {
        return this.SipCountryCode;
    }

    /**
     * Set IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)
     * @param SipCountryCode IP所在国家iso-3166中alpha-2编码，编码信息请参考[ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json)
     */
    public void setSipCountryCode(String SipCountryCode) {
        this.SipCountryCode = SipCountryCode;
    }

    /**
     * Get 攻击时间，采用unix秒级时间戳。 
     * @return AttackTime 攻击时间，采用unix秒级时间戳。
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击时间，采用unix秒级时间戳。
     * @param AttackTime 攻击时间，采用unix秒级时间戳。
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Get 请求地址。 
     * @return RequestUri 请求地址。
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set 请求地址。
     * @param RequestUri 请求地址。
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackContent 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackContent 攻击内容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get 规则相关信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDetailList 规则相关信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecRuleRelatedInfo [] getRuleDetailList() {
        return this.RuleDetailList;
    }

    /**
     * Set 规则相关信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDetailList 规则相关信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDetailList(SecRuleRelatedInfo [] RuleDetailList) {
        this.RuleDetailList = RuleDetailList;
    }

    /**
     * Get 请求类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqMethod 请求类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqMethod() {
        return this.ReqMethod;
    }

    /**
     * Set 请求类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqMethod 请求类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqMethod(String ReqMethod) {
        this.ReqMethod = ReqMethod;
    }

    /**
     * Get 日志所属区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 日志所属区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 日志所属区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 日志所属区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public WebLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebLogs(WebLogs source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.SipCountryCode != null) {
            this.SipCountryCode = new String(source.SipCountryCode);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.RuleDetailList != null) {
            this.RuleDetailList = new SecRuleRelatedInfo[source.RuleDetailList.length];
            for (int i = 0; i < source.RuleDetailList.length; i++) {
                this.RuleDetailList[i] = new SecRuleRelatedInfo(source.RuleDetailList[i]);
            }
        }
        if (source.ReqMethod != null) {
            this.ReqMethod = new String(source.ReqMethod);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamArrayObj(map, prefix + "RuleDetailList.", this.RuleDetailList);
        this.setParamSimple(map, prefix + "ReqMethod", this.ReqMethod);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

