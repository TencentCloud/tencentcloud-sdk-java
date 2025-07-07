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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebThemeConfig extends AbstractModel {

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
    * 企业认证页背景图（base64图片）

    */
    @SerializedName("AuthenticateBackground")
    @Expose
    private String AuthenticateBackground;

    /**
    * 隐藏企业认证页面导航栏，取值如下：
<ul><li> **true**：隐藏企业认证页面导航栏</li>
<li> **false**：显示企业认证页面导航栏（默认）</li></ul>
    */
    @SerializedName("HideAuthenticateNavigationBar")
    @Expose
    private Boolean HideAuthenticateNavigationBar;

    /**
    * 隐藏企业认证顶部logo，取值如下：
<ul><li> **true**：隐藏企业认证顶部logo</li>
<li> **false**：显示企业认证顶部logo（默认）</li></ul>
    */
    @SerializedName("HideAuthenticateTopLogo")
    @Expose
    private Boolean HideAuthenticateTopLogo;

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

    /**
     * Get 企业认证页背景图（base64图片）
 
     * @return AuthenticateBackground 企业认证页背景图（base64图片）

     */
    public String getAuthenticateBackground() {
        return this.AuthenticateBackground;
    }

    /**
     * Set 企业认证页背景图（base64图片）

     * @param AuthenticateBackground 企业认证页背景图（base64图片）

     */
    public void setAuthenticateBackground(String AuthenticateBackground) {
        this.AuthenticateBackground = AuthenticateBackground;
    }

    /**
     * Get 隐藏企业认证页面导航栏，取值如下：
<ul><li> **true**：隐藏企业认证页面导航栏</li>
<li> **false**：显示企业认证页面导航栏（默认）</li></ul> 
     * @return HideAuthenticateNavigationBar 隐藏企业认证页面导航栏，取值如下：
<ul><li> **true**：隐藏企业认证页面导航栏</li>
<li> **false**：显示企业认证页面导航栏（默认）</li></ul>
     */
    public Boolean getHideAuthenticateNavigationBar() {
        return this.HideAuthenticateNavigationBar;
    }

    /**
     * Set 隐藏企业认证页面导航栏，取值如下：
<ul><li> **true**：隐藏企业认证页面导航栏</li>
<li> **false**：显示企业认证页面导航栏（默认）</li></ul>
     * @param HideAuthenticateNavigationBar 隐藏企业认证页面导航栏，取值如下：
<ul><li> **true**：隐藏企业认证页面导航栏</li>
<li> **false**：显示企业认证页面导航栏（默认）</li></ul>
     */
    public void setHideAuthenticateNavigationBar(Boolean HideAuthenticateNavigationBar) {
        this.HideAuthenticateNavigationBar = HideAuthenticateNavigationBar;
    }

    /**
     * Get 隐藏企业认证顶部logo，取值如下：
<ul><li> **true**：隐藏企业认证顶部logo</li>
<li> **false**：显示企业认证顶部logo（默认）</li></ul> 
     * @return HideAuthenticateTopLogo 隐藏企业认证顶部logo，取值如下：
<ul><li> **true**：隐藏企业认证顶部logo</li>
<li> **false**：显示企业认证顶部logo（默认）</li></ul>
     */
    public Boolean getHideAuthenticateTopLogo() {
        return this.HideAuthenticateTopLogo;
    }

    /**
     * Set 隐藏企业认证顶部logo，取值如下：
<ul><li> **true**：隐藏企业认证顶部logo</li>
<li> **false**：显示企业认证顶部logo（默认）</li></ul>
     * @param HideAuthenticateTopLogo 隐藏企业认证顶部logo，取值如下：
<ul><li> **true**：隐藏企业认证顶部logo</li>
<li> **false**：显示企业认证顶部logo（默认）</li></ul>
     */
    public void setHideAuthenticateTopLogo(Boolean HideAuthenticateTopLogo) {
        this.HideAuthenticateTopLogo = HideAuthenticateTopLogo;
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
        if (source.AuthenticateBackground != null) {
            this.AuthenticateBackground = new String(source.AuthenticateBackground);
        }
        if (source.HideAuthenticateNavigationBar != null) {
            this.HideAuthenticateNavigationBar = new Boolean(source.HideAuthenticateNavigationBar);
        }
        if (source.HideAuthenticateTopLogo != null) {
            this.HideAuthenticateTopLogo = new Boolean(source.HideAuthenticateTopLogo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplaySignBrandLogo", this.DisplaySignBrandLogo);
        this.setParamSimple(map, prefix + "WebEmbedThemeColor", this.WebEmbedThemeColor);
        this.setParamSimple(map, prefix + "AuthenticateBackground", this.AuthenticateBackground);
        this.setParamSimple(map, prefix + "HideAuthenticateNavigationBar", this.HideAuthenticateNavigationBar);
        this.setParamSimple(map, prefix + "HideAuthenticateTopLogo", this.HideAuthenticateTopLogo);

    }
}

