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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DubbingSubtitleConfig extends AbstractModel {

    /**
    * <p>字幕来源。</p><p>枚举值：</p><ul><li>OCR： OCR文本识别，识别视频画面上的文本。</li><li>ASR： ASR语音识别，识别视频语音对话。</li><li>External： 外部字幕文件，提供原文/译文字幕URL。</li></ul>
    */
    @SerializedName("SubtitleSource")
    @Expose
    private String SubtitleSource;

    /**
    * <p>使用ASR辅助OCR。</p><p>枚举值：</p><ul><li>ON： 开启使用ASR辅助OCR。</li><li>OFF： 不开启使用ASR辅助OCR。</li></ul><p>默认值：OFF</p><p>仅 SubtitleSource=OCR 时允许设为 ON</p>
    */
    @SerializedName("AsrAssistOcr")
    @Expose
    private String AsrAssistOcr;

    /**
    * <p>擦除原字幕。</p><p>枚举值：</p><ul><li>ON： 擦除原字幕。</li><li>OFF： 保留原字幕。</li></ul><p>默认值：OFF</p><p>SubtitleSource=External 时不允许设为 ON</p>
    */
    @SerializedName("EraseOriginalSubtitle")
    @Expose
    private String EraseOriginalSubtitle;

    /**
    * <p>字幕位置信息。</p>
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
     * Get <p>字幕来源。</p><p>枚举值：</p><ul><li>OCR： OCR文本识别，识别视频画面上的文本。</li><li>ASR： ASR语音识别，识别视频语音对话。</li><li>External： 外部字幕文件，提供原文/译文字幕URL。</li></ul> 
     * @return SubtitleSource <p>字幕来源。</p><p>枚举值：</p><ul><li>OCR： OCR文本识别，识别视频画面上的文本。</li><li>ASR： ASR语音识别，识别视频语音对话。</li><li>External： 外部字幕文件，提供原文/译文字幕URL。</li></ul>
     */
    public String getSubtitleSource() {
        return this.SubtitleSource;
    }

    /**
     * Set <p>字幕来源。</p><p>枚举值：</p><ul><li>OCR： OCR文本识别，识别视频画面上的文本。</li><li>ASR： ASR语音识别，识别视频语音对话。</li><li>External： 外部字幕文件，提供原文/译文字幕URL。</li></ul>
     * @param SubtitleSource <p>字幕来源。</p><p>枚举值：</p><ul><li>OCR： OCR文本识别，识别视频画面上的文本。</li><li>ASR： ASR语音识别，识别视频语音对话。</li><li>External： 外部字幕文件，提供原文/译文字幕URL。</li></ul>
     */
    public void setSubtitleSource(String SubtitleSource) {
        this.SubtitleSource = SubtitleSource;
    }

    /**
     * Get <p>使用ASR辅助OCR。</p><p>枚举值：</p><ul><li>ON： 开启使用ASR辅助OCR。</li><li>OFF： 不开启使用ASR辅助OCR。</li></ul><p>默认值：OFF</p><p>仅 SubtitleSource=OCR 时允许设为 ON</p> 
     * @return AsrAssistOcr <p>使用ASR辅助OCR。</p><p>枚举值：</p><ul><li>ON： 开启使用ASR辅助OCR。</li><li>OFF： 不开启使用ASR辅助OCR。</li></ul><p>默认值：OFF</p><p>仅 SubtitleSource=OCR 时允许设为 ON</p>
     */
    public String getAsrAssistOcr() {
        return this.AsrAssistOcr;
    }

    /**
     * Set <p>使用ASR辅助OCR。</p><p>枚举值：</p><ul><li>ON： 开启使用ASR辅助OCR。</li><li>OFF： 不开启使用ASR辅助OCR。</li></ul><p>默认值：OFF</p><p>仅 SubtitleSource=OCR 时允许设为 ON</p>
     * @param AsrAssistOcr <p>使用ASR辅助OCR。</p><p>枚举值：</p><ul><li>ON： 开启使用ASR辅助OCR。</li><li>OFF： 不开启使用ASR辅助OCR。</li></ul><p>默认值：OFF</p><p>仅 SubtitleSource=OCR 时允许设为 ON</p>
     */
    public void setAsrAssistOcr(String AsrAssistOcr) {
        this.AsrAssistOcr = AsrAssistOcr;
    }

    /**
     * Get <p>擦除原字幕。</p><p>枚举值：</p><ul><li>ON： 擦除原字幕。</li><li>OFF： 保留原字幕。</li></ul><p>默认值：OFF</p><p>SubtitleSource=External 时不允许设为 ON</p> 
     * @return EraseOriginalSubtitle <p>擦除原字幕。</p><p>枚举值：</p><ul><li>ON： 擦除原字幕。</li><li>OFF： 保留原字幕。</li></ul><p>默认值：OFF</p><p>SubtitleSource=External 时不允许设为 ON</p>
     */
    public String getEraseOriginalSubtitle() {
        return this.EraseOriginalSubtitle;
    }

    /**
     * Set <p>擦除原字幕。</p><p>枚举值：</p><ul><li>ON： 擦除原字幕。</li><li>OFF： 保留原字幕。</li></ul><p>默认值：OFF</p><p>SubtitleSource=External 时不允许设为 ON</p>
     * @param EraseOriginalSubtitle <p>擦除原字幕。</p><p>枚举值：</p><ul><li>ON： 擦除原字幕。</li><li>OFF： 保留原字幕。</li></ul><p>默认值：OFF</p><p>SubtitleSource=External 时不允许设为 ON</p>
     */
    public void setEraseOriginalSubtitle(String EraseOriginalSubtitle) {
        this.EraseOriginalSubtitle = EraseOriginalSubtitle;
    }

    /**
     * Get <p>字幕位置信息。</p> 
     * @return SelectingSubtitleAreasConfig <p>字幕位置信息。</p>
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>字幕位置信息。</p>
     * @param SelectingSubtitleAreasConfig <p>字幕位置信息。</p>
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    public DubbingSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingSubtitleConfig(DubbingSubtitleConfig source) {
        if (source.SubtitleSource != null) {
            this.SubtitleSource = new String(source.SubtitleSource);
        }
        if (source.AsrAssistOcr != null) {
            this.AsrAssistOcr = new String(source.AsrAssistOcr);
        }
        if (source.EraseOriginalSubtitle != null) {
            this.EraseOriginalSubtitle = new String(source.EraseOriginalSubtitle);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleSource", this.SubtitleSource);
        this.setParamSimple(map, prefix + "AsrAssistOcr", this.AsrAssistOcr);
        this.setParamSimple(map, prefix + "EraseOriginalSubtitle", this.EraseOriginalSubtitle);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);

    }
}

