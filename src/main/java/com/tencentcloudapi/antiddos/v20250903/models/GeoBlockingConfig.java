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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeoBlockingConfig extends AbstractModel {

    /**
    * <p>封禁地域列表。采用<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"> ISO 3166-1 alpha-2 </a>标准的两字代码。</p>
    */
    @SerializedName("GeoCode")
    @Expose
    private String [] GeoCode;

    /**
     * Get <p>封禁地域列表。采用<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"> ISO 3166-1 alpha-2 </a>标准的两字代码。</p> 
     * @return GeoCode <p>封禁地域列表。采用<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"> ISO 3166-1 alpha-2 </a>标准的两字代码。</p>
     */
    public String [] getGeoCode() {
        return this.GeoCode;
    }

    /**
     * Set <p>封禁地域列表。采用<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"> ISO 3166-1 alpha-2 </a>标准的两字代码。</p>
     * @param GeoCode <p>封禁地域列表。采用<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"> ISO 3166-1 alpha-2 </a>标准的两字代码。</p>
     */
    public void setGeoCode(String [] GeoCode) {
        this.GeoCode = GeoCode;
    }

    public GeoBlockingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeoBlockingConfig(GeoBlockingConfig source) {
        if (source.GeoCode != null) {
            this.GeoCode = new String[source.GeoCode.length];
            for (int i = 0; i < source.GeoCode.length; i++) {
                this.GeoCode[i] = new String(source.GeoCode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GeoCode.", this.GeoCode);

    }
}

