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

public class ComposeSubtitleStyle extends AbstractModel {

    /**
    * 字幕高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认为 FontSize 大小。
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 字幕距离下边框距离，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：0px
    */
    @SerializedName("MarginBottom")
    @Expose
    private String MarginBottom;

    /**
    * 字体类型，支持：
<li>SimHei：黑体（默认）。</li>
<li>SimSun：宋体。</li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * 字体大小，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：2%
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * 是否使用粗体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
    */
    @SerializedName("FontBold")
    @Expose
    private Long FontBold;

    /**
    * 是否使用斜体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
    */
    @SerializedName("FontItalic")
    @Expose
    private Long FontItalic;

    /**
    * 字体颜色，格式：#RRGGBBAA。  
默认值：0x000000FF（黑色）。  
注意：其中 AA 部分指的是透明度，为可选。

    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 文字对齐方式：
<li>Center：居中（默认）。</li>
<li>Left：左对齐。</li>
<li>Right：右对齐。</li>
    */
    @SerializedName("FontAlign")
    @Expose
    private String FontAlign;

    /**
    * 用于字幕对齐留白：
<li>FontAlign=Left 时，表示距离左边距离。</li>
<li>FontAlign=Right时，表示距离右边距离。</li>
支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布宽度的百分比大小，如 10% 表示为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
    */
    @SerializedName("FontAlignMargin")
    @Expose
    private String FontAlignMargin;

    /**
    * 字体边框宽度，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认： 0，表示不需要边框。
    */
    @SerializedName("BorderWidth")
    @Expose
    private String BorderWidth;

    /**
    * 边框颜色，当 BorderWidth 不为 0 时生效，其值格式和 FontColor 一致。
    */
    @SerializedName("BorderColor")
    @Expose
    private String BorderColor;

    /**
    * 文字底色，其值格式和 FontColor 一致。  
默认为空， 表示不使用底色。
    */
    @SerializedName("BottomColor")
    @Expose
    private String BottomColor;

    /**
     * Get 字幕高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认为 FontSize 大小。 
     * @return Height 字幕高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认为 FontSize 大小。
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 字幕高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认为 FontSize 大小。
     * @param Height 字幕高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认为 FontSize 大小。
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 字幕距离下边框距离，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：0px 
     * @return MarginBottom 字幕距离下边框距离，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：0px
     */
    public String getMarginBottom() {
        return this.MarginBottom;
    }

    /**
     * Set 字幕距离下边框距离，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：0px
     * @param MarginBottom 字幕距离下边框距离，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：0px
     */
    public void setMarginBottom(String MarginBottom) {
        this.MarginBottom = MarginBottom;
    }

    /**
     * Get 字体类型，支持：
<li>SimHei：黑体（默认）。</li>
<li>SimSun：宋体。</li> 
     * @return FontType 字体类型，支持：
<li>SimHei：黑体（默认）。</li>
<li>SimSun：宋体。</li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set 字体类型，支持：
<li>SimHei：黑体（默认）。</li>
<li>SimSun：宋体。</li>
     * @param FontType 字体类型，支持：
<li>SimHei：黑体（默认）。</li>
<li>SimSun：宋体。</li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get 字体大小，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：2% 
     * @return FontSize 字体大小，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：2%
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 字体大小，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：2%
     * @param FontSize 字体大小，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认：2%
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 是否使用粗体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li> 
     * @return FontBold 是否使用粗体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     */
    public Long getFontBold() {
        return this.FontBold;
    }

    /**
     * Set 是否使用粗体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     * @param FontBold 是否使用粗体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     */
    public void setFontBold(Long FontBold) {
        this.FontBold = FontBold;
    }

    /**
     * Get 是否使用斜体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li> 
     * @return FontItalic 是否使用斜体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     */
    public Long getFontItalic() {
        return this.FontItalic;
    }

    /**
     * Set 是否使用斜体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     * @param FontItalic 是否使用斜体，和字体相关，可选值：
<li>0：否（默认）。</li>
<li>1：是。</li>
     */
    public void setFontItalic(Long FontItalic) {
        this.FontItalic = FontItalic;
    }

    /**
     * Get 字体颜色，格式：#RRGGBBAA。  
默认值：0x000000FF（黑色）。  
注意：其中 AA 部分指的是透明度，为可选。
 
     * @return FontColor 字体颜色，格式：#RRGGBBAA。  
默认值：0x000000FF（黑色）。  
注意：其中 AA 部分指的是透明度，为可选。

     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色，格式：#RRGGBBAA。  
默认值：0x000000FF（黑色）。  
注意：其中 AA 部分指的是透明度，为可选。

     * @param FontColor 字体颜色，格式：#RRGGBBAA。  
默认值：0x000000FF（黑色）。  
注意：其中 AA 部分指的是透明度，为可选。

     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 文字对齐方式：
<li>Center：居中（默认）。</li>
<li>Left：左对齐。</li>
<li>Right：右对齐。</li> 
     * @return FontAlign 文字对齐方式：
<li>Center：居中（默认）。</li>
<li>Left：左对齐。</li>
<li>Right：右对齐。</li>
     */
    public String getFontAlign() {
        return this.FontAlign;
    }

