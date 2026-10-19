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

public class ModelLimit extends AbstractModel {

    /**
    * <p>模型上下文长度展示文案（如 128K、1000K）</p>
    */
    @SerializedName("ContextLengthDescription")
    @Expose
    private String ContextLengthDescription;

    /**
    * <p>模型对话框输入长度字符数限制</p>
    */
    @SerializedName("InputLengthLimit")
    @Expose
    private Long InputLengthLimit;

    /**
    * <p>最大输入 Tokens 展示文案（如 960k，服务端格式化，未配置为空串）</p>
    */
    @SerializedName("MaxInputTokensDescription")
    @Expose
    private String MaxInputTokensDescription;

    /**
    * <p>最大输出 Tokens 展示文案（如 64k，服务端格式化，未配置为空串）</p>
    */
    @SerializedName("MaxOutputTokensDescription")
    @Expose
    private String MaxOutputTokensDescription;

    /**
    * <p>模型提示词长度字符数限制</p>
    */
    @SerializedName("PromptLengthLimit")
    @Expose
    private Long PromptLengthLimit;

    /**
     * Get <p>模型上下文长度展示文案（如 128K、1000K）</p> 
     * @return ContextLengthDescription <p>模型上下文长度展示文案（如 128K、1000K）</p>
     */
    public String getContextLengthDescription() {
        return this.ContextLengthDescription;
    }

    /**
     * Set <p>模型上下文长度展示文案（如 128K、1000K）</p>
     * @param ContextLengthDescription <p>模型上下文长度展示文案（如 128K、1000K）</p>
     */
    public void setContextLengthDescription(String ContextLengthDescription) {
        this.ContextLengthDescription = ContextLengthDescription;
    }

    /**
     * Get <p>模型对话框输入长度字符数限制</p> 
     * @return InputLengthLimit <p>模型对话框输入长度字符数限制</p>
     */
    public Long getInputLengthLimit() {
        return this.InputLengthLimit;
    }

    /**
     * Set <p>模型对话框输入长度字符数限制</p>
     * @param InputLengthLimit <p>模型对话框输入长度字符数限制</p>
     */
    public void setInputLengthLimit(Long InputLengthLimit) {
        this.InputLengthLimit = InputLengthLimit;
    }

    /**
     * Get <p>最大输入 Tokens 展示文案（如 960k，服务端格式化，未配置为空串）</p> 
     * @return MaxInputTokensDescription <p>最大输入 Tokens 展示文案（如 960k，服务端格式化，未配置为空串）</p>
     */
    public String getMaxInputTokensDescription() {
        return this.MaxInputTokensDescription;
    }

    /**
     * Set <p>最大输入 Tokens 展示文案（如 960k，服务端格式化，未配置为空串）</p>
     * @param MaxInputTokensDescription <p>最大输入 Tokens 展示文案（如 960k，服务端格式化，未配置为空串）</p>
     */
    public void setMaxInputTokensDescription(String MaxInputTokensDescription) {
        this.MaxInputTokensDescription = MaxInputTokensDescription;
    }

    /**
     * Get <p>最大输出 Tokens 展示文案（如 64k，服务端格式化，未配置为空串）</p> 
     * @return MaxOutputTokensDescription <p>最大输出 Tokens 展示文案（如 64k，服务端格式化，未配置为空串）</p>
     */
    public String getMaxOutputTokensDescription() {
        return this.MaxOutputTokensDescription;
    }

    /**
     * Set <p>最大输出 Tokens 展示文案（如 64k，服务端格式化，未配置为空串）</p>
     * @param MaxOutputTokensDescription <p>最大输出 Tokens 展示文案（如 64k，服务端格式化，未配置为空串）</p>
     */
    public void setMaxOutputTokensDescription(String MaxOutputTokensDescription) {
        this.MaxOutputTokensDescription = MaxOutputTokensDescription;
    }

    /**
     * Get <p>模型提示词长度字符数限制</p> 
     * @return PromptLengthLimit <p>模型提示词长度字符数限制</p>
     */
    public Long getPromptLengthLimit() {
        return this.PromptLengthLimit;
    }

    /**
     * Set <p>模型提示词长度字符数限制</p>
     * @param PromptLengthLimit <p>模型提示词长度字符数限制</p>
     */
    public void setPromptLengthLimit(Long PromptLengthLimit) {
        this.PromptLengthLimit = PromptLengthLimit;
    }

    public ModelLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelLimit(ModelLimit source) {
        if (source.ContextLengthDescription != null) {
            this.ContextLengthDescription = new String(source.ContextLengthDescription);
        }
        if (source.InputLengthLimit != null) {
            this.InputLengthLimit = new Long(source.InputLengthLimit);
        }
        if (source.MaxInputTokensDescription != null) {
            this.MaxInputTokensDescription = new String(source.MaxInputTokensDescription);
        }
        if (source.MaxOutputTokensDescription != null) {
            this.MaxOutputTokensDescription = new String(source.MaxOutputTokensDescription);
        }
        if (source.PromptLengthLimit != null) {
            this.PromptLengthLimit = new Long(source.PromptLengthLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContextLengthDescription", this.ContextLengthDescription);
        this.setParamSimple(map, prefix + "InputLengthLimit", this.InputLengthLimit);
        this.setParamSimple(map, prefix + "MaxInputTokensDescription", this.MaxInputTokensDescription);
        this.setParamSimple(map, prefix + "MaxOutputTokensDescription", this.MaxOutputTokensDescription);
        this.setParamSimple(map, prefix + "PromptLengthLimit", this.PromptLengthLimit);

    }
}

