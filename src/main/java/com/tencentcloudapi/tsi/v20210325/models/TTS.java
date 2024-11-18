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
package com.tencentcloudapi.tsi.v20210325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TTS extends AbstractModel {

    /**
    * 返回音频格式，可取值：wav，mp3，pcm
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音色 ID，只包括标准音色（注，日文只有一个固定音色）。
完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，6]，分别对应不同语速：

- -2代表0.6倍
- -1代表0.8倍
- 0代表1.0倍（默认）
- 1代表1.2倍
- 2代表1.5倍
- 6代表2.5倍

如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。
参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 音频采样率：

- 16000：16k（默认）
- 8000：8k
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
     * Get 返回音频格式，可取值：wav，mp3，pcm 
     * @return Codec 返回音频格式，可取值：wav，mp3，pcm
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 返回音频格式，可取值：wav，mp3，pcm
     * @param Codec 返回音频格式，可取值：wav，mp3，pcm
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音色 ID，只包括标准音色（注，日文只有一个固定音色）。
完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。 
     * @return VoiceType 音色 ID，只包括标准音色（注，日文只有一个固定音色）。
完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色 ID，只包括标准音色（注，日文只有一个固定音色）。
完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     * @param VoiceType 音色 ID，只包括标准音色（注，日文只有一个固定音色）。
完整的音色 ID 列表请参见[音色列表](https://cloud.tencent.com/document/product/1073/92668)。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。 
     * @return Volume 音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     * @param Volume 音量大小，范围[-10，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 语速，范围：[-2，6]，分别对应不同语速：

- -2代表0.6倍
- -1代表0.8倍
- 0代表1.0倍（默认）
- 1代表1.2倍
- 2代表1.5倍
- 6代表2.5倍

如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。
参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz) 
     * @return Speed 语速，范围：[-2，6]，分别对应不同语速：

- -2代表0.6倍
- -1代表0.8倍
- 0代表1.0倍（默认）
- 1代表1.2倍
- 2代表1.5倍
- 6代表2.5倍

如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。
参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围：[-2，6]，分别对应不同语速：

- -2代表0.6倍
- -1代表0.8倍
- 0代表1.0倍（默认）
- 1代表1.2倍
- 2代表1.5倍
- 6代表2.5倍

如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。
参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
     * @param Speed 语速，范围：[-2，6]，分别对应不同语速：

- -2代表0.6倍
- -1代表0.8倍
- 0代表1.0倍（默认）
- 1代表1.2倍
- 2代表1.5倍
- 6代表2.5倍

如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。
参数值与实际语速转换，可参考[代码示例](https://sdk-1300466766.cos.ap-shanghai.myqcloud.com/sample/speed_sample.tar.gz)
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 音频采样率：

- 16000：16k（默认）
- 8000：8k 
     * @return SampleRate 音频采样率：

- 16000：16k（默认）
- 8000：8k
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：

- 16000：16k（默认）
- 8000：8k
     * @param SampleRate 音频采样率：

- 16000：16k（默认）
- 8000：8k
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    public TTS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TTS(TTS source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}

