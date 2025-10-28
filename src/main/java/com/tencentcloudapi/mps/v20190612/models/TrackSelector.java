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

public class TrackSelector extends AbstractModel {

    /**
    * 视频轨道序号，从1开始.
    */
    @SerializedName("VideoIndex")
    @Expose
    private Long [] VideoIndex;

    /**
    * 音频轨道序号，从1开始.
    */
    @SerializedName("AudioIndex")
    @Expose
    private Long [] AudioIndex;

    /**
     * Get 视频轨道序号，从1开始. 
     * @return VideoIndex 视频轨道序号，从1开始.
     */
    public Long [] getVideoIndex() {
        return this.VideoIndex;
    }

    /**
     * Set 视频轨道序号，从1开始.
     * @param VideoIndex 视频轨道序号，从1开始.
     */
    public void setVideoIndex(Long [] VideoIndex) {
        this.VideoIndex = VideoIndex;
    }

    /**
     * Get 音频轨道序号，从1开始. 
     * @return AudioIndex 音频轨道序号，从1开始.
     */
    public Long [] getAudioIndex() {
        return this.AudioIndex;
    }

    /**
     * Set 音频轨道序号，从1开始.
     * @param AudioIndex 音频轨道序号，从1开始.
     */
    public void setAudioIndex(Long [] AudioIndex) {
        this.AudioIndex = AudioIndex;
    }

    public TrackSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrackSelector(TrackSelector source) {
        if (source.VideoIndex != null) {
            this.VideoIndex = new Long[source.VideoIndex.length];
            for (int i = 0; i < source.VideoIndex.length; i++) {
                this.VideoIndex[i] = new Long(source.VideoIndex[i]);
            }
        }
        if (source.AudioIndex != null) {
            this.AudioIndex = new Long[source.AudioIndex.length];
            for (int i = 0; i < source.AudioIndex.length; i++) {
                this.AudioIndex[i] = new Long(source.AudioIndex[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VideoIndex.", this.VideoIndex);
        this.setParamArraySimple(map, prefix + "AudioIndex.", this.AudioIndex);

    }
}

