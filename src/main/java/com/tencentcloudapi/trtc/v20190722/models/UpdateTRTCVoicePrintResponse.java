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

public class UpdateTRTCVoicePrintResponse extends AbstractModel {

    /**
    * 声纹 ID（更新前后保持不变）
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 本次更新音频中有效人声时长（秒）
    */
    @SerializedName("EffectiveAudioDuration")
    @Expose
    private Float EffectiveAudioDuration;

    /**
    * 音频信噪比（dB），由声纹服务端评估给出
    */
    @SerializedName("SNR")
    @Expose
    private Float SNR;

    /**
    * 结果描述，成功时为 voiceprint updated successfully
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 声纹 ID（更新前后保持不变） 
     * @return VoicePrintId 声纹 ID（更新前后保持不变）
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 声纹 ID（更新前后保持不变）
     * @param VoicePrintId 声纹 ID（更新前后保持不变）
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 本次更新音频中有效人声时长（秒） 
     * @return EffectiveAudioDuration 本次更新音频中有效人声时长（秒）
     */
    public Float getEffectiveAudioDuration() {
        return this.EffectiveAudioDuration;
    }

    /**
     * Set 本次更新音频中有效人声时长（秒）
     * @param EffectiveAudioDuration 本次更新音频中有效人声时长（秒）
     */
    public void setEffectiveAudioDuration(Float EffectiveAudioDuration) {
        this.EffectiveAudioDuration = EffectiveAudioDuration;
    }

    /**
     * Get 音频信噪比（dB），由声纹服务端评估给出 
     * @return SNR 音频信噪比（dB），由声纹服务端评估给出
     */
    public Float getSNR() {
        return this.SNR;
    }

    /**
     * Set 音频信噪比（dB），由声纹服务端评估给出
     * @param SNR 音频信噪比（dB），由声纹服务端评估给出
     */
    public void setSNR(Float SNR) {
        this.SNR = SNR;
    }

    /**
     * Get 结果描述，成功时为 voiceprint updated successfully 
     * @return Message 结果描述，成功时为 voiceprint updated successfully
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 结果描述，成功时为 voiceprint updated successfully
     * @param Message 结果描述，成功时为 voiceprint updated successfully
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UpdateTRTCVoicePrintResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTRTCVoicePrintResponse(UpdateTRTCVoicePrintResponse source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.EffectiveAudioDuration != null) {
            this.EffectiveAudioDuration = new Float(source.EffectiveAudioDuration);
        }
        if (source.SNR != null) {
            this.SNR = new Float(source.SNR);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "EffectiveAudioDuration", this.EffectiveAudioDuration);
        this.setParamSimple(map, prefix + "SNR", this.SNR);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

