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

public class SiteFailoverParameters extends AbstractModel {

    /**
    * 源站故障转移条件状态码。当源站返回的响应状态码命中本字段返回时，才会按照SiteFailoverParams执行源站转移。该参数取值为 4xx、5xx 之一。
    */
    @SerializedName("SiteFailoverStatusCodes")
    @Expose
    private Long [] SiteFailoverStatusCodes;

    /**
    * 源站故障转移配置参数列表。最小长度为1，最大长度为2。
    */
    @SerializedName("SiteFailoverParams")
    @Expose
    private SiteFailover [] SiteFailoverParams;

    /**
     * Get 源站故障转移条件状态码。当源站返回的响应状态码命中本字段返回时，才会按照SiteFailoverParams执行源站转移。该参数取值为 4xx、5xx 之一。 
     * @return SiteFailoverStatusCodes 源站故障转移条件状态码。当源站返回的响应状态码命中本字段返回时，才会按照SiteFailoverParams执行源站转移。该参数取值为 4xx、5xx 之一。
     */
    public Long [] getSiteFailoverStatusCodes() {
        return this.SiteFailoverStatusCodes;
    }

    /**
     * Set 源站故障转移条件状态码。当源站返回的响应状态码命中本字段返回时，才会按照SiteFailoverParams执行源站转移。该参数取值为 4xx、5xx 之一。
     * @param SiteFailoverStatusCodes 源站故障转移条件状态码。当源站返回的响应状态码命中本字段返回时，才会按照SiteFailoverParams执行源站转移。该参数取值为 4xx、5xx 之一。
     */
    public void setSiteFailoverStatusCodes(Long [] SiteFailoverStatusCodes) {
        this.SiteFailoverStatusCodes = SiteFailoverStatusCodes;
    }

    /**
     * Get 源站故障转移配置参数列表。最小长度为1，最大长度为2。 
     * @return SiteFailoverParams 源站故障转移配置参数列表。最小长度为1，最大长度为2。
     */
    public SiteFailover [] getSiteFailoverParams() {
        return this.SiteFailoverParams;
    }

    /**
     * Set 源站故障转移配置参数列表。最小长度为1，最大长度为2。
     * @param SiteFailoverParams 源站故障转移配置参数列表。最小长度为1，最大长度为2。
     */
    public void setSiteFailoverParams(SiteFailover [] SiteFailoverParams) {
        this.SiteFailoverParams = SiteFailoverParams;
    }

    public SiteFailoverParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SiteFailoverParameters(SiteFailoverParameters source) {
        if (source.SiteFailoverStatusCodes != null) {
            this.SiteFailoverStatusCodes = new Long[source.SiteFailoverStatusCodes.length];
            for (int i = 0; i < source.SiteFailoverStatusCodes.length; i++) {
                this.SiteFailoverStatusCodes[i] = new Long(source.SiteFailoverStatusCodes[i]);
            }
        }
        if (source.SiteFailoverParams != null) {
            this.SiteFailoverParams = new SiteFailover[source.SiteFailoverParams.length];
            for (int i = 0; i < source.SiteFailoverParams.length; i++) {
                this.SiteFailoverParams[i] = new SiteFailover(source.SiteFailoverParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SiteFailoverStatusCodes.", this.SiteFailoverStatusCodes);
        this.setParamArrayObj(map, prefix + "SiteFailoverParams.", this.SiteFailoverParams);

    }
}

