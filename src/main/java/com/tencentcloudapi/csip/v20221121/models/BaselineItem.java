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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineItem extends AbstractModel {

    /**
    * <p>基线检测项 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>内置规则 ID。</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>检测对象描述，例如配置文件路径、内核参数、Kubernetes 资源等。</p>
    */
    @SerializedName("CheckObject")
    @Expose
    private String [] CheckObject;

    /**
    * <p>风险等级。取值：</p><ul><li>LOW：低危</li><li>MEDIUM：中危</li><li>HIGH：高危</li><li>CRITICAL：严重</li></ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>检测项名称（中文）。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>检测项描述（中文，说明检测背景与判定逻辑）。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>检测项修复建议（中文，含建议的配置参考值或加固命令）。</p>
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
    * <p>检测项的参考链接列表。</p>
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * <p>所属系统父分类信息。</p>
    */
    @SerializedName("SystemCategory")
    @Expose
    private BaselineCategory SystemCategory;

    /**
    * <p>所属子分类信息。</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>是否支持一键修复。true 支持，false 不支持。</p>
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * <p>是否支持用户自定义判定值。true 支持，false 不支持。</p>
    */
    @SerializedName("SupportCustomValue")
    @Expose
    private Boolean SupportCustomValue;

    /**
    * <p>该检测项适用的操作系统/组件版本列表。</p>
    */
    @SerializedName("AffectedVersionList")
    @Expose
    private String [] AffectedVersionList;

    /**
    * <p>编辑自定义判定值时的参数定义（如取值范围、控件类型等）。</p>
    */
    @SerializedName("WebEditParam")
    @Expose
    private String WebEditParam;

    /**
    * <p>检测项默认判定值列表。</p>
    */
    @SerializedName("DefaultValueList")
    @Expose
    private String [] DefaultValueList;

    /**
    * <p>是否已被用户自定义。true 已自定义，false 仍使用默认值。</p>
    */
    @SerializedName("IsCustomConf")
    @Expose
    private Boolean IsCustomConf;

    /**
    * <p>用户自定义配置记录 ID，未自定义时为 0。</p>
    */
    @SerializedName("CustomItemID")
    @Expose
    private Long CustomItemID;

    /**
     * Get <p>基线检测项 ID。</p> 
     * @return ID <p>基线检测项 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>基线检测项 ID。</p>
     * @param ID <p>基线检测项 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>内置规则 ID。</p> 
     * @return RuleID <p>内置规则 ID。</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>内置规则 ID。</p>
     * @param RuleID <p>内置规则 ID。</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>检测对象描述，例如配置文件路径、内核参数、Kubernetes 资源等。</p> 
     * @return CheckObject <p>检测对象描述，例如配置文件路径、内核参数、Kubernetes 资源等。</p>
     */
    public String [] getCheckObject() {
        return this.CheckObject;
    }

    /**
     * Set <p>检测对象描述，例如配置文件路径、内核参数、Kubernetes 资源等。</p>
     * @param CheckObject <p>检测对象描述，例如配置文件路径、内核参数、Kubernetes 资源等。</p>
     */
    public void setCheckObject(String [] CheckObject) {
        this.CheckObject = CheckObject;
    }

    /**
     * Get <p>风险等级。取值：</p><ul><li>LOW：低危</li><li>MEDIUM：中危</li><li>HIGH：高危</li><li>CRITICAL：严重</li></ul> 
     * @return RiskLevel <p>风险等级。取值：</p><ul><li>LOW：低危</li><li>MEDIUM：中危</li><li>HIGH：高危</li><li>CRITICAL：严重</li></ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级。取值：</p><ul><li>LOW：低危</li><li>MEDIUM：中危</li><li>HIGH：高危</li><li>CRITICAL：严重</li></ul>
     * @param RiskLevel <p>风险等级。取值：</p><ul><li>LOW：低危</li><li>MEDIUM：中危</li><li>HIGH：高危</li><li>CRITICAL：严重</li></ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>检测项名称（中文）。</p> 
     * @return Name <p>检测项名称（中文）。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>检测项名称（中文）。</p>
     * @param Name <p>检测项名称（中文）。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>检测项描述（中文，说明检测背景与判定逻辑）。</p> 
     * @return Description <p>检测项描述（中文，说明检测背景与判定逻辑）。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>检测项描述（中文，说明检测背景与判定逻辑）。</p>
     * @param Description <p>检测项描述（中文，说明检测背景与判定逻辑）。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>检测项修复建议（中文，含建议的配置参考值或加固命令）。</p> 
     * @return FixSuggestion <p>检测项修复建议（中文，含建议的配置参考值或加固命令）。</p>
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set <p>检测项修复建议（中文，含建议的配置参考值或加固命令）。</p>
     * @param FixSuggestion <p>检测项修复建议（中文，含建议的配置参考值或加固命令）。</p>
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    /**
     * Get <p>检测项的参考链接列表。</p> 
     * @return ReferenceLink <p>检测项的参考链接列表。</p>
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set <p>检测项的参考链接列表。</p>
     * @param ReferenceLink <p>检测项的参考链接列表。</p>
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get <p>所属系统父分类信息。</p> 
     * @return SystemCategory <p>所属系统父分类信息。</p>
     */
    public BaselineCategory getSystemCategory() {
        return this.SystemCategory;
    }

    /**
     * Set <p>所属系统父分类信息。</p>
     * @param SystemCategory <p>所属系统父分类信息。</p>
     */
    public void setSystemCategory(BaselineCategory SystemCategory) {
        this.SystemCategory = SystemCategory;
    }

    /**
     * Get <p>所属子分类信息。</p> 
     * @return Category <p>所属子分类信息。</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>所属子分类信息。</p>
     * @param Category <p>所属子分类信息。</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>是否支持一键修复。true 支持，false 不支持。</p> 
     * @return SupportFix <p>是否支持一键修复。true 支持，false 不支持。</p>
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set <p>是否支持一键修复。true 支持，false 不支持。</p>
     * @param SupportFix <p>是否支持一键修复。true 支持，false 不支持。</p>
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get <p>是否支持用户自定义判定值。true 支持，false 不支持。</p> 
     * @return SupportCustomValue <p>是否支持用户自定义判定值。true 支持，false 不支持。</p>
     */
    public Boolean getSupportCustomValue() {
        return this.SupportCustomValue;
    }

    /**
     * Set <p>是否支持用户自定义判定值。true 支持，false 不支持。</p>
     * @param SupportCustomValue <p>是否支持用户自定义判定值。true 支持，false 不支持。</p>
     */
    public void setSupportCustomValue(Boolean SupportCustomValue) {
        this.SupportCustomValue = SupportCustomValue;
    }

    /**
     * Get <p>该检测项适用的操作系统/组件版本列表。</p> 
     * @return AffectedVersionList <p>该检测项适用的操作系统/组件版本列表。</p>
     */
    public String [] getAffectedVersionList() {
        return this.AffectedVersionList;
    }

    /**
     * Set <p>该检测项适用的操作系统/组件版本列表。</p>
     * @param AffectedVersionList <p>该检测项适用的操作系统/组件版本列表。</p>
     */
    public void setAffectedVersionList(String [] AffectedVersionList) {
        this.AffectedVersionList = AffectedVersionList;
    }

    /**
     * Get <p>编辑自定义判定值时的参数定义（如取值范围、控件类型等）。</p> 
     * @return WebEditParam <p>编辑自定义判定值时的参数定义（如取值范围、控件类型等）。</p>
     */
    public String getWebEditParam() {
        return this.WebEditParam;
    }

    /**
     * Set <p>编辑自定义判定值时的参数定义（如取值范围、控件类型等）。</p>
     * @param WebEditParam <p>编辑自定义判定值时的参数定义（如取值范围、控件类型等）。</p>
     */
    public void setWebEditParam(String WebEditParam) {
        this.WebEditParam = WebEditParam;
    }

    /**
     * Get <p>检测项默认判定值列表。</p> 
     * @return DefaultValueList <p>检测项默认判定值列表。</p>
     */
    public String [] getDefaultValueList() {
        return this.DefaultValueList;
    }

    /**
     * Set <p>检测项默认判定值列表。</p>
     * @param DefaultValueList <p>检测项默认判定值列表。</p>
     */
    public void setDefaultValueList(String [] DefaultValueList) {
        this.DefaultValueList = DefaultValueList;
    }

    /**
     * Get <p>是否已被用户自定义。true 已自定义，false 仍使用默认值。</p> 
     * @return IsCustomConf <p>是否已被用户自定义。true 已自定义，false 仍使用默认值。</p>
     */
    public Boolean getIsCustomConf() {
        return this.IsCustomConf;
    }

    /**
     * Set <p>是否已被用户自定义。true 已自定义，false 仍使用默认值。</p>
     * @param IsCustomConf <p>是否已被用户自定义。true 已自定义，false 仍使用默认值。</p>
     */
    public void setIsCustomConf(Boolean IsCustomConf) {
        this.IsCustomConf = IsCustomConf;
    }

    /**
     * Get <p>用户自定义配置记录 ID，未自定义时为 0。</p> 
     * @return CustomItemID <p>用户自定义配置记录 ID，未自定义时为 0。</p>
     */
    public Long getCustomItemID() {
        return this.CustomItemID;
    }

    /**
     * Set <p>用户自定义配置记录 ID，未自定义时为 0。</p>
     * @param CustomItemID <p>用户自定义配置记录 ID，未自定义时为 0。</p>
     */
    public void setCustomItemID(Long CustomItemID) {
        this.CustomItemID = CustomItemID;
    }

    public BaselineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItem(BaselineItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.CheckObject != null) {
            this.CheckObject = new String[source.CheckObject.length];
            for (int i = 0; i < source.CheckObject.length; i++) {
                this.CheckObject[i] = new String(source.CheckObject[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.SystemCategory != null) {
            this.SystemCategory = new BaselineCategory(source.SystemCategory);
        }
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.SupportCustomValue != null) {
            this.SupportCustomValue = new Boolean(source.SupportCustomValue);
        }
        if (source.AffectedVersionList != null) {
            this.AffectedVersionList = new String[source.AffectedVersionList.length];
            for (int i = 0; i < source.AffectedVersionList.length; i++) {
                this.AffectedVersionList[i] = new String(source.AffectedVersionList[i]);
            }
        }
        if (source.WebEditParam != null) {
            this.WebEditParam = new String(source.WebEditParam);
        }
        if (source.DefaultValueList != null) {
            this.DefaultValueList = new String[source.DefaultValueList.length];
            for (int i = 0; i < source.DefaultValueList.length; i++) {
                this.DefaultValueList[i] = new String(source.DefaultValueList[i]);
            }
        }
        if (source.IsCustomConf != null) {
            this.IsCustomConf = new Boolean(source.IsCustomConf);
        }
        if (source.CustomItemID != null) {
            this.CustomItemID = new Long(source.CustomItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "CheckObject.", this.CheckObject);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamObj(map, prefix + "SystemCategory.", this.SystemCategory);
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "SupportCustomValue", this.SupportCustomValue);
        this.setParamArraySimple(map, prefix + "AffectedVersionList.", this.AffectedVersionList);
        this.setParamSimple(map, prefix + "WebEditParam", this.WebEditParam);
        this.setParamArraySimple(map, prefix + "DefaultValueList.", this.DefaultValueList);
        this.setParamSimple(map, prefix + "IsCustomConf", this.IsCustomConf);
        this.setParamSimple(map, prefix + "CustomItemID", this.CustomItemID);

    }
}

