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
    * 生成的音频格式，默认pcm，目前支持的格式列表：流式：[pcm]，非流式 [pcm，wav]
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 采样率，默认24000， 可选16000, 24000 
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
     * Get 生成的音频格式，默认pcm，目前支持的格式列表：流式：[pcm]，非流式 [pcm，wav] 
     * @return Format 生成的音频格式，默认pcm，目前支持的格式列表：流式：[pcm]，非流式 [pcm，wav]
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 生成的音频格式，默认pcm，目前支持的格式列表：流式：[pcm]，非流式 [pcm，wav]
     * @param Format 生成的音频格式，默认pcm，目前支持的格式列表：流式：[pcm]，非流式 [pcm，wav]
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 采样率，默认24000， 可选16000, 24000  
     * @return SampleRate 采样率，默认24000， 可选16000, 24000 
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率，默认24000， 可选16000, 24000 
     * @param SampleRate 采样率，默认24000， 可选16000, 24000 
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}

