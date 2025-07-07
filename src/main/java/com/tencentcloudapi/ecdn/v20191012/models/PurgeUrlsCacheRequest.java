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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeUrlsCacheRequest extends AbstractModel {

    /**
    * 要刷新的Url列表，必须包含协议头部。
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
     * Get 要刷新的Url列表，必须包含协议头部。 
     * @return Urls 要刷新的Url列表，必须包含协议头部。
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 要刷新的Url列表，必须包含协议头部。
     * @param Urls 要刷新的Url列表，必须包含协议头部。
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    public PurgeUrlsCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeUrlsCacheRequest(PurgeUrlsCacheRequest source) {
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);

    }
}

