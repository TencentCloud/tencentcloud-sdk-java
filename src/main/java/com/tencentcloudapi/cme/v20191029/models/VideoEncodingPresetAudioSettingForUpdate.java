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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEncodingPresetAudioSettingForUpdate extends AbstractModel{

    /**
    * 音频码率，单位：bps。
不填则不修改。
    */
    @SerializedName("Bitrate")
    @Expose
    private String Bitrate;

    /**
    * 音频声道数，可选值： 
<li>1：单声道；</li>
<li>2：双声道。</li> 
不填则不修改。
    */
    @SerializedName("Channels")
    @Expose
    private Long Channels;

    /**
    * 音频流的采样率，目前仅支持： 16000； 32000； 44100； 48000。单位：Hz。
不填则不修改。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
     * Get 音频码率，单位：bps。
不填则不修改。 
     * @return Bitrate 音频码率，单位：bps。
不填则不修改。
     */
    public String getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频码率，单位：bps。
不填则不修改。
     * @param Bitrate 音频码率，单位：bps。
不填则不修改。
     */
    public void setBitrate(String Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频声道数，可选值： 
<li>1：单声道；</li>
<li>2：双声道。</li> 
不填则不修改。 
     * @return Channels 音频声道数，可选值： 
<li>1：单声道；</li>
<li>2：双声道。</li> 
不填则不修改。
     */
    public Long getChannels() {
        return this.Channels;
    }

    /**
     * Set 音频声道数，可选值： 
<li>1：单声道；</li>
<li>2：双声道。</li> 
不填则不修改。
     * @param Channels 音频声道数，可选值： 
<li>1：单声道；</li>
<li>2：双声道。</li> 
不填则不修改。
     */
    public void setChannels(Long Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 音频流的采样率，目前仅支持： 16000； 32000； 44100； 48000。单位：Hz。
不填则不修改。 
     * @return SampleRate 音频流的采样率，目前仅支持： 16000； 32000； 44100； 48000。单位：Hz。
不填则不修改。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频流的采样率，目前仅支持： 16000； 32000； 44100； 48000。单位：Hz。
不填则不修改。
     * @param SampleRate 音频流的采样率，目前仅支持： 16000； 32000； 44100； 48000。单位：Hz。
不填则不修改。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    public VideoEncodingPresetAudioSettingForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodingPresetAudioSettingForUpdate(VideoEncodingPresetAudioSettingForUpdate source) {
        if (source.Bitrate != null) {
            this.Bitrate = new String(source.Bitrate);
        }
        if (source.Channels != null) {
            this.Channels = new Long(source.Channels);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Channels", this.Channels);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}

