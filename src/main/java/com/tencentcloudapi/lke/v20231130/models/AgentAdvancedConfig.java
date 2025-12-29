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

public class AgentAdvancedConfig extends AbstractModel {

    /**
    * 是否开启澄清询问
    */
    @SerializedName("EnableClarification")
    @Expose
    private Boolean EnableClarification;

    /**
    * 思考模式，0为效果优先，1为速度优先
    */
    @SerializedName("ThinkingMode")
    @Expose
    private Long ThinkingMode;

    /**
    * 最大推理轮数
    */
    @SerializedName("MaxReasoningRound")
    @Expose
    private Long MaxReasoningRound;

    /**
    * 上下文轮数
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * 是否开启结构化输出
    */
    @SerializedName("EnableStructuredOutput")
    @Expose
    private Boolean EnableStructuredOutput;

    /**
    * 结构化输出配置
    */
    @SerializedName("StructuredOutputConfig")
    @Expose
    private StructuredOutputConfig StructuredOutputConfig;

    /**
    * Agent输出配置
    */
    @SerializedName("AgentOutputConfig")
    @Expose
    private AgentOutputConfig AgentOutputConfig;

    /**
    * 澄清询问配置
    */
    @SerializedName("ClarificationConfig")
    @Expose
    private ClarificationConfig ClarificationConfig;

    /**
     * Get 是否开启澄清询问 
     * @return EnableClarification 是否开启澄清询问
     */
    public Boolean getEnableClarification() {
        return this.EnableClarification;
    }

    /**
     * Set 是否开启澄清询问
     * @param EnableClarification 是否开启澄清询问
     */
    public void setEnableClarification(Boolean EnableClarification) {
        this.EnableClarification = EnableClarification;
    }

    /**
     * Get 思考模式，0为效果优先，1为速度优先 
     * @return ThinkingMode 思考模式，0为效果优先，1为速度优先
     */
    public Long getThinkingMode() {
        return this.ThinkingMode;
    }

    /**
     * Set 思考模式，0为效果优先，1为速度优先
     * @param ThinkingMode 思考模式，0为效果优先，1为速度优先
     */
    public void setThinkingMode(Long ThinkingMode) {
        this.ThinkingMode = ThinkingMode;
    }

    /**
     * Get 最大推理轮数 
     * @return MaxReasoningRound 最大推理轮数
     */
    public Long getMaxReasoningRound() {
        return this.MaxReasoningRound;
    }

    /**
     * Set 最大推理轮数
     * @param MaxReasoningRound 最大推理轮数
     */
    public void setMaxReasoningRound(Long MaxReasoningRound) {
        this.MaxReasoningRound = MaxReasoningRound;
    }

    /**
     * Get 上下文轮数 
     * @return HistoryLimit 上下文轮数
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set 上下文轮数
     * @param HistoryLimit 上下文轮数
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get 是否开启结构化输出 
     * @return EnableStructuredOutput 是否开启结构化输出
     */
    public Boolean getEnableStructuredOutput() {
        return this.EnableStructuredOutput;
    }

    /**
     * Set 是否开启结构化输出
     * @param EnableStructuredOutput 是否开启结构化输出
     */
    public void setEnableStructuredOutput(Boolean EnableStructuredOutput) {
        this.EnableStructuredOutput = EnableStructuredOutput;
    }

    /**
     * Get 结构化输出配置 
     * @return StructuredOutputConfig 结构化输出配置
     */
    public StructuredOutputConfig getStructuredOutputConfig() {
        return this.StructuredOutputConfig;
    }

    /**
     * Set 结构化输出配置
     * @param StructuredOutputConfig 结构化输出配置
     */
    public void setStructuredOutputConfig(StructuredOutputConfig StructuredOutputConfig) {
        this.StructuredOutputConfig = StructuredOutputConfig;
    }

    /**
     * Get Agent输出配置 
     * @return AgentOutputConfig Agent输出配置
     */
    public AgentOutputConfig getAgentOutputConfig() {
        return this.AgentOutputConfig;
    }

    /**
     * Set Agent输出配置
     * @param AgentOutputConfig Agent输出配置
     */
    public void setAgentOutputConfig(AgentOutputConfig AgentOutputConfig) {
        this.AgentOutputConfig = AgentOutputConfig;
    }

    /**
     * Get 澄清询问配置 
     * @return ClarificationConfig 澄清询问配置
     */
    public ClarificationConfig getClarificationConfig() {
        return this.ClarificationConfig;
    }

    /**
     * Set 澄清询问配置
     * @param ClarificationConfig 澄清询问配置
     */
    public void setClarificationConfig(ClarificationConfig ClarificationConfig) {
        this.ClarificationConfig = ClarificationConfig;
    }

    public AgentAdvancedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAdvancedConfig(AgentAdvancedConfig source) {
        if (source.EnableClarification != null) {
            this.EnableClarification = new Boolean(source.EnableClarification);
        }
        if (source.ThinkingMode != null) {
            this.ThinkingMode = new Long(source.ThinkingMode);
        }
        if (source.MaxReasoningRound != null) {
            this.MaxReasoningRound = new Long(source.MaxReasoningRound);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.EnableStructuredOutput != null) {
            this.EnableStructuredOutput = new Boolean(source.EnableStructuredOutput);
        }
        if (source.StructuredOutputConfig != null) {
            this.StructuredOutputConfig = new StructuredOutputConfig(source.StructuredOutputConfig);
        }
        if (source.AgentOutputConfig != null) {
            this.AgentOutputConfig = new AgentOutputConfig(source.AgentOutputConfig);
        }
        if (source.ClarificationConfig != null) {
            this.ClarificationConfig = new ClarificationConfig(source.ClarificationConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableClarification", this.EnableClarification);
        this.setParamSimple(map, prefix + "ThinkingMode", this.ThinkingMode);
        this.setParamSimple(map, prefix + "MaxReasoningRound", this.MaxReasoningRound);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "EnableStructuredOutput", this.EnableStructuredOutput);
        this.setParamObj(map, prefix + "StructuredOutputConfig.", this.StructuredOutputConfig);
        this.setParamObj(map, prefix + "AgentOutputConfig.", this.AgentOutputConfig);
        this.setParamObj(map, prefix + "ClarificationConfig.", this.ClarificationConfig);

    }
}

