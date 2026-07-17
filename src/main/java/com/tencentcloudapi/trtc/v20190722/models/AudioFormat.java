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

public class AudioFormat extends AbstractModel {

    /**
    * <p>生成的音频格式，注意opus格式是ogg/opus编码</p><ul><li><p>TextToSpeechSSE 流式接口</p><p>支持 pcm,mp3,opus 默认: pcm</p></li><li><p>TextToSpeech 非流式接口</p><p>支持 pcm,wav,mp3,opus  默认: pcm</p></li><li><p>AsyncTextToSpeech<br>支持pcm,mp3,opus 默认: mp3</p></li></ul>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>生成的音频采样率，默认24000<br>可选</p><ul><li>16000</li><li>24000</li></ul>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： <code>64</code>, <code>128</code>, <code>192</code>, <code>256</code> ,  默认： <code>128</code></p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get <p>生成的音频格式，注意opus格式是ogg/opus编码</p><ul><li><p>TextToSpeechSSE 流式接口</p><p>支持 pcm,mp3,opus 默认: pcm</p></li><li><p>TextToSpeech 非流式接口</p><p>支持 pcm,wav,mp3,opus  默认: pcm</p></li><li><p>AsyncTextToSpeech<br>支持pcm,mp3,opus 默认: mp3</p></li></ul> 
     * @return Format <p>生成的音频格式，注意opus格式是ogg/opus编码</p><ul><li><p>TextToSpeechSSE 流式接口</p><p>支持 pcm,mp3,opus 默认: pcm</p></li><li><p>TextToSpeech 非流式接口</p><p>支持 pcm,wav,mp3,opus  默认: pcm</p></li><li><p>AsyncTextToSpeech<br>支持pcm,mp3,opus 默认: mp3</p></li></ul>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>生成的音频格式，注意opus格式是ogg/opus编码</p><ul><li><p>TextToSpeechSSE 流式接口</p><p>支持 pcm,mp3,opus 默认: pcm</p></li><li><p>TextToSpeech 非流式接口</p><p>支持 pcm,wav,mp3,opus  默认: pcm</p></li><li><p>AsyncTextToSpeech<br>支持pcm,mp3,opus 默认: mp3</p></li></ul>
     * @param Format <p>生成的音频格式，注意opus格式是ogg/opus编码</p><ul><li><p>TextToSpeechSSE 流式接口</p><p>支持 pcm,mp3,opus 默认: pcm</p></li><li><p>TextToSpeech 非流式接口</p><p>支持 pcm,wav,mp3,opus  默认: pcm</p></li><li><p>AsyncTextToSpeech<br>支持pcm,mp3,opus 默认: mp3</p></li></ul>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>生成的音频采样率，默认24000<br>可选</p><ul><li>16000</li><li>24000</li></ul> 
     * @return SampleRate <p>生成的音频采样率，默认24000<br>可选</p><ul><li>16000</li><li>24000</li></ul>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>生成的音频采样率，默认24000<br>可选</p><ul><li>16000</li><li>24000</li></ul>
     * @param SampleRate <p>生成的音频采样率，默认24000<br>可选</p><ul><li>16000</li><li>24000</li></ul>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： <code>64</code>, <code>128</code>, <code>192</code>, <code>256</code> ,  默认： <code>128</code></p> 
     * @return Bitrate <p>MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： <code>64</code>, <code>128</code>, <code>192</code>, <code>256</code> ,  默认： <code>128</code></p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： <code>64</code>, <code>128</code>, <code>192</code>, <code>256</code> ,  默认： <code>128</code></p>
     * @param Bitrate <p>MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： <code>64</code>, <code>128</code>, <code>192</code>, <code>256</code> ,  默认： <code>128</code></p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public AudioFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioFormat(AudioFormat source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}

