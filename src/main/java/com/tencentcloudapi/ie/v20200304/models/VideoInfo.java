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

public class VideoInfo extends AbstractModel{

    /**
    * 视频帧率，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 宽度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 长边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
    */
    @SerializedName("LongSide")
    @Expose
    private Long LongSide;

    /**
    * 短边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
    */
    @SerializedName("ShortSide")
    @Expose
    private Long ShortSide;

    /**
    * 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。当取值为 0，表示视频码率和原始视频保持一致。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 固定I帧之间，视频帧数量，取值范围： [25, 2500]，如果不填，使用编码默认最优序列。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 编码器支持选项，可选值：
h264,
h265,
av1。
不填默认h264。
    */
    @SerializedName("VideoCodec")
    @Expose
    private String VideoCodec;

    /**
    * 图片水印。
    */
    @SerializedName("PicMarkInfo")
    @Expose
    private PicMarkInfoItem [] PicMarkInfo;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。
    */
    @SerializedName("DarInfo")
    @Expose
    private DarInfo DarInfo;

    /**
    * 支持hdr,可选项：
hdr10,
hlg。
此时，VideoCodec会强制设置为h265, 编码位深为10
    */
    @SerializedName("Hdr")
    @Expose
    private String Hdr;

    /**
    * 画质增强参数信息。
    */
    @SerializedName("VideoEnhance")
    @Expose
    private VideoEnhance VideoEnhance;

    /**
    * 数字水印参数信息。
    */
    @SerializedName("HiddenMarkInfo")
    @Expose
    private HiddenMarkInfo HiddenMarkInfo;

    /**
    * 文本水印参数信息。
    */
    @SerializedName("TextMarkInfo")
    @Expose
    private TextMarkInfoItem [] TextMarkInfo;

    /**
     * Get 视频帧率，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。 
     * @return Fps 视频帧率，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     * @param Fps 视频帧率，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 宽度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。 
     * @return Width 宽度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     * @param Width 宽度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。 
     * @return Height 高度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     * @param Height 高度，取值范围：0 和 [128, 4096]
注意：
当 Width、Height 均为 0，则分辨率同源；
当 Width 为 0，Height 非 0，则 Width 按比例缩放；
当 Width 非 0，Height 为 0，则 Height 按比例缩放；
当 Width、Height 均非 0，则分辨率按用户指定。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 长边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。 
     * @return LongSide 长边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     */
    public Long getLongSide() {
        return this.LongSide;
    }

    /**
     * Set 长边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     * @param LongSide 长边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     */
    public void setLongSide(Long LongSide) {
        this.LongSide = LongSide;
    }

    /**
     * Get 短边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。 
     * @return ShortSide 短边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     */
    public Long getShortSide() {
        return this.ShortSide;
    }

    /**
     * Set 短边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     * @param ShortSide 短边分辨率，取值范围：0 和 [128, 4096]
注意：
当 LongSide、ShortSide 均为 0，则分辨率按照Width，Height；
当 LongSide 为 0，ShortSide 非 0，则 LongSide 按比例缩放；
当 LongSide非 0，ShortSide为 0，则 ShortSide 按比例缩放；
当 LongSide、ShortSide 均非 0，则分辨率按用户指定。
长短边优先级高于Weight,Height,设置长短边则忽略宽高。
     */
    public void setShortSide(Long ShortSide) {
        this.ShortSide = ShortSide;
    }

    /**
     * Get 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。当取值为 0，表示视频码率和原始视频保持一致。 
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。当取值为 0，表示视频码率和原始视频保持一致。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。当取值为 0，表示视频码率和原始视频保持一致。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。当取值为 0，表示视频码率和原始视频保持一致。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 固定I帧之间，视频帧数量，取值范围： [25, 2500]，如果不填，使用编码默认最优序列。 
     * @return Gop 固定I帧之间，视频帧数量，取值范围： [25, 2500]，如果不填，使用编码默认最优序列。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 固定I帧之间，视频帧数量，取值范围： [25, 2500]，如果不填，使用编码默认最优序列。
     * @param Gop 固定I帧之间，视频帧数量，取值范围： [25, 2500]，如果不填，使用编码默认最优序列。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 编码器支持选项，可选值：
h264,
h265,
av1。
不填默认h264。 
     * @return VideoCodec 编码器支持选项，可选值：
h264,
h265,
av1。
不填默认h264。
     */
    public String getVideoCodec() {
        return this.VideoCodec;
    }

    /**
     * Set 编码器支持选项，可选值：
h264,
h265,
av1。
不填默认h264。
     * @param VideoCodec 编码器支持选项，可选值：
h264,
h265,
av1。
不填默认h264。
     */
    public void setVideoCodec(String VideoCodec) {
        this.VideoCodec = VideoCodec;
    }

    /**
     * Get 图片水印。 
     * @return PicMarkInfo 图片水印。
     */
    public PicMarkInfoItem [] getPicMarkInfo() {
        return this.PicMarkInfo;
    }

