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

public class TextToSpeechResponse extends AbstractModel {

    /**
    * <p>Base64编码的音频数据</p>
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * <p>字幕对齐数据</p>
    */
    @SerializedName("Alignments")
    @Expose
    private AlignmentItem [] Alignments;

    /**
    * <p>音频时长</p>
    */
    @SerializedName("TotalDurationMs")
    @Expose
    private Long TotalDurationMs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Base64编码的音频数据</p> 
     * @return Audio <p>Base64编码的音频数据</p>
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set <p>Base64编码的音频数据</p>
     * @param Audio <p>Base64编码的音频数据</p>
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get <p>字幕对齐数据</p> 
     * @return Alignments <p>字幕对齐数据</p>
     */
    public AlignmentItem [] getAlignments() {
        return this.Alignments;
    }

    /**
     * Set <p>字幕对齐数据</p>
     * @param Alignments <p>字幕对齐数据</p>
     */
    public void setAlignments(AlignmentItem [] Alignments) {
        this.Alignments = Alignments;
    }

    /**
     * Get <p>音频时长</p> 
     * @return TotalDurationMs <p>音频时长</p>
     */
    public Long getTotalDurationMs() {
        return this.TotalDurationMs;
    }

    /**
     * Set <p>音频时长</p>
     * @param TotalDurationMs <p>音频时长</p>
     */
    public void setTotalDurationMs(Long TotalDurationMs) {
        this.TotalDurationMs = TotalDurationMs;
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

    public TextToSpeechResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechResponse(TextToSpeechResponse source) {
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.Alignments != null) {
            this.Alignments = new AlignmentItem[source.Alignments.length];
            for (int i = 0; i < source.Alignments.length; i++) {
                this.Alignments[i] = new AlignmentItem(source.Alignments[i]);
            }
        }
        if (source.TotalDurationMs != null) {
            this.TotalDurationMs = new Long(source.TotalDurationMs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamArrayObj(map, prefix + "Alignments.", this.Alignments);
        this.setParamSimple(map, prefix + "TotalDurationMs", this.TotalDurationMs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

