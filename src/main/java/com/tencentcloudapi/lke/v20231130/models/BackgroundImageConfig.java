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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackgroundImageConfig extends AbstractModel {

    /**
    * 横图(pc)
    */
    @SerializedName("LandscapeImageUrl")
    @Expose
    private String LandscapeImageUrl;

    /**
    * 原始图
    */
    @SerializedName("OriginalImageUrl")
    @Expose
    private String OriginalImageUrl;

    /**
    * 长图(手机)
    */
    @SerializedName("PortraitImageUrl")
    @Expose
    private String PortraitImageUrl;

    /**
    * 主题色
    */
    @SerializedName("ThemeColor")
    @Expose
    private String ThemeColor;

    /**
    * 亮度值
    */
    @SerializedName("Brightness")
    @Expose
    private Long Brightness;

    /**
     * Get 横图(pc) 
     * @return LandscapeImageUrl 横图(pc)
     */
    public String getLandscapeImageUrl() {
        return this.LandscapeImageUrl;
    }

    /**
     * Set 横图(pc)
     * @param LandscapeImageUrl 横图(pc)
     */
    public void setLandscapeImageUrl(String LandscapeImageUrl) {
        this.LandscapeImageUrl = LandscapeImageUrl;
    }

    /**
     * Get 原始图 
     * @return OriginalImageUrl 原始图
     */
    public String getOriginalImageUrl() {
        return this.OriginalImageUrl;
    }

    /**
     * Set 原始图
     * @param OriginalImageUrl 原始图
     */
    public void setOriginalImageUrl(String OriginalImageUrl) {
        this.OriginalImageUrl = OriginalImageUrl;
    }

    /**
     * Get 长图(手机) 
     * @return PortraitImageUrl 长图(手机)
     */
    public String getPortraitImageUrl() {
        return this.PortraitImageUrl;
    }

    /**
     * Set 长图(手机)
     * @param PortraitImageUrl 长图(手机)
     */
    public void setPortraitImageUrl(String PortraitImageUrl) {
        this.PortraitImageUrl = PortraitImageUrl;
    }

    /**
     * Get 主题色 
     * @return ThemeColor 主题色
     */
    public String getThemeColor() {
        return this.ThemeColor;
    }

    /**
     * Set 主题色
     * @param ThemeColor 主题色
     */
    public void setThemeColor(String ThemeColor) {
        this.ThemeColor = ThemeColor;
    }

    /**
     * Get 亮度值 
     * @return Brightness 亮度值
     */
    public Long getBrightness() {
        return this.Brightness;
    }

    /**
     * Set 亮度值
     * @param Brightness 亮度值
     */
    public void setBrightness(Long Brightness) {
        this.Brightness = Brightness;
    }

    public BackgroundImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackgroundImageConfig(BackgroundImageConfig source) {
        if (source.LandscapeImageUrl != null) {
            this.LandscapeImageUrl = new String(source.LandscapeImageUrl);
        }
        if (source.OriginalImageUrl != null) {
            this.OriginalImageUrl = new String(source.OriginalImageUrl);
        }
        if (source.PortraitImageUrl != null) {
            this.PortraitImageUrl = new String(source.PortraitImageUrl);
        }
        if (source.ThemeColor != null) {
            this.ThemeColor = new String(source.ThemeColor);
        }
        if (source.Brightness != null) {
            this.Brightness = new Long(source.Brightness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LandscapeImageUrl", this.LandscapeImageUrl);
        this.setParamSimple(map, prefix + "OriginalImageUrl", this.OriginalImageUrl);
        this.setParamSimple(map, prefix + "PortraitImageUrl", this.PortraitImageUrl);
        this.setParamSimple(map, prefix + "ThemeColor", this.ThemeColor);
        this.setParamSimple(map, prefix + "Brightness", this.Brightness);

    }
}