    /**
     * Set 图片水印。
     * @param PicMarkInfo 图片水印。
     */
    public void setPicMarkInfo(PicMarkInfoItem [] PicMarkInfo) {
        this.PicMarkInfo = PicMarkInfo;
    }

    /**
     * Get 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。 
     * @return DarInfo 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。
     */
    public DarInfo getDarInfo() {
        return this.DarInfo;
    }

    /**
     * Set 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。
     * @param DarInfo 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。
     */
    public void setDarInfo(DarInfo DarInfo) {
        this.DarInfo = DarInfo;
    }

    /**
     * Get 支持hdr,可选项：
hdr10,
hlg。
此时，VideoCodec会强制设置为h265, 编码位深为10 
     * @return Hdr 支持hdr,可选项：
hdr10,
hlg。
此时，VideoCodec会强制设置为h265, 编码位深为10
     */
    public String getHdr() {
        return this.Hdr;
    }

    /**
     * Set 支持hdr,可选项：
hdr10,
hlg。
此时，VideoCodec会强制设置为h265, 编码位深为10
     * @param Hdr 支持hdr,可选项：
hdr10,
hlg。
此时，VideoCodec会强制设置为h265, 编码位深为10
     */
    public void setHdr(String Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get 画质增强参数信息。 
     * @return VideoEnhance 画质增强参数信息。
     */
    public VideoEnhance getVideoEnhance() {
        return this.VideoEnhance;
    }

    /**
     * Set 画质增强参数信息。
     * @param VideoEnhance 画质增强参数信息。
     */
    public void setVideoEnhance(VideoEnhance VideoEnhance) {
        this.VideoEnhance = VideoEnhance;
    }

    /**
     * Get 数字水印参数信息。 
     * @return HiddenMarkInfo 数字水印参数信息。
     */
    public HiddenMarkInfo getHiddenMarkInfo() {
        return this.HiddenMarkInfo;
    }

    /**
     * Set 数字水印参数信息。
     * @param HiddenMarkInfo 数字水印参数信息。
     */
    public void setHiddenMarkInfo(HiddenMarkInfo HiddenMarkInfo) {
        this.HiddenMarkInfo = HiddenMarkInfo;
    }

    /**
     * Get 文本水印参数信息。 
     * @return TextMarkInfo 文本水印参数信息。
     */
    public TextMarkInfoItem [] getTextMarkInfo() {
        return this.TextMarkInfo;
    }

    /**
     * Set 文本水印参数信息。
     * @param TextMarkInfo 文本水印参数信息。
     */
    public void setTextMarkInfo(TextMarkInfoItem [] TextMarkInfo) {
        this.TextMarkInfo = TextMarkInfo;
    }

    public VideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoInfo(VideoInfo source) {
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.LongSide != null) {
            this.LongSide = new Long(source.LongSide);
        }
        if (source.ShortSide != null) {
            this.ShortSide = new Long(source.ShortSide);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.VideoCodec != null) {
            this.VideoCodec = new String(source.VideoCodec);
        }
        if (source.PicMarkInfo != null) {
            this.PicMarkInfo = new PicMarkInfoItem[source.PicMarkInfo.length];
            for (int i = 0; i < source.PicMarkInfo.length; i++) {
                this.PicMarkInfo[i] = new PicMarkInfoItem(source.PicMarkInfo[i]);
            }
        }
        if (source.DarInfo != null) {
            this.DarInfo = new DarInfo(source.DarInfo);
        }
        if (source.Hdr != null) {
            this.Hdr = new String(source.Hdr);
        }
        if (source.VideoEnhance != null) {
            this.VideoEnhance = new VideoEnhance(source.VideoEnhance);
        }
        if (source.HiddenMarkInfo != null) {
            this.HiddenMarkInfo = new HiddenMarkInfo(source.HiddenMarkInfo);
        }
        if (source.TextMarkInfo != null) {
            this.TextMarkInfo = new TextMarkInfoItem[source.TextMarkInfo.length];
            for (int i = 0; i < source.TextMarkInfo.length; i++) {
                this.TextMarkInfo[i] = new TextMarkInfoItem(source.TextMarkInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "LongSide", this.LongSide);
        this.setParamSimple(map, prefix + "ShortSide", this.ShortSide);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "VideoCodec", this.VideoCodec);
        this.setParamArrayObj(map, prefix + "PicMarkInfo.", this.PicMarkInfo);
        this.setParamObj(map, prefix + "DarInfo.", this.DarInfo);
        this.setParamSimple(map, prefix + "Hdr", this.Hdr);
        this.setParamObj(map, prefix + "VideoEnhance.", this.VideoEnhance);
        this.setParamObj(map, prefix + "HiddenMarkInfo.", this.HiddenMarkInfo);
        this.setParamArrayObj(map, prefix + "TextMarkInfo.", this.TextMarkInfo);

    }
}

