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
    * 温度
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * Top_P
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 随机种子
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * 存在惩罚
    */
    @SerializedName("PresencePenalty")
    @Expose
    private Float PresencePenalty;

    /**
    * 频率惩罚
    */
    @SerializedName("FrequencyPenalty")
    @Expose
    private Float FrequencyPenalty;

    /**
    * 重复惩罚
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * 最大输出长度
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * 停止序列
    */
    @SerializedName("StopSequences")
    @Expose
    private String [] StopSequences;

    /**
    * 输出格式
    */
    @SerializedName("ReplyFormat")
    @Expose
    private String ReplyFormat;

    /**
    * 深度思考值
disabled
enabled
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeepThinking")
    @Expose
    private String DeepThinking;

    /**
    * 效果 disabled low medium high
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningEffort")
    @Expose
    private String ReasoningEffort;

    /**
     * Get 温度 
     * @return Temperature 温度
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 温度
     * @param Temperature 温度
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get Top_P 
     * @return TopP Top_P
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set Top_P
     * @param TopP Top_P
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 随机种子 
     * @return Seed 随机种子
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 随机种子
     * @param Seed 随机种子
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 存在惩罚 
     * @return PresencePenalty 存在惩罚
     */
    public Float getPresencePenalty() {
        return this.PresencePenalty;
    }

    /**
     * Set 存在惩罚
     * @param PresencePenalty 存在惩罚
     */
    public void setPresencePenalty(Float PresencePenalty) {
        this.PresencePenalty = PresencePenalty;
    }

    /**
     * Get 频率惩罚 
     * @return FrequencyPenalty 频率惩罚
     */
    public Float getFrequencyPenalty() {
        return this.FrequencyPenalty;
    }

    /**
     * Set 频率惩罚
     * @param FrequencyPenalty 频率惩罚
     */
    public void setFrequencyPenalty(Float FrequencyPenalty) {
        this.FrequencyPenalty = FrequencyPenalty;
    }

    /**
     * Get 重复惩罚 
     * @return RepetitionPenalty 重复惩罚
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set 重复惩罚
     * @param RepetitionPenalty 重复惩罚
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get 最大输出长度 
     * @return MaxTokens 最大输出长度
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 最大输出长度
     * @param MaxTokens 最大输出长度
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get 停止序列 
     * @return StopSequences 停止序列
     */
    public String [] getStopSequences() {
        return this.StopSequences;
    }

    /**
     * Set 停止序列
     * @param StopSequences 停止序列
     */
    public void setStopSequences(String [] StopSequences) {
        this.StopSequences = StopSequences;
    }

    /**
     * Get 输出格式 
     * @return ReplyFormat 输出格式
     */
    public String getReplyFormat() {
        return this.ReplyFormat;
    }

    /**
     * Set 输出格式
     * @param ReplyFormat 输出格式
     */
    public void setReplyFormat(String ReplyFormat) {
        this.ReplyFormat = ReplyFormat;
    }

    /**
     * Get 深度思考值
disabled
enabled
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeepThinking 深度思考值
disabled
enabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set 深度思考值
disabled
enabled
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeepThinking 深度思考值
disabled
enabled
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeepThinking(String DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get 效果 disabled low medium high
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningEffort 效果 disabled low medium high
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReasoningEffort() {
        return this.ReasoningEffort;
    }

    /**
     * Set 效果 disabled low medium high
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningEffort 效果 disabled low medium high
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningEffort(String ReasoningEffort) {
        this.ReasoningEffort = ReasoningEffort;
    }

    public ModelParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParams(ModelParams source) {
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.PresencePenalty != null) {
            this.PresencePenalty = new Float(source.PresencePenalty);
        }
        if (source.FrequencyPenalty != null) {
            this.FrequencyPenalty = new Float(source.FrequencyPenalty);
        }
        if (source.RepetitionPenalty != null) {
            this.RepetitionPenalty = new Float(source.RepetitionPenalty);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.StopSequences != null) {
            this.StopSequences = new String[source.StopSequences.length];
            for (int i = 0; i < source.StopSequences.length; i++) {
                this.StopSequences[i] = new String(source.StopSequences[i]);
            }
        }
        if (source.ReplyFormat != null) {
            this.ReplyFormat = new String(source.ReplyFormat);
        }
        if (source.DeepThinking != null) {
            this.DeepThinking = new String(source.DeepThinking);
        }
        if (source.ReasoningEffort != null) {
            this.ReasoningEffort = new String(source.ReasoningEffort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "PresencePenalty", this.PresencePenalty);
        this.setParamSimple(map, prefix + "FrequencyPenalty", this.FrequencyPenalty);
        this.setParamSimple(map, prefix + "RepetitionPenalty", this.RepetitionPenalty);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamArraySimple(map, prefix + "StopSequences.", this.StopSequences);
        this.setParamSimple(map, prefix + "ReplyFormat", this.ReplyFormat);
        this.setParamSimple(map, prefix + "DeepThinking", this.DeepThinking);
        this.setParamSimple(map, prefix + "ReasoningEffort", this.ReasoningEffort);

    }
}

