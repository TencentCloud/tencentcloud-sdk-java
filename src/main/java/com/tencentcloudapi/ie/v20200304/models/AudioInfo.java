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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);

    }
}

