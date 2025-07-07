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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceResponse extends AbstractModel {

    /**
    * base64编码的wav/mp3音频数据
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * 一次请求对应一个SessionId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 时间戳信息，若未开启时间戳，则返回空数组。
    */
    @SerializedName("Subtitles")
    @Expose
    private Subtitle [] Subtitles;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get base64编码的wav/mp3音频数据 
     * @return Audio base64编码的wav/mp3音频数据
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set base64编码的wav/mp3音频数据
     * @param Audio base64编码的wav/mp3音频数据
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 一次请求对应一个SessionId 
     * @return SessionId 一次请求对应一个SessionId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 一次请求对应一个SessionId
     * @param SessionId 一次请求对应一个SessionId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 时间戳信息，若未开启时间戳，则返回空数组。 
     * @return Subtitles 时间戳信息，若未开启时间戳，则返回空数组。
     */
    public Subtitle [] getSubtitles() {
        return this.Subtitles;
    }

    /**
     * Set 时间戳信息，若未开启时间戳，则返回空数组。
     * @param Subtitles 时间戳信息，若未开启时间戳，则返回空数组。
     */
    public void setSubtitles(Subtitle [] Subtitles) {
        this.Subtitles = Subtitles;
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

    public TextToVoiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceResponse(TextToVoiceResponse source) {
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Subtitles != null) {
            this.Subtitles = new Subtitle[source.Subtitles.length];
            for (int i = 0; i < source.Subtitles.length; i++) {
                this.Subtitles[i] = new Subtitle(source.Subtitles[i]);
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
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "Subtitles.", this.Subtitles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

