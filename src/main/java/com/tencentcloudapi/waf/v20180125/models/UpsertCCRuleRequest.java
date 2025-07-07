/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpsertCCRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 高级模式（是否使用Session检测），0表示不启用，1表示启用
    */
    @SerializedName("Advance")
    @Expose
    private String Advance;

    /**
    * CC检测阈值
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * CC检测周期
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，26表示精准人机识别，27表示JS校验
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 动作有效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * 检测Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 匹配方法，0表示等于，1表示前缀匹配，2表示包含，3表示不等于，6表示后缀匹配，7表示不包含
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * CC的匹配条件JSON序列化的字符串，示例：[{\"key\":\"Method\",\"args\":[\"=R0VU\"],\"match\":\"0\",\"encodeflag\":true}] Key可选值为 Method、Post、Referer、Cookie、User-Agent、CustomHeader match可选值为，当Key为Method的时候可选值为0（等于）、3（不等于）。 Key为Post的时候可选值为0（等于）、3（不等于），Key为Cookie的时候可选值为0（等于）、2（包含），3（不等于）、7（不包含）、 当Key为Referer的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为Cookie的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为User-Agent的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为CustomHeader的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）。 Key为IPLocation时，可选值为13（属于）、14（不属于）。args用来表示匹配内容，需要设置encodeflag为true，当Key为Post、Cookie、CustomHeader时，用等号=来分别串接Key和Value，并分别用Base64编码，类似YWJj=YWJj。当Key为Referer、User-Agent时，用等号=来串接Value，类似=YWJj。
    */
    @SerializedName("OptionsArr")
    @Expose
    private String OptionsArr;

    /**
    * waf版本，sparta-waf或者clb-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 操作类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 添加规则的来源事件id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 规则需要启用的SessionID
    */
    @SerializedName("SessionApplied")
    @Expose
    private Long [] SessionApplied;

    /**
    * 规则ID，新增时填0
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * url长度
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 限频方式
    */
    @SerializedName("LimitMethod")
    @Expose
    private String LimitMethod;

    /**
    * cel表达式
    */
    @SerializedName("CelRule")
    @Expose
    private String CelRule;

    /**
    * 配置方式的逻辑操作符，and或者or
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 高级模式（是否使用Session检测），0表示不启用，1表示启用 
     * @return Advance 高级模式（是否使用Session检测），0表示不启用，1表示启用
     */
    public String getAdvance() {
        return this.Advance;
    }

    /**
     * Set 高级模式（是否使用Session检测），0表示不启用，1表示启用
     * @param Advance 高级模式（是否使用Session检测），0表示不启用，1表示启用
     */
    public void setAdvance(String Advance) {
        this.Advance = Advance;
    }

    /**
     * Get CC检测阈值 
     * @return Limit CC检测阈值
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set CC检测阈值
     * @param Limit CC检测阈值
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get CC检测周期 
     * @return Interval CC检测周期
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set CC检测周期
     * @param Interval CC检测周期
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，26表示精准人机识别，27表示JS校验 
     * @return ActionType 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，26表示精准人机识别，27表示JS校验
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，26表示精准人机识别，27表示JS校验
     * @param ActionType 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，26表示精准人机识别，27表示JS校验
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 动作有效时间 
     * @return ValidTime 动作有效时间
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 动作有效时间
     * @param ValidTime 动作有效时间
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 检测Url 
     * @return Url 检测Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 检测Url
     * @param Url 检测Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 匹配方法，0表示等于，1表示前缀匹配，2表示包含，3表示不等于，6表示后缀匹配，7表示不包含 
     * @return MatchFunc 匹配方法，0表示等于，1表示前缀匹配，2表示包含，3表示不等于，6表示后缀匹配，7表示不包含
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set 匹配方法，0表示等于，1表示前缀匹配，2表示包含，3表示不等于，6表示后缀匹配，7表示不包含
     * @param MatchFunc 匹配方法，0表示等于，1表示前缀匹配，2表示包含，3表示不等于，6表示后缀匹配，7表示不包含
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
    }

    /**
     * Get CC的匹配条件JSON序列化的字符串，示例：[{\"key\":\"Method\",\"args\":[\"=R0VU\"],\"match\":\"0\",\"encodeflag\":true}] Key可选值为 Method、Post、Referer、Cookie、User-Agent、CustomHeader match可选值为，当Key为Method的时候可选值为0（等于）、3（不等于）。 Key为Post的时候可选值为0（等于）、3（不等于），Key为Cookie的时候可选值为0（等于）、2（包含），3（不等于）、7（不包含）、 当Key为Referer的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为Cookie的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为User-Agent的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为CustomHeader的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）。 Key为IPLocation时，可选值为13（属于）、14（不属于）。args用来表示匹配内容，需要设置encodeflag为true，当Key为Post、Cookie、CustomHeader时，用等号=来分别串接Key和Value，并分别用Base64编码，类似YWJj=YWJj。当Key为Referer、User-Agent时，用等号=来串接Value，类似=YWJj。 
     * @return OptionsArr CC的匹配条件JSON序列化的字符串，示例：[{\"key\":\"Method\",\"args\":[\"=R0VU\"],\"match\":\"0\",\"encodeflag\":true}] Key可选值为 Method、Post、Referer、Cookie、User-Agent、CustomHeader match可选值为，当Key为Method的时候可选值为0（等于）、3（不等于）。 Key为Post的时候可选值为0（等于）、3（不等于），Key为Cookie的时候可选值为0（等于）、2（包含），3（不等于）、7（不包含）、 当Key为Referer的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为Cookie的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为User-Agent的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为CustomHeader的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）。 Key为IPLocation时，可选值为13（属于）、14（不属于）。args用来表示匹配内容，需要设置encodeflag为true，当Key为Post、Cookie、CustomHeader时，用等号=来分别串接Key和Value，并分别用Base64编码，类似YWJj=YWJj。当Key为Referer、User-Agent时，用等号=来串接Value，类似=YWJj。
     */
    public String getOptionsArr() {
        return this.OptionsArr;
    }

    /**
     * Set CC的匹配条件JSON序列化的字符串，示例：[{\"key\":\"Method\",\"args\":[\"=R0VU\"],\"match\":\"0\",\"encodeflag\":true}] Key可选值为 Method、Post、Referer、Cookie、User-Agent、CustomHeader match可选值为，当Key为Method的时候可选值为0（等于）、3（不等于）。 Key为Post的时候可选值为0（等于）、3（不等于），Key为Cookie的时候可选值为0（等于）、2（包含），3（不等于）、7（不包含）、 当Key为Referer的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为Cookie的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为User-Agent的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为CustomHeader的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）。 Key为IPLocation时，可选值为13（属于）、14（不属于）。args用来表示匹配内容，需要设置encodeflag为true，当Key为Post、Cookie、CustomHeader时，用等号=来分别串接Key和Value，并分别用Base64编码，类似YWJj=YWJj。当Key为Referer、User-Agent时，用等号=来串接Value，类似=YWJj。
     * @param OptionsArr CC的匹配条件JSON序列化的字符串，示例：[{\"key\":\"Method\",\"args\":[\"=R0VU\"],\"match\":\"0\",\"encodeflag\":true}] Key可选值为 Method、Post、Referer、Cookie、User-Agent、CustomHeader match可选值为，当Key为Method的时候可选值为0（等于）、3（不等于）。 Key为Post的时候可选值为0（等于）、3（不等于），Key为Cookie的时候可选值为0（等于）、2（包含），3（不等于）、7（不包含）、 当Key为Referer的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为Cookie的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为User-Agent的时候可选值为0（等于）、3（不等于）、1（前缀匹配）、6（后缀匹配）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）， 当Key为CustomHeader的时候可选值为0（等于）、3（不等于）、2（包含）、7（不包含）、12（存在）、5（不存在）、4（内容为空）。 Key为IPLocation时，可选值为13（属于）、14（不属于）。args用来表示匹配内容，需要设置encodeflag为true，当Key为Post、Cookie、CustomHeader时，用等号=来分别串接Key和Value，并分别用Base64编码，类似YWJj=YWJj。当Key为Referer、User-Agent时，用等号=来串接Value，类似=YWJj。
     */
    public void setOptionsArr(String OptionsArr) {
        this.OptionsArr = OptionsArr;
    }

    /**
     * Get waf版本，sparta-waf或者clb-waf 
     * @return Edition waf版本，sparta-waf或者clb-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf版本，sparta-waf或者clb-waf
     * @param Edition waf版本，sparta-waf或者clb-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 操作类型 
     * @return Type 操作类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 操作类型
     * @param Type 操作类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 添加规则的来源事件id 
     * @return EventId 添加规则的来源事件id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 添加规则的来源事件id
     * @param EventId 添加规则的来源事件id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 规则需要启用的SessionID 
     * @return SessionApplied 规则需要启用的SessionID
     */
    public Long [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set 规则需要启用的SessionID
     * @param SessionApplied 规则需要启用的SessionID
     */
    public void setSessionApplied(Long [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get 规则ID，新增时填0 
     * @return RuleId 规则ID，新增时填0
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID，新增时填0
     * @param RuleId 规则ID，新增时填0
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get url长度 
     * @return Length url长度
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set url长度
     * @param Length url长度
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 限频方式 
     * @return LimitMethod 限频方式
     */
    public String getLimitMethod() {
        return this.LimitMethod;
    }

    /**
     * Set 限频方式
     * @param LimitMethod 限频方式
     */
    public void setLimitMethod(String LimitMethod) {
        this.LimitMethod = LimitMethod;
    }

    /**
     * Get cel表达式 
     * @return CelRule cel表达式
     */
    public String getCelRule() {
        return this.CelRule;
    }

    /**
     * Set cel表达式
     * @param CelRule cel表达式
     */
    public void setCelRule(String CelRule) {
        this.CelRule = CelRule;
    }

    /**
     * Get 配置方式的逻辑操作符，and或者or 
     * @return LogicalOp 配置方式的逻辑操作符，and或者or
     */
    public String getLogicalOp() {
        return this.LogicalOp;
    }

    /**
     * Set 配置方式的逻辑操作符，and或者or
     * @param LogicalOp 配置方式的逻辑操作符，and或者or
     */
    public void setLogicalOp(String LogicalOp) {
        this.LogicalOp = LogicalOp;
    }

    public UpsertCCRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertCCRuleRequest(UpsertCCRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Advance != null) {
            this.Advance = new String(source.Advance);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.OptionsArr != null) {
            this.OptionsArr = new String(source.OptionsArr);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.SessionApplied != null) {
            this.SessionApplied = new Long[source.SessionApplied.length];
            for (int i = 0; i < source.SessionApplied.length; i++) {
                this.SessionApplied[i] = new Long(source.SessionApplied[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.LimitMethod != null) {
            this.LimitMethod = new String(source.LimitMethod);
        }
        if (source.CelRule != null) {
            this.CelRule = new String(source.CelRule);
        }
        if (source.LogicalOp != null) {
            this.LogicalOp = new String(source.LogicalOp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MatchFunc", this.MatchFunc);
        this.setParamSimple(map, prefix + "OptionsArr", this.OptionsArr);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "LimitMethod", this.LimitMethod);
        this.setParamSimple(map, prefix + "CelRule", this.CelRule);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);

    }
}

