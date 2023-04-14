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
    * logo地址，用于上课时展示的课堂或平台图标，支持开发商自定义业务品牌展示。
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * HomeUrl：主页地址，用于上课结束后课堂跳转，支持跳转到自己的业务系统。如果配置为空则下课后关闭课堂页面。
    */
    @SerializedName("HomeUrl")
    @Expose
    private String HomeUrl;

    /**
    * JsUrl ：自定义js。针对应用用于开发上自定义课堂界面、模块功能、监控操作，支持数据请求与响应处理。
    */
    @SerializedName("JsUrl")
    @Expose
    private String JsUrl;

    /**
    * Css : 自定义的css。针对应用用于支持课堂界面的、模块的UI渲染修改、皮肤配色修改、功能模块的隐藏和展示。
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
     * Get logo地址，用于上课时展示的课堂或平台图标，支持开发商自定义业务品牌展示。 
     * @return LogoUrl logo地址，用于上课时展示的课堂或平台图标，支持开发商自定义业务品牌展示。
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set logo地址，用于上课时展示的课堂或平台图标，支持开发商自定义业务品牌展示。
     * @param LogoUrl logo地址，用于上课时展示的课堂或平台图标，支持开发商自定义业务品牌展示。
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get HomeUrl：主页地址，用于上课结束后课堂跳转，支持跳转到自己的业务系统。如果配置为空则下课后关闭课堂页面。 
     * @return HomeUrl HomeUrl：主页地址，用于上课结束后课堂跳转，支持跳转到自己的业务系统。如果配置为空则下课后关闭课堂页面。
     */
    public String getHomeUrl() {
        return this.HomeUrl;
    }

    /**
     * Set HomeUrl：主页地址，用于上课结束后课堂跳转，支持跳转到自己的业务系统。如果配置为空则下课后关闭课堂页面。
     * @param HomeUrl HomeUrl：主页地址，用于上课结束后课堂跳转，支持跳转到自己的业务系统。如果配置为空则下课后关闭课堂页面。
     */
    public void setHomeUrl(String HomeUrl) {
        this.HomeUrl = HomeUrl;
    }

    /**
     * Get JsUrl ：自定义js。针对应用用于开发上自定义课堂界面、模块功能、监控操作，支持数据请求与响应处理。 
     * @return JsUrl JsUrl ：自定义js。针对应用用于开发上自定义课堂界面、模块功能、监控操作，支持数据请求与响应处理。
     */
    public String getJsUrl() {
        return this.JsUrl;
    }

    /**
     * Set JsUrl ：自定义js。针对应用用于开发上自定义课堂界面、模块功能、监控操作，支持数据请求与响应处理。
     * @param JsUrl JsUrl ：自定义js。针对应用用于开发上自定义课堂界面、模块功能、监控操作，支持数据请求与响应处理。
     */
    public void setJsUrl(String JsUrl) {
        this.JsUrl = JsUrl;
    }

    /**
     * Get Css : 自定义的css。针对应用用于支持课堂界面的、模块的UI渲染修改、皮肤配色修改、功能模块的隐藏和展示。 
     * @return CssUrl Css : 自定义的css。针对应用用于支持课堂界面的、模块的UI渲染修改、皮肤配色修改、功能模块的隐藏和展示。
     */
    public String getCssUrl() {
        return this.CssUrl;
    }

    /**
     * Set Css : 自定义的css。针对应用用于支持课堂界面的、模块的UI渲染修改、皮肤配色修改、功能模块的隐藏和展示。
     * @param CssUrl Css : 自定义的css。针对应用用于支持课堂界面的、模块的UI渲染修改、皮肤配色修改、功能模块的隐藏和展示。
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

