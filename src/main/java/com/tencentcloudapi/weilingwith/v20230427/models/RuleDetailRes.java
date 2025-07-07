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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleDetailRes extends AbstractModel {

    /**
    * 联动id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 联动名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 联动说明
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 1 全天有效，0：固定时间段有效
    */
    @SerializedName("ValidType")
    @Expose
    private Long ValidType;

    /**
    * 有效期，json字符串（全天有效时为空）
    */
    @SerializedName("ValidPeriod")
    @Expose
    private String ValidPeriod;

    /**
    * 起始时间
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 启用状态。1-启用，0-停用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 触发规则，事件的组合
    */
    @SerializedName("EventRule")
    @Expose
    private String EventRule;

    /**
    * 事件对象集合
    */
    @SerializedName("EventInfoSet")
    @Expose
    private EventObj [] EventInfoSet;

    /**
    * 动作对象集合
    */
    @SerializedName("ActionInfoSet")
    @Expose
    private ActionObj [] ActionInfoSet;

    /**
     * Get 联动id 
     * @return RuleId 联动id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 联动id
     * @param RuleId 联动id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 联动名称 
     * @return RuleName 联动名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 联动名称
     * @param RuleName 联动名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 联动说明 
     * @return RuleDesc 联动说明
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 联动说明
     * @param RuleDesc 联动说明
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 1 全天有效，0：固定时间段有效 
     * @return ValidType 1 全天有效，0：固定时间段有效
     */
    public Long getValidType() {
        return this.ValidType;
    }

    /**
     * Set 1 全天有效，0：固定时间段有效
     * @param ValidType 1 全天有效，0：固定时间段有效
     */
    public void setValidType(Long ValidType) {
        this.ValidType = ValidType;
    }

    /**
     * Get 有效期，json字符串（全天有效时为空） 
     * @return ValidPeriod 有效期，json字符串（全天有效时为空）
     */
    public String getValidPeriod() {
        return this.ValidPeriod;
    }

    /**
     * Set 有效期，json字符串（全天有效时为空）
     * @param ValidPeriod 有效期，json字符串（全天有效时为空）
     */
    public void setValidPeriod(String ValidPeriod) {
        this.ValidPeriod = ValidPeriod;
    }

    /**
     * Get 起始时间 
     * @return BeginDate 起始时间
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 起始时间
     * @param BeginDate 起始时间
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 结束时间 
     * @return EndDate 结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间
     * @param EndDate 结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 启用状态。1-启用，0-停用 
     * @return Status 启用状态。1-启用，0-停用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态。1-启用，0-停用
     * @param Status 启用状态。1-启用，0-停用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 触发规则，事件的组合 
     * @return EventRule 触发规则，事件的组合
     */
    public String getEventRule() {
        return this.EventRule;
    }

    /**
     * Set 触发规则，事件的组合
     * @param EventRule 触发规则，事件的组合
     */
    public void setEventRule(String EventRule) {
        this.EventRule = EventRule;
    }

    /**
     * Get 事件对象集合 
     * @return EventInfoSet 事件对象集合
     */
    public EventObj [] getEventInfoSet() {
        return this.EventInfoSet;
    }

    /**
     * Set 事件对象集合
     * @param EventInfoSet 事件对象集合
     */
    public void setEventInfoSet(EventObj [] EventInfoSet) {
        this.EventInfoSet = EventInfoSet;
    }

    /**
     * Get 动作对象集合 
     * @return ActionInfoSet 动作对象集合
     */
    public ActionObj [] getActionInfoSet() {
        return this.ActionInfoSet;
    }

    /**
     * Set 动作对象集合
     * @param ActionInfoSet 动作对象集合
     */
    public void setActionInfoSet(ActionObj [] ActionInfoSet) {
        this.ActionInfoSet = ActionInfoSet;
    }

    public RuleDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDetailRes(RuleDetailRes source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.ValidType != null) {
            this.ValidType = new Long(source.ValidType);
        }
        if (source.ValidPeriod != null) {
            this.ValidPeriod = new String(source.ValidPeriod);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EventRule != null) {
            this.EventRule = new String(source.EventRule);
        }
        if (source.EventInfoSet != null) {
            this.EventInfoSet = new EventObj[source.EventInfoSet.length];
            for (int i = 0; i < source.EventInfoSet.length; i++) {
                this.EventInfoSet[i] = new EventObj(source.EventInfoSet[i]);
            }
        }
        if (source.ActionInfoSet != null) {
            this.ActionInfoSet = new ActionObj[source.ActionInfoSet.length];
            for (int i = 0; i < source.ActionInfoSet.length; i++) {
                this.ActionInfoSet[i] = new ActionObj(source.ActionInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "ValidType", this.ValidType);
        this.setParamSimple(map, prefix + "ValidPeriod", this.ValidPeriod);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventRule", this.EventRule);
        this.setParamArrayObj(map, prefix + "EventInfoSet.", this.EventInfoSet);
        this.setParamArrayObj(map, prefix + "ActionInfoSet.", this.ActionInfoSet);

    }
}

