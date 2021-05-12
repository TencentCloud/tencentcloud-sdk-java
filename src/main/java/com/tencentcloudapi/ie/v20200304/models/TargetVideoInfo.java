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

public class TargetVideoInfo extends AbstractModel{

    /**
    * 视频宽度，单位像素
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频高度，单位像素
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频帧率，范围在1到120之间
    */
    @SerializedName("FrameRate")
    @Expose
    private Long FrameRate;

    /**
     * Get 视频宽度，单位像素 
     * @return Width 视频宽度，单位像素
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频宽度，单位像素
     * @param Width 视频宽度，单位像素
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频高度，单位像素 
     * @return Height 视频高度，单位像素
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频高度，单位像素
     * @param Height 视频高度，单位像素
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频帧率，范围在1到120之间 
     * @return FrameRate 视频帧率，范围在1到120之间
     */
    public Long getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 视频帧率，范围在1到120之间
     * @param FrameRate 视频帧率，范围在1到120之间
     */
    public void setFrameRate(Long FrameRate) {
        this.FrameRate = FrameRate;
    }

    public TargetVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetVideoInfo(TargetVideoInfo source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Long(source.FrameRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);

    }
}

