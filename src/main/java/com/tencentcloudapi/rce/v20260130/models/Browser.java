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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Browser extends AbstractModel {

    /**
    * <p>与网站交互的浏览器的用户代理</p>
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * <p>浏览器支持的用户请求语言</p><p>参数格式：符合ISO 3166标准</p>
    */
    @SerializedName("AcceptLanguage")
    @Expose
    private String AcceptLanguage;

    /**
    * <p>浏览器当前网站内容的语言</p><p>参数格式：符合ISO 3166标准</p>
    */
    @SerializedName("ContentLanguage")
    @Expose
    private String ContentLanguage;

    /**
     * Get <p>与网站交互的浏览器的用户代理</p> 
     * @return UserAgent <p>与网站交互的浏览器的用户代理</p>
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set <p>与网站交互的浏览器的用户代理</p>
     * @param UserAgent <p>与网站交互的浏览器的用户代理</p>
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get <p>浏览器支持的用户请求语言</p><p>参数格式：符合ISO 3166标准</p> 
     * @return AcceptLanguage <p>浏览器支持的用户请求语言</p><p>参数格式：符合ISO 3166标准</p>
     */
    public String getAcceptLanguage() {
        return this.AcceptLanguage;
    }

    /**
     * Set <p>浏览器支持的用户请求语言</p><p>参数格式：符合ISO 3166标准</p>
     * @param AcceptLanguage <p>浏览器支持的用户请求语言</p><p>参数格式：符合ISO 3166标准</p>
     */
    public void setAcceptLanguage(String AcceptLanguage) {
        this.AcceptLanguage = AcceptLanguage;
    }

    /**
     * Get <p>浏览器当前网站内容的语言</p><p>参数格式：符合ISO 3166标准</p> 
     * @return ContentLanguage <p>浏览器当前网站内容的语言</p><p>参数格式：符合ISO 3166标准</p>
     */
    public String getContentLanguage() {
        return this.ContentLanguage;
    }

    /**
     * Set <p>浏览器当前网站内容的语言</p><p>参数格式：符合ISO 3166标准</p>
     * @param ContentLanguage <p>浏览器当前网站内容的语言</p><p>参数格式：符合ISO 3166标准</p>
     */
    public void setContentLanguage(String ContentLanguage) {
        this.ContentLanguage = ContentLanguage;
    }

    public Browser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Browser(Browser source) {
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.AcceptLanguage != null) {
            this.AcceptLanguage = new String(source.AcceptLanguage);
        }
        if (source.ContentLanguage != null) {
            this.ContentLanguage = new String(source.ContentLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "AcceptLanguage", this.AcceptLanguage);
        this.setParamSimple(map, prefix + "ContentLanguage", this.ContentLanguage);

    }
}

