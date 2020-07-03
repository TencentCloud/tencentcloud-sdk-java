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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheRule extends AbstractModel{

    /**
    * 缓存类型，支持all，file，directory，path，index，分别表示全部文件，后缀类型，目录，完整路径，首页。
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * 缓存内容列表。
    */
    @SerializedName("CacheContents")
    @Expose
    private String [] CacheContents;

    /**
    * 缓存时间，单位秒。
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get 缓存类型，支持all，file，directory，path，index，分别表示全部文件，后缀类型，目录，完整路径，首页。 
     * @return CacheType 缓存类型，支持all，file，directory，path，index，分别表示全部文件，后缀类型，目录，完整路径，首页。
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set 缓存类型，支持all，file，directory，path，index，分别表示全部文件，后缀类型，目录，完整路径，首页。
     * @param CacheType 缓存类型，支持all，file，directory，path，index，分别表示全部文件，后缀类型，目录，完整路径，首页。
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get 缓存内容列表。 
     * @return CacheContents 缓存内容列表。
     */
    public String [] getCacheContents() {
        return this.CacheContents;
    }

    /**
     * Set 缓存内容列表。
     * @param CacheContents 缓存内容列表。
     */
    public void setCacheContents(String [] CacheContents) {
        this.CacheContents = CacheContents;
    }

    /**
     * Get 缓存时间，单位秒。 
     * @return CacheTime 缓存时间，单位秒。
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 缓存时间，单位秒。
     * @param CacheTime 缓存时间，单位秒。
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamArraySimple(map, prefix + "CacheContents.", this.CacheContents);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

