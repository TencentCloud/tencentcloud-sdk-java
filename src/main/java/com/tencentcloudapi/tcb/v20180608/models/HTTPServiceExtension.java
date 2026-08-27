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

public class HTTPServiceExtension extends AbstractModel {

    /**
    * <p>添加请求头列表</p>
    */
    @SerializedName("HeadersHandler")
    @Expose
    private HTTPServiceHeadersHandler HeadersHandler;

    /**
    * <p>HTTPService 缓存配置，包含Cache 节点缓存 / MaxAge 浏览器缓存 / CacheKey 自定义缓存键</p>
    */
    @SerializedName("Cache")
    @Expose
    private HTTPServiceCacheSet Cache;

    /**
     * Get <p>添加请求头列表</p> 
     * @return HeadersHandler <p>添加请求头列表</p>
     */
    public HTTPServiceHeadersHandler getHeadersHandler() {
        return this.HeadersHandler;
    }

    /**
     * Set <p>添加请求头列表</p>
     * @param HeadersHandler <p>添加请求头列表</p>
     */
    public void setHeadersHandler(HTTPServiceHeadersHandler HeadersHandler) {
        this.HeadersHandler = HeadersHandler;
    }

    /**
     * Get <p>HTTPService 缓存配置，包含Cache 节点缓存 / MaxAge 浏览器缓存 / CacheKey 自定义缓存键</p> 
     * @return Cache <p>HTTPService 缓存配置，包含Cache 节点缓存 / MaxAge 浏览器缓存 / CacheKey 自定义缓存键</p>
     */
    public HTTPServiceCacheSet getCache() {
        return this.Cache;
    }

    /**
     * Set <p>HTTPService 缓存配置，包含Cache 节点缓存 / MaxAge 浏览器缓存 / CacheKey 自定义缓存键</p>
     * @param Cache <p>HTTPService 缓存配置，包含Cache 节点缓存 / MaxAge 浏览器缓存 / CacheKey 自定义缓存键</p>
     */
    public void setCache(HTTPServiceCacheSet Cache) {
        this.Cache = Cache;
    }

    public HTTPServiceExtension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceExtension(HTTPServiceExtension source) {
        if (source.HeadersHandler != null) {
            this.HeadersHandler = new HTTPServiceHeadersHandler(source.HeadersHandler);
        }
        if (source.Cache != null) {
            this.Cache = new HTTPServiceCacheSet(source.Cache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadersHandler.", this.HeadersHandler);
        this.setParamObj(map, prefix + "Cache.", this.Cache);

    }
}

