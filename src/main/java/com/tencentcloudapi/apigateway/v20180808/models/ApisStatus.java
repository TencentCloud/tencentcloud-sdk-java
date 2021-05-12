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

public class ApisStatus extends AbstractModel{

    /**
    * 符合条件的 API 接口数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API 接口列表。
    */
    @SerializedName("ApiIdStatusSet")
    @Expose
    private DesApisStatus [] ApiIdStatusSet;

    /**
     * Get 符合条件的 API 接口数量。 
     * @return TotalCount 符合条件的 API 接口数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的 API 接口数量。
     * @param TotalCount 符合条件的 API 接口数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API 接口列表。 
     * @return ApiIdStatusSet API 接口列表。
     */
    public DesApisStatus [] getApiIdStatusSet() {
        return this.ApiIdStatusSet;
    }

    /**
     * Set API 接口列表。
     * @param ApiIdStatusSet API 接口列表。
     */
    public void setApiIdStatusSet(DesApisStatus [] ApiIdStatusSet) {
        this.ApiIdStatusSet = ApiIdStatusSet;
    }

    public ApisStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApisStatus(ApisStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiIdStatusSet != null) {
            this.ApiIdStatusSet = new DesApisStatus[source.ApiIdStatusSet.length];
            for (int i = 0; i < source.ApiIdStatusSet.length; i++) {
                this.ApiIdStatusSet[i] = new DesApisStatus(source.ApiIdStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiIdStatusSet.", this.ApiIdStatusSet);

    }
}

