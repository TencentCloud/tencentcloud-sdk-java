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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeAudioStream extends AbstractModel {

    /**
    * 音频流的编码方式，可选值：
<li>AAC：AAC 编码（默认），用于容器为 mp4。</li>
<li>MP3：mp3 编码，用于容器为 mp3。</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频流的采样率，单位：Hz，可选值：
<li>16000（默认）</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道（默认）。</li>
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get 音频流的编码方式，可选值：
<li>AAC：AAC 编码（默认），用于容器为 mp4。</li>
<li>MP3：mp3 编码，用于容器为 mp3。</li> 
     * @return Codec 音频流的编码方式，可选值：
<li>AAC：AAC 编码（默认），用于容器为 mp4。</li>
<li>MP3：mp3 编码，用于容器为 mp3。</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码方式，可选值：
<li>AAC：AAC 编码（默认），用于容器为 mp4。</li>
<li>MP3：mp3 编码，用于容器为 mp3。</li>
     * @param Codec 音频流的编码方式，可选值：
<li>AAC：AAC 编码（默认），用于容器为 mp4。</li>
<li>MP3：mp3 编码，用于容器为 mp3。</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频流的采样率，单位：Hz，可选值：
<li>16000（默认）</li>
<li>32000</li>
<li>44100</li>
<li>48000</li> 
     * @return SampleRate 音频流的采样率，单位：Hz，可选值：
<li>16000（默认）</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频流的采样率，单位：Hz，可选值：
<li>16000（默认）</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     * @param SampleRate 音频流的采样率，单位：Hz，可选值：
<li>16000（默认）</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道（默认）。</li> 
     * @return AudioChannel 声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道（默认）。</li>
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set 声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道（默认）。</li>
     * @param AudioChannel 声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道（默认）。</li>
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    public ComposeAudioStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeAudioStream(ComposeAudioStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}

