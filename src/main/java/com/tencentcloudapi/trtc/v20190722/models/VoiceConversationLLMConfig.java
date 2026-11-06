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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationLLMConfig extends AbstractModel {

    /**
    * <p>LLM 协议类型，如openai（OpenAI 兼容协议）。</p>
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * <p>模型名，如 gpt-4o-mini</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>OpenAI 协议兼容的 endpoint。</p>
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * <p>厂商 API Key。</p>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>系统提示词。</p>
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * <p>LLM 调用失败后，使用此文本生成 TTS音频。</p>
    */
    @SerializedName("FailureMessage")
    @Expose
    private String FailureMessage;

    /**
    * <p>单次回复最大 Token 数，0=不限制，默认值为0。注意：如果模型输出token数量大于设置的MaxTokens的值，会截断回复内容。</p>
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>是否开启思考模式（需结合提供厂商具体使用）。注意：开启思考模式会占用输出token数。</p>
    */
    @SerializedName("ThinkingMode")
    @Expose
    private Boolean ThinkingMode;

    /**
    * <p>LLM 中缓存的对话轮次数量，范围 0~50。建议值[10, 30]。注意：指定轮次上下文的总 token 数不能超过 LLM 支持的上限。</p>
    */
    @SerializedName("MaxHistory")
    @Expose
    private Long MaxHistory;

    /**
    * <p>MCP 工具调用最大轮次，范围 0~50，默认 10。</p>
    */
    @SerializedName("MaxToolRound")
    @Expose
    private Long MaxToolRound;

    /**
    * <p>单次请求的超时事件（毫秒），范围 1000~60000，默认 10000。</p><p>单位：毫秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>采样温度，范围 0.0~2.0，默认 1.0。</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>采样概率，范围 0.0~1.0，默认 1.0。</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>Mcp Server参数。</p>
    */
    @SerializedName("McpServer")
    @Expose
    private VoiceConversationMcpServer McpServer;

    /**
    * <p>自定义 HTTP 请求头。</p>
    */
    @SerializedName("CustomHeaders")
    @Expose
    private KeyValueItem [] CustomHeaders;

    /**
    * <p>各厂商独有的扩展参数（如 DeepSeek 的<code>reasoning_effort</code>、混元的 <code>enable_enhancement</code> 等）。</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private KeyValueItem [] CustomFields;

    /**
    * <p>初始历史消息，每项为 <code>{&quot;Role&quot;: &quot;user&quot;/&quot;assistant&quot;/&quot;system&quot;, &quot;Content&quot;: &quot;xxx&quot;}</code>这种格式。</p>
    */
    @SerializedName("HistoryMessages")
    @Expose
    private VoiceConversationHistoryMessage [] HistoryMessages;

    /**
     * Get <p>LLM 协议类型，如openai（OpenAI 兼容协议）。</p> 
     * @return LLMType <p>LLM 协议类型，如openai（OpenAI 兼容协议）。</p>
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set <p>LLM 协议类型，如openai（OpenAI 兼容协议）。</p>
     * @param LLMType <p>LLM 协议类型，如openai（OpenAI 兼容协议）。</p>
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get <p>模型名，如 gpt-4o-mini</p> 
     * @return Model <p>模型名，如 gpt-4o-mini</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名，如 gpt-4o-mini</p>
     * @param Model <p>模型名，如 gpt-4o-mini</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>OpenAI 协议兼容的 endpoint。</p> 
     * @return APIUrl <p>OpenAI 协议兼容的 endpoint。</p>
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set <p>OpenAI 协议兼容的 endpoint。</p>
     * @param APIUrl <p>OpenAI 协议兼容的 endpoint。</p>
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get <p>厂商 API Key。</p> 
     * @return APIKey <p>厂商 API Key。</p>
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>厂商 API Key。</p>
     * @param APIKey <p>厂商 API Key。</p>
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>系统提示词。</p> 
     * @return SystemPrompt <p>系统提示词。</p>
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set <p>系统提示词。</p>
     * @param SystemPrompt <p>系统提示词。</p>
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get <p>LLM 调用失败后，使用此文本生成 TTS音频。</p> 
     * @return FailureMessage <p>LLM 调用失败后，使用此文本生成 TTS音频。</p>
     */
    public String getFailureMessage() {
        return this.FailureMessage;
    }

    /**
     * Set <p>LLM 调用失败后，使用此文本生成 TTS音频。</p>
     * @param FailureMessage <p>LLM 调用失败后，使用此文本生成 TTS音频。</p>
     */
    public void setFailureMessage(String FailureMessage) {
        this.FailureMessage = FailureMessage;
    }

    /**
     * Get <p>单次回复最大 Token 数，0=不限制，默认值为0。注意：如果模型输出token数量大于设置的MaxTokens的值，会截断回复内容。</p> 
     * @return MaxTokens <p>单次回复最大 Token 数，0=不限制，默认值为0。注意：如果模型输出token数量大于设置的MaxTokens的值，会截断回复内容。</p>
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>单次回复最大 Token 数，0=不限制，默认值为0。注意：如果模型输出token数量大于设置的MaxTokens的值，会截断回复内容。</p>
     * @param MaxTokens <p>单次回复最大 Token 数，0=不限制，默认值为0。注意：如果模型输出token数量大于设置的MaxTokens的值，会截断回复内容。</p>
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>是否开启思考模式（需结合提供厂商具体使用）。注意：开启思考模式会占用输出token数。</p> 
     * @return ThinkingMode <p>是否开启思考模式（需结合提供厂商具体使用）。注意：开启思考模式会占用输出token数。</p>
     */
    public Boolean getThinkingMode() {
        return this.ThinkingMode;
    }

    /**
     * Set <p>是否开启思考模式（需结合提供厂商具体使用）。注意：开启思考模式会占用输出token数。</p>
     * @param ThinkingMode <p>是否开启思考模式（需结合提供厂商具体使用）。注意：开启思考模式会占用输出token数。</p>
     */
    public void setThinkingMode(Boolean ThinkingMode) {
        this.ThinkingMode = ThinkingMode;
    }

    /**
     * Get <p>LLM 中缓存的对话轮次数量，范围 0~50。建议值[10, 30]。注意：指定轮次上下文的总 token 数不能超过 LLM 支持的上限。</p> 
     * @return MaxHistory <p>LLM 中缓存的对话轮次数量，范围 0~50。建议值[10, 30]。注意：指定轮次上下文的总 token 数不能超过 LLM 支持的上限。</p>
     */
    public Long getMaxHistory() {
        return this.MaxHistory;
    }

    /**
     * Set <p>LLM 中缓存的对话轮次数量，范围 0~50。建议值[10, 30]。注意：指定轮次上下文的总 token 数不能超过 LLM 支持的上限。</p>
     * @param MaxHistory <p>LLM 中缓存的对话轮次数量，范围 0~50。建议值[10, 30]。注意：指定轮次上下文的总 token 数不能超过 LLM 支持的上限。</p>
     */
    public void setMaxHistory(Long MaxHistory) {
        this.MaxHistory = MaxHistory;
    }

    /**
     * Get <p>MCP 工具调用最大轮次，范围 0~50，默认 10。</p> 
     * @return MaxToolRound <p>MCP 工具调用最大轮次，范围 0~50，默认 10。</p>
     */
    public Long getMaxToolRound() {
        return this.MaxToolRound;
    }

    /**
     * Set <p>MCP 工具调用最大轮次，范围 0~50，默认 10。</p>
     * @param MaxToolRound <p>MCP 工具调用最大轮次，范围 0~50，默认 10。</p>
     */
    public void setMaxToolRound(Long MaxToolRound) {
        this.MaxToolRound = MaxToolRound;
    }

    /**
     * Get <p>单次请求的超时事件（毫秒），范围 1000~60000，默认 10000。</p><p>单位：毫秒</p> 
     * @return Timeout <p>单次请求的超时事件（毫秒），范围 1000~60000，默认 10000。</p><p>单位：毫秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>单次请求的超时事件（毫秒），范围 1000~60000，默认 10000。</p><p>单位：毫秒</p>
     * @param Timeout <p>单次请求的超时事件（毫秒），范围 1000~60000，默认 10000。</p><p>单位：毫秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>采样温度，范围 0.0~2.0，默认 1.0。</p> 
     * @return Temperature <p>采样温度，范围 0.0~2.0，默认 1.0。</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>采样温度，范围 0.0~2.0，默认 1.0。</p>
     * @param Temperature <p>采样温度，范围 0.0~2.0，默认 1.0。</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>采样概率，范围 0.0~1.0，默认 1.0。</p> 
     * @return TopP <p>采样概率，范围 0.0~1.0，默认 1.0。</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>采样概率，范围 0.0~1.0，默认 1.0。</p>
     * @param TopP <p>采样概率，范围 0.0~1.0，默认 1.0。</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>Mcp Server参数。</p> 
     * @return McpServer <p>Mcp Server参数。</p>
     */
    public VoiceConversationMcpServer getMcpServer() {
        return this.McpServer;
    }

    /**
     * Set <p>Mcp Server参数。</p>
     * @param McpServer <p>Mcp Server参数。</p>
     */
    public void setMcpServer(VoiceConversationMcpServer McpServer) {
        this.McpServer = McpServer;
    }

    /**
     * Get <p>自定义 HTTP 请求头。</p> 
     * @return CustomHeaders <p>自定义 HTTP 请求头。</p>
     */
    public KeyValueItem [] getCustomHeaders() {
        return this.CustomHeaders;
    }

    /**
     * Set <p>自定义 HTTP 请求头。</p>
     * @param CustomHeaders <p>自定义 HTTP 请求头。</p>
     */
    public void setCustomHeaders(KeyValueItem [] CustomHeaders) {
        this.CustomHeaders = CustomHeaders;
    }

    /**
     * Get <p>各厂商独有的扩展参数（如 DeepSeek 的<code>reasoning_effort</code>、混元的 <code>enable_enhancement</code> 等）。</p> 
     * @return CustomFields <p>各厂商独有的扩展参数（如 DeepSeek 的<code>reasoning_effort</code>、混元的 <code>enable_enhancement</code> 等）。</p>
     */
    public KeyValueItem [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>各厂商独有的扩展参数（如 DeepSeek 的<code>reasoning_effort</code>、混元的 <code>enable_enhancement</code> 等）。</p>
     * @param CustomFields <p>各厂商独有的扩展参数（如 DeepSeek 的<code>reasoning_effort</code>、混元的 <code>enable_enhancement</code> 等）。</p>
     */
    public void setCustomFields(KeyValueItem [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>初始历史消息，每项为 <code>{&quot;Role&quot;: &quot;user&quot;/&quot;assistant&quot;/&quot;system&quot;, &quot;Content&quot;: &quot;xxx&quot;}</code>这种格式。</p> 
     * @return HistoryMessages <p>初始历史消息，每项为 <code>{&quot;Role&quot;: &quot;user&quot;/&quot;assistant&quot;/&quot;system&quot;, &quot;Content&quot;: &quot;xxx&quot;}</code>这种格式。</p>
     */
    public VoiceConversationHistoryMessage [] getHistoryMessages() {
        return this.HistoryMessages;
    }

    /**
     * Set <p>初始历史消息，每项为 <code>{&quot;Role&quot;: &quot;user&quot;/&quot;assistant&quot;/&quot;system&quot;, &quot;Content&quot;: &quot;xxx&quot;}</code>这种格式。</p>
     * @param HistoryMessages <p>初始历史消息，每项为 <code>{&quot;Role&quot;: &quot;user&quot;/&quot;assistant&quot;/&quot;system&quot;, &quot;Content&quot;: &quot;xxx&quot;}</code>这种格式。</p>
     */
    public void setHistoryMessages(VoiceConversationHistoryMessage [] HistoryMessages) {
        this.HistoryMessages = HistoryMessages;
    }

    public VoiceConversationLLMConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationLLMConfig(VoiceConversationLLMConfig source) {
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.FailureMessage != null) {
            this.FailureMessage = new String(source.FailureMessage);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.ThinkingMode != null) {
            this.ThinkingMode = new Boolean(source.ThinkingMode);
        }
        if (source.MaxHistory != null) {
            this.MaxHistory = new Long(source.MaxHistory);
        }
        if (source.MaxToolRound != null) {
            this.MaxToolRound = new Long(source.MaxToolRound);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.McpServer != null) {
            this.McpServer = new VoiceConversationMcpServer(source.McpServer);
        }
        if (source.CustomHeaders != null) {
            this.CustomHeaders = new KeyValueItem[source.CustomHeaders.length];
            for (int i = 0; i < source.CustomHeaders.length; i++) {
                this.CustomHeaders[i] = new KeyValueItem(source.CustomHeaders[i]);
            }
        }
        if (source.CustomFields != null) {
            this.CustomFields = new KeyValueItem[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new KeyValueItem(source.CustomFields[i]);
            }
        }
        if (source.HistoryMessages != null) {
            this.HistoryMessages = new VoiceConversationHistoryMessage[source.HistoryMessages.length];
            for (int i = 0; i < source.HistoryMessages.length; i++) {
                this.HistoryMessages[i] = new VoiceConversationHistoryMessage(source.HistoryMessages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "FailureMessage", this.FailureMessage);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "ThinkingMode", this.ThinkingMode);
        this.setParamSimple(map, prefix + "MaxHistory", this.MaxHistory);
        this.setParamSimple(map, prefix + "MaxToolRound", this.MaxToolRound);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamObj(map, prefix + "McpServer.", this.McpServer);
        this.setParamArrayObj(map, prefix + "CustomHeaders.", this.CustomHeaders);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "HistoryMessages.", this.HistoryMessages);

    }
}

