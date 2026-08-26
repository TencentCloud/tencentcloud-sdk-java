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

public class MediaTranscodeItem extends AbstractModel {

    /**
    * <p>转码后文件的目标存储。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>转码后的视频文件路径。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/862/37042">转码参数模板</a>。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>视频流码率平均值与音频流码率平均值之和， 单位：bps。</p>
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
    * <p>媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>视频时长，单位：秒。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>容器类型，例如 m4a，mp4 等。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>视频的 md5 值。</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>音频流信息。</p>
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * <p>视频流信息。</p>
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * <p>视频转码使用增强项说明，增强项解释</p><li>hdr：HDR配置</li><li>wd_fps：插帧帧率配置</li><li>video_super_resolution：    超分配置</li><li>repair：综合增强配置</li><li>denoise：视频降噪配置</li><li>color_enhance：色彩增强配置</li><li>scratch：去划痕配置</li><li>artifact：去伪影（毛刺）配置</li><li>sharp：细节增强配置</li><li>low_light：低光照增强配置</li><li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallBackExtInfo")
    @Expose
    private String CallBackExtInfo;

    /**
    * <p>MediaTranscodeItem</p>
    */
    @SerializedName("Usage")
    @Expose
    private MediaUsageItem Usage;

    /**
     * Get <p>转码后文件的目标存储。</p> 
     * @return OutputStorage <p>转码后文件的目标存储。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>转码后文件的目标存储。</p>
     * @param OutputStorage <p>转码后文件的目标存储。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>转码后的视频文件路径。</p> 
     * @return Path <p>转码后的视频文件路径。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>转码后的视频文件路径。</p>
     * @param Path <p>转码后的视频文件路径。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/862/37042">转码参数模板</a>。</p> 
     * @return Definition <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/862/37042">转码参数模板</a>。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/862/37042">转码参数模板</a>。</p>
     * @param Definition <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/862/37042">转码参数模板</a>。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>视频流码率平均值与音频流码率平均值之和， 单位：bps。</p> 
     * @return Bitrate <p>视频流码率平均值与音频流码率平均值之和， 单位：bps。</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>视频流码率平均值与音频流码率平均值之和， 单位：bps。</p>
     * @param Bitrate <p>视频流码率平均值与音频流码率平均值之和， 单位：bps。</p>
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
     * Get <p>媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。</p> 
     * @return Size <p>媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。</p>
     * @param Size <p>媒体文件总大小（视频为 HLS 时，大小是 m3u8 和 ts 文件大小的总和），单位：字节。</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>视频时长，单位：秒。</p> 
     * @return Duration <p>视频时长，单位：秒。</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长，单位：秒。</p>
     * @param Duration <p>视频时长，单位：秒。</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>容器类型，例如 m4a，mp4 等。</p> 
     * @return Container <p>容器类型，例如 m4a，mp4 等。</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>容器类型，例如 m4a，mp4 等。</p>
     * @param Container <p>容器类型，例如 m4a，mp4 等。</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>视频的 md5 值。</p> 
     * @return Md5 <p>视频的 md5 值。</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>视频的 md5 值。</p>
     * @param Md5 <p>视频的 md5 值。</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>音频流信息。</p> 
     * @return AudioStreamSet <p>音频流信息。</p>
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set <p>音频流信息。</p>
     * @param AudioStreamSet <p>音频流信息。</p>
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get <p>视频流信息。</p> 
     * @return VideoStreamSet <p>视频流信息。</p>
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set <p>视频流信息。</p>
     * @param VideoStreamSet <p>视频流信息。</p>
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get <p>视频转码使用增强项说明，增强项解释</p><li>hdr：HDR配置</li><li>wd_fps：插帧帧率配置</li><li>video_super_resolution：    超分配置</li><li>repair：综合增强配置</li><li>denoise：视频降噪配置</li><li>color_enhance：色彩增强配置</li><li>scratch：去划痕配置</li><li>artifact：去伪影（毛刺）配置</li><li>sharp：细节增强配置</li><li>low_light：低光照增强配置</li><li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallBackExtInfo <p>视频转码使用增强项说明，增强项解释</p><li>hdr：HDR配置</li><li>wd_fps：插帧帧率配置</li><li>video_super_resolution：    超分配置</li><li>repair：综合增强配置</li><li>denoise：视频降噪配置</li><li>color_enhance：色彩增强配置</li><li>scratch：去划痕配置</li><li>artifact：去伪影（毛刺）配置</li><li>sharp：细节增强配置</li><li>low_light：低光照增强配置</li><li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallBackExtInfo() {
        return this.CallBackExtInfo;
    }

    /**
     * Set <p>视频转码使用增强项说明，增强项解释</p><li>hdr：HDR配置</li><li>wd_fps：插帧帧率配置</li><li>video_super_resolution：    超分配置</li><li>repair：综合增强配置</li><li>denoise：视频降噪配置</li><li>color_enhance：色彩增强配置</li><li>scratch：去划痕配置</li><li>artifact：去伪影（毛刺）配置</li><li>sharp：细节增强配置</li><li>low_light：低光照增强配置</li><li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallBackExtInfo <p>视频转码使用增强项说明，增强项解释</p><li>hdr：HDR配置</li><li>wd_fps：插帧帧率配置</li><li>video_super_resolution：    超分配置</li><li>repair：综合增强配置</li><li>denoise：视频降噪配置</li><li>color_enhance：色彩增强配置</li><li>scratch：去划痕配置</li><li>artifact：去伪影（毛刺）配置</li><li>sharp：细节增强配置</li><li>low_light：低光照增强配置</li><li>face_enhance：人脸增强配置</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallBackExtInfo(String CallBackExtInfo) {
        this.CallBackExtInfo = CallBackExtInfo;
    }

    /**
     * Get <p>MediaTranscodeItem</p> 
     * @return Usage <p>MediaTranscodeItem</p>
     */
    public MediaUsageItem getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>MediaTranscodeItem</p>
     * @param Usage <p>MediaTranscodeItem</p>
     */
    public void setUsage(MediaUsageItem Usage) {
        this.Usage = Usage;
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
        if (source.Usage != null) {
            this.Usage = new MediaUsageItem(source.Usage);
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
        this.setParamObj(map, prefix + "Usage.", this.Usage);

    }
}

