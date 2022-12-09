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

public class SecHitRuleInfo extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则类型名称。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 命中时间，采用unix秒级时间戳。
    */
    @SerializedName("HitTime")
    @Expose
    private Long HitTime;

    /**
    * 请求数。
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 子域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Bot标签，取值有:
<li>evil_bot：恶意Bot；</li>
<li>suspect_bot：疑似Bot；</li>
<li>good_bot：正常Bot；</li>
<li>normal：正常请求；</li>
<li>none：未分类。</li>
    */
    @SerializedName("BotLabel")
    @Expose
    private String BotLabel;

    /**
    * 规则是否启用。
    */
    @SerializedName("RuleEnabled")
    @Expose
    private Boolean RuleEnabled;

    /**
    * 规则是否启用监控告警。
    */
    @SerializedName("AlarmEnabled")
    @Expose
    private Boolean AlarmEnabled;

    /**
    * 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
    */
    @SerializedName("RuleDeleted")
    @Expose
    private Boolean RuleDeleted;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则类型名称。 
     * @return RuleTypeName 规则类型名称。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名称。
     * @param RuleTypeName 规则类型名称。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 命中时间，采用unix秒级时间戳。 
     * @return HitTime 命中时间，采用unix秒级时间戳。
     */
    public Long getHitTime() {
        return this.HitTime;
    }

    /**
     * Set 命中时间，采用unix秒级时间戳。
     * @param HitTime 命中时间，采用unix秒级时间戳。
     */
    public void setHitTime(Long HitTime) {
        this.HitTime = HitTime;
    }

    /**
     * Get 请求数。 
     * @return RequestNum 请求数。
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set 请求数。
     * @param RequestNum 请求数。
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 子域名。 
     * @return Domain 子域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 子域名。
     * @param Domain 子域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li> 
     * @return Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     * @param Action 执行动作（处置方式），取值有：
<li>trans ：通过 ；</li>
<li>alg ：算法挑战 ；</li>
<li>drop ：丢弃 ；</li>
<li>ban ：封禁源ip ；</li>
<li>redirect ：重定向 ；</li>
<li>page ：返回指定页面 ；</li>
<li>monitor ：观察 。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Bot标签，取值有:
<li>evil_bot：恶意Bot；</li>
<li>suspect_bot：疑似Bot；</li>
<li>good_bot：正常Bot；</li>
<li>normal：正常请求；</li>
<li>none：未分类。</li> 
     * @return BotLabel Bot标签，取值有:
<li>evil_bot：恶意Bot；</li>
<li>suspect_bot：疑似Bot；</li>
<li>good_bot：正常Bot；</li>
<li>normal：正常请求；</li>
<li>none：未分类。</li>
     */
    public String getBotLabel() {
        return this.BotLabel;
    }

    /**
     * Set Bot标签，取值有:
<li>evil_bot：恶意Bot；</li>
<li>suspect_bot：疑似Bot；</li>
<li>good_bot：正常Bot；</li>
<li>normal：正常请求；</li>
<li>none：未分类。</li>
     * @param BotLabel Bot标签，取值有:
<li>evil_bot：恶意Bot；</li>
<li>suspect_bot：疑似Bot；</li>
<li>good_bot：正常Bot；</li>
<li>normal：正常请求；</li>
<li>none：未分类。</li>
     */
    public void setBotLabel(String BotLabel) {
        this.BotLabel = BotLabel;
    }

    /**
     * Get 规则是否启用。 
     * @return RuleEnabled 规则是否启用。
     */
    public Boolean getRuleEnabled() {
        return this.RuleEnabled;
    }

    /**
     * Set 规则是否启用。
     * @param RuleEnabled 规则是否启用。
     */
    public void setRuleEnabled(Boolean RuleEnabled) {
        this.RuleEnabled = RuleEnabled;
    }

    /**
     * Get 规则是否启用监控告警。 
     * @return AlarmEnabled 规则是否启用监控告警。
     */
    public Boolean getAlarmEnabled() {
        return this.AlarmEnabled;
    }

    /**
     * Set 规则是否启用监控告警。
     * @param AlarmEnabled 规则是否启用监控告警。
     */
    public void setAlarmEnabled(Boolean AlarmEnabled) {
        this.AlarmEnabled = AlarmEnabled;
    }

    /**
     * Get 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li> 
     * @return RuleDeleted 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     */
    public Boolean getRuleDeleted() {
        return this.RuleDeleted;
    }

    /**
     * Set 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     * @param RuleDeleted 规则是否存在，取值有：
<li>true: 规则不存在；</li>
<li>false: 规则存在。</li>
     */
    public void setRuleDeleted(Boolean RuleDeleted) {
        this.RuleDeleted = RuleDeleted;
    }

    public SecHitRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecHitRuleInfo(SecHitRuleInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.HitTime != null) {
            this.HitTime = new Long(source.HitTime);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.BotLabel != null) {
            this.BotLabel = new String(source.BotLabel);
        }
        if (source.RuleEnabled != null) {
            this.RuleEnabled = new Boolean(source.RuleEnabled);
        }
        if (source.AlarmEnabled != null) {
            this.AlarmEnabled = new Boolean(source.AlarmEnabled);
        }
        if (source.RuleDeleted != null) {
            this.RuleDeleted = new Boolean(source.RuleDeleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "HitTime", this.HitTime);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "BotLabel", this.BotLabel);
        this.setParamSimple(map, prefix + "RuleEnabled", this.RuleEnabled);
        this.setParamSimple(map, prefix + "AlarmEnabled", this.AlarmEnabled);
        this.setParamSimple(map, prefix + "RuleDeleted", this.RuleDeleted);

    }
}

