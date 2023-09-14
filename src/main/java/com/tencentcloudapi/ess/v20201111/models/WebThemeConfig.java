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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebThemeConfig extends AbstractModel{

    /**
    * 是否显示页面底部电子签logo，取值如下：
<ul><li> **true**：页面底部显示电子签logo</li>
<li> **false**：页面底部不显示电子签logo（默认）</li></ul>
    */
    @SerializedName("DisplaySignBrandLogo")
    @Expose
    private Boolean DisplaySignBrandLogo;

    /**
    * 主题颜色：
支持十六进制颜色值以及RGB格式颜色值，例如：#D54941，rgb(213, 73, 65)
<br/>
    */
    @SerializedName("WebEmbedThemeColor")
    @Expose
    private String WebEmbedThemeColor;

    /**
     * Get 是否显示页面底部电子签logo，取值如下：
<ul><li> **true**：页面底部显示电子签logo</li>
<li> **false**：页面底部不显示电子签logo（默认）</li></ul> 
     * @return DisplaySignBrandLogo 是否显示页面底部电子签logo，取值如下：
<ul><li> **true**：页面底部显示电子签logo</li>
<li> **false**：页面底部不显示电子签logo（默认）</li></ul>
     */
    public Boolean getDisplaySignBrandLogo() {
        return this.DisplaySignBrandLogo;
    }

    /**
     * Set 是否显示页面底部电子签logo，取值如下：
<ul><li> **true**：页面底部显示电子签logo</li>
<li> **false**：页面底部不显示电子签logo（默认）</li></ul>
     * @param DisplaySignBrandLogo 是否显示页面底部电子签logo，取值如下：
<ul><li> **true**：页面底部显示电子签logo</li>
<li> **false**：页面底部不显示电子签logo（默认）</li></ul>
     */
    public void setDisplaySignBrandLogo(Boolean DisplaySignBrandLogo) {
        this.DisplaySignBrandLogo = DisplaySignBrandLogo;
    }

    /**
     * Get 主题颜色：
支持十六进制颜色值以及RGB格式颜色值，例如：#D54941，rgb(213, 73, 65)
<br/> 
     * @return WebEmbedThemeColor 主题颜色：
支持十六进制颜色值以及RGB格式颜色值，例如：#D54941，rgb(213, 73, 65)
<br/>
     */
    public String getWebEmbedThemeColor() {
        return this.WebEmbedThemeColor;
    }

    /**
     * Set 主题颜色：
支持十六进制颜色值以及RGB格式颜色值，例如：#D54941，rgb(213, 73, 65)
<br/>
     * @param WebEmbedThemeColor 主题颜色：
支持十六进制颜色值以及RGB格式颜色值，例如：#D54941，rgb(213, 73, 65)
<br/>
     */
    public void setWebEmbedThemeColor(String WebEmbedThemeColor) {
        this.WebEmbedThemeColor = WebEmbedThemeColor;
    }

    public WebThemeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebThemeConfig(WebThemeConfig source) {
        if (source.DisplaySignBrandLogo != null) {
            this.DisplaySignBrandLogo = new Boolean(source.DisplaySignBrandLogo);
        }
        if (source.WebEmbedThemeColor != null) {
            this.WebEmbedThemeColor = new String(source.WebEmbedThemeColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplaySignBrandLogo", this.DisplaySignBrandLogo);
        this.setParamSimple(map, prefix + "WebEmbedThemeColor", this.WebEmbedThemeColor);

    }
}

