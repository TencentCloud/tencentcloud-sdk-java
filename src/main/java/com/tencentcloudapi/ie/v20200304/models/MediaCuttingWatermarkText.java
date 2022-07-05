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

public class MediaCuttingWatermarkText extends AbstractModel{

    /**
    * 水印文字。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文字大小
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 水印水平坐标，单位像素，默认：0。
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * 水印垂直坐标，单位像素，默认：0。
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * 文字颜色，格式为：#RRGGBBAA，默认值：#000000。
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 文字透明度，范围：0~100，默认值：100。
    */
    @SerializedName("FontAlpha")
    @Expose
    private Long FontAlpha;

    /**
    * 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
    */
    @SerializedName("PosOriginType")
    @Expose
    private String PosOriginType;

    /**
    * 字体，可选值：
<li>SimHei</li>
<li>SimKai</li>
<li>Arial</li>
默认 SimHei。
    */
    @SerializedName("Font")
    @Expose
    private String Font;

    /**
     * Get 水印文字。 
     * @return Text 水印文字。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 水印文字。
     * @param Text 水印文字。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文字大小 
     * @return FontSize 文字大小
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 文字大小
     * @param FontSize 文字大小
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 水印水平坐标，单位像素，默认：0。 
     * @return PosX 水印水平坐标，单位像素，默认：0。
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set 水印水平坐标，单位像素，默认：0。
     * @param PosX 水印水平坐标，单位像素，默认：0。
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get 水印垂直坐标，单位像素，默认：0。 
     * @return PosY 水印垂直坐标，单位像素，默认：0。
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set 水印垂直坐标，单位像素，默认：0。
     * @param PosY 水印垂直坐标，单位像素，默认：0。
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get 文字颜色，格式为：#RRGGBBAA，默认值：#000000。 
     * @return FontColor 文字颜色，格式为：#RRGGBBAA，默认值：#000000。
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 文字颜色，格式为：#RRGGBBAA，默认值：#000000。
     * @param FontColor 文字颜色，格式为：#RRGGBBAA，默认值：#000000。
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 文字透明度，范围：0~100，默认值：100。 
     * @return FontAlpha 文字透明度，范围：0~100，默认值：100。
     */
    public Long getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set 文字透明度，范围：0~100，默认值：100。
     * @param FontAlpha 文字透明度，范围：0~100，默认值：100。
     */
    public void setFontAlpha(Long FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。 
     * @return PosOriginType 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     */
    public String getPosOriginType() {
        return this.PosOriginType;
    }

    /**
     * Set 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     * @param PosOriginType 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     */
    public void setPosOriginType(String PosOriginType) {
        this.PosOriginType = PosOriginType;
    }

    /**
     * Get 字体，可选值：
<li>SimHei</li>
<li>SimKai</li>
<li>Arial</li>
默认 SimHei。 
     * @return Font 字体，可选值：
<li>SimHei</li>
<li>SimKai</li>
<li>Arial</li>
默认 SimHei。
     */
    public String getFont() {
        return this.Font;
    }

    /**
     * Set 字体，可选值：
<li>SimHei</li>
<li>SimKai</li>
<li>Arial</li>
默认 SimHei。
     * @param Font 字体，可选值：
<li>SimHei</li>
<li>SimKai</li>
<li>Arial</li>
默认 SimHei。
     */
    public void setFont(String Font) {
        this.Font = Font;
    }

    public MediaCuttingWatermarkText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingWatermarkText(MediaCuttingWatermarkText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Long(source.FontAlpha);
        }
        if (source.PosOriginType != null) {
            this.PosOriginType = new String(source.PosOriginType);
        }
        if (source.Font != null) {
            this.Font = new String(source.Font);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "PosOriginType", this.PosOriginType);
        this.setParamSimple(map, prefix + "Font", this.Font);

    }
}

