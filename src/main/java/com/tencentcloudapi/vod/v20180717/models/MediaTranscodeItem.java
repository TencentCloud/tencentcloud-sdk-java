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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTranscodeItem extends AbstractModel {

    /**
    * <p>转码后的视频文件地址。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33476">转码参数模板</a>。<br><font color="red">注意：取值 0 表示原始文件。</font></p>
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
    * <p>媒体文件总大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和。</li>
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
    * <p>视频的 md5 值。</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>容器类型，例如 m4a，mp4 等。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>视频流信息。</p>
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * <p>音频流信息。</p>
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * <p>版权信息。</p>
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * <p>数字水印模板id。</p>
    */
    @SerializedName("BlindWatermarkDefinition")
    @Expose
    private Long BlindWatermarkDefinition;

    /**
    * <p>转码生成的新FileId，请求开启独立媒资输出时有效。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>转码后的视频文件地址。</p> 
     * @return Url <p>转码后的视频文件地址。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>转码后的视频文件地址。</p>
     * @param Url <p>转码后的视频文件地址。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33476">转码参数模板</a>。<br><font color="red">注意：取值 0 表示原始文件。</font></p> 
     * @return Definition <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33476">转码参数模板</a>。<br><font color="red">注意：取值 0 表示原始文件。</font></p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33476">转码参数模板</a>。<br><font color="red">注意：取值 0 表示原始文件。</font></p>
     * @param Definition <p>转码规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33476">转码参数模板</a>。<br><font color="red">注意：取值 0 表示原始文件。</font></p>
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
     * Get <p>媒体文件总大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和。</li> 
     * @return Size <p>媒体文件总大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和。</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>媒体文件总大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和。</li>
     * @param Size <p>媒体文件总大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和。</li>
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
     * Get <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li> 
     * @return DigitalWatermarkType <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     * @param DigitalWatermarkType <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get <p>版权信息。</p> 
     * @return CopyRightWatermarkText <p>版权信息。</p>
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set <p>版权信息。</p>
     * @param CopyRightWatermarkText <p>版权信息。</p>
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get <p>数字水印模板id。</p> 
     * @return BlindWatermarkDefinition <p>数字水印模板id。</p>
     */
    public Long getBlindWatermarkDefinition() {
        return this.BlindWatermarkDefinition;
    }

    /**
     * Set <p>数字水印模板id。</p>
     * @param BlindWatermarkDefinition <p>数字水印模板id。</p>
     */
    public void setBlindWatermarkDefinition(Long BlindWatermarkDefinition) {
        this.BlindWatermarkDefinition = BlindWatermarkDefinition;
    }

    /**
     * Get <p>转码生成的新FileId，请求开启独立媒资输出时有效。</p> 
     * @return FileId <p>转码生成的新FileId，请求开启独立媒资输出时有效。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>转码生成的新FileId，请求开启独立媒资输出时有效。</p>
     * @param FileId <p>转码生成的新FileId，请求开启独立媒资输出时有效。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

