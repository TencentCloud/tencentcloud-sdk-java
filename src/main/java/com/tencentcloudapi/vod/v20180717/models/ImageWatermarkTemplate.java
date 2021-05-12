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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageWatermarkTemplate extends AbstractModel{

    /**
    * 水印图片地址。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素；</li>
0px：表示 Height 按照 Width 对视频宽度的比例缩放。
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束。</li>
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
     * Get 水印图片地址。 
     * @return ImageUrl 水印图片地址。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 水印图片地址。
     * @param ImageUrl 水印图片地址。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li> 
     * @return Width 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
     * @param Width 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素；</li>
0px：表示 Height 按照 Width 对视频宽度的比例缩放。 
     * @return Height 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素；</li>
0px：表示 Height 按照 Width 对视频宽度的比例缩放。
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素；</li>
0px：表示 Height 按照 Width 对视频宽度的比例缩放。
     * @param Height 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素；</li>
0px：表示 Height 按照 Width 对视频宽度的比例缩放。
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束。</li> 
     * @return RepeatType 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束。</li>
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束。</li>
     * @param RepeatType 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束。</li>
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    public ImageWatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageWatermarkTemplate(ImageWatermarkTemplate source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);

    }
}

