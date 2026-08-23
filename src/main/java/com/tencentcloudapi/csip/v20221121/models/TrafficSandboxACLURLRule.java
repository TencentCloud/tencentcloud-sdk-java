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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxACLURLRule extends AbstractModel {

    /**
    * URL 列表
入参限制：每项支持域名通配符，如 *.example.com、api.*.example.com、example.com/api/*
    */
    @SerializedName("URL")
    @Expose
    private String [] URL;

    /**
    * 排除的 URL 列表
入参限制：格式同 URL
    */
    @SerializedName("URLExcept")
    @Expose
    private String [] URLExcept;

    /**
    * 协议类型列表
枚举值：
http：HTTP 协议
https：HTTPS 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String [] Protocol;

    /**
    * HTTP 方法列表
枚举值：
GET
POST
HEAD
PUT
DELETE
OPTIONS
PATCH
    */
    @SerializedName("Method")
    @Expose
    private String [] Method;

    /**
     * Get URL 列表
入参限制：每项支持域名通配符，如 *.example.com、api.*.example.com、example.com/api/* 
     * @return URL URL 列表
入参限制：每项支持域名通配符，如 *.example.com、api.*.example.com、example.com/api/*
     */
    public String [] getURL() {
        return this.URL;
    }

    /**
     * Set URL 列表
入参限制：每项支持域名通配符，如 *.example.com、api.*.example.com、example.com/api/*
     * @param URL URL 列表
入参限制：每项支持域名通配符，如 *.example.com、api.*.example.com、example.com/api/*
     */
    public void setURL(String [] URL) {
        this.URL = URL;
    }

    /**
     * Get 排除的 URL 列表
入参限制：格式同 URL 
     * @return URLExcept 排除的 URL 列表
入参限制：格式同 URL
     */
    public String [] getURLExcept() {
        return this.URLExcept;
    }

    /**
     * Set 排除的 URL 列表
入参限制：格式同 URL
     * @param URLExcept 排除的 URL 列表
入参限制：格式同 URL
     */
    public void setURLExcept(String [] URLExcept) {
        this.URLExcept = URLExcept;
    }

    /**
     * Get 协议类型列表
枚举值：
http：HTTP 协议
https：HTTPS 协议 
     * @return Protocol 协议类型列表
枚举值：
http：HTTP 协议
https：HTTPS 协议
     */
    public String [] getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型列表
枚举值：
http：HTTP 协议
https：HTTPS 协议
     * @param Protocol 协议类型列表
枚举值：
http：HTTP 协议
https：HTTPS 协议
     */
    public void setProtocol(String [] Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get HTTP 方法列表
枚举值：
GET
POST
HEAD
PUT
DELETE
OPTIONS
PATCH 
     * @return Method HTTP 方法列表
枚举值：
GET
POST
HEAD
PUT
DELETE
OPTIONS
PATCH
     */
    public String [] getMethod() {
        return this.Method;
    }

    /**
     * Set HTTP 方法列表
枚举值：
GET
POST
HEAD
PUT
DELETE
OPTIONS
PATCH
     * @param Method HTTP 方法列表
枚举值：
GET
POST
HEAD
PUT
DELETE
OPTIONS
PATCH
     */
    public void setMethod(String [] Method) {
        this.Method = Method;
    }

    public TrafficSandboxACLURLRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLURLRule(TrafficSandboxACLURLRule source) {
        if (source.URL != null) {
            this.URL = new String[source.URL.length];
            for (int i = 0; i < source.URL.length; i++) {
                this.URL[i] = new String(source.URL[i]);
            }
        }
        if (source.URLExcept != null) {
            this.URLExcept = new String[source.URLExcept.length];
            for (int i = 0; i < source.URLExcept.length; i++) {
                this.URLExcept[i] = new String(source.URLExcept[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String[source.Protocol.length];
            for (int i = 0; i < source.Protocol.length; i++) {
                this.Protocol[i] = new String(source.Protocol[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new String(source.Method[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "URL.", this.URL);
        this.setParamArraySimple(map, prefix + "URLExcept.", this.URLExcept);
        this.setParamArraySimple(map, prefix + "Protocol.", this.Protocol);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);

    }
}

