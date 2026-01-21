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

public class AiAnalysisTaskDubbingOutput extends AbstractModel {

    /**
    * 译制视频路径。
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * 标记文件路径

    */
    @SerializedName("SpeakerPath")
    @Expose
    private String SpeakerPath;

    /**
    * 音色id
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 译制视频存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get 译制视频路径。 
     * @return VideoPath 译制视频路径。
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set 译制视频路径。
     * @param VideoPath 译制视频路径。
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get 标记文件路径
 
     * @return SpeakerPath 标记文件路径

     */
    public String getSpeakerPath() {
        return this.SpeakerPath;
    }

    /**
     * Set 标记文件路径

     * @param SpeakerPath 标记文件路径

     */
    public void setSpeakerPath(String SpeakerPath) {
        this.SpeakerPath = SpeakerPath;
    }

    /**
     * Get 音色id 
     * @return VoiceId 音色id
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 音色id
     * @param VoiceId 音色id
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get 译制视频存储位置。 
     * @return OutputStorage 译制视频存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 译制视频存储位置。
     * @param OutputStorage 译制视频存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskDubbingOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDubbingOutput(AiAnalysisTaskDubbingOutput source) {
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.SpeakerPath != null) {
            this.SpeakerPath = new String(source.SpeakerPath);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamSimple(map, prefix + "SpeakerPath", this.SpeakerPath);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

