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

public class SubtitleShadowConfig extends AbstractModel {

    /**
    * 文字阴影配置开关，0关闭，1开启，默认0
    */
    @SerializedName("SubtitleShadowConfigSwitch")
    @Expose
    private Long SubtitleShadowConfigSwitch;

    /**
    * 阴影宽度，默认单位像素，底层默认值为0，无阴影

    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * 阴影宽度单位， 0 像素，1百分比，默认为0，像素

    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * 阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）

    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * 阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）

    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
     * Get 文字阴影配置开关，0关闭，1开启，默认0 
     * @return SubtitleShadowConfigSwitch 文字阴影配置开关，0关闭，1开启，默认0
     */
    public Long getSubtitleShadowConfigSwitch() {
        return this.SubtitleShadowConfigSwitch;
    }

    /**
     * Set 文字阴影配置开关，0关闭，1开启，默认0
     * @param SubtitleShadowConfigSwitch 文字阴影配置开关，0关闭，1开启，默认0
     */
    public void setSubtitleShadowConfigSwitch(Long SubtitleShadowConfigSwitch) {
        this.SubtitleShadowConfigSwitch = SubtitleShadowConfigSwitch;
    }

    /**
     * Get 阴影宽度，默认单位像素，底层默认值为0，无阴影
 
     * @return ShadowWidth 阴影宽度，默认单位像素，底层默认值为0，无阴影

     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set 阴影宽度，默认单位像素，底层默认值为0，无阴影

     * @param ShadowWidth 阴影宽度，默认单位像素，底层默认值为0，无阴影

     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get 阴影宽度单位， 0 像素，1百分比，默认为0，像素
 
     * @return ShadowWidthUnit 阴影宽度单位， 0 像素，1百分比，默认为0，像素

     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set 阴影宽度单位， 0 像素，1百分比，默认为0，像素

     * @param ShadowWidthUnit 阴影宽度单位， 0 像素，1百分比，默认为0，像素

     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get 阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）
 
     * @return ShadowColor 阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）

     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set 阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）

     * @param ShadowColor 阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）

     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get 阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）
 
     * @return ShadowAlpha 阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）

     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set 阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）

     * @param ShadowAlpha 阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）

     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    public SubtitleShadowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleShadowConfig(SubtitleShadowConfig source) {
        if (source.SubtitleShadowConfigSwitch != null) {
            this.SubtitleShadowConfigSwitch = new Long(source.SubtitleShadowConfigSwitch);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new Float(source.ShadowWidth);
        }
        if (source.ShadowWidthUnit != null) {
            this.ShadowWidthUnit = new Long(source.ShadowWidthUnit);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleShadowConfigSwitch", this.SubtitleShadowConfigSwitch);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowWidthUnit", this.ShadowWidthUnit);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);

    }
}

