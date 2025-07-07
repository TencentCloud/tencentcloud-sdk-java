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

public class MediaVideoStreamItem extends AbstractModel {

    /**
    * 视频流的码率，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频流的高度，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频流的宽度，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流的编码格式，例如 h264。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 帧率，单位：hz。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 编码标签，仅当 Codec 为 hevc 时有效。
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * 画面动态范围信息。
<li><font color=red>注意</font>：在 2023-01-10T00:00:00Z 后处理的转码文件，此字段有效。</li>
    */
    @SerializedName("DynamicRangeInfo")
    @Expose
    private DynamicRangeInfo DynamicRangeInfo;

    /**
     * Get 视频流的码率，单位：bps。 
     * @return Bitrate 视频流的码率，单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，单位：bps。
     * @param Bitrate 视频流的码率，单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频流的高度，单位：px。 
     * @return Height 视频流的高度，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流的高度，单位：px。
     * @param Height 视频流的高度，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频流的宽度，单位：px。 
     * @return Width 视频流的宽度，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流的宽度，单位：px。
     * @param Width 视频流的宽度，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频流的编码格式，例如 h264。 
     * @return Codec 视频流的编码格式，例如 h264。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码格式，例如 h264。
     * @param Codec 视频流的编码格式，例如 h264。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 帧率，单位：hz。 
     * @return Fps 帧率，单位：hz。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，单位：hz。
     * @param Fps 帧率，单位：hz。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 编码标签，仅当 Codec 为 hevc 时有效。 
     * @return CodecTag 编码标签，仅当 Codec 为 hevc 时有效。
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set 编码标签，仅当 Codec 为 hevc 时有效。
     * @param CodecTag 编码标签，仅当 Codec 为 hevc 时有效。
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get 画面动态范围信息。
<li><font color=red>注意</font>：在 2023-01-10T00:00:00Z 后处理的转码文件，此字段有效。</li> 
     * @return DynamicRangeInfo 画面动态范围信息。
<li><font color=red>注意</font>：在 2023-01-10T00:00:00Z 后处理的转码文件，此字段有效。</li>
     */
    public DynamicRangeInfo getDynamicRangeInfo() {
        return this.DynamicRangeInfo;
    }

    /**
     * Set 画面动态范围信息。
<li><font color=red>注意</font>：在 2023-01-10T00:00:00Z 后处理的转码文件，此字段有效。</li>
     * @param DynamicRangeInfo 画面动态范围信息。
<li><font color=red>注意</font>：在 2023-01-10T00:00:00Z 后处理的转码文件，此字段有效。</li>
     */
    public void setDynamicRangeInfo(DynamicRangeInfo DynamicRangeInfo) {
        this.DynamicRangeInfo = DynamicRangeInfo;
    }

    public MediaVideoStreamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaVideoStreamItem(MediaVideoStreamItem source) {
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
        }
        if (source.DynamicRangeInfo != null) {
            this.DynamicRangeInfo = new DynamicRangeInfo(source.DynamicRangeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);
        this.setParamObj(map, prefix + "DynamicRangeInfo.", this.DynamicRangeInfo);

    }
}

