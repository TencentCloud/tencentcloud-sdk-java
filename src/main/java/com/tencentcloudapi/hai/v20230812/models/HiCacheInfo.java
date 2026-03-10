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

public class HiCacheInfo extends AbstractModel {

    /**
    * HiCache缓存等级
    */
    @SerializedName("HiCacheLevel")
    @Expose
    private String HiCacheLevel;

    /**
     * Get HiCache缓存等级 
     * @return HiCacheLevel HiCache缓存等级
     */
    public String getHiCacheLevel() {
        return this.HiCacheLevel;
    }

    /**
     * Set HiCache缓存等级
     * @param HiCacheLevel HiCache缓存等级
     */
    public void setHiCacheLevel(String HiCacheLevel) {
        this.HiCacheLevel = HiCacheLevel;
    }

    public HiCacheInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiCacheInfo(HiCacheInfo source) {
        if (source.HiCacheLevel != null) {
            this.HiCacheLevel = new String(source.HiCacheLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HiCacheLevel", this.HiCacheLevel);

    }
}

