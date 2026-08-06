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

public class ConfigRuleResourceEvaluationResult extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则身份标识
    */
    @SerializedName("RuleIdentifier")
    @Expose
    private String RuleIdentifier;

    /**
    * 规则描述
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
    * 规则归属账号
    */
    @SerializedName("RuleOwnerId")
    @Expose
    private Long RuleOwnerId;

    /**
    * 规则风险等级
    */
    @SerializedName("RuleRiskLevel")
    @Expose
    private Long RuleRiskLevel;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源标签
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 合规详情
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则身份标识 
     * @return RuleIdentifier 规则身份标识
     */
    public String getRuleIdentifier() {
        return this.RuleIdentifier;
    }

    /**
     * Set 规则身份标识
     * @param RuleIdentifier 规则身份标识
     */
    public void setRuleIdentifier(String RuleIdentifier) {
        this.RuleIdentifier = RuleIdentifier;
    }

    /**
     * Get 规则描述 
     * @return RuleDescription 规则描述
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set 规则描述
     * @param RuleDescription 规则描述
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    /**
     * Get 规则归属账号 
     * @return RuleOwnerId 规则归属账号
     */
    public Long getRuleOwnerId() {
        return this.RuleOwnerId;
    }

    /**
     * Set 规则归属账号
     * @param RuleOwnerId 规则归属账号
     */
    public void setRuleOwnerId(Long RuleOwnerId) {
        this.RuleOwnerId = RuleOwnerId;
    }

    /**
     * Get 规则风险等级 
     * @return RuleRiskLevel 规则风险等级
     */
    public Long getRuleRiskLevel() {
        return this.RuleRiskLevel;
    }

    /**
     * Set 规则风险等级
     * @param RuleRiskLevel 规则风险等级
     */
    public void setRuleRiskLevel(Long RuleRiskLevel) {
        this.RuleRiskLevel = RuleRiskLevel;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源地域 
     * @return ResourceRegion 资源地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
     * @param ResourceRegion 资源地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源标签 
     * @return ResourceTags 资源标签
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 资源标签
     * @param ResourceTags 资源标签
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 合规详情 
     * @return Annotation 合规详情
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set 合规详情
     * @param Annotation 合规详情
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    public ConfigRuleResourceEvaluationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigRuleResourceEvaluationResult(ConfigRuleResourceEvaluationResult source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleIdentifier != null) {
            this.RuleIdentifier = new String(source.RuleIdentifier);
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
        if (source.RuleOwnerId != null) {
            this.RuleOwnerId = new Long(source.RuleOwnerId);
        }
        if (source.RuleRiskLevel != null) {
            this.RuleRiskLevel = new Long(source.RuleRiskLevel);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleIdentifier", this.RuleIdentifier);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);
        this.setParamSimple(map, prefix + "RuleOwnerId", this.RuleOwnerId);
        this.setParamSimple(map, prefix + "RuleRiskLevel", this.RuleRiskLevel);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);

    }
}

