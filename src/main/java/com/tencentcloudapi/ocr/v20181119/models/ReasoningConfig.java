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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReasoningConfig extends AbstractModel {

    /**
    * <p>实际使用的推理输出模式：enum 或 string。</p>
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>枚举值集合，仅在 OutputMode=enum 时生效。  VLM 输出必须精确命中此集合中的某个值。</p>
    */
    @SerializedName("EnumValues")
    @Expose
    private String [] EnumValues;

    /**
    * <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p><p>默认值：200</p>
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * <p>是否在推理调用时向 VLM 传入原图进行多模态理解。  true（默认）：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。  false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理。适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景，可降低推理延迟和计费成本。  建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;直接看图&quot;等多模态指令，且推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以优化性能。</p>
    */
    @SerializedName("EnableImageInput")
    @Expose
    private Boolean EnableImageInput;

    /**
     * Get <p>实际使用的推理输出模式：enum 或 string。</p> 
     * @return OutputMode <p>实际使用的推理输出模式：enum 或 string。</p>
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set <p>实际使用的推理输出模式：enum 或 string。</p>
     * @param OutputMode <p>实际使用的推理输出模式：enum 或 string。</p>
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get <p>枚举值集合，仅在 OutputMode=enum 时生效。  VLM 输出必须精确命中此集合中的某个值。</p> 
     * @return EnumValues <p>枚举值集合，仅在 OutputMode=enum 时生效。  VLM 输出必须精确命中此集合中的某个值。</p>
     */
    public String [] getEnumValues() {
        return this.EnumValues;
    }

    /**
     * Set <p>枚举值集合，仅在 OutputMode=enum 时生效。  VLM 输出必须精确命中此集合中的某个值。</p>
     * @param EnumValues <p>枚举值集合，仅在 OutputMode=enum 时生效。  VLM 输出必须精确命中此集合中的某个值。</p>
     */
    public void setEnumValues(String [] EnumValues) {
        this.EnumValues = EnumValues;
    }

    /**
     * Get <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p><p>默认值：200</p> 
     * @return MaxLength <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p><p>默认值：200</p>
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p><p>默认值：200</p>
     * @param MaxLength <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p><p>默认值：200</p>
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get <p>是否在推理调用时向 VLM 传入原图进行多模态理解。  true（默认）：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。  false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理。适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景，可降低推理延迟和计费成本。  建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;直接看图&quot;等多模态指令，且推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以优化性能。</p> 
     * @return EnableImageInput <p>是否在推理调用时向 VLM 传入原图进行多模态理解。  true（默认）：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。  false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理。适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景，可降低推理延迟和计费成本。  建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;直接看图&quot;等多模态指令，且推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以优化性能。</p>
     */
    public Boolean getEnableImageInput() {
        return this.EnableImageInput;
    }

    /**
     * Set <p>是否在推理调用时向 VLM 传入原图进行多模态理解。  true（默认）：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。  false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理。适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景，可降低推理延迟和计费成本。  建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;直接看图&quot;等多模态指令，且推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以优化性能。</p>
     * @param EnableImageInput <p>是否在推理调用时向 VLM 传入原图进行多模态理解。  true（默认）：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。  false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理。适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景，可降低推理延迟和计费成本。  建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;直接看图&quot;等多模态指令，且推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以优化性能。</p>
     */
    public void setEnableImageInput(Boolean EnableImageInput) {
        this.EnableImageInput = EnableImageInput;
    }

    public ReasoningConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReasoningConfig(ReasoningConfig source) {
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.EnumValues != null) {
            this.EnumValues = new String[source.EnumValues.length];
            for (int i = 0; i < source.EnumValues.length; i++) {
                this.EnumValues[i] = new String(source.EnumValues[i]);
            }
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.EnableImageInput != null) {
            this.EnableImageInput = new Boolean(source.EnableImageInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamArraySimple(map, prefix + "EnumValues.", this.EnumValues);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamSimple(map, prefix + "EnableImageInput", this.EnableImageInput);

    }
}

