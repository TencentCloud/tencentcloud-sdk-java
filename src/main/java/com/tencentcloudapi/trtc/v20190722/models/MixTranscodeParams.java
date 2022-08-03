/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixTranscodeParams extends AbstractModel{

    /**
    * 录制视频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
    */
    @SerializedName("VideoParams")
    @Expose
    private VideoParams VideoParams;

    /**
    * 录制音频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
    */
    @SerializedName("AudioParams")
    @Expose
    private AudioParams AudioParams;

    /**
     * Get 录制视频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。 
     * @return VideoParams 录制视频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     */
    public VideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set 录制视频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     * @param VideoParams 录制视频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     */
    public void setVideoParams(VideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get 录制音频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。 
     * @return AudioParams 录制音频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     */
    public AudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set 录制音频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     * @param AudioParams 录制音频转码参数，注意如果设置了这个参数，那么里面的字段都是必填的，没有默认值，如果不填这个参数，那么取值为默认值。
     */
    public void setAudioParams(AudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    public MixTranscodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixTranscodeParams(MixTranscodeParams source) {
        if (source.VideoParams != null) {
            this.VideoParams = new VideoParams(source.VideoParams);
        }
        if (source.AudioParams != null) {
            this.AudioParams = new AudioParams(source.AudioParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamObj(map, prefix + "AudioParams.", this.AudioParams);

    }
}

