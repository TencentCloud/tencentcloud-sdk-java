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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HyperParam extends AbstractModel {

    /**
    * HiCache缓存
    */
    @SerializedName("HiCache")
    @Expose
    private HiCacheInfo HiCache;

    /**
     * Get HiCache缓存 
     * @return HiCache HiCache缓存
     */
    public HiCacheInfo getHiCache() {
        return this.HiCache;
    }

    /**
     * Set HiCache缓存
     * @param HiCache HiCache缓存
     */
    public void setHiCache(HiCacheInfo HiCache) {
        this.HiCache = HiCache;
    }

    public HyperParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HyperParam(HyperParam source) {
        if (source.HiCache != null) {
            this.HiCache = new HiCacheInfo(source.HiCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HiCache.", this.HiCache);

    }
}

