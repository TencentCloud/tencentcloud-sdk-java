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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwAssetsRequest extends AbstractModel {

    /**
    * 最大返回资产数。可选，默认 100；取值 1 至 1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 最大返回资产数。可选，默认 100；取值 1 至 1000。 
     * @return Limit 最大返回资产数。可选，默认 100；取值 1 至 1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大返回资产数。可选，默认 100；取值 1 至 1000。
     * @param Limit 最大返回资产数。可选，默认 100；取值 1 至 1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCfwAssetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAssetsRequest(DescribeCfwAssetsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

