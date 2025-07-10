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

public class AgentModelInfo extends AbstractModel {

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型别名
    */
    @SerializedName("ModelAliasName")
    @Expose
    private String ModelAliasName;

    /**
    * 模型温度
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 模型TopP
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 模型是否可用
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * 对话历史条数限制
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * 模型上下文长度字符限制
    */
    @SerializedName("ModelContextWordsLimit")
    @Expose
    private String ModelContextWordsLimit;

    /**
    * 指令长度字符限制
    */
    @SerializedName("InstructionsWordsLimit")
    @Expose
    private Long InstructionsWordsLimit;

    /**
    * 单次会话最大推理轮数
    */
    @SerializedName("MaxReasoningRound")
    @Expose
    private Long MaxReasoningRound;

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型别名 
     * @return ModelAliasName 模型别名
     */
    public String getModelAliasName() {
        return this.ModelAliasName;
    }

    /**
     * Set 模型别名
     * @param ModelAliasName 模型别名
     */
    public void setModelAliasName(String ModelAliasName) {
        this.ModelAliasName = ModelAliasName;
    }

    /**
     * Get 模型温度 
     * @return Temperature 模型温度
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 模型温度
     * @param Temperature 模型温度
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 模型TopP 
     * @return TopP 模型TopP
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 模型TopP
     * @param TopP 模型TopP
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 模型是否可用 
     * @return IsEnabled 模型是否可用
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 模型是否可用
     * @param IsEnabled 模型是否可用
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 对话历史条数限制 
     * @return HistoryLimit 对话历史条数限制
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set 对话历史条数限制
     * @param HistoryLimit 对话历史条数限制
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get 模型上下文长度字符限制 
     * @return ModelContextWordsLimit 模型上下文长度字符限制
     */
    public String getModelContextWordsLimit() {
        return this.ModelContextWordsLimit;
    }

    /**
     * Set 模型上下文长度字符限制
     * @param ModelContextWordsLimit 模型上下文长度字符限制
     */
    public void setModelContextWordsLimit(String ModelContextWordsLimit) {
        this.ModelContextWordsLimit = ModelContextWordsLimit;
    }

    /**
     * Get 指令长度字符限制 
     * @return InstructionsWordsLimit 指令长度字符限制
     */
    public Long getInstructionsWordsLimit() {
        return this.InstructionsWordsLimit;
    }

    /**
     * Set 指令长度字符限制
     * @param InstructionsWordsLimit 指令长度字符限制
     */
    public void setInstructionsWordsLimit(Long InstructionsWordsLimit) {
        this.InstructionsWordsLimit = InstructionsWordsLimit;
    }

    /**
     * Get 单次会话最大推理轮数 
     * @return MaxReasoningRound 单次会话最大推理轮数
     */
    public Long getMaxReasoningRound() {
        return this.MaxReasoningRound;
    }

    /**
     * Set 单次会话最大推理轮数
     * @param MaxReasoningRound 单次会话最大推理轮数
     */
    public void setMaxReasoningRound(Long MaxReasoningRound) {
        this.MaxReasoningRound = MaxReasoningRound;
    }

    public AgentModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentModelInfo(AgentModelInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelAliasName != null) {
            this.ModelAliasName = new String(source.ModelAliasName);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.ModelContextWordsLimit != null) {
            this.ModelContextWordsLimit = new String(source.ModelContextWordsLimit);
        }
        if (source.InstructionsWordsLimit != null) {
            this.InstructionsWordsLimit = new Long(source.InstructionsWordsLimit);
        }
        if (source.MaxReasoningRound != null) {
            this.MaxReasoningRound = new Long(source.MaxReasoningRound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelAliasName", this.ModelAliasName);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "ModelContextWordsLimit", this.ModelContextWordsLimit);
        this.setParamSimple(map, prefix + "InstructionsWordsLimit", this.InstructionsWordsLimit);
        this.setParamSimple(map, prefix + "MaxReasoningRound", this.MaxReasoningRound);

    }
}

