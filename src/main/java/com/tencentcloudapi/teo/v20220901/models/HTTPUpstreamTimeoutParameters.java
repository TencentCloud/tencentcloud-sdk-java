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

public class HTTPUpstreamTimeoutParameters extends AbstractModel {

    /**
    * HTTP 应答超时时间，单位为秒，取值：5～600。
    */
    @SerializedName("ResponseTimeout")
    @Expose
    private Long ResponseTimeout;

    /**
     * Get HTTP 应答超时时间，单位为秒，取值：5～600。 
     * @return ResponseTimeout HTTP 应答超时时间，单位为秒，取值：5～600。
     */
    public Long getResponseTimeout() {
        return this.ResponseTimeout;
    }

    /**
     * Set HTTP 应答超时时间，单位为秒，取值：5～600。
     * @param ResponseTimeout HTTP 应答超时时间，单位为秒，取值：5～600。
     */
    public void setResponseTimeout(Long ResponseTimeout) {
        this.ResponseTimeout = ResponseTimeout;
    }

    public HTTPUpstreamTimeoutParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPUpstreamTimeoutParameters(HTTPUpstreamTimeoutParameters source) {
        if (source.ResponseTimeout != null) {
            this.ResponseTimeout = new Long(source.ResponseTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResponseTimeout", this.ResponseTimeout);

    }
}

