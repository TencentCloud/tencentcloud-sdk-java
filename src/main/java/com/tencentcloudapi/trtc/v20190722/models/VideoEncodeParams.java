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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEncodeParams extends AbstractModel {

    /**
    * 宽。取值范围[0,1920]，单位为像素值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高。取值范围[0,1080]，单位为像素值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 帧率。取值范围[1,60]，表示帧率可选范围为1到60fps。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 码率。取值范围[1,10000]，单位为kbps。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * gop。取值范围[1,2]，单位为秒。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get 宽。取值范围[0,1920]，单位为像素值。 
     * @return Width 宽。取值范围[0,1920]，单位为像素值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽。取值范围[0,1920]，单位为像素值。
     * @param Width 宽。取值范围[0,1920]，单位为像素值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高。取值范围[0,1080]，单位为像素值。 
     * @return Height 高。取值范围[0,1080]，单位为像素值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高。取值范围[0,1080]，单位为像素值。
     * @param Height 高。取值范围[0,1080]，单位为像素值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 帧率。取值范围[1,60]，表示帧率可选范围为1到60fps。 
     * @return Fps 帧率。取值范围[1,60]，表示帧率可选范围为1到60fps。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率。取值范围[1,60]，表示帧率可选范围为1到60fps。
     * @param Fps 帧率。取值范围[1,60]，表示帧率可选范围为1到60fps。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 码率。取值范围[1,10000]，单位为kbps。 
     * @return BitRate 码率。取值范围[1,10000]，单位为kbps。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 码率。取值范围[1,10000]，单位为kbps。
     * @param BitRate 码率。取值范围[1,10000]，单位为kbps。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get gop。取值范围[1,2]，单位为秒。 
     * @return Gop gop。取值范围[1,2]，单位为秒。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set gop。取值范围[1,2]，单位为秒。
     * @param Gop gop。取值范围[1,2]，单位为秒。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoEncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodeParams(VideoEncodeParams source) {
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

