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

public class AudioTemplateInfoForUpdate extends AbstractModel{

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
<li>libmp3lame：更适合 flv；</li>
<li>mp2。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。 当取值为 0，表示音频码率和原始音频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * 指定输出要保留的音频轨道。默认是全部保留源的。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamSelects")
    @Expose
    private Long [] StreamSelects;

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
<li>libmp3lame：更适合 flv；</li>
<li>mp2。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
注意：此字段可能返回 null，表示取不到有效值。 
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
<li>libmp3lame：更适合 flv；</li>
<li>mp2。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
注意：此字段可能返回 null，表示取不到有效值。
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
<li>libmp3lame：更适合 flv；</li>
<li>mp2。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
注意：此字段可能返回 null，表示取不到有效值。
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
<li>libmp3lame：更适合 flv；</li>
<li>mp2。</li>
当外层参数 Container 为 hls 时，可选值为：
<li>libfdk_aac；</li>
<li>libmp3lame。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。 当取值为 0，表示音频码率和原始音频保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。 当取值为 0，表示音频码率和原始音频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。 当取值为 0，表示音频码率和原始音频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。 当取值为 0，表示音频码率和原始音频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleRate 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleRate 音频流的采样率，可选值：
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioChannel 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioChannel 音频通道方式，可选值：
<li>1：单通道</li>
<li>2：双通道</li>
<li>6：立体声</li>
当媒体的封装格式是音频格式时（flac，ogg，mp3，m4a）时，声道数不允许设为立体声。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get 指定输出要保留的音频轨道。默认是全部保留源的。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamSelects 指定输出要保留的音频轨道。默认是全部保留源的。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getStreamSelects() {
        return this.StreamSelects;
    }

    /**
     * Set 指定输出要保留的音频轨道。默认是全部保留源的。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamSelects 指定输出要保留的音频轨道。默认是全部保留源的。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamSelects(Long [] StreamSelects) {
        this.StreamSelects = StreamSelects;
    }

    public AudioTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfoForUpdate(AudioTemplateInfoForUpdate source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
        if (source.StreamSelects != null) {
            this.StreamSelects = new Long[source.StreamSelects.length];
            for (int i = 0; i < source.StreamSelects.length; i++) {
                this.StreamSelects[i] = new Long(source.StreamSelects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);
        this.setParamArraySimple(map, prefix + "StreamSelects.", this.StreamSelects);

    }
}

