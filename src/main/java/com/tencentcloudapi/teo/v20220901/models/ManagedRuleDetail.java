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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleDetail extends AbstractModel {

    /**
    * 托管规则Id。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 托管规则的防护级别。取值有：<li>low：低风险，此规则风险较低，适用于非常严格控制环境下的访问场景，该等级规则可能造成较多的误报；</li><li>medium：中风险，表示此条规则风险正常，适用较为严格的防护场景；</li><li>high：高风险，表示此条规则风险较高，大多数场景不会产生误报；</li><li>extreme：超高风险，表示此条规则风险极高，基本不会产生误报；</li>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则标签。部分类型的规则不存在标签。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 规则所属版本。
    */
    @SerializedName("RuleVersion")
    @Expose
    private String RuleVersion;

    /**
     * Get 托管规则Id。 
     * @return RuleId 托管规则Id。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 托管规则Id。
     * @param RuleId 托管规则Id。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 托管规则的防护级别。取值有：<li>low：低风险，此规则风险较低，适用于非常严格控制环境下的访问场景，该等级规则可能造成较多的误报；</li><li>medium：中风险，表示此条规则风险正常，适用较为严格的防护场景；</li><li>high：高风险，表示此条规则风险较高，大多数场景不会产生误报；</li><li>extreme：超高风险，表示此条规则风险极高，基本不会产生误报；</li> 
     * @return RiskLevel 托管规则的防护级别。取值有：<li>low：低风险，此规则风险较低，适用于非常严格控制环境下的访问场景，该等级规则可能造成较多的误报；</li><li>medium：中风险，表示此条规则风险正常，适用较为严格的防护场景；</li><li>high：高风险，表示此条规则风险较高，大多数场景不会产生误报；</li><li>extreme：超高风险，表示此条规则风险极高，基本不会产生误报；</li>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 托管规则的防护级别。取值有：<li>low：低风险，此规则风险较低，适用于非常严格控制环境下的访问场景，该等级规则可能造成较多的误报；</li><li>medium：中风险，表示此条规则风险正常，适用较为严格的防护场景；</li><li>high：高风险，表示此条规则风险较高，大多数场景不会产生误报；</li><li>extreme：超高风险，表示此条规则风险极高，基本不会产生误报；</li>
     * @param RiskLevel 托管规则的防护级别。取值有：<li>low：低风险，此规则风险较低，适用于非常严格控制环境下的访问场景，该等级规则可能造成较多的误报；</li><li>medium：中风险，表示此条规则风险正常，适用较为严格的防护场景；</li><li>high：高风险，表示此条规则风险较高，大多数场景不会产生误报；</li><li>extreme：超高风险，表示此条规则风险极高，基本不会产生误报；</li>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则标签。部分类型的规则不存在标签。 
     * @return Tags 规则标签。部分类型的规则不存在标签。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 规则标签。部分类型的规则不存在标签。
     * @param Tags 规则标签。部分类型的规则不存在标签。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 规则所属版本。 
     * @return RuleVersion 规则所属版本。
     */
    public String getRuleVersion() {
        return this.RuleVersion;
    }

    /**
     * Set 规则所属版本。
     * @param RuleVersion 规则所属版本。
     */
    public void setRuleVersion(String RuleVersion) {
        this.RuleVersion = RuleVersion;
    }

    public ManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleDetail(ManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RuleVersion != null) {
            this.RuleVersion = new String(source.RuleVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RuleVersion", this.RuleVersion);

    }
}

