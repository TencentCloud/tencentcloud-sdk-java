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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChecklistPoint extends AbstractModel {

    /**
    * <p>合同风险审查清单检查点名称</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>合同风险审查清单检查点详细描述，说明具体风险信息</p>
    */
    @SerializedName("Explanation")
    @Expose
    private String Explanation;

    /**
    * <p>合同风险审查清单检查点对应的风险等级，一般分为 高风险、中风险、一般风险</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>合同风险审查清单检查点ID，创建清单时无需填写</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>合同风险审查清单检查点是否不可缺失，若为true，相关条款未出现在内容中，视作风险</p>
    */
    @SerializedName("IsIndispensable")
    @Expose
    private Boolean IsIndispensable;

    /**
    * <p>合同风险审查清单检查点是否要求和参考条款一致</p>
    */
    @SerializedName("IsConsistentWithReferenceItem")
    @Expose
    private Boolean IsConsistentWithReferenceItem;

    /**
    * <p>合同风险审查清单检查点参考条款，用于辅助审查</p>
    */
    @SerializedName("ReferenceItem")
    @Expose
    private String ReferenceItem;

    /**
    * <p>合同风险审查清单检查点固定修改建议，优先级高于AiSuggestion</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>合同风险审查清单检查点AI修改建议提示，会参考该配置生成对应的修改建议</p>
    */
    @SerializedName("AiSuggestion")
    @Expose
    private String AiSuggestion;

    /**
    * <p>合同风险审查清单检查点表现标签，用于自定义不同的风险类型</p>
    */
    @SerializedName("RiskPresentation")
    @Expose
    private String [] RiskPresentation;

    /**
     * Get <p>合同风险审查清单检查点名称</p> 
     * @return Summary <p>合同风险审查清单检查点名称</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>合同风险审查清单检查点名称</p>
     * @param Summary <p>合同风险审查清单检查点名称</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>合同风险审查清单检查点详细描述，说明具体风险信息</p> 
     * @return Explanation <p>合同风险审查清单检查点详细描述，说明具体风险信息</p>
     */
    public String getExplanation() {
        return this.Explanation;
    }

    /**
     * Set <p>合同风险审查清单检查点详细描述，说明具体风险信息</p>
     * @param Explanation <p>合同风险审查清单检查点详细描述，说明具体风险信息</p>
     */
    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
    }

    /**
     * Get <p>合同风险审查清单检查点对应的风险等级，一般分为 高风险、中风险、一般风险</p> 
     * @return RiskLevel <p>合同风险审查清单检查点对应的风险等级，一般分为 高风险、中风险、一般风险</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>合同风险审查清单检查点对应的风险等级，一般分为 高风险、中风险、一般风险</p>
     * @param RiskLevel <p>合同风险审查清单检查点对应的风险等级，一般分为 高风险、中风险、一般风险</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>合同风险审查清单检查点ID，创建清单时无需填写</p> 
     * @return Id <p>合同风险审查清单检查点ID，创建清单时无需填写</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>合同风险审查清单检查点ID，创建清单时无需填写</p>
     * @param Id <p>合同风险审查清单检查点ID，创建清单时无需填写</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>合同风险审查清单检查点是否不可缺失，若为true，相关条款未出现在内容中，视作风险</p> 
     * @return IsIndispensable <p>合同风险审查清单检查点是否不可缺失，若为true，相关条款未出现在内容中，视作风险</p>
     */
    public Boolean getIsIndispensable() {
        return this.IsIndispensable;
    }

    /**
     * Set <p>合同风险审查清单检查点是否不可缺失，若为true，相关条款未出现在内容中，视作风险</p>
     * @param IsIndispensable <p>合同风险审查清单检查点是否不可缺失，若为true，相关条款未出现在内容中，视作风险</p>
     */
    public void setIsIndispensable(Boolean IsIndispensable) {
        this.IsIndispensable = IsIndispensable;
    }

    /**
     * Get <p>合同风险审查清单检查点是否要求和参考条款一致</p> 
     * @return IsConsistentWithReferenceItem <p>合同风险审查清单检查点是否要求和参考条款一致</p>
     */
    public Boolean getIsConsistentWithReferenceItem() {
        return this.IsConsistentWithReferenceItem;
    }

    /**
     * Set <p>合同风险审查清单检查点是否要求和参考条款一致</p>
     * @param IsConsistentWithReferenceItem <p>合同风险审查清单检查点是否要求和参考条款一致</p>
     */
    public void setIsConsistentWithReferenceItem(Boolean IsConsistentWithReferenceItem) {
        this.IsConsistentWithReferenceItem = IsConsistentWithReferenceItem;
    }

    /**
     * Get <p>合同风险审查清单检查点参考条款，用于辅助审查</p> 
     * @return ReferenceItem <p>合同风险审查清单检查点参考条款，用于辅助审查</p>
     */
    public String getReferenceItem() {
        return this.ReferenceItem;
    }

    /**
     * Set <p>合同风险审查清单检查点参考条款，用于辅助审查</p>
     * @param ReferenceItem <p>合同风险审查清单检查点参考条款，用于辅助审查</p>
     */
    public void setReferenceItem(String ReferenceItem) {
        this.ReferenceItem = ReferenceItem;
    }

    /**
     * Get <p>合同风险审查清单检查点固定修改建议，优先级高于AiSuggestion</p> 
     * @return Suggestion <p>合同风险审查清单检查点固定修改建议，优先级高于AiSuggestion</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>合同风险审查清单检查点固定修改建议，优先级高于AiSuggestion</p>
     * @param Suggestion <p>合同风险审查清单检查点固定修改建议，优先级高于AiSuggestion</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>合同风险审查清单检查点AI修改建议提示，会参考该配置生成对应的修改建议</p> 
     * @return AiSuggestion <p>合同风险审查清单检查点AI修改建议提示，会参考该配置生成对应的修改建议</p>
     */
    public String getAiSuggestion() {
        return this.AiSuggestion;
    }

    /**
     * Set <p>合同风险审查清单检查点AI修改建议提示，会参考该配置生成对应的修改建议</p>
     * @param AiSuggestion <p>合同风险审查清单检查点AI修改建议提示，会参考该配置生成对应的修改建议</p>
     */
    public void setAiSuggestion(String AiSuggestion) {
        this.AiSuggestion = AiSuggestion;
    }

    /**
     * Get <p>合同风险审查清单检查点表现标签，用于自定义不同的风险类型</p> 
     * @return RiskPresentation <p>合同风险审查清单检查点表现标签，用于自定义不同的风险类型</p>
     */
    public String [] getRiskPresentation() {
        return this.RiskPresentation;
    }

    /**
     * Set <p>合同风险审查清单检查点表现标签，用于自定义不同的风险类型</p>
     * @param RiskPresentation <p>合同风险审查清单检查点表现标签，用于自定义不同的风险类型</p>
     */
    public void setRiskPresentation(String [] RiskPresentation) {
        this.RiskPresentation = RiskPresentation;
    }

    public ChecklistPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChecklistPoint(ChecklistPoint source) {
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Explanation != null) {
            this.Explanation = new String(source.Explanation);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.IsIndispensable != null) {
            this.IsIndispensable = new Boolean(source.IsIndispensable);
        }
        if (source.IsConsistentWithReferenceItem != null) {
            this.IsConsistentWithReferenceItem = new Boolean(source.IsConsistentWithReferenceItem);
        }
        if (source.ReferenceItem != null) {
            this.ReferenceItem = new String(source.ReferenceItem);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.AiSuggestion != null) {
            this.AiSuggestion = new String(source.AiSuggestion);
        }
        if (source.RiskPresentation != null) {
            this.RiskPresentation = new String[source.RiskPresentation.length];
            for (int i = 0; i < source.RiskPresentation.length; i++) {
                this.RiskPresentation[i] = new String(source.RiskPresentation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "Explanation", this.Explanation);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsIndispensable", this.IsIndispensable);
        this.setParamSimple(map, prefix + "IsConsistentWithReferenceItem", this.IsConsistentWithReferenceItem);
        this.setParamSimple(map, prefix + "ReferenceItem", this.ReferenceItem);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "AiSuggestion", this.AiSuggestion);
        this.setParamArraySimple(map, prefix + "RiskPresentation.", this.RiskPresentation);

    }
}

