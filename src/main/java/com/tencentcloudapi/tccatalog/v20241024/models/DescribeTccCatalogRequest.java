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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTccCatalogRequest extends AbstractModel {

    /**
    * 数据目录Id
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
     * Get 数据目录Id 
     * @return CatalogId 数据目录Id
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 数据目录Id
     * @param CatalogId 数据目录Id
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    public DescribeTccCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTccCatalogRequest(DescribeTccCatalogRequest source) {
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);

    }
}

