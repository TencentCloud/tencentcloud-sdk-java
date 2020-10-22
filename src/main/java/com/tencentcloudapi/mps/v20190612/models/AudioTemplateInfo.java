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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTemplateInfo extends AbstractModel{

    /**
    * 音频流的编码格式。
当外层参数 Container 为 mp3 时，可选值为：
<li>libmp3lame。</li>
当外层参数 Container 为 ogg 或 flac 时，可选值为：
<li>flac。</li>
当外层参数 Container 为 m4a 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame；</li>
<li>ac3。</li>
当外层参数 Container 为 mp4 或 flv 时，可选值为：
<li>libfdk_aac：更适合 mp4；</li>
<li>libmp3lame：更适合 flv。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，表示音频码率和原始音频保持一致。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
默认值：2。
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get 音频流的编码格式。
当外层参数 Container 为 mp3 时，可选值为：
<li>libmp3lame。</li>
当外层参数 Container 为 ogg 或 flac 时，可选值为：
<li>flac。</li>
当外层参数 Container 为 m4a 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame；</li>
<li>ac3。</li>
当外层参数 Container 为 mp4 或 flv 时，可选值为：
<li>libfdk_aac：更适合 mp4；</li>
<li>libmp3lame：更适合 flv。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li> 
     * @return Codec 音频流的编码格式。
当外层参数 Container 为 mp3 时，可选值为：
<li>libmp3lame。</li>
当外层参数 Container 为 ogg 或 flac 时，可选值为：
<li>flac。</li>
当外层参数 Container 为 m4a 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame；</li>
<li>ac3。</li>
当外层参数 Container 为 mp4 或 flv 时，可选值为：
<li>libfdk_aac：更适合 mp4；</li>
<li>libmp3lame：更适合 flv。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码格式。
当外层参数 Container 为 mp3 时，可选值为：
<li>libmp3lame。</li>
当外层参数 Container 为 ogg 或 flac 时，可选值为：
<li>flac。</li>
当外层参数 Container 为 m4a 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame；</li>
<li>ac3。</li>
当外层参数 Container 为 mp4 或 flv 时，可选值为：
<li>libfdk_aac：更适合 mp4；</li>
<li>libmp3lame：更适合 flv。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
     * @param Codec 音频流的编码格式。
当外层参数 Container 为 mp3 时，可选值为：
<li>libmp3lame。</li>
当外层参数 Container 为 ogg 或 flac 时，可选值为：
<li>flac。</li>
当外层参数 Container 为 m4a 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame；</li>
<li>ac3。</li>
当外层参数 Container 为 mp4 或 flv 时，可选值为：
<li>libfdk_aac：更适合 mp4；</li>
<li>libmp3lame：更适合 flv。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，表示音频码率和原始音频保持一致。 
     * @return Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，表示音频码率和原始音频保持一致。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，表示音频码率和原始音频保持一致。
     * @param Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，表示音频码率和原始音频保持一致。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。 
     * @return SampleRate 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
     * @param SampleRate 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
默认值：2。 
     * @return AudioChannel 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
默认值：2。
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
默认值：2。
     * @param AudioChannel 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
默认值：2。
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}

