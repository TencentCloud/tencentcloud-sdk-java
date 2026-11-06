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

public class RegisterTRTCVoicePrintRequest extends AbstractModel {

    /**
    * 业务方自定义的说话人唯一标识，同一 (AppId, SdkAppId, SpeakerId) 重复调用会覆盖旧声纹（软删旧记录 + 新建一行，返回新的 VoicePrintId）
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
    * 音频数据的 Base64 字符串。要求：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后大小 ≤ 2MB；PCM 裸数据时长 10s ≤ 时长 ≤ 45s（WAV 去掉 header 后按相同标准校验）
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 音频格式，可选 pcm 或 wav，大小写不敏感，不传默认为 pcm
    */
    @SerializedName("AudioFormat")
    @Expose
    private String AudioFormat;

    /**
     * Get 业务方自定义的说话人唯一标识，同一 (AppId, SdkAppId, SpeakerId) 重复调用会覆盖旧声纹（软删旧记录 + 新建一行，返回新的 VoicePrintId） 
     * @return SpeakerId 业务方自定义的说话人唯一标识，同一 (AppId, SdkAppId, SpeakerId) 重复调用会覆盖旧声纹（软删旧记录 + 新建一行，返回新的 VoicePrintId）
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set 业务方自定义的说话人唯一标识，同一 (AppId, SdkAppId, SpeakerId) 重复调用会覆盖旧声纹（软删旧记录 + 新建一行，返回新的 VoicePrintId）
     * @param SpeakerId 业务方自定义的说话人唯一标识，同一 (AppId, SdkAppId, SpeakerId) 重复调用会覆盖旧声纹（软删旧记录 + 新建一行，返回新的 VoicePrintId）
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get 音频数据的 Base64 字符串。要求：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后大小 ≤ 2MB；PCM 裸数据时长 10s ≤ 时长 ≤ 45s（WAV 去掉 header 后按相同标准校验） 
     * @return Data 音频数据的 Base64 字符串。要求：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后大小 ≤ 2MB；PCM 裸数据时长 10s ≤ 时长 ≤ 45s（WAV 去掉 header 后按相同标准校验）
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 音频数据的 Base64 字符串。要求：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后大小 ≤ 2MB；PCM 裸数据时长 10s ≤ 时长 ≤ 45s（WAV 去掉 header 后按相同标准校验）
     * @param Data 音频数据的 Base64 字符串。要求：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后大小 ≤ 2MB；PCM 裸数据时长 10s ≤ 时长 ≤ 45s（WAV 去掉 header 后按相同标准校验）
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get SdkAppId 
     * @return SdkAppId SdkAppId
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId
     * @param SdkAppId SdkAppId
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 音频格式，可选 pcm 或 wav，大小写不敏感，不传默认为 pcm 
     * @return AudioFormat 音频格式，可选 pcm 或 wav，大小写不敏感，不传默认为 pcm
     */
    public String getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 音频格式，可选 pcm 或 wav，大小写不敏感，不传默认为 pcm
     * @param AudioFormat 音频格式，可选 pcm 或 wav，大小写不敏感，不传默认为 pcm
     */
    public void setAudioFormat(String AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    public RegisterTRTCVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterTRTCVoicePrintRequest(RegisterTRTCVoicePrintRequest source) {
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new String(source.AudioFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);

    }
}

