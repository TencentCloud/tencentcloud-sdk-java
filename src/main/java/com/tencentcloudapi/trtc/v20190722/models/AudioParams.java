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

public class AudioParams extends AbstractModel {

    /**
    * <p>音频采样率枚举值:(注意1 代表48000HZ, 2 代表44100HZ, 3 代表16000HZ)<br>1：48000Hz（默认）;<br>2：44100Hz<br>3：16000Hz。</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>声道数枚举值:<br>1：单声道;<br>2：双声道（默认）。</p>
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * <p>音频码率: 取值范围[32000, 128000] ，单位bps，默认64000bps。</p>
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get <p>音频采样率枚举值:(注意1 代表48000HZ, 2 代表44100HZ, 3 代表16000HZ)<br>1：48000Hz（默认）;<br>2：44100Hz<br>3：16000Hz。</p> 
     * @return SampleRate <p>音频采样率枚举值:(注意1 代表48000HZ, 2 代表44100HZ, 3 代表16000HZ)<br>1：48000Hz（默认）;<br>2：44100Hz<br>3：16000Hz。</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频采样率枚举值:(注意1 代表48000HZ, 2 代表44100HZ, 3 代表16000HZ)<br>1：48000Hz（默认）;<br>2：44100Hz<br>3：16000Hz。</p>
     * @param SampleRate <p>音频采样率枚举值:(注意1 代表48000HZ, 2 代表44100HZ, 3 代表16000HZ)<br>1：48000Hz（默认）;<br>2：44100Hz<br>3：16000Hz。</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>声道数枚举值:<br>1：单声道;<br>2：双声道（默认）。</p> 
     * @return Channel <p>声道数枚举值:<br>1：单声道;<br>2：双声道（默认）。</p>
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>声道数枚举值:<br>1：单声道;<br>2：双声道（默认）。</p>
     * @param Channel <p>声道数枚举值:<br>1：单声道;<br>2：双声道（默认）。</p>
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>音频码率: 取值范围[32000, 128000] ，单位bps，默认64000bps。</p> 
     * @return BitRate <p>音频码率: 取值范围[32000, 128000] ，单位bps，默认64000bps。</p>
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set <p>音频码率: 取值范围[32000, 128000] ，单位bps，默认64000bps。</p>
     * @param BitRate <p>音频码率: 取值范围[32000, 128000] ，单位bps，默认64000bps。</p>
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    public AudioParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioParams(AudioParams source) {
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

