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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAudioStreamItem extends AbstractModel{

    /**
    * 音频流的码率，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频流的采样率，单位：hz。
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * 音频流的编码格式，例如 aac。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
     * Get 音频流的码率，单位：bps。 
     * @return Bitrate 音频流的码率，单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，单位：bps。
     * @param Bitrate 音频流的码率，单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频流的采样率，单位：hz。 
     * @return SamplingRate 音频流的采样率，单位：hz。
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set 音频流的采样率，单位：hz。
     * @param SamplingRate 音频流的采样率，单位：hz。
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get 音频流的编码格式，例如 aac。 
     * @return Codec 音频流的编码格式，例如 aac。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码格式，例如 aac。
     * @param Codec 音频流的编码格式，例如 aac。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);

    }
}

