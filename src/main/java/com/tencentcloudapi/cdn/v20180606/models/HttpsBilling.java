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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpsBilling extends AbstractModel {

    /**
    * HTTPS服务配置开关，取值有：
on：开启，缺省时默认开启，会产生计费
off：关闭，拦截https请求

    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get HTTPS服务配置开关，取值有：
on：开启，缺省时默认开启，会产生计费
off：关闭，拦截https请求
 
     * @return Switch HTTPS服务配置开关，取值有：
on：开启，缺省时默认开启，会产生计费
off：关闭，拦截https请求

     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set HTTPS服务配置开关，取值有：
on：开启，缺省时默认开启，会产生计费
off：关闭，拦截https请求

     * @param Switch HTTPS服务配置开关，取值有：
on：开启，缺省时默认开启，会产生计费
off：关闭，拦截https请求

     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public HttpsBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpsBilling(HttpsBilling source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

