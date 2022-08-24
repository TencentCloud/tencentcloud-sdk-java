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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastVideoSetting extends AbstractModel{

    /**
    * 视频宽度，单位：px，默认值为1280。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频高度，单位：px，默认值为720。支持的视频分辨率最大为1920*1080。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频码率，单位：kbps，默认值为2500。最大值为10000 kbps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频帧率，单位：Hz，默认值为25。最大值为60。
    */
    @SerializedName("FrameRate")
    @Expose
    private Float FrameRate;

    /**
     * Get 视频宽度，单位：px，默认值为1280。 
     * @return Width 视频宽度，单位：px，默认值为1280。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频宽度，单位：px，默认值为1280。
     * @param Width 视频宽度，单位：px，默认值为1280。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频高度，单位：px，默认值为720。支持的视频分辨率最大为1920*1080。 
     * @return Height 视频高度，单位：px，默认值为720。支持的视频分辨率最大为1920*1080。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频高度，单位：px，默认值为720。支持的视频分辨率最大为1920*1080。
     * @param Height 视频高度，单位：px，默认值为720。支持的视频分辨率最大为1920*1080。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频码率，单位：kbps，默认值为2500。最大值为10000 kbps。 
     * @return Bitrate 视频码率，单位：kbps，默认值为2500。最大值为10000 kbps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频码率，单位：kbps，默认值为2500。最大值为10000 kbps。
     * @param Bitrate 视频码率，单位：kbps，默认值为2500。最大值为10000 kbps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频帧率，单位：Hz，默认值为25。最大值为60。 
     * @return FrameRate 视频帧率，单位：Hz，默认值为25。最大值为60。
     */
    public Float getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 视频帧率，单位：Hz，默认值为25。最大值为60。
     * @param FrameRate 视频帧率，单位：Hz，默认值为25。最大值为60。
     */
    public void setFrameRate(Float FrameRate) {
        this.FrameRate = FrameRate;
    }

    public MediaCastVideoSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastVideoSetting(MediaCastVideoSetting source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Float(source.FrameRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);

    }
}

