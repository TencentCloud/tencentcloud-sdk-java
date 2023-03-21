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

public class WaterMarkChar extends AbstractModel{

    /**
    * 文字水印的起始坐标Y值，从左上角开始
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 文字水印的起始坐标X值，从左上角开始
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 文字水印的宽度，单位像素值
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 文字水印的高度，单位像素值
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 水印文字的内容
    */
    @SerializedName("Chars")
    @Expose
    private String Chars;

    /**
    * 水印文字的大小，单位像素，默认14
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 水印文字的颜色，默认白色
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 水印文字的背景色，为空代表背景透明，默认为空
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
     * Get 文字水印的起始坐标Y值，从左上角开始 
     * @return Top 文字水印的起始坐标Y值，从左上角开始
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 文字水印的起始坐标Y值，从左上角开始
     * @param Top 文字水印的起始坐标Y值，从左上角开始
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 文字水印的起始坐标X值，从左上角开始 
     * @return Left 文字水印的起始坐标X值，从左上角开始
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 文字水印的起始坐标X值，从左上角开始
     * @param Left 文字水印的起始坐标X值，从左上角开始
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 文字水印的宽度，单位像素值 
     * @return Width 文字水印的宽度，单位像素值
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 文字水印的宽度，单位像素值
     * @param Width 文字水印的宽度，单位像素值
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 文字水印的高度，单位像素值 
     * @return Height 文字水印的高度，单位像素值
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 文字水印的高度，单位像素值
     * @param Height 文字水印的高度，单位像素值
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 水印文字的内容 
     * @return Chars 水印文字的内容
     */
    public String getChars() {
        return this.Chars;
    }

    /**
     * Set 水印文字的内容
     * @param Chars 水印文字的内容
     */
    public void setChars(String Chars) {
        this.Chars = Chars;
    }

    /**
     * Get 水印文字的大小，单位像素，默认14 
     * @return FontSize 水印文字的大小，单位像素，默认14
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 水印文字的大小，单位像素，默认14
     * @param FontSize 水印文字的大小，单位像素，默认14
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 水印文字的颜色，默认白色 
     * @return FontColor 水印文字的颜色，默认白色
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 水印文字的颜色，默认白色
     * @param FontColor 水印文字的颜色，默认白色
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 水印文字的背景色，为空代表背景透明，默认为空 
     * @return BackGroundColor 水印文字的背景色，为空代表背景透明，默认为空
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set 水印文字的背景色，为空代表背景透明，默认为空
     * @param BackGroundColor 水印文字的背景色，为空代表背景透明，默认为空
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    public WaterMarkChar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkChar(WaterMarkChar source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Chars != null) {
            this.Chars = new String(source.Chars);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Chars", this.Chars);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);

    }
}

