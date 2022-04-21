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

public class HeuristicCache extends AbstractModel{

    /**
    * on 代表开启启发式缓存
off 代表关闭启发式缓存
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义启发式缓存时间配置
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
     * Get on 代表开启启发式缓存
off 代表关闭启发式缓存 
     * @return Switch on 代表开启启发式缓存
off 代表关闭启发式缓存
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on 代表开启启发式缓存
off 代表关闭启发式缓存
     * @param Switch on 代表开启启发式缓存
off 代表关闭启发式缓存
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义启发式缓存时间配置 
     * @return CacheConfig 自定义启发式缓存时间配置
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set 自定义启发式缓存时间配置
     * @param CacheConfig 自定义启发式缓存时间配置
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    public HeuristicCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeuristicCache(HeuristicCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);

    }
}

