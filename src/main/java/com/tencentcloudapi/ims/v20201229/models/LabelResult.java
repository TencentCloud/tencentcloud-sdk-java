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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelResult extends AbstractModel {

    /**
    * 该字段用于返回模型识别出的场景结果，如广告、色情、有害内容等场景。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回对应恶意标签下的子标签的检测结果，如：*Porn-SexBehavior*等子标签。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回分类模型命中子标签的详细信息，如：序号、命中标签名称、分数等信息。
    */
    @SerializedName("Details")
    @Expose
    private LabelDetailItem [] Details;

    /**
     * Get 该字段用于返回模型识别出的场景结果，如广告、色情、有害内容等场景。 
     * @return Scene 该字段用于返回模型识别出的场景结果，如广告、色情、有害内容等场景。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 该字段用于返回模型识别出的场景结果，如广告、色情、有害内容等场景。
     * @param Scene 该字段用于返回模型识别出的场景结果，如广告、色情、有害内容等场景。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回对应恶意标签下的子标签的检测结果，如：*Porn-SexBehavior*等子标签。 
     * @return SubLabel 该字段用于返回对应恶意标签下的子标签的检测结果，如：*Porn-SexBehavior*等子标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回对应恶意标签下的子标签的检测结果，如：*Porn-SexBehavior*等子标签。
     * @param SubLabel 该字段用于返回对应恶意标签下的子标签的检测结果，如：*Porn-SexBehavior*等子标签。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。 
     * @return Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     * @param Score 该字段用于返回当前标签（Label）下的置信度，取值范围：0（**置信度最低**）-100（**置信度最高** ），越高代表图片越有可能属于当前返回的标签；如：*色情 99*，则表明该图片非常有可能属于色情内容；*色情 0*，则表明该图片不属于色情内容。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回分类模型命中子标签的详细信息，如：序号、命中标签名称、分数等信息。 
     * @return Details 该字段用于返回分类模型命中子标签的详细信息，如：序号、命中标签名称、分数等信息。
     */
    public LabelDetailItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set 该字段用于返回分类模型命中子标签的详细信息，如：序号、命中标签名称、分数等信息。
     * @param Details 该字段用于返回分类模型命中子标签的详细信息，如：序号、命中标签名称、分数等信息。
     */
    public void setDetails(LabelDetailItem [] Details) {
        this.Details = Details;
    }

    public LabelResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelResult(LabelResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Details != null) {
            this.Details = new LabelDetailItem[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new LabelDetailItem(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

