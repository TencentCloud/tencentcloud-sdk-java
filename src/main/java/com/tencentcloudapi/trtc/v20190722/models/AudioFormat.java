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
    * 生成的音频格式

- TextToSpeech流式接口

 支持 pcm, 默认: pcm

- TextToSpeech非流式接口

 支持 pcm,wav,  默认: pcm
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 生成的音频采样率，默认24000
可选
- 16000
- 24000 
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    *  MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： `64`, `128`, `192`, `256` ,  默认： `128` 
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get 生成的音频格式

- TextToSpeech流式接口

 支持 pcm, 默认: pcm

- TextToSpeech非流式接口

 支持 pcm,wav,  默认: pcm 
     * @return Format 生成的音频格式

- TextToSpeech流式接口

 支持 pcm, 默认: pcm

- TextToSpeech非流式接口

 支持 pcm,wav,  默认: pcm
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 生成的音频格式

- TextToSpeech流式接口

 支持 pcm, 默认: pcm

- TextToSpeech非流式接口

 支持 pcm,wav,  默认: pcm
     * @param Format 生成的音频格式

- TextToSpeech流式接口

 支持 pcm, 默认: pcm

- TextToSpeech非流式接口

 支持 pcm,wav,  默认: pcm
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 生成的音频采样率，默认24000
可选
- 16000
- 24000  
     * @return SampleRate 生成的音频采样率，默认24000
可选
- 16000
- 24000 
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 生成的音频采样率，默认24000
可选
- 16000
- 24000 
     * @param SampleRate 生成的音频采样率，默认24000
可选
- 16000
- 24000 
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get  MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： `64`, `128`, `192`, `256` ,  默认： `128`  
     * @return Bitrate  MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： `64`, `128`, `192`, `256` ,  默认： `128` 
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set  MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： `64`, `128`, `192`, `256` ,  默认： `128` 
     * @param Bitrate  MP3 比特率 (kbps)，仅对 MP3 格式生效, 可以选： `64`, `128`, `192`, `256` ,  默认： `128` 
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

