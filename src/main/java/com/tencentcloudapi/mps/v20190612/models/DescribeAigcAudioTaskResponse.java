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

public class DescribeAigcAudioTaskResponse extends AbstractModel {

    /**
    * <p>任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>当任务状态为 FAIL时，返回失败信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>输出的音频信息。</p>
    */
    @SerializedName("AudioInfos")
    @Expose
    private AigcAudioOutputAudioInfo [] AudioInfos;

    /**
    * <p>输出的视频信息，仅视频配音等场景会输出。</p>
    */
    @SerializedName("VideoInfos")
    @Expose
    private AigcAudioOutputVideoInfo [] VideoInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。</p> 
     * @return Status <p>任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。</p>
     * @param Status <p>任务当前状态。 WAIT：等待中， RUN：执行中， FAIL：任务失败， DONE：任务成功。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>当任务状态为 FAIL时，返回失败信息。</p> 
     * @return Message <p>当任务状态为 FAIL时，返回失败信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>当任务状态为 FAIL时，返回失败信息。</p>
     * @param Message <p>当任务状态为 FAIL时，返回失败信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>输出的音频信息。</p> 
     * @return AudioInfos <p>输出的音频信息。</p>
     */
    public AigcAudioOutputAudioInfo [] getAudioInfos() {
        return this.AudioInfos;
    }

    /**
     * Set <p>输出的音频信息。</p>
     * @param AudioInfos <p>输出的音频信息。</p>
     */
    public void setAudioInfos(AigcAudioOutputAudioInfo [] AudioInfos) {
        this.AudioInfos = AudioInfos;
    }

    /**
     * Get <p>输出的视频信息，仅视频配音等场景会输出。</p> 
     * @return VideoInfos <p>输出的视频信息，仅视频配音等场景会输出。</p>
     */
    public AigcAudioOutputVideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set <p>输出的视频信息，仅视频配音等场景会输出。</p>
     * @param VideoInfos <p>输出的视频信息，仅视频配音等场景会输出。</p>
     */
    public void setVideoInfos(AigcAudioOutputVideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
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

    public DescribeAigcAudioTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcAudioTaskResponse(DescribeAigcAudioTaskResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.AudioInfos != null) {
            this.AudioInfos = new AigcAudioOutputAudioInfo[source.AudioInfos.length];
            for (int i = 0; i < source.AudioInfos.length; i++) {
                this.AudioInfos[i] = new AigcAudioOutputAudioInfo(source.AudioInfos[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new AigcAudioOutputVideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new AigcAudioOutputVideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "AudioInfos.", this.AudioInfos);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

