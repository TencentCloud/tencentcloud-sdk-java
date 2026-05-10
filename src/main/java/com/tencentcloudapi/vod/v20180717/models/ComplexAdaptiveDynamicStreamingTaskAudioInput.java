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

public class ComplexAdaptiveDynamicStreamingTaskAudioInput extends AbstractModel {

    /**
    * <p>音频源的媒体 ID。固定取该媒体源文件中的首个音频流，视频流和其它音频流（如有）将被忽略。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>输出的自适应码流中的音频流名称，长度限制为16个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>是否设置为自适应码流的默认音频。取值：</p><li>YES：设置为默认音频；</li><li>NO：不设置为默认音频（默认值）。</li>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>音轨序号，表示选择音频源中的第几个音轨，从0开始计数。默认值为0，表示选择最靠前的音轨。</p>
    */
    @SerializedName("AudioTrackIdx")
    @Expose
    private Long AudioTrackIdx;

    /**
     * Get <p>音频源的媒体 ID。固定取该媒体源文件中的首个音频流，视频流和其它音频流（如有）将被忽略。</p> 
     * @return FileId <p>音频源的媒体 ID。固定取该媒体源文件中的首个音频流，视频流和其它音频流（如有）将被忽略。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>音频源的媒体 ID。固定取该媒体源文件中的首个音频流，视频流和其它音频流（如有）将被忽略。</p>
     * @param FileId <p>音频源的媒体 ID。固定取该媒体源文件中的首个音频流，视频流和其它音频流（如有）将被忽略。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>输出的自适应码流中的音频流名称，长度限制为16个字符。</p> 
     * @return Name <p>输出的自适应码流中的音频流名称，长度限制为16个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>输出的自适应码流中的音频流名称，长度限制为16个字符。</p>
     * @param Name <p>输出的自适应码流中的音频流名称，长度限制为16个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。</p> 
     * @return Language <p>输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。</p>
     * @param Language <p>输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>是否设置为自适应码流的默认音频。取值：</p><li>YES：设置为默认音频；</li><li>NO：不设置为默认音频（默认值）。</li> 
     * @return Default <p>是否设置为自适应码流的默认音频。取值：</p><li>YES：设置为默认音频；</li><li>NO：不设置为默认音频（默认值）。</li>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>是否设置为自适应码流的默认音频。取值：</p><li>YES：设置为默认音频；</li><li>NO：不设置为默认音频（默认值）。</li>
     * @param Default <p>是否设置为自适应码流的默认音频。取值：</p><li>YES：设置为默认音频；</li><li>NO：不设置为默认音频（默认值）。</li>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>音轨序号，表示选择音频源中的第几个音轨，从0开始计数。默认值为0，表示选择最靠前的音轨。</p> 
     * @return AudioTrackIdx <p>音轨序号，表示选择音频源中的第几个音轨，从0开始计数。默认值为0，表示选择最靠前的音轨。</p>
     */
    public Long getAudioTrackIdx() {
        return this.AudioTrackIdx;
    }

    /**
     * Set <p>音轨序号，表示选择音频源中的第几个音轨，从0开始计数。默认值为0，表示选择最靠前的音轨。</p>
     * @param AudioTrackIdx <p>音轨序号，表示选择音频源中的第几个音轨，从0开始计数。默认值为0，表示选择最靠前的音轨。</p>
     */
    public void setAudioTrackIdx(Long AudioTrackIdx) {
        this.AudioTrackIdx = AudioTrackIdx;
    }

    public ComplexAdaptiveDynamicStreamingTaskAudioInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput(ComplexAdaptiveDynamicStreamingTaskAudioInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.AudioTrackIdx != null) {
            this.AudioTrackIdx = new Long(source.AudioTrackIdx);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "AudioTrackIdx", this.AudioTrackIdx);

    }
}

