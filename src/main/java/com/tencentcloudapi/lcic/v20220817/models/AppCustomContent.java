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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppCustomContent extends AbstractModel{

    /**
    * 场景参数，一个应用下可以设置多个不同场景。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * logo地址。
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * 主页地址，可设置用于跳转。
    */
    @SerializedName("HomeUrl")
    @Expose
    private String HomeUrl;

    /**
    * 自定义的js。
    */
    @SerializedName("JsUrl")
    @Expose
    private String JsUrl;

    /**
    * 自定义的css。
    */
    @SerializedName("CssUrl")
    @Expose
    private String CssUrl;

    /**
     * Get 场景参数，一个应用下可以设置多个不同场景。 
     * @return Scene 场景参数，一个应用下可以设置多个不同场景。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景参数，一个应用下可以设置多个不同场景。
     * @param Scene 场景参数，一个应用下可以设置多个不同场景。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get logo地址。 
     * @return LogoUrl logo地址。
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set logo地址。
     * @param LogoUrl logo地址。
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get 主页地址，可设置用于跳转。 
     * @return HomeUrl 主页地址，可设置用于跳转。
     */
    public String getHomeUrl() {
        return this.HomeUrl;
    }

    /**
     * Set 主页地址，可设置用于跳转。
     * @param HomeUrl 主页地址，可设置用于跳转。
     */
    public void setHomeUrl(String HomeUrl) {
        this.HomeUrl = HomeUrl;
    }

    /**
     * Get 自定义的js。 
     * @return JsUrl 自定义的js。
     */
    public String getJsUrl() {
        return this.JsUrl;
    }

    /**
     * Set 自定义的js。
     * @param JsUrl 自定义的js。
     */
    public void setJsUrl(String JsUrl) {
        this.JsUrl = JsUrl;
    }

    /**
     * Get 自定义的css。 
     * @return CssUrl 自定义的css。
     */
    public String getCssUrl() {
        return this.CssUrl;
    }

    /**
     * Set 自定义的css。
     * @param CssUrl 自定义的css。
     */
    public void setCssUrl(String CssUrl) {
        this.CssUrl = CssUrl;
    }

    public AppCustomContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppCustomContent(AppCustomContent source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.HomeUrl != null) {
            this.HomeUrl = new String(source.HomeUrl);
        }
        if (source.JsUrl != null) {
            this.JsUrl = new String(source.JsUrl);
        }
        if (source.CssUrl != null) {
            this.CssUrl = new String(source.CssUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "HomeUrl", this.HomeUrl);
        this.setParamSimple(map, prefix + "JsUrl", this.JsUrl);
        this.setParamSimple(map, prefix + "CssUrl", this.CssUrl);

    }
}

