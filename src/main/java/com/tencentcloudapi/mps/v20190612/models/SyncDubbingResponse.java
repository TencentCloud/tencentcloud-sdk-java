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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDubbingResponse extends AbstractModel {

    /**
    * 错误码，成功时返回0
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 错误信息，成功时返回success
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 合成音频的base64编码，wav格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 克隆的音色Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误码，成功时返回0 
     * @return ErrorCode 错误码，成功时返回0
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码，成功时返回0
     * @param ErrorCode 错误码，成功时返回0
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息，成功时返回success 
     * @return Msg 错误信息，成功时返回success
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 错误信息，成功时返回success
     * @param Msg 错误信息，成功时返回success
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 合成音频的base64编码，wav格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioData 合成音频的base64编码，wav格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set 合成音频的base64编码，wav格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioData 合成音频的base64编码，wav格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get 克隆的音色Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceId 克隆的音色Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 克隆的音色Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceId 克隆的音色Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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

    public SyncDubbingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingResponse(SyncDubbingResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

