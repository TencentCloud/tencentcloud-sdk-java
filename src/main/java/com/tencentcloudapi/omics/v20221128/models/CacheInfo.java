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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheInfo extends AbstractModel {

    /**
    * 缓存清理时间(小时)。
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * 缓存清理计划时间。
    */
    @SerializedName("CacheClearTime")
    @Expose
    private String CacheClearTime;

    /**
    * 缓存是否已被清理。
    */
    @SerializedName("CacheCleared")
    @Expose
    private Boolean CacheCleared;

    /**
     * Get 缓存清理时间(小时)。 
     * @return CacheClearDelay 缓存清理时间(小时)。
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set 缓存清理时间(小时)。
     * @param CacheClearDelay 缓存清理时间(小时)。
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get 缓存清理计划时间。 
     * @return CacheClearTime 缓存清理计划时间。
     */
    public String getCacheClearTime() {
        return this.CacheClearTime;
    }

    /**
     * Set 缓存清理计划时间。
     * @param CacheClearTime 缓存清理计划时间。
     */
    public void setCacheClearTime(String CacheClearTime) {
        this.CacheClearTime = CacheClearTime;
    }

    /**
     * Get 缓存是否已被清理。 
     * @return CacheCleared 缓存是否已被清理。
     */
    public Boolean getCacheCleared() {
        return this.CacheCleared;
    }

    /**
     * Set 缓存是否已被清理。
     * @param CacheCleared 缓存是否已被清理。
     */
    public void setCacheCleared(Boolean CacheCleared) {
        this.CacheCleared = CacheCleared;
    }

    public CacheInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheInfo(CacheInfo source) {
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.CacheClearTime != null) {
            this.CacheClearTime = new String(source.CacheClearTime);
        }
        if (source.CacheCleared != null) {
            this.CacheCleared = new Boolean(source.CacheCleared);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamSimple(map, prefix + "CacheClearTime", this.CacheClearTime);
        this.setParamSimple(map, prefix + "CacheCleared", this.CacheCleared);

    }
}

