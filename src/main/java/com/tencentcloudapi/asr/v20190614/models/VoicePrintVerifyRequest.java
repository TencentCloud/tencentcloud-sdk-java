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

public class VoicePrintVerifyRequest extends AbstractModel {

    /**
    * <p>音频格式 0: pcm, 1: wav</p>
    */
    @SerializedName("VoiceFormat")
    @Expose
    private Long VoiceFormat;

    /**
    * <p>音频采样率，目前支持16000，单位：Hz，必填</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>说话人id, 说话人唯一标识</p>
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * <p>音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>声纹cos url 注意:仅支持腾讯云cos url 地址</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
     * Get <p>音频格式 0: pcm, 1: wav</p> 
     * @return VoiceFormat <p>音频格式 0: pcm, 1: wav</p>
     */
    public Long getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * Set <p>音频格式 0: pcm, 1: wav</p>
     * @param VoiceFormat <p>音频格式 0: pcm, 1: wav</p>
     */
    public void setVoiceFormat(Long VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * Get <p>音频采样率，目前支持16000，单位：Hz，必填</p> 
     * @return SampleRate <p>音频采样率，目前支持16000，单位：Hz，必填</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频采样率，目前支持16000，单位：Hz，必填</p>
     * @param SampleRate <p>音频采样率，目前支持16000，单位：Hz，必填</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>说话人id, 说话人唯一标识</p> 
     * @return VoicePrintId <p>说话人id, 说话人唯一标识</p>
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set <p>说话人id, 说话人唯一标识</p>
     * @param VoicePrintId <p>说话人id, 说话人唯一标识</p>
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get <p>音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M</p> 
     * @return Data <p>音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M</p>
     * @param Data <p>音频数据, base64 编码, 音频时长不能超过30s，数据大小不超过2M</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>声纹cos url 注意:仅支持腾讯云cos url 地址</p> 
     * @return AudioUrl <p>声纹cos url 注意:仅支持腾讯云cos url 地址</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>声纹cos url 注意:仅支持腾讯云cos url 地址</p>
     * @param AudioUrl <p>声纹cos url 注意:仅支持腾讯云cos url 地址</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
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
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
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
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);

    }
}

