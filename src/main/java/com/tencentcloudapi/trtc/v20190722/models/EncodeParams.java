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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncodeParams extends AbstractModel{

    /**
    * 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位是Hz。
    */
    @SerializedName("AudioSampleRate")
    @Expose
    private Long AudioSampleRate;

    /**
    * 混流-输出流音频码率。取值范围[8,500]，单位为kbps。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * 混流-输出流音频声道数，取值范围[1,2]，1表示混流输出音频为单声道，2表示混流输出音频为双声道。
    */
    @SerializedName("AudioChannels")
    @Expose
    private Long AudioChannels;

    /**
    * 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
    */
    @SerializedName("VideoWidth")
    @Expose
    private Long VideoWidth;

    /**
    * 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
    */
    @SerializedName("VideoHeight")
    @Expose
    private Long VideoHeight;

    /**
    * 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 混流-输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
    */
    @SerializedName("VideoFramerate")
    @Expose
    private Long VideoFramerate;

    /**
    * 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
    */
    @SerializedName("VideoGop")
    @Expose
    private Long VideoGop;

    /**
    * 混流-输出流背景色，取值是十进制整数。常用的颜色有：
红色：0xff0000，对应的十进制整数是16724736。
黄色：0xffff00。对应的十进制整数是16776960。
绿色：0x33cc00。对应的十进制整数是3394560。
蓝色：0x0066ff。对应的十进制整数是26367。
黑色：0x000000。对应的十进制整数是0。
白色：0xFFFFFF。对应的十进制整数是16777215。
灰色：0x999999。对应的十进制整数是10066329。
    */
    @SerializedName("BackgroundColor")
    @Expose
    private Long BackgroundColor;

    /**
    * 混流-输出流背景图片，取值为实时音视频控制台上传的图片ID。
    */
    @SerializedName("BackgroundImageId")
    @Expose
    private Long BackgroundImageId;

    /**
    * 混流-输出流音频编码类型，取值范围[0,1, 2]，0为LC-AAC，1为HE-AAC，2为HE-AACv2。默认值为0。当音频编码设置为HE-AACv2时，只支持输出流音频声道数为双声道。HE-AAC和HE-AACv2支持的输出流音频采样率范围为[48000, 44100, 32000, 24000, 16000]
    */
    @SerializedName("AudioCodec")
    @Expose
    private Long AudioCodec;

    /**
    * 混流-输出流背景图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。BackgroundImageUrl和BackgroundImageId参数都填时，以BackgroundImageUrl为准。图片大小限制不超过2MB。
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
     * Get 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位是Hz。 
     * @return AudioSampleRate 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位是Hz。
     */
    public Long getAudioSampleRate() {
        return this.AudioSampleRate;
    }

    /**
     * Set 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位是Hz。
     * @param AudioSampleRate 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位是Hz。
     */
    public void setAudioSampleRate(Long AudioSampleRate) {
        this.AudioSampleRate = AudioSampleRate;
    }

    /**
     * Get 混流-输出流音频码率。取值范围[8,500]，单位为kbps。 
     * @return AudioBitrate 混流-输出流音频码率。取值范围[8,500]，单位为kbps。
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set 混流-输出流音频码率。取值范围[8,500]，单位为kbps。
     * @param AudioBitrate 混流-输出流音频码率。取值范围[8,500]，单位为kbps。
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get 混流-输出流音频声道数，取值范围[1,2]，1表示混流输出音频为单声道，2表示混流输出音频为双声道。 
     * @return AudioChannels 混流-输出流音频声道数，取值范围[1,2]，1表示混流输出音频为单声道，2表示混流输出音频为双声道。
     */
    public Long getAudioChannels() {
        return this.AudioChannels;
    }

    /**
     * Set 混流-输出流音频声道数，取值范围[1,2]，1表示混流输出音频为单声道，2表示混流输出音频为双声道。
     * @param AudioChannels 混流-输出流音频声道数，取值范围[1,2]，1表示混流输出音频为单声道，2表示混流输出音频为双声道。
     */
    public void setAudioChannels(Long AudioChannels) {
        this.AudioChannels = AudioChannels;
    }

    /**
     * Get 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。 
     * @return VideoWidth 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public Long getVideoWidth() {
        return this.VideoWidth;
    }

    /**
     * Set 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     * @param VideoWidth 混流-输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public void setVideoWidth(Long VideoWidth) {
        this.VideoWidth = VideoWidth;
    }

    /**
     * Get 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。 
     * @return VideoHeight 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public Long getVideoHeight() {
        return this.VideoHeight;
    }

    /**
     * Set 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     * @param VideoHeight 混流-输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public void setVideoHeight(Long VideoHeight) {
        this.VideoHeight = VideoHeight;
    }

    /**
     * Get 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。 
     * @return VideoBitrate 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     * @param VideoBitrate 混流-输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 混流-输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。 
     * @return VideoFramerate 混流-输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     */
    public Long getVideoFramerate() {
        return this.VideoFramerate;
    }

    /**
     * Set 混流-输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     * @param VideoFramerate 混流-输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     */
    public void setVideoFramerate(Long VideoFramerate) {
        this.VideoFramerate = VideoFramerate;
    }

    /**
     * Get 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。 
     * @return VideoGop 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public Long getVideoGop() {
        return this.VideoGop;
    }

    /**
     * Set 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     * @param VideoGop 混流-输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public void setVideoGop(Long VideoGop) {
        this.VideoGop = VideoGop;
    }

    /**
     * Get 混流-输出流背景色，取值是十进制整数。常用的颜色有：
红色：0xff0000，对应的十进制整数是16724736。
黄色：0xffff00。对应的十进制整数是16776960。
绿色：0x33cc00。对应的十进制整数是3394560。
蓝色：0x0066ff。对应的十进制整数是26367。
黑色：0x000000。对应的十进制整数是0。
白色：0xFFFFFF。对应的十进制整数是16777215。
灰色：0x999999。对应的十进制整数是10066329。 
     * @return BackgroundColor 混流-输出流背景色，取值是十进制整数。常用的颜色有：
红色：0xff0000，对应的十进制整数是16724736。
黄色：0xffff00。对应的十进制整数是16776960。
绿色：0x33cc00。对应的十进制整数是3394560。
蓝色：0x0066ff。对应的十进制整数是26367。
黑色：0x000000。对应的十进制整数是0。
白色：0xFFFFFF。对应的十进制整数是16777215。
灰色：0x999999。对应的十进制整数是10066329。
     */
    public Long getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 混流-输出流背景色，取值是十进制整数。常用的颜色有：
红色：0xff0000，对应的十进制整数是16724736。
黄色：0xffff00。对应的十进制整数是16776960。
绿色：0x33cc00。对应的十进制整数是3394560。
蓝色：0x0066ff。对应的十进制整数是26367。
黑色：0x000000。对应的十进制整数是0。
白色：0xFFFFFF。对应的十进制整数是16777215。
灰色：0x999999。对应的十进制整数是10066329。
     * @param BackgroundColor 混流-输出流背景色，取值是十进制整数。常用的颜色有：
红色：0xff0000，对应的十进制整数是16724736。
黄色：0xffff00。对应的十进制整数是16776960。
绿色：0x33cc00。对应的十进制整数是3394560。
蓝色：0x0066ff。对应的十进制整数是26367。
黑色：0x000000。对应的十进制整数是0。
白色：0xFFFFFF。对应的十进制整数是16777215。
灰色：0x999999。对应的十进制整数是10066329。
     */
    public void setBackgroundColor(Long BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get 混流-输出流背景图片，取值为实时音视频控制台上传的图片ID。 
     * @return BackgroundImageId 混流-输出流背景图片，取值为实时音视频控制台上传的图片ID。
     */
    public Long getBackgroundImageId() {
        return this.BackgroundImageId;
    }

    /**
     * Set 混流-输出流背景图片，取值为实时音视频控制台上传的图片ID。
     * @param BackgroundImageId 混流-输出流背景图片，取值为实时音视频控制台上传的图片ID。
     */
    public void setBackgroundImageId(Long BackgroundImageId) {
        this.BackgroundImageId = BackgroundImageId;
    }

    /**
     * Get 混流-输出流音频编码类型，取值范围[0,1, 2]，0为LC-AAC，1为HE-AAC，2为HE-AACv2。默认值为0。当音频编码设置为HE-AACv2时，只支持输出流音频声道数为双声道。HE-AAC和HE-AACv2支持的输出流音频采样率范围为[48000, 44100, 32000, 24000, 16000] 
     * @return AudioCodec 混流-输出流音频编码类型，取值范围[0,1, 2]，0为LC-AAC，1为HE-AAC，2为HE-AACv2。默认值为0。当音频编码设置为HE-AACv2时，只支持输出流音频声道数为双声道。HE-AAC和HE-AACv2支持的输出流音频采样率范围为[48000, 44100, 32000, 24000, 16000]
     */
    public Long getAudioCodec() {
        return this.AudioCodec;
    }

    /**
     * Set 混流-输出流音频编码类型，取值范围[0,1, 2]，0为LC-AAC，1为HE-AAC，2为HE-AACv2。默认值为0。当音频编码设置为HE-AACv2时，只支持输出流音频声道数为双声道。HE-AAC和HE-AACv2支持的输出流音频采样率范围为[48000, 44100, 32000, 24000, 16000]
     * @param AudioCodec 混流-输出流音频编码类型，取值范围[0,1, 2]，0为LC-AAC，1为HE-AAC，2为HE-AACv2。默认值为0。当音频编码设置为HE-AACv2时，只支持输出流音频声道数为双声道。HE-AAC和HE-AACv2支持的输出流音频采样率范围为[48000, 44100, 32000, 24000, 16000]
     */
    public void setAudioCodec(Long AudioCodec) {
        this.AudioCodec = AudioCodec;
    }

    /**
     * Get 混流-输出流背景图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。BackgroundImageUrl和BackgroundImageId参数都填时，以BackgroundImageUrl为准。图片大小限制不超过2MB。 
     * @return BackgroundImageUrl 混流-输出流背景图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。BackgroundImageUrl和BackgroundImageId参数都填时，以BackgroundImageUrl为准。图片大小限制不超过2MB。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 混流-输出流背景图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。BackgroundImageUrl和BackgroundImageId参数都填时，以BackgroundImageUrl为准。图片大小限制不超过2MB。
     * @param BackgroundImageUrl 混流-输出流背景图片URL地址，支持png、jpg、jpeg、bmp格式，暂不支持透明通道。URL链接长度限制为512字节。BackgroundImageUrl和BackgroundImageId参数都填时，以BackgroundImageUrl为准。图片大小限制不超过2MB。
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    public EncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncodeParams(EncodeParams source) {
        if (source.AudioSampleRate != null) {
            this.AudioSampleRate = new Long(source.AudioSampleRate);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.AudioChannels != null) {
            this.AudioChannels = new Long(source.AudioChannels);
        }
        if (source.VideoWidth != null) {
            this.VideoWidth = new Long(source.VideoWidth);
        }
        if (source.VideoHeight != null) {
            this.VideoHeight = new Long(source.VideoHeight);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.VideoFramerate != null) {
            this.VideoFramerate = new Long(source.VideoFramerate);
        }
        if (source.VideoGop != null) {
            this.VideoGop = new Long(source.VideoGop);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new Long(source.BackgroundColor);
        }
        if (source.BackgroundImageId != null) {
            this.BackgroundImageId = new Long(source.BackgroundImageId);
        }
        if (source.AudioCodec != null) {
            this.AudioCodec = new Long(source.AudioCodec);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioSampleRate", this.AudioSampleRate);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "AudioChannels", this.AudioChannels);
        this.setParamSimple(map, prefix + "VideoWidth", this.VideoWidth);
        this.setParamSimple(map, prefix + "VideoHeight", this.VideoHeight);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "VideoFramerate", this.VideoFramerate);
        this.setParamSimple(map, prefix + "VideoGop", this.VideoGop);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageId", this.BackgroundImageId);
        this.setParamSimple(map, prefix + "AudioCodec", this.AudioCodec);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);

    }
}

