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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModerationDetail extends AbstractModel {

    /**
    * 审核建议，Block表示建议拦截，Review表示建议人工复审，Pass表示建议放行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 命中标签，含标签码和一二三级标签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private LabelGrade Label;

    /**
    * 标签得分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * label对应腾讯侧命中标签码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcLabelCodes")
    @Expose
    private String [] TcLabelCodes;

    /**
    * 库检测命中详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibResults")
    @Expose
    private LibCheckResult [] LibResults;

    /**
    * 模型检测详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelResults")
    @Expose
    private ModelResult [] ModelResults;

    /**
    * 情绪正负向检测结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentimentResult")
    @Expose
    private SentimentDetail SentimentResult;

    /**
     * Get 审核建议，Block表示建议拦截，Review表示建议人工复审，Pass表示建议放行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 审核建议，Block表示建议拦截，Review表示建议人工复审，Pass表示建议放行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核建议，Block表示建议拦截，Review表示建议人工复审，Pass表示建议放行
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 审核建议，Block表示建议拦截，Review表示建议人工复审，Pass表示建议放行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 命中标签，含标签码和一二三级标签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 命中标签，含标签码和一二三级标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelGrade getLabel() {
        return this.Label;
    }

    /**
     * Set 命中标签，含标签码和一二三级标签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 命中标签，含标签码和一二三级标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(LabelGrade Label) {
        this.Label = Label;
    }

    /**
     * Get 标签得分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 标签得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 标签得分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 标签得分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get label对应腾讯侧命中标签码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcLabelCodes label对应腾讯侧命中标签码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTcLabelCodes() {
        return this.TcLabelCodes;
    }

    /**
     * Set label对应腾讯侧命中标签码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcLabelCodes label对应腾讯侧命中标签码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcLabelCodes(String [] TcLabelCodes) {
        this.TcLabelCodes = TcLabelCodes;
    }

    /**
     * Get 库检测命中详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibResults 库检测命中详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LibCheckResult [] getLibResults() {
        return this.LibResults;
    }

    /**
     * Set 库检测命中详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibResults 库检测命中详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibResults(LibCheckResult [] LibResults) {
        this.LibResults = LibResults;
    }

    /**
     * Get 模型检测详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelResults 模型检测详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelResult [] getModelResults() {
        return this.ModelResults;
    }

    /**
     * Set 模型检测详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelResults 模型检测详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelResults(ModelResult [] ModelResults) {
        this.ModelResults = ModelResults;
    }

    /**
     * Get 情绪正负向检测结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentimentResult 情绪正负向检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentimentDetail getSentimentResult() {
        return this.SentimentResult;
    }

    /**
     * Set 情绪正负向检测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentimentResult 情绪正负向检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSentimentResult(SentimentDetail SentimentResult) {
        this.SentimentResult = SentimentResult;
    }

    public ModerationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationDetail(ModerationDetail source) {
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new LabelGrade(source.Label);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.TcLabelCodes != null) {
            this.TcLabelCodes = new String[source.TcLabelCodes.length];
            for (int i = 0; i < source.TcLabelCodes.length; i++) {
                this.TcLabelCodes[i] = new String(source.TcLabelCodes[i]);
            }
        }
        if (source.LibResults != null) {
            this.LibResults = new LibCheckResult[source.LibResults.length];
            for (int i = 0; i < source.LibResults.length; i++) {
                this.LibResults[i] = new LibCheckResult(source.LibResults[i]);
            }
        }
        if (source.ModelResults != null) {
            this.ModelResults = new ModelResult[source.ModelResults.length];
            for (int i = 0; i < source.ModelResults.length; i++) {
                this.ModelResults[i] = new ModelResult(source.ModelResults[i]);
            }
        }
        if (source.SentimentResult != null) {
            this.SentimentResult = new SentimentDetail(source.SentimentResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "TcLabelCodes.", this.TcLabelCodes);
        this.setParamArrayObj(map, prefix + "LibResults.", this.LibResults);
        this.setParamArrayObj(map, prefix + "ModelResults.", this.ModelResults);
        this.setParamObj(map, prefix + "SentimentResult.", this.SentimentResult);

    }
}

