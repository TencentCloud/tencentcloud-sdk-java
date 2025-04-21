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

public class BotSceneActionRule extends AbstractModel {

    /**
    * 动作策略ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 动作策略名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 策略优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 策略生效状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 分数范围
    */
    @SerializedName("Score")
    @Expose
    private BotScoreRuleEntry [] Score;

    /**
    * 100-宽松、200-中等、300-严格、0-自定义
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 生效范围，为空表示全部范围
    */
    @SerializedName("Scope")
    @Expose
    private BotActionScopeRuleEntry [] Scope;

    /**
    * default：默认创建 custom：自定义创建
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 匹配范围类型：全局匹配 or 自定义匹配范围
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * 匹配条件间的与或关系
    */
    @SerializedName("ActionMatchType")
    @Expose
    private String ActionMatchType;

    /**
     * Get 动作策略ID 
     * @return RuleId 动作策略ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 动作策略ID
     * @param RuleId 动作策略ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 动作策略名称 
     * @return RuleName 动作策略名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 动作策略名称
     * @param RuleName 动作策略名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 策略优先级 
     * @return Priority 策略优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级
     * @param Priority 策略优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 策略生效状态 
     * @return Status 策略生效状态
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 策略生效状态
     * @param Status 策略生效状态
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 分数范围 
     * @return Score 分数范围
     */
    public BotScoreRuleEntry [] getScore() {
        return this.Score;
    }

    /**
     * Set 分数范围
     * @param Score 分数范围
     */
    public void setScore(BotScoreRuleEntry [] Score) {
        this.Score = Score;
    }

    /**
     * Get 100-宽松、200-中等、300-严格、0-自定义 
     * @return Level 100-宽松、200-中等、300-严格、0-自定义
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 100-宽松、200-中等、300-严格、0-自定义
     * @param Level 100-宽松、200-中等、300-严格、0-自定义
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 生效范围，为空表示全部范围 
     * @return Scope 生效范围，为空表示全部范围
     */
    public BotActionScopeRuleEntry [] getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围，为空表示全部范围
     * @param Scope 生效范围，为空表示全部范围
     */
    public void setScope(BotActionScopeRuleEntry [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get default：默认创建 custom：自定义创建 
     * @return Type default：默认创建 custom：自定义创建
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set default：默认创建 custom：自定义创建
     * @param Type default：默认创建 custom：自定义创建
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 匹配范围类型：全局匹配 or 自定义匹配范围 
     * @return ScopeType 匹配范围类型：全局匹配 or 自定义匹配范围
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set 匹配范围类型：全局匹配 or 自定义匹配范围
     * @param ScopeType 匹配范围类型：全局匹配 or 自定义匹配范围
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get 匹配条件间的与或关系 
     * @return ActionMatchType 匹配条件间的与或关系
     */
    public String getActionMatchType() {
        return this.ActionMatchType;
    }

    /**
     * Set 匹配条件间的与或关系
     * @param ActionMatchType 匹配条件间的与或关系
     */
    public void setActionMatchType(String ActionMatchType) {
        this.ActionMatchType = ActionMatchType;
    }

    public BotSceneActionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotSceneActionRule(BotSceneActionRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Score != null) {
            this.Score = new BotScoreRuleEntry[source.Score.length];
            for (int i = 0; i < source.Score.length; i++) {
                this.Score[i] = new BotScoreRuleEntry(source.Score[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Scope != null) {
            this.Scope = new BotActionScopeRuleEntry[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new BotActionScopeRuleEntry(source.Scope[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.ActionMatchType != null) {
            this.ActionMatchType = new String(source.ActionMatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Score.", this.Score);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArrayObj(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "ActionMatchType", this.ActionMatchType);

    }
}

