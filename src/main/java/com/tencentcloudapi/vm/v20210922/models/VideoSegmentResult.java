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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSegmentResult extends AbstractModel {

    /**
    * <p>违规标志 0 未命中 1 命中</p>
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * <p>审核建议，可选值： Pass 通过， Review 建议人审， Block 确认违规</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>Asr文本内容</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>审核结果</p>
    */
    @SerializedName("Detail")
    @Expose
    private VideoLLMDetail [] Detail;

    /**
    * <p>视频切片存储URL</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>音频切片存储URL</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>切片时长</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>切片请求ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>违规标志 0 未命中 1 命中</p> 
     * @return HitFlag <p>违规标志 0 未命中 1 命中</p>
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set <p>违规标志 0 未命中 1 命中</p>
     * @param HitFlag <p>违规标志 0 未命中 1 命中</p>
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get <p>审核建议，可选值： Pass 通过， Review 建议人审， Block 确认违规</p> 
     * @return Suggestion <p>审核建议，可选值： Pass 通过， Review 建议人审， Block 确认违规</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>审核建议，可选值： Pass 通过， Review 建议人审， Block 确认违规</p>
     * @param Suggestion <p>审核建议，可选值： Pass 通过， Review 建议人审， Block 确认违规</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>Asr文本内容</p> 
     * @return Text <p>Asr文本内容</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Asr文本内容</p>
     * @param Text <p>Asr文本内容</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>审核结果</p> 
     * @return Detail <p>审核结果</p>
     */
    public VideoLLMDetail [] getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>审核结果</p>
     * @param Detail <p>审核结果</p>
     */
    public void setDetail(VideoLLMDetail [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>视频切片存储URL</p> 
     * @return VideoUrl <p>视频切片存储URL</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>视频切片存储URL</p>
     * @param VideoUrl <p>视频切片存储URL</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>音频切片存储URL</p> 
     * @return AudioUrl <p>音频切片存储URL</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>音频切片存储URL</p>
     * @param AudioUrl <p>音频切片存储URL</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>切片时长</p> 
     * @return Duration <p>切片时长</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>切片时长</p>
     * @param Duration <p>切片时长</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>切片请求ID</p> 
     * @return RequestId <p>切片请求ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>切片请求ID</p>
     * @param RequestId <p>切片请求ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VideoSegmentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSegmentResult(VideoSegmentResult source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Detail != null) {
            this.Detail = new VideoLLMDetail[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new VideoLLMDetail(source.Detail[i]);
            }
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

