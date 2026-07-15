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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkLLMConfig extends AbstractModel {

    /**
    * <p>LLM类型：default-平台默认；openai-OpenAI兼容模型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>系统提示词</p>
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * <p>采样温度，建议范围0-2</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>上下文历史轮数，建议范围0-50</p>
    */
    @SerializedName("History")
    @Expose
    private Long History;

    /**
    * <p>超时时间，秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>OpenAI兼容模型Base URL，仅支持 80 和 443 端口，Type=openai时必填</p>
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * <p>模型名称，Type=openai时必填</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>模型API Key，Type=openai时必填</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>额外模型请求体参数，JSON对象字符串，只允许JSON object，不允许普通字符串</p>
    */
    @SerializedName("ExtraBody")
    @Expose
    private String ExtraBody;

    /**
     * Get <p>LLM类型：default-平台默认；openai-OpenAI兼容模型</p> 
     * @return Type <p>LLM类型：default-平台默认；openai-OpenAI兼容模型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>LLM类型：default-平台默认；openai-OpenAI兼容模型</p>
     * @param Type <p>LLM类型：default-平台默认；openai-OpenAI兼容模型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>系统提示词</p> 
     * @return SystemPrompt <p>系统提示词</p>
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set <p>系统提示词</p>
     * @param SystemPrompt <p>系统提示词</p>
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get <p>采样温度，建议范围0-2</p> 
     * @return Temperature <p>采样温度，建议范围0-2</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>采样温度，建议范围0-2</p>
     * @param Temperature <p>采样温度，建议范围0-2</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>上下文历史轮数，建议范围0-50</p> 
     * @return History <p>上下文历史轮数，建议范围0-50</p>
     */
    public Long getHistory() {
        return this.History;
    }

    /**
     * Set <p>上下文历史轮数，建议范围0-50</p>
     * @param History <p>上下文历史轮数，建议范围0-50</p>
     */
    public void setHistory(Long History) {
        this.History = History;
    }

    /**
     * Get <p>超时时间，秒</p> 
     * @return Timeout <p>超时时间，秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，秒</p>
     * @param Timeout <p>超时时间，秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>OpenAI兼容模型Base URL，仅支持 80 和 443 端口，Type=openai时必填</p> 
     * @return BaseUrl <p>OpenAI兼容模型Base URL，仅支持 80 和 443 端口，Type=openai时必填</p>
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set <p>OpenAI兼容模型Base URL，仅支持 80 和 443 端口，Type=openai时必填</p>
     * @param BaseUrl <p>OpenAI兼容模型Base URL，仅支持 80 和 443 端口，Type=openai时必填</p>
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get <p>模型名称，Type=openai时必填</p> 
     * @return Model <p>模型名称，Type=openai时必填</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称，Type=openai时必填</p>
     * @param Model <p>模型名称，Type=openai时必填</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>模型API Key，Type=openai时必填</p> 
     * @return ApiKey <p>模型API Key，Type=openai时必填</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>模型API Key，Type=openai时必填</p>
     * @param ApiKey <p>模型API Key，Type=openai时必填</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>额外模型请求体参数，JSON对象字符串，只允许JSON object，不允许普通字符串</p> 
     * @return ExtraBody <p>额外模型请求体参数，JSON对象字符串，只允许JSON object，不允许普通字符串</p>
     */
    public String getExtraBody() {
        return this.ExtraBody;
    }

    /**
     * Set <p>额外模型请求体参数，JSON对象字符串，只允许JSON object，不允许普通字符串</p>
     * @param ExtraBody <p>额外模型请求体参数，JSON对象字符串，只允许JSON object，不允许普通字符串</p>
     */
    public void setExtraBody(String ExtraBody) {
        this.ExtraBody = ExtraBody;
    }

    public TalkLLMConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkLLMConfig(TalkLLMConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.History != null) {
            this.History = new Long(source.History);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.ExtraBody != null) {
            this.ExtraBody = new String(source.ExtraBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "History", this.History);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "ExtraBody", this.ExtraBody);

    }
}

