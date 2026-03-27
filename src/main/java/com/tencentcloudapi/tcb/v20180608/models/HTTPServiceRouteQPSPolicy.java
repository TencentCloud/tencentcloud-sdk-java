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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceRouteQPSPolicy extends AbstractModel {

    /**
    * QPS值，每秒请求次数
    */
    @SerializedName("QPSTotal")
    @Expose
    private Long QPSTotal;

    /**
    * 客户端限频配置
    */
    @SerializedName("QPSPerClient")
    @Expose
    private HTTPServiceQPSPerClient QPSPerClient;

    /**
     * Get QPS值，每秒请求次数 
     * @return QPSTotal QPS值，每秒请求次数
     */
    public Long getQPSTotal() {
        return this.QPSTotal;
    }

    /**
     * Set QPS值，每秒请求次数
     * @param QPSTotal QPS值，每秒请求次数
     */
    public void setQPSTotal(Long QPSTotal) {
        this.QPSTotal = QPSTotal;
    }

    /**
     * Get 客户端限频配置 
     * @return QPSPerClient 客户端限频配置
     */
    public HTTPServiceQPSPerClient getQPSPerClient() {
        return this.QPSPerClient;
    }

    /**
     * Set 客户端限频配置
     * @param QPSPerClient 客户端限频配置
     */
    public void setQPSPerClient(HTTPServiceQPSPerClient QPSPerClient) {
        this.QPSPerClient = QPSPerClient;
    }

    public HTTPServiceRouteQPSPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceRouteQPSPolicy(HTTPServiceRouteQPSPolicy source) {
        if (source.QPSTotal != null) {
            this.QPSTotal = new Long(source.QPSTotal);
        }
        if (source.QPSPerClient != null) {
            this.QPSPerClient = new HTTPServiceQPSPerClient(source.QPSPerClient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QPSTotal", this.QPSTotal);
        this.setParamObj(map, prefix + "QPSPerClient.", this.QPSPerClient);

    }
}

