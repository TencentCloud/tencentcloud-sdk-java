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

public class VerifyTRTCVoicePrintResponse extends AbstractModel {

    /**
    * 被验证的目标声纹 ID
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 注册时写入的业务方 SpeakerId（以服务端记录为准）
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
    * 相似度分值（字符串形式，保留两位小数，范围约 0~100，越大越相似）
    */
    @SerializedName("Score")
    @Expose
    private String Score;

    /**
    * 服务端阈值判决结果，0=不通过，1=通过（默认阈值 60 分，由服务端统一维护）
    */
    @SerializedName("Decision")
    @Expose
    private Long Decision;

    /**
    * 结果描述，成功时为 voiceprint verify success
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
     * Get 被验证的目标声纹 ID 
     * @return VoicePrintId 被验证的目标声纹 ID
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 被验证的目标声纹 ID
     * @param VoicePrintId 被验证的目标声纹 ID
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 注册时写入的业务方 SpeakerId（以服务端记录为准） 
     * @return SpeakerId 注册时写入的业务方 SpeakerId（以服务端记录为准）
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set 注册时写入的业务方 SpeakerId（以服务端记录为准）
     * @param SpeakerId 注册时写入的业务方 SpeakerId（以服务端记录为准）
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get 相似度分值（字符串形式，保留两位小数，范围约 0~100，越大越相似） 
     * @return Score 相似度分值（字符串形式，保留两位小数，范围约 0~100，越大越相似）
     */
    public String getScore() {
        return this.Score;
    }

    /**
     * Set 相似度分值（字符串形式，保留两位小数，范围约 0~100，越大越相似）
     * @param Score 相似度分值（字符串形式，保留两位小数，范围约 0~100，越大越相似）
     */
    public void setScore(String Score) {
        this.Score = Score;
    }

    /**
     * Get 服务端阈值判决结果，0=不通过，1=通过（默认阈值 60 分，由服务端统一维护） 
     * @return Decision 服务端阈值判决结果，0=不通过，1=通过（默认阈值 60 分，由服务端统一维护）
     */
    public Long getDecision() {
        return this.Decision;
    }

    /**
     * Set 服务端阈值判决结果，0=不通过，1=通过（默认阈值 60 分，由服务端统一维护）
     * @param Decision 服务端阈值判决结果，0=不通过，1=通过（默认阈值 60 分，由服务端统一维护）
     */
    public void setDecision(Long Decision) {
        this.Decision = Decision;
    }

    /**
     * Get 结果描述，成功时为 voiceprint verify success 
     * @return Message 结果描述，成功时为 voiceprint verify success
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 结果描述，成功时为 voiceprint verify success
     * @param Message 结果描述，成功时为 voiceprint verify success
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

    public VerifyTRTCVoicePrintResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyTRTCVoicePrintResponse(VerifyTRTCVoicePrintResponse source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
        if (source.Score != null) {
            this.Score = new String(source.Score);
        }
        if (source.Decision != null) {
            this.Decision = new Long(source.Decision);
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
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Decision", this.Decision);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

