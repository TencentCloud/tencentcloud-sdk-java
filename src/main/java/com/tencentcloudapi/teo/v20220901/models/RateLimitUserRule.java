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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitUserRule extends AbstractModel {

    /**
    * 速率限制统计阈值，单位是次，取值范围0-4294967294。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 处置动作，取值有： <li>monitor：观察；</li> <li>drop：拦截；</li><li> redirect：重定向；</li><li> page：指定页面；</li><li>alg：JavaScript 挑战。</li>	
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 惩罚时长，0-2天。
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认 on 生效。
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 规则详情。
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * 规则权重，取值范围0-100。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * 规则 Id。仅出参使用。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 过滤词，取值有：
<li>sip：客户端 ip。</li>
默认为空字符串。
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * 更新时间。仅出参使用。修改时默认为当前时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 统计范围。取值有：
<li>source_to_eo：（响应）源站到  EdgeOne；</li>
<li>client_to_eo：（请求）客户端到  EdgeOne。</li>
默认为 source_to_eo。
    */
    @SerializedName("FreqScope")
    @Expose
    private String [] FreqScope;

    /**
    * 自定义返回页面的名称。Action 是 page 时必填，且不能为空。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Action 是 page 时必填，且不能为空。	
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
    * 自定义返回页面的响应码。Action 是 page 时必填，且不能为空，取值: 100~600，不支持 3xx 响应码。默认值：567。
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
    * 重定向时候的地址。Action 是 redirect 时必填，且不能为空。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get 速率限制统计阈值，单位是次，取值范围0-4294967294。 
     * @return Threshold 速率限制统计阈值，单位是次，取值范围0-4294967294。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 速率限制统计阈值，单位是次，取值范围0-4294967294。
     * @param Threshold 速率限制统计阈值，单位是次，取值范围0-4294967294。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。 
     * @return Period 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     * @param Period 速率限制统计时间，取值范围 10/20/30/40/50/60 单位是秒。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。 
     * @return RuleName 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     * @param RuleName 规则名，只能以英文字符，数字，下划线组合，且不能以下划线开头。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 处置动作，取值有： <li>monitor：观察；</li> <li>drop：拦截；</li><li> redirect：重定向；</li><li> page：指定页面；</li><li>alg：JavaScript 挑战。</li>	 
     * @return Action 处置动作，取值有： <li>monitor：观察；</li> <li>drop：拦截；</li><li> redirect：重定向；</li><li> page：指定页面；</li><li>alg：JavaScript 挑战。</li>	
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作，取值有： <li>monitor：观察；</li> <li>drop：拦截；</li><li> redirect：重定向；</li><li> page：指定页面；</li><li>alg：JavaScript 挑战。</li>	
     * @param Action 处置动作，取值有： <li>monitor：观察；</li> <li>drop：拦截；</li><li> redirect：重定向；</li><li> page：指定页面；</li><li>alg：JavaScript 挑战。</li>	
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 惩罚时长，0-2天。 
     * @return PunishTime 惩罚时长，0-2天。
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set 惩罚时长，0-2天。
     * @param PunishTime 惩罚时长，0-2天。
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li> 
     * @return PunishTimeUnit 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     * @param PunishTimeUnit 处罚时长单位，取值有：
<li>second：秒；</li>
<li>minutes：分钟；</li>
<li>hour：小时。</li>
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认 on 生效。 
     * @return RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认 on 生效。
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认 on 生效。
     * @param RuleStatus 规则状态，取值有：
<li>on：生效；</li>
<li>off：不生效。</li>默认 on 生效。
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 规则详情。 
     * @return AclConditions 规则详情。
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set 规则详情。
     * @param AclConditions 规则详情。
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get 规则权重，取值范围0-100。 
     * @return RulePriority 规则权重，取值范围0-100。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 规则权重，取值范围0-100。
     * @param RulePriority 规则权重，取值范围0-100。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get 规则 Id。仅出参使用。 
     * @return RuleID 规则 Id。仅出参使用。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则 Id。仅出参使用。
     * @param RuleID 规则 Id。仅出参使用。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 过滤词，取值有：
<li>sip：客户端 ip。</li>
默认为空字符串。 
     * @return FreqFields 过滤词，取值有：
<li>sip：客户端 ip。</li>
默认为空字符串。
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set 过滤词，取值有：
<li>sip：客户端 ip。</li>
默认为空字符串。
     * @param FreqFields 过滤词，取值有：
<li>sip：客户端 ip。</li>
默认为空字符串。
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
    }

    /**
     * Get 更新时间。仅出参使用。修改时默认为当前时间。 
     * @return UpdateTime 更新时间。仅出参使用。修改时默认为当前时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。仅出参使用。修改时默认为当前时间。
     * @param UpdateTime 更新时间。仅出参使用。修改时默认为当前时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 统计范围。取值有：
<li>source_to_eo：（响应）源站到  EdgeOne；</li>
<li>client_to_eo：（请求）客户端到  EdgeOne。</li>
默认为 source_to_eo。 
     * @return FreqScope 统计范围。取值有：
<li>source_to_eo：（响应）源站到  EdgeOne；</li>
<li>client_to_eo：（请求）客户端到  EdgeOne。</li>
默认为 source_to_eo。
     */
    public String [] getFreqScope() {
        return this.FreqScope;
    }

    /**
     * Set 统计范围。取值有：
<li>source_to_eo：（响应）源站到  EdgeOne；</li>
<li>client_to_eo：（请求）客户端到  EdgeOne。</li>
默认为 source_to_eo。
     * @param FreqScope 统计范围。取值有：
<li>source_to_eo：（响应）源站到  EdgeOne；</li>
<li>client_to_eo：（请求）客户端到  EdgeOne。</li>
默认为 source_to_eo。
     */
    public void setFreqScope(String [] FreqScope) {
        this.FreqScope = FreqScope;
    }

    /**
     * Get 自定义返回页面的名称。Action 是 page 时必填，且不能为空。 
     * @return Name 自定义返回页面的名称。Action 是 page 时必填，且不能为空。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义返回页面的名称。Action 是 page 时必填，且不能为空。
     * @param Name 自定义返回页面的名称。Action 是 page 时必填，且不能为空。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Action 是 page 时必填，且不能为空。	 
     * @return CustomResponseId 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Action 是 page 时必填，且不能为空。	
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Action 是 page 时必填，且不能为空。	
     * @param CustomResponseId 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Action 是 page 时必填，且不能为空。	
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    /**
     * Get 自定义返回页面的响应码。Action 是 page 时必填，且不能为空，取值: 100~600，不支持 3xx 响应码。默认值：567。 
     * @return ResponseCode 自定义返回页面的响应码。Action 是 page 时必填，且不能为空，取值: 100~600，不支持 3xx 响应码。默认值：567。
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set 自定义返回页面的响应码。Action 是 page 时必填，且不能为空，取值: 100~600，不支持 3xx 响应码。默认值：567。
     * @param ResponseCode 自定义返回页面的响应码。Action 是 page 时必填，且不能为空，取值: 100~600，不支持 3xx 响应码。默认值：567。
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get 重定向时候的地址。Action 是 redirect 时必填，且不能为空。 
     * @return RedirectUrl 重定向时候的地址。Action 是 redirect 时必填，且不能为空。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 重定向时候的地址。Action 是 redirect 时必填，且不能为空。
     * @param RedirectUrl 重定向时候的地址。Action 是 redirect 时必填，且不能为空。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    public RateLimitUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitUserRule(RateLimitUserRule source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.AclConditions != null) {
            this.AclConditions = new AclCondition[source.AclConditions.length];
            for (int i = 0; i < source.AclConditions.length; i++) {
                this.AclConditions[i] = new AclCondition(source.AclConditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.FreqFields != null) {
            this.FreqFields = new String[source.FreqFields.length];
            for (int i = 0; i < source.FreqFields.length; i++) {
                this.FreqFields[i] = new String(source.FreqFields[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FreqScope != null) {
            this.FreqScope = new String[source.FreqScope.length];
            for (int i = 0; i < source.FreqScope.length; i++) {
                this.FreqScope[i] = new String(source.FreqScope[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CustomResponseId != null) {
            this.CustomResponseId = new String(source.CustomResponseId);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "FreqScope.", this.FreqScope);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

