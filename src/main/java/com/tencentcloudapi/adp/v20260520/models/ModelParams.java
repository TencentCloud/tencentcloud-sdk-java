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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParams extends AbstractModel {

    /**
    * <p>是否开启深度思考</p>
    */
    @SerializedName("DeepThinking")
    @Expose
    private String DeepThinking;

    /**
    * <p>频率惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrequencyPenalty")
    @Expose
    private Float FrequencyPenalty;

    /**
    * <p>最大输出长度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>存在惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresencePenalty")
    @Expose
    private Float PresencePenalty;

    /**
    * <p>深度思考效果</p>
    */
    @SerializedName("ReasoningEffort")
    @Expose
    private String ReasoningEffort;

    /**
    * <p>重复惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * <p>输出格式（text、json_object）</p>
    */
    @SerializedName("ReplyFormat")
    @Expose
    private String ReplyFormat;

    /**
    * <p>seed 随机种子</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>停止序列</p>
    */
    @SerializedName("StopSequenceList")
    @Expose
    private String [] StopSequenceList;

    /**
    * <p>温度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>top_p</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>top_k</p>
    */
    @SerializedName("TopK")
    @Expose
    private Long TopK;

    /**
     * Get <p>是否开启深度思考</p> 
     * @return DeepThinking <p>是否开启深度思考</p>
     */
    public String getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set <p>是否开启深度思考</p>
     * @param DeepThinking <p>是否开启深度思考</p>
     */
    public void setDeepThinking(String DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get <p>频率惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrequencyPenalty <p>频率惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFrequencyPenalty() {
        return this.FrequencyPenalty;
    }

    /**
     * Set <p>频率惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrequencyPenalty <p>频率惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequencyPenalty(Float FrequencyPenalty) {
        this.FrequencyPenalty = FrequencyPenalty;
    }

    /**
     * Get <p>最大输出长度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTokens <p>最大输出长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>最大输出长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTokens <p>最大输出长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>存在惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresencePenalty <p>存在惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPresencePenalty() {
        return this.PresencePenalty;
    }

    /**
     * Set <p>存在惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresencePenalty <p>存在惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresencePenalty(Float PresencePenalty) {
        this.PresencePenalty = PresencePenalty;
    }

    /**
     * Get <p>深度思考效果</p> 
     * @return ReasoningEffort <p>深度思考效果</p>
     */
    public String getReasoningEffort() {
        return this.ReasoningEffort;
    }

    /**
     * Set <p>深度思考效果</p>
     * @param ReasoningEffort <p>深度思考效果</p>
     */
    public void setReasoningEffort(String ReasoningEffort) {
        this.ReasoningEffort = ReasoningEffort;
    }

    /**
     * Get <p>重复惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepetitionPenalty <p>重复惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set <p>重复惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepetitionPenalty <p>重复惩罚</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get <p>输出格式（text、json_object）</p> 
     * @return ReplyFormat <p>输出格式（text、json_object）</p>
     */
    public String getReplyFormat() {
        return this.ReplyFormat;
    }

    /**
     * Set <p>输出格式（text、json_object）</p>
     * @param ReplyFormat <p>输出格式（text、json_object）</p>
     */
    public void setReplyFormat(String ReplyFormat) {
        this.ReplyFormat = ReplyFormat;
    }

    /**
     * Get <p>seed 随机种子</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seed <p>seed 随机种子</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>seed 随机种子</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seed <p>seed 随机种子</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>停止序列</p> 
     * @return StopSequenceList <p>停止序列</p>
     */
    public String [] getStopSequenceList() {
        return this.StopSequenceList;
    }

    /**
     * Set <p>停止序列</p>
     * @param StopSequenceList <p>停止序列</p>
     */
    public void setStopSequenceList(String [] StopSequenceList) {
        this.StopSequenceList = StopSequenceList;
    }

    /**
     * Get <p>温度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Temperature <p>温度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>温度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Temperature <p>温度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>top_p</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopP <p>top_p</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>top_p</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopP <p>top_p</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>top_k</p> 
     * @return TopK <p>top_k</p>
     */
    public Long getTopK() {
        return this.TopK;
    }

    /**
     * Set <p>top_k</p>
     * @param TopK <p>top_k</p>
     */
    public void setTopK(Long TopK) {
        this.TopK = TopK;
    }

    public ModelParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParams(ModelParams source) {
        if (source.DeepThinking != null) {
            this.DeepThinking = new String(source.DeepThinking);
        }
        if (source.FrequencyPenalty != null) {
            this.FrequencyPenalty = new Float(source.FrequencyPenalty);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.PresencePenalty != null) {
            this.PresencePenalty = new Float(source.PresencePenalty);
        }
        if (source.ReasoningEffort != null) {
            this.ReasoningEffort = new String(source.ReasoningEffort);
        }
        if (source.RepetitionPenalty != null) {
            this.RepetitionPenalty = new Float(source.RepetitionPenalty);
        }
        if (source.ReplyFormat != null) {
            this.ReplyFormat = new String(source.ReplyFormat);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.StopSequenceList != null) {
            this.StopSequenceList = new String[source.StopSequenceList.length];
            for (int i = 0; i < source.StopSequenceList.length; i++) {
                this.StopSequenceList[i] = new String(source.StopSequenceList[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.TopK != null) {
            this.TopK = new Long(source.TopK);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeepThinking", this.DeepThinking);
        this.setParamSimple(map, prefix + "FrequencyPenalty", this.FrequencyPenalty);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "PresencePenalty", this.PresencePenalty);
        this.setParamSimple(map, prefix + "ReasoningEffort", this.ReasoningEffort);
        this.setParamSimple(map, prefix + "RepetitionPenalty", this.RepetitionPenalty);
        this.setParamSimple(map, prefix + "ReplyFormat", this.ReplyFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamArraySimple(map, prefix + "StopSequenceList.", this.StopSequenceList);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "TopK", this.TopK);

    }
}

