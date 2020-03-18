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

public class Cache extends AbstractModel{

    /**
    * 缓存配置规则数组。
    */
    @SerializedName("CacheRules")
    @Expose
    private CacheRule [] CacheRules;

    /**
     * Get 缓存配置规则数组。 
     * @return CacheRules 缓存配置规则数组。
     */
    public CacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set 缓存配置规则数组。
     * @param CacheRules 缓存配置规则数组。
     */
    public void setCacheRules(CacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);

    }
}

