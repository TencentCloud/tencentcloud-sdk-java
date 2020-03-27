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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMetaData extends AbstractModel{

    /**
    * 大小。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 容器类型。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 视频流码率平均值与音频流码率平均值之和，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频流高度的最大值，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频流宽度的最大值，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频拍摄时的选择角度，单位：度
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * 视频流信息。
    */
    @SerializedName("VideoStreamInfoSet")
    @Expose
    private VideoStreamInfo [] VideoStreamInfoSet;

    /**
    * 音频流信息。
    */
    @SerializedName("AudioStreamInfoSet")
    @Expose
    private AudioStreamInfo [] AudioStreamInfoSet;

    /**
     * Get 大小。 
     * @return Size 大小。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 大小。
     * @param Size 大小。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 容器类型。 
     * @return Container 容器类型。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 容器类型。
     * @param Container 容器类型。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 视频流码率平均值与音频流码率平均值之和，单位：bps。 
     * @return Bitrate 视频流码率平均值与音频流码率平均值之和，单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流码率平均值与音频流码率平均值之和，单位：bps。
     * @param Bitrate 视频流码率平均值与音频流码率平均值之和，单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频流高度的最大值，单位：px。 
     * @return Height 视频流高度的最大值，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度的最大值，单位：px。
     * @param Height 视频流高度的最大值，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频流宽度的最大值，单位：px。 
     * @return Width 视频流宽度的最大值，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度的最大值，单位：px。
     * @param Width 视频流宽度的最大值，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 时长，单位：秒。 
     * @return Duration 时长，单位：秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 时长，单位：秒。
     * @param Duration 时长，单位：秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频拍摄时的选择角度，单位：度 
     * @return Rotate 视频拍摄时的选择角度，单位：度
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set 视频拍摄时的选择角度，单位：度
     * @param Rotate 视频拍摄时的选择角度，单位：度
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get 视频流信息。 
     * @return VideoStreamInfoSet 视频流信息。
     */
    public VideoStreamInfo [] getVideoStreamInfoSet() {
        return this.VideoStreamInfoSet;
    }

    /**
     * Set 视频流信息。
     * @param VideoStreamInfoSet 视频流信息。
     */
    public void setVideoStreamInfoSet(VideoStreamInfo [] VideoStreamInfoSet) {
        this.VideoStreamInfoSet = VideoStreamInfoSet;
    }

    /**
     * Get 音频流信息。 
     * @return AudioStreamInfoSet 音频流信息。
     */
    public AudioStreamInfo [] getAudioStreamInfoSet() {
        return this.AudioStreamInfoSet;
    }

    /**
     * Set 音频流信息。
     * @param AudioStreamInfoSet 音频流信息。
     */
    public void setAudioStreamInfoSet(AudioStreamInfo [] AudioStreamInfoSet) {
        this.AudioStreamInfoSet = AudioStreamInfoSet;
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

