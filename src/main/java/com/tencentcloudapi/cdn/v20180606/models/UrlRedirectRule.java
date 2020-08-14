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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlRedirectRule extends AbstractModel{

    /**
    * 重定向状态码，301 | 302
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
    * 待匹配的Url模式，支持完全路径匹配和正则匹配，最大长度1024字符。
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 目标URL，必须以“/”开头，最大长度1024字符。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get 重定向状态码，301 | 302 
     * @return RedirectStatusCode 重定向状态码，301 | 302
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set 重定向状态码，301 | 302
     * @param RedirectStatusCode 重定向状态码，301 | 302
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Get 待匹配的Url模式，支持完全路径匹配和正则匹配，最大长度1024字符。 
     * @return Pattern 待匹配的Url模式，支持完全路径匹配和正则匹配，最大长度1024字符。
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 待匹配的Url模式，支持完全路径匹配和正则匹配，最大长度1024字符。
     * @param Pattern 待匹配的Url模式，支持完全路径匹配和正则匹配，最大长度1024字符。
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 目标URL，必须以“/”开头，最大长度1024字符。 
     * @return RedirectUrl 目标URL，必须以“/”开头，最大长度1024字符。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 目标URL，必须以“/”开头，最大长度1024字符。
     * @param RedirectUrl 目标URL，必须以“/”开头，最大长度1024字符。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

