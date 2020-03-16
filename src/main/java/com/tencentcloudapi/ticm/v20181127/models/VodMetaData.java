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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodMetaData extends AbstractModel{

    /**
    * 上传的媒体文件大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 容器类型，例如 m4a，mp4 等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 视频流码率平均值与音频流码率平均值之和，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频流高度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频流宽度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频拍摄时的选择角度，单位：度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * 视频流信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private VodVideoStreamItem [] VideoStreamSet;

    /**
    * 音频流信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private VodAudioStreamItem [] AudioStreamSet;

    /**
    * 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoDuration")
    @Expose
    private Float VideoDuration;

    /**
    * 音频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
     * Get 上传的媒体文件大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 上传的媒体文件大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 上传的媒体文件大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 上传的媒体文件大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 容器类型，例如 m4a，mp4 等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Container 容器类型，例如 m4a，mp4 等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 容器类型，例如 m4a，mp4 等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Container 容器类型，例如 m4a，mp4 等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 视频流码率平均值与音频流码率平均值之和，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 视频流码率平均值与音频流码率平均值之和，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流码率平均值与音频流码率平均值之和，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 视频流码率平均值与音频流码率平均值之和，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频流高度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 视频流高度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频流高度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频流宽度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 视频流宽度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频流宽度的最大值，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频拍摄时的选择角度，单位：度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rotate 视频拍摄时的选择角度，单位：度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set 视频拍摄时的选择角度，单位：度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rotate 视频拍摄时的选择角度，单位：度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get 视频流信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoStreamSet 视频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set 视频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoStreamSet 视频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoStreamSet(VodVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get 音频流信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioStreamSet 音频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set 音频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioStreamSet 音频流信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioStreamSet(VodAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoDuration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoDuration 视频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoDuration(Float VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get 音频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioDuration 音频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set 音频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioDuration 音频时长，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
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
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "AudioDuration", this.AudioDuration);

    }
}

