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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorPage extends AbstractModel {

    /**
    * 状态码。支持范围为 400、403、404、405、414、416、451、500、501、502、503、504。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 重定向 URL，需要为完整跳转路径，如 https://www.test.com/error.html。
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
     * Get 状态码。支持范围为 400、403、404、405、414、416、451、500、501、502、503、504。 
     * @return StatusCode 状态码。支持范围为 400、403、404、405、414、416、451、500、501、502、503、504。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 状态码。支持范围为 400、403、404、405、414、416、451、500、501、502、503、504。
     * @param StatusCode 状态码。支持范围为 400、403、404、405、414、416、451、500、501、502、503、504。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 重定向 URL，需要为完整跳转路径，如 https://www.test.com/error.html。 
     * @return RedirectURL 重定向 URL，需要为完整跳转路径，如 https://www.test.com/error.html。
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set 重定向 URL，需要为完整跳转路径，如 https://www.test.com/error.html。
     * @param RedirectURL 重定向 URL，需要为完整跳转路径，如 https://www.test.com/error.html。
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
    }

    public ErrorPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorPage(ErrorPage source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.RedirectURL != null) {
            this.RedirectURL = new String(source.RedirectURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "RedirectURL", this.RedirectURL);

    }
}

