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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBucketCORSOptRequest extends AbstractModel{

    /**
    * 允许的访问来源;具体参见 [cos文档](https://cloud.tencent.com/document/product/436/8279)
    */
    @SerializedName("AllowedOrigins")
    @Expose
    private String [] AllowedOrigins;

    /**
    * 允许的 HTTP 操作方法;可以配置多个:PUT、GET、POST、HEAD。[cos文档](https://cloud.tencent.com/document/product/436/8279)
    */
    @SerializedName("AllowedMethods")
    @Expose
    private String [] AllowedMethods;

    /**
    * 用于指定允许浏览器发送 CORS 请求时携带的自定义 HTTP 请求头部;可以配置*，代表允许所有头部，为了避免遗漏，推荐配置为*。[cos文档](https://cloud.tencent.com/document/product/436/8279)
    */
    @SerializedName("AllowedHeaders")
    @Expose
    private String [] AllowedHeaders;

    /**
    * 跨域资源共享配置的有效时间，单位为秒。[cos文档](https://cloud.tencent.com/document/product/436/8279)
    */
    @SerializedName("MaxAgeSeconds")
    @Expose
    private Long MaxAgeSeconds;

    /**
    * 允许浏览器获取的 CORS 请求响应中的头部，不区分大小写；默认情况下浏览器只能访问简单响应头部：Cache-Control、Content-Type、Expires、Last-Modified，如果需要访问其他响应头部，需要添加 ExposeHeader 配置。[cos文档](https://cloud.tencent.com/document/product/436/8279)
    */
    @SerializedName("ExposeHeaders")
    @Expose
    private String [] ExposeHeaders;

    /**
     * Get 允许的访问来源;具体参见 [cos文档](https://cloud.tencent.com/document/product/436/8279) 
     * @return AllowedOrigins 允许的访问来源;具体参见 [cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public String [] getAllowedOrigins() {
        return this.AllowedOrigins;
    }

    /**
     * Set 允许的访问来源;具体参见 [cos文档](https://cloud.tencent.com/document/product/436/8279)
     * @param AllowedOrigins 允许的访问来源;具体参见 [cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public void setAllowedOrigins(String [] AllowedOrigins) {
        this.AllowedOrigins = AllowedOrigins;
    }

    /**
     * Get 允许的 HTTP 操作方法;可以配置多个:PUT、GET、POST、HEAD。[cos文档](https://cloud.tencent.com/document/product/436/8279) 
     * @return AllowedMethods 允许的 HTTP 操作方法;可以配置多个:PUT、GET、POST、HEAD。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public String [] getAllowedMethods() {
        return this.AllowedMethods;
    }

    /**
     * Set 允许的 HTTP 操作方法;可以配置多个:PUT、GET、POST、HEAD。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     * @param AllowedMethods 允许的 HTTP 操作方法;可以配置多个:PUT、GET、POST、HEAD。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public void setAllowedMethods(String [] AllowedMethods) {
        this.AllowedMethods = AllowedMethods;
    }

    /**
     * Get 用于指定允许浏览器发送 CORS 请求时携带的自定义 HTTP 请求头部;可以配置*，代表允许所有头部，为了避免遗漏，推荐配置为*。[cos文档](https://cloud.tencent.com/document/product/436/8279) 
     * @return AllowedHeaders 用于指定允许浏览器发送 CORS 请求时携带的自定义 HTTP 请求头部;可以配置*，代表允许所有头部，为了避免遗漏，推荐配置为*。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public String [] getAllowedHeaders() {
        return this.AllowedHeaders;
    }

    /**
     * Set 用于指定允许浏览器发送 CORS 请求时携带的自定义 HTTP 请求头部;可以配置*，代表允许所有头部，为了避免遗漏，推荐配置为*。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     * @param AllowedHeaders 用于指定允许浏览器发送 CORS 请求时携带的自定义 HTTP 请求头部;可以配置*，代表允许所有头部，为了避免遗漏，推荐配置为*。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public void setAllowedHeaders(String [] AllowedHeaders) {
        this.AllowedHeaders = AllowedHeaders;
    }

    /**
     * Get 跨域资源共享配置的有效时间，单位为秒。[cos文档](https://cloud.tencent.com/document/product/436/8279) 
     * @return MaxAgeSeconds 跨域资源共享配置的有效时间，单位为秒。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public Long getMaxAgeSeconds() {
        return this.MaxAgeSeconds;
    }

    /**
     * Set 跨域资源共享配置的有效时间，单位为秒。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     * @param MaxAgeSeconds 跨域资源共享配置的有效时间，单位为秒。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public void setMaxAgeSeconds(Long MaxAgeSeconds) {
        this.MaxAgeSeconds = MaxAgeSeconds;
    }

    /**
     * Get 允许浏览器获取的 CORS 请求响应中的头部，不区分大小写；默认情况下浏览器只能访问简单响应头部：Cache-Control、Content-Type、Expires、Last-Modified，如果需要访问其他响应头部，需要添加 ExposeHeader 配置。[cos文档](https://cloud.tencent.com/document/product/436/8279) 
     * @return ExposeHeaders 允许浏览器获取的 CORS 请求响应中的头部，不区分大小写；默认情况下浏览器只能访问简单响应头部：Cache-Control、Content-Type、Expires、Last-Modified，如果需要访问其他响应头部，需要添加 ExposeHeader 配置。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public String [] getExposeHeaders() {
        return this.ExposeHeaders;
    }

    /**
     * Set 允许浏览器获取的 CORS 请求响应中的头部，不区分大小写；默认情况下浏览器只能访问简单响应头部：Cache-Control、Content-Type、Expires、Last-Modified，如果需要访问其他响应头部，需要添加 ExposeHeader 配置。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     * @param ExposeHeaders 允许浏览器获取的 CORS 请求响应中的头部，不区分大小写；默认情况下浏览器只能访问简单响应头部：Cache-Control、Content-Type、Expires、Last-Modified，如果需要访问其他响应头部，需要添加 ExposeHeader 配置。[cos文档](https://cloud.tencent.com/document/product/436/8279)
     */
    public void setExposeHeaders(String [] ExposeHeaders) {
        this.ExposeHeaders = ExposeHeaders;
    }

    public UpdateBucketCORSOptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBucketCORSOptRequest(UpdateBucketCORSOptRequest source) {
        if (source.AllowedOrigins != null) {
            this.AllowedOrigins = new String[source.AllowedOrigins.length];
            for (int i = 0; i < source.AllowedOrigins.length; i++) {
                this.AllowedOrigins[i] = new String(source.AllowedOrigins[i]);
            }
        }
        if (source.AllowedMethods != null) {
            this.AllowedMethods = new String[source.AllowedMethods.length];
            for (int i = 0; i < source.AllowedMethods.length; i++) {
                this.AllowedMethods[i] = new String(source.AllowedMethods[i]);
            }
        }
        if (source.AllowedHeaders != null) {
            this.AllowedHeaders = new String[source.AllowedHeaders.length];
            for (int i = 0; i < source.AllowedHeaders.length; i++) {
                this.AllowedHeaders[i] = new String(source.AllowedHeaders[i]);
            }
        }
        if (source.MaxAgeSeconds != null) {
            this.MaxAgeSeconds = new Long(source.MaxAgeSeconds);
        }
        if (source.ExposeHeaders != null) {
            this.ExposeHeaders = new String[source.ExposeHeaders.length];
            for (int i = 0; i < source.ExposeHeaders.length; i++) {
                this.ExposeHeaders[i] = new String(source.ExposeHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllowedOrigins.", this.AllowedOrigins);
        this.setParamArraySimple(map, prefix + "AllowedMethods.", this.AllowedMethods);
        this.setParamArraySimple(map, prefix + "AllowedHeaders.", this.AllowedHeaders);
        this.setParamSimple(map, prefix + "MaxAgeSeconds", this.MaxAgeSeconds);
        this.setParamArraySimple(map, prefix + "ExposeHeaders.", this.ExposeHeaders);

    }
}

