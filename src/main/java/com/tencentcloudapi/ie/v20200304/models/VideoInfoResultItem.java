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

public class VideoInfoResultItem extends AbstractModel{

    /**
    * 视频流的流id。
    */
    @SerializedName("Stream")
    @Expose
    private Long Stream;

    /**
    * 视频宽度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频高度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频帧率，用分数格式表示，如：25/1, 99/32等等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private String Fps;

    /**
    * 编码格式，如h264,h265等等 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 播放旋转角度，可选值0-360。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * 视频时长，单位：ms 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 颜色空间，如yuv420p，yuv444p等等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PixFormat")
    @Expose
    private String PixFormat;

    /**
     * Get 视频流的流id。 
     * @return Stream 视频流的流id。
     */
    public Long getStream() {
        return this.Stream;
    }

    /**
     * Set 视频流的流id。
     * @param Stream 视频流的流id。
     */
    public void setStream(Long Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 视频宽度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 视频宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频宽度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频高度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 视频高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频高度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 视频码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 视频码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频帧率，用分数格式表示，如：25/1, 99/32等等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 视频帧率，用分数格式表示，如：25/1, 99/32等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，用分数格式表示，如：25/1, 99/32等等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 视频帧率，用分数格式表示，如：25/1, 99/32等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(String Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 编码格式，如h264,h265等等 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codec 编码格式，如h264,h265等等 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 编码格式，如h264,h265等等 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 编码格式，如h264,h265等等 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 播放旋转角度，可选值0-360。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rotate 播放旋转角度，可选值0-360。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set 播放旋转角度，可选值0-360。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rotate 播放旋转角度，可选值0-360。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get 视频时长，单位：ms 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 视频时长，单位：ms 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频时长，单位：ms 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 视频时长，单位：ms 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 颜色空间，如yuv420p，yuv444p等等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PixFormat 颜色空间，如yuv420p，yuv444p等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPixFormat() {
        return this.PixFormat;
    }

    /**
     * Set 颜色空间，如yuv420p，yuv444p等等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PixFormat 颜色空间，如yuv420p，yuv444p等等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPixFormat(String PixFormat) {
        this.PixFormat = PixFormat;
    }

    public VideoInfoResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoInfoResultItem(VideoInfoResultItem source) {
        if (source.Stream != null) {
            this.Stream = new Long(source.Stream);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Fps != null) {
            this.Fps = new String(source.Fps);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.PixFormat != null) {
            this.PixFormat = new String(source.PixFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "PixFormat", this.PixFormat);

    }
}

