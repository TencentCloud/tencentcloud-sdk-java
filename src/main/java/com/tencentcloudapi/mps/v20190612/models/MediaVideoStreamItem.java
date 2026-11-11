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

public class MediaVideoStreamItem extends AbstractModel {

    /**
    * <p>视频流的码率，单位：bps。</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>视频流的高度，单位：px。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>视频流的宽度，单位：px。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>视频流的编码格式，例如 h264。</p>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>帧率，单位：hz。</p>
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorPrimaries")
    @Expose
    private String ColorPrimaries;

    /**
    * <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorSpace")
    @Expose
    private String ColorSpace;

    /**
    * <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorTransfer")
    @Expose
    private String ColorTransfer;

    /**
    * <p>HDR类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HdrType")
    @Expose
    private String HdrType;

    /**
    * <p>视频Codecs。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * <p>视频时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>帧率分子部分</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FpsNumerator")
    @Expose
    private Long FpsNumerator;

    /**
    * <p>帧率分母部分</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
     * Get <p>视频流的码率，单位：bps。</p> 
     * @return Bitrate <p>视频流的码率，单位：bps。</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>视频流的码率，单位：bps。</p>
     * @param Bitrate <p>视频流的码率，单位：bps。</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>视频流的高度，单位：px。</p> 
     * @return Height <p>视频流的高度，单位：px。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>视频流的高度，单位：px。</p>
     * @param Height <p>视频流的高度，单位：px。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>视频流的宽度，单位：px。</p> 
     * @return Width <p>视频流的宽度，单位：px。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>视频流的宽度，单位：px。</p>
     * @param Width <p>视频流的宽度，单位：px。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>视频流的编码格式，例如 h264。</p> 
     * @return Codec <p>视频流的编码格式，例如 h264。</p>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>视频流的编码格式，例如 h264。</p>
     * @param Codec <p>视频流的编码格式，例如 h264。</p>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>帧率，单位：hz。</p> 
     * @return Fps <p>帧率，单位：hz。</p>
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set <p>帧率，单位：hz。</p>
     * @param Fps <p>帧率，单位：hz。</p>
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorPrimaries <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColorPrimaries() {
        return this.ColorPrimaries;
    }

    /**
     * Set <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorPrimaries <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorPrimaries(String ColorPrimaries) {
        this.ColorPrimaries = ColorPrimaries;
    }

    /**
     * Get <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorSpace <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColorSpace() {
        return this.ColorSpace;
    }

    /**
     * Set <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorSpace <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorSpace(String ColorSpace) {
        this.ColorSpace = ColorSpace;
    }

    /**
     * Get <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorTransfer <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColorTransfer() {
        return this.ColorTransfer;
    }

    /**
     * Set <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorTransfer <p>色彩空间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorTransfer(String ColorTransfer) {
        this.ColorTransfer = ColorTransfer;
    }

    /**
     * Get <p>HDR类型。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HdrType <p>HDR类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHdrType() {
        return this.HdrType;
    }

    /**
     * Set <p>HDR类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HdrType <p>HDR类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHdrType(String HdrType) {
        this.HdrType = HdrType;
    }

    /**
     * Get <p>视频Codecs。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codecs <p>视频Codecs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set <p>视频Codecs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codecs <p>视频Codecs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get <p>视频时长。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>视频时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>视频时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>视频时长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>帧率分子部分</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FpsNumerator <p>帧率分子部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFpsNumerator() {
        return this.FpsNumerator;
    }

    /**
     * Set <p>帧率分子部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FpsNumerator <p>帧率分子部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFpsNumerator(Long FpsNumerator) {
        this.FpsNumerator = FpsNumerator;
    }

    /**
     * Get <p>帧率分母部分</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FpsDenominator <p>帧率分母部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set <p>帧率分母部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FpsDenominator <p>帧率分母部分</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
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
        if (source.ColorPrimaries != null) {
            this.ColorPrimaries = new String(source.ColorPrimaries);
        }
        if (source.ColorSpace != null) {
            this.ColorSpace = new String(source.ColorSpace);
        }
        if (source.ColorTransfer != null) {
            this.ColorTransfer = new String(source.ColorTransfer);
        }
        if (source.HdrType != null) {
            this.HdrType = new String(source.HdrType);
        }
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.FpsNumerator != null) {
            this.FpsNumerator = new Long(source.FpsNumerator);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
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
        this.setParamSimple(map, prefix + "ColorPrimaries", this.ColorPrimaries);
        this.setParamSimple(map, prefix + "ColorSpace", this.ColorSpace);
        this.setParamSimple(map, prefix + "ColorTransfer", this.ColorTransfer);
        this.setParamSimple(map, prefix + "HdrType", this.HdrType);
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FpsNumerator", this.FpsNumerator);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);

    }
}

