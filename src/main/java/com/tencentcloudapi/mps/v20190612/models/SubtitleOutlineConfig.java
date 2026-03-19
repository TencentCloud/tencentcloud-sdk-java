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

public class SubtitleOutlineConfig extends AbstractModel {

    /**
    * <p>文字描边配置开关，0关闭，1开启，默认0</p>
    */
    @SerializedName("SubtitleOutlineConfigSwitch")
    @Expose
    private Long SubtitleOutlineConfigSwitch;

    /**
    * <p>描边宽度，默认单位像素，底层默认值为源视频高度的0.3%</p>
    */
    @SerializedName("OutlineWidth")
    @Expose
    private Float OutlineWidth;

    /**
    * <p>描边宽度单位，0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("OutlineWidthUnit")
    @Expose
    private Long OutlineWidthUnit;

    /**
    * <p>描边颜色。6位16进制RGB。不填默认黑色。</p>
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * <p>描边透明度。(0，1] 正浮点数。不填默认1，完全不透明</p>
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
     * Get <p>文字描边配置开关，0关闭，1开启，默认0</p> 
     * @return SubtitleOutlineConfigSwitch <p>文字描边配置开关，0关闭，1开启，默认0</p>
     */
    public Long getSubtitleOutlineConfigSwitch() {
        return this.SubtitleOutlineConfigSwitch;
    }

    /**
     * Set <p>文字描边配置开关，0关闭，1开启，默认0</p>
     * @param SubtitleOutlineConfigSwitch <p>文字描边配置开关，0关闭，1开启，默认0</p>
     */
    public void setSubtitleOutlineConfigSwitch(Long SubtitleOutlineConfigSwitch) {
        this.SubtitleOutlineConfigSwitch = SubtitleOutlineConfigSwitch;
    }

    /**
     * Get <p>描边宽度，默认单位像素，底层默认值为源视频高度的0.3%</p> 
     * @return OutlineWidth <p>描边宽度，默认单位像素，底层默认值为源视频高度的0.3%</p>
     */
    public Float getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set <p>描边宽度，默认单位像素，底层默认值为源视频高度的0.3%</p>
     * @param OutlineWidth <p>描边宽度，默认单位像素，底层默认值为源视频高度的0.3%</p>
     */
    public void setOutlineWidth(Float OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get <p>描边宽度单位，0 像素，1百分比，默认为0，像素</p> 
     * @return OutlineWidthUnit <p>描边宽度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public Long getOutlineWidthUnit() {
        return this.OutlineWidthUnit;
    }

    /**
     * Set <p>描边宽度单位，0 像素，1百分比，默认为0，像素</p>
     * @param OutlineWidthUnit <p>描边宽度单位，0 像素，1百分比，默认为0，像素</p>
     */
    public void setOutlineWidthUnit(Long OutlineWidthUnit) {
        this.OutlineWidthUnit = OutlineWidthUnit;
    }

    /**
     * Get <p>描边颜色。6位16进制RGB。不填默认黑色。</p> 
     * @return OutlineColor <p>描边颜色。6位16进制RGB。不填默认黑色。</p>
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set <p>描边颜色。6位16进制RGB。不填默认黑色。</p>
     * @param OutlineColor <p>描边颜色。6位16进制RGB。不填默认黑色。</p>
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get <p>描边透明度。(0，1] 正浮点数。不填默认1，完全不透明</p> 
     * @return OutlineAlpha <p>描边透明度。(0，1] 正浮点数。不填默认1，完全不透明</p>
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set <p>描边透明度。(0，1] 正浮点数。不填默认1，完全不透明</p>
     * @param OutlineAlpha <p>描边透明度。(0，1] 正浮点数。不填默认1，完全不透明</p>
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    public SubtitleOutlineConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleOutlineConfig(SubtitleOutlineConfig source) {
        if (source.SubtitleOutlineConfigSwitch != null) {
            this.SubtitleOutlineConfigSwitch = new Long(source.SubtitleOutlineConfigSwitch);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new Float(source.OutlineWidth);
        }
        if (source.OutlineWidthUnit != null) {
            this.OutlineWidthUnit = new Long(source.OutlineWidthUnit);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleOutlineConfigSwitch", this.SubtitleOutlineConfigSwitch);
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineWidthUnit", this.OutlineWidthUnit);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);

    }
}

