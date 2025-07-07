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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportNonlocalLoginPlacesRequest extends AbstractModel {

    /**
    * <li>Status - int - 是否必填：否 - 状态筛选1:正常登录；2：异地登录</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <li>Status - int - 是否必填：否 - 状态筛选1:正常登录；2：异地登录</li> 
     * @return Filters <li>Status - int - 是否必填：否 - 状态筛选1:正常登录；2：异地登录</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>Status - int - 是否必填：否 - 状态筛选1:正常登录；2：异地登录</li>
     * @param Filters <li>Status - int - 是否必填：否 - 状态筛选1:正常登录；2：异地登录</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ExportNonlocalLoginPlacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportNonlocalLoginPlacesRequest(ExportNonlocalLoginPlacesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

