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

public class AddConfigRuleRequest extends AbstractModel {

    /**
    * 规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 规则模板类型，SYSTEM, CUSTOMIZE
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则支持的资源
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * 触发类型，最多支持两种
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * 风险等级
1：高风险。
2：中风险。
3：低风险。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 入参
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * 规则描述。长度范围0~1024字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则评估地域范围，规则仅对指定地域中的资源生效。
支持的地域范围config:ListResourceRegions返回的地域
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * 规则评估标签范围，规则仅对绑定指定标签的资源生效。
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    * 规则对指定资源ID无效，即不对该资源执行评估。
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
     * Get 规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName） 
     * @return Identifier 规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）
     * @param Identifier 规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 规则模板类型，SYSTEM, CUSTOMIZE 
     * @return IdentifierType 规则模板类型，SYSTEM, CUSTOMIZE
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set 规则模板类型，SYSTEM, CUSTOMIZE
     * @param IdentifierType 规则模板类型，SYSTEM, CUSTOMIZE
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
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
     * Get 规则支持的资源 
     * @return ResourceType 规则支持的资源
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 规则支持的资源
     * @param ResourceType 规则支持的资源
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 触发类型，最多支持两种 
     * @return TriggerType 触发类型，最多支持两种
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型，最多支持两种
     * @param TriggerType 触发类型，最多支持两种
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 风险等级
1：高风险。
2：中风险。
3：低风险。 
     * @return RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
1：高风险。
2：中风险。
3：低风险。
     * @param RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 入参 
     * @return InputParameter 入参
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 入参
     * @param InputParameter 入参
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 规则描述。长度范围0~1024字符 
     * @return Description 规则描述。长度范围0~1024字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。长度范围0~1024字符
     * @param Description 规则描述。长度范围0~1024字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则评估地域范围，规则仅对指定地域中的资源生效。
支持的地域范围config:ListResourceRegions返回的地域 
     * @return RegionsScope 规则评估地域范围，规则仅对指定地域中的资源生效。
支持的地域范围config:ListResourceRegions返回的地域
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set 规则评估地域范围，规则仅对指定地域中的资源生效。
支持的地域范围config:ListResourceRegions返回的地域
     * @param RegionsScope 规则评估地域范围，规则仅对指定地域中的资源生效。
支持的地域范围config:ListResourceRegions返回的地域
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get 规则评估标签范围，规则仅对绑定指定标签的资源生效。 
     * @return TagsScope 规则评估标签范围，规则仅对绑定指定标签的资源生效。
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set 规则评估标签范围，规则仅对绑定指定标签的资源生效。
     * @param TagsScope 规则评估标签范围，规则仅对绑定指定标签的资源生效。
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get 规则对指定资源ID无效，即不对该资源执行评估。 
     * @return ExcludeResourceIdsScope 规则对指定资源ID无效，即不对该资源执行评估。
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set 规则对指定资源ID无效，即不对该资源执行评估。
     * @param ExcludeResourceIdsScope 规则对指定资源ID无效，即不对该资源执行评估。
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    public AddConfigRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddConfigRuleRequest(AddConfigRuleRequest source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new TriggerType[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new TriggerType(source.TriggerType[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArrayObj(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "RegionsScope.", this.RegionsScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);

    }
}

