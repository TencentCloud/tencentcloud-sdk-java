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

public class ReasoningResult extends AbstractModel {

    /**
    * <p>实际使用的推理输出模式：enum 或 string。</p>
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>枚举模式下的推理结果值。当 OutputMode=enum 时返回，必定命中请求中 EnumValues 的某个值。 若 VLM 输出无法匹配任何枚举值，则返回 <strong>UNCERTAIN</strong>。</p>
    */
    @SerializedName("EnumValue")
    @Expose
    private String EnumValue;

    /**
    * <p>文本模式下的推理结果值。当 OutputMode=string 时返回。 若 VLM 无法得出结论，则返回 <strong>UNCERTAIN</strong>。</p>
    */
    @SerializedName("TextValue")
    @Expose
    private String TextValue;

    /**
    * <p>VLM 原始输出文本（未经过结构化校验）。</p>
    */
    @SerializedName("RawOutput")
    @Expose
    private String RawOutput;

    /**
    * <p>变量替换后的实际 Prompt（脱敏后）。</p>
    */
    @SerializedName("RenderedPrompt")
    @Expose
    private String RenderedPrompt;

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
     * Get <p>枚举模式下的推理结果值。当 OutputMode=enum 时返回，必定命中请求中 EnumValues 的某个值。 若 VLM 输出无法匹配任何枚举值，则返回 <strong>UNCERTAIN</strong>。</p> 
     * @return EnumValue <p>枚举模式下的推理结果值。当 OutputMode=enum 时返回，必定命中请求中 EnumValues 的某个值。 若 VLM 输出无法匹配任何枚举值，则返回 <strong>UNCERTAIN</strong>。</p>
     */
    public String getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set <p>枚举模式下的推理结果值。当 OutputMode=enum 时返回，必定命中请求中 EnumValues 的某个值。 若 VLM 输出无法匹配任何枚举值，则返回 <strong>UNCERTAIN</strong>。</p>
     * @param EnumValue <p>枚举模式下的推理结果值。当 OutputMode=enum 时返回，必定命中请求中 EnumValues 的某个值。 若 VLM 输出无法匹配任何枚举值，则返回 <strong>UNCERTAIN</strong>。</p>
     */
    public void setEnumValue(String EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get <p>文本模式下的推理结果值。当 OutputMode=string 时返回。 若 VLM 无法得出结论，则返回 <strong>UNCERTAIN</strong>。</p> 
     * @return TextValue <p>文本模式下的推理结果值。当 OutputMode=string 时返回。 若 VLM 无法得出结论，则返回 <strong>UNCERTAIN</strong>。</p>
     */
    public String getTextValue() {
        return this.TextValue;
    }

    /**
     * Set <p>文本模式下的推理结果值。当 OutputMode=string 时返回。 若 VLM 无法得出结论，则返回 <strong>UNCERTAIN</strong>。</p>
     * @param TextValue <p>文本模式下的推理结果值。当 OutputMode=string 时返回。 若 VLM 无法得出结论，则返回 <strong>UNCERTAIN</strong>。</p>
     */
    public void setTextValue(String TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get <p>VLM 原始输出文本（未经过结构化校验）。</p> 
     * @return RawOutput <p>VLM 原始输出文本（未经过结构化校验）。</p>
     */
    public String getRawOutput() {
        return this.RawOutput;
    }

    /**
     * Set <p>VLM 原始输出文本（未经过结构化校验）。</p>
     * @param RawOutput <p>VLM 原始输出文本（未经过结构化校验）。</p>
     */
    public void setRawOutput(String RawOutput) {
        this.RawOutput = RawOutput;
    }

    /**
     * Get <p>变量替换后的实际 Prompt（脱敏后）。</p> 
     * @return RenderedPrompt <p>变量替换后的实际 Prompt（脱敏后）。</p>
     */
    public String getRenderedPrompt() {
        return this.RenderedPrompt;
    }

    /**
     * Set <p>变量替换后的实际 Prompt（脱敏后）。</p>
     * @param RenderedPrompt <p>变量替换后的实际 Prompt（脱敏后）。</p>
     */
    public void setRenderedPrompt(String RenderedPrompt) {
        this.RenderedPrompt = RenderedPrompt;
    }

    public ReasoningResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReasoningResult(ReasoningResult source) {
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String(source.EnumValue);
        }
        if (source.TextValue != null) {
            this.TextValue = new String(source.TextValue);
        }
        if (source.RawOutput != null) {
            this.RawOutput = new String(source.RawOutput);
        }
        if (source.RenderedPrompt != null) {
            this.RenderedPrompt = new String(source.RenderedPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamSimple(map, prefix + "EnumValue", this.EnumValue);
        this.setParamSimple(map, prefix + "TextValue", this.TextValue);
        this.setParamSimple(map, prefix + "RawOutput", this.RawOutput);
        this.setParamSimple(map, prefix + "RenderedPrompt", this.RenderedPrompt);

    }
}

