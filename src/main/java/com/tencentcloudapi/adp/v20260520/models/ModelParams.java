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
    * 是否开启深度思考
    */
    @SerializedName("DeepThinking")
    @Expose
    private String DeepThinking;

    /**
    * 频率惩罚
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrequencyPenalty")
    @Expose
    private Float FrequencyPenalty;

    /**
    * 最大输出长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * 存在惩罚
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresencePenalty")
    @Expose
    private Float PresencePenalty;

    /**
    * 深度思考效果
    */
    @SerializedName("ReasoningEffort")
    @Expose
    private String ReasoningEffort;

    /**
    * 重复惩罚
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * 输出格式（text、json_object）
    */
    @SerializedName("ReplyFormat")
    @Expose
    private String ReplyFormat;

    /**
    * seed 随机种子
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * 停止序列
    */
    @SerializedName("StopSequenceList")
    @Expose
    private String [] StopSequenceList;

    /**
    * 温度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * top_p
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
     * Get 是否开启深度思考 
     * @return DeepThinking 是否开启深度思考
     */
    public String getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set 是否开启深度思考
     * @param DeepThinking 是否开启深度思考
     */
    public void setDeepThinking(String DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get 频率惩罚
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrequencyPenalty 频率惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFrequencyPenalty() {
        return this.FrequencyPenalty;
    }

    /**
     * Set 频率惩罚
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrequencyPenalty 频率惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequencyPenalty(Float FrequencyPenalty) {
        this.FrequencyPenalty = FrequencyPenalty;
    }

    /**
     * Get 最大输出长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTokens 最大输出长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 最大输出长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTokens 最大输出长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get 存在惩罚
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresencePenalty 存在惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPresencePenalty() {
        return this.PresencePenalty;
    }

    /**
     * Set 存在惩罚
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresencePenalty 存在惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresencePenalty(Float PresencePenalty) {
        this.PresencePenalty = PresencePenalty;
    }

    /**
     * Get 深度思考效果 
     * @return ReasoningEffort 深度思考效果
     */
    public String getReasoningEffort() {
        return this.ReasoningEffort;
    }

    /**
     * Set 深度思考效果
     * @param ReasoningEffort 深度思考效果
     */
    public void setReasoningEffort(String ReasoningEffort) {
        this.ReasoningEffort = ReasoningEffort;
    }

    /**
     * Get 重复惩罚
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepetitionPenalty 重复惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set 重复惩罚
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepetitionPenalty 重复惩罚
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get 输出格式（text、json_object） 
     * @return ReplyFormat 输出格式（text、json_object）
     */
    public String getReplyFormat() {
        return this.ReplyFormat;
    }

    /**
     * Set 输出格式（text、json_object）
     * @param ReplyFormat 输出格式（text、json_object）
     */
    public void setReplyFormat(String ReplyFormat) {
        this.ReplyFormat = ReplyFormat;
    }

    /**
     * Get seed 随机种子
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seed seed 随机种子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set seed 随机种子
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seed seed 随机种子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 停止序列 
     * @return StopSequenceList 停止序列
     */
    public String [] getStopSequenceList() {
        return this.StopSequenceList;
    }

    /**
     * Set 停止序列
     * @param StopSequenceList 停止序列
     */
    public void setStopSequenceList(String [] StopSequenceList) {
        this.StopSequenceList = StopSequenceList;
    }

    /**
     * Get 温度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Temperature 温度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 温度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Temperature 温度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get top_p
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopP top_p
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set top_p
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopP top_p
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

