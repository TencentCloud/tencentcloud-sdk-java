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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigRule extends AbstractModel {

    /**
    * 规则标识
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 规则名
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则参数
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * 规则触发条件
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * 规则支持的资源类型，规则仅对指定资源类型的资源生效。
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * 规则所属标签
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 规则风险等级
1:低风险
2:中风险
3:高风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 规则对应的函数
    */
    @SerializedName("ServiceFunction")
    @Expose
    private String ServiceFunction;

    /**
    * 创建时间
格式：YYYY-MM-DD h:i:s
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ACTIVE：启用
NO_ACTIVE：停止
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
无法应用规则： 'NOT_APPLICABLE'
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * ["",""]
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
    * 规则评估时间
格式：YYYY-MM-DD h:i:s

    */
    @SerializedName("ConfigRuleInvokedTime")
    @Expose
    private String ConfigRuleInvokedTime;

    /**
    * 规则ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * CUSTOMIZE：自定义规则、
SYSTEM：托管规则
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * 合规包ID
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * 触发类型
ScheduledNotification：周期触发、
ConfigurationItemChangeNotification：变更触发
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * 参数详情
    */
    @SerializedName("ManageInputParameter")
    @Expose
    private InputParameterForManage [] ManageInputParameter;

    /**
    * 合规包名称
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * 关联地域
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * 关联标签
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    *  规则对指定资源ID无效，即不对该资源执行评估。
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 账号组名称
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * 规则所属用户ID
    */
    @SerializedName("RuleOwnerId")
    @Expose
    private Long RuleOwnerId;

    /**
    * 预设规则支持的触发方式
ScheduledNotification：周期触发
ConfigurationItemChangeNotification：变更触发
    */
    @SerializedName("ManageTriggerType")
    @Expose
    private String [] ManageTriggerType;

    /**
     * Get 规则标识 
     * @return Identifier 规则标识
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则标识
     * @param Identifier 规则标识
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 规则名 
     * @return RuleName 规则名
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名
     * @param RuleName 规则名
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则参数 
     * @return InputParameter 规则参数
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 规则参数
     * @param InputParameter 规则参数
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 规则触发条件 
     * @return SourceCondition 规则触发条件
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set 规则触发条件
     * @param SourceCondition 规则触发条件
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get 规则支持的资源类型，规则仅对指定资源类型的资源生效。 
     * @return ResourceType 规则支持的资源类型，规则仅对指定资源类型的资源生效。
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 规则支持的资源类型，规则仅对指定资源类型的资源生效。
     * @param ResourceType 规则支持的资源类型，规则仅对指定资源类型的资源生效。
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 规则所属标签 
     * @return Labels 规则所属标签
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 规则所属标签
     * @param Labels 规则所属标签
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 规则风险等级
1:低风险
2:中风险
3:高风险 
     * @return RiskLevel 规则风险等级
1:低风险
2:中风险
3:高风险
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 规则风险等级
1:低风险
2:中风险
3:高风险
     * @param RiskLevel 规则风险等级
1:低风险
2:中风险
3:高风险
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则对应的函数 
     * @return ServiceFunction 规则对应的函数
     */
    public String getServiceFunction() {
        return this.ServiceFunction;
    }

    /**
     * Set 规则对应的函数
     * @param ServiceFunction 规则对应的函数
     */
    public void setServiceFunction(String ServiceFunction) {
        this.ServiceFunction = ServiceFunction;
    }

    /**
     * Get 创建时间
格式：YYYY-MM-DD h:i:s 
     * @return CreateTime 创建时间
格式：YYYY-MM-DD h:i:s
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
格式：YYYY-MM-DD h:i:s
     * @param CreateTime 创建时间
格式：YYYY-MM-DD h:i:s
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ACTIVE：启用
NO_ACTIVE：停止 
     * @return Status ACTIVE：启用
NO_ACTIVE：停止
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ACTIVE：启用
NO_ACTIVE：停止
     * @param Status ACTIVE：启用
NO_ACTIVE：停止
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
无法应用规则： 'NOT_APPLICABLE' 
     * @return ComplianceResult 合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
无法应用规则： 'NOT_APPLICABLE'
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
无法应用规则： 'NOT_APPLICABLE'
     * @param ComplianceResult 合规： 'COMPLIANT'
不合规： 'NON_COMPLIANT'
无法应用规则： 'NOT_APPLICABLE'
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get ["",""] 
     * @return Annotation ["",""]
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set ["",""]
     * @param Annotation ["",""]
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    /**
     * Get 规则评估时间
格式：YYYY-MM-DD h:i:s
 
     * @return ConfigRuleInvokedTime 规则评估时间
格式：YYYY-MM-DD h:i:s

     */
    public String getConfigRuleInvokedTime() {
        return this.ConfigRuleInvokedTime;
    }

    /**
     * Set 规则评估时间
格式：YYYY-MM-DD h:i:s

     * @param ConfigRuleInvokedTime 规则评估时间
格式：YYYY-MM-DD h:i:s

     */
    public void setConfigRuleInvokedTime(String ConfigRuleInvokedTime) {
        this.ConfigRuleInvokedTime = ConfigRuleInvokedTime;
    }

    /**
     * Get 规则ID 
     * @return ConfigRuleId 规则ID
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set 规则ID
     * @param ConfigRuleId 规则ID
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get CUSTOMIZE：自定义规则、
SYSTEM：托管规则 
     * @return IdentifierType CUSTOMIZE：自定义规则、
SYSTEM：托管规则
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set CUSTOMIZE：自定义规则、
SYSTEM：托管规则
     * @param IdentifierType CUSTOMIZE：自定义规则、
SYSTEM：托管规则
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    /**
     * Get 合规包ID 
     * @return CompliancePackId 合规包ID
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包ID
     * @param CompliancePackId 合规包ID
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get 触发类型
ScheduledNotification：周期触发、
ConfigurationItemChangeNotification：变更触发 
     * @return TriggerType 触发类型
ScheduledNotification：周期触发、
ConfigurationItemChangeNotification：变更触发
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型
ScheduledNotification：周期触发、
ConfigurationItemChangeNotification：变更触发
     * @param TriggerType 触发类型
ScheduledNotification：周期触发、
ConfigurationItemChangeNotification：变更触发
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 参数详情 
     * @return ManageInputParameter 参数详情
     */
    public InputParameterForManage [] getManageInputParameter() {
        return this.ManageInputParameter;
    }

    /**
     * Set 参数详情
     * @param ManageInputParameter 参数详情
     */
    public void setManageInputParameter(InputParameterForManage [] ManageInputParameter) {
        this.ManageInputParameter = ManageInputParameter;
    }

    /**
     * Get 合规包名称 
     * @return CompliancePackName 合规包名称
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set 合规包名称
     * @param CompliancePackName 合规包名称
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get 关联地域 
     * @return RegionsScope 关联地域
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set 关联地域
     * @param RegionsScope 关联地域
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get 关联标签 
     * @return TagsScope 关联标签
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set 关联标签
     * @param TagsScope 关联标签
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get  规则对指定资源ID无效，即不对该资源执行评估。 
     * @return ExcludeResourceIdsScope  规则对指定资源ID无效，即不对该资源执行评估。
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set  规则对指定资源ID无效，即不对该资源执行评估。
     * @param ExcludeResourceIdsScope  规则对指定资源ID无效，即不对该资源执行评估。
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 账号组名称 
     * @return AccountGroupName 账号组名称
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set 账号组名称
     * @param AccountGroupName 账号组名称
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get 规则所属用户ID 
     * @return RuleOwnerId 规则所属用户ID
     */
    public Long getRuleOwnerId() {
        return this.RuleOwnerId;
    }

    /**
     * Set 规则所属用户ID
     * @param RuleOwnerId 规则所属用户ID
     */
    public void setRuleOwnerId(Long RuleOwnerId) {
        this.RuleOwnerId = RuleOwnerId;
    }

    /**
     * Get 预设规则支持的触发方式
ScheduledNotification：周期触发
ConfigurationItemChangeNotification：变更触发 
     * @return ManageTriggerType 预设规则支持的触发方式
ScheduledNotification：周期触发
ConfigurationItemChangeNotification：变更触发
     */
    public String [] getManageTriggerType() {
        return this.ManageTriggerType;
    }

    /**
     * Set 预设规则支持的触发方式
ScheduledNotification：周期触发
ConfigurationItemChangeNotification：变更触发
     * @param ManageTriggerType 预设规则支持的触发方式
ScheduledNotification：周期触发
ConfigurationItemChangeNotification：变更触发
     */
    public void setManageTriggerType(String [] ManageTriggerType) {
        this.ManageTriggerType = ManageTriggerType;
    }

    public ConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigRule(ConfigRule source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.SourceCondition != null) {
            this.SourceCondition = new SourceConditionForManage[source.SourceCondition.length];
            for (int i = 0; i < source.SourceCondition.length; i++) {
                this.SourceCondition[i] = new SourceConditionForManage(source.SourceCondition[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ServiceFunction != null) {
            this.ServiceFunction = new String(source.ServiceFunction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
        if (source.ConfigRuleInvokedTime != null) {
            this.ConfigRuleInvokedTime = new String(source.ConfigRuleInvokedTime);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new TriggerType[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new TriggerType(source.TriggerType[i]);
            }
        }
        if (source.ManageInputParameter != null) {
            this.ManageInputParameter = new InputParameterForManage[source.ManageInputParameter.length];
            for (int i = 0; i < source.ManageInputParameter.length; i++) {
                this.ManageInputParameter[i] = new InputParameterForManage(source.ManageInputParameter[i]);
            }
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RegionsScope != null) {
            this.RegionsScope = new String[source.RegionsScope.length];
            for (int i = 0; i < source.RegionsScope.length; i++) {
                this.RegionsScope[i] = new String(source.RegionsScope[i]);
            }
        }
        if (source.TagsScope != null) {
            this.TagsScope = new Tag[source.TagsScope.length];
            for (int i = 0; i < source.TagsScope.length; i++) {
                this.TagsScope[i] = new Tag(source.TagsScope[i]);
            }
        }
        if (source.ExcludeResourceIdsScope != null) {
            this.ExcludeResourceIdsScope = new String[source.ExcludeResourceIdsScope.length];
            for (int i = 0; i < source.ExcludeResourceIdsScope.length; i++) {
                this.ExcludeResourceIdsScope[i] = new String(source.ExcludeResourceIdsScope[i]);
            }
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.AccountGroupName != null) {
            this.AccountGroupName = new String(source.AccountGroupName);
        }
        if (source.RuleOwnerId != null) {
            this.RuleOwnerId = new Long(source.RuleOwnerId);
        }
        if (source.ManageTriggerType != null) {
            this.ManageTriggerType = new String[source.ManageTriggerType.length];
            for (int i = 0; i < source.ManageTriggerType.length; i++) {
                this.ManageTriggerType[i] = new String(source.ManageTriggerType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ServiceFunction", this.ServiceFunction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);
        this.setParamSimple(map, prefix + "ConfigRuleInvokedTime", this.ConfigRuleInvokedTime);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamArrayObj(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamArrayObj(map, prefix + "ManageInputParameter.", this.ManageInputParameter);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamArraySimple(map, prefix + "RegionsScope.", this.RegionsScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "AccountGroupName", this.AccountGroupName);
        this.setParamSimple(map, prefix + "RuleOwnerId", this.RuleOwnerId);
        this.setParamArraySimple(map, prefix + "ManageTriggerType.", this.ManageTriggerType);

    }
}

