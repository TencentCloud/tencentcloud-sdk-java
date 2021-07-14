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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel{

    /**
    * 任务结束后生成的文件大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 任务结束后生成的文件格式，例如：mp4,flv等等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 任务结束后生成的文件整体码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 任务结束后生成的文件时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 任务结束后生成的文件视频信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoInfoResult")
    @Expose
    private VideoInfoResultItem [] VideoInfoResult;

    /**
    * 任务结束后生成的文件音频信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioInfoResult")
    @Expose
    private AudioInfoResultItem [] AudioInfoResult;

    /**
     * Get 任务结束后生成的文件大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 任务结束后生成的文件大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 任务结束后生成的文件大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 任务结束后生成的文件大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 任务结束后生成的文件格式，例如：mp4,flv等等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 任务结束后生成的文件格式，例如：mp4,flv等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 任务结束后生成的文件格式，例如：mp4,flv等等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 任务结束后生成的文件格式，例如：mp4,flv等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 任务结束后生成的文件整体码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 任务结束后生成的文件整体码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 任务结束后生成的文件整体码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 任务结束后生成的文件整体码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 任务结束后生成的文件时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 任务结束后生成的文件时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 任务结束后生成的文件时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 任务结束后生成的文件时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 任务结束后生成的文件视频信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoInfoResult 任务结束后生成的文件视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoInfoResultItem [] getVideoInfoResult() {
        return this.VideoInfoResult;
    }

    /**
     * Set 任务结束后生成的文件视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoInfoResult 任务结束后生成的文件视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoInfoResult(VideoInfoResultItem [] VideoInfoResult) {
        this.VideoInfoResult = VideoInfoResult;
    }

    /**
     * Get 任务结束后生成的文件音频信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioInfoResult 任务结束后生成的文件音频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioInfoResultItem [] getAudioInfoResult() {
        return this.AudioInfoResult;
    }

    /**
     * Set 任务结束后生成的文件音频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioInfoResult 任务结束后生成的文件音频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioInfoResult(AudioInfoResultItem [] AudioInfoResult) {
        this.AudioInfoResult = AudioInfoResult;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.VideoInfoResult != null) {
            this.VideoInfoResult = new VideoInfoResultItem[source.VideoInfoResult.length];
            for (int i = 0; i < source.VideoInfoResult.length; i++) {
                this.VideoInfoResult[i] = new VideoInfoResultItem(source.VideoInfoResult[i]);
            }
        }
        if (source.AudioInfoResult != null) {
            this.AudioInfoResult = new AudioInfoResultItem[source.AudioInfoResult.length];
            for (int i = 0; i < source.AudioInfoResult.length; i++) {
                this.AudioInfoResult[i] = new AudioInfoResultItem(source.AudioInfoResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "VideoInfoResult.", this.VideoInfoResult);
        this.setParamArrayObj(map, prefix + "AudioInfoResult.", this.AudioInfoResult);

    }
}

