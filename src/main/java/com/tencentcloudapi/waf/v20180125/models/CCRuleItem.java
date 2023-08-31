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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRuleItem extends AbstractModel{

    /**
    * 动作
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 高级模式
    */
    @SerializedName("Advance")
    @Expose
    private Long Advance;

    /**
    * 时间周期
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 限制次数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 匹配方法
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 更新时间戳
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 匹配url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 策略动作有效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * 高级参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionsArr")
    @Expose
    private String OptionsArr;

    /**
     * Get 动作 
     * @return ActionType 动作
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作
     * @param ActionType 动作
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 高级模式 
     * @return Advance 高级模式
     */
    public Long getAdvance() {
        return this.Advance;
    }

    /**
     * Set 高级模式
     * @param Advance 高级模式
     */
    public void setAdvance(Long Advance) {
        this.Advance = Advance;
    }

    /**
     * Get 时间周期 
     * @return Interval 时间周期
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间周期
     * @param Interval 时间周期
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 限制次数 
     * @return Limit 限制次数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制次数
     * @param Limit 限制次数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 匹配方法 
     * @return MatchFunc 匹配方法
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set 匹配方法
     * @param MatchFunc 匹配方法
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
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
     * Get 更新时间戳 
     * @return TsVersion 更新时间戳
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 更新时间戳
     * @param TsVersion 更新时间戳
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 匹配url 
     * @return Url 匹配url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 匹配url
     * @param Url 匹配url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 策略动作有效时间 
     * @return ValidTime 策略动作有效时间
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 策略动作有效时间
     * @param ValidTime 策略动作有效时间
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 高级参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionsArr 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOptionsArr() {
        return this.OptionsArr;
    }

    /**
     * Set 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionsArr 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionsArr(String OptionsArr) {
        this.OptionsArr = OptionsArr;
    }

    public CCRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleItem(CCRuleItem source) {
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Advance != null) {
            this.Advance = new Long(source.Advance);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.OptionsArr != null) {
            this.OptionsArr = new String(source.OptionsArr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MatchFunc", this.MatchFunc);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "OptionsArr", this.OptionsArr);

    }
}

