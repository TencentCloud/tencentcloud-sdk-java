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
    * <p>推理输出模式。可选值：enum（枚举值输出）、string（自由文本输出）。<br>enum：VLM 必须从 EnumValues 中选择一个值输出，适用于二值判断或分类决策。<br>string：VLM 输出自由文本，适用于需要自然语言解释的场景。</p>
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>枚举值集合，仅在 OutputMode=enum 时生效，设置后VLM推理结果必须精确命中此集合中的某个值，否则会返回“输出偏离枚举值”，Prompt中的指令应与枚举值匹配。</p>
    */
    @SerializedName("EnumValues")
    @Expose
    private String [] EnumValues;

    /**
    * <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p>
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * <p>是否在推理时向 VLM 传入原图进行多模态理解，不传入时默认为true。<br>true：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。<br>false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理，适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景。<br>建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;分析图片&quot;等多模态指令，推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以获得更低的延迟。</p>
    */
    @SerializedName("EnableImageInput")
    @Expose
    private Boolean EnableImageInput;

    /**
     * Get <p>推理输出模式。可选值：enum（枚举值输出）、string（自由文本输出）。<br>enum：VLM 必须从 EnumValues 中选择一个值输出，适用于二值判断或分类决策。<br>string：VLM 输出自由文本，适用于需要自然语言解释的场景。</p> 
     * @return OutputMode <p>推理输出模式。可选值：enum（枚举值输出）、string（自由文本输出）。<br>enum：VLM 必须从 EnumValues 中选择一个值输出，适用于二值判断或分类决策。<br>string：VLM 输出自由文本，适用于需要自然语言解释的场景。</p>
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set <p>推理输出模式。可选值：enum（枚举值输出）、string（自由文本输出）。<br>enum：VLM 必须从 EnumValues 中选择一个值输出，适用于二值判断或分类决策。<br>string：VLM 输出自由文本，适用于需要自然语言解释的场景。</p>
     * @param OutputMode <p>推理输出模式。可选值：enum（枚举值输出）、string（自由文本输出）。<br>enum：VLM 必须从 EnumValues 中选择一个值输出，适用于二值判断或分类决策。<br>string：VLM 输出自由文本，适用于需要自然语言解释的场景。</p>
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get <p>枚举值集合，仅在 OutputMode=enum 时生效，设置后VLM推理结果必须精确命中此集合中的某个值，否则会返回“输出偏离枚举值”，Prompt中的指令应与枚举值匹配。</p> 
     * @return EnumValues <p>枚举值集合，仅在 OutputMode=enum 时生效，设置后VLM推理结果必须精确命中此集合中的某个值，否则会返回“输出偏离枚举值”，Prompt中的指令应与枚举值匹配。</p>
     */
    public String [] getEnumValues() {
        return this.EnumValues;
    }

    /**
     * Set <p>枚举值集合，仅在 OutputMode=enum 时生效，设置后VLM推理结果必须精确命中此集合中的某个值，否则会返回“输出偏离枚举值”，Prompt中的指令应与枚举值匹配。</p>
     * @param EnumValues <p>枚举值集合，仅在 OutputMode=enum 时生效，设置后VLM推理结果必须精确命中此集合中的某个值，否则会返回“输出偏离枚举值”，Prompt中的指令应与枚举值匹配。</p>
     */
    public void setEnumValues(String [] EnumValues) {
        this.EnumValues = EnumValues;
    }

    /**
     * Get <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p> 
     * @return MaxLength <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p>
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p>
     * @param MaxLength <p>文本输出最大长度，仅在 OutputMode=string 时生效。</p><p>取值范围：[1, 500]</p>
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get <p>是否在推理时向 VLM 传入原图进行多模态理解，不传入时默认为true。<br>true：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。<br>false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理，适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景。<br>建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;分析图片&quot;等多模态指令，推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以获得更低的延迟。</p> 
     * @return EnableImageInput <p>是否在推理时向 VLM 传入原图进行多模态理解，不传入时默认为true。<br>true：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。<br>false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理，适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景。<br>建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;分析图片&quot;等多模态指令，推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以获得更低的延迟。</p>
     */
    public Boolean getEnableImageInput() {
        return this.EnableImageInput;
    }

    /**
     * Set <p>是否在推理时向 VLM 传入原图进行多模态理解，不传入时默认为true。<br>true：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。<br>false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理，适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景。<br>建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;分析图片&quot;等多模态指令，推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以获得更低的延迟。</p>
     * @param EnableImageInput <p>是否在推理时向 VLM 传入原图进行多模态理解，不传入时默认为true。<br>true：VLM 同时接收原图和渲染后的 Prompt，具备多模态理解能力，可直接&quot;看&quot;图片内容进行推理。<br>false：不传入原图，仅以渲染后的 Prompt（含变量注入值）进行纯文本推理，适用于推理逻辑完全基于结构化出参字段（如水印文字、置信度比较等）的场景。<br>建议：当 ReasoningPrompt 中未涉及&quot;观察图片&quot;、&quot;分析图片&quot;等多模态指令，推理规则完全基于 ${变量名} 引用的文字结果时，可设为 false 以获得更低的延迟。</p>
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

