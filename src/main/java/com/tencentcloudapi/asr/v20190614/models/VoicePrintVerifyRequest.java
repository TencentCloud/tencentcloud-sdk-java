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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintVerifyRequest extends AbstractModel{

    /**
    * 音频格式 0: pcm, 1: wav
    */
    @SerializedName("VoiceFormat")
    @Expose
    private Long VoiceFormat;

    /**
    * 音频采样率，目前支持16000，单位：Hz，必填
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 说话人id, 说话人唯一标识
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M	
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 音频格式 0: pcm, 1: wav 
     * @return VoiceFormat 音频格式 0: pcm, 1: wav
     */
    public Long getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set 音频格式 0: pcm, 1: wav
     * @param VoiceFormat 音频格式 0: pcm, 1: wav
     */
    public void setVoiceFormat(Long VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get 音频采样率，目前支持16000，单位：Hz，必填 
     * @return SampleRate 音频采样率，目前支持16000，单位：Hz，必填
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率，目前支持16000，单位：Hz，必填
     * @param SampleRate 音频采样率，目前支持16000，单位：Hz，必填
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 说话人id, 说话人唯一标识 
     * @return VoicePrintId 说话人id, 说话人唯一标识
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 说话人id, 说话人唯一标识
     * @param VoicePrintId 说话人id, 说话人唯一标识
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M	 
     * @return Data 音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M	
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M	
     * @param Data 音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M	
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public VoicePrintVerifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintVerifyRequest(VoicePrintVerifyRequest source) {
        if (source.VoiceFormat != null) {
            this.VoiceFormat = new Long(source.VoiceFormat);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

