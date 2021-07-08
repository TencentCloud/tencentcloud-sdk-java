/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiInfoSummary extends AbstractModel{

    /**
    * 插件相关的API总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 插件相关的API信息。
    */
    @SerializedName("ApiSet")
    @Expose
    private AvailableApiInfo [] ApiSet;

    /**
     * Get 插件相关的API总数。 
     * @return TotalCount 插件相关的API总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 插件相关的API总数。
     * @param TotalCount 插件相关的API总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 插件相关的API信息。 
     * @return ApiSet 插件相关的API信息。
     */
    public AvailableApiInfo [] getApiSet() {
        return this.ApiSet;
    }

    /**
     * Set 插件相关的API信息。
     * @param ApiSet 插件相关的API信息。
     */
    public void setApiSet(AvailableApiInfo [] ApiSet) {
        this.ApiSet = ApiSet;
    }

    public ApiInfoSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfoSummary(ApiInfoSummary source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiSet != null) {
            this.ApiSet = new AvailableApiInfo[source.ApiSet.length];
            for (int i = 0; i < source.ApiSet.length; i++) {
                this.ApiSet[i] = new AvailableApiInfo(source.ApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiSet.", this.ApiSet);

    }
}

