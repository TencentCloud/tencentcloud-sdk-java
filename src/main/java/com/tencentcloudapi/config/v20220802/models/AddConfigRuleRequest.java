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
    * <p>规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>规则模板类型，SYSTEM, CUSTOMIZE</p>
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则支持的资源</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * <p>触发类型，最多支持两种</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>入参</p>
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * <p>规则描述。长度范围0~1024字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规则评估地域范围，规则仅对指定地域中的资源生效。<br>支持的地域范围config:ListResourceRegions返回的地域</p>
    */
    @SerializedName("RegionsScope")
    @Expose
    private String [] RegionsScope;

    /**
    * <p>规则评估标签范围，规则仅对绑定指定标签的资源生效。</p>
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    * <p>规则对指定资源ID无效，即不对该资源执行评估。</p>
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
     * Get <p>规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）</p> 
     * @return Identifier <p>规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）</p>
     * @param Identifier <p>规则模板标识，预设规则模板为Identifier, 自定义规则为云函数arn（region:functionName）</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>规则模板类型，SYSTEM, CUSTOMIZE</p> 
     * @return IdentifierType <p>规则模板类型，SYSTEM, CUSTOMIZE</p>
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set <p>规则模板类型，SYSTEM, CUSTOMIZE</p>
     * @param IdentifierType <p>规则模板类型，SYSTEM, CUSTOMIZE</p>
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则支持的资源</p> 
     * @return ResourceType <p>规则支持的资源</p>
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>规则支持的资源</p>
     * @param ResourceType <p>规则支持的资源</p>
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>触发类型，最多支持两种</p> 
     * @return TriggerType <p>触发类型，最多支持两种</p>
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型，最多支持两种</p>
     * @param TriggerType <p>触发类型，最多支持两种</p>
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p> 
     * @return RiskLevel <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     * @param RiskLevel <p>风险等级<br>1：高风险。<br>2：中风险。<br>3：低风险。</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>入参</p> 
     * @return InputParameter <p>入参</p>
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set <p>入参</p>
     * @param InputParameter <p>入参</p>
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get <p>规则描述。长度范围0~1024字符</p> 
     * @return Description <p>规则描述。长度范围0~1024字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则描述。长度范围0~1024字符</p>
     * @param Description <p>规则描述。长度范围0~1024字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则评估地域范围，规则仅对指定地域中的资源生效。<br>支持的地域范围config:ListResourceRegions返回的地域</p> 
     * @return RegionsScope <p>规则评估地域范围，规则仅对指定地域中的资源生效。<br>支持的地域范围config:ListResourceRegions返回的地域</p>
     */
    public String [] getRegionsScope() {
        return this.RegionsScope;
    }

    /**
     * Set <p>规则评估地域范围，规则仅对指定地域中的资源生效。<br>支持的地域范围config:ListResourceRegions返回的地域</p>
     * @param RegionsScope <p>规则评估地域范围，规则仅对指定地域中的资源生效。<br>支持的地域范围config:ListResourceRegions返回的地域</p>
     */
    public void setRegionsScope(String [] RegionsScope) {
        this.RegionsScope = RegionsScope;
    }

    /**
     * Get <p>规则评估标签范围，规则仅对绑定指定标签的资源生效。</p> 
     * @return TagsScope <p>规则评估标签范围，规则仅对绑定指定标签的资源生效。</p>
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set <p>规则评估标签范围，规则仅对绑定指定标签的资源生效。</p>
     * @param TagsScope <p>规则评估标签范围，规则仅对绑定指定标签的资源生效。</p>
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get <p>规则对指定资源ID无效，即不对该资源执行评估。</p> 
     * @return ExcludeResourceIdsScope <p>规则对指定资源ID无效，即不对该资源执行评估。</p>
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set <p>规则对指定资源ID无效，即不对该资源执行评估。</p>
     * @param ExcludeResourceIdsScope <p>规则对指定资源ID无效，即不对该资源执行评估。</p>
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

