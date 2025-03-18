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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTranscodeItem extends AbstractModel {

    /**
    * 转码后文件的目标存储。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 转码后的视频文件路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/862/37042)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 视频流码率平均值与音频流码率平均值之和， 单位：bps。
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
    * 媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 视频时长，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 容器类型，例如 m4a，mp4 等。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 视频的 md5 值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 音频流信息。
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * 视频流信息。
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * 视频转码使用增强项说明，增强项解释
<li>hdr：HDR配置</li>
<li>wd_fps：插帧帧率配置</li>
<li>video_super_resolution：	超分配置</li>
<li>repair：综合增强配置</li>
<li>denoise：视频降噪配置</li>
<li>color_enhance：色彩增强配置</li>
<li>scratch：去划痕配置</li>
<li>artifact：去伪影（毛刺）配置</li>
<li>sharp：细节增强配置</li>
<li>low_light：低光照增强配置</li>
<li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallBackExtInfo")
    @Expose
    private String CallBackExtInfo;

    /**
     * Get 转码后文件的目标存储。 
     * @return OutputStorage 转码后文件的目标存储。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 转码后文件的目标存储。
     * @param OutputStorage 转码后文件的目标存储。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 转码后的视频文件路径。 
     * @return Path 转码后的视频文件路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 转码后的视频文件路径。
     * @param Path 转码后的视频文件路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/862/37042)。 
     * @return Definition 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/862/37042)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/862/37042)。
     * @param Definition 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/862/37042)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 视频流码率平均值与音频流码率平均值之和， 单位：bps。 
     * @return Bitrate 视频流码率平均值与音频流码率平均值之和， 单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流码率平均值与音频流码率平均值之和， 单位：bps。
     * @param Bitrate 视频流码率平均值与音频流码率平均值之和， 单位：bps。
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
     * Get 媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。 
     * @return Size 媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
     * @param Size 媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 视频时长，单位：秒。 
     * @return Duration 视频时长，单位：秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频时长，单位：秒。
     * @param Duration 视频时长，单位：秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 容器类型，例如 m4a，mp4 等。 
     * @return Container 容器类型，例如 m4a，mp4 等。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 容器类型，例如 m4a，mp4 等。
     * @param Container 容器类型，例如 m4a，mp4 等。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 视频的 md5 值。 
     * @return Md5 视频的 md5 值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 视频的 md5 值。
     * @param Md5 视频的 md5 值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 音频流信息。 
     * @return AudioStreamSet 音频流信息。
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set 音频流信息。
     * @param AudioStreamSet 音频流信息。
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get 视频流信息。 
     * @return VideoStreamSet 视频流信息。
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set 视频流信息。
     * @param VideoStreamSet 视频流信息。
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get 视频转码使用增强项说明，增强项解释
<li>hdr：HDR配置</li>
<li>wd_fps：插帧帧率配置</li>
<li>video_super_resolution：	超分配置</li>
<li>repair：综合增强配置</li>
<li>denoise：视频降噪配置</li>
<li>color_enhance：色彩增强配置</li>
<li>scratch：去划痕配置</li>
<li>artifact：去伪影（毛刺）配置</li>
<li>sharp：细节增强配置</li>
<li>low_light：低光照增强配置</li>
<li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallBackExtInfo 视频转码使用增强项说明，增强项解释
<li>hdr：HDR配置</li>
<li>wd_fps：插帧帧率配置</li>
<li>video_super_resolution：	超分配置</li>
<li>repair：综合增强配置</li>
<li>denoise：视频降噪配置</li>
<li>color_enhance：色彩增强配置</li>
<li>scratch：去划痕配置</li>
<li>artifact：去伪影（毛刺）配置</li>
<li>sharp：细节增强配置</li>
<li>low_light：低光照增强配置</li>
<li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallBackExtInfo() {
        return this.CallBackExtInfo;
    }

    /**
     * Set 视频转码使用增强项说明，增强项解释
<li>hdr：HDR配置</li>
<li>wd_fps：插帧帧率配置</li>
<li>video_super_resolution：	超分配置</li>
<li>repair：综合增强配置</li>
<li>denoise：视频降噪配置</li>
<li>color_enhance：色彩增强配置</li>
<li>scratch：去划痕配置</li>
<li>artifact：去伪影（毛刺）配置</li>
<li>sharp：细节增强配置</li>
<li>low_light：低光照增强配置</li>
<li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallBackExtInfo 视频转码使用增强项说明，增强项解释
<li>hdr：HDR配置</li>
<li>wd_fps：插帧帧率配置</li>
<li>video_super_resolution：	超分配置</li>
<li>repair：综合增强配置</li>
<li>denoise：视频降噪配置</li>
<li>color_enhance：色彩增强配置</li>
<li>scratch：去划痕配置</li>
<li>artifact：去伪影（毛刺）配置</li>
<li>sharp：细节增强配置</li>
<li>low_light：低光照增强配置</li>
<li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallBackExtInfo(String CallBackExtInfo) {
        this.CallBackExtInfo = CallBackExtInfo;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
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
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.CallBackExtInfo != null) {
            this.CallBackExtInfo = new String(source.CallBackExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamSimple(map, prefix + "CallBackExtInfo", this.CallBackExtInfo);

    }
}

