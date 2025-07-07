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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmPolicyRequest extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
    * 开启策略
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private InstanceID [] InstanceIds;

    /**
    * User-动态关联该用户所有实例
Instance-关联实例列表的实例
    */
    @SerializedName("NewProfileLevel")
    @Expose
    private String NewProfileLevel;

    /**
    * 新策略名
    */
    @SerializedName("NewProfileName")
    @Expose
    private String NewProfileName;

    /**
    * 旧策略名
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * 策略类型
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 规则类型 0-快速，1-自定义 若值为0，则QuickRule不能为空，若值为1，则Rules 不能为空
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 接受模板
    */
    @SerializedName("TemplateInfo")
    @Expose
    private TemplateInfo [] TemplateInfo;

    /**
    * 快速规则  支持包括fatal-致命, critical-严重,
warning-告警,
information-通知
    */
    @SerializedName("QuickRule")
    @Expose
    private String QuickRule;

    /**
    * 自定义规则
    */
    @SerializedName("Rules")
    @Expose
    private AlarmsRules [] Rules;

    /**
     * Get 类型 
     * @return ApplyType 类型
     */
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 类型
     * @param ApplyType 类型
     */
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get 开启策略 
     * @return Enable 开启策略
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 开启策略
     * @param Enable 开启策略
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 列表 
     * @return InstanceIds 列表
     */
    public InstanceID [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 列表
     * @param InstanceIds 列表
     */
    public void setInstanceIds(InstanceID [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get User-动态关联该用户所有实例
Instance-关联实例列表的实例 
     * @return NewProfileLevel User-动态关联该用户所有实例
Instance-关联实例列表的实例
     */
    public String getNewProfileLevel() {
        return this.NewProfileLevel;
    }

    /**
     * Set User-动态关联该用户所有实例
Instance-关联实例列表的实例
     * @param NewProfileLevel User-动态关联该用户所有实例
Instance-关联实例列表的实例
     */
    public void setNewProfileLevel(String NewProfileLevel) {
        this.NewProfileLevel = NewProfileLevel;
    }

    /**
     * Get 新策略名 
     * @return NewProfileName 新策略名
     */
    public String getNewProfileName() {
        return this.NewProfileName;
    }

    /**
     * Set 新策略名
     * @param NewProfileName 新策略名
     */
    public void setNewProfileName(String NewProfileName) {
        this.NewProfileName = NewProfileName;
    }

    /**
     * Get 旧策略名 
     * @return ProfileName 旧策略名
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set 旧策略名
     * @param ProfileName 旧策略名
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get 策略类型 
     * @return ProfileType 策略类型
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set 策略类型
     * @param ProfileType 策略类型
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 规则类型 0-快速，1-自定义 若值为0，则QuickRule不能为空，若值为1，则Rules 不能为空 
     * @return RuleType 规则类型 0-快速，1-自定义 若值为0，则QuickRule不能为空，若值为1，则Rules 不能为空
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型 0-快速，1-自定义 若值为0，则QuickRule不能为空，若值为1，则Rules 不能为空
     * @param RuleType 规则类型 0-快速，1-自定义 若值为0，则QuickRule不能为空，若值为1，则Rules 不能为空
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 接受模板 
     * @return TemplateInfo 接受模板
     */
    public TemplateInfo [] getTemplateInfo() {
        return this.TemplateInfo;
    }

    /**
     * Set 接受模板
     * @param TemplateInfo 接受模板
     */
    public void setTemplateInfo(TemplateInfo [] TemplateInfo) {
        this.TemplateInfo = TemplateInfo;
    }

    /**
     * Get 快速规则  支持包括fatal-致命, critical-严重,
warning-告警,
information-通知 
     * @return QuickRule 快速规则  支持包括fatal-致命, critical-严重,
warning-告警,
information-通知
     */
    public String getQuickRule() {
        return this.QuickRule;
    }

    /**
     * Set 快速规则  支持包括fatal-致命, critical-严重,
warning-告警,
information-通知
     * @param QuickRule 快速规则  支持包括fatal-致命, critical-严重,
warning-告警,
information-通知
     */
    public void setQuickRule(String QuickRule) {
        this.QuickRule = QuickRule;
    }

    /**
     * Get 自定义规则 
     * @return Rules 自定义规则
     */
    public AlarmsRules [] getRules() {
        return this.Rules;
    }

    /**
     * Set 自定义规则
     * @param Rules 自定义规则
     */
    public void setRules(AlarmsRules [] Rules) {
        this.Rules = Rules;
    }

    public ModifyAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyRequest(ModifyAlarmPolicyRequest source) {
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new InstanceID[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new InstanceID(source.InstanceIds[i]);
            }
        }
        if (source.NewProfileLevel != null) {
            this.NewProfileLevel = new String(source.NewProfileLevel);
        }
        if (source.NewProfileName != null) {
            this.NewProfileName = new String(source.NewProfileName);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.TemplateInfo != null) {
            this.TemplateInfo = new TemplateInfo[source.TemplateInfo.length];
            for (int i = 0; i < source.TemplateInfo.length; i++) {
                this.TemplateInfo[i] = new TemplateInfo(source.TemplateInfo[i]);
            }
        }
        if (source.QuickRule != null) {
            this.QuickRule = new String(source.QuickRule);
        }
        if (source.Rules != null) {
            this.Rules = new AlarmsRules[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AlarmsRules(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "NewProfileLevel", this.NewProfileLevel);
        this.setParamSimple(map, prefix + "NewProfileName", this.NewProfileName);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArrayObj(map, prefix + "TemplateInfo.", this.TemplateInfo);
        this.setParamSimple(map, prefix + "QuickRule", this.QuickRule);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

