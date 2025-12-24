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

public class RecognizeAudioResponse extends AbstractModel {

    /**
    * 整段音频的识别结果
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 音频长度，单位秒
    */
    @SerializedName("AudioLength")
    @Expose
    private Float AudioLength;

    /**
    * 分句的识别结果
    */
    @SerializedName("Sentence")
    @Expose
    private RecognizeAudioSentence [] Sentence;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 整段音频的识别结果 
     * @return Text 整段音频的识别结果
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 整段音频的识别结果
     * @param Text 整段音频的识别结果
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 音频长度，单位秒 
     * @return AudioLength 音频长度，单位秒
     */
    public Float getAudioLength() {
        return this.AudioLength;
    }

    /**
     * Set 音频长度，单位秒
     * @param AudioLength 音频长度，单位秒
     */
    public void setAudioLength(Float AudioLength) {
        this.AudioLength = AudioLength;
    }

    /**
     * Get 分句的识别结果 
     * @return Sentence 分句的识别结果
     */
    public RecognizeAudioSentence [] getSentence() {
        return this.Sentence;
    }

    /**
     * Set 分句的识别结果
     * @param Sentence 分句的识别结果
     */
    public void setSentence(RecognizeAudioSentence [] Sentence) {
        this.Sentence = Sentence;
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

    public RecognizeAudioResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAudioResponse(RecognizeAudioResponse source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.AudioLength != null) {
            this.AudioLength = new Float(source.AudioLength);
        }
        if (source.Sentence != null) {
            this.Sentence = new RecognizeAudioSentence[source.Sentence.length];
            for (int i = 0; i < source.Sentence.length; i++) {
                this.Sentence[i] = new RecognizeAudioSentence(source.Sentence[i]);
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
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "AudioLength", this.AudioLength);
        this.setParamArrayObj(map, prefix + "Sentence.", this.Sentence);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

