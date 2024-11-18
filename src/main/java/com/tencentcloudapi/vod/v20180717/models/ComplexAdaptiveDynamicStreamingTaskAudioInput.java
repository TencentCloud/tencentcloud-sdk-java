/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 音频源的媒体 ID。固定取该媒体中的首个音频流，视频流和其它音频流（如有）将被忽略。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 输出的自适应码流中的音频流名称，长度限制为16个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 是否设置为自适应码流的默认音频。取值：
<li>YES：设置为默认音频；</li>
<li>NO：不设置为默认音频（默认值）。</li>

    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
     * Get 音频源的媒体 ID。固定取该媒体中的首个音频流，视频流和其它音频流（如有）将被忽略。 
     * @return FileId 音频源的媒体 ID。固定取该媒体中的首个音频流，视频流和其它音频流（如有）将被忽略。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 音频源的媒体 ID。固定取该媒体中的首个音频流，视频流和其它音频流（如有）将被忽略。
     * @param FileId 音频源的媒体 ID。固定取该媒体中的首个音频流，视频流和其它音频流（如有）将被忽略。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 输出的自适应码流中的音频流名称，长度限制为16个字符。 
     * @return Name 输出的自适应码流中的音频流名称，长度限制为16个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 输出的自适应码流中的音频流名称，长度限制为16个字符。
     * @param Name 输出的自适应码流中的音频流名称，长度限制为16个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。 
     * @return Language 输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。
     * @param Language 输出的自适应码流中的音频流语言，长度限制为16个字符。要求符合 RFC5646 规范。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 是否设置为自适应码流的默认音频。取值：
<li>YES：设置为默认音频；</li>
<li>NO：不设置为默认音频（默认值）。</li>
 
     * @return Default 是否设置为自适应码流的默认音频。取值：
<li>YES：设置为默认音频；</li>
<li>NO：不设置为默认音频（默认值）。</li>

     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 是否设置为自适应码流的默认音频。取值：
<li>YES：设置为默认音频；</li>
<li>NO：不设置为默认音频（默认值）。</li>

     * @param Default 是否设置为自适应码流的默认音频。取值：
<li>YES：设置为默认音频；</li>
<li>NO：不设置为默认音频（默认值）。</li>

     */
    public void setDefault(String Default) {
        this.Default = Default;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

