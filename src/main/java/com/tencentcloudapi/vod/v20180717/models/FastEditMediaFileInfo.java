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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FastEditMediaFileInfo extends AbstractModel {

    /**
    * 媒体的 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 操作的音视频类型，可选值有：
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
注意：操作的音视频，必须为 HLS 格式。
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * 当 AudioVideoType 为 Transcode 时有效，表示操作媒体的的转码模板 ID。
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * 媒体剪辑起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 媒体剪辑结束的时间偏移，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 媒体的 ID。 
     * @return FileId 媒体的 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体的 ID。
     * @param FileId 媒体的 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 操作的音视频类型，可选值有：
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
注意：操作的音视频，必须为 HLS 格式。 
     * @return AudioVideoType 操作的音视频类型，可选值有：
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
注意：操作的音视频，必须为 HLS 格式。
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set 操作的音视频类型，可选值有：
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
注意：操作的音视频，必须为 HLS 格式。
     * @param AudioVideoType 操作的音视频类型，可选值有：
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
注意：操作的音视频，必须为 HLS 格式。
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get 当 AudioVideoType 为 Transcode 时有效，表示操作媒体的的转码模板 ID。 
     * @return TranscodeDefinition 当 AudioVideoType 为 Transcode 时有效，表示操作媒体的的转码模板 ID。
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set 当 AudioVideoType 为 Transcode 时有效，表示操作媒体的的转码模板 ID。
     * @param TranscodeDefinition 当 AudioVideoType 为 Transcode 时有效，表示操作媒体的的转码模板 ID。
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get 媒体剪辑起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 媒体剪辑起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 媒体剪辑起始的偏移时间，单位：秒。
     * @param StartTimeOffset 媒体剪辑起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 媒体剪辑结束的时间偏移，单位：秒。 
     * @return EndTimeOffset 媒体剪辑结束的时间偏移，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 媒体剪辑结束的时间偏移，单位：秒。
     * @param EndTimeOffset 媒体剪辑结束的时间偏移，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public FastEditMediaFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FastEditMediaFileInfo(FastEditMediaFileInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.TranscodeDefinition != null) {
            this.TranscodeDefinition = new Long(source.TranscodeDefinition);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

