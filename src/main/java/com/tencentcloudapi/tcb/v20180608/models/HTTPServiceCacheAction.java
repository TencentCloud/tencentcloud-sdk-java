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

public class HTTPServiceCacheAction extends AbstractModel {

    /**
    * <p>HTTPService 缓存动作类型</p><p>枚举值：</p><ul><li>Cache： 节点缓存 + 浏览器缓存统一动作（节点秒数 CacheTime、浏览器秒数 MaxAgeTime）</li><li>CacheKey： 仅开启EO边缘加速通道下发</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>节点缓存配置。Type=Cache 时必填</p>
    */
    @SerializedName("Cache")
    @Expose
    private HTTPServiceCacheParams Cache;

    /**
    * <p>自定义缓存键。Type=CacheKey 时必填</p>
    */
    @SerializedName("CacheKey")
    @Expose
    private HTTPServiceCacheKeyParams CacheKey;

    /**
     * Get <p>HTTPService 缓存动作类型</p><p>枚举值：</p><ul><li>Cache： 节点缓存 + 浏览器缓存统一动作（节点秒数 CacheTime、浏览器秒数 MaxAgeTime）</li><li>CacheKey： 仅开启EO边缘加速通道下发</li></ul> 
     * @return Type <p>HTTPService 缓存动作类型</p><p>枚举值：</p><ul><li>Cache： 节点缓存 + 浏览器缓存统一动作（节点秒数 CacheTime、浏览器秒数 MaxAgeTime）</li><li>CacheKey： 仅开启EO边缘加速通道下发</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>HTTPService 缓存动作类型</p><p>枚举值：</p><ul><li>Cache： 节点缓存 + 浏览器缓存统一动作（节点秒数 CacheTime、浏览器秒数 MaxAgeTime）</li><li>CacheKey： 仅开启EO边缘加速通道下发</li></ul>
     * @param Type <p>HTTPService 缓存动作类型</p><p>枚举值：</p><ul><li>Cache： 节点缓存 + 浏览器缓存统一动作（节点秒数 CacheTime、浏览器秒数 MaxAgeTime）</li><li>CacheKey： 仅开启EO边缘加速通道下发</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>节点缓存配置。Type=Cache 时必填</p> 
     * @return Cache <p>节点缓存配置。Type=Cache 时必填</p>
     */
    public HTTPServiceCacheParams getCache() {
        return this.Cache;
    }

    /**
     * Set <p>节点缓存配置。Type=Cache 时必填</p>
     * @param Cache <p>节点缓存配置。Type=Cache 时必填</p>
     */
    public void setCache(HTTPServiceCacheParams Cache) {
        this.Cache = Cache;
    }

    /**
     * Get <p>自定义缓存键。Type=CacheKey 时必填</p> 
     * @return CacheKey <p>自定义缓存键。Type=CacheKey 时必填</p>
     */
    public HTTPServiceCacheKeyParams getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set <p>自定义缓存键。Type=CacheKey 时必填</p>
     * @param CacheKey <p>自定义缓存键。Type=CacheKey 时必填</p>
     */
    public void setCacheKey(HTTPServiceCacheKeyParams CacheKey) {
        this.CacheKey = CacheKey;
    }

    public HTTPServiceCacheAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCacheAction(HTTPServiceCacheAction source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Cache != null) {
            this.Cache = new HTTPServiceCacheParams(source.Cache);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new HTTPServiceCacheKeyParams(source.CacheKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);

    }
}

