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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlDetectResult extends AbstractModel {

    /**
    * <p>命中的恶意URL列表</p>
    */
    @SerializedName("HitUrls")
    @Expose
    private UrlHitInfo [] HitUrls;

    /**
     * Get <p>命中的恶意URL列表</p> 
     * @return HitUrls <p>命中的恶意URL列表</p>
     */
    public UrlHitInfo [] getHitUrls() {
        return this.HitUrls;
    }

    /**
     * Set <p>命中的恶意URL列表</p>
     * @param HitUrls <p>命中的恶意URL列表</p>
     */
    public void setHitUrls(UrlHitInfo [] HitUrls) {
        this.HitUrls = HitUrls;
    }

    public UrlDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlDetectResult(UrlDetectResult source) {
        if (source.HitUrls != null) {
            this.HitUrls = new UrlHitInfo[source.HitUrls.length];
            for (int i = 0; i < source.HitUrls.length; i++) {
                this.HitUrls[i] = new UrlHitInfo(source.HitUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HitUrls.", this.HitUrls);

    }
}

