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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCosEnableRegionRequest extends AbstractModel {

    /**
    * 站点类型。zh表示中国区，en表示国际区。默认中国区。
    */
    @SerializedName("WebsiteType")
    @Expose
    private String WebsiteType;

    /**
     * Get 站点类型。zh表示中国区，en表示国际区。默认中国区。 
     * @return WebsiteType 站点类型。zh表示中国区，en表示国际区。默认中国区。
     */
    public String getWebsiteType() {
        return this.WebsiteType;
    }

    /**
     * Set 站点类型。zh表示中国区，en表示国际区。默认中国区。
     * @param WebsiteType 站点类型。zh表示中国区，en表示国际区。默认中国区。
     */
    public void setWebsiteType(String WebsiteType) {
        this.WebsiteType = WebsiteType;
    }

    public ListCosEnableRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCosEnableRegionRequest(ListCosEnableRegionRequest source) {
        if (source.WebsiteType != null) {
            this.WebsiteType = new String(source.WebsiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebsiteType", this.WebsiteType);

    }
}

