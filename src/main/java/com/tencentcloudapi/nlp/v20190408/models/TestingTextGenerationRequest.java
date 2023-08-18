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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestingTextGenerationRequest extends AbstractModel{

    /**
    * 会话内容,按对话时间从旧到新在数组中排列。
    */
    @SerializedName("Messages")
    @Expose
    private TextGenerationMessage [] Messages;

    /**
    * 模型名称，当前固定为TestingModel
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 会话id。
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * 超参数temperature, 该参数用于控制生成文本中重复内容。取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果。默认为1.0。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 超参数top_p, 该参数用于控制生成文本的多样性。较小的"top_p"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_p"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果。默认值为1.0。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 超参数top_k,该参数用于控制生成文本的多样性和可控性，较小的"top_k"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_k"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[1, 100]，默认值 40。
    */
    @SerializedName("TopK")
    @Expose
    private Float TopK;

    /**
    * 重复惩罚项,该参数用于用于控制生成文本中重复内容。建议范围[1.0, 1.05]非必要不建议使用, 不合理的取值会影响效果。默认为1。
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * 输出结果最大tokens数量。取值区间为(0, 1024]。默认值为768。
    */
    @SerializedName("OutputSeqLen")
    @Expose
    private Long OutputSeqLen;

    /**
    * 输入文本的最大 tokens 数量。取值区间为(0, 1024]。默认值为256。
    */
    @SerializedName("MaxInputSeqLen")
    @Expose
    private Long MaxInputSeqLen;

    /**
     * Get 会话内容,按对话时间从旧到新在数组中排列。 
     * @return Messages 会话内容,按对话时间从旧到新在数组中排列。
     */
    public TextGenerationMessage [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 会话内容,按对话时间从旧到新在数组中排列。
     * @param Messages 会话内容,按对话时间从旧到新在数组中排列。
     */
    public void setMessages(TextGenerationMessage [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 模型名称，当前固定为TestingModel 
     * @return Model 模型名称，当前固定为TestingModel
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称，当前固定为TestingModel
     * @param Model 模型名称，当前固定为TestingModel
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 会话id。 
     * @return QueryId 会话id。
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set 会话id。
     * @param QueryId 会话id。
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get 超参数temperature, 该参数用于控制生成文本中重复内容。取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果。默认为1.0。 
     * @return Temperature 超参数temperature, 该参数用于控制生成文本中重复内容。取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果。默认为1.0。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 超参数temperature, 该参数用于控制生成文本中重复内容。取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果。默认为1.0。
     * @param Temperature 超参数temperature, 该参数用于控制生成文本中重复内容。取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果。默认为1.0。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 超参数top_p, 该参数用于控制生成文本的多样性。较小的"top_p"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_p"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果。默认值为1.0。 
     * @return TopP 超参数top_p, 该参数用于控制生成文本的多样性。较小的"top_p"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_p"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果。默认值为1.0。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 超参数top_p, 该参数用于控制生成文本的多样性。较小的"top_p"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_p"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果。默认值为1.0。
     * @param TopP 超参数top_p, 该参数用于控制生成文本的多样性。较小的"top_p"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_p"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果。默认值为1.0。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 超参数top_k,该参数用于控制生成文本的多样性和可控性，较小的"top_k"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_k"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[1, 100]，默认值 40。 
     * @return TopK 超参数top_k,该参数用于控制生成文本的多样性和可控性，较小的"top_k"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_k"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[1, 100]，默认值 40。
     */
    public Float getTopK() {
        return this.TopK;
    }

    /**
     * Set 超参数top_k,该参数用于控制生成文本的多样性和可控性，较小的"top_k"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_k"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[1, 100]，默认值 40。
     * @param TopK 超参数top_k,该参数用于控制生成文本的多样性和可控性，较小的"top_k"值会限制模型的选择范围，使生成的文本更加一致和确定性。较大的"top_k"值会扩大选择范围，使生成的文本更加多样化和随机。取值区间为[1, 100]，默认值 40。
     */
    public void setTopK(Float TopK) {
        this.TopK = TopK;
    }

    /**
     * Get 重复惩罚项,该参数用于用于控制生成文本中重复内容。建议范围[1.0, 1.05]非必要不建议使用, 不合理的取值会影响效果。默认为1。 
     * @return RepetitionPenalty 重复惩罚项,该参数用于用于控制生成文本中重复内容。建议范围[1.0, 1.05]非必要不建议使用, 不合理的取值会影响效果。默认为1。
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set 重复惩罚项,该参数用于用于控制生成文本中重复内容。建议范围[1.0, 1.05]非必要不建议使用, 不合理的取值会影响效果。默认为1。
     * @param RepetitionPenalty 重复惩罚项,该参数用于用于控制生成文本中重复内容。建议范围[1.0, 1.05]非必要不建议使用, 不合理的取值会影响效果。默认为1。
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get 输出结果最大tokens数量。取值区间为(0, 1024]。默认值为768。 
     * @return OutputSeqLen 输出结果最大tokens数量。取值区间为(0, 1024]。默认值为768。
     */
    public Long getOutputSeqLen() {
        return this.OutputSeqLen;
    }

    /**
     * Set 输出结果最大tokens数量。取值区间为(0, 1024]。默认值为768。
     * @param OutputSeqLen 输出结果最大tokens数量。取值区间为(0, 1024]。默认值为768。
     */
    public void setOutputSeqLen(Long OutputSeqLen) {
        this.OutputSeqLen = OutputSeqLen;
    }

    /**
     * Get 输入文本的最大 tokens 数量。取值区间为(0, 1024]。默认值为256。 
     * @return MaxInputSeqLen 输入文本的最大 tokens 数量。取值区间为(0, 1024]。默认值为256。
     */
    public Long getMaxInputSeqLen() {
        return this.MaxInputSeqLen;
    }

    /**
     * Set 输入文本的最大 tokens 数量。取值区间为(0, 1024]。默认值为256。
     * @param MaxInputSeqLen 输入文本的最大 tokens 数量。取值区间为(0, 1024]。默认值为256。
     */
    public void setMaxInputSeqLen(Long MaxInputSeqLen) {
        this.MaxInputSeqLen = MaxInputSeqLen;
    }

    public TestingTextGenerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestingTextGenerationRequest(TestingTextGenerationRequest source) {
        if (source.Messages != null) {
            this.Messages = new TextGenerationMessage[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new TextGenerationMessage(source.Messages[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.TopK != null) {
            this.TopK = new Float(source.TopK);
        }
        if (source.RepetitionPenalty != null) {
            this.RepetitionPenalty = new Float(source.RepetitionPenalty);
        }
        if (source.OutputSeqLen != null) {
            this.OutputSeqLen = new Long(source.OutputSeqLen);
        }
        if (source.MaxInputSeqLen != null) {
            this.MaxInputSeqLen = new Long(source.MaxInputSeqLen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "TopK", this.TopK);
        this.setParamSimple(map, prefix + "RepetitionPenalty", this.RepetitionPenalty);
        this.setParamSimple(map, prefix + "OutputSeqLen", this.OutputSeqLen);
        this.setParamSimple(map, prefix + "MaxInputSeqLen", this.MaxInputSeqLen);

    }
}

