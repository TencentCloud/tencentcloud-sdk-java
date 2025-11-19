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

public class OutputRisk extends AbstractModel {

    /**
    * 合同审查风险结果ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险描述
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * 风险等级。

等级描述如下：
<ul>
    <li>**HIGH** - 高风险</li> 
    <li>**NORMAL** - 风险</li>   
</ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险建议
    */
    @SerializedName("RiskAdvice")
    @Expose
    private String RiskAdvice;

    /**
    * 风险评估
    */
    @SerializedName("RiskPresentation")
    @Expose
    private String [] RiskPresentation;

    /**
    * PDF风险原文内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 审查出的PDF段落位置信息
    */
    @SerializedName("Positions")
    @Expose
    private PositionInfo [] Positions;

    /**
    * 审查依据
    */
    @SerializedName("RiskBasis")
    @Expose
    private String RiskBasis;

    /**
    * 风险等级id
    */
    @SerializedName("RiskLevelId")
    @Expose
    private Long RiskLevelId;

    /**
     * Get 合同审查风险结果ID 
     * @return RiskId 合同审查风险结果ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 合同审查风险结果ID
     * @param RiskId 合同审查风险结果ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险描述 
     * @return RiskDescription 风险描述
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险描述
     * @param RiskDescription 风险描述
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get 风险等级。

等级描述如下：
<ul>
    <li>**HIGH** - 高风险</li> 
    <li>**NORMAL** - 风险</li>   
</ul> 
     * @return RiskLevel 风险等级。

等级描述如下：
<ul>
    <li>**HIGH** - 高风险</li> 
    <li>**NORMAL** - 风险</li>   
</ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级。

等级描述如下：
<ul>
    <li>**HIGH** - 高风险</li> 
    <li>**NORMAL** - 风险</li>   
</ul>
     * @param RiskLevel 风险等级。

等级描述如下：
<ul>
    <li>**HIGH** - 高风险</li> 
    <li>**NORMAL** - 风险</li>   
</ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险建议 
     * @return RiskAdvice 风险建议
     */
    public String getRiskAdvice() {
        return this.RiskAdvice;
    }

    /**
     * Set 风险建议
     * @param RiskAdvice 风险建议
     */
    public void setRiskAdvice(String RiskAdvice) {
        this.RiskAdvice = RiskAdvice;
    }

    /**
     * Get 风险评估 
     * @return RiskPresentation 风险评估
     */
    public String [] getRiskPresentation() {
        return this.RiskPresentation;
    }

    /**
     * Set 风险评估
     * @param RiskPresentation 风险评估
     */
    public void setRiskPresentation(String [] RiskPresentation) {
        this.RiskPresentation = RiskPresentation;
    }

    /**
     * Get PDF风险原文内容 
     * @return Content PDF风险原文内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set PDF风险原文内容
     * @param Content PDF风险原文内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 审查出的PDF段落位置信息 
     * @return Positions 审查出的PDF段落位置信息
     */
    public PositionInfo [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 审查出的PDF段落位置信息
     * @param Positions 审查出的PDF段落位置信息
     */
    public void setPositions(PositionInfo [] Positions) {
        this.Positions = Positions;
    }

    /**
     * Get 审查依据 
     * @return RiskBasis 审查依据
     */
    public String getRiskBasis() {
        return this.RiskBasis;
    }

    /**
     * Set 审查依据
     * @param RiskBasis 审查依据
     */
    public void setRiskBasis(String RiskBasis) {
        this.RiskBasis = RiskBasis;
    }

    /**
     * Get 风险等级id 
     * @return RiskLevelId 风险等级id
     */
    public Long getRiskLevelId() {
        return this.RiskLevelId;
    }

    /**
     * Set 风险等级id
     * @param RiskLevelId 风险等级id
     */
    public void setRiskLevelId(Long RiskLevelId) {
        this.RiskLevelId = RiskLevelId;
    }

    public OutputRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRisk(OutputRisk source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskAdvice != null) {
            this.RiskAdvice = new String(source.RiskAdvice);
        }
        if (source.RiskPresentation != null) {
            this.RiskPresentation = new String[source.RiskPresentation.length];
            for (int i = 0; i < source.RiskPresentation.length; i++) {
                this.RiskPresentation[i] = new String(source.RiskPresentation[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Positions != null) {
            this.Positions = new PositionInfo[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new PositionInfo(source.Positions[i]);
            }
        }
        if (source.RiskBasis != null) {
            this.RiskBasis = new String(source.RiskBasis);
        }
        if (source.RiskLevelId != null) {
            this.RiskLevelId = new Long(source.RiskLevelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskAdvice", this.RiskAdvice);
        this.setParamArraySimple(map, prefix + "RiskPresentation.", this.RiskPresentation);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);
        this.setParamSimple(map, prefix + "RiskBasis", this.RiskBasis);
        this.setParamSimple(map, prefix + "RiskLevelId", this.RiskLevelId);

    }
}

