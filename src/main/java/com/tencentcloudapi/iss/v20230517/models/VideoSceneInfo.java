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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSceneInfo extends AbstractModel {

    /**
    * <p>分析周期（秒）：每隔多少秒从云端录像中截取一个视频片段进行分析。例如 Interval=3600、Duration=600，表示每隔1小时 取一个 10 分钟的视频片段进行分析。需满足 Duration ≤ Interval，否则相邻片段将重叠。取值范围［5,86400］。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>分析片段时长（秒）：每次分析截取的视频片段长度，即单次分析覆盖的视频时长。取值范围［5,12800］。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>抽帧率（FPS）：在片段内每隔1/Fps 秒截取一帧进行分析。取值越大，分析越精细，单次分析的帧数越多。默认值1，取值范围［0.1,1</p>
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
     * Get <p>分析周期（秒）：每隔多少秒从云端录像中截取一个视频片段进行分析。例如 Interval=3600、Duration=600，表示每隔1小时 取一个 10 分钟的视频片段进行分析。需满足 Duration ≤ Interval，否则相邻片段将重叠。取值范围［5,86400］。</p> 
     * @return Interval <p>分析周期（秒）：每隔多少秒从云端录像中截取一个视频片段进行分析。例如 Interval=3600、Duration=600，表示每隔1小时 取一个 10 分钟的视频片段进行分析。需满足 Duration ≤ Interval，否则相邻片段将重叠。取值范围［5,86400］。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>分析周期（秒）：每隔多少秒从云端录像中截取一个视频片段进行分析。例如 Interval=3600、Duration=600，表示每隔1小时 取一个 10 分钟的视频片段进行分析。需满足 Duration ≤ Interval，否则相邻片段将重叠。取值范围［5,86400］。</p>
     * @param Interval <p>分析周期（秒）：每隔多少秒从云端录像中截取一个视频片段进行分析。例如 Interval=3600、Duration=600，表示每隔1小时 取一个 10 分钟的视频片段进行分析。需满足 Duration ≤ Interval，否则相邻片段将重叠。取值范围［5,86400］。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>分析片段时长（秒）：每次分析截取的视频片段长度，即单次分析覆盖的视频时长。取值范围［5,12800］。</p> 
     * @return Duration <p>分析片段时长（秒）：每次分析截取的视频片段长度，即单次分析覆盖的视频时长。取值范围［5,12800］。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>分析片段时长（秒）：每次分析截取的视频片段长度，即单次分析覆盖的视频时长。取值范围［5,12800］。</p>
     * @param Duration <p>分析片段时长（秒）：每次分析截取的视频片段长度，即单次分析覆盖的视频时长。取值范围［5,12800］。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>抽帧率（FPS）：在片段内每隔1/Fps 秒截取一帧进行分析。取值越大，分析越精细，单次分析的帧数越多。默认值1，取值范围［0.1,1</p> 
     * @return Fps <p>抽帧率（FPS）：在片段内每隔1/Fps 秒截取一帧进行分析。取值越大，分析越精细，单次分析的帧数越多。默认值1，取值范围［0.1,1</p>
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set <p>抽帧率（FPS）：在片段内每隔1/Fps 秒截取一帧进行分析。取值越大，分析越精细，单次分析的帧数越多。默认值1，取值范围［0.1,1</p>
     * @param Fps <p>抽帧率（FPS）：在片段内每隔1/Fps 秒截取一帧进行分析。取值越大，分析越精细，单次分析的帧数越多。默认值1，取值范围［0.1,1</p>
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    public VideoSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSceneInfo(VideoSceneInfo source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Fps != null) {
            this.Fps = new Float(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

