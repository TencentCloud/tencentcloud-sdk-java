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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEncodeParams extends AbstractModel {

    /**
    * 音频采样率，取值为[48000, 44100]，单位是Hz。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 音频声道数，取值范围[1,2]，1表示音频为单声道，2表示音频为双声道。
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 音频码率，取值范围[8,500]，单位为kbps。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get 音频采样率，取值为[48000, 44100]，单位是Hz。 
     * @return SampleRate 音频采样率，取值为[48000, 44100]，单位是Hz。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率，取值为[48000, 44100]，单位是Hz。
     * @param SampleRate 音频采样率，取值为[48000, 44100]，单位是Hz。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 音频声道数，取值范围[1,2]，1表示音频为单声道，2表示音频为双声道。 
     * @return Channel 音频声道数，取值范围[1,2]，1表示音频为单声道，2表示音频为双声道。
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 音频声道数，取值范围[1,2]，1表示音频为单声道，2表示音频为双声道。
     * @param Channel 音频声道数，取值范围[1,2]，1表示音频为单声道，2表示音频为双声道。
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 音频码率，取值范围[8,500]，单位为kbps。 
     * @return BitRate 音频码率，取值范围[8,500]，单位为kbps。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 音频码率，取值范围[8,500]，单位为kbps。
     * @param BitRate 音频码率，取值范围[8,500]，单位为kbps。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    public AudioEncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEncodeParams(AudioEncodeParams source) {
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);

    }
}

