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
    * 模型上下文长度展示文案（如 "128K"、"1000K"）
    */
    @SerializedName("ContextLengthDescription")
    @Expose
    private String ContextLengthDescription;

    /**
    * 模型对话框输入长度字符数限制
    */
    @SerializedName("InputLengthLimit")
    @Expose
    private Long InputLengthLimit;

    /**
    * 模型提示词长度字符数限制
    */
    @SerializedName("PromptLengthLimit")
    @Expose
    private Long PromptLengthLimit;

    /**
     * Get 模型上下文长度展示文案（如 "128K"、"1000K"） 
     * @return ContextLengthDescription 模型上下文长度展示文案（如 "128K"、"1000K"）
     */
    public String getContextLengthDescription() {
        return this.ContextLengthDescription;
    }

    /**
     * Set 模型上下文长度展示文案（如 "128K"、"1000K"）
     * @param ContextLengthDescription 模型上下文长度展示文案（如 "128K"、"1000K"）
     */
    public void setContextLengthDescription(String ContextLengthDescription) {
        this.ContextLengthDescription = ContextLengthDescription;
    }

    /**
     * Get 模型对话框输入长度字符数限制 
     * @return InputLengthLimit 模型对话框输入长度字符数限制
     */
    public Long getInputLengthLimit() {
        return this.InputLengthLimit;
    }

    /**
     * Set 模型对话框输入长度字符数限制
     * @param InputLengthLimit 模型对话框输入长度字符数限制
     */
    public void setInputLengthLimit(Long InputLengthLimit) {
        this.InputLengthLimit = InputLengthLimit;
    }

    /**
     * Get 模型提示词长度字符数限制 
     * @return PromptLengthLimit 模型提示词长度字符数限制
     */
    public Long getPromptLengthLimit() {
        return this.PromptLengthLimit;
    }

    /**
     * Set 模型提示词长度字符数限制
     * @param PromptLengthLimit 模型提示词长度字符数限制
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
        this.setParamSimple(map, prefix + "PromptLengthLimit", this.PromptLengthLimit);

    }
}

