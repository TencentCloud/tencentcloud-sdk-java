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

public class TextMarkInfoItem extends AbstractModel{

    /**
    * 文字内容。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文字水印X坐标。
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * 文字水印Y坐标。
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * 文字大小
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * 字体，可选项：hei,song，simkai,arial；默认hei(黑体）。
    */
    @SerializedName("FontFile")
    @Expose
    private String FontFile;

    /**
    * 字体颜色，颜色见附录，不填默认black。
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 文字透明度，可选值0-1。0：不透明，1：全透明。默认为0
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
     * Get 文字内容。 
     * @return Text 文字内容。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文字内容。
     * @param Text 文字内容。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文字水印X坐标。 
     * @return PosX 文字水印X坐标。
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set 文字水印X坐标。
     * @param PosX 文字水印X坐标。
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get 文字水印Y坐标。 
     * @return PosY 文字水印Y坐标。
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set 文字水印Y坐标。
     * @param PosY 文字水印Y坐标。
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
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
     * Get 字体，可选项：hei,song，simkai,arial；默认hei(黑体）。 
     * @return FontFile 字体，可选项：hei,song，simkai,arial；默认hei(黑体）。
     */
    public String getFontFile() {
        return this.FontFile;
    }

    /**
     * Set 字体，可选项：hei,song，simkai,arial；默认hei(黑体）。
     * @param FontFile 字体，可选项：hei,song，simkai,arial；默认hei(黑体）。
     */
    public void setFontFile(String FontFile) {
        this.FontFile = FontFile;
    }

    /**
     * Get 字体颜色，颜色见附录，不填默认black。 
     * @return FontColor 字体颜色，颜色见附录，不填默认black。
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色，颜色见附录，不填默认black。
     * @param FontColor 字体颜色，颜色见附录，不填默认black。
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 文字透明度，可选值0-1。0：不透明，1：全透明。默认为0 
     * @return FontAlpha 文字透明度，可选值0-1。0：不透明，1：全透明。默认为0
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set 文字透明度，可选值0-1。0：不透明，1：全透明。默认为0
     * @param FontAlpha 文字透明度，可选值0-1。0：不透明，1：全透明。默认为0
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    public TextMarkInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextMarkInfoItem(TextMarkInfoItem source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontFile != null) {
            this.FontFile = new String(source.FontFile);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontFile", this.FontFile);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);

    }
}

