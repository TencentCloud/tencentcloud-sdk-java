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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMetaData extends AbstractModel {

    /**
    * <p>大小。</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>容器类型。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>视频流码率平均值与音频流码率平均值之和，单位：bps。</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>视频流高度的最大值，单位：px。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>视频流宽度的最大值，单位：px。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>时长，单位：秒。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>视频拍摄时的选择角度，单位：度</p>
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * <p>视频流信息。</p>
    */
    @SerializedName("VideoStreamInfoSet")
    @Expose
    private VideoStreamInfo [] VideoStreamInfoSet;

    /**
    * <p>音频流信息。</p>
    */
    @SerializedName("AudioStreamInfoSet")
    @Expose
    private AudioStreamInfo [] AudioStreamInfoSet;

    /**
     * Get <p>大小。</p> 
     * @return Size <p>大小。</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>大小。</p>
     * @param Size <p>大小。</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>容器类型。</p> 
     * @return Container <p>容器类型。</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>容器类型。</p>
     * @param Container <p>容器类型。</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>视频流码率平均值与音频流码率平均值之和，单位：bps。</p> 
     * @return Bitrate <p>视频流码率平均值与音频流码率平均值之和，单位：bps。</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>视频流码率平均值与音频流码率平均值之和，单位：bps。</p>
     * @param Bitrate <p>视频流码率平均值与音频流码率平均值之和，单位：bps。</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>视频流高度的最大值，单位：px。</p> 
     * @return Height <p>视频流高度的最大值，单位：px。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>视频流高度的最大值，单位：px。</p>
     * @param Height <p>视频流高度的最大值，单位：px。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>视频流宽度的最大值，单位：px。</p> 
     * @return Width <p>视频流宽度的最大值，单位：px。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>视频流宽度的最大值，单位：px。</p>
     * @param Width <p>视频流宽度的最大值，单位：px。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>时长，单位：秒。</p> 
     * @return Duration <p>时长，单位：秒。</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>时长，单位：秒。</p>
     * @param Duration <p>时长，单位：秒。</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>视频拍摄时的选择角度，单位：度</p> 
     * @return Rotate <p>视频拍摄时的选择角度，单位：度</p>
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set <p>视频拍摄时的选择角度，单位：度</p>
     * @param Rotate <p>视频拍摄时的选择角度，单位：度</p>
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get <p>视频流信息。</p> 
     * @return VideoStreamInfoSet <p>视频流信息。</p>
     */
    public VideoStreamInfo [] getVideoStreamInfoSet() {
        return this.VideoStreamInfoSet;
    }

    /**
     * Set <p>视频流信息。</p>
     * @param VideoStreamInfoSet <p>视频流信息。</p>
     */
    public void setVideoStreamInfoSet(VideoStreamInfo [] VideoStreamInfoSet) {
        this.VideoStreamInfoSet = VideoStreamInfoSet;
    }

    /**
     * Get <p>音频流信息。</p> 
     * @return AudioStreamInfoSet <p>音频流信息。</p>
     */
    public AudioStreamInfo [] getAudioStreamInfoSet() {
        return this.AudioStreamInfoSet;
    }

    /**
     * Set <p>音频流信息。</p>
     * @param AudioStreamInfoSet <p>音频流信息。</p>
     */
    public void setAudioStreamInfoSet(AudioStreamInfo [] AudioStreamInfoSet) {
        this.AudioStreamInfoSet = AudioStreamInfoSet;
    }

    public MediaMetaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMetaData(MediaMetaData source) {
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
        }
        if (source.VideoStreamInfoSet != null) {
            this.VideoStreamInfoSet = new VideoStreamInfo[source.VideoStreamInfoSet.length];
            for (int i = 0; i < source.VideoStreamInfoSet.length; i++) {
                this.VideoStreamInfoSet[i] = new VideoStreamInfo(source.VideoStreamInfoSet[i]);
            }
        }
        if (source.AudioStreamInfoSet != null) {
            this.AudioStreamInfoSet = new AudioStreamInfo[source.AudioStreamInfoSet.length];
            for (int i = 0; i < source.AudioStreamInfoSet.length; i++) {
                this.AudioStreamInfoSet[i] = new AudioStreamInfo(source.AudioStreamInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamArrayObj(map, prefix + "VideoStreamInfoSet.", this.VideoStreamInfoSet);
        this.setParamArrayObj(map, prefix + "AudioStreamInfoSet.", this.AudioStreamInfoSet);

    }
}

