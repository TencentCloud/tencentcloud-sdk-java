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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FixedResponseInfo extends AbstractModel {

    /**
    * 返回的HTTP响应码，支持 2xx、4xx、5xx。
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * 返回的固定内容。只支持 ASCII 字符，最大1KB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 返回固定内容的格式。
取值：text/plain、text/css、text/html、application/javascript或application/json。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
     * Get 返回的HTTP响应码，支持 2xx、4xx、5xx。 
     * @return HttpCode 返回的HTTP响应码，支持 2xx、4xx、5xx。
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set 返回的HTTP响应码，支持 2xx、4xx、5xx。
     * @param HttpCode 返回的HTTP响应码，支持 2xx、4xx、5xx。
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get 返回的固定内容。只支持 ASCII 字符，最大1KB。 
     * @return Content 返回的固定内容。只支持 ASCII 字符，最大1KB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 返回的固定内容。只支持 ASCII 字符，最大1KB。
     * @param Content 返回的固定内容。只支持 ASCII 字符，最大1KB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 返回固定内容的格式。
取值：text/plain、text/css、text/html、application/javascript或application/json。 
     * @return ContentType 返回固定内容的格式。
取值：text/plain、text/css、text/html、application/javascript或application/json。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 返回固定内容的格式。
取值：text/plain、text/css、text/html、application/javascript或application/json。
     * @param ContentType 返回固定内容的格式。
取值：text/plain、text/css、text/html、application/javascript或application/json。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    public FixedResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FixedResponseInfo(FixedResponseInfo source) {
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

