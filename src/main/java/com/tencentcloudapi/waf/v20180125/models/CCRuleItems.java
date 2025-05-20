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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRuleItems extends AbstractModel {

    /**
    * 名字
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
    * 模式
    */
    @SerializedName("Advance")
    @Expose
    private Long Advance;

    /**
    * 限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 范围
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 网址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 匹配类型
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，24表示JS校验
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 有效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * 版本
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 规则详情
    */
    @SerializedName("Options")
    @Expose
    private String Options;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 关联的Session规则
    */
    @SerializedName("SessionApplied")
    @Expose
    private Long [] SessionApplied;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

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
    * 逻辑操作符
    */
    @SerializedName("LogicalOp")
    @Expose
    private String LogicalOp;

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
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
     * Get 模式 
     * @return Advance 模式
     */
    public Long getAdvance() {
        return this.Advance;
    }

    /**
     * Set 模式
     * @param Advance 模式
     */
    public void setAdvance(Long Advance) {
        this.Advance = Advance;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 范围 
     * @return Interval 范围
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 范围
     * @param Interval 范围
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 网址 
     * @return Url 网址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 网址
     * @param Url 网址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 匹配类型 
     * @return MatchFunc 匹配类型
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set 匹配类型
     * @param MatchFunc 匹配类型
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
    }

    /**
     * Get 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，24表示JS校验 
     * @return ActionType 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，24表示JS校验
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，24表示JS校验
     * @param ActionType 动作，20表示观察，21表示人机识别，22表示拦截，23表示精准拦截，24表示JS校验
     */
    public void setActionType(Long ActionType) {
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
     * Get 有效时间 
     * @return ValidTime 有效时间
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 有效时间
     * @param ValidTime 有效时间
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 版本 
     * @return TsVersion 版本
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 版本
     * @param TsVersion 版本
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 规则详情 
     * @return Options 规则详情
     */
    public String getOptions() {
        return this.Options;
    }

    /**
     * Set 规则详情
     * @param Options 规则详情
     */
    public void setOptions(String Options) {
        this.Options = Options;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 关联的Session规则 
     * @return SessionApplied 关联的Session规则
     */
    public Long [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set 关联的Session规则
     * @param SessionApplied 关联的Session规则
     */
    public void setSessionApplied(Long [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 逻辑操作符 
     * @return LogicalOp 逻辑操作符
     */
    public String getLogicalOp() {
        return this.LogicalOp;
    }

    /**
     * Set 逻辑操作符
     * @param LogicalOp 逻辑操作符
     */
    public void setLogicalOp(String LogicalOp) {
        this.LogicalOp = LogicalOp;
    }

    public CCRuleItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleItems(CCRuleItems source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Advance != null) {
            this.Advance = new Long(source.Advance);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.Options != null) {
            this.Options = new String(source.Options);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MatchFunc", this.MatchFunc);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "Options", this.Options);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LimitMethod", this.LimitMethod);
        this.setParamSimple(map, prefix + "CelRule", this.CelRule);
        this.setParamSimple(map, prefix + "LogicalOp", this.LogicalOp);

    }
}

