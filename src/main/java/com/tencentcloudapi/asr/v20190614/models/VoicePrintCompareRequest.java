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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintCompareRequest extends AbstractModel {

    /**
    * 音频格式 0: pcm, 1: wav；pcm和wav音频无损压缩，识别准确度更高
    */
    @SerializedName("VoiceFormat")
    @Expose
    private Long VoiceFormat;

    /**
    * 音频采样率，目前仅支持16k，请填写16000
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 对比源音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
    */
    @SerializedName("SrcAudioData")
    @Expose
    private String SrcAudioData;

    /**
    * 对比目标音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
    */
    @SerializedName("DestAudioData")
    @Expose
    private String DestAudioData;

    /**
     * Get 音频格式 0: pcm, 1: wav；pcm和wav音频无损压缩，识别准确度更高 
     * @return VoiceFormat 音频格式 0: pcm, 1: wav；pcm和wav音频无损压缩，识别准确度更高
     */
    public Long getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set 音频格式 0: pcm, 1: wav；pcm和wav音频无损压缩，识别准确度更高
     * @param VoiceFormat 音频格式 0: pcm, 1: wav；pcm和wav音频无损压缩，识别准确度更高
     */
    public void setVoiceFormat(Long VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get 音频采样率，目前仅支持16k，请填写16000 
     * @return SampleRate 音频采样率，目前仅支持16k，请填写16000
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率，目前仅支持16k，请填写16000
     * @param SampleRate 音频采样率，目前仅支持16k，请填写16000
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 对比源音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M 
     * @return SrcAudioData 对比源音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     */
    public String getSrcAudioData() {
        return this.SrcAudioData;
    }

    /**
     * Set 对比源音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     * @param SrcAudioData 对比源音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     */
    public void setSrcAudioData(String SrcAudioData) {
        this.SrcAudioData = SrcAudioData;
    }

    /**
     * Get 对比目标音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M 
     * @return DestAudioData 对比目标音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     */
    public String getDestAudioData() {
        return this.DestAudioData;
    }

    /**
     * Set 对比目标音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     * @param DestAudioData 对比目标音频数据, 音频要求：base64 编码,16k采样率， 16bit位深，pcm或者wav格式， 单声道，音频时长不超过30秒的音频，base64编码数据大小不超过2M
     */
    public void setDestAudioData(String DestAudioData) {
        this.DestAudioData = DestAudioData;
    }

    public VoicePrintCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintCompareRequest(VoicePrintCompareRequest source) {
        if (source.VoiceFormat != null) {
            this.VoiceFormat = new Long(source.VoiceFormat);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.SrcAudioData != null) {
            this.SrcAudioData = new String(source.SrcAudioData);
        }
        if (source.DestAudioData != null) {
            this.DestAudioData = new String(source.DestAudioData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "SrcAudioData", this.SrcAudioData);
        this.setParamSimple(map, prefix + "DestAudioData", this.DestAudioData);

    }
}

