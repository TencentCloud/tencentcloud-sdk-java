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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusDynamicAPIResponseHTTP extends AbstractModel {

    /**
    * <p>HTTP 状态码</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>HTTP 响应体</p>
    */
    @SerializedName("ResponseBody")
    @Expose
    private String ResponseBody;

    /**
     * Get <p>HTTP 状态码</p> 
     * @return StatusCode <p>HTTP 状态码</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>HTTP 状态码</p>
     * @param StatusCode <p>HTTP 状态码</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>HTTP 响应体</p> 
     * @return ResponseBody <p>HTTP 响应体</p>
     */
    public String getResponseBody() {
        return this.ResponseBody;
    }

    /**
     * Set <p>HTTP 响应体</p>
     * @param ResponseBody <p>HTTP 响应体</p>
     */
    public void setResponseBody(String ResponseBody) {
        this.ResponseBody = ResponseBody;
    }

    public PrometheusDynamicAPIResponseHTTP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusDynamicAPIResponseHTTP(PrometheusDynamicAPIResponseHTTP source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ResponseBody != null) {
            this.ResponseBody = new String(source.ResponseBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ResponseBody", this.ResponseBody);

    }
}

