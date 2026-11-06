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

public class UpdateTRTCVoicePrintRequest extends AbstractModel {

    /**
    * 待更新的声纹 ID（由 RegisterTRTCVoicePrint 返回）。更新采用覆盖模式——只保留一条最新音频，VoicePrintId 保持不变。
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 新的音频数据的 Base64 字符串。要求与 RegisterTRTCVoicePrint一致：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后 ≤ 2MB；PCM 裸数据 10s ≤ 时长 ≤ 45s。
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
     * Get 待更新的声纹 ID（由 RegisterTRTCVoicePrint 返回）。更新采用覆盖模式——只保留一条最新音频，VoicePrintId 保持不变。 
     * @return VoicePrintId 待更新的声纹 ID（由 RegisterTRTCVoicePrint 返回）。更新采用覆盖模式——只保留一条最新音频，VoicePrintId 保持不变。
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 待更新的声纹 ID（由 RegisterTRTCVoicePrint 返回）。更新采用覆盖模式——只保留一条最新音频，VoicePrintId 保持不变。
     * @param VoicePrintId 待更新的声纹 ID（由 RegisterTRTCVoicePrint 返回）。更新采用覆盖模式——只保留一条最新音频，VoicePrintId 保持不变。
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 新的音频数据的 Base64 字符串。要求与 RegisterTRTCVoicePrint一致：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后 ≤ 2MB；PCM 裸数据 10s ≤ 时长 ≤ 45s。 
     * @return Data 新的音频数据的 Base64 字符串。要求与 RegisterTRTCVoicePrint一致：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后 ≤ 2MB；PCM 裸数据 10s ≤ 时长 ≤ 45s。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 新的音频数据的 Base64 字符串。要求与 RegisterTRTCVoicePrint一致：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后 ≤ 2MB；PCM 裸数据 10s ≤ 时长 ≤ 45s。
     * @param Data 新的音频数据的 Base64 字符串。要求与 RegisterTRTCVoicePrint一致：16kHz/16bit/单声道 PCM 或 WAV；Base64 解码后 ≤ 2MB；PCM 裸数据 10s ≤ 时长 ≤ 45s。
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

    public UpdateTRTCVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTRTCVoicePrintRequest(UpdateTRTCVoicePrintRequest source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
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
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);

    }
}

