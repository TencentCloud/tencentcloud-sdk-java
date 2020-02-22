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

public class StatusCodeCacheRule extends AbstractModel{

    /**
    * http 状态码
支持 403、404 状态码
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * 状态码缓存过期时间，单位秒
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get http 状态码
支持 403、404 状态码 
     * @return StatusCode http 状态码
支持 403、404 状态码
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set http 状态码
支持 403、404 状态码
     * @param StatusCode http 状态码
支持 403、404 状态码
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 状态码缓存过期时间，单位秒 
     * @return CacheTime 状态码缓存过期时间，单位秒
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 状态码缓存过期时间，单位秒
     * @param CacheTime 状态码缓存过期时间，单位秒
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

