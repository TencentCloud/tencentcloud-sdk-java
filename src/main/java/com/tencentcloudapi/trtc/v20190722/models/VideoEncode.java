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

public class VideoEncode extends AbstractModel{

    /**
    * 输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * 输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get 输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。 
     * @return Width 输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     * @param Width 输出流宽，音视频输出时必填。取值范围[0,1920]，单位为像素值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。 
     * @return Height 输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     * @param Height 输出流高，音视频输出时必填。取值范围[0,1080]，单位为像素值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。 
     * @return Fps 输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     * @param Fps 输出流帧率，音视频输出时必填。取值范围[1,60]，表示混流的输出帧率可选范围为1到60fps。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。 
     * @return BitRate 输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     * @param BitRate 输出流码率，音视频输出时必填。取值范围[1,10000]，单位为kbps。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get 输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。 
     * @return Gop 输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     * @param Gop 输出流gop，音视频输出时必填。取值范围[1,5]，单位为秒。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoEncode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncode(VideoEncode source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);
        this.setParamSimple(map, prefix + "Gop", this.Gop);

    }
}

