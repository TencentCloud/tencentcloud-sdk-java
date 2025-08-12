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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToSpeechRequest extends AbstractModel {

    /**
    * 需要转语音的文字内容，长度范围：[1, 255]
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文本转语音的声音配置
    */
    @SerializedName("Voice")
    @Expose
    private Voice Voice;

    /**
    * TRTC的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 文本转语音的输出音频的格式
    */
    @SerializedName("AudioFormat")
    @Expose
    private AudioFormat AudioFormat;

    /**
    * TTS的API密钥
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
     * Get 需要转语音的文字内容，长度范围：[1, 255] 
     * @return Text 需要转语音的文字内容，长度范围：[1, 255]
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 需要转语音的文字内容，长度范围：[1, 255]
     * @param Text 需要转语音的文字内容，长度范围：[1, 255]
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文本转语音的声音配置 
     * @return Voice 文本转语音的声音配置
     */
    public Voice getVoice() {
        return this.Voice;
    }

    /**
     * Set 文本转语音的声音配置
     * @param Voice 文本转语音的声音配置
     */
    public void setVoice(Voice Voice) {
        this.Voice = Voice;
    }

    /**
     * Get TRTC的SdkAppId 
     * @return SdkAppId TRTC的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SdkAppId
     * @param SdkAppId TRTC的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 文本转语音的输出音频的格式 
     * @return AudioFormat 文本转语音的输出音频的格式
     */
    public AudioFormat getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 文本转语音的输出音频的格式
     * @param AudioFormat 文本转语音的输出音频的格式
     */
    public void setAudioFormat(AudioFormat AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get TTS的API密钥 
     * @return APIKey TTS的API密钥
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set TTS的API密钥
     * @param APIKey TTS的API密钥
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    public TextToSpeechRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechRequest(TextToSpeechRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Voice != null) {
            this.Voice = new Voice(source.Voice);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new AudioFormat(source.AudioFormat);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "AudioFormat.", this.AudioFormat);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);

    }
}

