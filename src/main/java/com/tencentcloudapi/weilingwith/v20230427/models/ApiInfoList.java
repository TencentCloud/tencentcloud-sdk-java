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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiInfoList extends AbstractModel {

    /**
    * API列表
    */
    @SerializedName("ApiInfo")
    @Expose
    private ApiInfo [] ApiInfo;

    /**
    * 数据总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get API列表 
     * @return ApiInfo API列表
     */
    public ApiInfo [] getApiInfo() {
        return this.ApiInfo;
    }

    /**
     * Set API列表
     * @param ApiInfo API列表
     */
    public void setApiInfo(ApiInfo [] ApiInfo) {
        this.ApiInfo = ApiInfo;
    }

    /**
     * Get 数据总条数 
     * @return TotalCount 数据总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据总条数
     * @param TotalCount 数据总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ApiInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfoList(ApiInfoList source) {
        if (source.ApiInfo != null) {
            this.ApiInfo = new ApiInfo[source.ApiInfo.length];
            for (int i = 0; i < source.ApiInfo.length; i++) {
                this.ApiInfo[i] = new ApiInfo(source.ApiInfo[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApiInfo.", this.ApiInfo);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

