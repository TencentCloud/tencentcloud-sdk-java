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

public class TranslateConfigureInfo extends AbstractModel {

    /**
    * 语音翻译任务开关，可选值：
<li>ON：开启智能语音翻译任务；</li>
<li>OFF：关闭智能语音翻译任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 视频源语言。
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * 翻译目标语言。
    */
    @SerializedName("DestinationLanguage")
    @Expose
    private String DestinationLanguage;

    /**
    * 生成的字幕文件格式，填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
     * Get 语音翻译任务开关，可选值：
<li>ON：开启智能语音翻译任务；</li>
<li>OFF：关闭智能语音翻译任务。</li> 
     * @return Switch 语音翻译任务开关，可选值：
<li>ON：开启智能语音翻译任务；</li>
<li>OFF：关闭智能语音翻译任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 语音翻译任务开关，可选值：
<li>ON：开启智能语音翻译任务；</li>
<li>OFF：关闭智能语音翻译任务。</li>
     * @param Switch 语音翻译任务开关，可选值：
<li>ON：开启智能语音翻译任务；</li>
<li>OFF：关闭智能语音翻译任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 视频源语言。 
     * @return SourceLanguage 视频源语言。
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set 视频源语言。
     * @param SourceLanguage 视频源语言。
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get 翻译目标语言。 
     * @return DestinationLanguage 翻译目标语言。
     */
    public String getDestinationLanguage() {
        return this.DestinationLanguage;
    }

    /**
     * Set 翻译目标语言。
     * @param DestinationLanguage 翻译目标语言。
     */
    public void setDestinationLanguage(String DestinationLanguage) {
        this.DestinationLanguage = DestinationLanguage;
    }

    /**
     * Get 生成的字幕文件格式，填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleFormat 生成的字幕文件格式，填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 生成的字幕文件格式，填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleFormat 生成的字幕文件格式，填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    public TranslateConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslateConfigureInfo(TranslateConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SourceLanguage != null) {
            this.SourceLanguage = new String(source.SourceLanguage);
        }
        if (source.DestinationLanguage != null) {
            this.DestinationLanguage = new String(source.DestinationLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);
        this.setParamSimple(map, prefix + "DestinationLanguage", this.DestinationLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);

    }
}

