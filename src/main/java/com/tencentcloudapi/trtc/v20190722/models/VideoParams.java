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

public class VideoParams extends AbstractModel{

    /**
    * 视频的宽度值，单位为像素，默认值360。不能超过1920，与height的乘积不能超过1920*1080。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频的高度值，单位为像素，默认值640。不能超过1920，与width的乘积不能超过1920*1080。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频的帧率，范围[1, 60]，默认15。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频的码率,单位是bps，范围[64000, 8192000]，默认550000bps。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * 视频关键帧时间间隔，单位秒，默认值10秒。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get 视频的宽度值，单位为像素，默认值360。不能超过1920，与height的乘积不能超过1920*1080。 
     * @return Width 视频的宽度值，单位为像素，默认值360。不能超过1920，与height的乘积不能超过1920*1080。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频的宽度值，单位为像素，默认值360。不能超过1920，与height的乘积不能超过1920*1080。
     * @param Width 视频的宽度值，单位为像素，默认值360。不能超过1920，与height的乘积不能超过1920*1080。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频的高度值，单位为像素，默认值640。不能超过1920，与width的乘积不能超过1920*1080。 
     * @return Height 视频的高度值，单位为像素，默认值640。不能超过1920，与width的乘积不能超过1920*1080。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频的高度值，单位为像素，默认值640。不能超过1920，与width的乘积不能超过1920*1080。
     * @param Height 视频的高度值，单位为像素，默认值640。不能超过1920，与width的乘积不能超过1920*1080。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频的帧率，范围[1, 60]，默认15。 
     * @return Fps 视频的帧率，范围[1, 60]，默认15。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频的帧率，范围[1, 60]，默认15。
     * @param Fps 视频的帧率，范围[1, 60]，默认15。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频的码率,单位是bps，范围[64000, 8192000]，默认550000bps。 
     * @return BitRate 视频的码率,单位是bps，范围[64000, 8192000]，默认550000bps。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 视频的码率,单位是bps，范围[64000, 8192000]，默认550000bps。
     * @param BitRate 视频的码率,单位是bps，范围[64000, 8192000]，默认550000bps。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get 视频关键帧时间间隔，单位秒，默认值10秒。 
     * @return Gop 视频关键帧时间间隔，单位秒，默认值10秒。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 视频关键帧时间间隔，单位秒，默认值10秒。
     * @param Gop 视频关键帧时间间隔，单位秒，默认值10秒。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoParams(VideoParams source) {
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

