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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParams extends AbstractModel {

    /**
    * <p>深度思考值<br>disabled<br>enabled</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeepThinking")
    @Expose
    private String DeepThinking;

    /**
    * <p>频率惩罚</p>
    */
    @SerializedName("FrequencyPenalty")
    @Expose
    private Float FrequencyPenalty;

    /**
    * <p>最大输出长度</p>
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>存在惩罚</p>
    */
    @SerializedName("PresencePenalty")
    @Expose
    private Float PresencePenalty;

    /**
    * <p>效果 disabled low medium high</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningEffort")
    @Expose
    private String ReasoningEffort;

    /**
    * <p>重复惩罚</p>
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * <p>输出格式</p>
    */
    @SerializedName("ReplyFormat")
    @Expose
    private String ReplyFormat;

    /**
    * <p>随机种子</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>停止序列</p>
    */
    @SerializedName("StopSequences")
    @Expose
    private String [] StopSequences;

    /**
    * <p>温度</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>Top_P</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
     * Get <p>深度思考值<br>disabled<br>enabled</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeepThinking <p>深度思考值<br>disabled<br>enabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set <p>深度思考值<br>disabled<br>enabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeepThinking <p>深度思考值<br>disabled<br>enabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeepThinking(String DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get <p>频率惩罚</p> 
     * @return FrequencyPenalty <p>频率惩罚</p>
     */
    public Float getFrequencyPenalty() {
        return this.FrequencyPenalty;
    }

    /**
     * Set <p>频率惩罚</p>
     * @param FrequencyPenalty <p>频率惩罚</p>
     */
    public void setFrequencyPenalty(Float FrequencyPenalty) {
        this.FrequencyPenalty = FrequencyPenalty;
    }

    /**
     * Get <p>最大输出长度</p> 
     * @return MaxTokens <p>最大输出长度</p>
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>最大输出长度</p>
     * @param MaxTokens <p>最大输出长度</p>
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>存在惩罚</p> 
     * @return PresencePenalty <p>存在惩罚</p>
     */
    public Float getPresencePenalty() {
        return this.PresencePenalty;
    }

    /**
     * Set <p>存在惩罚</p>
     * @param PresencePenalty <p>存在惩罚</p>
     */
    public void setPresencePenalty(Float PresencePenalty) {
        this.PresencePenalty = PresencePenalty;
    }

    /**
     * Get <p>效果 disabled low medium high</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningEffort <p>效果 disabled low medium high</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReasoningEffort() {
        return this.ReasoningEffort;
    }

    /**
     * Set <p>效果 disabled low medium high</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningEffort <p>效果 disabled low medium high</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningEffort(String ReasoningEffort) {
        this.ReasoningEffort = ReasoningEffort;
    }

    /**
     * Get <p>重复惩罚</p> 
     * @return RepetitionPenalty <p>重复惩罚</p>
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set <p>重复惩罚</p>
     * @param RepetitionPenalty <p>重复惩罚</p>
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get <p>输出格式</p> 
     * @return ReplyFormat <p>输出格式</p>
     */
    public String getReplyFormat() {
        return this.ReplyFormat;
    }

    /**
     * Set <p>输出格式</p>
     * @param ReplyFormat <p>输出格式</p>
     */
    public void setReplyFormat(String ReplyFormat) {
        this.ReplyFormat = ReplyFormat;
    }

    /**
     * Get <p>随机种子</p> 
     * @return Seed <p>随机种子</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>随机种子</p>
     * @param Seed <p>随机种子</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>停止序列</p> 
     * @return StopSequences <p>停止序列</p>
     */
    public String [] getStopSequences() {
        return this.StopSequences;
    }

    /**
     * Set <p>停止序列</p>
     * @param StopSequences <p>停止序列</p>
     */
    public void setStopSequences(String [] StopSequences) {
        this.StopSequences = StopSequences;
    }

    /**
     * Get <p>温度</p> 
     * @return Temperature <p>温度</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>温度</p>
     * @param Temperature <p>温度</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>Top_P</p> 
     * @return TopP <p>Top_P</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>Top_P</p>
     * @param TopP <p>Top_P</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
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
        if (source.StopSequences != null) {
            this.StopSequences = new String[source.StopSequences.length];
            for (int i = 0; i < source.StopSequences.length; i++) {
                this.StopSequences[i] = new String(source.StopSequences[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
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
        this.setParamArraySimple(map, prefix + "StopSequences.", this.StopSequences);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);

    }
}

