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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkInput extends AbstractModel {

    /**
    * 水印模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
文字水印不支持截图打水印。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
SVG 水印不支持截图打水印。
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 水印模板 ID。 
     * @return Definition 水印模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 水印模板 ID。
     * @param Definition 水印模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
文字水印不支持截图打水印。 
     * @return TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
文字水印不支持截图打水印。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
文字水印不支持截图打水印。
     * @param TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
文字水印不支持截图打水印。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
SVG 水印不支持截图打水印。 
     * @return SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
SVG 水印不支持截图打水印。
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * Set SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
SVG 水印不支持截图打水印。
     * @param SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
SVG 水印不支持截图打水印。
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * Get 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li> 
     * @return StartTimeOffset 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     * @param StartTimeOffset 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li> 
     * @return EndTimeOffset 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     * @param EndTimeOffset 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public WatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkInput(WatermarkInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.SvgContent != null) {
            this.SvgContent = new String(source.SvgContent);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SvgContent", this.SvgContent);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

