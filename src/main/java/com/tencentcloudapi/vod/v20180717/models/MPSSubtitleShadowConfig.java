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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSSubtitleShadowConfig extends AbstractModel {

    /**
    * <p>文字阴影配置开关，0关闭，1开启，默认0</p>
    */
    @SerializedName("SubtitleShadowConfigSwitch")
    @Expose
    private Long SubtitleShadowConfigSwitch;

    /**
    * <p>阴影宽度，默认单位像素，底层默认值为0，无阴影</p>
    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * <p>阴影宽度单位， 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * <p>阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）</p>
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * <p>阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）</p>
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
     * Get <p>文字阴影配置开关，0关闭，1开启，默认0</p> 
     * @return SubtitleShadowConfigSwitch <p>文字阴影配置开关，0关闭，1开启，默认0</p>
     */
    public Long getSubtitleShadowConfigSwitch() {
        return this.SubtitleShadowConfigSwitch;
    }

    /**
     * Set <p>文字阴影配置开关，0关闭，1开启，默认0</p>
     * @param SubtitleShadowConfigSwitch <p>文字阴影配置开关，0关闭，1开启，默认0</p>
     */
    public void setSubtitleShadowConfigSwitch(Long SubtitleShadowConfigSwitch) {
        this.SubtitleShadowConfigSwitch = SubtitleShadowConfigSwitch;
    }

    /**
     * Get <p>阴影宽度，默认单位像素，底层默认值为0，无阴影</p> 
     * @return ShadowWidth <p>阴影宽度，默认单位像素，底层默认值为0，无阴影</p>
     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set <p>阴影宽度，默认单位像素，底层默认值为0，无阴影</p>
     * @param ShadowWidth <p>阴影宽度，默认单位像素，底层默认值为0，无阴影</p>
     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get <p>阴影宽度单位， 0 像素，1百分比，默认为0，像素</p> 
     * @return ShadowWidthUnit <p>阴影宽度单位， 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set <p>阴影宽度单位， 0 像素，1百分比，默认为0，像素</p>
     * @param ShadowWidthUnit <p>阴影宽度单位， 0 像素，1百分比，默认为0，像素</p>
     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get <p>阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）</p> 
     * @return ShadowColor <p>阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）</p>
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set <p>阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）</p>
     * @param ShadowColor <p>阴影颜色。6位16进制RGB。不填默认黑色（有设置阴影的情况下）</p>
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get <p>阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）</p> 
     * @return ShadowAlpha <p>阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）</p>
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set <p>阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）</p>
     * @param ShadowAlpha <p>阴影透明度。(0，1] 正浮点数。不填默认1，完全不透明（有设置阴影的情况下）</p>
     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    public MPSSubtitleShadowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleShadowConfig(MPSSubtitleShadowConfig source) {
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

