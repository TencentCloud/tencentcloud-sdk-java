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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptTokensDetails extends AbstractModel {

    /**
    * 缓存 token 的数量。
    */
    @SerializedName("CachedTokens")
    @Expose
    private String CachedTokens;

    /**
     * Get 缓存 token 的数量。 
     * @return CachedTokens 缓存 token 的数量。
     */
    public String getCachedTokens() {
        return this.CachedTokens;
    }

    /**
     * Set 缓存 token 的数量。
     * @param CachedTokens 缓存 token 的数量。
     */
    public void setCachedTokens(String CachedTokens) {
        this.CachedTokens = CachedTokens;
    }

    public PromptTokensDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTokensDetails(PromptTokensDetails source) {
        if (source.CachedTokens != null) {
            this.CachedTokens = new String(source.CachedTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CachedTokens", this.CachedTokens);

    }
}