    /**
     * Set 文字对齐方式：
<li>Center：居中（默认）。</li>
<li>Left：左对齐。</li>
<li>Right：右对齐。</li>
     * @param FontAlign 文字对齐方式：
<li>Center：居中（默认）。</li>
<li>Left：左对齐。</li>
<li>Right：右对齐。</li>
     */
    public void setFontAlign(String FontAlign) {
        this.FontAlign = FontAlign;
    }

    /**
     * Get 用于字幕对齐留白：
<li>FontAlign=Left 时，表示距离左边距离。</li>
<li>FontAlign=Right时，表示距离右边距离。</li>
支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布宽度的百分比大小，如 10% 表示为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li> 
     * @return FontAlignMargin 用于字幕对齐留白：
<li>FontAlign=Left 时，表示距离左边距离。</li>
<li>FontAlign=Right时，表示距离右边距离。</li>
支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布宽度的百分比大小，如 10% 表示为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
     */
    public String getFontAlignMargin() {
        return this.FontAlignMargin;
    }

    /**
     * Set 用于字幕对齐留白：
<li>FontAlign=Left 时，表示距离左边距离。</li>
<li>FontAlign=Right时，表示距离右边距离。</li>
支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布宽度的百分比大小，如 10% 表示为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
     * @param FontAlignMargin 用于字幕对齐留白：
<li>FontAlign=Left 时，表示距离左边距离。</li>
<li>FontAlign=Right时，表示距离右边距离。</li>
支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布宽度的百分比大小，如 10% 表示为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
     */
    public void setFontAlignMargin(String FontAlignMargin) {
        this.FontAlignMargin = FontAlignMargin;
    }

    /**
     * Get 字体边框宽度，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认： 0，表示不需要边框。 
     * @return BorderWidth 字体边框宽度，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认： 0，表示不需要边框。
     */
    public String getBorderWidth() {
        return this.BorderWidth;
    }

    /**
     * Set 字体边框宽度，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认： 0，表示不需要边框。
     * @param BorderWidth 字体边框宽度，支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示为画布高度的百分比大小，如 10% 表示为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示单位为像素，如 100px 表示为100像素。</li>
默认： 0，表示不需要边框。
     */
    public void setBorderWidth(String BorderWidth) {
        this.BorderWidth = BorderWidth;
    }

    /**
     * Get 边框颜色，当 BorderWidth 不为 0 时生效，其值格式和 FontColor 一致。 
     * @return BorderColor 边框颜色，当 BorderWidth 不为 0 时生效，其值格式和 FontColor 一致。
     */
    public String getBorderColor() {
        return this.BorderColor;
    }

    /**
     * Set 边框颜色，当 BorderWidth 不为 0 时生效，其值格式和 FontColor 一致。
     * @param BorderColor 边框颜色，当 BorderWidth 不为 0 时生效，其值格式和 FontColor 一致。
     */
    public void setBorderColor(String BorderColor) {
        this.BorderColor = BorderColor;
    }

    /**
     * Get 文字底色，其值格式和 FontColor 一致。  
默认为空， 表示不使用底色。 
     * @return BottomColor 文字底色，其值格式和 FontColor 一致。  
默认为空， 表示不使用底色。
     */
    public String getBottomColor() {
        return this.BottomColor;
    }

    /**
     * Set 文字底色，其值格式和 FontColor 一致。  
默认为空， 表示不使用底色。
     * @param BottomColor 文字底色，其值格式和 FontColor 一致。  
默认为空， 表示不使用底色。
     */
    public void setBottomColor(String BottomColor) {
        this.BottomColor = BottomColor;
    }

    public ComposeSubtitleStyle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeSubtitleStyle(ComposeSubtitleStyle source) {
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.MarginBottom != null) {
            this.MarginBottom = new String(source.MarginBottom);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontBold != null) {
            this.FontBold = new Long(source.FontBold);
        }
        if (source.FontItalic != null) {
            this.FontItalic = new Long(source.FontItalic);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlign != null) {
            this.FontAlign = new String(source.FontAlign);
        }
        if (source.FontAlignMargin != null) {
            this.FontAlignMargin = new String(source.FontAlignMargin);
        }
        if (source.BorderWidth != null) {
            this.BorderWidth = new String(source.BorderWidth);
        }
        if (source.BorderColor != null) {
            this.BorderColor = new String(source.BorderColor);
        }
        if (source.BottomColor != null) {
            this.BottomColor = new String(source.BottomColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "MarginBottom", this.MarginBottom);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontBold", this.FontBold);
        this.setParamSimple(map, prefix + "FontItalic", this.FontItalic);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlign", this.FontAlign);
        this.setParamSimple(map, prefix + "FontAlignMargin", this.FontAlignMargin);
        this.setParamSimple(map, prefix + "BorderWidth", this.BorderWidth);
        this.setParamSimple(map, prefix + "BorderColor", this.BorderColor);
        this.setParamSimple(map, prefix + "BottomColor", this.BottomColor);

    }
}

