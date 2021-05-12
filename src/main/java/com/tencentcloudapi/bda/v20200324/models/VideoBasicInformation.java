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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoBasicInformation extends AbstractModel{

    /**
    * 视频宽度
    */
    @SerializedName("FrameWidth")
    @Expose
    private Long FrameWidth;

    /**
    * 视频高度
    */
    @SerializedName("FrameHeight")
    @Expose
    private Long FrameHeight;

    /**
    * 视频帧速率(FPS)
    */
    @SerializedName("FramesPerSecond")
    @Expose
    private Long FramesPerSecond;

    /**
    * 视频时长
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频帧数
    */
    @SerializedName("TotalFrames")
    @Expose
    private Long TotalFrames;

    /**
     * Get 视频宽度 
     * @return FrameWidth 视频宽度
     */
    public Long getFrameWidth() {
        return this.FrameWidth;
    }

    /**
     * Set 视频宽度
     * @param FrameWidth 视频宽度
     */
    public void setFrameWidth(Long FrameWidth) {
        this.FrameWidth = FrameWidth;
    }

    /**
     * Get 视频高度 
     * @return FrameHeight 视频高度
     */
    public Long getFrameHeight() {
        return this.FrameHeight;
    }

    /**
     * Set 视频高度
     * @param FrameHeight 视频高度
     */
    public void setFrameHeight(Long FrameHeight) {
        this.FrameHeight = FrameHeight;
    }

    /**
     * Get 视频帧速率(FPS) 
     * @return FramesPerSecond 视频帧速率(FPS)
     */
    public Long getFramesPerSecond() {
        return this.FramesPerSecond;
    }

    /**
     * Set 视频帧速率(FPS)
     * @param FramesPerSecond 视频帧速率(FPS)
     */
    public void setFramesPerSecond(Long FramesPerSecond) {
        this.FramesPerSecond = FramesPerSecond;
    }

    /**
     * Get 视频时长 
     * @return Duration 视频时长
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频时长
     * @param Duration 视频时长
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频帧数 
     * @return TotalFrames 视频帧数
     */
    public Long getTotalFrames() {
        return this.TotalFrames;
    }

    /**
     * Set 视频帧数
     * @param TotalFrames 视频帧数
     */
    public void setTotalFrames(Long TotalFrames) {
        this.TotalFrames = TotalFrames;
    }

    public VideoBasicInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoBasicInformation(VideoBasicInformation source) {
        if (source.FrameWidth != null) {
            this.FrameWidth = new Long(source.FrameWidth);
        }
        if (source.FrameHeight != null) {
            this.FrameHeight = new Long(source.FrameHeight);
        }
        if (source.FramesPerSecond != null) {
            this.FramesPerSecond = new Long(source.FramesPerSecond);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.TotalFrames != null) {
            this.TotalFrames = new Long(source.TotalFrames);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FrameWidth", this.FrameWidth);
        this.setParamSimple(map, prefix + "FrameHeight", this.FrameHeight);
        this.setParamSimple(map, prefix + "FramesPerSecond", this.FramesPerSecond);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TotalFrames", this.TotalFrames);

    }
}

