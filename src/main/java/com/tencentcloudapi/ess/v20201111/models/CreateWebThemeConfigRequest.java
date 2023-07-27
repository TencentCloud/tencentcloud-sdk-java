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

public class CreateWebThemeConfigRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 主题类型
<br/>EMBED_WEB_THEME：嵌入式主题
<br/>目前只支持EMBED_WEB_THEME，web页面嵌入的主题风格配置
    */
    @SerializedName("ThemeType")
    @Expose
    private String ThemeType;

    /**
    * 主题配置
    */
    @SerializedName("WebThemeConfig")
    @Expose
    private WebThemeConfig WebThemeConfig;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 主题类型
<br/>EMBED_WEB_THEME：嵌入式主题
<br/>目前只支持EMBED_WEB_THEME，web页面嵌入的主题风格配置 
     * @return ThemeType 主题类型
<br/>EMBED_WEB_THEME：嵌入式主题
<br/>目前只支持EMBED_WEB_THEME，web页面嵌入的主题风格配置
     */
    public String getThemeType() {
        return this.ThemeType;
    }

    /**
     * Set 主题类型
<br/>EMBED_WEB_THEME：嵌入式主题
<br/>目前只支持EMBED_WEB_THEME，web页面嵌入的主题风格配置
     * @param ThemeType 主题类型
<br/>EMBED_WEB_THEME：嵌入式主题
<br/>目前只支持EMBED_WEB_THEME，web页面嵌入的主题风格配置
     */
    public void setThemeType(String ThemeType) {
        this.ThemeType = ThemeType;
    }

    /**
     * Get 主题配置 
     * @return WebThemeConfig 主题配置
     */
    public WebThemeConfig getWebThemeConfig() {
        return this.WebThemeConfig;
    }

    /**
     * Set 主题配置
     * @param WebThemeConfig 主题配置
     */
    public void setWebThemeConfig(WebThemeConfig WebThemeConfig) {
        this.WebThemeConfig = WebThemeConfig;
    }

    public CreateWebThemeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWebThemeConfigRequest(CreateWebThemeConfigRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ThemeType != null) {
            this.ThemeType = new String(source.ThemeType);
        }
        if (source.WebThemeConfig != null) {
            this.WebThemeConfig = new WebThemeConfig(source.WebThemeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ThemeType", this.ThemeType);
        this.setParamObj(map, prefix + "WebThemeConfig.", this.WebThemeConfig);

    }
}

