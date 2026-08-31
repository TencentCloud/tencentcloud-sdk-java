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

public class TextToSpeechAsyncOutput extends AbstractModel {

    /**
    * <p>合成音频结果URL</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>使用的音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>扩展信息</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>合成音频结果FileId</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>合成音频结果URL</p> 
     * @return AudioUrl <p>合成音频结果URL</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>合成音频结果URL</p>
     * @param AudioUrl <p>合成音频结果URL</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>使用的音色ID</p> 
     * @return VoiceId <p>使用的音色ID</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>使用的音色ID</p>
     * @param VoiceId <p>使用的音色ID</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>扩展信息</p> 
     * @return ExtInfo <p>扩展信息</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>扩展信息</p>
     * @param ExtInfo <p>扩展信息</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>合成音频结果FileId</p> 
     * @return FileId <p>合成音频结果FileId</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>合成音频结果FileId</p>
     * @param FileId <p>合成音频结果FileId</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public TextToSpeechAsyncOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechAsyncOutput(TextToSpeechAsyncOutput source) {
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

