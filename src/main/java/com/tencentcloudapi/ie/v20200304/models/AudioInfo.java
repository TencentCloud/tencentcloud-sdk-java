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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioInfo extends AbstractModel{

    /**
    * 音频码率，取值范围：0 和 [26, 256]，单位：kbps。
注意：当取值为 0，表示音频码率和原始音频保持一致。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频编码器，可选项：aac,mp3,ac3,flac,mp2。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 声道数，可选项：
1：单声道，
2：双声道，
6：立体声。
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 采样率，单位：Hz。可选项：32000，44100,48000
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 音频降噪信息
    */
    @SerializedName("Denoise")
    @Expose
    private Denoise Denoise;

    /**
    * 开启添加静音，可选项：
0：不开启，
1：开启，
默认不开启
    */
    @SerializedName("EnableMuteAudio")
    @Expose
    private Long EnableMuteAudio;

    /**
    * 音频响度信息
    */
    @SerializedName("LoudnessInfo")
    @Expose
    private LoudnessInfo LoudnessInfo;

    /**
    * 音频音效增强
    */
    @SerializedName("AudioEnhance")
    @Expose
    private AudioEnhance AudioEnhance;

    /**
    * 去除混音
    */
    @SerializedName("RemoveReverb")
    @Expose
    private RemoveReverb RemoveReverb;

    /**
     * Get 音频码率，取值范围：0 和 [26, 256]，单位：kbps。
注意：当取值为 0，表示音频码率和原始音频保持一致。 
     * @return Bitrate 音频码率，取值范围：0 和 [26, 256]，单位：kbps。
注意：当取值为 0，表示音频码率和原始音频保持一致。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频码率，取值范围：0 和 [26, 256]，单位：kbps。
注意：当取值为 0，表示音频码率和原始音频保持一致。
     * @param Bitrate 音频码率，取值范围：0 和 [26, 256]，单位：kbps。
注意：当取值为 0，表示音频码率和原始音频保持一致。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频编码器，可选项：aac,mp3,ac3,flac,mp2。 
     * @return Codec 音频编码器，可选项：aac,mp3,ac3,flac,mp2。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频编码器，可选项：aac,mp3,ac3,flac,mp2。
     * @param Codec 音频编码器，可选项：aac,mp3,ac3,flac,mp2。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 声道数，可选项：
1：单声道，
2：双声道，
6：立体声。 
     * @return Channel 声道数，可选项：
1：单声道，
2：双声道，
6：立体声。
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 声道数，可选项：
1：单声道，
2：双声道，
6：立体声。
     * @param Channel 声道数，可选项：
1：单声道，
2：双声道，
6：立体声。
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 采样率，单位：Hz。可选项：32000，44100,48000 
     * @return SampleRate 采样率，单位：Hz。可选项：32000，44100,48000
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率，单位：Hz。可选项：32000，44100,48000
     * @param SampleRate 采样率，单位：Hz。可选项：32000，44100,48000
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 音频降噪信息 
     * @return Denoise 音频降噪信息
     */
    public Denoise getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 音频降噪信息
     * @param Denoise 音频降噪信息
     */
    public void setDenoise(Denoise Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get 开启添加静音，可选项：
0：不开启，
1：开启，
默认不开启 
     * @return EnableMuteAudio 开启添加静音，可选项：
0：不开启，
1：开启，
默认不开启
     */
    public Long getEnableMuteAudio() {
        return this.EnableMuteAudio;
    }

    /**
     * Set 开启添加静音，可选项：
0：不开启，
1：开启，
默认不开启
     * @param EnableMuteAudio 开启添加静音，可选项：
0：不开启，
1：开启，
默认不开启
     */
    public void setEnableMuteAudio(Long EnableMuteAudio) {
        this.EnableMuteAudio = EnableMuteAudio;
    }

    /**
     * Get 音频响度信息 
     * @return LoudnessInfo 音频响度信息
     */
    public LoudnessInfo getLoudnessInfo() {
        return this.LoudnessInfo;
    }

    /**
     * Set 音频响度信息
     * @param LoudnessInfo 音频响度信息
     */
    public void setLoudnessInfo(LoudnessInfo LoudnessInfo) {
        this.LoudnessInfo = LoudnessInfo;
    }

    /**
     * Get 音频音效增强 
     * @return AudioEnhance 音频音效增强
     */
    public AudioEnhance getAudioEnhance() {
        return this.AudioEnhance;
    }

    /**
     * Set 音频音效增强
     * @param AudioEnhance 音频音效增强
     */
    public void setAudioEnhance(AudioEnhance AudioEnhance) {
        this.AudioEnhance = AudioEnhance;
    }

    /**
     * Get 去除混音 
     * @return RemoveReverb 去除混音
     */
    public RemoveReverb getRemoveReverb() {
        return this.RemoveReverb;
    }

    /**
     * Set 去除混音
     * @param RemoveReverb 去除混音
     */
    public void setRemoveReverb(RemoveReverb RemoveReverb) {
        this.RemoveReverb = RemoveReverb;
    }

    public AudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioInfo(AudioInfo source) {
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Denoise != null) {
            this.Denoise = new Denoise(source.Denoise);
        }
        if (source.EnableMuteAudio != null) {
            this.EnableMuteAudio = new Long(source.EnableMuteAudio);
        }
        if (source.LoudnessInfo != null) {
            this.LoudnessInfo = new LoudnessInfo(source.LoudnessInfo);
        }
        if (source.AudioEnhance != null) {
            this.AudioEnhance = new AudioEnhance(source.AudioEnhance);
        }
        if (source.RemoveReverb != null) {
            this.RemoveReverb = new RemoveReverb(source.RemoveReverb);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamSimple(map, prefix + "EnableMuteAudio", this.EnableMuteAudio);
        this.setParamObj(map, prefix + "LoudnessInfo.", this.LoudnessInfo);
        this.setParamObj(map, prefix + "AudioEnhance.", this.AudioEnhance);
        this.setParamObj(map, prefix + "RemoveReverb.", this.RemoveReverb);

    }
}

