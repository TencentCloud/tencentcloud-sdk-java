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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlRuleExtSetItem extends AbstractModel {

    /**
    * 用户自定义策略子规则列表。IsDefault=false时有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildRules")
    @Expose
    private AccessControlChildRuleInfo [] ChildRules;

    /**
    * 编辑用户名称
    */
    @SerializedName("EditUserName")
    @Expose
    private String EditUserName;

    /**
    * 策略生效镜像数量
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * true: 默认策略，false:自定义策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 是否为全部镜像规则。true表示对所有镜像生效
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * true: 策略启用，false：策略禁用
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * 规则组中所有执行动作的去重列表。RULE_MODE_ALERT:告警 RULE_MODE_HOLDUP:拦截
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleActions")
    @Expose
    private String [] RuleActions;

    /**
    * 策略Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 策略名字
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 系统策略子规则列表。IsDefault=true时有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemChildRules")
    @Expose
    private AccessControlSystemChildRuleInfo [] SystemChildRules;

    /**
    * 策略更新时间, 存在为空的情况
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 用户自定义策略子规则列表。IsDefault=false时有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildRules 用户自定义策略子规则列表。IsDefault=false时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessControlChildRuleInfo [] getChildRules() {
        return this.ChildRules;
    }

    /**
     * Set 用户自定义策略子规则列表。IsDefault=false时有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildRules 用户自定义策略子规则列表。IsDefault=false时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildRules(AccessControlChildRuleInfo [] ChildRules) {
        this.ChildRules = ChildRules;
    }

    /**
     * Get 编辑用户名称 
     * @return EditUserName 编辑用户名称
     */
    public String getEditUserName() {
        return this.EditUserName;
    }

    /**
     * Set 编辑用户名称
     * @param EditUserName 编辑用户名称
     */
    public void setEditUserName(String EditUserName) {
        this.EditUserName = EditUserName;
    }

    /**
     * Get 策略生效镜像数量 
     * @return EffectImageCount 策略生效镜像数量
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set 策略生效镜像数量
     * @param EffectImageCount 策略生效镜像数量
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get true: 默认策略，false:自定义策略 
     * @return IsDefault true: 默认策略，false:自定义策略
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set true: 默认策略，false:自定义策略
     * @param IsDefault true: 默认策略，false:自定义策略
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否为全部镜像规则。true表示对所有镜像生效 
     * @return IsGlobal 是否为全部镜像规则。true表示对所有镜像生效
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否为全部镜像规则。true表示对所有镜像生效
     * @param IsGlobal 是否为全部镜像规则。true表示对所有镜像生效
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get true: 策略启用，false：策略禁用 
     * @return IsEnable true: 策略启用，false：策略禁用
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set true: 策略启用，false：策略禁用
     * @param IsEnable true: 策略启用，false：策略禁用
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get 规则组中所有执行动作的去重列表。RULE_MODE_ALERT:告警 RULE_MODE_HOLDUP:拦截
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleActions 规则组中所有执行动作的去重列表。RULE_MODE_ALERT:告警 RULE_MODE_HOLDUP:拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set 规则组中所有执行动作的去重列表。RULE_MODE_ALERT:告警 RULE_MODE_HOLDUP:拦截
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleActions 规则组中所有执行动作的去重列表。RULE_MODE_ALERT:告警 RULE_MODE_HOLDUP:拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleActions(String [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get 策略Id 
     * @return RuleId 策略Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略Id
     * @param RuleId 策略Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 策略名字 
     * @return RuleName 策略名字
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 策略名字
     * @param RuleName 策略名字
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 系统策略子规则列表。IsDefault=true时有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemChildRules 系统策略子规则列表。IsDefault=true时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessControlSystemChildRuleInfo [] getSystemChildRules() {
        return this.SystemChildRules;
    }

    /**
     * Set 系统策略子规则列表。IsDefault=true时有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemChildRules 系统策略子规则列表。IsDefault=true时有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemChildRules(AccessControlSystemChildRuleInfo [] SystemChildRules) {
        this.SystemChildRules = SystemChildRules;
    }

    /**
     * Get 策略更新时间, 存在为空的情况 
     * @return UpdateTime 策略更新时间, 存在为空的情况
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 策略更新时间, 存在为空的情况
     * @param UpdateTime 策略更新时间, 存在为空的情况
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AccessControlRuleExtSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlRuleExtSetItem(AccessControlRuleExtSetItem source) {
        if (source.ChildRules != null) {
            this.ChildRules = new AccessControlChildRuleInfo[source.ChildRules.length];
            for (int i = 0; i < source.ChildRules.length; i++) {
                this.ChildRules[i] = new AccessControlChildRuleInfo(source.ChildRules[i]);
            }
        }
        if (source.EditUserName != null) {
            this.EditUserName = new String(source.EditUserName);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new String[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new String(source.RuleActions[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SystemChildRules != null) {
            this.SystemChildRules = new AccessControlSystemChildRuleInfo[source.SystemChildRules.length];
            for (int i = 0; i < source.SystemChildRules.length; i++) {
                this.SystemChildRules[i] = new AccessControlSystemChildRuleInfo(source.SystemChildRules[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ChildRules.", this.ChildRules);
        this.setParamSimple(map, prefix + "EditUserName", this.EditUserName);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamArraySimple(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "SystemChildRules.", this.SystemChildRules);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

